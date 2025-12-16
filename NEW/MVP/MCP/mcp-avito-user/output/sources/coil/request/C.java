package coil.request;

import android.graphics.Bitmap;
import android.os.Looper;
import android.view.View;
import androidx.view.InterfaceC22982O;
import androidx.view.Lifecycle;
import j.K;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* compiled from: ViewTargetRequestManager.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/request/C;", "Landroid/view/View$OnAttachStateChangeListener;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class C implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f58609b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public z f58610c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public N0 f58611d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public A f58612e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f58613f;

    public C(@Y61.k View view) {
        this.f58609b = view;
    }

    @Y61.k
    public final synchronized z b(@Y61.k InterfaceC43076a0<? extends q> interfaceC43076a0) {
        z zVar = this.f58610c;
        if (zVar != null) {
            Bitmap.Config[] configArr = coil.util.l.f58781a;
            if (L.f(Looper.myLooper(), Looper.getMainLooper()) && this.f58613f) {
                this.f58613f = false;
                zVar.f58749b = interfaceC43076a0;
                return zVar;
            }
        }
        N0 n02 = this.f58611d;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f58611d = null;
        z zVar2 = new z(this.f58609b, interfaceC43076a0);
        this.f58610c = zVar2;
        return zVar2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @K
    public final void onViewAttachedToWindow(@Y61.k View view) {
        A a12 = this.f58612e;
        if (a12 == null) {
            return;
        }
        this.f58613f = true;
        a12.f58603b.b(a12.f58604c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    @K
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        A a12 = this.f58612e;
        if (a12 != null) {
            a12.f58607f.c(null);
            K2.d<?> dVar = a12.f58605d;
            boolean z12 = dVar instanceof InterfaceC22982O;
            Lifecycle lifecycle = a12.f58606e;
            if (z12) {
                lifecycle.c((InterfaceC22982O) dVar);
            }
            lifecycle.c(a12);
        }
    }
}
