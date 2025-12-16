package defpackage;

import android.content.Context;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class xzg extends EnhancedVectorDrawable implements u6g {
    public final int a;
    public final wzg b;

    public xzg(Context context, int i, wzg wzgVar) {
        super(context, i == 1 ? yud.b2 : yud.c2);
        this.a = i;
        this.b = wzgVar;
        onThemeChanged(a93.s0.x(context).k());
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        long jN = this.b.n(yebVar);
        z18.e(this, "mark_path", (int) (jN >> 32));
        z18.e(this, "background_path", (int) (jN & 4294967295L));
    }
}
