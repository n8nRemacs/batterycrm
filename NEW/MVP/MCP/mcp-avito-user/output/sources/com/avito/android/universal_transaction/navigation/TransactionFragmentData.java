package com.avito.android.universal_transaction.navigation;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.NavigationScreenAction;
import com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TransactionFragmentData.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_transaction/navigation/TransactionFragmentData;", "Lcom/avito/android/bottom_navigation/ui/fragment/factory/TabFragmentFactory$Data;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TransactionFragmentData implements TabFragmentFactory.Data {

    @k
    public static final Parcelable.Creator<TransactionFragmentData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f306468b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f306469c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f306470d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f306471e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f306472f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f306473g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final NavigationTabSetItem f306474h;

    /* compiled from: TransactionFragmentData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TransactionFragmentData> {
        @Override // android.os.Parcelable.Creator
        public final TransactionFragmentData createFromParcel(Parcel parcel) {
            return new TransactionFragmentData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (NavigationTabSetItem) parcel.readParcelable(TransactionFragmentData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TransactionFragmentData[] newArray(int i12) {
            return new TransactionFragmentData[i12];
        }
    }

    public TransactionFragmentData(@k String str, @k String str2, @k String str3, @l String str4, @l String str5, @k NavigationTabSetItem navigationTabSetItem) {
        this.f306468b = str;
        this.f306469c = str2;
        this.f306470d = str3;
        this.f306471e = str4;
        this.f306472f = str5;
        this.f306473g = navigationTabSetItem;
        this.f306474h = navigationTabSetItem;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: W4 */
    public final NavigationScreenAction getF71588d() {
        return NavigationScreenAction.f107100b;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @k
    /* renamed from: d2, reason: from getter */
    public final NavigationTabSetItem getF173268d() {
        return this.f306474h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    /* renamed from: e0 */
    public final boolean getF186714d() {
        return true;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransactionFragmentData)) {
            return false;
        }
        TransactionFragmentData transactionFragmentData = (TransactionFragmentData) obj;
        return L.f(this.f306468b, transactionFragmentData.f306468b) && L.f(this.f306469c, transactionFragmentData.f306469c) && L.f(this.f306470d, transactionFragmentData.f306470d) && L.f(this.f306471e, transactionFragmentData.f306471e) && L.f(this.f306472f, transactionFragmentData.f306472f) && L.f(this.f306473g, transactionFragmentData.f306473g);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f306468b.hashCode() * 31, 31, this.f306469c), 31, this.f306470d);
        String str = this.f306471e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f306472f;
        return this.f306473g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.factory.TabFragmentFactory.Data
    @l
    public final Integer t3() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransactionFragmentData(orderId=");
        sb2.append(this.f306468b);
        sb2.append(", namespace=");
        sb2.append(this.f306469c);
        sb2.append(", scenario=");
        sb2.append(this.f306470d);
        sb2.append(", extra=");
        sb2.append(this.f306471e);
        sb2.append(", eventParams=");
        sb2.append(this.f306472f);
        sb2.append(", tab=");
        return com.avito.android.actions_sheet.a.u(sb2, this.f306473g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f306468b);
        parcel.writeString(this.f306469c);
        parcel.writeString(this.f306470d);
        parcel.writeString(this.f306471e);
        parcel.writeString(this.f306472f);
        parcel.writeParcelable(this.f306473g, i12);
    }
}
