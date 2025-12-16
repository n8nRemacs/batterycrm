package com.avito.android.str_booking.domain;

import Sx0.C15258g;
import Y41.p;
import com.avito.android.str_booking.mvi.entity.StrBookingInternalAction;
import com.avito.android.util.P2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrBookingInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/util/P2;", "LSx0/g;", "loadingState", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/str_booking/mvi/entity/StrBookingInternalAction;", "<anonymous>", "(Lcom/avito/android/util/P2;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_booking.domain.StrBookingInteractorImpl$loadSellerStrBooking$4", f = "StrBookingInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class k extends SuspendLambda implements p<P2<? super C15258g>, Continuation<? super InterfaceC43160i<? extends StrBookingInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f285669q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f285670r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(g gVar, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f285670r = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        k kVar = new k(this.f285670r, continuation);
        kVar.f285669q = obj;
        return kVar;
    }

    @Override // Y41.p
    public final Object invoke(P2<? super C15258g> p22, Continuation<? super InterfaceC43160i<? extends StrBookingInternalAction>> continuation) {
        return ((k) create(p22, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:304:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x083d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [com.avito.android.str_booking.network.models.sections.AdditionalInfoContent] */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33, types: [com.avito.android.remote.model.UniversalColor] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24, types: [com.avito.android.str_booking.network.models.common.ButtonAction] */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14, types: [com.avito.android.str_booking.network.models.common.ButtonAction] */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5, types: [com.avito.android.str_booking.network.models.sections.Icon] */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r6v81 */
    /* JADX WARN: Type inference failed for: r6v82, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v94 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v40, types: [com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent] */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45, types: [com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 2196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_booking.domain.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
