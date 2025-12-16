package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class rx8 extends ResultReceiver {
    public final /* synthetic */ int a;
    public final Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rx8(Handler handler, Object obj, int i) {
        super(handler);
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        db7 db7Var = null;
        switch (this.a) {
            case 0:
                tx8 tx8Var = (tx8) ((WeakReference) this.b).get();
                if (tx8Var == null || bundle == null) {
                    return;
                }
                synchronized (tx8Var.b) {
                    g79 g79Var = tx8Var.e;
                    IBinder binder = bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER);
                    int i2 = a79.d;
                    if (binder != null) {
                        IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface(IMediaSession.DESCRIPTOR);
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof db7)) {
                            bb7 bb7Var = new bb7();
                            bb7Var.c = binder;
                            db7Var = bb7Var;
                        } else {
                            db7Var = (db7) iInterfaceQueryLocalInterface;
                        }
                    }
                    synchronized (g79Var.a) {
                        g79Var.c = db7Var;
                    }
                    g79 g79Var2 = tx8Var.e;
                    g0h g0hVarD = rmb.d(bundle);
                    synchronized (g79Var2.a) {
                        g79Var2.d = g0hVarD;
                    }
                    tx8Var.a();
                }
                return;
            case 1:
                hke hkeVar = (hke) this.b;
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                hkeVar.k(new yie(i, bundle));
                return;
            default:
                ((n2g) this.b).d(null);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx8(tx8 tx8Var) {
        super(null);
        this.a = 0;
        this.b = new WeakReference(tx8Var);
    }
}
