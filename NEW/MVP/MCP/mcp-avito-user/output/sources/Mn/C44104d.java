package mn;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.R;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.beduin_v2.repository.cart_total_quantity.InterfaceC31171n;
import com.avito.android.printable_text.PrintableText;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import mn.InterfaceC44106f;
import mn.InterfaceC44107g;

/* compiled from: CartSimilarItemsState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lmn/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mn.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C44104d extends q {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f414704l = new a(null);

    /* renamed from: m, reason: collision with root package name */
    @k
    public static final C44104d f414705m = new C44104d(null, null, null, null, null, null, null, null, null, null, 1023, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f414706b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f414707c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC44106f f414708d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC44107g f414709e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final b f414710f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC31171n f414711g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f414712h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<AbstractC40112a<BeduinModel, InterfaceC40116e>> f414713i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final List<com.avito.android.cart_similar_items.konveyor.c> f414714j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f414715k;

    /* compiled from: CartSimilarItemsState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmn/d$a;", "", "<init>", "()V", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CartSimilarItemsState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmn/d$b;", "", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mn.d$b */
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f414716a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PrintableText f414717b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final PrintableText f414718c;

        public b(PrintableText printableText, PrintableText printableText2, PrintableText printableText3, int i12, C42822w c42822w) {
            printableText2 = (i12 & 2) != 0 ? null : printableText2;
            printableText3 = (i12 & 4) != 0 ? com.avito.android.printable_text.b.c(R.string.cart_similar_items_refresh, new Serializable[0]) : printableText3;
            this.f414716a = printableText;
            this.f414717b = printableText2;
            this.f414718c = printableText3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f414716a, bVar.f414716a) && L.f(this.f414717b, bVar.f414717b) && L.f(this.f414718c, bVar.f414718c);
        }

        public final int hashCode() {
            int iHashCode = this.f414716a.hashCode() * 31;
            PrintableText printableText = this.f414717b;
            return this.f414718c.hashCode() + ((iHashCode + (printableText == null ? 0 : printableText.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentPlaceholderData(title=");
            sb2.append(this.f414716a);
            sb2.append(", subtitle=");
            sb2.append(this.f414717b);
            sb2.append(", buttonTitle=");
            return AK.c.m(sb2, this.f414718c, ')');
        }
    }

    public C44104d() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static C44104d a(C44104d c44104d, String str, PrintableText printableText, InterfaceC44106f interfaceC44106f, InterfaceC44107g interfaceC44107g, b bVar, InterfaceC31171n interfaceC31171n, String str2, List list, ArrayList arrayList, String str3, int i12) {
        String str4 = (i12 & 1) != 0 ? c44104d.f414706b : str;
        PrintableText printableText2 = (i12 & 2) != 0 ? c44104d.f414707c : printableText;
        InterfaceC44106f interfaceC44106f2 = (i12 & 4) != 0 ? c44104d.f414708d : interfaceC44106f;
        InterfaceC44107g interfaceC44107g2 = (i12 & 8) != 0 ? c44104d.f414709e : interfaceC44107g;
        b bVar2 = (i12 & 16) != 0 ? c44104d.f414710f : bVar;
        InterfaceC31171n interfaceC31171n2 = (i12 & 32) != 0 ? c44104d.f414711g : interfaceC31171n;
        String str5 = (i12 & 64) != 0 ? c44104d.f414712h : str2;
        List list2 = (i12 & 128) != 0 ? c44104d.f414713i : list;
        List<com.avito.android.cart_similar_items.konveyor.c> list3 = (i12 & 256) != 0 ? c44104d.f414714j : arrayList;
        String str6 = (i12 & 512) != 0 ? c44104d.f414715k : str3;
        c44104d.getClass();
        return new C44104d(str4, printableText2, interfaceC44106f2, interfaceC44107g2, bVar2, interfaceC31171n2, str5, list2, list3, str6);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44104d)) {
            return false;
        }
        C44104d c44104d = (C44104d) obj;
        return L.f(this.f414706b, c44104d.f414706b) && L.f(this.f414707c, c44104d.f414707c) && L.f(this.f414708d, c44104d.f414708d) && L.f(this.f414709e, c44104d.f414709e) && L.f(this.f414710f, c44104d.f414710f) && L.f(this.f414711g, c44104d.f414711g) && L.f(this.f414712h, c44104d.f414712h) && L.f(this.f414713i, c44104d.f414713i) && L.f(this.f414714j, c44104d.f414714j) && L.f(this.f414715k, c44104d.f414715k);
    }

    public final int hashCode() {
        String str = this.f414706b;
        int iHashCode = (this.f414709e.hashCode() + ((this.f414708d.hashCode() + com.avito.android.actions_sheet.a.f(this.f414707c, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31)) * 31;
        b bVar = this.f414710f;
        int iE2 = H.e(H.e(H.d((this.f414711g.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, 31, this.f414712h), 31, this.f414713i), 31, this.f414714j);
        String str2 = this.f414715k;
        return iE2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CartSimilarItemsState(xHash=");
        sb2.append(this.f414706b);
        sb2.append(", title=");
        sb2.append(this.f414707c);
        sb2.append(", loadingState=");
        sb2.append(this.f414708d);
        sb2.append(", paginationState=");
        sb2.append(this.f414709e);
        sb2.append(", contentPlaceholderData=");
        sb2.append(this.f414710f);
        sb2.append(", cartIconState=");
        sb2.append(this.f414711g);
        sb2.append(", topFormId=");
        sb2.append(this.f414712h);
        sb2.append(", topComponents=");
        sb2.append(this.f414713i);
        sb2.append(", mainItems=");
        sb2.append(this.f414714j);
        sb2.append(", paginationRequest=");
        return C22026a.c(sb2, this.f414715k, ')');
    }

    public C44104d(String str, PrintableText printableText, InterfaceC44106f interfaceC44106f, InterfaceC44107g interfaceC44107g, b bVar, InterfaceC31171n interfaceC31171n, String str2, List list, List list2, String str3, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? com.avito.android.printable_text.b.f("") : printableText, (i12 & 4) != 0 ? InterfaceC44106f.b.f414720a : interfaceC44106f, (i12 & 8) != 0 ? new InterfaceC44107g.b(false) : interfaceC44107g, (i12 & 16) != 0 ? null : bVar, (i12 & 32) != 0 ? InterfaceC31171n.c.f176508a : interfaceC31171n, (i12 & 64) != 0 ? "top" : str2, (i12 & 128) != 0 ? C42784z0.f406748b : list, (i12 & 256) != 0 ? C42784z0.f406748b : list2, (i12 & 512) == 0 ? str3 : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C44104d(@l String str, @k PrintableText printableText, @k InterfaceC44106f interfaceC44106f, @k InterfaceC44107g interfaceC44107g, @l b bVar, @k InterfaceC31171n interfaceC31171n, @k String str2, @k List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @k List<? extends com.avito.android.cart_similar_items.konveyor.c> list2, @l String str3) {
        this.f414706b = str;
        this.f414707c = printableText;
        this.f414708d = interfaceC44106f;
        this.f414709e = interfaceC44107g;
        this.f414710f = bVar;
        this.f414711g = interfaceC31171n;
        this.f414712h = str2;
        this.f414713i = list;
        this.f414714j = list2;
        this.f414715k = str3;
    }
}
