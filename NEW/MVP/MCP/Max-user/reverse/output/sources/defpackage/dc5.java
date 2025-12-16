package defpackage;

import android.content.Context;
import android.graphics.Rect;

/* loaded from: classes2.dex */
public final class dc5 {
    public static final Rect c = new Rect();
    public final bwf a;
    public final bwf b = new bwf(new e44(11, this));

    public dc5(Context context) {
        this.a = new bwf(new ns2(this, context));
    }

    public final float a() {
        return ((Number) this.a.getValue()).floatValue();
    }
}
