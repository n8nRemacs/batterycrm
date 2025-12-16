package Bf;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.foundation.H;
import com.avito.android.autoteka.domain.AutotekaItems;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReportItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LBf/a;", "Lcom/avito/conveyor_item/a;", "a", "b", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Bf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C13142a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f1579b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f1580c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final C0064a f1581d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final b f1582e;

    /* compiled from: ReportItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBf/a$a;", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bf.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0064a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f1583a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f1584b;

        public C0064a(@k String str, @k Uri uri) {
            this.f1583a = str;
            this.f1584b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0064a)) {
                return false;
            }
            C0064a c0064a = (C0064a) obj;
            return L.f(this.f1583a, c0064a.f1583a) && L.f(this.f1584b, c0064a.f1584b);
        }

        public final int hashCode() {
            return this.f1584b.hashCode() + (this.f1583a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Link(title=");
            sb2.append(this.f1583a);
            sb2.append(", url=");
            return com.avito.android.actions_sheet.a.t(sb2, this.f1584b, ')');
        }
    }

    /* compiled from: ReportItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBf/a$b;", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bf.a$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f1585a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f1586b;

        public b(@k String str, @k Uri uri) {
            this.f1585a = str;
            this.f1586b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f1585a, bVar.f1585a) && L.f(this.f1586b, bVar.f1586b);
        }

        public final int hashCode() {
            return this.f1586b.hashCode() + (this.f1585a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PdfDownload(fileName=");
            sb2.append(this.f1585a);
            sb2.append(", url=");
            return com.avito.android.actions_sheet.a.t(sb2, this.f1586b, ')');
        }
    }

    public C13142a(String str, String str2, C0064a c0064a, b bVar, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_REPORT";
        }
        this.f1579b = str;
        this.f1580c = str2;
        this.f1581d = c0064a;
        this.f1582e = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13142a)) {
            return false;
        }
        C13142a c13142a = (C13142a) obj;
        return L.f(this.f1579b, c13142a.f1579b) && L.f(this.f1580c, c13142a.f1580c) && L.f(this.f1581d, c13142a.f1581d) && L.f(this.f1582e, c13142a.f1582e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF182874b() {
        return getF440966b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF440966b() {
        return this.f1579b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f1579b.hashCode() * 31, 31, this.f1580c);
        C0064a c0064a = this.f1581d;
        int iHashCode = (iD2 + (c0064a == null ? 0 : c0064a.hashCode())) * 31;
        b bVar = this.f1582e;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ReportItem(stringId=" + this.f1579b + ", url=" + this.f1580c + ", sharingLink=" + this.f1581d + ", pdfDownload=" + this.f1582e + ')';
    }
}
