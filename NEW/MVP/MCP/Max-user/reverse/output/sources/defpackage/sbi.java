package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class sbi extends zai {
    public final mg7 b;
    public final n2g c;
    public final tha d;

    public sbi(int i, mg7 mg7Var, n2g n2gVar, tha thaVar) {
        super(i);
        this.c = n2gVar;
        this.b = mg7Var;
        this.d = thaVar;
        if (i == 2 && mg7Var.a) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.zbi
    public final void a(Status status) {
        this.d.getClass();
        this.c.c(yqi.c(status));
    }

    @Override // defpackage.zbi
    public final void b(Exception exc) {
        this.c.c(exc);
    }

    @Override // defpackage.zbi
    public final void c(wai waiVar) throws DeadObjectException {
        n2g n2gVar = this.c;
        try {
            this.b.f(waiVar.d, n2gVar);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(zbi.e(e2));
        } catch (RuntimeException e3) {
            n2gVar.c(e3);
        }
    }

    @Override // defpackage.zbi
    public final void d(xpb xpbVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) xpbVar.c;
        n2g n2gVar = this.c;
        map.put(n2gVar, boolValueOf);
        n2gVar.a.i(new wib(xpbVar, 20, n2gVar));
    }

    @Override // defpackage.zai
    public final boolean f(wai waiVar) {
        return this.b.a;
    }

    @Override // defpackage.zai
    public final qt5[] g(wai waiVar) {
        return (qt5[]) this.b.c;
    }
}
