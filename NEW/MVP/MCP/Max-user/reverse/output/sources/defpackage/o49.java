package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* loaded from: classes.dex */
public final class o49 extends a69 {
    public final String a;
    public final n49 b;

    public o49(String str, n49 n49Var) {
        this.a = str;
        this.b = n49Var;
    }

    @Override // defpackage.a69
    public final void f(int i) throws RemoteException {
        n49 n49Var;
        String str = this.a;
        if (str == null || (n49Var = this.b) == null) {
            return;
        }
        Messenger messenger = n49Var.h;
        MediaRouter2.RoutingController routingController = n49Var.g;
        if (routingController == null || routingController.isReleased() || messenger == null) {
            return;
        }
        int andIncrement = n49Var.l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = n49Var.i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }

    @Override // defpackage.a69
    public final void i(int i) throws RemoteException {
        n49 n49Var;
        String str = this.a;
        if (str == null || (n49Var = this.b) == null) {
            return;
        }
        Messenger messenger = n49Var.h;
        MediaRouter2.RoutingController routingController = n49Var.g;
        if (routingController == null || routingController.isReleased() || messenger == null) {
            return;
        }
        int andIncrement = n49Var.l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = n49Var.i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException unused) {
        } catch (RemoteException e) {
            Log.e("MR2Provider", "Could not send control request to service.", e);
        }
    }
}
