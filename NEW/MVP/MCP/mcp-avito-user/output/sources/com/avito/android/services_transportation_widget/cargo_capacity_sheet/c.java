package com.avito.android.services_transportation_widget.cargo_capacity_sheet;

import Av0.C13088d;
import Y41.p;
import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: ServiceTransportationCardSelectPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.services_transportation_widget.cargo_capacity_sheet.ServiceTransportationCardSelectPresenterImpl$onItemClicked$1", f = "ServiceTransportationCardSelectPresenter.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f280473q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f280474r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C13088d f280475s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, C13088d c13088d, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f280474r = eVar;
        this.f280475s = c13088d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f280474r, this.f280475s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        C13088d c13088d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f280473q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e eVar = this.f280474r;
            Iterable iterable = (Iterable) eVar.f280485h;
            ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
            Iterator it = iterable.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                c13088d = this.f280475s;
                if (!zHasNext) {
                    break;
                }
                C13088d c13088d2 = (C13088d) it.next();
                long j12 = c13088d2.f682d;
                arrayList.add(new C13088d(c13088d2.f679a, c13088d2.f680b, c13088d2.f681c, j12, c13088d2.f683e, c13088d2.f684f, j12 == c13088d.f682d));
            }
            eVar.f280486i = Boxing.boxLong(c13088d.f682d);
            ?? r42 = eVar.f280485h;
            this.f280473q = 1;
            if (e.a(eVar, r42, arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
