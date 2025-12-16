package com.avito.android.gig_shift_start.mvi;

import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.gig_shift_start.mvi.i;
import com.avito.android.gig_shift_start.ui.GigShiftStartOpenParams;
import com.avito.android.gig_shift_start.ui.GigShiftStartType;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: GigShiftStartActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/gig_shift_start/mvi/i;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_shift_start.mvi.GigShiftStartActor$process$2", f = "GigShiftStartActor.kt", i = {}, l = {44, 46}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super i>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f160789q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f160790r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o f160791s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f160792t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, o oVar, Continuation continuation) {
        super(2, continuation);
        this.f160791s = oVar;
        this.f160792t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f160792t, this.f160791s, continuation);
        cVar.f160790r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super i> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC28464o dVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f160789q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f160790r;
            o oVar = this.f160791s;
            boolean z12 = oVar.f160819f;
            d dVar2 = this.f160792t;
            FH.a aVar = dVar2.f160794b;
            GigShiftStartOpenParams gigShiftStartOpenParams = dVar2.f160793a;
            Long l12 = gigShiftStartOpenParams.f160839c;
            aVar.getClass();
            GigShiftStartType gigShiftStartType = gigShiftStartOpenParams.f160840d;
            if (z12) {
                dVar = new GH.d(l12, gigShiftStartType != null ? Integer.valueOf(FH.a.a(gigShiftStartType)) : null);
            } else {
                dVar = new GH.b(l12, gigShiftStartType != null ? Integer.valueOf(FH.a.a(gigShiftStartType)) : null);
            }
            aVar.f4653a.c(dVar);
            if (oVar.f160819f) {
                i.c cVar = i.c.f160807a;
                this.f160789q = 1;
                if (interfaceC43172j.emit(cVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                i.a aVar2 = i.a.f160805a;
                this.f160789q = 2;
                if (interfaceC43172j.emit(aVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
