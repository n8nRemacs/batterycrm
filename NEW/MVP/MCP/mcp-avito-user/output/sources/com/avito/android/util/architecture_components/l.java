package com.avito.android.util.architecture_components;

import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import io.reactivex.rxjava3.internal.operators.observable.C41990t1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Lifecycles.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l {

    /* compiled from: Lifecycles.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/util/architecture_components/l$a", "Landroidx/lifecycle/L;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC22979L {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f318813b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Lifecycle.State f318814c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ N f318815d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Lifecycle lifecycle, Lifecycle.State state, Y41.a<G0> aVar) {
            this.f318813b = lifecycle;
            this.f318814c = state;
            this.f318815d = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r3v4, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC22979L
        public final void HH(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Lifecycle.Event event) {
            Lifecycle lifecycle = this.f318813b;
            if (lifecycle.getF46705d() == Lifecycle.State.f46679b) {
                lifecycle.c(this);
            } else if (lifecycle.getF46705d().compareTo(this.f318814c) >= 0) {
                this.f318815d.invoke();
                lifecycle.c(this);
            }
        }
    }

    public static final void a(@Y61.k Lifecycle lifecycle, @Y61.k Lifecycle.State state, @Y61.k Y41.a<G0> aVar) {
        if (lifecycle.getF46705d().compareTo(state) >= 0) {
            aVar.invoke();
        } else {
            lifecycle.a(new a(lifecycle, state, aVar));
        }
    }

    @Y61.k
    public static final C41990t1 b(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Lifecycle.Event event) {
        return new io.reactivex.rxjava3.internal.operators.observable.C(new com.avito.android.str_seller_orders.orders_seller.d(interfaceC22983P.getLifecycle(), 10)).N(new m(event)).d0(n.f318817b).z0(1L);
    }
}
