package com.avito.android.remote.model.information_about;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InformationAbout.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0002()B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/information_about/InformationAbout;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/information_about/InformationAbout$Icon;", "icon", "Lcom/avito/android/remote/model/information_about/InformationAbout$BottomSheetInfo;", "bottomSheetInfo", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/information_about/InformationAbout$Icon;Lcom/avito/android/remote/model/information_about/InformationAbout$BottomSheetInfo;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/information_about/InformationAbout$Icon;", "component3", "()Lcom/avito/android/remote/model/information_about/InformationAbout$BottomSheetInfo;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/information_about/InformationAbout$Icon;Lcom/avito/android/remote/model/information_about/InformationAbout$BottomSheetInfo;)Lcom/avito/android/remote/model/information_about/InformationAbout;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/information_about/InformationAbout$Icon;", "getIcon", "Lcom/avito/android/remote/model/information_about/InformationAbout$BottomSheetInfo;", "getBottomSheetInfo", "BottomSheetInfo", "Icon", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class InformationAbout implements Parcelable {

    @k
    public static final Parcelable.Creator<InformationAbout> CREATOR = new Creator();

    @c(TooltipAttribute.ATTRIBUTE_TYPE)
    @k
    private final BottomSheetInfo bottomSheetInfo;

    @c("icon")
    @l
    private final Icon icon;

    @c("text")
    @k
    private final String title;

    /* compiled from: InformationAbout.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InformationAbout> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InformationAbout createFromParcel(@k Parcel parcel) {
            return new InformationAbout(parcel.readString(), parcel.readInt() == 0 ? null : Icon.CREATOR.createFromParcel(parcel), BottomSheetInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final InformationAbout[] newArray(int i12) {
            return new InformationAbout[i12];
        }
    }

    public InformationAbout(@k String str, @l Icon icon, @k BottomSheetInfo bottomSheetInfo) {
        this.title = str;
        this.icon = icon;
        this.bottomSheetInfo = bottomSheetInfo;
    }

    public static /* synthetic */ InformationAbout copy$default(InformationAbout informationAbout, String str, Icon icon, BottomSheetInfo bottomSheetInfo, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = informationAbout.title;
        }
        if ((i12 & 2) != 0) {
            icon = informationAbout.icon;
        }
        if ((i12 & 4) != 0) {
            bottomSheetInfo = informationAbout.bottomSheetInfo;
        }
        return informationAbout.copy(str, icon, bottomSheetInfo);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final BottomSheetInfo getBottomSheetInfo() {
        return this.bottomSheetInfo;
    }

    @k
    public final InformationAbout copy(@k String title, @l Icon icon, @k BottomSheetInfo bottomSheetInfo) {
        return new InformationAbout(title, icon, bottomSheetInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InformationAbout)) {
            return false;
        }
        InformationAbout informationAbout = (InformationAbout) other;
        return L.f(this.title, informationAbout.title) && L.f(this.icon, informationAbout.icon) && L.f(this.bottomSheetInfo, informationAbout.bottomSheetInfo);
    }

    @k
    public final BottomSheetInfo getBottomSheetInfo() {
        return this.bottomSheetInfo;
    }

    @l
    public final Icon getIcon() {
        return this.icon;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Icon icon = this.icon;
        return this.bottomSheetInfo.hashCode() + ((iHashCode + (icon == null ? 0 : icon.hashCode())) * 31);
    }

    @k
    public String toString() {
        return "InformationAbout(title=" + this.title + ", icon=" + this.icon + ", bottomSheetInfo=" + this.bottomSheetInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Icon icon = this.icon;
        if (icon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, flags);
        }
        this.bottomSheetInfo.writeToParcel(parcel, flags);
    }

    /* compiled from: InformationAbout.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/information_about/InformationAbout$Icon;", "Landroid/os/Parcelable;", "", "name", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/information_about/InformationAbout$Icon;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Icon implements Parcelable {

        @k
        public static final Parcelable.Creator<Icon> CREATOR = new Creator();

        @c("color")
        @l
        private final String color;

        @c("name")
        @k
        private final String name;

        /* compiled from: InformationAbout.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Icon> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Icon createFromParcel(@k Parcel parcel) {
                return new Icon(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Icon[] newArray(int i12) {
                return new Icon[i12];
            }
        }

        public Icon(@k String str, @l String str2) {
            this.name = str;
            this.color = str2;
        }

        public static /* synthetic */ Icon copy$default(Icon icon, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = icon.name;
            }
            if ((i12 & 2) != 0) {
                str2 = icon.color;
            }
            return icon.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getColor() {
            return this.color;
        }

        @k
        public final Icon copy(@k String name, @l String color) {
            return new Icon(name, color);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return L.f(this.name, icon.name) && L.f(this.color, icon.color);
        }

        @l
        public final String getColor() {
            return this.color;
        }

        @k
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            int iHashCode = this.name.hashCode() * 31;
            String str = this.color;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Icon(name=");
            sb2.append(this.name);
            sb2.append(", color=");
            return C22026a.c(sb2, this.color, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.name);
            parcel.writeString(this.color);
        }

        public /* synthetic */ Icon(String str, String str2, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2);
        }
    }

    /* compiled from: InformationAbout.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b$\u0010\f¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/information_about/InformationAbout$BottomSheetInfo;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "about", "text", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Ljava/lang/String;", "component3", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/information_about/InformationAbout$BottomSheetInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Ljava/lang/String;", "getAbout", "getText", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BottomSheetInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<BottomSheetInfo> CREATOR = new Creator();

        @c("text")
        @k
        private final String about;

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        @c("tip")
        @l
        private final String text;

        /* compiled from: InformationAbout.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BottomSheetInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BottomSheetInfo createFromParcel(@k Parcel parcel) {
                return new BottomSheetInfo((DeepLink) parcel.readParcelable(BottomSheetInfo.class.getClassLoader()), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BottomSheetInfo[] newArray(int i12) {
                return new BottomSheetInfo[i12];
            }
        }

        public BottomSheetInfo(@k DeepLink deepLink, @k String str, @l String str2) {
            this.deeplink = deepLink;
            this.about = str;
            this.text = str2;
        }

        public static /* synthetic */ BottomSheetInfo copy$default(BottomSheetInfo bottomSheetInfo, DeepLink deepLink, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                deepLink = bottomSheetInfo.deeplink;
            }
            if ((i12 & 2) != 0) {
                str = bottomSheetInfo.about;
            }
            if ((i12 & 4) != 0) {
                str2 = bottomSheetInfo.text;
            }
            return bottomSheetInfo.copy(deepLink, str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getAbout() {
            return this.about;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @k
        public final BottomSheetInfo copy(@k DeepLink deeplink, @k String about, @l String text) {
            return new BottomSheetInfo(deeplink, about, text);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BottomSheetInfo)) {
                return false;
            }
            BottomSheetInfo bottomSheetInfo = (BottomSheetInfo) other;
            return L.f(this.deeplink, bottomSheetInfo.deeplink) && L.f(this.about, bottomSheetInfo.about) && L.f(this.text, bottomSheetInfo.text);
        }

        @k
        public final String getAbout() {
            return this.about;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            int iD2 = H.d(this.deeplink.hashCode() * 31, 31, this.about);
            String str = this.text;
            return iD2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("BottomSheetInfo(deeplink=");
            sb2.append(this.deeplink);
            sb2.append(", about=");
            sb2.append(this.about);
            sb2.append(", text=");
            return C22026a.c(sb2, this.text, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.deeplink, flags);
            parcel.writeString(this.about);
            parcel.writeString(this.text);
        }

        public /* synthetic */ BottomSheetInfo(DeepLink deepLink, String str, String str2, int i12, C42822w c42822w) {
            this(deepLink, str, (i12 & 4) != 0 ? null : str2);
        }
    }

    public /* synthetic */ InformationAbout(String str, Icon icon, BottomSheetInfo bottomSheetInfo, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : icon, bottomSheetInfo);
    }
}
