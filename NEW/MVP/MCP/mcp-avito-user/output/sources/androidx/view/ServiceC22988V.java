package androidx.view;

import Y61.k;
import Y61.l;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.view.Lifecycle;
import j.InterfaceC42153i;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: LifecycleService.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/V;", "Landroid/app/Service;", "Landroidx/lifecycle/P;", "<init>", "()V", "Lkotlin/G0;", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "startId", "onStart", "(Landroid/content/Intent;I)V", "flags", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "Landroidx/lifecycle/A0;", "dispatcher", "Landroidx/lifecycle/A0;", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ServiceC22988V extends Service implements InterfaceC22983P {

    @k
    private final A0 dispatcher = new A0(this);

    @Override // androidx.view.InterfaceC22983P
    @k
    public Lifecycle getLifecycle() {
        return this.dispatcher.f46647a;
    }

    @Override // android.app.Service
    @InterfaceC42153i
    @l
    public IBinder onBind(@k Intent intent) {
        A0 a02 = this.dispatcher;
        a02.getClass();
        a02.a(Lifecycle.Event.ON_START);
        return null;
    }

    @Override // android.app.Service
    @InterfaceC42153i
    public void onCreate() {
        A0 a02 = this.dispatcher;
        a02.getClass();
        a02.a(Lifecycle.Event.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    @InterfaceC42153i
    public void onDestroy() {
        A0 a02 = this.dispatcher;
        a02.getClass();
        a02.a(Lifecycle.Event.ON_STOP);
        a02.a(Lifecycle.Event.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    @InterfaceC42153i
    @InterfaceC42830m
    public void onStart(@l Intent intent, int startId) {
        A0 a02 = this.dispatcher;
        a02.getClass();
        a02.a(Lifecycle.Event.ON_START);
        super.onStart(intent, startId);
    }

    @Override // android.app.Service
    @InterfaceC42153i
    public int onStartCommand(@l Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
}
