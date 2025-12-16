package com.avito.android.free_delivery.ui.re23;

import UE.a;
import Y41.l;
import Y41.p;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.focus.r;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: FreeDeliveryContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.free_delivery.ui.re23.FreeDeliveryContentKt$FreeDeliveryContent$1", f = "FreeDeliveryContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ UE.c f158865q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l<UE.a, G0> f158866r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f158867s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f158868t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f158869u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UE.c cVar, l lVar, int i12, r rVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f158865q = cVar;
        this.f158866r = lVar;
        this.f158867s = i12;
        this.f158868t = rVar;
        this.f158869u = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        InterfaceC22204y1 interfaceC22204y1 = this.f158869u;
        return new a(this.f158865q, this.f158866r, this.f158867s, this.f158868t, interfaceC22204y1, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (!((Boolean) this.f158869u.getF42167b()).booleanValue()) {
            if (this.f158865q.f16319h) {
                this.f158866r.invoke(new a.c(this.f158867s));
            }
            this.f158868t.u(false);
        }
        return G0.f406611a;
    }
}
