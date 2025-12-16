package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public final class bod {
    public static final bod c;
    public Size a;
    public int b = 1;

    static {
        bod bodVar = new bod();
        bodVar.a = null;
        bodVar.b = 0;
        c = bodVar;
    }

    public bod(Size size) {
        this.a = size;
    }
}
