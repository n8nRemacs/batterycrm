package com.avito.android.short_term_rent.soft_booking.mvi;

import com.avito.android.guests_selector.io.GuestsSelectorAvailableAge;
import com.avito.android.guests_selector.io.GuestsSelectorChild;
import com.avito.android.guests_selector.io.GuestsSelectorInput;
import com.avito.android.short_term_rent.common.entity.GuestsDetailedValue;
import com.avito.android.short_term_rent.soft_booking.mvi.entity.StrSoftBookingInternalAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pw0.C47157a;
import pw0.C47160d;

/* compiled from: StrSoftBookingActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/soft_booking/mvi/entity/StrSoftBookingInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.soft_booking.mvi.StrSoftBookingActor$handleGuestCountClick$1", f = "StrSoftBookingActor.kt", i = {}, l = {184, 186}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StrSoftBookingInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f282739q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f282740r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.short_term_rent.soft_booking.mvi.state.a f282741s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f282741s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        f fVar = new f(this.f282741s, continuation);
        fVar.f282740r = obj;
        return fVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super StrSoftBookingInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        ArrayList arrayList;
        List<String> listD;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f282739q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f282740r;
            com.avito.android.short_term_rent.soft_booking.mvi.state.a aVar = this.f282741s;
            C47157a c47157a = aVar.f282795d;
            C47160d c47160d = c47157a.f428852f;
            if (c47160d != null) {
                ArrayList arrayList2 = null;
                List<pw0.e> list = c47160d.f428870h;
                if (list != null) {
                    List<pw0.e> list2 = list;
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(list2, 10));
                    for (pw0.e eVar : list2) {
                        arrayList3.add(new GuestsSelectorAvailableAge(eVar.f428871a, com.avito.android.printable_text.b.f(eVar.f428872b)));
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                GuestsDetailedValue guestsDetailedValue = c47160d.f428865c;
                Integer adultsCount = guestsDetailedValue != null ? guestsDetailedValue.getAdultsCount() : null;
                if (guestsDetailedValue != null && (listD = guestsDetailedValue.d()) != null) {
                    List<String> list3 = listD;
                    arrayList2 = new ArrayList(C42745f0.q(list3, 10));
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(new GuestsSelectorChild((String) it.next()));
                    }
                }
                StrSoftBookingInternalAction.ShowGuestsSelector showGuestsSelector = new StrSoftBookingInternalAction.ShowGuestsSelector(new GuestsSelectorInput(null, c47160d.f428868f, c47160d.f428867e, null, null, arrayList, adultsCount, arrayList2, c47160d.f428869g, Boxing.boxBoolean(aVar.f282795d.f428853g), null, 1049, null));
                this.f282739q = 1;
                if (interfaceC43172j.emit(showGuestsSelector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                StrSoftBookingInternalAction.ShowGuestOptions showGuestOptions = new StrSoftBookingInternalAction.ShowGuestOptions(c47157a);
                this.f282739q = 2;
                if (interfaceC43172j.emit(showGuestOptions, this) == coroutine_suspended) {
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
