package defpackage;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import android.util.Log;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class kv8 extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ jkc a;

    public kv8(jkc jkcVar) {
        this.a = jkcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v8, types: [db7] */
    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() throws RemoteException {
        bb7 bb7Var;
        jkc jkcVar = this.a;
        lv8 lv8Var = (lv8) jkcVar.b;
        int i = 1;
        if (lv8Var != null) {
            jv8 jv8Var = lv8Var.d;
            MediaBrowser mediaBrowser = lv8Var.b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        Bundle bundle = lv8Var.c;
                        s7c s7cVar = new s7c();
                        s7cVar.a = new Messenger(binder);
                        s7cVar.b = bundle;
                        lv8Var.f = s7cVar;
                        Messenger messenger = new Messenger(jv8Var);
                        lv8Var.g = messenger;
                        jv8Var.getClass();
                        jv8Var.c = new WeakReference(messenger);
                        try {
                            Context context = lv8Var.a;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString("data_package_name", context.getPackageName());
                            bundle2.putInt("data_calling_pid", Process.myPid());
                            bundle2.putBundle("data_root_hints", (Bundle) s7cVar.b);
                            Message messageObtain = Message.obtain();
                            messageObtain.what = 6;
                            messageObtain.arg1 = 1;
                            messageObtain.setData(bundle2);
                            messageObtain.replyTo = messenger;
                            ((Messenger) s7cVar.a).send(messageObtain);
                        } catch (RemoteException unused) {
                            Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i2 = a79.d;
                    if (binder2 == null) {
                        bb7Var = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = binder2.queryLocalInterface(IMediaSession.DESCRIPTOR);
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof db7)) {
                            bb7 bb7Var2 = new bb7();
                            bb7Var2.c = binder2;
                            bb7Var = bb7Var2;
                        } else {
                            bb7Var = (db7) iInterfaceQueryLocalInterface;
                        }
                    }
                    if (bb7Var != null) {
                        lv8Var.h = new g79(mediaBrowser.getSessionToken(), bb7Var);
                    }
                }
            } catch (IllegalStateException e) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e);
            }
        }
        ry8 ry8Var = (ry8) jkcVar.c;
        nv8 nv8Var = ry8Var.j;
        if (nv8Var != null) {
            lv8 lv8Var2 = nv8Var.a;
            if (lv8Var2.h == null) {
                lv8Var2.h = new g79(lv8Var2.b.getSessionToken(), null);
            }
            g79 g79Var = lv8Var2.h;
            px8 px8Var = ry8Var.b;
            px8Var.z(new qz5(ry8Var, 23, g79Var));
            px8Var.o.postDelayed(new oy8(ry8Var, i), 500L);
        }
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        jkc jkcVar = this.a;
        lv8 lv8Var = (lv8) jkcVar.b;
        if (lv8Var != null) {
            lv8Var.getClass();
        }
        ((ry8) jkcVar.c).b.w();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        jkc jkcVar = this.a;
        lv8 lv8Var = (lv8) jkcVar.b;
        if (lv8Var != null) {
            lv8Var.f = null;
            lv8Var.g = null;
            lv8Var.h = null;
            jv8 jv8Var = lv8Var.d;
            jv8Var.getClass();
            jv8Var.c = new WeakReference(null);
        }
        ((ry8) jkcVar.c).b.w();
    }
}
