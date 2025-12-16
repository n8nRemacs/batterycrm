package com.avito.android.short_term_rent.bookingform.domain;

import Hl0.InterfaceC14002a;
import Y41.p;
import Y61.k;
import aw0.C24186b;
import com.avito.android.remote.short_term_rent.generated.api.api_2_str_booking_request_pay_post.PaymentType;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: CreateBookingRequestUseCase.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/domain/b;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final g f281332a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC14002a f281333b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Gson f281334c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f281335d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final R0 f281336e;

    /* compiled from: CreateBookingRequestUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<PaymentType.Type> f281337a = kotlin.enums.c.a(PaymentType.Type.values());
    }

    @Inject
    public b(@k g gVar, @k InterfaceC14002a interfaceC14002a, @k Gson gson, @k com.avito.android.remote.error.f fVar, @k R0 r02) {
        this.f281332a = gVar;
        this.f281333b = interfaceC14002a;
        this.f281334c = gson;
        this.f281335d = fVar;
        this.f281336e = r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.avito.android.short_term_rent.bookingform.domain.b r26, kotlinx.coroutines.flow.InterfaceC43172j r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, java.lang.String r32, Il0.g r33, java.lang.String r34, java.lang.Long r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, Y41.p r41, boolean r42, kotlin.coroutines.jvm.internal.ContinuationImpl r43) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.short_term_rent.bookingform.domain.b.a(com.avito.android.short_term_rent.bookingform.domain.b, kotlinx.coroutines.flow.j, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, Il0.g, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, Y41.p, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @k
    public final C43152f0 b(@k C24186b c24186b, @k p pVar) {
        return new C43152f0(C43175k.I(this.f281336e.a(), C43175k.G(new d(c24186b, this, pVar, null))), new e(this, null));
    }
}
