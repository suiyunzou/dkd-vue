public class GlobalExceptionHandler {

    // 保留这个方法，删除另一个
    @ExceptionHandler(DataIntegrityViolationException.class)
    public AjaxResult handleDataIntegrityViolationException(DataIntegrityViolationException e) {
        // 方法实现
    }

    // 删除这个方法，因为它可能是拼写错误导致的重复
    // @ExceptionHandler(DataIntegrityViolationException.class)
    // public AjaxResult handelDataIntegrityViolationException(DataIntegrityViolationException e) {
    //     // 方法实现
    // }

    // ... 其他代码 ...
}