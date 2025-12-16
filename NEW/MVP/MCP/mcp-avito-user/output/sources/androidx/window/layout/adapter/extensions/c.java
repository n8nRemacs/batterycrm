package androidx.window.layout.adapter.extensions;

import Y41.l;
import Y61.k;
import android.app.Activity;
import android.content.Context;
import androidx.core.util.InterfaceC22791e;
import androidx.window.core.e;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.n;
import j.B;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.m0;
import m2.InterfaceC43864a;

/* compiled from: ExtensionWindowBackendApi1.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/adapter/extensions/c;", "Lm2/a;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements InterfaceC43864a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final WindowLayoutComponent f55259a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final androidx.window.core.e f55260b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ReentrantLock f55261c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    @B
    @k
    public final LinkedHashMap f55262d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    @B
    @k
    public final LinkedHashMap f55263e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    @B
    @k
    public final LinkedHashMap f55264f = new LinkedHashMap();

    /* compiled from: ExtensionWindowBackendApi1.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a extends H implements l<WindowLayoutInfo, G0> {
        public a(MulticastConsumer multicastConsumer) {
            super(1, multicastConsumer, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        @Override // Y41.l
        public final G0 invoke(WindowLayoutInfo windowLayoutInfo) {
            ((MulticastConsumer) this.receiver).accept(windowLayoutInfo);
            return G0.f406611a;
        }
    }

    public c(@k WindowLayoutComponent windowLayoutComponent, @k androidx.window.core.e eVar) {
        this.f55259a = windowLayoutComponent;
        this.f55260b = eVar;
    }

    @Override // m2.InterfaceC43864a
    public final void a(@k InterfaceC22791e<n> interfaceC22791e) {
        ReentrantLock reentrantLock = this.f55261c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f55263e;
        try {
            Context context = (Context) linkedHashMap.get(interfaceC22791e);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            LinkedHashMap linkedHashMap2 = this.f55262d;
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap2.get(context);
            if (multicastConsumer == null) {
                reentrantLock.unlock();
                return;
            }
            multicastConsumer.c(interfaceC22791e);
            linkedHashMap.remove(interfaceC22791e);
            if (multicastConsumer.f55257e.isEmpty()) {
                linkedHashMap2.remove(context);
                e.b bVar = (e.b) this.f55264f.remove(multicastConsumer);
                if (bVar != null) {
                    bVar.dispose();
                }
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
        ReentrantLock reentrantLock = this.f55261c;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f55262d;
        try {
            MulticastConsumer multicastConsumer = (MulticastConsumer) linkedHashMap.get(context);
            LinkedHashMap linkedHashMap2 = this.f55263e;
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
                if (!(context instanceof Activity)) {
                    multicastConsumer2.accept(new WindowLayoutInfo(C42745f0.z()));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f55264f.put(multicastConsumer2, this.f55260b.a(this.f55259a, m0.a(WindowLayoutInfo.class), (Activity) context, new a(multicastConsumer2)));
                }
            }
            G0 g03 = G0.f406611a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
