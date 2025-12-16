package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class r6j implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r6j(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.a) {
            case 0:
                z8j z8jVar = (z8j) this.b;
                z8jVar.b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                z8jVar.a().post(new pli(this, iBinder));
                break;
            default:
                jcj jcjVar = (jcj) this.b;
                jcjVar.b.v("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                jcjVar.a().post(new y8j(this, iBinder));
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                z8j z8jVar = (z8j) this.b;
                z8jVar.b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                z8jVar.a().post(new a2j(1, this));
                break;
            default:
                jcj jcjVar = (jcj) this.b;
                jcjVar.b.v("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                jcjVar.a().post(new q6j(1, this));
                break;
        }
    }
}
