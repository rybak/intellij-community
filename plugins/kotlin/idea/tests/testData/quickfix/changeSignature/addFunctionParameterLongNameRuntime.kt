// "Add parameter to function 'foo'" "true"
// DISABLE-ERRORS

fun foo(x: Int) {
    foo(,);
    foo(1);
    foo(2, java.util.LinkedHashSet<Int>()<caret>);
}
// FUS_QUICKFIX_NAME: org.jetbrains.kotlin.idea.quickfix.AddFunctionParametersFix