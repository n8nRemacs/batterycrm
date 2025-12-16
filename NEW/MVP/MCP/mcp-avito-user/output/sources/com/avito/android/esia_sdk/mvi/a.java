package com.avito.android.esia_sdk.mvi;

import Lz.AbstractC14457a;
import Lz.AbstractC14458b;
import Y41.p;
import com.avito.android.deeplink_handler.handler.b;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EsiaSdkActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LLz/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.esia_sdk.mvi.EsiaSdkActor$process$1", f = "EsiaSdkActor.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super AbstractC14458b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f148133q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f148134r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f148135s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC14457a f148136t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, AbstractC14457a abstractC14457a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f148135s = dVar;
        this.f148136t = abstractC14457a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f148135s, this.f148136t, continuation);
        aVar.f148134r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AbstractC14458b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f148133q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f148134r;
            d dVar = this.f148135s;
            b.a.a(dVar.f148143a, dVar.f148144b.e(((AbstractC14457a.C0652a) this.f148136t).f10318a), null, null, 6);
            AbstractC14458b.C0653b c0653b = AbstractC14458b.C0653b.f10321a;
            this.f148133q = 1;
            if (interfaceC43172j.emit(c0653b, this) == coroutine_suspended) {
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
