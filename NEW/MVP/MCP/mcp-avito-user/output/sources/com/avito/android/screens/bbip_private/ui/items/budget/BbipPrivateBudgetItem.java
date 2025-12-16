package com.avito.android.screens.bbip_private.ui.items.budget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.mnz_common.data.MnzFloatingFooterContact;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BbipPrivateBudgetItem.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget/BbipPrivateBudgetItem;", "Lcom/avito/conveyor_item/a;", "Budget", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BbipPrivateBudgetItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f260625b;

    /* renamed from: c, reason: collision with root package name */
    public final int f260626c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Budget f260627d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Budget f260628e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f260629f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AttributedText f260630g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AttributedText f260631h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f260632i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f260633j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f260634k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final List<a> f260635l;

    /* compiled from: BbipPrivateBudgetItem.kt */
    @P
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget/BbipPrivateBudgetItem$Budget;", "Lcom/avito/android/lib/design/selector_card/r;", "Landroid/os/Parcelable;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Budget implements com.avito.android.lib.design.selector_card.r, Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Budget> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f260636b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Long f260637c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f260638d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Long f260639e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f260640f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Long f260641g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final String f260642h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final Long f260643i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final Long f260644j;

        /* renamed from: k, reason: collision with root package name */
        @Y61.k
        public final UniversalImage f260645k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public final AttributedText f260646l;

        /* renamed from: m, reason: collision with root package name */
        @Y61.l
        public final String f260647m;

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final AttributedText f260648n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f260649o;

        /* renamed from: p, reason: collision with root package name */
        @Y61.l
        public final MnzFloatingFooterContact f260650p;

        /* compiled from: BbipPrivateBudgetItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Budget> {
            @Override // android.os.Parcelable.Creator
            public final Budget createFromParcel(Parcel parcel) {
                return new Budget(parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (UniversalImage) parcel.readParcelable(Budget.class.getClassLoader()), (AttributedText) parcel.readParcelable(Budget.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(Budget.class.getClassLoader()), parcel.readInt() != 0, (MnzFloatingFooterContact) parcel.readParcelable(Budget.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Budget[] newArray(int i12) {
                return new Budget[i12];
            }
        }

        public Budget(int i12, @Y61.l Long l12, @Y61.l String str, @Y61.l Long l13, @Y61.l String str2, @Y61.l Long l14, @Y61.l String str3, @Y61.l Long l15, @Y61.l Long l16, @Y61.k UniversalImage universalImage, @Y61.l AttributedText attributedText, @Y61.l String str4, @Y61.k AttributedText attributedText2, boolean z12, @Y61.l MnzFloatingFooterContact mnzFloatingFooterContact) {
            this.f260636b = i12;
            this.f260637c = l12;
            this.f260638d = str;
            this.f260639e = l13;
            this.f260640f = str2;
            this.f260641g = l14;
            this.f260642h = str3;
            this.f260643i = l15;
            this.f260644j = l16;
            this.f260645k = universalImage;
            this.f260646l = attributedText;
            this.f260647m = str4;
            this.f260648n = attributedText2;
            this.f260649o = z12;
            this.f260650p = mnzFloatingFooterContact;
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
            return this.f260636b == budget.f260636b && L.f(this.f260637c, budget.f260637c) && L.f(this.f260638d, budget.f260638d) && L.f(this.f260639e, budget.f260639e) && L.f(this.f260640f, budget.f260640f) && L.f(this.f260641g, budget.f260641g) && L.f(this.f260642h, budget.f260642h) && L.f(this.f260643i, budget.f260643i) && L.f(this.f260644j, budget.f260644j) && L.f(this.f260645k, budget.f260645k) && L.f(this.f260646l, budget.f260646l) && L.f(this.f260647m, budget.f260647m) && L.f(this.f260648n, budget.f260648n) && this.f260649o == budget.f260649o && L.f(this.f260650p, budget.f260650p);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f260636b) * 31;
            Long l12 = this.f260637c;
            int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
            String str = this.f260638d;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Long l13 = this.f260639e;
            int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
            String str2 = this.f260640f;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l14 = this.f260641g;
            int iHashCode6 = (iHashCode5 + (l14 == null ? 0 : l14.hashCode())) * 31;
            String str3 = this.f260642h;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l15 = this.f260643i;
            int iHashCode8 = (iHashCode7 + (l15 == null ? 0 : l15.hashCode())) * 31;
            Long l16 = this.f260644j;
            int iA2 = com.avito.android.actions_sheet.a.a((iHashCode8 + (l16 == null ? 0 : l16.hashCode())) * 31, 31, this.f260645k);
            AttributedText attributedText = this.f260646l;
            int iHashCode9 = (iA2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            String str4 = this.f260647m;
            int i12 = androidx.appcompat.app.r.i(com.avito.android.actions_sheet.a.b((iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f260648n), 31, this.f260649o);
            MnzFloatingFooterContact mnzFloatingFooterContact = this.f260650p;
            return i12 + (mnzFloatingFooterContact != null ? mnzFloatingFooterContact.hashCode() : 0);
        }

        @Override // com.avito.android.lib.design.selector_card.r
        /* renamed from: isEnabled */
        public final boolean getF309669f() {
            return true;
        }

        @Y61.k
        public final String toString() {
            return "Budget(id=" + this.f260636b + ", price=" + this.f260637c + ", priceFormatted=" + this.f260638d + ", budget=" + this.f260639e + ", budgetFormatted=" + this.f260640f + ", discountPct=" + this.f260641g + ", discountPctFormatted=" + this.f260642h + ", dailyPrice=" + this.f260643i + ", dailyBudget=" + this.f260644j + ", budgetIcon=" + this.f260645k + ", customBudgetIcon=" + this.f260646l + ", forecast=" + this.f260647m + ", forecastTitle=" + this.f260648n + ", isCustomBudget=" + this.f260649o + ", contact=" + this.f260650p + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f260636b);
            Long l12 = this.f260637c;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
            parcel.writeString(this.f260638d);
            Long l13 = this.f260639e;
            if (l13 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l13);
            }
            parcel.writeString(this.f260640f);
            Long l14 = this.f260641g;
            if (l14 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l14);
            }
            parcel.writeString(this.f260642h);
            Long l15 = this.f260643i;
            if (l15 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l15);
            }
            Long l16 = this.f260644j;
            if (l16 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l16);
            }
            parcel.writeParcelable(this.f260645k, i12);
            parcel.writeParcelable(this.f260646l, i12);
            parcel.writeString(this.f260647m);
            parcel.writeParcelable(this.f260648n, i12);
            parcel.writeInt(this.f260649o ? 1 : 0);
            parcel.writeParcelable(this.f260650p, i12);
        }
    }

    /* compiled from: BbipPrivateBudgetItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/budget/BbipPrivateBudgetItem$a;", "", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f260651a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<Budget> f260652b;

        public a(int i12, @Y61.k List<Budget> list) {
            this.f260651a = i12;
            this.f260652b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f260651a == aVar.f260651a && L.f(this.f260652b, aVar.f260652b);
        }

        public final int hashCode() {
            return this.f260652b.hashCode() + (Integer.hashCode(this.f260651a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BudgetsByDay(duration=");
            sb2.append(this.f260651a);
            sb2.append(", budgets=");
            return H.p(sb2, this.f260652b, ')');
        }
    }

    public BbipPrivateBudgetItem(@Y61.k String str, int i12, @Y61.l Budget budget, @Y61.l Budget budget2, @Y61.l Integer num, @Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k List list) {
        this.f260625b = str;
        this.f260626c = i12;
        this.f260627d = budget;
        this.f260628e = budget2;
        this.f260629f = num;
        this.f260630g = attributedText;
        this.f260631h = attributedText2;
        this.f260632i = str2;
        this.f260633j = str3;
        this.f260634k = str4;
        this.f260635l = list;
    }

    public static BbipPrivateBudgetItem a(BbipPrivateBudgetItem bbipPrivateBudgetItem, int i12, Budget budget, Integer num, List list, int i13) {
        bbipPrivateBudgetItem.getClass();
        String str = bbipPrivateBudgetItem.f260625b;
        int i14 = (i13 & 4) != 0 ? bbipPrivateBudgetItem.f260626c : i12;
        Budget budget2 = bbipPrivateBudgetItem.f260628e;
        Integer num2 = (i13 & 32) != 0 ? bbipPrivateBudgetItem.f260629f : num;
        AttributedText attributedText = bbipPrivateBudgetItem.f260630g;
        AttributedText attributedText2 = bbipPrivateBudgetItem.f260631h;
        String str2 = bbipPrivateBudgetItem.f260632i;
        String str3 = bbipPrivateBudgetItem.f260633j;
        String str4 = bbipPrivateBudgetItem.f260634k;
        List list2 = (i13 & 2048) != 0 ? bbipPrivateBudgetItem.f260635l : list;
        bbipPrivateBudgetItem.getClass();
        return new BbipPrivateBudgetItem(str, i14, budget, budget2, num2, attributedText, attributedText2, str2, str3, str4, list2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BbipPrivateBudgetItem)) {
            return false;
        }
        BbipPrivateBudgetItem bbipPrivateBudgetItem = (BbipPrivateBudgetItem) obj;
        bbipPrivateBudgetItem.getClass();
        return L.f(this.f260625b, bbipPrivateBudgetItem.f260625b) && this.f260626c == bbipPrivateBudgetItem.f260626c && L.f(this.f260627d, bbipPrivateBudgetItem.f260627d) && L.f(this.f260628e, bbipPrivateBudgetItem.f260628e) && L.f(this.f260629f, bbipPrivateBudgetItem.f260629f) && L.f(this.f260630g, bbipPrivateBudgetItem.f260630g) && L.f(this.f260631h, bbipPrivateBudgetItem.f260631h) && L.f(this.f260632i, bbipPrivateBudgetItem.f260632i) && L.f(this.f260633j, bbipPrivateBudgetItem.f260633j) && L.f(this.f260634k, bbipPrivateBudgetItem.f260634k) && L.f(this.f260635l, bbipPrivateBudgetItem.f260635l);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return -207919271;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF258449b() {
        return "bbip_private_budget";
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f260626c, H.d(2144437191, 31, this.f260625b), 31);
        Budget budget = this.f260627d;
        int iHashCode = (iE2 + (budget == null ? 0 : budget.hashCode())) * 31;
        Budget budget2 = this.f260628e;
        int iHashCode2 = (iHashCode + (budget2 == null ? 0 : budget2.hashCode())) * 31;
        Integer num = this.f260629f;
        return this.f260635l.hashCode() + H.d(H.d(H.d(com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f260630g), 31, this.f260631h), 31, this.f260632i), 31, this.f260633j), 31, this.f260634k);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipPrivateBudgetItem(stringId=bbip_private_budget, title=");
        sb2.append(this.f260625b);
        sb2.append(", activeDuration=");
        sb2.append(this.f260626c);
        sb2.append(", selectedBudget=");
        sb2.append(this.f260627d);
        sb2.append(", preselectedBudget=");
        sb2.append(this.f260628e);
        sb2.append(", chosenCustomBudgetId=");
        sb2.append(this.f260629f);
        sb2.append(", otherBudgetText=");
        sb2.append(this.f260630g);
        sb2.append(", otherBudgetIcon=");
        sb2.append(this.f260631h);
        sb2.append(", customBudgetTitle=");
        sb2.append(this.f260632i);
        sb2.append(", customBudgetForecastSubtitle=");
        sb2.append(this.f260633j);
        sb2.append(", customBudgetActionText=");
        sb2.append(this.f260634k);
        sb2.append(", budgetsByDayList=");
        return H.p(sb2, this.f260635l, ')');
    }
}
