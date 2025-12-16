package com.avito.android.user_stats.extended_user_stats.tabs.expenses.items.expense;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.user_stats.extended_user_stats.tabs.expenses.mvi.entity.ExpensesItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ExpenseItemData.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/items/expense/ExpenseItemData;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/mvi/entity/ExpensesItem;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ExpenseItemData implements ExpensesItem {

    @k
    public static final Parcelable.Creator<ExpenseItemData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f317735b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f317736c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f317737d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f317738e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalColor f317739f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f317740g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final UniversalColor f317741h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f317742i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f317743j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final ExpensesType f317744k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final DeepLink f317745l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final String f317746m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final String f317747n;

    /* compiled from: ExpenseItemData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExpenseItemData> {
        @Override // android.os.Parcelable.Creator
        public final ExpenseItemData createFromParcel(Parcel parcel) {
            return new ExpenseItemData(parcel.readString(), (PrintableText) parcel.readParcelable(ExpenseItemData.class.getClassLoader()), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(ExpenseItemData.class.getClassLoader()), parcel.readString(), (UniversalColor) parcel.readParcelable(ExpenseItemData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, ExpensesType.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(ExpenseItemData.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExpenseItemData[] newArray(int i12) {
            return new ExpenseItemData[i12];
        }
    }

    public ExpenseItemData(@k String str, @k PrintableText printableText, @k String str2, @l String str3, @l UniversalColor universalColor, @l String str4, @l UniversalColor universalColor2, boolean z12, boolean z13, @k ExpensesType expensesType, @l DeepLink deepLink, @k String str5, @l String str6) {
        this.f317735b = str;
        this.f317736c = printableText;
        this.f317737d = str2;
        this.f317738e = str3;
        this.f317739f = universalColor;
        this.f317740g = str4;
        this.f317741h = universalColor2;
        this.f317742i = z12;
        this.f317743j = z13;
        this.f317744k = expensesType;
        this.f317745l = deepLink;
        this.f317746m = str5;
        this.f317747n = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpenseItemData)) {
            return false;
        }
        ExpenseItemData expenseItemData = (ExpenseItemData) obj;
        return L.f(this.f317735b, expenseItemData.f317735b) && L.f(this.f317736c, expenseItemData.f317736c) && L.f(this.f317737d, expenseItemData.f317737d) && L.f(this.f317738e, expenseItemData.f317738e) && L.f(this.f317739f, expenseItemData.f317739f) && L.f(this.f317740g, expenseItemData.f317740g) && L.f(this.f317741h, expenseItemData.f317741h) && this.f317742i == expenseItemData.f317742i && this.f317743j == expenseItemData.f317743j && this.f317744k == expenseItemData.f317744k && L.f(this.f317745l, expenseItemData.f317745l) && L.f(this.f317746m, expenseItemData.f317746m) && L.f(this.f317747n, expenseItemData.f317747n);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF12162b() {
        return this.f317735b;
    }

    public final int hashCode() {
        int iD2 = H.d(com.avito.android.actions_sheet.a.f(this.f317736c, this.f317735b.hashCode() * 31, 31), 31, this.f317737d);
        String str = this.f317738e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        UniversalColor universalColor = this.f317739f;
        int iHashCode2 = (iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        String str2 = this.f317740g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalColor universalColor2 = this.f317741h;
        int iHashCode4 = (this.f317744k.hashCode() + r.i(r.i((iHashCode3 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31, 31, this.f317742i), 31, this.f317743j)) * 31;
        DeepLink deepLink = this.f317745l;
        int iD3 = H.d((iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f317746m);
        String str3 = this.f317747n;
        return iD3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpenseItemData(stringId=");
        sb2.append(this.f317735b);
        sb2.append(", text=");
        sb2.append(this.f317736c);
        sb2.append(", price=");
        sb2.append(this.f317737d);
        sb2.append(", bonusesTitle=");
        sb2.append(this.f317738e);
        sb2.append(", bonusesColor=");
        sb2.append(this.f317739f);
        sb2.append(", bonuses=");
        sb2.append(this.f317740g);
        sb2.append(", color=");
        sb2.append(this.f317741h);
        sb2.append(", hasChildren=");
        sb2.append(this.f317742i);
        sb2.append(", isOpened=");
        sb2.append(this.f317743j);
        sb2.append(", expensesType=");
        sb2.append(this.f317744k);
        sb2.append(", hint=");
        sb2.append(this.f317745l);
        sb2.append(", slug=");
        sb2.append(this.f317746m);
        sb2.append(", parentSlug=");
        return C22026a.c(sb2, this.f317747n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f317735b);
        parcel.writeParcelable(this.f317736c, i12);
        parcel.writeString(this.f317737d);
        parcel.writeString(this.f317738e);
        parcel.writeParcelable(this.f317739f, i12);
        parcel.writeString(this.f317740g);
        parcel.writeParcelable(this.f317741h, i12);
        parcel.writeInt(this.f317742i ? 1 : 0);
        parcel.writeInt(this.f317743j ? 1 : 0);
        parcel.writeString(this.f317744k.name());
        parcel.writeParcelable(this.f317745l, i12);
        parcel.writeString(this.f317746m);
        parcel.writeString(this.f317747n);
    }

    public /* synthetic */ ExpenseItemData(String str, PrintableText printableText, String str2, String str3, UniversalColor universalColor, String str4, UniversalColor universalColor2, boolean z12, boolean z13, ExpensesType expensesType, DeepLink deepLink, String str5, String str6, int i12, C42822w c42822w) {
        this(str, printableText, str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : universalColor, (i12 & 32) != 0 ? null : str4, (i12 & 64) != 0 ? null : universalColor2, (i12 & 128) != 0 ? false : z12, (i12 & 256) != 0 ? false : z13, (i12 & 512) != 0 ? ExpensesType.f317748b : expensesType, (i12 & 1024) != 0 ? null : deepLink, str5, (i12 & 4096) != 0 ? null : str6);
    }
}
