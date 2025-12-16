package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public final class l59 {
    public final Object a;
    public final int b;

    public l59(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = 1;
        } else if (obj instanceof k69) {
            this.b = 2;
        } else {
            this.b = 0;
            Log.w("RecyclerAdapter", "Wrong type of data passed to Item constructor");
        }
    }
}
