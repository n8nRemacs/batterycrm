package com.avito.android.send_esia_data_screen.mvi;

import Y41.p;
import com.avito.android.deeplink_handler.handler.b;
import dr0.AbstractC39789a;
import dr0.AbstractC39790b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SendEsiaDataActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ldr0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.send_esia_data_screen.mvi.SendEsiaDataActor$process$3", f = "SendEsiaDataActor.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super AbstractC39790b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f268264q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f268265r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f268266s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AbstractC39789a f268267t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, AbstractC39789a abstractC39789a, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f268266s = eVar;
        this.f268267t = abstractC39789a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f268266s, this.f268267t, continuation);
        cVar.f268265r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AbstractC39790b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f268264q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f268265r;
            AbstractC39790b.a aVar = AbstractC39790b.a.f394154a;
            this.f268264q = 1;
            if (interfaceC43172j.emit(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        e eVar = this.f268266s;
        b.a.a(eVar.f268272a, eVar.f268273b.b(((AbstractC39789a.b) this.f268267t).f394150a), null, null, 6);
        return G0.f406611a;
    }
}
