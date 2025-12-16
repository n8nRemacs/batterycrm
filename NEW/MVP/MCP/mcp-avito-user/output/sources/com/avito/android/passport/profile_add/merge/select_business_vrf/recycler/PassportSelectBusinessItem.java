package com.avito.android.passport.profile_add.merge.select_business_vrf.recycler;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PassportSelectBusinessItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/recycler/PassportSelectBusinessItem;", "Lcom/avito/android/passport/profile_add/merge/select_business_vrf/recycler/PassportSelectBusinessListItem;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PassportSelectBusinessItem implements PassportSelectBusinessListItem {

    @Y61.k
    public static final Parcelable.Creator<PassportSelectBusinessItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AttributedText f213500b;

    /* renamed from: c, reason: collision with root package name */
    public final int f213501c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f213502d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f213503e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f213504f;

    /* compiled from: PassportSelectBusinessItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportSelectBusinessItem> {
        @Override // android.os.Parcelable.Creator
        public final PassportSelectBusinessItem createFromParcel(Parcel parcel) {
            return new PassportSelectBusinessItem((AttributedText) parcel.readParcelable(PassportSelectBusinessItem.class.getClassLoader()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PassportSelectBusinessItem[] newArray(int i12) {
            return new PassportSelectBusinessItem[i12];
        }
    }

    public PassportSelectBusinessItem(@Y61.k AttributedText attributedText, int i12, boolean z12, boolean z13, @Y61.k String str) {
        this.f213500b = attributedText;
        this.f213501c = i12;
        this.f213502d = z12;
        this.f213503e = z13;
        this.f213504f = str;
    }

    public static PassportSelectBusinessItem a(PassportSelectBusinessItem passportSelectBusinessItem, boolean z12, boolean z13, int i12) {
        AttributedText attributedText = passportSelectBusinessItem.f213500b;
        int i13 = passportSelectBusinessItem.f213501c;
        if ((i12 & 4) != 0) {
            z12 = passportSelectBusinessItem.f213502d;
        }
        String str = passportSelectBusinessItem.f213504f;
        passportSelectBusinessItem.getClass();
        return new PassportSelectBusinessItem(attributedText, i13, z12, z13, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportSelectBusinessItem)) {
            return false;
        }
        PassportSelectBusinessItem passportSelectBusinessItem = (PassportSelectBusinessItem) obj;
        return L.f(this.f213500b, passportSelectBusinessItem.f213500b) && this.f213501c == passportSelectBusinessItem.f213501c && this.f213502d == passportSelectBusinessItem.f213502d && this.f213503e == passportSelectBusinessItem.f213503e && L.f(this.f213504f, passportSelectBusinessItem.f213504f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183509b() {
        return this.f213504f;
    }

    public final int hashCode() {
        return this.f213504f.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.e(this.f213501c, this.f213500b.hashCode() * 31, 31), 31, this.f213502d), 31, this.f213503e);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportSelectBusinessItem(requisitesText=");
        sb2.append(this.f213500b);
        sb2.append(", userIdFrom=");
        sb2.append(this.f213501c);
        sb2.append(", isChecked=");
        sb2.append(this.f213502d);
        sb2.append(", isErrorState=");
        sb2.append(this.f213503e);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f213504f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f213500b, i12);
        parcel.writeInt(this.f213501c);
        parcel.writeInt(this.f213502d ? 1 : 0);
        parcel.writeInt(this.f213503e ? 1 : 0);
        parcel.writeString(this.f213504f);
    }
}
