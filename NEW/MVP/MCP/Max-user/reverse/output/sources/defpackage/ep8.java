package defpackage;

import android.text.Spannable;

/* loaded from: classes2.dex */
public interface ep8 extends g74 {
    default void a(Spannable spannable, int i, int i2) {
        usi.e(spannable, this, i, i2, 33);
    }

    default byte b() {
        return (byte) 127;
    }

    int getType();
}
