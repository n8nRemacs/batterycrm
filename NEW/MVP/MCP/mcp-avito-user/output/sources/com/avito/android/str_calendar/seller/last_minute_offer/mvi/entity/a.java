package com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity;

import Ky0.C14362a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LastMinuteOfferState.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/a;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/a$a;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/a$b;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/a$c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a {

    /* compiled from: LastMinuteOfferState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/a$a;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/a;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.str_calendar.seller.last_minute_offer.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8652a extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UniversalImage f287951a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f287952b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f287953c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final C14362a f287954d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f287955e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f287956f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f287957g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f287958h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final String f287959i;

        public C8652a(@k UniversalImage universalImage, @k String str, @k String str2, @k C14362a c14362a, @k String str3, boolean z12, boolean z13, boolean z14, @k String str4) {
            super(null);
            this.f287951a = universalImage;
            this.f287952b = str;
            this.f287953c = str2;
            this.f287954d = c14362a;
            this.f287955e = str3;
            this.f287956f = z12;
            this.f287957g = z13;
            this.f287958h = z14;
            this.f287959i = str4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8652a)) {
                return false;
            }
            C8652a c8652a = (C8652a) obj;
            return L.f(this.f287951a, c8652a.f287951a) && L.f(this.f287952b, c8652a.f287952b) && L.f(this.f287953c, c8652a.f287953c) && L.f(this.f287954d, c8652a.f287954d) && L.f(this.f287955e, c8652a.f287955e) && this.f287956f == c8652a.f287956f && this.f287957g == c8652a.f287957g && this.f287958h == c8652a.f287958h && L.f(this.f287959i, c8652a.f287959i);
        }

        public final int hashCode() {
            return this.f287959i.hashCode() + r.i(r.i(r.i(H.d((this.f287954d.hashCode() + H.d(H.d(this.f287951a.hashCode() * 31, 31, this.f287952b), 31, this.f287953c)) * 31, 31, this.f287955e), 31, this.f287956f), 31, this.f287957g), 31, this.f287958h);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(image=");
            sb2.append(this.f287951a);
            sb2.append(", title=");
            sb2.append(this.f287952b);
            sb2.append(", description=");
            sb2.append(this.f287953c);
            sb2.append(", discount=");
            sb2.append(this.f287954d);
            sb2.append(", buttonText=");
            sb2.append(this.f287955e);
            sb2.append(", isSaveButtonEnabled=");
            sb2.append(this.f287956f);
            sb2.append(", isSaveButtonVisible=");
            sb2.append(this.f287957g);
            sb2.append(", isInputErrorVisible=");
            sb2.append(this.f287958h);
            sb2.append(", inputErrorText=");
            return C22026a.c(sb2, this.f287959i, ')');
        }
    }

    /* compiled from: LastMinuteOfferState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/a$b;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f287960a = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: LastMinuteOfferState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/a$c;", "Lcom/avito/android/str_calendar/seller/last_minute_offer/mvi/entity/a;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f287961a = new c();

        public c() {
            super(null);
        }
    }

    public /* synthetic */ a(C42822w c42822w) {
        this();
    }

    public a() {
    }
}
