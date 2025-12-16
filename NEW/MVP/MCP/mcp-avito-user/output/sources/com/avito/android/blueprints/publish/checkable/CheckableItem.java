package com.avito.android.blueprints.publish.checkable;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CheckableItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/publish/checkable/CheckableItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CheckableItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<CheckableItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f106084b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f106085c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f106086d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f106087e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final DeepLink f106088f;

    /* compiled from: CheckableItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CheckableItem> {
        @Override // android.os.Parcelable.Creator
        public final CheckableItem createFromParcel(Parcel parcel) {
            return new CheckableItem((DeepLink) parcel.readParcelable(CheckableItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CheckableItem[] newArray(int i12) {
            return new CheckableItem[i12];
        }
    }

    public CheckableItem(@l DeepLink deepLink, @k String str, @k String str2, @l String str3, boolean z12) {
        this.f106084b = str;
        this.f106085c = str2;
        this.f106086d = z12;
        this.f106087e = str3;
        this.f106088f = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckableItem)) {
            return false;
        }
        CheckableItem checkableItem = (CheckableItem) obj;
        return L.f(this.f106084b, checkableItem.f106084b) && L.f(this.f106085c, checkableItem.f106085c) && this.f106086d == checkableItem.f106086d && L.f(this.f106087e, checkableItem.f106087e) && L.f(this.f106088f, checkableItem.f106088f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79875h() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF97027b() {
        return this.f106084b;
    }

    public final int hashCode() {
        int i12 = r.i(H.d(this.f106084b.hashCode() * 31, 31, this.f106085c), 31, this.f106086d);
        String str = this.f106087e;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f106088f;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CheckableItem(stringId=");
        sb2.append(this.f106084b);
        sb2.append(", title=");
        sb2.append(this.f106085c);
        sb2.append(", isChecked=");
        sb2.append(this.f106086d);
        sb2.append(", subtitle=");
        sb2.append(this.f106087e);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f106088f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f106084b);
        parcel.writeString(this.f106085c);
        parcel.writeInt(this.f106086d ? 1 : 0);
        parcel.writeString(this.f106087e);
        parcel.writeParcelable(this.f106088f, i12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CheckableItem(String str, String str2, boolean z12, String str3, DeepLink deepLink, int i12, C42822w c42822w) {
        boolean z13 = (i12 & 4) != 0 ? false : z12;
        this((i12 & 16) != 0 ? null : deepLink, str, str2, (i12 & 8) != 0 ? null : str3, z13);
    }
}
