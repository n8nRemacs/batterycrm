package com.avito.android.str_calendar.seller.last_minute_offer;

import Y41.p;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.d1;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction;
import com.avito.android.util.R0;
import java.util.Date;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: LastMinuteOfferInteractor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/c;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d1 f287843a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f287844b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f287845c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SelectedDateRange f287846d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final k f287847e;

    /* compiled from: LastMinuteOfferInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_calendar.seller.last_minute_offer.LastMinuteOfferInteractorImpl$getSellerCalendarLastMinuteOffer$1", f = "LastMinuteOfferInteractor.kt", i = {0, 0, 0, 1}, l = {42, 44, 51, 52}, m = "invokeSuspend", n = {"$this$flow", "startDate", "endDate", "$this$flow"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public String f287848q;

        /* renamed from: r, reason: collision with root package name */
        public String f287849r;

        /* renamed from: s, reason: collision with root package name */
        public int f287850s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f287851t;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f287851t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f287850s
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                com.avito.android.str_calendar.seller.last_minute_offer.c r6 = com.avito.android.str_calendar.seller.last_minute_offer.c.this
                r7 = 0
                if (r1 == 0) goto L3a
                if (r1 == r5) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L20
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L20:
                kotlin.C42729a0.b(r12)
                goto Lc2
            L25:
                java.lang.Object r1 = r11.f287851t
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r12)
                goto L8a
            L2d:
                java.lang.String r1 = r11.f287849r
                java.lang.String r5 = r11.f287848q
                java.lang.Object r8 = r11.f287851t
                kotlinx.coroutines.flow.j r8 = (kotlinx.coroutines.flow.InterfaceC43172j) r8
                kotlin.C42729a0.b(r12)
                r12 = r8
                goto L71
            L3a:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f287851t
                kotlinx.coroutines.flow.j r12 = (kotlinx.coroutines.flow.InterfaceC43172j) r12
                com.avito.android.str_calendar.common.models.SelectedDateRange r1 = r6.f287846d
                java.util.Date r1 = r1.f286645b
                if (r1 == 0) goto L4c
                java.lang.String r1 = wy0.b.d(r1)
                goto L4d
            L4c:
                r1 = r7
            L4d:
                com.avito.android.str_calendar.common.models.SelectedDateRange r8 = r6.f287846d
                java.util.Date r8 = r8.f286646c
                if (r8 == 0) goto L58
                java.lang.String r8 = wy0.b.d(r8)
                goto L59
            L58:
                r8 = r7
            L59:
                if (r1 == 0) goto Lc2
                com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$StartLoading r9 = new com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$StartLoading
                r9.<init>()
                r11.f287851t = r12
                r11.f287848q = r1
                r11.f287849r = r8
                r11.f287850s = r5
                java.lang.Object r5 = r12.emit(r9, r11)
                if (r5 != r0) goto L6f
                return r0
            L6f:
                r5 = r1
                r1 = r8
            L71:
                com.avito.android.remote.d1 r8 = r6.f287843a
                if (r1 != 0) goto L76
                r1 = r5
            L76:
                r11.f287851t = r12
                r11.f287848q = r7
                r11.f287849r = r7
                r11.f287850s = r4
                java.lang.String r4 = r6.f287845c
                java.lang.Object r1 = r8.j(r4, r5, r1, r11)
                if (r1 != r0) goto L87
                return r0
            L87:
                r10 = r1
                r1 = r12
                r12 = r10
            L8a:
                com.avito.android.remote.model.TypedResult r12 = (com.avito.android.remote.model.TypedResult) r12
                boolean r4 = r12 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r4 == 0) goto La6
                com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$ShowError r2 = new com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$ShowError
                com.avito.android.remote.model.TypedResult$Error r12 = (com.avito.android.remote.model.TypedResult.Error) r12
                com.avito.android.remote.error.ApiError r12 = r12.getError()
                r2.<init>(r12)
                r11.f287851t = r7
                r11.f287850s = r3
                java.lang.Object r12 = r1.emit(r2, r11)
                if (r12 != r0) goto Lc2
                return r0
            La6:
                boolean r3 = r12 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto Lc2
                com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$ShowContent r3 = new com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$ShowContent
                com.avito.android.remote.model.TypedResult$Success r12 = (com.avito.android.remote.model.TypedResult.Success) r12
                java.lang.Object r12 = r12.getResult()
                com.avito.android.remote.model.StrSellerCalendarLastMinuteOfferResponse r12 = (com.avito.android.remote.model.StrSellerCalendarLastMinuteOfferResponse) r12
                r3.<init>(r12)
                r11.f287851t = r7
                r11.f287850s = r2
                java.lang.Object r12 = r1.emit(r3, r11)
                if (r12 != r0) goto Lc2
                return r0
            Lc2:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.last_minute_offer.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@Y61.k d1 d1Var, @Y61.k R0 r02, @Y61.k String str, @Y61.k SelectedDateRange selectedDateRange, @Y61.k k kVar) {
        this.f287843a = d1Var;
        this.f287844b = r02;
        this.f287845c = str;
        this.f287846d = selectedDateRange;
        this.f287847e = kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.str_calendar.seller.last_minute_offer.c r6, kotlinx.coroutines.flow.InterfaceC43172j r7, com.avito.android.remote.error.ApiError r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof com.avito.android.str_calendar.seller.last_minute_offer.d
            if (r0 == 0) goto L16
            r0 = r9
            com.avito.android.str_calendar.seller.last_minute_offer.d r0 = (com.avito.android.str_calendar.seller.last_minute_offer.d) r0
            int r1 = r0.f287858v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f287858v = r1
            goto L1b
        L16:
            com.avito.android.str_calendar.seller.last_minute_offer.d r0 = new com.avito.android.str_calendar.seller.last_minute_offer.d
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.f287856t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f287858v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            kotlin.C42729a0.b(r9)
            goto Lb7
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            com.avito.android.remote.error.ApiError r8 = r0.f287855s
            kotlinx.coroutines.flow.j r7 = r0.f287854r
            com.avito.android.str_calendar.seller.last_minute_offer.c r6 = r0.f287853q
            kotlin.C42729a0.b(r9)
            goto L5b
        L43:
            kotlin.C42729a0.b(r9)
            com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$CloseScreen r9 = new com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$CloseScreen
            r2 = 0
            r9.<init>(r2, r5)
            r0.f287853q = r6
            r0.f287854r = r7
            r0.f287855s = r8
            r0.f287858v = r4
            java.lang.Object r9 = r7.emit(r9, r0)
            if (r9 != r1) goto L5b
            goto Lb9
        L5b:
            boolean r9 = r8 instanceof com.avito.android.remote.error.ApiError.IncorrectData
            if (r9 == 0) goto L85
            r9 = r8
            com.avito.android.remote.error.ApiError$IncorrectData r9 = (com.avito.android.remote.error.ApiError.IncorrectData) r9
            java.util.Map r9 = r9.c()
            java.lang.String r2 = "message"
            java.lang.Object r9 = r9.get(r2)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L76
            int r2 = r9.length()
            if (r2 != 0) goto L77
        L76:
            r9 = r5
        L77:
            if (r9 == 0) goto L7e
            com.avito.android.printable_text.PrintableText r6 = com.avito.android.printable_text.b.f(r9)
            goto L9a
        L7e:
            com.avito.android.str_calendar.seller.last_minute_offer.k r6 = r6.f287847e
            com.avito.android.printable_text.PrintableText r6 = r6.getF287909b()
            goto L9a
        L85:
            java.lang.String r9 = r8.getF244063c()
            int r2 = r9.length()
            if (r2 != 0) goto L96
            com.avito.android.str_calendar.seller.last_minute_offer.k r6 = r6.f287847e
            com.avito.android.printable_text.PrintableText r6 = r6.getF287909b()
            goto L9a
        L96:
            com.avito.android.printable_text.PrintableText r6 = com.avito.android.printable_text.b.f(r9)
        L9a:
            com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$ShowToast r9 = new com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$ShowToast
            com.avito.android.component.toast.f$c$a r2 = com.avito.android.component.toast.f.c.f125255c
            r2.getClass()
            com.avito.android.component.toast.f$c r8 = com.avito.android.component.toast.f.c.a.a(r8, r5)
            r9.<init>(r6, r8)
            r0.f287853q = r5
            r0.f287854r = r5
            r0.f287855s = r5
            r0.f287858v = r3
            java.lang.Object r6 = r7.emit(r9, r0)
            if (r6 != r1) goto Lb7
            goto Lb9
        Lb7:
            kotlin.G0 r1 = kotlin.G0.f406611a
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.last_minute_offer.c.c(com.avito.android.str_calendar.seller.last_minute_offer.c, kotlinx.coroutines.flow.j, com.avito.android.remote.error.ApiError, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.str_calendar.seller.last_minute_offer.c r7, kotlinx.coroutines.flow.InterfaceC43172j r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof com.avito.android.str_calendar.seller.last_minute_offer.e
            if (r0 == 0) goto L16
            r0 = r9
            com.avito.android.str_calendar.seller.last_minute_offer.e r0 = (com.avito.android.str_calendar.seller.last_minute_offer.e) r0
            int r1 = r0.f287885u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f287885u = r1
            goto L1b
        L16:
            com.avito.android.str_calendar.seller.last_minute_offer.e r0 = new com.avito.android.str_calendar.seller.last_minute_offer.e
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f287883s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f287885u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.C42729a0.b(r9)
            goto L86
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlinx.coroutines.flow.j r8 = r0.f287882r
            com.avito.android.str_calendar.seller.last_minute_offer.c r7 = r0.f287881q
            kotlin.C42729a0.b(r9)
            goto L6b
        L3f:
            kotlin.C42729a0.b(r9)
            com.avito.android.str_calendar.common.models.SelectedDateRange r9 = r7.f287846d
            java.util.Date r2 = r9.f286645b
            java.lang.String r5 = r7.f287845c
            if (r2 == 0) goto L54
            java.util.Date r9 = r9.f286646c
            if (r9 == 0) goto L54
            com.avito.android.str_calendar.common.models.UpdatedParametersInfo$Ranged r6 = new com.avito.android.str_calendar.common.models.UpdatedParametersInfo$Ranged
            r6.<init>(r5, r2, r9)
            goto L59
        L54:
            com.avito.android.str_calendar.common.models.UpdatedParametersInfo$Base r6 = new com.avito.android.str_calendar.common.models.UpdatedParametersInfo$Base
            r6.<init>(r5)
        L59:
            com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$CloseScreen r9 = new com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$CloseScreen
            r9.<init>(r4, r6)
            r0.f287881q = r7
            r0.f287882r = r8
            r0.f287885u = r4
            java.lang.Object r9 = r8.emit(r9, r0)
            if (r9 != r1) goto L6b
            goto L88
        L6b:
            com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$ShowToast r9 = new com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.LastMinuteOfferInternalAction$ShowToast
            com.avito.android.str_calendar.seller.last_minute_offer.k r7 = r7.f287847e
            com.avito.android.printable_text.PrintableText r7 = r7.getF287908a()
            com.avito.android.component.toast.f$a r2 = com.avito.android.component.toast.f.a.f125253a
            r9.<init>(r7, r2)
            r7 = 0
            r0.f287881q = r7
            r0.f287882r = r7
            r0.f287885u = r3
            java.lang.Object r7 = r8.emit(r9, r0)
            if (r7 != r1) goto L86
            goto L88
        L86:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.str_calendar.seller.last_minute_offer.c.d(com.avito.android.str_calendar.seller.last_minute_offer.c, kotlinx.coroutines.flow.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.str_calendar.seller.last_minute_offer.b
    @Y61.k
    public final InterfaceC43160i a(@Y61.k LinkedHashMap linkedHashMap) {
        SelectedDateRange selectedDateRange = this.f287846d;
        Date date = selectedDateRange.f286645b;
        String strD = date != null ? wy0.b.d(date) : null;
        Date date2 = selectedDateRange.f286646c;
        return C43175k.I(this.f287844b.a(), new C43137a0(new h(2, null), C43175k.G(new f(C43175k.G(new g(strD, this, date2 != null ? wy0.b.d(date2) : null, linkedHashMap, null)), null, this))));
    }

    @Override // com.avito.android.str_calendar.seller.last_minute_offer.b
    @Y61.k
    public final InterfaceC43160i<LastMinuteOfferInternalAction> b() {
        return C43175k.I(this.f287844b.a(), C43175k.G(new a(null)));
    }
}
