package com.avito.android.sbc.create.mvi;

import Uo0.e;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.sbc.create.mvi.entity.CreateDiscountDispatchArg;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CreateDiscountDispatchActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LUo0/d;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$process$2", f = "CreateDiscountDispatchActor.kt", i = {}, l = {JfifUtil.MARKER_EOI, 220}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class V extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f259514q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f259515r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34469a f259516s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(C34469a c34469a, Continuation<? super V> continuation) {
        super(2, continuation);
        this.f259516s = c34469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        V v12 = new V(this.f259516s, continuation);
        v12.f259515r = obj;
        return v12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((V) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f259514q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f259515r;
            C34469a c34469a = this.f259516s;
            CreateDiscountDispatchArg createDiscountDispatchArg = c34469a.f259543d;
            if (createDiscountDispatchArg instanceof CreateDiscountDispatchArg.SbcVasFlowConfiguratorArgs) {
                e.l lVar = e.l.f16631a;
                this.f259514q = 1;
                if (interfaceC43172j.emit(lVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (createDiscountDispatchArg instanceof CreateDiscountDispatchArg.SbcConfiguratorArgs) {
                ScreenPerformanceTracker.a.b(c34469a.f259553n, null, 3);
                e.k kVar = e.k.f16630a;
                this.f259514q = 2;
                if (interfaceC43172j.emit(kVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
