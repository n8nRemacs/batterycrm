package androidx.window.layout.adapter.extensions;

import Y61.k;
import android.content.Context;
import androidx.core.util.InterfaceC22791e;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.n;
import j.B;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.G0;
import kotlin.Metadata;
import m2.InterfaceC43864a;

/* compiled from: ExtensionWindowBackendApi2.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/adapter/extensions/d;", "Lm2/a;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements InterfaceC43864a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final WindowLayoutComponent f55265a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ReentrantLock f55266b = new ReentrantLock();

    /* renamed from: c, reason: collision with root package name */
    @B
    @k
    public final LinkedHashMap f55267c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    @B
    @k
    public final LinkedHashMap f55268d = new LinkedHashMap();

    public d(@k WindowLayoutComponent windowLayoutComponent) {
        this.f55265a = windowLayoutComponent;
    }

    @Override // m2.InterfaceC43864a
    public final void a(@k InterfaceC22791e<n> interfaceC22791e) {
        ReentrantLock reentrantLock = this.f55266b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f55268d;
        try {
            Context context = (Context) linkedHashMap.get(interfaceC22791e);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f55267c;
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap2.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            multicastConsumer.c(interfaceC22791e);
            linkedHashMap.remove(interfaceC22791e);
            if (multicastConsumer.b()) {
                linkedHashMap2.remove(context);
                this.f55265a.removeWindowLayoutInfoListener(multicastConsumer);
            }
            G0 g02 = G0.f406611a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // m2.InterfaceC43864a
    public final void b(@k Context context, @k Executor executor, @k InterfaceC22791e<n> interfaceC22791e) {
        G0 g02;
        ReentrantLock reentrantLock = this.f55266b;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f55267c;
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f55268d;
            if (multicastConsumer != null) {
                multicastConsumer.a(interfaceC22791e);
                linkedHashMap2.put(interfaceC22791e, context);
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(context);
                linkedHashMap.put(context, multicastConsumer2);
                linkedHashMap2.put(interfaceC22791e, context);
                multicastConsumer2.a(interfaceC22791e);
                this.f55265a.addWindowLayoutInfoListener(context, multicastConsumer2);
            }
            G0 g03 = G0.f406611a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
