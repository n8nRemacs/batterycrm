package com.avito.android.short_term_rent.bookingform.deeplink;

import com.avito.android.short_term_rent.deeplink.BookingFormDeepLink;
import java.util.Date;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BookingFormDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f281229l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BookingFormDeepLink f281230m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, BookingFormDeepLink bookingFormDeepLink) {
        super(0);
        this.f281229l = bVar;
        this.f281230m = bookingFormDeepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f281229l;
        BookingFormDeepLink bookingFormDeepLink = this.f281230m;
        String str = bookingFormDeepLink.f282228b;
        String str2 = bookingFormDeepLink.f282238l;
        String str3 = bookingFormDeepLink.f282239m;
        com.avito.android.short_term_rent.bookingform.e eVar = bVar.f281232g;
        Date date = bookingFormDeepLink.f282229c;
        Date date2 = bookingFormDeepLink.f282230d;
        Integer num = bookingFormDeepLink.f282231e;
        Integer num2 = bookingFormDeepLink.f282232f;
        List<String> list = bookingFormDeepLink.f282233g;
        bVar.f281233h.J(eVar.a(bookingFormDeepLink.f282237k, bookingFormDeepLink.f282235i, num, num2, bookingFormDeepLink.f282234h, str, bookingFormDeepLink.f282236j, str2, str3, date, date2, list), -2051976460, com.avito.android.deeplink_handler.view.c.f134589l);
        bVar.j(BookingFormDeepLink.b.a.f282240b);
        return G0.f406611a;
    }
}
