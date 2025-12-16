package Bh;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import wZ.C49582f;
import wZ.j;

/* compiled from: BblConfigureV4State.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LBh/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "f", "g", "h", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bh.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C13148c extends q {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final e f1598j = new e(null);

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final C13148c f1599k = new C13148c(false, true, null, null, null, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1600b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1601c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f1602d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final j f1603e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final wZ.g f1604f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f1605g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final List<a> f1606h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final C49582f f1607i;

    /* compiled from: BblConfigureV4State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBh/c$a;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.c$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C0068c f1608a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f1609b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f1610c;

        /* renamed from: d, reason: collision with root package name */
        public final long f1611d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f1612e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f1613f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f1614g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final b f1615h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final wZ.l f1616i;

        /* renamed from: j, reason: collision with root package name */
        @l
        public final String f1617j;

        public a(@k C0068c c0068c, @k String str, @l String str2, long j12, boolean z12, @k String str3, @k String str4, @l b bVar, @k wZ.l lVar, @l String str5) {
            this.f1608a = c0068c;
            this.f1609b = str;
            this.f1610c = str2;
            this.f1611d = j12;
            this.f1612e = z12;
            this.f1613f = str3;
            this.f1614g = str4;
            this.f1615h = bVar;
            this.f1616i = lVar;
            this.f1617j = str5;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f1608a, aVar.f1608a) && L.f(this.f1609b, aVar.f1609b) && L.f(this.f1610c, aVar.f1610c) && this.f1611d == aVar.f1611d && this.f1612e == aVar.f1612e && L.f(this.f1613f, aVar.f1613f) && L.f(this.f1614g, aVar.f1614g) && L.f(this.f1615h, aVar.f1615h) && L.f(this.f1616i, aVar.f1616i) && L.f(this.f1617j, aVar.f1617j);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f1608a.hashCode() * 31, 31, this.f1609b);
            String str = this.f1610c;
            int iD3 = H.d(H.d(r.i(r.g((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f1611d), 31, this.f1612e), 31, this.f1613f), 31, this.f1614g);
            b bVar = this.f1615h;
            int iHashCode = (this.f1616i.hashCode() + ((iD3 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31;
            String str2 = this.f1617j;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BblConfigureConfigs(bblDelta=");
            sb2.append(this.f1608a);
            sb2.append(", daysTitle=");
            sb2.append(this.f1609b);
            sb2.append(", discountPricePercentage=");
            sb2.append(this.f1610c);
            sb2.append(", id=");
            sb2.append(this.f1611d);
            sb2.append(", isSelected=");
            sb2.append(this.f1612e);
            sb2.append(", limitContactsTitle=");
            sb2.append(this.f1613f);
            sb2.append(", priceTitle=");
            sb2.append(this.f1614g);
            sb2.append(", promoteBadge=");
            sb2.append(this.f1615h);
            sb2.append(", universalImage=");
            sb2.append(this.f1616i);
            sb2.append(", withoutDiscountPriceTitle=");
            return C22026a.c(sb2, this.f1617j, ')');
        }
    }

    /* compiled from: BblConfigureV4State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBh/c$b;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.c$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final wZ.l f1618a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f1619b;

        public b(@k wZ.l lVar, @k String str) {
            this.f1618a = lVar;
            this.f1619b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f1618a, bVar.f1618a) && L.f(this.f1619b, bVar.f1619b);
        }

        public final int hashCode() {
            return this.f1619b.hashCode() + (this.f1618a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BblConfigureConfigsPromoteBadge(image=");
            sb2.append(this.f1618a);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f1619b, ')');
        }
    }

    /* compiled from: BblConfigureV4State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBh/c$c;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0068c {

        /* renamed from: a, reason: collision with root package name */
        public final long f1620a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f1621b;

        /* renamed from: c, reason: collision with root package name */
        public final double f1622c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final wZ.k f1623d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AttributedText f1624e;

        public C0068c(long j12, @l String str, double d12, @l wZ.k kVar, @l AttributedText attributedText) {
            this.f1620a = j12;
            this.f1621b = str;
            this.f1622c = d12;
            this.f1623d = kVar;
            this.f1624e = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0068c)) {
                return false;
            }
            C0068c c0068c = (C0068c) obj;
            return this.f1620a == c0068c.f1620a && L.f(this.f1621b, c0068c.f1621b) && Double.compare(this.f1622c, c0068c.f1622c) == 0 && L.f(this.f1623d, c0068c.f1623d) && L.f(this.f1624e, c0068c.f1624e);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f1620a) * 31;
            String str = this.f1621b;
            int iD2 = androidx.compose.ui.graphics.colorspace.e.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f1622c);
            wZ.k kVar = this.f1623d;
            int iHashCode2 = (iD2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            AttributedText attributedText = this.f1624e;
            return iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BblDelta(count=");
            sb2.append(this.f1620a);
            sb2.append(", icon=");
            sb2.append(this.f1621b);
            sb2.append(", progress=");
            sb2.append(this.f1622c);
            sb2.append(", progressColor=");
            sb2.append(this.f1623d);
            sb2.append(", text=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f1624e, ')');
        }
    }

    /* compiled from: BblConfigureV4State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBh/c$d;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.c$d */
    public static final /* data */ class d {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return L.f(null, null) && L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ButtonNullable(style=null, title=null, uri=null)";
        }
    }

    /* compiled from: BblConfigureV4State.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBh/c$e;", "", "<init>", "()V", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.c$e */
    public static final class e {
        public /* synthetic */ e(C42822w c42822w) {
            this();
        }

        public e() {
        }
    }

    /* compiled from: BblConfigureV4State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBh/c$f;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.c$f */
    public static final /* data */ class f {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return L.f(null, null) && L.f(null, null) && L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "Footer(button=null, contacts=null, secondButton=null, terms=null)";
        }
    }

    /* compiled from: BblConfigureV4State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBh/c$g;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.c$g */
    public static final /* data */ class g {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return L.f(null, null) && L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "FooterButton(style=null, title=null, uri=null)";
        }
    }

    /* compiled from: BblConfigureV4State.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBh/c$h;", "", "_avito_bbl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bh.c$h */
    public static final /* data */ class h {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            ((h) obj).getClass();
            return L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "FooterContacts(current=null, text=null)";
        }
    }

    public C13148c(boolean z12, boolean z13, @l String str, @l j jVar, @l wZ.g gVar, @l AttributedText attributedText, @l List<a> list, @l C49582f c49582f) {
        this.f1600b = z12;
        this.f1601c = z13;
        this.f1602d = str;
        this.f1603e = jVar;
        this.f1604f = gVar;
        this.f1605g = attributedText;
        this.f1606h = list;
        this.f1607i = c49582f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C13148c a(C13148c c13148c, boolean z12, boolean z13, String str, wZ.g gVar, ArrayList arrayList, int i12) {
        if ((i12 & 1) != 0) {
            z12 = c13148c.f1600b;
        }
        boolean z14 = z12;
        if ((i12 & 2) != 0) {
            z13 = c13148c.f1601c;
        }
        boolean z15 = z13;
        if ((i12 & 4) != 0) {
            str = c13148c.f1602d;
        }
        String str2 = str;
        j jVar = c13148c.f1603e;
        if ((i12 & 16) != 0) {
            gVar = c13148c.f1604f;
        }
        wZ.g gVar2 = gVar;
        AttributedText attributedText = c13148c.f1605g;
        List list = arrayList;
        if ((i12 & 64) != 0) {
            list = c13148c.f1606h;
        }
        C49582f c49582f = c13148c.f1607i;
        c13148c.getClass();
        return new C13148c(z14, z15, str2, jVar, gVar2, attributedText, list, c49582f);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13148c)) {
            return false;
        }
        C13148c c13148c = (C13148c) obj;
        return this.f1600b == c13148c.f1600b && this.f1601c == c13148c.f1601c && L.f(this.f1602d, c13148c.f1602d) && L.f(this.f1603e, c13148c.f1603e) && L.f(this.f1604f, c13148c.f1604f) && L.f(this.f1605g, c13148c.f1605g) && L.f(this.f1606h, c13148c.f1606h) && L.f(this.f1607i, c13148c.f1607i);
    }

    public final int hashCode() {
        int i12 = r.i(Boolean.hashCode(this.f1600b) * 31, 31, this.f1601c);
        String str = this.f1602d;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        j jVar = this.f1603e;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        wZ.g gVar = this.f1604f;
        int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        AttributedText attributedText = this.f1605g;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        List<a> list = this.f1606h;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        C49582f c49582f = this.f1607i;
        return iHashCode5 + (c49582f != null ? c49582f.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "BblConfigureV4State(isPostLoading=" + this.f1600b + ", isLoading=" + this.f1601c + ", error=" + this.f1602d + ", navBar=" + this.f1603e + ", footer=" + this.f1604f + ", title=" + this.f1605g + ", bblConfigureConfigs=" + this.f1606h + ", initialContact=" + this.f1607i + ')';
    }
}
