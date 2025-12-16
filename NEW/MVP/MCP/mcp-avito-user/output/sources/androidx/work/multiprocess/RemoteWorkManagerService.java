package androidx.work.multiprocess;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.RestrictTo;
import j.N;
import j.P;

@RestrictTo
/* loaded from: classes10.dex */
public class RemoteWorkManagerService extends Service {

    /* renamed from: b, reason: collision with root package name */
    public D f56129b;

    static {
        androidx.work.G.b("RemoteWorkManagerService");
    }

    @Override // android.app.Service
    @P
    public final IBinder onBind(@N Intent intent) {
        androidx.work.G.a().getClass();
        return this.f56129b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f56129b = new D(this);
    }
}
