package com.avito.android.service_booking;

import Y61.k;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.C42822w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BookingFlowSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking/BookingFlowSource;", "", "a", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BookingFlowSource {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f274125c;

    /* renamed from: d, reason: collision with root package name */
    public static final BookingFlowSource f274126d;

    /* renamed from: e, reason: collision with root package name */
    public static final BookingFlowSource f274127e;

    /* renamed from: f, reason: collision with root package name */
    public static final BookingFlowSource f274128f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ BookingFlowSource[] f274129g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f274130h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f274131b;

    /* compiled from: BookingFlowSource.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking/BookingFlowSource$a;", "", "<init>", "()V", "_avito_service-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        BookingFlowSource bookingFlowSource = new BookingFlowSource("EDIT_FROM_CHAT", 0, "chat");
        f274126d = bookingFlowSource;
        BookingFlowSource bookingFlowSource2 = new BookingFlowSource(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1, "unknown");
        f274127e = bookingFlowSource2;
        BookingFlowSource bookingFlowSource3 = new BookingFlowSource("NONE", 2, "none");
        f274128f = bookingFlowSource3;
        BookingFlowSource[] bookingFlowSourceArr = {bookingFlowSource, bookingFlowSource2, bookingFlowSource3};
        f274129g = bookingFlowSourceArr;
        f274130h = c.a(bookingFlowSourceArr);
        f274125c = new a(null);
    }

    public BookingFlowSource(String str, int i12, String str2) {
        this.f274131b = str2;
    }

    public static BookingFlowSource valueOf(String str) {
        return (BookingFlowSource) Enum.valueOf(BookingFlowSource.class, str);
    }

    public static BookingFlowSource[] values() {
        return (BookingFlowSource[]) f274129g.clone();
    }
}
