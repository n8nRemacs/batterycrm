package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class bl4 implements oe4 {
    public final Context a;
    public final oe4 b;

    public bl4(Context context) {
        this(context, new fn4());
    }

    @Override // defpackage.oe4
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dl4 a() {
        return new dl4(this.a, this.b.a());
    }

    public bl4(Context context, oe4 oe4Var) {
        this.a = context.getApplicationContext();
        oe4Var.getClass();
        this.b = oe4Var;
    }
}
