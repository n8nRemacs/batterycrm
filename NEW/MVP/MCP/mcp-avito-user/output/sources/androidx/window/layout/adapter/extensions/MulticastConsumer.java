package androidx.window.layout.adapter.extensions;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.core.util.InterfaceC22791e;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.n;
import androidx.window.layout.s;
import j.B;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MulticastConsumer.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/window/layout/adapter/extensions/MulticastConsumer;", "Landroidx/core/util/e;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "Landroidx/window/extensions/core/util/function/Consumer;", "value", "Lkotlin/G0;", "accept", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MulticastConsumer implements InterfaceC22791e<WindowLayoutInfo>, Consumer<WindowLayoutInfo> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f55254b;

    /* renamed from: d, reason: collision with root package name */
    @B
    @l
    public n f55256d;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ReentrantLock f55255c = new ReentrantLock();

    /* renamed from: e, reason: collision with root package name */
    @B
    @k
    public final LinkedHashSet f55257e = new LinkedHashSet();

    public MulticastConsumer(@k Context context) {
        this.f55254b = context;
    }

    public final void a(@k InterfaceC22791e<n> interfaceC22791e) {
        ReentrantLock reentrantLock = this.f55255c;
        reentrantLock.lock();
        try {
            n nVar = this.f55256d;
            if (nVar != null) {
                interfaceC22791e.accept(nVar);
            }
            this.f55257e.add(interfaceC22791e);
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean b() {
        return this.f55257e.isEmpty();
    }

    public final void c(@k InterfaceC22791e<n> interfaceC22791e) {
        ReentrantLock reentrantLock = this.f55255c;
        reentrantLock.lock();
        try {
            this.f55257e.remove(interfaceC22791e);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // androidx.core.util.InterfaceC22791e
    public void accept(@k WindowLayoutInfo value) {
        n nVarB;
        ReentrantLock reentrantLock = this.f55255c;
        reentrantLock.lock();
        try {
            e eVar = e.f55269a;
            Context context = this.f55254b;
            eVar.getClass();
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                nVarB = e.b(s.f55349b.b(context), value);
            } else {
                if (i12 < 29 || !(context instanceof Activity)) {
                    throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
                }
                s.f55349b.getClass();
                nVarB = e.b(s.a((Activity) context), value);
            }
            this.f55256d = nVarB;
            Iterator it = this.f55257e.iterator();
            while (it.hasNext()) {
                ((InterfaceC22791e) it.next()).accept(nVarB);
            }
            G0 g02 = G0.f406611a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
