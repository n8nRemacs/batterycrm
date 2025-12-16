package androidx.view;

import Y61.k;
import androidx.view.Lifecycle;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Q0;

/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/J;", "Landroidx/lifecycle/F;", "Landroidx/lifecycle/L;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22977J extends AbstractC22973F implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Lifecycle f46674b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final CoroutineContext f46675c;

    public C22977J(@k Lifecycle lifecycle, @k CoroutineContext coroutineContext) {
        this.f46674b = lifecycle;
        this.f46675c = coroutineContext;
        if (lifecycle.getF46705d() == Lifecycle.State.f46679b) {
            Q0.b(coroutineContext, null);
        }
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
        Lifecycle lifecycle = this.f46674b;
        if (lifecycle.getF46705d().compareTo(Lifecycle.State.f46679b) <= 0) {
            lifecycle.c(this);
            Q0.b(this.f46675c, null);
        }
    }

    @Override // androidx.view.AbstractC22973F
    @k
    /* renamed from: b, reason: from getter */
    public final Lifecycle getF46674b() {
        return this.f46674b;
    }

    @Override // kotlinx.coroutines.T
    @k
    /* renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getF38162b() {
        return this.f46675c;
    }
}
