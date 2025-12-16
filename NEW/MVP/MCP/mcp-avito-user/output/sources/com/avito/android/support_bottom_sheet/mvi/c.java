package com.avito.android.support_bottom_sheet.mvi;

import Y41.p;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.support_bottom_sheet.analytics.SupportRequestType;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vA0.C49186a;
import xA0.AbstractC49804b;

/* compiled from: SupportDialogActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LxA0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.support_bottom_sheet.mvi.SupportDialogActor$process$3", f = "SupportDialogActor.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super AbstractC49804b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f292465q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f292466r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f292467s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f292467s = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f292467s, continuation);
        cVar.f292466r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AbstractC49804b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f292465q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f292466r;
            AbstractC49804b.d dVar = AbstractC49804b.d.f442285a;
            this.f292465q = 1;
            if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        e eVar = this.f292467s;
        InterfaceC28373a interfaceC28373a = eVar.f292474c;
        SupportRequestType supportRequestType = SupportRequestType.f292399d;
        Long l12 = eVar.f292476e;
        interfaceC28373a.c(new C49186a(supportRequestType, l12 != null ? l12.toString() : null));
        b.a.a(eVar.f292472a, new PhoneLink.Call(eVar.f292475d, null, 2, null), null, null, 6);
        return G0.f406611a;
    }
}
