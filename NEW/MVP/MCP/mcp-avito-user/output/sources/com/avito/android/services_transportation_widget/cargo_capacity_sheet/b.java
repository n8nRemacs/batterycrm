package com.avito.android.services_transportation_widget.cargo_capacity_sheet;

import Av0.C13088d;
import Av0.C13089e;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.C23424o;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ServiceTransportationCardSelectPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.services_transportation_widget.cargo_capacity_sheet.ServiceTransportationCardSelectPresenterImpl$dispatchUpdate$2", f = "ServiceTransportationCardSelectPresenter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e f280470q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f280471r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C23424o.e f280472s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, List<C13088d> list, C23424o.e eVar2, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f280470q = eVar;
        this.f280471r = list;
        this.f280472s = eVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new b(this.f280470q, this.f280471r, this.f280472s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        j jVar = this.f280470q.f280484g;
        if (jVar == null) {
            return null;
        }
        Object obj2 = this.f280471r;
        C23424o.e eVar = this.f280472s;
        C13089e c13089e = jVar.f280493I;
        c13089e.f687d = obj2;
        eVar.b(c13089e);
        return G0.f406611a;
    }
}
