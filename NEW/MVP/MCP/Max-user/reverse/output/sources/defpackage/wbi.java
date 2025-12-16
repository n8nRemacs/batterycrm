package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class wbi extends zai {
    public final n2g b;

    public wbi(na8 na8Var, n2g n2gVar) {
        super(4);
        this.b = n2gVar;
    }

    @Override // defpackage.zbi
    public final void a(Status status) {
        this.b.c(new ApiException(status));
    }

    @Override // defpackage.zbi
    public final void b(Exception exc) {
        this.b.c(exc);
    }

    @Override // defpackage.zbi
    public final void c(wai waiVar) throws DeadObjectException {
        try {
            h(waiVar);
        } catch (DeadObjectException e) {
            a(zbi.e(e));
            throw e;
        } catch (RemoteException e2) {
            a(zbi.e(e2));
        } catch (RuntimeException e3) {
            this.b.c(e3);
        }
    }

    @Override // defpackage.zbi
    public final /* bridge */ /* synthetic */ void d(xpb xpbVar, boolean z) {
    }

    @Override // defpackage.zai
    public final boolean f(wai waiVar) {
        return false;
    }

    @Override // defpackage.zai
    public final qt5[] g(wai waiVar) {
        return null;
    }

    public final void h(wai waiVar) {
        this.b.d(Boolean.FALSE);
    }
}
