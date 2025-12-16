package com.avito.android.short_term_rent.bookingform.mvi;

import com.avito.android.short_term_rent.bookingform.mvi.entity.BookingFormInternalAction;
import cw0.C39425b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BookingFormActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/short_term_rent/bookingform/mvi/entity/BookingFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.mvi.BookingFormActor$handleBackNavigation$1", f = "BookingFormActor.kt", i = {2, 2}, l = {131, 146, 150, 151}, m = "invokeSuspend", n = {"$this$flow", "trustedNextPageId"}, s = {"L$0", "J$0"})
/* renamed from: com.avito.android.short_term_rent.bookingform.mvi.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34969b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BookingFormInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public long f281771q;

    /* renamed from: r, reason: collision with root package name */
    public int f281772r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f281773s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C39425b f281774t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34969b(C39425b c39425b, Continuation<? super C34969b> continuation) {
        super(2, continuation);
        this.f281774t = c39425b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C34969b c34969b = new C34969b(this.f281774t, continuation);
        c34969b.f281773s = obj;
        return c34969b;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super BookingFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C34969b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00ca A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.mvi.C34969b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
