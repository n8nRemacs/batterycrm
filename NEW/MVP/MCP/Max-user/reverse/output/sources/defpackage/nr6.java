package defpackage;

import android.content.Context;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public final class nr6 {
    public final float b;
    public long e;
    public float f;
    public float g;
    public v0 a = null;
    public boolean c = false;
    public boolean d = false;

    public nr6(Context context) {
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
