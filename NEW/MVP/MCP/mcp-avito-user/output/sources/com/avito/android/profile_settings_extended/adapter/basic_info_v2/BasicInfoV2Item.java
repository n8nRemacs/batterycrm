package com.avito.android.profile_settings_extended.adapter.basic_info_v2;

import Rb0.InterfaceC15025a;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.grid.GridElementType;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_extended.adapter.SettingsListItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.extended.BasicInfoV2Widget;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BasicInfoV2Item.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/basic_info_v2/BasicInfoV2Item;", "Lcom/avito/android/profile_settings_extended/adapter/SettingsListItem;", "LRb0/a;", "Avatar", "Onboarding", "PersonalLink", "ServicesProfileType", "Verification", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BasicInfoV2Item implements SettingsListItem, InterfaceC15025a {

    @k
    public static final Parcelable.Creator<BasicInfoV2Item> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229206b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f229207c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f229208d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f229209e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f229210f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f229211g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f229212h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ModerationStatus f229213i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Avatar f229214j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Verification f229215k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final PersonalLink f229216l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final ServicesProfileType f229217m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final BasicInfoV2Widget.DisableVerticalAction f229218n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final BasicInfoV2Widget.EditorConfig f229219o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f229220p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final GridElementType.FullWidth f229221q;

    /* compiled from: BasicInfoV2Item.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/basic_info_v2/BasicInfoV2Item$Avatar;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Avatar implements Parcelable {

        @k
        public static final Parcelable.Creator<Avatar> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Image f229222b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f229223c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final ModerationStatus f229224d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f229225e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f229226f;

        /* compiled from: BasicInfoV2Item.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Avatar> {
            @Override // android.os.Parcelable.Creator
            public final Avatar createFromParcel(Parcel parcel) {
                return new Avatar((Image) parcel.readParcelable(Avatar.class.getClassLoader()), parcel.readInt() != 0, (ModerationStatus) parcel.readParcelable(Avatar.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Avatar[] newArray(int i12) {
                return new Avatar[i12];
            }
        }

        public Avatar(@l Image image, boolean z12, @l ModerationStatus moderationStatus, @k String str, @k String str2) {
            this.f229222b = image;
            this.f229223c = z12;
            this.f229224d = moderationStatus;
            this.f229225e = str;
            this.f229226f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Avatar)) {
                return false;
            }
            Avatar avatar = (Avatar) obj;
            return L.f(this.f229222b, avatar.f229222b) && this.f229223c == avatar.f229223c && L.f(this.f229224d, avatar.f229224d) && L.f(this.f229225e, avatar.f229225e) && L.f(this.f229226f, avatar.f229226f);
        }

        public final int hashCode() {
            Image image = this.f229222b;
            int i12 = r.i((image == null ? 0 : image.hashCode()) * 31, 31, this.f229223c);
            ModerationStatus moderationStatus = this.f229224d;
            return this.f229226f.hashCode() + H.d((i12 + (moderationStatus != null ? moderationStatus.hashCode() : 0)) * 31, 31, this.f229225e);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Avatar(image=");
            sb2.append(this.f229222b);
            sb2.append(", hasAvatar=");
            sb2.append(this.f229223c);
            sb2.append(", moderationStatus=");
            sb2.append(this.f229224d);
            sb2.append(", loadNewActionTitle=");
            sb2.append(this.f229225e);
            sb2.append(", deleteActionTitle=");
            return C22026a.c(sb2, this.f229226f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f229222b, i12);
            parcel.writeInt(this.f229223c ? 1 : 0);
            parcel.writeParcelable(this.f229224d, i12);
            parcel.writeString(this.f229225e);
            parcel.writeString(this.f229226f);
        }
    }

    /* compiled from: BasicInfoV2Item.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/basic_info_v2/BasicInfoV2Item$Onboarding;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Onboarding implements Parcelable {

        @k
        public static final Parcelable.Creator<Onboarding> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229227b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f229228c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f229229d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f229230e;

        /* compiled from: BasicInfoV2Item.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Onboarding> {
            @Override // android.os.Parcelable.Creator
            public final Onboarding createFromParcel(Parcel parcel) {
                return new Onboarding(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Onboarding[] newArray(int i12) {
                return new Onboarding[i12];
            }
        }

        public Onboarding(@k String str, @k String str2, @k String str3, @l String str4) {
            this.f229227b = str;
            this.f229228c = str2;
            this.f229229d = str3;
            this.f229230e = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Onboarding)) {
                return false;
            }
            Onboarding onboarding = (Onboarding) obj;
            return L.f(this.f229227b, onboarding.f229227b) && L.f(this.f229228c, onboarding.f229228c) && L.f(this.f229229d, onboarding.f229229d) && L.f(this.f229230e, onboarding.f229230e);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f229227b.hashCode() * 31, 31, this.f229228c), 31, this.f229229d);
            String str = this.f229230e;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Onboarding(onceShowId=");
            sb2.append(this.f229227b);
            sb2.append(", subtitle=");
            sb2.append(this.f229228c);
            sb2.append(", title=");
            sb2.append(this.f229229d);
            sb2.append(", buttonTitle=");
            return C22026a.c(sb2, this.f229230e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f229227b);
            parcel.writeString(this.f229228c);
            parcel.writeString(this.f229229d);
            parcel.writeString(this.f229230e);
        }
    }

    /* compiled from: BasicInfoV2Item.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/basic_info_v2/BasicInfoV2Item$PersonalLink;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class PersonalLink implements Parcelable {

        @k
        public static final Parcelable.Creator<PersonalLink> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229231b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f229232c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f229233d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final DeepLink f229234e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final ModerationStatus f229235f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final String f229236g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f229237h;

        /* compiled from: BasicInfoV2Item.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PersonalLink> {
            @Override // android.os.Parcelable.Creator
            public final PersonalLink createFromParcel(Parcel parcel) {
                return new PersonalLink(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(PersonalLink.class.getClassLoader()), (ModerationStatus) parcel.readParcelable(PersonalLink.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PersonalLink[] newArray(int i12) {
                return new PersonalLink[i12];
            }
        }

        public PersonalLink(@k String str, @k String str2, @k String str3, @l DeepLink deepLink, @l ModerationStatus moderationStatus, @k String str4, @k String str5) {
            this.f229231b = str;
            this.f229232c = str2;
            this.f229233d = str3;
            this.f229234e = deepLink;
            this.f229235f = moderationStatus;
            this.f229236g = str4;
            this.f229237h = str5;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PersonalLink)) {
                return false;
            }
            PersonalLink personalLink = (PersonalLink) obj;
            return L.f(this.f229231b, personalLink.f229231b) && L.f(this.f229232c, personalLink.f229232c) && L.f(this.f229233d, personalLink.f229233d) && L.f(this.f229234e, personalLink.f229234e) && L.f(this.f229235f, personalLink.f229235f) && L.f(this.f229236g, personalLink.f229236g) && L.f(this.f229237h, personalLink.f229237h);
        }

        public final int hashCode() {
            int iD2 = H.d(H.d(this.f229231b.hashCode() * 31, 31, this.f229232c), 31, this.f229233d);
            DeepLink deepLink = this.f229234e;
            int iHashCode = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            ModerationStatus moderationStatus = this.f229235f;
            return this.f229237h.hashCode() + H.d((iHashCode + (moderationStatus != null ? moderationStatus.hashCode() : 0)) * 31, 31, this.f229236g);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PersonalLink(personalLink=");
            sb2.append(this.f229231b);
            sb2.append(", urlToCopy=");
            sb2.append(this.f229232c);
            sb2.append(", prefixedPersonalLink=");
            sb2.append(this.f229233d);
            sb2.append(", deeplink=");
            sb2.append(this.f229234e);
            sb2.append(", moderationStatus=");
            sb2.append(this.f229235f);
            sb2.append(", shareTitle=");
            sb2.append(this.f229236g);
            sb2.append(", myProfileTitle=");
            return C22026a.c(sb2, this.f229237h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f229231b);
            parcel.writeString(this.f229232c);
            parcel.writeString(this.f229233d);
            parcel.writeParcelable(this.f229234e, i12);
            parcel.writeParcelable(this.f229235f, i12);
            parcel.writeString(this.f229236g);
            parcel.writeString(this.f229237h);
        }
    }

    /* compiled from: BasicInfoV2Item.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/basic_info_v2/BasicInfoV2Item$ServicesProfileType;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class ServicesProfileType implements Parcelable {

        @k
        public static final Parcelable.Creator<ServicesProfileType> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f229238b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Onboarding f229239c;

        /* compiled from: BasicInfoV2Item.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ServicesProfileType> {
            @Override // android.os.Parcelable.Creator
            public final ServicesProfileType createFromParcel(Parcel parcel) {
                return new ServicesProfileType(parcel.readString(), Onboarding.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ServicesProfileType[] newArray(int i12) {
                return new ServicesProfileType[i12];
            }
        }

        public ServicesProfileType(@k String str, @k Onboarding onboarding) {
            this.f229238b = str;
            this.f229239c = onboarding;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServicesProfileType)) {
                return false;
            }
            ServicesProfileType servicesProfileType = (ServicesProfileType) obj;
            return L.f(this.f229238b, servicesProfileType.f229238b) && L.f(this.f229239c, servicesProfileType.f229239c);
        }

        public final int hashCode() {
            return this.f229239c.hashCode() + (this.f229238b.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ServicesProfileType(title=" + this.f229238b + ", onboarding=" + this.f229239c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f229238b);
            this.f229239c.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: BasicInfoV2Item.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/basic_info_v2/BasicInfoV2Item$Verification;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Verification implements Parcelable {

        @k
        public static final Parcelable.Creator<Verification> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @l
        public final BasicInfoV2Widget.VerificationStatus f229240b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f229241c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f229242d;

        /* compiled from: BasicInfoV2Item.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Verification> {
            @Override // android.os.Parcelable.Creator
            public final Verification createFromParcel(Parcel parcel) {
                return new Verification(parcel.readInt() == 0 ? null : BasicInfoV2Widget.VerificationStatus.valueOf(parcel.readString()), parcel.readString(), (DeepLink) parcel.readParcelable(Verification.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Verification[] newArray(int i12) {
                return new Verification[i12];
            }
        }

        public Verification(@l BasicInfoV2Widget.VerificationStatus verificationStatus, @k String str, @l DeepLink deepLink) {
            this.f229240b = verificationStatus;
            this.f229241c = str;
            this.f229242d = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Verification)) {
                return false;
            }
            Verification verification = (Verification) obj;
            return this.f229240b == verification.f229240b && L.f(this.f229241c, verification.f229241c) && L.f(this.f229242d, verification.f229242d);
        }

        public final int hashCode() {
            BasicInfoV2Widget.VerificationStatus verificationStatus = this.f229240b;
            int iD2 = H.d((verificationStatus == null ? 0 : verificationStatus.hashCode()) * 31, 31, this.f229241c);
            DeepLink deepLink = this.f229242d;
            return iD2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Verification(status=");
            sb2.append(this.f229240b);
            sb2.append(", title=");
            sb2.append(this.f229241c);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f229242d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            BasicInfoV2Widget.VerificationStatus verificationStatus = this.f229240b;
            if (verificationStatus == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(verificationStatus.name());
            }
            parcel.writeString(this.f229241c);
            parcel.writeParcelable(this.f229242d, i12);
        }
    }

    /* compiled from: BasicInfoV2Item.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BasicInfoV2Item> {
        @Override // android.os.Parcelable.Creator
        public final BasicInfoV2Item createFromParcel(Parcel parcel) {
            return new BasicInfoV2Item(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (ModerationStatus) parcel.readParcelable(BasicInfoV2Item.class.getClassLoader()), Avatar.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Verification.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : PersonalLink.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ServicesProfileType.CREATOR.createFromParcel(parcel) : null, (BasicInfoV2Widget.DisableVerticalAction) parcel.readParcelable(BasicInfoV2Item.class.getClassLoader()), (BasicInfoV2Widget.EditorConfig) parcel.readParcelable(BasicInfoV2Item.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BasicInfoV2Item[] newArray(int i12) {
            return new BasicInfoV2Item[i12];
        }
    }

    public BasicInfoV2Item(@k String str, @l String str2, @l String str3, @k String str4, @k String str5, @l String str6, @l String str7, @l ModerationStatus moderationStatus, @k Avatar avatar, @l Verification verification, @l PersonalLink personalLink, @l ServicesProfileType servicesProfileType, @l BasicInfoV2Widget.DisableVerticalAction disableVerticalAction, @k BasicInfoV2Widget.EditorConfig editorConfig, boolean z12) {
        this.f229206b = str;
        this.f229207c = str2;
        this.f229208d = str3;
        this.f229209e = str4;
        this.f229210f = str5;
        this.f229211g = str6;
        this.f229212h = str7;
        this.f229213i = moderationStatus;
        this.f229214j = avatar;
        this.f229215k = verification;
        this.f229216l = personalLink;
        this.f229217m = servicesProfileType;
        this.f229218n = disableVerticalAction;
        this.f229219o = editorConfig;
        this.f229220p = z12;
        this.f229221q = GridElementType.FullWidth.f161209b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicInfoV2Item)) {
            return false;
        }
        BasicInfoV2Item basicInfoV2Item = (BasicInfoV2Item) obj;
        return L.f(this.f229206b, basicInfoV2Item.f229206b) && L.f(this.f229207c, basicInfoV2Item.f229207c) && L.f(this.f229208d, basicInfoV2Item.f229208d) && L.f(this.f229209e, basicInfoV2Item.f229209e) && L.f(this.f229210f, basicInfoV2Item.f229210f) && L.f(this.f229211g, basicInfoV2Item.f229211g) && L.f(this.f229212h, basicInfoV2Item.f229212h) && L.f(this.f229213i, basicInfoV2Item.f229213i) && L.f(this.f229214j, basicInfoV2Item.f229214j) && L.f(this.f229215k, basicInfoV2Item.f229215k) && L.f(this.f229216l, basicInfoV2Item.f229216l) && L.f(this.f229217m, basicInfoV2Item.f229217m) && L.f(this.f229218n, basicInfoV2Item.f229218n) && L.f(this.f229219o, basicInfoV2Item.f229219o) && this.f229220p == basicInfoV2Item.f229220p;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public final GridElementType getF154486c() {
        return this.f229221q;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84654b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF215050i() {
        return this.f229206b;
    }

    public final int hashCode() {
        int iHashCode = this.f229206b.hashCode() * 31;
        String str = this.f229207c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f229208d;
        int iD2 = H.d(H.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f229209e), 31, this.f229210f);
        String str3 = this.f229211g;
        int iHashCode3 = (iD2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f229212h;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ModerationStatus moderationStatus = this.f229213i;
        int iHashCode5 = (this.f229214j.hashCode() + ((iHashCode4 + (moderationStatus == null ? 0 : moderationStatus.hashCode())) * 31)) * 31;
        Verification verification = this.f229215k;
        int iHashCode6 = (iHashCode5 + (verification == null ? 0 : verification.hashCode())) * 31;
        PersonalLink personalLink = this.f229216l;
        int iHashCode7 = (iHashCode6 + (personalLink == null ? 0 : personalLink.hashCode())) * 31;
        ServicesProfileType servicesProfileType = this.f229217m;
        int iHashCode8 = (iHashCode7 + (servicesProfileType == null ? 0 : servicesProfileType.hashCode())) * 31;
        BasicInfoV2Widget.DisableVerticalAction disableVerticalAction = this.f229218n;
        int iHashCode9 = disableVerticalAction != null ? disableVerticalAction.hashCode() : 0;
        return Boolean.hashCode(this.f229220p) + ((this.f229219o.hashCode() + ((iHashCode8 + iHashCode9) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BasicInfoV2Item(stringId=");
        sb2.append(this.f229206b);
        sb2.append(", profileType=");
        sb2.append(this.f229207c);
        sb2.append(", registeredTime=");
        sb2.append(this.f229208d);
        sb2.append(", userId=");
        sb2.append(this.f229209e);
        sb2.append(", userIdToCopy=");
        sb2.append(this.f229210f);
        sb2.append(", profileCategory=");
        sb2.append(this.f229211g);
        sb2.append(", userName=");
        sb2.append(this.f229212h);
        sb2.append(", userNameModerationStatus=");
        sb2.append(this.f229213i);
        sb2.append(", avatar=");
        sb2.append(this.f229214j);
        sb2.append(", verification=");
        sb2.append(this.f229215k);
        sb2.append(", personalLink=");
        sb2.append(this.f229216l);
        sb2.append(", servicesSellerType=");
        sb2.append(this.f229217m);
        sb2.append(", disableVerticalAction=");
        sb2.append(this.f229218n);
        sb2.append(", editorConfig=");
        sb2.append(this.f229219o);
        sb2.append(", isActive=");
        return r.x(sb2, this.f229220p, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229206b);
        parcel.writeString(this.f229207c);
        parcel.writeString(this.f229208d);
        parcel.writeString(this.f229209e);
        parcel.writeString(this.f229210f);
        parcel.writeString(this.f229211g);
        parcel.writeString(this.f229212h);
        parcel.writeParcelable(this.f229213i, i12);
        this.f229214j.writeToParcel(parcel, i12);
        Verification verification = this.f229215k;
        if (verification == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verification.writeToParcel(parcel, i12);
        }
        PersonalLink personalLink = this.f229216l;
        if (personalLink == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            personalLink.writeToParcel(parcel, i12);
        }
        ServicesProfileType servicesProfileType = this.f229217m;
        if (servicesProfileType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            servicesProfileType.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f229218n, i12);
        parcel.writeParcelable(this.f229219o, i12);
        parcel.writeInt(this.f229220p ? 1 : 0);
    }

    public /* synthetic */ BasicInfoV2Item(String str, String str2, String str3, String str4, String str5, String str6, String str7, ModerationStatus moderationStatus, Avatar avatar, Verification verification, PersonalLink personalLink, ServicesProfileType servicesProfileType, BasicInfoV2Widget.DisableVerticalAction disableVerticalAction, BasicInfoV2Widget.EditorConfig editorConfig, boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "basic_info_v2_item" : str, str2, str3, str4, str5, str6, str7, moderationStatus, avatar, verification, personalLink, servicesProfileType, disableVerticalAction, editorConfig, z12);
    }
}
