package Oq0;

import Oq0.b;
import Oq0.c;
import Sq0.C15214a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.R;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.printable_text.PrintableText;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SellerPromotionsState.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018Bk\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"LOq0/g;", "Lcom/avito/android/analytics/screens/mvi/q;", "", "xHash", "Lcom/avito/android/printable_text/PrintableText;", "title", "LOq0/b;", "loadingState", "", "itemsOffset", "LOq0/c;", "paginationState", "LSq0/a;", "discountPercents", "LOq0/g$b;", "contentPlaceholderData", "Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;", "cartIconState", "", "Lcom/avito/android/seller_promotions/konveyor/c;", "mainItems", "<init>", "(Ljava/lang/String;Lcom/avito/android/printable_text/PrintableText;LOq0/b;JLOq0/c;ILOq0/g$b;Lcom/avito/android/lib/beduin_v2/repository/cart_total_quantity/n;Ljava/util/List;Lkotlin/jvm/internal/w;)V", "a", "b", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class g extends q {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f12614k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final g f12615l = new g(null, null, null, 0, null, 0, null, null, null, 511, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f12616b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f12617c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Oq0.b f12618d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12619e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final c f12620f;

    /* renamed from: g, reason: collision with root package name */
    public final int f12621g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final b f12622h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC31171n f12623i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final List<com.avito.android.seller_promotions.konveyor.c> f12624j;

    /* compiled from: SellerPromotionsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOq0/g$a;", "", "<init>", "()V", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SellerPromotionsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOq0/g$b;", "", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f12625a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f12626b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f12627c;

        public b(PrintableText printableText, PrintableText printableText2, PrintableText printableText3, int i12, C42822w c42822w) {
            printableText2 = (i12 & 2) != 0 ? null : printableText2;
            printableText3 = (i12 & 4) != 0 ? com.avito.android.printable_text.b.c(R.string.seller_promotions_refresh, new Serializable[0]) : printableText3;
            this.f12625a = printableText;
            this.f12626b = printableText2;
            this.f12627c = printableText3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f12625a, bVar.f12625a) && L.f(this.f12626b, bVar.f12626b) && L.f(this.f12627c, bVar.f12627c);
        }

        public final int hashCode() {
            int iHashCode = this.f12625a.hashCode() * 31;
            PrintableText printableText = this.f12626b;
            return this.f12627c.hashCode() + ((iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentPlaceholderData(title=");
            sb2.append(this.f12625a);
            sb2.append(", subtitle=");
            sb2.append(this.f12626b);
            sb2.append(", buttonTitle=");
            return AK.c.m(sb2, this.f12627c, ')');
        }
    }

    public g() {
        throw null;
    }

    public g(String str, PrintableText printableText, Oq0.b bVar, long j12, c cVar, int i12, b bVar2, InterfaceC31171n interfaceC31171n, List list, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? com.avito.android.printable_text.b.f("") : printableText, (i13 & 4) != 0 ? b.C0809b.f12565a : bVar, (i13 & 8) != 0 ? 0L : j12, (i13 & 16) != 0 ? new c.b(false) : cVar, (i13 & 32) == 0 ? i12 : 0, (i13 & 64) == 0 ? bVar2 : null, (i13 & 128) != 0 ? InterfaceC31171n.c.f176508a : interfaceC31171n, (i13 & 256) != 0 ? C42784z0.f406748b : list, null);
    }

    public static g a(g gVar, String str, PrintableText printableText, Oq0.b bVar, long j12, c cVar, int i12, b bVar2, InterfaceC31171n interfaceC31171n, ArrayList arrayList, int i13) {
        String str2 = (i13 & 1) != 0 ? gVar.f12616b : str;
        PrintableText printableText2 = (i13 & 2) != 0 ? gVar.f12617c : printableText;
        Oq0.b bVar3 = (i13 & 4) != 0 ? gVar.f12618d : bVar;
        long j13 = (i13 & 8) != 0 ? gVar.f12619e : j12;
        c cVar2 = (i13 & 16) != 0 ? gVar.f12620f : cVar;
        int i14 = (i13 & 32) != 0 ? gVar.f12621g : i12;
        b bVar4 = (i13 & 64) != 0 ? gVar.f12622h : bVar2;
        InterfaceC31171n interfaceC31171n2 = (i13 & 128) != 0 ? gVar.f12623i : interfaceC31171n;
        List<com.avito.android.seller_promotions.konveyor.c> list = (i13 & 256) != 0 ? gVar.f12624j : arrayList;
        gVar.getClass();
        return new g(str2, printableText2, bVar3, j13, cVar2, i14, bVar4, interfaceC31171n2, list, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f12616b, gVar.f12616b) && L.f(this.f12617c, gVar.f12617c) && L.f(this.f12618d, gVar.f12618d) && this.f12619e == gVar.f12619e && L.f(this.f12620f, gVar.f12620f) && this.f12621g == gVar.f12621g && L.f(this.f12622h, gVar.f12622h) && L.f(this.f12623i, gVar.f12623i) && L.f(this.f12624j, gVar.f12624j);
    }

    public final int hashCode() {
        String str = this.f12616b;
        int iE2 = r.e(this.f12621g, (this.f12620f.hashCode() + r.g((this.f12618d.hashCode() + com.avito.android.actions_sheet.a.f(this.f12617c, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31, 31, this.f12619e)) * 31, 31);
        b bVar = this.f12622h;
        return this.f12624j.hashCode() + ((this.f12623i.hashCode() + ((iE2 + (bVar != null ? bVar.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerPromotionsState(xHash=");
        sb2.append(this.f12616b);
        sb2.append(", title=");
        sb2.append(this.f12617c);
        sb2.append(", loadingState=");
        sb2.append(this.f12618d);
        sb2.append(", itemsOffset=");
        sb2.append(this.f12619e);
        sb2.append(", paginationState=");
        sb2.append(this.f12620f);
        sb2.append(", discountPercents=");
        sb2.append((Object) C15214a.b(this.f12621g));
        sb2.append(", contentPlaceholderData=");
        sb2.append(this.f12622h);
        sb2.append(", cartIconState=");
        sb2.append(this.f12623i);
        sb2.append(", mainItems=");
        return H.p(sb2, this.f12624j, ')');
    }

    public g(String str, PrintableText printableText, Oq0.b bVar, long j12, c cVar, int i12, b bVar2, InterfaceC31171n interfaceC31171n, List list, C42822w c42822w) {
        this.f12616b = str;
        this.f12617c = printableText;
        this.f12618d = bVar;
        this.f12619e = j12;
        this.f12620f = cVar;
        this.f12621g = i12;
        this.f12622h = bVar2;
        this.f12623i = interfaceC31171n;
        this.f12624j = list;
    }
}
