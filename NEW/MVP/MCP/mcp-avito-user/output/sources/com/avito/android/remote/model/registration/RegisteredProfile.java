package com.avito.android.remote.model.registration;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RegisteredProfile.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019Jf\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0011J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b%\u0010 J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u0011R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b\f\u0010\u0019R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b\r\u0010\u0019¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/registration/RegisteredProfile;", "Landroid/os/Parcelable;", "", "name", "description", "Lcom/avito/android/remote/model/Image;", "avatar", "login", "", "Lcom/avito/android/remote/model/registration/ProfileSocial;", "social", "", "isNeedWarning", "isPassport", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/Image;", "component4", "component5", "()Ljava/util/List;", "component6", "()Ljava/lang/Boolean;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/avito/android/remote/model/registration/RegisteredProfile;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getDescription", "Lcom/avito/android/remote/model/Image;", "getAvatar", "getLogin", "Ljava/util/List;", "getSocial", "Ljava/lang/Boolean;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class RegisteredProfile implements Parcelable {

    @k
    public static final Parcelable.Creator<RegisteredProfile> CREATOR = new Creator();

    @c("avatar")
    @k
    private final Image avatar;

    @c("description")
    @l
    private final String description;

    @c("need_warning")
    @l
    private final Boolean isNeedWarning;

    @c("is_passport")
    @l
    private final Boolean isPassport;

    @c("login")
    @l
    private final String login;

    @c("name")
    @k
    private final String name;

    @c("social")
    @l
    private final List<ProfileSocial> social;

    /* compiled from: RegisteredProfile.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RegisteredProfile> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RegisteredProfile createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            Image image = (Image) parcel.readParcelable(RegisteredProfile.class.getClassLoader());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(ProfileSocial.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RegisteredProfile(string, string2, image, string3, arrayList, boolValueOf, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final RegisteredProfile[] newArray(int i12) {
            return new RegisteredProfile[i12];
        }
    }

    public RegisteredProfile(@k String str, @l String str2, @k Image image, @l String str3, @l List<ProfileSocial> list, @l Boolean bool, @l Boolean bool2) {
        this.name = str;
        this.description = str2;
        this.avatar = image;
        this.login = str3;
        this.social = list;
        this.isNeedWarning = bool;
        this.isPassport = bool2;
    }

    public static /* synthetic */ RegisteredProfile copy$default(RegisteredProfile registeredProfile, String str, String str2, Image image, String str3, List list, Boolean bool, Boolean bool2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = registeredProfile.name;
        }
        if ((i12 & 2) != 0) {
            str2 = registeredProfile.description;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            image = registeredProfile.avatar;
        }
        Image image2 = image;
        if ((i12 & 8) != 0) {
            str3 = registeredProfile.login;
        }
        String str5 = str3;
        if ((i12 & 16) != 0) {
            list = registeredProfile.social;
        }
        List list2 = list;
        if ((i12 & 32) != 0) {
            bool = registeredProfile.isNeedWarning;
        }
        Boolean bool3 = bool;
        if ((i12 & 64) != 0) {
            bool2 = registeredProfile.isPassport;
        }
        return registeredProfile.copy(str, str4, image2, str5, list2, bool3, bool2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getLogin() {
        return this.login;
    }

    @l
    public final List<ProfileSocial> component5() {
        return this.social;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Boolean getIsNeedWarning() {
        return this.isNeedWarning;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Boolean getIsPassport() {
        return this.isPassport;
    }

    @k
    public final RegisteredProfile copy(@k String name, @l String description, @k Image avatar, @l String login, @l List<ProfileSocial> social, @l Boolean isNeedWarning, @l Boolean isPassport) {
        return new RegisteredProfile(name, description, avatar, login, social, isNeedWarning, isPassport);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisteredProfile)) {
            return false;
        }
        RegisteredProfile registeredProfile = (RegisteredProfile) other;
        return L.f(this.name, registeredProfile.name) && L.f(this.description, registeredProfile.description) && L.f(this.avatar, registeredProfile.avatar) && L.f(this.login, registeredProfile.login) && L.f(this.social, registeredProfile.social) && L.f(this.isNeedWarning, registeredProfile.isNeedWarning) && L.f(this.isPassport, registeredProfile.isPassport);
    }

    @k
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final String getLogin() {
        return this.login;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @l
    public final List<ProfileSocial> getSocial() {
        return this.social;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.description;
        int iG2 = a.g(this.avatar, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.login;
        int iHashCode2 = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ProfileSocial> list = this.social;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isNeedWarning;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isPassport;
        return iHashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @l
    public final Boolean isNeedWarning() {
        return this.isNeedWarning;
    }

    @l
    public final Boolean isPassport() {
        return this.isPassport;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RegisteredProfile(name=");
        sb2.append(this.name);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", avatar=");
        sb2.append(this.avatar);
        sb2.append(", login=");
        sb2.append(this.login);
        sb2.append(", social=");
        sb2.append(this.social);
        sb2.append(", isNeedWarning=");
        sb2.append(this.isNeedWarning);
        sb2.append(", isPassport=");
        return C0.g(sb2, this.isPassport, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.login);
        List<ProfileSocial> list = this.social;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((ProfileSocial) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Boolean bool = this.isNeedWarning;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isPassport;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }
}
