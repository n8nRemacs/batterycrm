package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.str_booking.network.models.common.Button;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserInfoSection.kt */
@d
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR$\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/UserInfoContent;", "Landroid/os/Parcelable;", "", "name", "image", "Lcom/avito/android/remote/model/UniversalImage;", "themedImage", "", "isActive", "Lcom/avito/android/str_booking/network/models/sections/Rating;", "rating", "", "Lcom/avito/android/str_booking/network/models/common/Button;", "buttons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/Boolean;Lcom/avito/android/str_booking/network/models/sections/Rating;Ljava/util/List;)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getImage", "Lcom/avito/android/remote/model/UniversalImage;", "e", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/Boolean;", "f", "()Ljava/lang/Boolean;", "Lcom/avito/android/str_booking/network/models/sections/Rating;", "d", "()Lcom/avito/android/str_booking/network/models/sections/Rating;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UserInfoContent implements Parcelable {

    @k
    public static final Parcelable.Creator<UserInfoContent> CREATOR = new a();

    @c("buttons")
    @l
    private final List<Button> buttons;

    @c("image")
    @l
    private final String image;

    @c("isActive")
    @l
    private final Boolean isActive;

    @c("name")
    @l
    private final String name;

    @c("rating")
    @l
    private final Rating rating;

    @c("themedImage")
    @l
    private final UniversalImage themedImage;

    /* compiled from: UserInfoSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserInfoContent> {
        @Override // android.os.Parcelable.Creator
        public final UserInfoContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(UserInfoContent.class.getClassLoader());
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Rating ratingCreateFromParcel = parcel.readInt() == 0 ? null : Rating.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel));
                }
            }
            return new UserInfoContent(string, string2, universalImage, boolValueOf, ratingCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final UserInfoContent[] newArray(int i12) {
            return new UserInfoContent[i12];
        }
    }

    public UserInfoContent(@l String str, @l String str2, @l UniversalImage universalImage, @l Boolean bool, @l Rating rating, @l List<Button> list) {
        this.name = str;
        this.image = str2;
        this.themedImage = universalImage;
        this.isActive = bool;
        this.rating = rating;
        this.buttons = list;
    }

    @l
    public final List<Button> c() {
        return this.buttons;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Rating getRating() {
        return this.rating;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final UniversalImage getThemedImage() {
        return this.themedImage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfoContent)) {
            return false;
        }
        UserInfoContent userInfoContent = (UserInfoContent) obj;
        return L.f(this.name, userInfoContent.name) && L.f(this.image, userInfoContent.image) && L.f(this.themedImage, userInfoContent.themedImage) && L.f(this.isActive, userInfoContent.isActive) && L.f(this.rating, userInfoContent.rating) && L.f(this.buttons, userInfoContent.buttons);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Boolean getIsActive() {
        return this.isActive;
    }

    @l
    public final String getImage() {
        return this.image;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.themedImage;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        Boolean bool = this.isActive;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Rating rating = this.rating;
        int iHashCode5 = (iHashCode4 + (rating == null ? 0 : rating.hashCode())) * 31;
        List<Button> list = this.buttons;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserInfoContent(name=");
        sb2.append(this.name);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", themedImage=");
        sb2.append(this.themedImage);
        sb2.append(", isActive=");
        sb2.append(this.isActive);
        sb2.append(", rating=");
        sb2.append(this.rating);
        sb2.append(", buttons=");
        return H.p(sb2, this.buttons, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.name);
        parcel.writeString(this.image);
        parcel.writeParcelable(this.themedImage, i12);
        Boolean bool = this.isActive;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Rating rating = this.rating;
        if (rating == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rating.writeToParcel(parcel, i12);
        }
        List<Button> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            Button button = (Button) itA.next();
            if (button == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                button.writeToParcel(parcel, i12);
            }
        }
    }
}
