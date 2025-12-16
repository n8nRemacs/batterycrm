package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class nbi extends zbi {
    public final aui b;

    public nbi(aui auiVar) {
        super(1);
        this.b = auiVar;
    }

    @Override // defpackage.zbi
    public final void a(Status status) {
        try {
            this.b.h(status);
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.zbi
    public final void b(Exception exc) {
        try {
            this.b.h(new Status(10, u45.k(exc.getClass().getSimpleName(), ": ", exc.getLocalizedMessage()), null, null));
        } catch (IllegalStateException e) {
            Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // defpackage.zbi
    public final void c(wai waiVar) throws DeadObjectException {
        try {
            aui auiVar = this.b;
            fl flVar = waiVar.d;
            auiVar.getClass();
            try {
                auiVar.g(flVar);
            } catch (DeadObjectException e) {
                auiVar.h(new Status(8, e.getLocalizedMessage(), null, null));
                throw e;
            } catch (RemoteException e2) {
                auiVar.h(new Status(8, e2.getLocalizedMessage(), null, null));
            }
        } catch (RuntimeException e3) {
            b(e3);
        }
    }

    @Override // defpackage.zbi
    public final void d(xpb xpbVar, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Map map = (Map) xpbVar.b;
        aui auiVar = this.b;
        map.put(auiVar, boolValueOf);
        auiVar.b(new rai(xpbVar, auiVar));
    }
}
