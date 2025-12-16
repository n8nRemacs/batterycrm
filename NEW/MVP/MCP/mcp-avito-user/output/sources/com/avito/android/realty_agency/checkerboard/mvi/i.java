package com.avito.android.realty_agency.checkerboard.mvi;

import Ju.InterfaceC14249c;
import Zh0.InterfaceC19559a;
import Zh0.InterfaceC19561c;
import android.os.Bundle;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.remote.model.SearchParamsConverterKt;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CheckerboardActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LZh0/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.realty_agency.checkerboard.mvi.CheckerboardActor$process$8", f = "CheckerboardActor.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC19561c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f251269q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f251270r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC19559a f251271s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC19559a interfaceC19559a, Continuation<? super i> continuation) {
        super(2, continuation);
        this.f251271s = interfaceC19559a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f251271s, continuation);
        iVar.f251270r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC19561c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f251269q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f251270r;
            InterfaceC14249c interfaceC14249c = ((InterfaceC19559a.g) this.f251271s).f20410b;
            if (interfaceC14249c instanceof m.c) {
                Bundle bundle = ((m.c) interfaceC14249c).f105170b;
                if (bundle == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                InterfaceC19561c.k kVar = new InterfaceC19561c.k(bundle.getString(SearchParamsConverterKt.LOCATION_ID, ""), bundle.getString("parentScreen", ""));
                this.f251269q = 1;
                if (interfaceC43172j.emit(kVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
