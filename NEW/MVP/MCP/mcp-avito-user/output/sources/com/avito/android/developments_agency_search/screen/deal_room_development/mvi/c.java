package com.avito.android.developments_agency_search.screen.deal_room_development.mvi;

import Dw.InterfaceC13445a;
import Dw.InterfaceC13446b;
import Ju.InterfaceC14249c;
import Y41.p;
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
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DealRoomDevelopmentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LDw/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.developments_agency_search.screen.deal_room_development.mvi.DealRoomDevelopmentActor$process$3", f = "DealRoomDevelopmentActor.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC13446b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f137931q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f137932r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13445a f137933s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC13445a interfaceC13445a, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f137933s = interfaceC13445a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f137933s, continuation);
        cVar.f137932r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC13446b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f137931q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f137932r;
            InterfaceC14249c interfaceC14249c = ((InterfaceC13445a.c) this.f137933s).f3524a;
            if (interfaceC14249c instanceof m.c) {
                Bundle bundle = ((m.c) interfaceC14249c).f105170b;
                String string = bundle != null ? bundle.getString(SearchParamsConverterKt.LOCATION_ID) : null;
                String string2 = bundle != null ? bundle.getString("parentScreen") : null;
                if (string != null && string2 != null) {
                    InterfaceC13446b.g gVar = new InterfaceC13446b.g(string, string2);
                    this.f137931q = 1;
                    if (interfaceC43172j.emit(gVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
