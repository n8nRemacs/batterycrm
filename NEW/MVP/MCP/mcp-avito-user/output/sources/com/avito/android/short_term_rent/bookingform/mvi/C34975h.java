package com.avito.android.short_term_rent.bookingform.mvi;

import aw0.C24186b;
import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import cw0.C39425b;
import cw0.C39427d;
import cw0.C39429f;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BookingFormActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$handleMoveToPage$1", f = "BookingFormActor.kt", i = {0, 0}, l = {219, 220}, m = "invokeSuspend", n = {"$this$flow", "trustedNextPageId"}, s = {"L$0", "J$0"})
/* renamed from: com.avito.android.short_term_rent.bookingform.mvi.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34975h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public long f281878q;

    /* renamed from: r, reason: collision with root package name */
    public int f281879r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f281880s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C39425b f281881t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34968a f281882u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34975h(C34968a c34968a, C39425b c39425b, Continuation continuation) {
        super(2, continuation);
        this.f281881t = c39425b;
        this.f281882u = c34968a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34975h c34975h = new C34975h(this.f281882u, this.f281881t, continuation);
        c34975h.f281880s = obj;
        return c34975h;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34975h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object next;
        C39427d c39427d;
        Long l12;
        Object next2;
        long j12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f281879r;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f281880s;
            C39425b c39425b = this.f281881t;
            C39425b.InterfaceC11001b interfaceC11001b = c39425b.f393067c;
            C39425b.InterfaceC11001b.c cVar = interfaceC11001b instanceof C39425b.InterfaceC11001b.c ? (C39425b.InterfaceC11001b.c) interfaceC11001b : null;
            if (cVar == null) {
                return G0.f406611a;
            }
            List<C39429f> list = cVar.f393074a;
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C39429f) next).f393088a == c39425b.f393068d) {
                    break;
                }
            }
            C39429f c39429f = (C39429f) next;
            if (c39429f == null || (c39427d = c39429f.f393091d) == null || (l12 = c39427d.f393084c.f281826d) == null) {
                return G0.f406611a;
            }
            long jLongValue = l12.longValue();
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                if (((C39429f) next2).f393088a == jLongValue) {
                    break;
                }
            }
            C39429f c39429f2 = (C39429f) next2;
            if (c39429f2 == null) {
                return G0.f406611a;
            }
            C34968a c34968a = this.f281882u;
            com.avito.android.short_term_rent.bookingform.mvi.interactor.a aVar = c34968a.f281766e;
            String str = c34968a.f281762a.f281214b;
            C24186b c24186b = c39425b.f393066b;
            aVar.d(str, c24186b != null ? c24186b.f56783g : null);
            BookingFormInternalAction.HideKeyboard hideKeyboard = BookingFormInternalAction.HideKeyboard.f281801b;
            this.f281880s = interfaceC43172j;
            j12 = c39429f2.f393088a;
            this.f281878q = j12;
            this.f281879r = 1;
            if (interfaceC43172j.emit(hideKeyboard, this) == coroutine_suspended) {
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
            j12 = this.f281878q;
            interfaceC43172j = (InterfaceC43172j) this.f281880s;
            C42729a0.b(obj);
        }
        BookingFormInternalAction.MoveToPage moveToPage = new BookingFormInternalAction.MoveToPage(j12);
        this.f281880s = null;
        this.f281879r = 2;
        if (interfaceC43172j.emit(moveToPage, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
