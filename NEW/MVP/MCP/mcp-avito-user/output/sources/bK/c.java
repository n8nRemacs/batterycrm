package Bk;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.btob_business_trip.models.SelectItemInfo;
import com.avito.android.btob_business_trip.models.SelectItemsInfo;
import com.avito.android.btob_business_trip.models.SuccessScreenInfo;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripSelectState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LBk/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class c extends q {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f1651h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final c f1652i = new c(b.a.f1659a, null, C42784z0.f406748b, false, false, null, 32, null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f1653b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final SelectItemsInfo f1654c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Long> f1655d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1656e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1657f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final SuccessScreenInfo f1658g;

    /* compiled from: B2bBusinessTripSelectState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBk/c$a;", "", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ c(b bVar, SelectItemsInfo selectItemsInfo, List list, boolean z12, boolean z13, SuccessScreenInfo successScreenInfo, int i12, C42822w c42822w) {
        this(bVar, selectItemsInfo, list, z12, z13, (i12 & 32) != 0 ? null : successScreenInfo);
    }

    public static c a(c cVar, b bVar, SelectItemsInfo selectItemsInfo, List list, boolean z12, SuccessScreenInfo successScreenInfo, int i12) {
        if ((i12 & 1) != 0) {
            bVar = cVar.f1653b;
        }
        b bVar2 = bVar;
        if ((i12 & 2) != 0) {
            selectItemsInfo = cVar.f1654c;
        }
        SelectItemsInfo selectItemsInfo2 = selectItemsInfo;
        if ((i12 & 4) != 0) {
            list = cVar.f1655d;
        }
        List list2 = list;
        boolean z13 = (i12 & 8) != 0 ? cVar.f1656e : false;
        if ((i12 & 16) != 0) {
            z12 = cVar.f1657f;
        }
        boolean z14 = z12;
        if ((i12 & 32) != 0) {
            successScreenInfo = cVar.f1658g;
        }
        cVar.getClass();
        return new c(bVar2, selectItemsInfo2, list2, z13, z14, successScreenInfo);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f1653b, cVar.f1653b) && L.f(this.f1654c, cVar.f1654c) && L.f(this.f1655d, cVar.f1655d) && this.f1656e == cVar.f1656e && this.f1657f == cVar.f1657f && L.f(this.f1658g, cVar.f1658g);
    }

    public final int hashCode() {
        int iHashCode = this.f1653b.hashCode() * 31;
        SelectItemsInfo selectItemsInfo = this.f1654c;
        int i12 = r.i(r.i(H.e((iHashCode + (selectItemsInfo == null ? 0 : selectItemsInfo.hashCode())) * 31, 31, this.f1655d), 31, this.f1656e), 31, this.f1657f);
        SuccessScreenInfo successScreenInfo = this.f1658g;
        return i12 + (successScreenInfo != null ? successScreenInfo.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "B2bBusinessTripSelectState(viewState=" + this.f1653b + ", selectInfo=" + this.f1654c + ", chosenItems=" + this.f1655d + ", showSuccessScreen=" + this.f1656e + ", isLoading=" + this.f1657f + ", successScreenInfo=" + this.f1658g + ')';
    }

    public c(@k b bVar, @l SelectItemsInfo selectItemsInfo, @k List<Long> list, boolean z12, boolean z13, @l SuccessScreenInfo successScreenInfo) {
        this.f1653b = bVar;
        this.f1654c = selectItemsInfo;
        this.f1655d = list;
        this.f1656e = z12;
        this.f1657f = z13;
        this.f1658g = successScreenInfo;
    }

    /* compiled from: B2bBusinessTripSelectState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LBk/c$b;", "", "a", "b", "LBk/c$b$a;", "LBk/c$b$b;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: B2bBusinessTripSelectState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBk/c$b$a;", "LBk/c$b;", "<init>", "()V", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final a f1659a = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 2038574328;
            }

            @k
            public final String toString() {
                return "Init";
            }
        }

        /* compiled from: B2bBusinessTripSelectState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBk/c$b$b;", "LBk/c$b;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Bk.c$b$b, reason: collision with other inner class name */
        public static final /* data */ class C0071b implements b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final String f1660a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f1661b;

            /* renamed from: c, reason: collision with root package name */
            @k
            public final String f1662c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final List<SelectItemInfo> f1663d;

            /* renamed from: e, reason: collision with root package name */
            @k
            public final AttributedText f1664e;

            /* renamed from: f, reason: collision with root package name */
            @k
            public final List<Long> f1665f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f1666g;

            public C0071b(@k String str, @k String str2, @k String str3, @k List<SelectItemInfo> list, @k AttributedText attributedText, @k List<Long> list2, boolean z12) {
                this.f1660a = str;
                this.f1661b = str2;
                this.f1662c = str3;
                this.f1663d = list;
                this.f1664e = attributedText;
                this.f1665f = list2;
                this.f1666g = z12;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0071b)) {
                    return false;
                }
                C0071b c0071b = (C0071b) obj;
                return L.f(this.f1660a, c0071b.f1660a) && L.f(this.f1661b, c0071b.f1661b) && L.f(this.f1662c, c0071b.f1662c) && L.f(this.f1663d, c0071b.f1663d) && L.f(this.f1664e, c0071b.f1664e) && L.f(this.f1665f, c0071b.f1665f) && this.f1666g == c0071b.f1666g;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f1666g) + H.e(com.avito.android.actions_sheet.a.b(H.e(H.d(H.d(this.f1660a.hashCode() * 31, 31, this.f1661b), 31, this.f1662c), 31, this.f1663d), 31, this.f1664e), 31, this.f1665f);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SelectItemsContent(title=");
                sb2.append(this.f1660a);
                sb2.append(", subtitle=");
                sb2.append(this.f1661b);
                sb2.append(", buttonTitle=");
                sb2.append(this.f1662c);
                sb2.append(", itemsForSelect=");
                sb2.append(this.f1663d);
                sb2.append(", hint=");
                sb2.append(this.f1664e);
                sb2.append(", chosenItems=");
                sb2.append(this.f1665f);
                sb2.append(", continueButtonLoading=");
                return r.x(sb2, this.f1666g, ')');
            }

            public /* synthetic */ C0071b(String str, String str2, String str3, List list, AttributedText attributedText, List list2, boolean z12, int i12, C42822w c42822w) {
                this(str, str2, str3, list, attributedText, list2, (i12 & 64) != 0 ? false : z12);
            }
        }
    }
}
