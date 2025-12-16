package com.avito.android.short_term_rent.bookingform.mvi;

import aw0.C24186b;
import aw0.C24187c;
import com.avito.android.short_term_rent.bookingform.BookingFormOpenParams;
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
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$handleDateRangeChanged$1", f = "BookingFormActor.kt", i = {0}, l = {240, 258}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* renamed from: com.avito.android.short_term_rent.bookingform.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34971d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f281779q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f281780r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C34968a f281781s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.b f281782t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C39425b f281783u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34971d(C34968a c34968a, a.b bVar, C39425b c39425b, Continuation<? super C34971d> continuation) {
        super(2, continuation);
        this.f281781s = c34968a;
        this.f281782t = bVar;
        this.f281783u = c39425b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34971d c34971d = new C34971d(this.f281781s, this.f281782t, this.f281783u, continuation);
        c34971d.f281780r = obj;
        return c34971d;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34971d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f281779q;
        a.b bVar = this.f281782t;
        C34968a c34968a = this.f281781s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f281780r;
            com.avito.android.short_term_rent.bookingform.mvi.interactor.a aVar = c34968a.f281766e;
            BookingFormOpenParams bookingFormOpenParams = c34968a.f281762a;
            aVar.g(bookingFormOpenParams.f281214b, bookingFormOpenParams.f281224l);
            BookingFormInternalAction.DateRangeChanged dateRangeChanged = new BookingFormInternalAction.DateRangeChanged(bVar.f281832a, bVar.f281833b);
            this.f281780r = interfaceC43172j;
            this.f281779q = 1;
            if (interfaceC43172j.emit(dateRangeChanged, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f281780r;
            C42729a0.b(obj);
        }
        C24186b c24186b = this.f281783u.f393066b;
        if (c24186b == null) {
            return G0.f406611a;
        }
        C24187c c24187c = c24186b.f56778b;
        if (c24187c == null) {
            return G0.f406611a;
        }
        if (c24187c.f56790c) {
            X xA2 = c34968a.f281763b.a(C24186b.a(c24186b, C24187c.a(c24187c, bVar.f281832a, bVar.f281833b), null, null, null, null, null, null, null, 2045));
            this.f281780r = null;
            this.f281779q = 2;
            if (C43175k.u(this, xA2, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
