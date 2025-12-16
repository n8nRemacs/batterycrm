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
@DebugMetadata(c = "com.avito.android.gig_shift_start.mvi.GigShiftStartActor$process$1", f = "GigShiftStartActor.kt", i = {}, l = {22, 31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super i>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f160785q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f160786r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f160787s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ o f160788t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, o oVar, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f160787s = dVar;
        this.f160788t = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f160787s, this.f160788t, continuation);
        bVar.f160786r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super i> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC28464o cVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f160785q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f160786r;
            d dVar = this.f160787s;
            GigShiftStartOpenParams gigShiftStartOpenParams = dVar.f160793a;
            if (gigShiftStartOpenParams.f160838b != null) {
                i.b bVar = i.b.f160806a;
                this.f160785q = 1;
                if (interfaceC43172j.emit(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                boolean z12 = this.f160788t.f160819f;
                FH.a aVar = dVar.f160794b;
                aVar.getClass();
                Long l12 = gigShiftStartOpenParams.f160839c;
                GigShiftStartType gigShiftStartType = gigShiftStartOpenParams.f160840d;
                if (z12) {
                    cVar = new GH.c(l12, gigShiftStartType != null ? Integer.valueOf(FH.a.a(gigShiftStartType)) : null);
                } else {
                    cVar = new GH.a(l12, gigShiftStartType != null ? Integer.valueOf(FH.a.a(gigShiftStartType)) : null);
                }
                aVar.f4653a.c(cVar);
                i.d dVar2 = i.d.f160808a;
                this.f160785q = 2;
                if (interfaceC43172j.emit(dVar2, this) == coroutine_suspended) {
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
