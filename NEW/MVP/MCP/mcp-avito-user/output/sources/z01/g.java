package z01;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.huawei.hms.support.log.HMSLog;

/* compiled from: RemoteService.java */
/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public a f443703a;

    /* renamed from: b, reason: collision with root package name */
    public Messenger f443704b = null;

    /* compiled from: RemoteService.java */
    public class a implements ServiceConnection {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f443705b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f443706c;

        public a(Bundle bundle, Context context) {
            this.f443705b = bundle;
            this.f443706c = context;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
            HMSLog.i("RemoteService", "remote service onConnected");
            Messenger messenger = new Messenger(iBinder);
            g gVar = g.this;
            gVar.f443704b = messenger;
            Message messageObtain = Message.obtain();
            messageObtain.setData(this.f443705b);
            try {
                gVar.f443704b.send(messageObtain);
            } catch (RemoteException unused) {
                HMSLog.i("RemoteService", "remote service message send failed");
            }
            HMSLog.i("RemoteService", "remote service unbindservice");
            this.f443706c.unbindService(gVar.f443703a);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            HMSLog.i("RemoteService", "remote service onDisconnected");
            g.this.f443704b = null;
        }
    }

    public final boolean a(Context context, Intent intent, Bundle bundle) {
        Context applicationContext = context.getApplicationContext();
        this.f443703a = new a(bundle, applicationContext);
        HMSLog.i("RemoteService", "remote service bind service start");
        return applicationContext.bindService(intent, this.f443703a, 1);
    }
}
