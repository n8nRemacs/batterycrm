package Iy0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.str_calendar.common.models.DateRange;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SellerCalendarInfo.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LIy0/c;", "", "a", "b", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Object f8654a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Object f8655b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f8656c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f8657d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Object f8658e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f8659f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f8660g;

    /* compiled from: SellerCalendarInfo.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIy0/c$a;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f8661a;

        public a(@k String str) {
            this.f8661a = str;
        }
    }

    /* compiled from: SellerCalendarInfo.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIy0/c$b;", "", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f8662a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8663b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f8664c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f8665d;

        public b(@k Date date, boolean z12, @l String str, boolean z13) {
            this.f8662a = date;
            this.f8663b = z12;
            this.f8664c = str;
            this.f8665d = z13;
        }
    }

    public c(@k List<DateRange> list, @k List<DateRange> list2, @k List<DateRange> list3, @k a aVar, @k List<b> list4, @l String str, @l DeepLink deepLink) {
        this.f8654a = list;
        this.f8655b = list2;
        this.f8656c = list3;
        this.f8657d = aVar;
        this.f8658e = list4;
        this.f8659f = str;
        this.f8660g = deepLink;
    }
}
