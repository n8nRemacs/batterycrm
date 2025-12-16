package com.avito.security;

import java.io.IOException;

/* loaded from: classes5.dex */
class f2 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    public static <T> void a(Appendable appendable, T t12, r0<? super T, ? extends CharSequence> r0Var) throws IOException {
        CharSequence charSequenceValueOf;
        y0.b(appendable, "$this$appendElement");
        if (r0Var == null) {
            if (!(t12 != 0 ? t12 instanceof CharSequence : true)) {
                if (t12 instanceof Character) {
                    appendable.append(((Character) t12).charValue());
                    return;
                }
                charSequenceValueOf = String.valueOf((Object) t12);
            }
            appendable.append(charSequenceValueOf);
        }
        t12 = (T) r0Var.a(t12);
        charSequenceValueOf = (CharSequence) t12;
        appendable.append(charSequenceValueOf);
    }
}
