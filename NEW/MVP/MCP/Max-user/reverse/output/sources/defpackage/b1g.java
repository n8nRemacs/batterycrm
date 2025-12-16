package defpackage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class b1g implements tm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1g b;
    public final /* synthetic */ int c;

    public /* synthetic */ b1g(d1g d1gVar, int i, int i2) {
        this.a = i2;
        this.b = d1gVar;
        this.c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tm6
    public final Object apply(Object obj) {
        Object r66Var;
        switch (this.a) {
            case 0:
                d1g d1gVar = this.b;
                int i = this.c;
                i66 i66Var = (i66) obj;
                d1gVar.getClass();
                int i2 = 1;
                b1g b1gVar = new b1g(d1gVar, i, i2);
                i66Var.getClass();
                int i3 = i66.a;
                ifi.c(i3, "maxConcurrency");
                ifi.c(i3, "bufferSize");
                if (!(i66Var instanceof oyd)) {
                    return new u66(i66Var, b1gVar, i3, i3);
                }
                Object obj2 = ((oyd) i66Var).get();
                return obj2 == null ? q66.b : new p66(obj2, b1gVar, i2);
            case 1:
                d1g d1gVar2 = this.b;
                int i4 = this.c;
                Throwable th = (Throwable) obj;
                d1gVar2.getClass();
                if (d1g.d(th) && !d1g.a(((oje) d1gVar2.a.getValue()).k)) {
                    wqi.c("d1g", "retryWhenCommonError: no connection, await for connection available", new Object[0]);
                    return new c76(new r66(2, new sra(d1gVar2.b(), new vef(15), pdf.e, pdf.d)));
                }
                if (d1g.c(th)) {
                    long j = i4;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    int i5 = i66.a;
                    j0e j0eVarA = u0e.a();
                    Objects.requireNonNull(timeUnit, "unit is null");
                    Objects.requireNonNull(j0eVarA, "scheduler is null");
                    r66Var = new s76(Math.max(0L, j), j0eVarA);
                } else {
                    int i6 = i66.a;
                    Objects.requireNonNull(th, "throwable is null");
                    r66Var = new r66(0, new kn6(th));
                }
                return r66Var;
            case 2:
                d1g d1gVar3 = this.b;
                int i7 = this.c;
                d1gVar3.getClass();
                return ((vqa) obj).h(new b1g(d1gVar3, i7, 3), Integer.MAX_VALUE);
            default:
                d1g d1gVar4 = this.b;
                int i8 = this.c;
                Throwable th2 = (Throwable) obj;
                d1gVar4.getClass();
                if (d1g.d(th2) && !d1g.a(((oje) d1gVar4.a.getValue()).k)) {
                    wqi.c("d1g", "retryWhenCommonErrorObs: no connection, await for connection available", new Object[0]);
                    return new sra(d1gVar4.b(), new vef(17), pdf.e, pdf.d);
                }
                if (!d1g.c(th2)) {
                    return vqa.e(th2);
                }
                wqi.b("d1g", "retryWhenCommonErrorObs: common error", th2);
                return vqa.r(i8, TimeUnit.SECONDS, u0e.a());
        }
    }
}
