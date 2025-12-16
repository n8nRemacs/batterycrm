package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* loaded from: classes2.dex */
public final class dza implements eu0 {
    public final Context a;
    public final k18 b;
    public final bwf c;
    public final und d;

    public dza(so3 so3Var, Context context, k18 k18Var) {
        this.a = context;
        this.b = k18Var;
        final int i = 0;
        this.c = new bwf(new cm6(this) { // from class: cza
            public final /* synthetic */ dza b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return lni.a(this.b.a);
                    default:
                        Context context2 = this.b.a;
                        float f = r1.widthPixels / context2.getResources().getDisplayMetrics().density;
                        return Integer.valueOf(f > 800.0f ? u45.q(100, vw4.d().getDisplayMetrics().density, i9j.a(context2).getWidth()) : f > 360.0f ? kti.d(291 * vw4.d().getDisplayMetrics().density) : kti.d(248 * vw4.d().getDisplayMetrics().density));
                }
            }
        });
        final int i2 = 1;
        this.d = new und(new cm6(this) { // from class: cza
            public final /* synthetic */ dza b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return lni.a(this.b.a);
                    default:
                        Context context2 = this.b.a;
                        float f = r1.widthPixels / context2.getResources().getDisplayMetrics().density;
                        return Integer.valueOf(f > 800.0f ? u45.q(100, vw4.d().getDisplayMetrics().density, i9j.a(context2).getWidth()) : f > 360.0f ? kti.d(291 * vw4.d().getDisplayMetrics().density) : kti.d(248 * vw4.d().getDisplayMetrics().density));
                }
            }
        });
        so3Var.a(so3.c | so3.d, new yr7(2, this));
    }

    public final int a() {
        return this.a.getResources().getConfiguration().orientation == 1 ? b() : b();
    }

    public final int b() {
        return u45.d(10, vw4.d().getDisplayMetrics().density, 2, ((Number) this.d.getValue()).intValue());
    }

    public final float c() {
        return TypedValue.applyDimension(2, ((Number) ((fqg) this.c.getValue()).a.getValue()).floatValue(), vw4.d().getDisplayMetrics()) + sw4.b(vz2.f.e((t75) ((v3b) this.b.getValue()).a.a.getValue()), this.a);
    }
}
