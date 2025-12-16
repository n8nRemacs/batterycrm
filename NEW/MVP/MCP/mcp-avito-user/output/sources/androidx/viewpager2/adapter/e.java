package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import j.N;

/* compiled from: FragmentStateAdapter.java */
/* loaded from: classes10.dex */
class e implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f55088b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f55089c;

    public e(Handler handler, Runnable runnable) {
        this.f55088b = handler;
        this.f55089c = runnable;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@N InterfaceC22983P interfaceC22983P, @N Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f55088b.removeCallbacks(this.f55089c);
            interfaceC22983P.getLifecycle().c(this);
        }
    }
}
