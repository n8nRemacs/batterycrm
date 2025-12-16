package com.avito.android.screens.bbip_private.ui.items.budget_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BbipPrivateBudgetWidgetItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/BbipPrivateBudgetWidgetItem;", "Lcom/avito/conveyor_item/a;", "Budget", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BbipPrivateBudgetWidgetItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f260727b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DeepLink f260728c;

    /* renamed from: d, reason: collision with root package name */
    public final int f260729d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Budget f260730e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Budget f260731f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f260732g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AttributedText f260733h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AttributedText f260734i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f260735j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f260736k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f260737l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final List<a> f260738m;

    /* compiled from: BbipPrivateBudgetWidgetItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/BbipPrivateBudgetWidgetItem$Budget;", "Lcom/avito/android/lib/design/selector_card/r;", "Landroid/os/Parcelable;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Budget implements com.avito.android.lib.design.selector_card.r, Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Budget> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f260739b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Long f260740c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f260741d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Long f260742e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f260743f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Long f260744g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f260745h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final Long f260746i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final Long f260747j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final UniversalImage f260748k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final AttributedText f260749l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final String f260750m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public final String f260751n;

        /* renamed from: o, reason: collision with root package name */
        @Y61.k
        public final AttributedText f260752o;

        /* renamed from: p, reason: collision with root package name */
        public final boolean f260753p;

        /* renamed from: q, reason: collision with root package name */
        @Y61.l
        public final MnzFloatingFooterContact f260754q;

        /* compiled from: BbipPrivateBudgetWidgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Budget> {
            @Override // android.os.Parcelable.Creator
            public final Budget createFromParcel(Parcel parcel) {
                return new Budget(parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (UniversalImage) parcel.readParcelable(Budget.class.getClassLoader()), (AttributedText) parcel.readParcelable(Budget.class.getClassLoader()), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(Budget.class.getClassLoader()), parcel.readInt() != 0, (MnzFloatingFooterContact) parcel.readParcelable(Budget.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Budget[] newArray(int i12) {
                return new Budget[i12];
            }
        }

        public Budget(int i12, @Y61.l Long l12, @Y61.l String str, @Y61.l Long l13, @Y61.l String str2, @Y61.l Long l14, @Y61.l String str3, @Y61.l Long l15, @Y61.l Long l16, @Y61.k UniversalImage universalImage, @Y61.l AttributedText attributedText, @Y61.l String str4, @Y61.l String str5, @Y61.k AttributedText attributedText2, boolean z12, @Y61.l MnzFloatingFooterContact mnzFloatingFooterContact) {
            this.f260739b = i12;
            this.f260740c = l12;
            this.f260741d = str;
            this.f260742e = l13;
            this.f260743f = str2;
            this.f260744g = l14;
            this.f260745h = str3;
            this.f260746i = l15;
            this.f260747j = l16;
            this.f260748k = universalImage;
            this.f260749l = attributedText;
            this.f260750m = str4;
            this.f260751n = str5;
            this.f260752o = attributedText2;
            this.f260753p = z12;
            this.f260754q = mnzFloatingFooterContact;
        }

        @Override // com.avito.android.lib.design.selector_card.r
        public final boolean a(@Y61.k com.avito.android.lib.design.selector_card.r rVar) {
            return (rVar instanceof Budget) && equals(rVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Budget)) {
                return false;
            }
            Budget budget = (Budget) obj;
            return this.f260739b == budget.f260739b && L.f(this.f260740c, budget.f260740c) && L.f(this.f260741d, budget.f260741d) && L.f(this.f260742e, budget.f260742e) && L.f(this.f260743f, budget.f260743f) && L.f(this.f260744g, budget.f260744g) && L.f(this.f260745h, budget.f260745h) && L.f(this.f260746i, budget.f260746i) && L.f(this.f260747j, budget.f260747j) && L.f(this.f260748k, budget.f260748k) && L.f(this.f260749l, budget.f260749l) && L.f(this.f260750m, budget.f260750m) && L.f(this.f260751n, budget.f260751n) && L.f(this.f260752o, budget.f260752o) && this.f260753p == budget.f260753p && L.f(this.f260754q, budget.f260754q);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f260739b) * 31;
            Long l12 = this.f260740c;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.f260741d;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Long l13 = this.f260742e;
            int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
            String str2 = this.f260743f;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l14 = this.f260744g;
            int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
            String str3 = this.f260745h;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l15 = this.f260746i;
            int iHashCode8 = (iHashCode7 + (l15 == null ? 0 : l15.hashCode())) * 31;
            Long l16 = this.f260747j;
            int iA2 = com.avito.android.actions_sheet.a.a((iHashCode8 + (l16 == null ? 0 : l16.hashCode())) * 31, 31, this.f260748k);
            AttributedText attributedText = this.f260749l;
            int iHashCode9 = (iA2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            String str4 = this.f260750m;
            int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f260751n;
            int i12 = androidx.appcompat.app.r.i(com.avito.android.actions_sheet.a.b((iHashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.f260752o), 31, this.f260753p);
            MnzFloatingFooterContact mnzFloatingFooterContact = this.f260754q;
            return i12 + (mnzFloatingFooterContact != null ? mnzFloatingFooterContact.hashCode() : 0);
        }

        @Override // com.avito.android.lib.design.selector_card.r
        /* renamed from: isEnabled */
        public final boolean getF309669f() {
            return true;
        }

        @Y61.k
        public final String toString() {
            return "Budget(id=" + this.f260739b + ", price=" + this.f260740c + ", priceFormatted=" + this.f260741d + ", budget=" + this.f260742e + ", budgetFormatted=" + this.f260743f + ", discountPct=" + this.f260744g + ", discountPctFormatted=" + this.f260745h + ", dailyPrice=" + this.f260746i + ", dailyBudget=" + this.f260747j + ", budgetIcon=" + this.f260748k + ", customBudgetIcon=" + this.f260749l + ", contactsForecast=" + this.f260750m + ", viewsForecast=" + this.f260751n + ", forecastTitle=" + this.f260752o + ", isCustomBudget=" + this.f260753p + ", contact=" + this.f260754q + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f260739b);
            Long l12 = this.f260740c;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeString(this.f260741d);
            Long l13 = this.f260742e;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l13);
            }
            parcel.writeString(this.f260743f);
            Long l14 = this.f260744g;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l14);
            }
            parcel.writeString(this.f260745h);
            Long l15 = this.f260746i;
            if (l15 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l15);
            }
            Long l16 = this.f260747j;
            if (l16 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l16);
            }
            parcel.writeParcelable(this.f260748k, i12);
            parcel.writeParcelable(this.f260749l, i12);
            parcel.writeString(this.f260750m);
            parcel.writeString(this.f260751n);
            parcel.writeParcelable(this.f260752o, i12);
            parcel.writeInt(this.f260753p ? 1 : 0);
            parcel.writeParcelable(this.f260754q, i12);
        }
    }

    /* compiled from: BbipPrivateBudgetWidgetItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget_widget/BbipPrivateBudgetWidgetItem$a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f260755a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<Budget> f260756b;

        public a(int i12, @Y61.k List<Budget> list) {
            this.f260755a = i12;
            this.f260756b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f260755a == aVar.f260755a && L.f(this.f260756b, aVar.f260756b);
        }

        public final int hashCode() {
            return this.f260756b.hashCode() + (Integer.hashCode(this.f260755a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BudgetsByDay(duration=");
            sb2.append(this.f260755a);
            sb2.append(", budgets=");
            return H.p(sb2, this.f260756b, ')');
        }
    }

    public BbipPrivateBudgetWidgetItem(@Y61.k String str, @Y61.k DeepLink deepLink, int i12, @Y61.l Budget budget, @Y61.l Budget budget2, @Y61.l Integer num, @Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k List list) {
        this.f260727b = str;
        this.f260728c = deepLink;
        this.f260729d = i12;
        this.f260730e = budget;
        this.f260731f = budget2;
        this.f260732g = num;
        this.f260733h = attributedText;
        this.f260734i = attributedText2;
        this.f260735j = str2;
        this.f260736k = str3;
        this.f260737l = str4;
        this.f260738m = list;
    }

    public static BbipPrivateBudgetWidgetItem a(BbipPrivateBudgetWidgetItem bbipPrivateBudgetWidgetItem, int i12, Budget budget, Integer num, List list, int i13) {
        bbipPrivateBudgetWidgetItem.getClass();
        String str = bbipPrivateBudgetWidgetItem.f260727b;
        DeepLink deepLink = bbipPrivateBudgetWidgetItem.f260728c;
        int i14 = (i13 & 8) != 0 ? bbipPrivateBudgetWidgetItem.f260729d : i12;
        Budget budget2 = bbipPrivateBudgetWidgetItem.f260731f;
        Integer num2 = (i13 & 64) != 0 ? bbipPrivateBudgetWidgetItem.f260732g : num;
        AttributedText attributedText = bbipPrivateBudgetWidgetItem.f260733h;
        AttributedText attributedText2 = bbipPrivateBudgetWidgetItem.f260734i;
        String str2 = bbipPrivateBudgetWidgetItem.f260735j;
        String str3 = bbipPrivateBudgetWidgetItem.f260736k;
        String str4 = bbipPrivateBudgetWidgetItem.f260737l;
        List list2 = (i13 & 4096) != 0 ? bbipPrivateBudgetWidgetItem.f260738m : list;
        bbipPrivateBudgetWidgetItem.getClass();
        return new BbipPrivateBudgetWidgetItem(str, deepLink, i14, budget, budget2, num2, attributedText, attributedText2, str2, str3, str4, list2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BbipPrivateBudgetWidgetItem)) {
            return false;
        }
        BbipPrivateBudgetWidgetItem bbipPrivateBudgetWidgetItem = (BbipPrivateBudgetWidgetItem) obj;
        bbipPrivateBudgetWidgetItem.getClass();
        return L.f(this.f260727b, bbipPrivateBudgetWidgetItem.f260727b) && L.f(this.f260728c, bbipPrivateBudgetWidgetItem.f260728c) && this.f260729d == bbipPrivateBudgetWidgetItem.f260729d && L.f(this.f260730e, bbipPrivateBudgetWidgetItem.f260730e) && L.f(this.f260731f, bbipPrivateBudgetWidgetItem.f260731f) && L.f(this.f260732g, bbipPrivateBudgetWidgetItem.f260732g) && L.f(this.f260733h, bbipPrivateBudgetWidgetItem.f260733h) && L.f(this.f260734i, bbipPrivateBudgetWidgetItem.f260734i) && L.f(this.f260735j, bbipPrivateBudgetWidgetItem.f260735j) && L.f(this.f260736k, bbipPrivateBudgetWidgetItem.f260736k) && L.f(this.f260737l, bbipPrivateBudgetWidgetItem.f260737l) && L.f(this.f260738m, bbipPrivateBudgetWidgetItem.f260738m);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80342e() {
        return -207919271;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF238671b() {
        return "bbip_private_budget";
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f260729d, com.avito.android.actions_sheet.a.e(this.f260728c, H.d(2144437191, 31, this.f260727b), 31), 31);
        Budget budget = this.f260730e;
        int iHashCode = (iE2 + (budget == null ? 0 : budget.hashCode())) * 31;
        Budget budget2 = this.f260731f;
        int iHashCode2 = (iHashCode + (budget2 == null ? 0 : budget2.hashCode())) * 31;
        Integer num = this.f260732g;
        return this.f260738m.hashCode() + H.d(H.d(H.d(com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f260733h), 31, this.f260734i), 31, this.f260735j), 31, this.f260736k), 31, this.f260737l);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipPrivateBudgetWidgetItem(stringId=bbip_private_budget, title=");
        sb2.append(this.f260727b);
        sb2.append(", titleDeepLink=");
        sb2.append(this.f260728c);
        sb2.append(", activeDuration=");
        sb2.append(this.f260729d);
        sb2.append(", selectedBudget=");
        sb2.append(this.f260730e);
        sb2.append(", preselectedBudget=");
        sb2.append(this.f260731f);
        sb2.append(", chosenCustomBudgetId=");
        sb2.append(this.f260732g);
        sb2.append(", otherBudgetText=");
        sb2.append(this.f260733h);
        sb2.append(", otherBudgetIcon=");
        sb2.append(this.f260734i);
        sb2.append(", customBudgetTitle=");
        sb2.append(this.f260735j);
        sb2.append(", customBudgetForecastSubtitle=");
        sb2.append(this.f260736k);
        sb2.append(", customBudgetActionText=");
        sb2.append(this.f260737l);
        sb2.append(", budgetsByDayList=");
        return H.p(sb2, this.f260738m, ')');
    }
}
