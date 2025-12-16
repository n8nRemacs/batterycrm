package Jy0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LJy0/c;", "", "a", "b", "c", "d", "LJy0/c$a;", "LJy0/c$b;", "LJy0/c$c;", "LJy0/c$d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jy0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC14263c {

    /* compiled from: StrSellerCalendarOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJy0/c$a;", "LJy0/c;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jy0.c$a */
    public static final /* data */ class a implements InterfaceC14263c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f9195a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1596937722;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrSellerCalendarOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJy0/c$b;", "LJy0/c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jy0.c$b */
    public static final /* data */ class b implements InterfaceC14263c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f9196a;

        public b(@k DeepLink deepLink) {
            this.f9196a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f9196a, ((b) obj).f9196a);
        }

        public final int hashCode() {
            return this.f9196a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f9196a, ')');
        }
    }

    /* compiled from: StrSellerCalendarOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJy0/c$c;", "LJy0/c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jy0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0548c implements InterfaceC14263c {

        /* renamed from: a, reason: collision with root package name */
        public final int f9197a;

        public C0548c(int i12) {
            this.f9197a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0548c) && this.f9197a == ((C0548c) obj).f9197a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f9197a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f9197a, ')');
        }
    }

    /* compiled from: StrSellerCalendarOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJy0/c$d;", "LJy0/c;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jy0.c$d */
    public static final /* data */ class d implements InterfaceC14263c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9198a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Date f9199b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Date f9200c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f9201d;

        public d(@k String str, @l Date date, @l Date date2, boolean z12) {
            this.f9198a = str;
            this.f9199b = date;
            this.f9200c = date2;
            this.f9201d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f9198a, dVar.f9198a) && L.f(this.f9199b, dVar.f9199b) && L.f(this.f9200c, dVar.f9200c) && this.f9201d == dVar.f9201d;
        }

        public final int hashCode() {
            int iHashCode = this.f9198a.hashCode() * 31;
            Date date = this.f9199b;
            int iHashCode2 = (iHashCode + (date == null ? 0 : date.hashCode())) * 31;
            Date date2 = this.f9200c;
            return Boolean.hashCode(this.f9201d) + ((iHashCode2 + (date2 != null ? date2.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowCalendarParameters(advertId=");
            sb2.append(this.f9198a);
            sb2.append(", startDate=");
            sb2.append(this.f9199b);
            sb2.append(", endDate=");
            sb2.append(this.f9200c);
            sb2.append(", shouldCloseFlowAfterApply=");
            return r.x(sb2, this.f9201d, ')');
        }
    }
}
