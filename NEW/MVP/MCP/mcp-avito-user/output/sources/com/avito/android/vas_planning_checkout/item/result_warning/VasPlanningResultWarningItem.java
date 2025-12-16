package com.avito.android.vas_planning_checkout.item.result_warning;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasPlanningResultWarningItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/result_warning/VasPlanningResultWarningItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Action", "Balance", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VasPlanningResultWarningItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<VasPlanningResultWarningItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f322985b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Action f322986c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f322987d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f322988e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f322989f;

    /* compiled from: VasPlanningResultWarningItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/result_warning/VasPlanningResultWarningItem$Action;", "Landroid/os/Parcelable;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @k
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f322990b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final DeepLink f322991c;

        /* compiled from: VasPlanningResultWarningItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Action> {
            @Override // android.os.Parcelable.Creator
            public final Action createFromParcel(Parcel parcel) {
                return new Action(parcel.readString(), (DeepLink) parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Action[] newArray(int i12) {
                return new Action[i12];
            }
        }

        public Action(@k String str, @l DeepLink deepLink) {
            this.f322990b = str;
            this.f322991c = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return L.f(this.f322990b, action.f322990b) && L.f(this.f322991c, action.f322991c);
        }

        public final int hashCode() {
            int iHashCode = this.f322990b.hashCode() * 31;
            DeepLink deepLink = this.f322991c;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.f322990b);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f322991c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f322990b);
            parcel.writeParcelable(this.f322991c, i12);
        }
    }

    /* compiled from: VasPlanningResultWarningItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/item/result_warning/VasPlanningResultWarningItem$Balance;", "Landroid/os/Parcelable;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Balance implements Parcelable {

        @k
        public static final Parcelable.Creator<Balance> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f322992b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f322993c;

        /* compiled from: VasPlanningResultWarningItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Balance> {
            @Override // android.os.Parcelable.Creator
            public final Balance createFromParcel(Parcel parcel) {
                return new Balance(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Balance[] newArray(int i12) {
                return new Balance[i12];
            }
        }

        public Balance(@k String str, @k String str2) {
            this.f322992b = str;
            this.f322993c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Balance)) {
                return false;
            }
            Balance balance = (Balance) obj;
            return L.f(this.f322992b, balance.f322992b) && L.f(this.f322993c, balance.f322993c);
        }

        public final int hashCode() {
            return this.f322993c.hashCode() + (this.f322992b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Balance(amount=");
            sb2.append(this.f322992b);
            sb2.append(", text=");
            return C22026a.c(sb2, this.f322993c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f322992b);
            parcel.writeString(this.f322993c);
        }
    }

    /* compiled from: VasPlanningResultWarningItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasPlanningResultWarningItem> {
        @Override // android.os.Parcelable.Creator
        public final VasPlanningResultWarningItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Action actionCreateFromParcel = parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Balance.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new VasPlanningResultWarningItem(string, actionCreateFromParcel, string2, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VasPlanningResultWarningItem[] newArray(int i12) {
            return new VasPlanningResultWarningItem[i12];
        }
    }

    public VasPlanningResultWarningItem(@k String str, @l Action action, @k String str2, @k ArrayList arrayList, @k String str3) {
        this.f322985b = str;
        this.f322986c = action;
        this.f322987d = str2;
        this.f322988e = arrayList;
        this.f322989f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VasPlanningResultWarningItem)) {
            return false;
        }
        VasPlanningResultWarningItem vasPlanningResultWarningItem = (VasPlanningResultWarningItem) obj;
        return L.f(this.f322985b, vasPlanningResultWarningItem.f322985b) && L.f(this.f322986c, vasPlanningResultWarningItem.f322986c) && L.f(this.f322987d, vasPlanningResultWarningItem.f322987d) && this.f322988e.equals(vasPlanningResultWarningItem.f322988e) && L.f(this.f322989f, vasPlanningResultWarningItem.f322989f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF284485b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF324097b() {
        return this.f322985b;
    }

    public final int hashCode() {
        int iHashCode = this.f322985b.hashCode() * 31;
        Action action = this.f322986c;
        return this.f322989f.hashCode() + androidx.compose.ui.graphics.colorspace.e.g(this.f322988e, H.d((iHashCode + (action == null ? 0 : action.hashCode())) * 31, 31, this.f322987d), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VasPlanningResultWarningItem(stringId=");
        sb2.append(this.f322985b);
        sb2.append(", action=");
        sb2.append(this.f322986c);
        sb2.append(", attention=");
        sb2.append(this.f322987d);
        sb2.append(", balance=");
        sb2.append(this.f322988e);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f322989f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f322985b);
        Action action = this.f322986c;
        if (action == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            action.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f322987d);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f322988e, parcel);
        while (itZ.hasNext()) {
            ((Balance) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f322989f);
    }
}
