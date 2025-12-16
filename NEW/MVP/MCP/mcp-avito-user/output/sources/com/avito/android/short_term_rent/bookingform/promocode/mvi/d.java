package com.avito.android.short_term_rent.bookingform.promocode.mvi;

import com.avito.android.short_term_rent.bookingform.promocode.mvi.entity.PromoCodeInternalAction;
import ew0.C40171e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PromoCodeActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/promocode/mvi/entity/PromoCodeInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.promocode.mvi.PromoCodeActor$handleButtonClick$1", f = "PromoCodeActor.kt", i = {2, 2, 3, 3}, l = {49, 62, 70, 72, 73, 74, 75, 76}, m = "invokeSuspend", n = {"$this$flow", "actualPromoCode", "$this$flow", "actualPromoCode"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super PromoCodeInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public String f282140q;

    /* renamed from: r, reason: collision with root package name */
    public int f282141r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f282142s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C40171e f282143t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f282144u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C40171e c40171e, g gVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f282143t = c40171e;
        this.f282144u = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f282143t, this.f282144u, continuation);
        dVar.f282142s = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super PromoCodeInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0106  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.promocode.mvi.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
