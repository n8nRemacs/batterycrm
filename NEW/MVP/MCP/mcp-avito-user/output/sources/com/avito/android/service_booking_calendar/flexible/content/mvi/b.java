package com.avito.android.service_booking_calendar.flexible.content.mvi;

import Y41.p;
import com.avito.android.deep_linking.links.DeepLink;
import gt0.InterfaceC40733a;
import gt0.InterfaceC40734b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CalendarContentActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lgt0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_booking_calendar.flexible.content.mvi.CalendarContentActor$process$2", f = "CalendarContentActor.kt", i = {0}, l = {38, 40}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC40734b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f275655q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f275656r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC40733a f275657s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f275658t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC40733a interfaceC40733a, d dVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f275657s = interfaceC40733a;
        this.f275658t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f275657s, this.f275658t, continuation);
        bVar.f275656r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC40734b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f275655q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f275656r;
            String str = ((InterfaceC40733a.e) this.f275657s).f396900a;
            if (str != null) {
                InterfaceC40734b.i iVar = new InterfaceC40734b.i(str);
                this.f275656r = interfaceC43172j;
                this.f275655q = 1;
                if (interfaceC43172j.emit(iVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            interfaceC43172j = (InterfaceC43172j) this.f275656r;
            C42729a0.b(obj);
        }
        InterfaceC40734b.c cVar = new InterfaceC40734b.c((DeepLink) this.f275658t.f275663b.getValue());
        this.f275656r = null;
        this.f275655q = 2;
        if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
