package com.vk.push.core.ipc;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.vk.push.core.ipc.b;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: BaseIPCClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/push/core/ipc/c;", "Landroid/content/ServiceConnection;", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b<IInterface> f367049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ T11.f f367050c;

    public c(T11.f fVar, b bVar) {
        this.f367049b = bVar;
        this.f367050c = fVar;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        b<IInterface> bVar = this.f367049b;
        int i12 = b.f367032m;
        bVar.i().a("Binding to " + componentName.getPackageName() + " has died", null);
        bVar.m();
        b.C10839b<T> c10839b = bVar.f367040h;
        if (c10839b != 0) {
            bVar.f367042j.submit(new a(bVar, c10839b));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        this.f367050c.a("Null binding from " + componentName.getPackageName(), null);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object next;
        this.f367049b.f367041i.set(true);
        b<IInterface> bVar = this.f367049b;
        bVar.i().info("On service connected! Remote host package name = " + componentName.getPackageName());
        Iterator<T> it = bVar.f367034b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (C43066x.C(((T11.a) next).f15306a, componentName.getPackageName(), true)) {
                    break;
                }
            }
        }
        T11.a aVar = (T11.a) next;
        if (aVar == null) {
            bVar.i().error("onServiceConnected: host is null", null);
            return;
        }
        IInterface iInterfaceF = bVar.f(iBinder);
        bVar.f367040h = new b.C10839b<>(aVar, componentName, iInterfaceF);
        bVar.i().info("Service connection to " + componentName.getPackageName() + " has been established");
        h hVar = new h(bVar, iInterfaceF, aVar);
        if (bVar.f367043k.isEmpty()) {
            return;
        }
        bVar.f367042j.submit(new a(bVar, hVar));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        b<IInterface> bVar = this.f367049b;
        int i12 = b.f367032m;
        bVar.i().info("Service has been disconnected, host: " + componentName.getPackageName());
        b.C10839b<T> c10839b = bVar.f367040h;
        bVar.f367040h = c10839b != 0 ? new b.C10839b(c10839b.f367046a, c10839b.f367047b, null) : null;
    }
}
