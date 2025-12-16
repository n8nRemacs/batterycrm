package gn;

import Y61.k;
import Y61.l;
import an.C19912a;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CartSheetAfterAddingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lgn/d;", "", "a", "b", "c", "d", "e", "f", "g", "Lgn/d$a;", "Lgn/d$b;", "Lgn/d$c;", "Lgn/d$d;", "Lgn/d$e;", "Lgn/d$f;", "Lgn/d$g;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d {

    /* compiled from: CartSheetAfterAddingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgn/d$a;", "Lgn/d;", "<init>", "()V", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396804a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 252470370;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: CartSheetAfterAddingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/d$b;", "Lgn/d;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LinkedHashMap f396805a;

        public b(@k LinkedHashMap linkedHashMap) {
            this.f396805a = linkedHashMap;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f396805a.equals(((b) obj).f396805a);
        }

        public final int hashCode() {
            return this.f396805a.hashCode();
        }

        @k
        public final String toString() {
            return org.webrtc.h.e(new StringBuilder("InitializeStocks(stocks="), this.f396805a, ')');
        }
    }

    /* compiled from: CartSheetAfterAddingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/d$d;", "Lgn/d;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gn.d$d, reason: collision with other inner class name */
    public static final /* data */ class C11228d implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f396809a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f396810b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Map<String, Object> f396811c;

        public C11228d() {
            throw null;
        }

        public C11228d(DeepLink deepLink, String str, Map map, int i12, C42822w c42822w) {
            str = (i12 & 2) != 0 ? null : str;
            map = (i12 & 4) != 0 ? null : map;
            this.f396809a = deepLink;
            this.f396810b = str;
            this.f396811c = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11228d)) {
                return false;
            }
            C11228d c11228d = (C11228d) obj;
            return L.f(this.f396809a, c11228d.f396809a) && L.f(this.f396810b, c11228d.f396810b) && L.f(this.f396811c, c11228d.f396811c);
        }

        public final int hashCode() {
            int iHashCode = this.f396809a.hashCode() * 31;
            String str = this.f396810b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, Object> map = this.f396811c;
            return iHashCode2 + (map != null ? map.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f396809a);
            sb2.append(", requestKey=");
            sb2.append(this.f396810b);
            sb2.append(", args=");
            return r.w(sb2, this.f396811c, ')');
        }
    }

    /* compiled from: CartSheetAfterAddingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/d$e;", "Lgn/d;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Map<String, Object> f396812a;

        public e(@l Map<String, ? extends Object> map) {
            this.f396812a = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f396812a, ((e) obj).f396812a);
        }

        public final int hashCode() {
            Map<String, Object> map = this.f396812a;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @k
        public final String toString() {
            return r.w(new StringBuilder("SetAnalyticsData(data="), this.f396812a, ')');
        }
    }

    /* compiled from: CartSheetAfterAddingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/d$g;", "Lgn/d;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f396816a;

        public g(@k PrintableText printableText) {
            this.f396816a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f396816a, ((g) obj).f396816a);
        }

        public final int hashCode() {
            return this.f396816a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("UpdateScreenTitle(title="), this.f396816a, ')');
        }
    }

    /* compiled from: CartSheetAfterAddingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/d$c;", "Lgn/d;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396806a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f396807b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final C19912a f396808c;

        public c(@k String str, @l String str2, @l C19912a c19912a) {
            this.f396806a = str;
            this.f396807b = str2;
            this.f396808c = c19912a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f396806a, cVar.f396806a) && L.f(this.f396807b, cVar.f396807b) && L.f(this.f396808c, cVar.f396808c);
        }

        public final int hashCode() {
            int iHashCode = this.f396806a.hashCode() * 31;
            String str = this.f396807b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            C19912a c19912a = this.f396808c;
            return iHashCode2 + (c19912a != null ? c19912a.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "OpenAdvertDetails(itemId=" + this.f396806a + ", searchContext=" + this.f396807b + ", args=" + this.f396808c + ')';
        }

        public /* synthetic */ c(String str, String str2, C19912a c19912a, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : c19912a);
        }
    }

    /* compiled from: CartSheetAfterAddingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgn/d$f;", "Lgn/d;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f396813a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f396814b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f396815c;

        public f(@k PrintableText printableText, @k Throwable th2, boolean z12) {
            this.f396813a = th2;
            this.f396814b = printableText;
            this.f396815c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f396813a, fVar.f396813a) && L.f(this.f396814b, fVar.f396814b) && this.f396815c == fVar.f396815c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f396815c) + com.avito.android.actions_sheet.a.f(this.f396814b, this.f396813a.hashCode() * 31, 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(cause=");
            sb2.append(this.f396813a);
            sb2.append(", message=");
            sb2.append(this.f396814b);
            sb2.append(", performHapticFeedback=");
            return r.x(sb2, this.f396815c, ')');
        }

        public /* synthetic */ f(Throwable th2, PrintableText printableText, boolean z12, int i12, C42822w c42822w) {
            this(printableText, th2, (i12 & 4) != 0 ? false : z12);
        }
    }
}
