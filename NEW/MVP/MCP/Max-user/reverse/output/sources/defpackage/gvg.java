package defpackage;

import java.util.Objects;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class gvg {
    public final aug a;
    public final wef b;
    public final j0e c;
    public final kz4 d;

    public gvg(aug augVar, wef wefVar, j0e j0eVar, kz4 kz4Var) {
        this.a = augVar;
        this.d = kz4Var;
        this.b = wefVar;
        this.c = j0eVar;
    }

    public static bug b(um9 um9Var) {
        return new bug(um9Var.b, um9Var.c, um9Var.d, l8g.c(um9Var.f) ? um9Var.a.c : um9Var.f);
    }

    public final lra a(um9 um9Var) {
        final int i = 0;
        ora oraVar = new ora(vqa.k(um9Var).d(new tm6(this) { // from class: fvg
            public final /* synthetic */ gvg b;

            {
                this.b = this;
            }

            @Override // defpackage.tm6
            public final Object apply(Object obj) {
                switch (i) {
                    case 0:
                        um9 um9Var2 = (um9) obj;
                        return um9Var2.d == wvg.c ? ((w64) this.b.d.get()).a(um9Var2) : vqa.k(um9Var2);
                    default:
                        ttg ttgVar = (ttg) obj;
                        return (ttgVar.a.c.c() && ttgVar.a()) ? new ora(this.b.b.a(ttgVar.h.a).n(), new ytg(ttgVar, 3), 5) : vqa.k(new xm9(ttgVar, null));
                }
            }
        }), new o9g(this, 27), 5);
        aug augVar = this.a;
        Objects.requireNonNull(augVar);
        vqa vqaVarD = oraVar.d(new vtg(augVar, 9));
        final int i2 = 1;
        return new sra(vqaVarD.d(new tm6(this) { // from class: fvg
            public final /* synthetic */ gvg b;

            {
                this.b = this;
            }

            @Override // defpackage.tm6
            public final Object apply(Object obj) {
                switch (i2) {
                    case 0:
                        um9 um9Var2 = (um9) obj;
                        return um9Var2.d == wvg.c ? ((w64) this.b.d.get()).a(um9Var2) : vqa.k(um9Var2);
                    default:
                        ttg ttgVar = (ttg) obj;
                        return (ttgVar.a.c.c() && ttgVar.a()) ? new ora(this.b.b.a(ttgVar.h.a).n(), new ytg(ttgVar, 3), 5) : vqa.k(new xm9(ttgVar, null));
                }
            }
        }), pdf.e, new c5g(this, 6, um9Var), pdf.d).m(BuildConfig.MAX_TIME_TO_UPLOAD, new o9g(this, 28)).p(this.c);
    }
}
