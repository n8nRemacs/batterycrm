package com.avito.android.cpx_promo_geo.screens.cpx_promo_geo.ui.compose;

import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import ts.InterfaceC48707a;

/* compiled from: CpxPromoGeoScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class E implements PointerInputEventHandler {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.focus.r f127951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC48707a, G0> f127952c;

    /* compiled from: CpxPromoGeoScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "it", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<l0.g, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.focus.r f127953l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC48707a, G0> f127954m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(androidx.compose.ui.focus.r rVar, Y41.l<? super InterfaceC48707a, G0> lVar) {
            super(1);
            this.f127953l = rVar;
            this.f127954m = lVar;
        }

        @Override // Y41.l
        public final G0 invoke(l0.g gVar) {
            long j12 = gVar.f413387a;
            this.f127953l.u(false);
            this.f127954m.invoke(InterfaceC48707a.f.f439469a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public E(androidx.compose.ui.focus.r rVar, Y41.l<? super InterfaceC48707a, G0> lVar) {
        this.f127951b = rVar;
        this.f127952c = lVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    @Y61.l
    public final Object invoke(@Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.k Continuation<? super G0> continuation) {
        Object objG = C20445d2.g(k12, null, null, new a(this.f127951b, this.f127952c), continuation, 7);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
