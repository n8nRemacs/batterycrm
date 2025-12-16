package com.avito.android.screens.bbip.ui.items.budget;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BudgetItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/budget/b;", "Lcom/avito/conveyor_item/a;", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f260304b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f260305c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<a> f260306d;

    /* compiled from: BudgetItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/budget/b$a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f260307a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f260308b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Integer f260309c;

        /* renamed from: d, reason: collision with root package name */
        public final int f260310d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f260311e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f260312f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Integer f260313g;

        public a(@Y61.k String str, @Y61.l String str2, @Y61.l Integer num, int i12, boolean z12, boolean z13, @Y61.l Integer num2) {
            this.f260307a = str;
            this.f260308b = str2;
            this.f260309c = num;
            this.f260310d = i12;
            this.f260311e = z12;
            this.f260312f = z13;
            this.f260313g = num2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f260307a, aVar.f260307a) && L.f(this.f260308b, aVar.f260308b) && L.f(this.f260309c, aVar.f260309c) && this.f260310d == aVar.f260310d && this.f260311e == aVar.f260311e && this.f260312f == aVar.f260312f && L.f(this.f260313g, aVar.f260313g);
        }

        public final int hashCode() {
            int iHashCode = this.f260307a.hashCode() * 31;
            String str = this.f260308b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f260309c;
            int i12 = r.i(r.i(r.e(this.f260310d, (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.f260311e), 31, this.f260312f);
            Integer num2 = this.f260313g;
            return i12 + (num2 != null ? num2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Budget(priceFormatted=");
            sb2.append(this.f260307a);
            sb2.append(", budgetFormatted=");
            sb2.append(this.f260308b);
            sb2.append(", discountPct=");
            sb2.append(this.f260309c);
            sb2.append(", price=");
            sb2.append(this.f260310d);
            sb2.append(", recommended=");
            sb2.append(this.f260311e);
            sb2.append(", selected=");
            sb2.append(this.f260312f);
            sb2.append(", budget=");
            return s.j(sb2, this.f260313g, ')');
        }
    }

    public b(@Y61.k String str, @Y61.k String str2, @Y61.k List<a> list) {
        this.f260304b = str;
        this.f260305c = str2;
        this.f260306d = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f260304b, bVar.f260304b) && L.f(this.f260305c, bVar.f260305c) && L.f(this.f260306d, bVar.f260306d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF186614b() {
        return getF250076b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF250076b() {
        return this.f260304b;
    }

    public final int hashCode() {
        return this.f260306d.hashCode() + H.d(this.f260304b.hashCode() * 31, 31, this.f260305c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BudgetItem(stringId=");
        sb2.append(this.f260304b);
        sb2.append(", title=");
        sb2.append(this.f260305c);
        sb2.append(", budgets=");
        return H.p(sb2, this.f260306d, ')');
    }
}
