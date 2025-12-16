package com.avito.android.short_term_rent.bookingform.promocode.deeplink;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.short_term_rent.bookingform.promocode.BookingFormPromoCodeDialogFragment;
import com.avito.android.short_term_rent.bookingform.promocode.BookingFormPromoCodeDialogFragmentOpenParams;
import com.avito.android.short_term_rent.deeplink.BookingFormPromoCodeDialogDeeplink;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import rv.C47919b;

/* compiled from: BookingFormPromoCodeDialogDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/promocode/deeplink/a;", "Lcom/avito/android/deeplink_handler/handler/base/coroutines/a;", "Lcom/avito/android/short_term_rent/deeplink/BookingFormPromoCodeDialogDeeplink;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends com.avito.android.deeplink_handler.handler.base.coroutines.a<BookingFormPromoCodeDialogDeeplink> {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.f f282088g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final a.d f282089h;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.short_term_rent.bookingform.promocode.deeplink.a$a, reason: collision with other inner class name */
    public static final class C8414a implements InterfaceC43160i<C47919b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f282090b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.short_term_rent.bookingform.promocode.deeplink.a$a$a, reason: collision with other inner class name */
        public static final class C8415a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f282091b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.promocode.deeplink.BookingFormPromoCodeDialogDeeplinkHandler$onCreateSuspend$$inlined$filter$1$2", f = "BookingFormPromoCodeDialogDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.short_term_rent.bookingform.promocode.deeplink.a$a$a$a, reason: collision with other inner class name */
            public static final class C8416a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f282092q;

                /* renamed from: r, reason: collision with root package name */
                public int f282093r;

                public C8416a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f282092q = obj;
                    this.f282093r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C8415a.this.emit(null, this);
                }
            }

            public C8415a(InterfaceC43172j interfaceC43172j) {
                this.f282091b = interfaceC43172j;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.short_term_rent.bookingform.promocode.deeplink.a.C8414a.C8415a.C8416a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.short_term_rent.bookingform.promocode.deeplink.a$a$a$a r0 = (com.avito.android.short_term_rent.bookingform.promocode.deeplink.a.C8414a.C8415a.C8416a) r0
                    int r1 = r0.f282093r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f282093r = r1
                    goto L18
                L13:
                    com.avito.android.short_term_rent.bookingform.promocode.deeplink.a$a$a$a r0 = new com.avito.android.short_term_rent.bookingform.promocode.deeplink.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f282092q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f282093r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4c
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    rv.b r6 = (rv.C47919b) r6
                    java.lang.String r6 = r6.f437158a
                    java.lang.String r2 = "BOOKING_FORM_PROMO_CODE_DIALOG_REQUEST_KEY"
                    boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                    if (r6 == 0) goto L4c
                    r0.f282093r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f282091b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4c
                    return r1
                L4c:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.promocode.deeplink.a.C8414a.C8415a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C8414a(InterfaceC43160i interfaceC43160i) {
            this.f282090b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47919b> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f282090b).collect(new C8415a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: BookingFormPromoCodeDialogDeeplinkHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.short_term_rent.bookingform.promocode.deeplink.BookingFormPromoCodeDialogDeeplinkHandler", f = "BookingFormPromoCodeDialogDeeplinkHandler.kt", i = {0}, l = {23, 34}, m = "onCreateSuspend", n = {"this"}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public a f282095q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f282096r;

        /* renamed from: t, reason: collision with root package name */
        public int f282098t;

        public b(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f282096r = obj;
            this.f282098t |= BeduinInputModel.MIN_TEXT_VERSION;
            return a.this.n(this);
        }
    }

    /* compiled from: BookingFormPromoCodeDialogDeeplinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "result", "Lkotlin/G0;", "emit", "(Lrv/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements InterfaceC43172j {
        public c() {
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            C47919b c47919b = (C47919b) obj;
            String string = c47919b.f437159b.getString("BOOKING_FORM_PROMO_DIALOG_CODE_RESULT_KEY");
            String string2 = c47919b.f437159b.getString("BOOKING_FORM_PROMO_DIALOG_TOAST_RESULT_KEY");
            a aVar = a.this;
            if (string != null) {
                aVar.j(new BookingFormPromoCodeDialogDeeplink.b.c(string, string2));
            } else {
                aVar.j(BookingFormPromoCodeDialogDeeplink.b.C8423b.f282247b);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        super(r02);
        this.f282088g = fVar;
        this.f282089h = dVar;
    }

    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    public final Object m(DeepLink deepLink, String str, Bundle bundle, Continuation continuation) {
        BookingFormPromoCodeDialogDeeplink bookingFormPromoCodeDialogDeeplink = (BookingFormPromoCodeDialogDeeplink) deepLink;
        long j12 = bookingFormPromoCodeDialogDeeplink.f282241b;
        String str2 = bookingFormPromoCodeDialogDeeplink.f282243d;
        String str3 = bookingFormPromoCodeDialogDeeplink.f282244e;
        BookingFormPromoCodeDialogFragmentOpenParams bookingFormPromoCodeDialogFragmentOpenParams = new BookingFormPromoCodeDialogFragmentOpenParams(bookingFormPromoCodeDialogDeeplink.f282246g, j12, bookingFormPromoCodeDialogDeeplink.f282242c, str2, str3, bookingFormPromoCodeDialogDeeplink.f282245f);
        BookingFormPromoCodeDialogFragment.f282045n0.getClass();
        BookingFormPromoCodeDialogFragment bookingFormPromoCodeDialogFragment = new BookingFormPromoCodeDialogFragment();
        bookingFormPromoCodeDialogFragment.f282047h0.setValue(bookingFormPromoCodeDialogFragment, BookingFormPromoCodeDialogFragment.f282046o0[0], bookingFormPromoCodeDialogFragmentOpenParams);
        this.f282089h.w1(bookingFormPromoCodeDialogFragment, "BOOKING_FORM_PROMO_CODE_DIALOG_REQUEST_KEY");
        return G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.deeplink_handler.handler.base.coroutines.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(@Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.avito.android.short_term_rent.bookingform.promocode.deeplink.a.b
            if (r0 == 0) goto L13
            r0 = r6
            com.avito.android.short_term_rent.bookingform.promocode.deeplink.a$b r0 = (com.avito.android.short_term_rent.bookingform.promocode.deeplink.a.b) r0
            int r1 = r0.f282098t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f282098t = r1
            goto L1a
        L13:
            com.avito.android.short_term_rent.bookingform.promocode.deeplink.a$b r0 = new com.avito.android.short_term_rent.bookingform.promocode.deeplink.a$b
            kotlin.coroutines.jvm.internal.ContinuationImpl r6 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r6
            r0.<init>(r6)
        L1a:
            java.lang.Object r6 = r0.f282096r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f282098t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.C42729a0.b(r6)
            goto L6a
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            com.avito.android.short_term_rent.bookingform.promocode.deeplink.a r2 = r0.f282095q
            kotlin.C42729a0.b(r6)
            goto L5d
        L3c:
            kotlin.C42729a0.b(r6)
            com.avito.android.deeplink_handler.view.a$f r6 = r5.f282088g
            java.lang.String r2 = "BOOKING_FORM_PROMO_CODE_DIALOG_REQUEST_KEY"
            kotlinx.coroutines.flow.i r6 = fv.C40483b.b(r6, r2)
            com.avito.android.short_term_rent.bookingform.promocode.deeplink.a$a r2 = new com.avito.android.short_term_rent.bookingform.promocode.deeplink.a$a
            r2.<init>(r6)
            com.avito.android.short_term_rent.bookingform.promocode.deeplink.a$c r6 = new com.avito.android.short_term_rent.bookingform.promocode.deeplink.a$c
            r6.<init>()
            r0.f282095q = r5
            r0.f282098t = r4
            java.lang.Object r6 = r2.collect(r6, r0)
            if (r6 != r1) goto L5c
            return r1
        L5c:
            r2 = r5
        L5d:
            r6 = 0
            r0.f282095q = r6
            r0.f282098t = r3
            r2.getClass()
            kotlin.G0 r6 = kotlin.G0.f406611a
            if (r6 != r1) goto L6a
            return r1
        L6a:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.promocode.deeplink.a.n(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
