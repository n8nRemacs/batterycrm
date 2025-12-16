package androidx.work.multiprocess;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import j.N;
import j.P;

/* compiled from: RemoteWorkerService.java */
/* loaded from: classes10.dex */
public class H extends Service {

    /* renamed from: b, reason: collision with root package name */
    public BinderC23624e f56096b;

    static {
        androidx.work.G.b("RemoteWorkerService");
    }

    @Override // android.app.Service
    @P
    public final IBinder onBind(@N Intent intent) {
        androidx.work.G.a().getClass();
        return this.f56096b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f56096b = new BinderC23624e(this);
    }
}
