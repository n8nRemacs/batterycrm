package com.avito.android.component.user_hat;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PassportProfileKonveyor.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/PassportParticularProfileItem;", "Lcom/avito/android/component/user_hat/PassportProfileItem;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PassportParticularProfileItem implements PassportProfileItem {

    @k
    public static final Parcelable.Creator<PassportParticularProfileItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f125273b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f125274c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f125275d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f125276e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ProfileStatus f125277f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ProfileType f125278g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f125279h;

    /* compiled from: PassportProfileKonveyor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportParticularProfileItem> {
        @Override // android.os.Parcelable.Creator
        public final PassportParticularProfileItem createFromParcel(Parcel parcel) {
            return new PassportParticularProfileItem((Image) parcel.readParcelable(PassportParticularProfileItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, ProfileStatus.valueOf(parcel.readString()), ProfileType.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PassportParticularProfileItem[] newArray(int i12) {
            return new PassportParticularProfileItem[i12];
        }
    }

    public PassportParticularProfileItem(@l Image image, @l String str, @k String str2, boolean z12, @k ProfileStatus profileStatus, @k ProfileType profileType, @k String str3) {
        this.f125273b = image;
        this.f125274c = str;
        this.f125275d = str2;
        this.f125276e = z12;
        this.f125277f = profileStatus;
        this.f125278g = profileType;
        this.f125279h = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportParticularProfileItem)) {
            return false;
        }
        PassportParticularProfileItem passportParticularProfileItem = (PassportParticularProfileItem) obj;
        return L.f(this.f125273b, passportParticularProfileItem.f125273b) && L.f(this.f125274c, passportParticularProfileItem.f125274c) && L.f(this.f125275d, passportParticularProfileItem.f125275d) && this.f125276e == passportParticularProfileItem.f125276e && this.f125277f == passportParticularProfileItem.f125277f && this.f125278g == passportParticularProfileItem.f125278g && L.f(this.f125279h, passportParticularProfileItem.f125279h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF108399b() {
        return this.f125279h;
    }

    public final int hashCode() {
        Image image = this.f125273b;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        String str = this.f125274c;
        return this.f125279h.hashCode() + ((this.f125278g.hashCode() + ((this.f125277f.hashCode() + r.i(H.d((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f125275d), 31, this.f125276e)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportParticularProfileItem(image=");
        sb2.append(this.f125273b);
        sb2.append(", avatarStatus=");
        sb2.append(this.f125274c);
        sb2.append(", profileId=");
        sb2.append(this.f125275d);
        sb2.append(", isCurrent=");
        sb2.append(this.f125276e);
        sb2.append(", profileStatus=");
        sb2.append(this.f125277f);
        sb2.append(", profileType=");
        sb2.append(this.f125278g);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f125279h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f125273b, i12);
        parcel.writeString(this.f125274c);
        parcel.writeString(this.f125275d);
        parcel.writeInt(this.f125276e ? 1 : 0);
        parcel.writeString(this.f125277f.name());
        parcel.writeString(this.f125278g.name());
        parcel.writeString(this.f125279h);
    }

    public /* synthetic */ PassportParticularProfileItem(Image image, String str, String str2, boolean z12, ProfileStatus profileStatus, ProfileType profileType, String str3, int i12, C42822w c42822w) {
        this(image, (i12 & 2) != 0 ? null : str, str2, (i12 & 8) != 0 ? false : z12, (i12 & 16) != 0 ? ProfileStatus.f125286d : profileStatus, (i12 & 32) != 0 ? ProfileType.f125289b : profileType, (i12 & 64) != 0 ? str2 : str3);
    }
}
