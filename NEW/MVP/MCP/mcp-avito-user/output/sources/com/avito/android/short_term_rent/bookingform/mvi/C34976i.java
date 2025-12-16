package com.avito.android.short_term_rent.bookingform.mvi;

import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import com.avito.android.short_term_rent.bookingform.mvi.entity.a;
import cw0.C39425b;
import cw0.C39429f;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BookingFormActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$handleOnFooterDescriptionClick$1", f = "BookingFormActor.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.short_term_rent.bookingform.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34976i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f281883q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f281884r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C39425b f281885s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ a.i f281886t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34976i(C39425b c39425b, a.i iVar, Continuation<? super C34976i> continuation) {
        super(2, continuation);
        this.f281885s = c39425b;
        this.f281886t = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34976i c34976i = new C34976i(this.f281885s, this.f281886t, continuation);
        c34976i.f281884r = obj;
        return c34976i;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34976i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f281883q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f281884r;
            C39425b.InterfaceC11001b interfaceC11001b = this.f281885s.f393067c;
            C39425b.InterfaceC11001b.c cVar = interfaceC11001b instanceof C39425b.InterfaceC11001b.c ? (C39425b.InterfaceC11001b.c) interfaceC11001b : null;
            if (cVar == null) {
                return G0.f406611a;
            }
            this.f281886t.getClass();
            C39429f c39429f = (C39429f) C42745f0.K(0, cVar.f393074a);
            if (c39429f == null) {
                return G0.f406611a;
            }
            Iterator<com.avito.conveyor_item.a> it = c39429f.f393089b.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                if (L.f(it.next().getF74629c(), null)) {
                    break;
                }
                i13++;
            }
            Integer numBoxInt = Boxing.boxInt(i13);
            Integer num = numBoxInt.intValue() >= 0 ? numBoxInt : null;
            if (num == null) {
                return G0.f406611a;
            }
            BookingFormInternalAction.ScrollToItem scrollToItem = new BookingFormInternalAction.ScrollToItem(0, num.intValue());
            this.f281883q = 1;
            if (interfaceC43172j.emit(scrollToItem, this) == coroutine_suspended) {
                return coroutine_suspended;
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
