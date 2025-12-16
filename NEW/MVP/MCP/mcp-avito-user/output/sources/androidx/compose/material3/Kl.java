package androidx.compose.material3;

import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: TouchExplorationStateProvider.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Kl extends kotlin.jvm.internal.N implements Y41.l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Lifecycle f35020l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Lifecycle.Event, kotlin.G0> f35021m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f35022n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Kl(Lifecycle lifecycle, Y41.l<? super Lifecycle.Event, kotlin.G0> lVar, Y41.a<kotlin.G0> aVar) {
        super(1);
        this.f35020l = lifecycle;
        this.f35021m = lVar;
        this.f35022n = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.compose.material3.Il, androidx.lifecycle.O] */
    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        final Y41.l<Lifecycle.Event, kotlin.G0> lVar = this.f35021m;
        ?? r42 = new InterfaceC22979L() { // from class: androidx.compose.material3.Il
            @Override // androidx.view.InterfaceC22979L
            public final void HH(InterfaceC22983P interfaceC22983P, Lifecycle.Event event) {
                lVar.invoke(event);
            }
        };
        Lifecycle lifecycle = this.f35020l;
        lifecycle.a(r42);
        return new Jl(this.f35022n, lifecycle, r42);
    }
}
