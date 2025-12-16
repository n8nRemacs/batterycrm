package com.avito.android.screens.bbip_v2.ui.items.budget;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BbipV2BudgetItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/budget/b;", "Lcom/avito/conveyor_item/a;", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f261570b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f261571c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<a> f261572d;

    /* compiled from: BbipV2BudgetItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/budget/b$a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f261573a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f261574b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f261575c;

        /* renamed from: d, reason: collision with root package name */
        public final int f261576d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f261577e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f261578f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Integer f261579g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final PrintableText f261580h;

        public a(@Y61.k String str, @Y61.l String str2, @Y61.l Integer num, int i12, boolean z12, boolean z13, @Y61.l Integer num2, @Y61.l PrintableText printableText) {
            this.f261573a = str;
            this.f261574b = str2;
            this.f261575c = num;
            this.f261576d = i12;
            this.f261577e = z12;
            this.f261578f = z13;
            this.f261579g = num2;
            this.f261580h = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f261573a, aVar.f261573a) && L.f(this.f261574b, aVar.f261574b) && L.f(this.f261575c, aVar.f261575c) && this.f261576d == aVar.f261576d && this.f261577e == aVar.f261577e && this.f261578f == aVar.f261578f && L.f(this.f261579g, aVar.f261579g) && L.f(this.f261580h, aVar.f261580h);
        }

        public final int hashCode() {
            int iHashCode = this.f261573a.hashCode() * 31;
            String str = this.f261574b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f261575c;
            int i12 = r.i(r.i(r.e(this.f261576d, (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.f261577e), 31, this.f261578f);
            Integer num2 = this.f261579g;
            int iHashCode3 = (i12 + (num2 == null ? 0 : num2.hashCode())) * 31;
            PrintableText printableText = this.f261580h;
            return iHashCode3 + (printableText != null ? printableText.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Budget(priceFormatted=");
            sb2.append(this.f261573a);
            sb2.append(", budgetFormatted=");
            sb2.append(this.f261574b);
            sb2.append(", discountPct=");
            sb2.append(this.f261575c);
            sb2.append(", price=");
            sb2.append(this.f261576d);
            sb2.append(", recommended=");
            sb2.append(this.f261577e);
            sb2.append(", selected=");
            sb2.append(this.f261578f);
            sb2.append(", budget=");
            sb2.append(this.f261579g);
            sb2.append(", warning=");
            return AK.c.m(sb2, this.f261580h, ')');
        }
    }

    public b(@Y61.k String str, boolean z12, @Y61.k List list) {
        this.f261570b = str;
        this.f261571c = z12;
        this.f261572d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static b a(b bVar, boolean z12, ArrayList arrayList, int i12) {
        bVar.getClass();
        String str = bVar.f261570b;
        if ((i12 & 4) != 0) {
            z12 = bVar.f261571c;
        }
        List list = arrayList;
        if ((i12 & 8) != 0) {
            list = bVar.f261572d;
        }
        bVar.getClass();
        return new b(str, z12, list);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        bVar.getClass();
        return L.f(this.f261570b, bVar.f261570b) && this.f261571c == bVar.f261571c && L.f(this.f261572d, bVar.f261572d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return -1458812528;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF255722b() {
        return "bbip_v2_budget";
    }

    public final int hashCode() {
        return this.f261572d.hashCode() + r.i(H.d(2021451888, 31, this.f261570b), 31, this.f261571c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipV2BudgetItem(stringId=bbip_v2_budget, title=");
        sb2.append(this.f261570b);
        sb2.append(", shouldBlockBudgets=");
        sb2.append(this.f261571c);
        sb2.append(", budgets=");
        return H.p(sb2, this.f261572d, ')');
    }
}
