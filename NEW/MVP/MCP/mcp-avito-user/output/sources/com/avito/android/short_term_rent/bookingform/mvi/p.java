package com.avito.android.short_term_rent.bookingform.mvi;

import aw0.C24185a;
import aw0.C24186b;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import cw0.C39425b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.X;

/* compiled from: BookingFormActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$handleToggleSelectionChanged$1", f = "BookingFormActor.kt", i = {0, 0}, l = {364, 375}, m = "invokeSuspend", n = {"$this$flow", "bonusesData"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public C24185a f281988q;

    /* renamed from: r, reason: collision with root package name */
    public int f281989r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f281990s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.r f281991t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C39425b f281992u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C34968a f281993v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(a.r rVar, C39425b c39425b, C34968a c34968a, Continuation<? super p> continuation) {
        super(2, continuation);
        this.f281991t = rVar;
        this.f281992u = c39425b;
        this.f281993v = c34968a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        p pVar = new p(this.f281991t, this.f281992u, this.f281993v, continuation);
        pVar.f281990s = obj;
        return pVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((p) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        C24185a c24185a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f281989r;
        a.r rVar = this.f281991t;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f281990s;
            a.r.InterfaceC8403a interfaceC8403a = rVar.f281859c;
            a.r.InterfaceC8403a.C8404a c8404a = interfaceC8403a instanceof a.r.InterfaceC8403a.C8404a ? (a.r.InterfaceC8403a.C8404a) interfaceC8403a : null;
            if (c8404a == null) {
                return G0.f406611a;
            }
            Long l12 = c8404a.f281861a;
            C24185a c24185a2 = l12 != null ? new C24185a(rVar.f281858b, l12.longValue()) : null;
            BookingFormInternalAction.BonusesChanged bonusesChanged = new BookingFormInternalAction.BonusesChanged(c24185a2);
            this.f281990s = interfaceC43172j2;
            this.f281988q = c24185a2;
            this.f281989r = 1;
            if (interfaceC43172j2.emit(bonusesChanged, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            interfaceC43172j = interfaceC43172j2;
            c24185a = c24185a2;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C24185a c24185a3 = this.f281988q;
            interfaceC43172j = (InterfaceC43172j) this.f281990s;
            C42729a0.b(obj);
            c24185a = c24185a3;
        }
        if (rVar.f281860d) {
            C24186b c24186b = this.f281992u.f393066b;
            if (c24186b == null) {
                return G0.f406611a;
            }
            X xA2 = this.f281993v.f281763b.a(C24186b.a(c24186b, null, null, null, null, c24185a, null, null, null, 2015));
            this.f281990s = null;
            this.f281988q = null;
            this.f281989r = 2;
            if (C43175k.u(this, xA2, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
