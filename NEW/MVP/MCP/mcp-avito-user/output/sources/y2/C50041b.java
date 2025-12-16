package y2;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import m31.C43873a;

/* renamed from: y2.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C50041b extends d {

    /* renamed from: c, reason: collision with root package name */
    public Messenger f442861c;

    /* renamed from: d, reason: collision with root package name */
    public final Messenger f442862d;

    public C50041b(Ub1.b bVar) {
        this.f442862d = new Messenger(new HandlerC50042c(new C43873a(new WeakReference(bVar))));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) throws RemoteException {
        this.f442864b = true;
        this.f442861c = new Messenger(iBinder);
        Message messageObtain = Message.obtain();
        messageObtain.replyTo = this.f442862d;
        try {
            Messenger messenger = this.f442861c;
            if (messenger != null) {
                messenger.send(messageObtain);
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f442864b = false;
        this.f442861c = null;
    }
}
