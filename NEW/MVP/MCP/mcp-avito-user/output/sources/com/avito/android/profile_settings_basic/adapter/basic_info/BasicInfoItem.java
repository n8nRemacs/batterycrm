package com.avito.android.profile_settings_basic.adapter.basic_info;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_basic.adapter.BasicSettingsListItem;
import com.avito.android.profile_settings_basic.mvi.entity.BasicInfoAvatarAction;
import com.avito.android.remote.model.AvatarShape;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.basic.BasicInfoWidgetAvatarAction;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BasicInfoItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/basic_info/BasicInfoItem;", "Lcom/avito/android/profile_settings_basic/adapter/BasicSettingsListItem;", "AvatarAction", "Icon", "Info", "TextField", "Tooltip", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BasicInfoItem implements BasicSettingsListItem {

    @Y61.k
    public static final Parcelable.Creator<BasicInfoItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f228582b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ModerationStatus f228583c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Image f228584d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Uri f228585e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AvatarShape f228586f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f228587g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final TextField f228588h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final ModerationStatus f228589i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f228590j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f228591k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final List<TextField> f228592l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final List<AvatarAction> f228593m;

    /* compiled from: BasicInfoItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/basic_info/BasicInfoItem$AvatarAction;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class AvatarAction implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<AvatarAction> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f228594b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final BasicInfoAvatarAction f228595c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final BasicInfoWidgetAvatarAction.AvatarActionIconType f228596d;

        /* compiled from: BasicInfoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AvatarAction> {
            @Override // android.os.Parcelable.Creator
            public final AvatarAction createFromParcel(Parcel parcel) {
                return new AvatarAction(parcel.readString(), (BasicInfoAvatarAction) parcel.readParcelable(AvatarAction.class.getClassLoader()), BasicInfoWidgetAvatarAction.AvatarActionIconType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final AvatarAction[] newArray(int i12) {
                return new AvatarAction[i12];
            }
        }

        public AvatarAction(@Y61.k String str, @Y61.k BasicInfoAvatarAction basicInfoAvatarAction, @Y61.k BasicInfoWidgetAvatarAction.AvatarActionIconType avatarActionIconType) {
            this.f228594b = str;
            this.f228595c = basicInfoAvatarAction;
            this.f228596d = avatarActionIconType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AvatarAction)) {
                return false;
            }
            AvatarAction avatarAction = (AvatarAction) obj;
            return L.f(this.f228594b, avatarAction.f228594b) && L.f(this.f228595c, avatarAction.f228595c) && this.f228596d == avatarAction.f228596d;
        }

        public final int hashCode() {
            return this.f228596d.hashCode() + ((this.f228595c.hashCode() + (this.f228594b.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            return "AvatarAction(title=" + this.f228594b + ", action=" + this.f228595c + ", iconType=" + this.f228596d + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f228594b);
            parcel.writeParcelable(this.f228595c, i12);
            parcel.writeString(this.f228596d.name());
        }
    }

    /* compiled from: BasicInfoItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/basic_info/BasicInfoItem$Icon;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Icon implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Icon> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f228597b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f228598c;

        /* compiled from: BasicInfoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Icon> {
            @Override // android.os.Parcelable.Creator
            public final Icon createFromParcel(Parcel parcel) {
                return new Icon(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Icon[] newArray(int i12) {
                return new Icon[i12];
            }
        }

        public Icon(@Y61.l String str, @Y61.l String str2) {
            this.f228597b = str;
            this.f228598c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return L.f(this.f228597b, icon.f228597b) && L.f(this.f228598c, icon.f228598c);
        }

        public final int hashCode() {
            String str = this.f228597b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f228598c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Icon(iconName=");
            sb2.append(this.f228597b);
            sb2.append(", color=");
            return C22026a.c(sb2, this.f228598c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f228597b);
            parcel.writeString(this.f228598c);
        }
    }

    /* compiled from: BasicInfoItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/basic_info/BasicInfoItem$Info;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Info implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f228599b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f228600c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f228601d;

        /* compiled from: BasicInfoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Info> {
            @Override // android.os.Parcelable.Creator
            public final Info createFromParcel(Parcel parcel) {
                return new Info(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Info[] newArray(int i12) {
                return new Info[i12];
            }
        }

        public Info(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
            this.f228599b = str;
            this.f228600c = str2;
            this.f228601d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return L.f(this.f228599b, info.f228599b) && L.f(this.f228600c, info.f228600c) && L.f(this.f228601d, info.f228601d);
        }

        public final int hashCode() {
            String str = this.f228599b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f228600c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f228601d;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Info(title=");
            sb2.append(this.f228599b);
            sb2.append(", subtitle=");
            sb2.append(this.f228600c);
            sb2.append(", buttonTitle=");
            return C22026a.c(sb2, this.f228601d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f228599b);
            parcel.writeString(this.f228600c);
            parcel.writeString(this.f228601d);
        }
    }

    /* compiled from: BasicInfoItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/basic_info/BasicInfoItem$Tooltip;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Tooltip implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Tooltip> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f228610b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f228611c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f228612d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f228613e;

        /* compiled from: BasicInfoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Tooltip> {
            @Override // android.os.Parcelable.Creator
            public final Tooltip createFromParcel(Parcel parcel) {
                return new Tooltip(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Tooltip[] newArray(int i12) {
                return new Tooltip[i12];
            }
        }

        public Tooltip(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
            this.f228610b = str;
            this.f228611c = str2;
            this.f228612d = str3;
            this.f228613e = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tooltip)) {
                return false;
            }
            Tooltip tooltip = (Tooltip) obj;
            return L.f(this.f228610b, tooltip.f228610b) && L.f(this.f228611c, tooltip.f228611c) && L.f(this.f228612d, tooltip.f228612d) && L.f(this.f228613e, tooltip.f228613e);
        }

        public final int hashCode() {
            String str = this.f228610b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f228611c;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f228612d;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f228613e;
            return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Tooltip(title=");
            sb2.append(this.f228610b);
            sb2.append(", subtitle=");
            sb2.append(this.f228611c);
            sb2.append(", buttonTitle=");
            sb2.append(this.f228612d);
            sb2.append(", onceShowId=");
            return C22026a.c(sb2, this.f228613e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f228610b);
            parcel.writeString(this.f228611c);
            parcel.writeString(this.f228612d);
            parcel.writeString(this.f228613e);
        }
    }

    /* compiled from: BasicInfoItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BasicInfoItem> {
        @Override // android.os.Parcelable.Creator
        public final BasicInfoItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            ModerationStatus moderationStatus = (ModerationStatus) parcel.readParcelable(BasicInfoItem.class.getClassLoader());
            Image image = (Image) parcel.readParcelable(BasicInfoItem.class.getClassLoader());
            Uri uri = (Uri) parcel.readParcelable(BasicInfoItem.class.getClassLoader());
            AvatarShape avatarShapeValueOf = AvatarShape.valueOf(parcel.readString());
            String string2 = parcel.readString();
            TextField textFieldCreateFromParcel = parcel.readInt() == 0 ? null : TextField.CREATOR.createFromParcel(parcel);
            ModerationStatus moderationStatus2 = (ModerationStatus) parcel.readParcelable(BasicInfoItem.class.getClassLoader());
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(TextField.CREATOR, parcel, arrayList, iC2, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iC3 = 0;
            while (iC3 != i13) {
                iC3 = com.avito.android.actions_sheet.a.c(AvatarAction.CREATOR, parcel, arrayList2, iC3, 1);
                i13 = i13;
            }
            return new BasicInfoItem(string, moderationStatus, image, uri, avatarShapeValueOf, string2, textFieldCreateFromParcel, moderationStatus2, string3, string4, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final BasicInfoItem[] newArray(int i12) {
            return new BasicInfoItem[i12];
        }
    }

    public BasicInfoItem(@Y61.k String str, @Y61.l ModerationStatus moderationStatus, @Y61.l Image image, @Y61.l Uri uri, @Y61.k AvatarShape avatarShape, @Y61.l String str2, @Y61.l TextField textField, @Y61.l ModerationStatus moderationStatus2, @Y61.l String str3, @Y61.l String str4, @Y61.k List<TextField> list, @Y61.k List<AvatarAction> list2) {
        this.f228582b = str;
        this.f228583c = moderationStatus;
        this.f228584d = image;
        this.f228585e = uri;
        this.f228586f = avatarShape;
        this.f228587g = str2;
        this.f228588h = textField;
        this.f228589i = moderationStatus2;
        this.f228590j = str3;
        this.f228591k = str4;
        this.f228592l = list;
        this.f228593m = list2;
    }

    public static BasicInfoItem a(BasicInfoItem basicInfoItem, ModerationStatus moderationStatus, Image image, Uri uri, List list, int i12) {
        return new BasicInfoItem(basicInfoItem.f228582b, (i12 & 2) != 0 ? basicInfoItem.f228583c : moderationStatus, (i12 & 4) != 0 ? basicInfoItem.f228584d : image, uri, basicInfoItem.f228586f, basicInfoItem.f228587g, basicInfoItem.f228588h, basicInfoItem.f228589i, basicInfoItem.f228590j, basicInfoItem.f228591k, basicInfoItem.f228592l, (i12 & 2048) != 0 ? basicInfoItem.f228593m : list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicInfoItem)) {
            return false;
        }
        BasicInfoItem basicInfoItem = (BasicInfoItem) obj;
        return L.f(this.f228582b, basicInfoItem.f228582b) && L.f(this.f228583c, basicInfoItem.f228583c) && L.f(this.f228584d, basicInfoItem.f228584d) && L.f(this.f228585e, basicInfoItem.f228585e) && this.f228586f == basicInfoItem.f228586f && L.f(this.f228587g, basicInfoItem.f228587g) && L.f(this.f228588h, basicInfoItem.f228588h) && L.f(this.f228589i, basicInfoItem.f228589i) && L.f(this.f228590j, basicInfoItem.f228590j) && L.f(this.f228591k, basicInfoItem.f228591k) && L.f(this.f228592l, basicInfoItem.f228592l) && L.f(this.f228593m, basicInfoItem.f228593m);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229086b() {
        return this.f228582b;
    }

    public final int hashCode() {
        int iHashCode = this.f228582b.hashCode() * 31;
        ModerationStatus moderationStatus = this.f228583c;
        int iHashCode2 = (iHashCode + (moderationStatus == null ? 0 : moderationStatus.hashCode())) * 31;
        Image image = this.f228584d;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Uri uri = this.f228585e;
        int iHashCode4 = (this.f228586f.hashCode() + ((iHashCode3 + (uri == null ? 0 : uri.hashCode())) * 31)) * 31;
        String str = this.f228587g;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        TextField textField = this.f228588h;
        int iHashCode6 = (iHashCode5 + (textField == null ? 0 : textField.hashCode())) * 31;
        ModerationStatus moderationStatus2 = this.f228589i;
        int iHashCode7 = (iHashCode6 + (moderationStatus2 == null ? 0 : moderationStatus2.hashCode())) * 31;
        String str2 = this.f228590j;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f228591k;
        return this.f228593m.hashCode() + H.e((iHashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f228592l);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BasicInfoItem(stringId=");
        sb2.append(this.f228582b);
        sb2.append(", avatarModerationStatus=");
        sb2.append(this.f228583c);
        sb2.append(", avatarImage=");
        sb2.append(this.f228584d);
        sb2.append(", avatarUploadingImage=");
        sb2.append(this.f228585e);
        sb2.append(", avatarShape=");
        sb2.append(this.f228586f);
        sb2.append(", nameFieldName=");
        sb2.append(this.f228587g);
        sb2.append(", name=");
        sb2.append(this.f228588h);
        sb2.append(", nameModerationStatus=");
        sb2.append(this.f228589i);
        sb2.append(", nameEditorTitle=");
        sb2.append(this.f228590j);
        sb2.append(", nameEditorPlaceholder=");
        sb2.append(this.f228591k);
        sb2.append(", textFields=");
        sb2.append(this.f228592l);
        sb2.append(", avatarActions=");
        return H.p(sb2, this.f228593m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f228582b);
        parcel.writeParcelable(this.f228583c, i12);
        parcel.writeParcelable(this.f228584d, i12);
        parcel.writeParcelable(this.f228585e, i12);
        parcel.writeString(this.f228586f.name());
        parcel.writeString(this.f228587g);
        TextField textField = this.f228588h;
        if (textField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            textField.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f228589i, i12);
        parcel.writeString(this.f228590j);
        parcel.writeString(this.f228591k);
        Iterator itJ = C0.j(this.f228592l, parcel);
        while (itJ.hasNext()) {
            ((TextField) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.f228593m, parcel);
        while (itJ2.hasNext()) {
            ((AvatarAction) itJ2.next()).writeToParcel(parcel, i12);
        }
    }

    /* compiled from: BasicInfoItem.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/adapter/basic_info/BasicInfoItem$TextField;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class TextField implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<TextField> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f228602b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f228603c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f228604d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Boolean f228605e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Icon f228606f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Info f228607g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final Tooltip f228608h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final DeepLink f228609i;

        /* compiled from: BasicInfoItem.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<TextField> {
            @Override // android.os.Parcelable.Creator
            public final TextField createFromParcel(Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new TextField(string, string2, string3, boolValueOf, parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Info.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Tooltip.CREATOR.createFromParcel(parcel) : null, (DeepLink) parcel.readParcelable(TextField.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final TextField[] newArray(int i12) {
                return new TextField[i12];
            }
        }

        public TextField(@Y61.l String str, @Y61.k String str2, @Y61.l String str3, @Y61.l Boolean bool, @Y61.l Icon icon, @Y61.l Info info, @Y61.l Tooltip tooltip, @Y61.l DeepLink deepLink) {
            this.f228602b = str;
            this.f228603c = str2;
            this.f228604d = str3;
            this.f228605e = bool;
            this.f228606f = icon;
            this.f228607g = info;
            this.f228608h = tooltip;
            this.f228609i = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextField)) {
                return false;
            }
            TextField textField = (TextField) obj;
            return L.f(this.f228602b, textField.f228602b) && L.f(this.f228603c, textField.f228603c) && L.f(this.f228604d, textField.f228604d) && L.f(this.f228605e, textField.f228605e) && L.f(this.f228606f, textField.f228606f) && L.f(this.f228607g, textField.f228607g) && L.f(this.f228608h, textField.f228608h) && L.f(this.f228609i, textField.f228609i);
        }

        public final int hashCode() {
            String str = this.f228602b;
            int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f228603c);
            String str2 = this.f228604d;
            int iHashCode = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.f228605e;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Icon icon = this.f228606f;
            int iHashCode3 = (iHashCode2 + (icon == null ? 0 : icon.hashCode())) * 31;
            Info info = this.f228607g;
            int iHashCode4 = (iHashCode3 + (info == null ? 0 : info.hashCode())) * 31;
            Tooltip tooltip = this.f228608h;
            int iHashCode5 = (iHashCode4 + (tooltip == null ? 0 : tooltip.hashCode())) * 31;
            DeepLink deepLink = this.f228609i;
            return iHashCode5 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextField(fieldName=");
            sb2.append(this.f228602b);
            sb2.append(", value=");
            sb2.append(this.f228603c);
            sb2.append(", description=");
            sb2.append(this.f228604d);
            sb2.append(", isEditable=");
            sb2.append(this.f228605e);
            sb2.append(", icon=");
            sb2.append(this.f228606f);
            sb2.append(", info=");
            sb2.append(this.f228607g);
            sb2.append(", tooltip=");
            sb2.append(this.f228608h);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f228609i, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f228602b);
            parcel.writeString(this.f228603c);
            parcel.writeString(this.f228604d);
            Boolean bool = this.f228605e;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
            Icon icon = this.f228606f;
            if (icon == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                icon.writeToParcel(parcel, i12);
            }
            Info info = this.f228607g;
            if (info == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                info.writeToParcel(parcel, i12);
            }
            Tooltip tooltip = this.f228608h;
            if (tooltip == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                tooltip.writeToParcel(parcel, i12);
            }
            parcel.writeParcelable(this.f228609i, i12);
        }

        public /* synthetic */ TextField(String str, String str2, String str3, Boolean bool, Icon icon, Info info, Tooltip tooltip, DeepLink deepLink, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : bool, (i12 & 16) != 0 ? null : icon, (i12 & 32) != 0 ? null : info, (i12 & 64) != 0 ? null : tooltip, (i12 & 128) != 0 ? null : deepLink);
        }
    }

    public /* synthetic */ BasicInfoItem(String str, ModerationStatus moderationStatus, Image image, Uri uri, AvatarShape avatarShape, String str2, TextField textField, ModerationStatus moderationStatus2, String str3, String str4, List list, List list2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "basic_info_item" : str, moderationStatus, image, uri, avatarShape, str2, textField, moderationStatus2, str3, str4, list, list2);
    }
}
