package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class cjd implements IBinder.DeathRecipient {
    public final Messenger a;
    public final rc b;
    public final Messenger c;
    public int f;
    public int g;
    public final /* synthetic */ hjd i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public cjd(hjd hjdVar, Messenger messenger) {
        this.i = hjdVar;
        this.a = messenger;
        rc rcVar = new rc(this);
        this.b = rcVar;
        this.c = new Messenger(rcVar);
    }

    public final void a(int i) {
        int i2 = this.d;
        this.d = i2 + 1;
        b(5, i2, i, null, null);
    }

    public final boolean b(int i, int i2, int i3, Bundle bundle, Bundle bundle2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = bundle;
        messageObtain.setData(bundle2);
        messageObtain.replyTo = this.c;
        try {
            this.a.send(messageObtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.t0.post(new bjd(this, 1));
    }

    public final void c(int i, int i2) {
        Bundle bundleE = ho7.e(i2, "volume");
        int i3 = this.d;
        this.d = i3 + 1;
        b(7, i3, i, null, bundleE);
    }

    public final void d(int i, int i2) {
        Bundle bundleE = ho7.e(i2, "volume");
        int i3 = this.d;
        this.d = i3 + 1;
        b(8, i3, i, null, bundleE);
    }
}
