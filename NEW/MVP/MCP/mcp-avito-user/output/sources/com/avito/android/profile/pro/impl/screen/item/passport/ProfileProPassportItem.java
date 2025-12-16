package com.avito.android.profile.pro.impl.screen.item.passport;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.component.user_hat.PassportProfileItem;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProPassportItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/passport/ProfileProPassportItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ProfileProPassportItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ProfileProPassportItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f223381b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<PassportProfileItem> f223382c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f223383d;

    /* compiled from: ProfileProPassportItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileProPassportItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileProPassportItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ProfileProPassportItem.class, parcel, arrayList, iL2, 1);
            }
            return new ProfileProPassportItem(string, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileProPassportItem[] newArray(int i12) {
            return new ProfileProPassportItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileProPassportItem(@k String str, @k List<? extends PassportProfileItem> list, boolean z12) {
        this.f223381b = str;
        this.f223382c = list;
        this.f223383d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileProPassportItem)) {
            return false;
        }
        ProfileProPassportItem profileProPassportItem = (ProfileProPassportItem) obj;
        return L.f(this.f223381b, profileProPassportItem.f223381b) && L.f(this.f223382c, profileProPassportItem.f223382c) && this.f223383d == profileProPassportItem.f223383d;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF208001b() {
        return this.f223381b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f223383d) + H.e(this.f223381b.hashCode() * 31, 31, this.f223382c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileProPassportItem(stringId=");
        sb2.append(this.f223381b);
        sb2.append(", profileItems=");
        sb2.append(this.f223382c);
        sb2.append(", hasProfileBadgesInItems=");
        return r.x(sb2, this.f223383d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f223381b);
        Iterator itJ = C0.j(this.f223382c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f223383d ? 1 : 0);
    }

    public /* synthetic */ ProfileProPassportItem(String str, List list, boolean z12, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? false : z12);
    }
}
