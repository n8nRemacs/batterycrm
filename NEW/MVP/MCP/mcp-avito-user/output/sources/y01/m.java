package y01;

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
public class m {

    /* renamed from: a, reason: collision with root package name */
    public a f442825a;

    /* renamed from: b, reason: collision with root package name */
    public Messenger f442826b = null;

    /* compiled from: RemoteService.java */
    public class a implements ServiceConnection {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f442827b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f442828c;

        public a(Bundle bundle, Context context) {
            this.f442827b = bundle;
            this.f442828c = context;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
            HMSLog.i("RemoteService", "remote service onConnected");
            Messenger messenger = new Messenger(iBinder);
            m mVar = m.this;
            mVar.f442826b = messenger;
            Message messageObtain = Message.obtain();
            messageObtain.setData(this.f442827b);
            try {
                mVar.f442826b.send(messageObtain);
            } catch (RemoteException unused) {
                HMSLog.i("RemoteService", "remote service message send failed");
            }
            HMSLog.i("RemoteService", "remote service unbindservice");
            this.f442828c.unbindService(mVar.f442825a);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            HMSLog.i("RemoteService", "remote service onDisconnected");
            m.this.f442826b = null;
        }
    }

    public final boolean a(Context context, Intent intent, Bundle bundle) {
        Context applicationContext = context.getApplicationContext();
        this.f442825a = new a(bundle, applicationContext);
        HMSLog.i("RemoteService", "remote service bind service start");
        return applicationContext.bindService(intent, this.f442825a, 1);
    }
}
