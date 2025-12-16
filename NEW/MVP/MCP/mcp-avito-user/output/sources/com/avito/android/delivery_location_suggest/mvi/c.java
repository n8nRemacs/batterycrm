package com.avito.android.delivery_location_suggest.mvi;

import Gv.InterfaceC13920a;
import Y41.q;
import com.avito.android.delivery_location_suggest.mvi.entity.DeliveryLocationSuggestInternalAction;
import com.facebook.imageutils.JfifUtil;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_location_suggest.mvi.DeliveryLocationSuggestActor$process$$inlined$flatMapLatest$1", f = "DeliveryLocationSuggestActor.kt", i = {}, l = {JfifUtil.MARKER_RST7, 189}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
public final class c extends SuspendLambda implements q<InterfaceC43172j<? super DeliveryLocationSuggestInternalAction>, InterfaceC13920a.C0379a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f135158q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f135159r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f135160s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a f135161t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Continuation continuation, a aVar) {
        super(3, continuation);
        this.f135161t = aVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super DeliveryLocationSuggestInternalAction> interfaceC43172j, InterfaceC13920a.C0379a c0379a, Continuation<? super G0> continuation) {
        c cVar = new c(continuation, this.f135161t);
        cVar.f135159r = interfaceC43172j;
        cVar.f135160s = c0379a;
        return cVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f135158q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = this.f135159r;
            InterfaceC13920a.C0379a c0379a = (InterfaceC13920a.C0379a) this.f135160s;
            com.avito.android.delivery_location_suggest.mvi.useCase.e eVar = this.f135161t.f135150a;
            String str = c0379a.f6770a;
            this.f135159r = interfaceC43172j;
            this.f135158q = 1;
            obj = eVar.a(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = this.f135159r;
            C42729a0.b(obj);
        }
        this.f135159r = null;
        this.f135158q = 2;
        if (C43175k.u(this, (InterfaceC43160i) obj, interfaceC43172j) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
