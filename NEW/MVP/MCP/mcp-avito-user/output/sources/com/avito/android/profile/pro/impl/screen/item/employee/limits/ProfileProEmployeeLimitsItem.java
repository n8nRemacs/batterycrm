package com.avito.android.profile.pro.impl.screen.item.employee.limits;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProEmployeeLimitsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/employee/limits/ProfileProEmployeeLimitsItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Limit", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProEmployeeLimitsItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProEmployeeLimitsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223218b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f223219c;

    /* compiled from: ProfileProEmployeeLimitsItem.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/employee/limits/ProfileProEmployeeLimitsItem$Limit;", "Landroid/os/Parcelable;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Limit implements Parcelable {

        @k
        public static final Parcelable.Creator<Limit> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f223220b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f223221c;

        /* compiled from: ProfileProEmployeeLimitsItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Limit> {
            @Override // android.os.Parcelable.Creator
            public final Limit createFromParcel(Parcel parcel) {
                return new Limit(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Limit[] newArray(int i12) {
                return new Limit[i12];
            }
        }

        public Limit(@k String str, @k String str2) {
            this.f223220b = str;
            this.f223221c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) obj;
            return L.f(this.f223220b, limit.f223220b) && L.f(this.f223221c, limit.f223221c);
        }

        public final int hashCode() {
            return this.f223221c.hashCode() + (this.f223220b.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Limit(header=");
            sb2.append(this.f223220b);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f223221c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f223220b);
            parcel.writeString(this.f223221c);
        }
    }

    /* compiled from: ProfileProEmployeeLimitsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProEmployeeLimitsItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProEmployeeLimitsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Limit.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ProfileProEmployeeLimitsItem(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProEmployeeLimitsItem[] newArray(int i12) {
            return new ProfileProEmployeeLimitsItem[i12];
        }
    }

    public ProfileProEmployeeLimitsItem(@k String str, @k ArrayList arrayList) {
        this.f223218b = str;
        this.f223219c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProEmployeeLimitsItem)) {
            return false;
        }
        ProfileProEmployeeLimitsItem profileProEmployeeLimitsItem = (ProfileProEmployeeLimitsItem) obj;
        return L.f(this.f223218b, profileProEmployeeLimitsItem.f223218b) && this.f223219c.equals(profileProEmployeeLimitsItem.f223219c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222246b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF223208b() {
        return this.f223218b;
    }

    public final int hashCode() {
        return this.f223219c.hashCode() + (this.f223218b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProEmployeeLimitsItem(stringId=");
        sb2.append(this.f223218b);
        sb2.append(", limits=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f223219c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223218b);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f223219c, parcel);
        while (itZ.hasNext()) {
            ((Limit) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
