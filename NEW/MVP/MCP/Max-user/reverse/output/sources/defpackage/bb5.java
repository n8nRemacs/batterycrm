package defpackage;

import android.text.Editable;

/* loaded from: classes.dex */
public final class bb5 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile bb5 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        return cls != null ? new l7f(cls, charSequence) : super.newEditable(charSequence);
    }
}
