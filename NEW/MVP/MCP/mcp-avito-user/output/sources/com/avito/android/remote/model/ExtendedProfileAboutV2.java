package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileAboutV2.kt */
@d
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001/B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0010JR\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0010J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b \u0010\u001aJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0010R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b.\u0010\u0010¨\u00060"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileAboutV2;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "Lcom/avito/android/remote/model/ExtendedProfileAboutV2$Config;", Navigation.CONFIG, "", "title", "description", "", "Lcom/avito/android/remote/model/ExtendedProfileGalleryElement;", "images", "widgetName", "<init>", "(Lcom/avito/android/remote/model/ExtendedProfileAboutV2$Config;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/ExtendedProfileAboutV2$Config;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "component5", "copy", "(Lcom/avito/android/remote/model/ExtendedProfileAboutV2$Config;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfileAboutV2;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/ExtendedProfileAboutV2$Config;", "getConfig", "Ljava/lang/String;", "getTitle", "getDescription", "Ljava/util/List;", "getImages", "getWidgetName", "Config", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileAboutV2 implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileAboutV2> CREATOR = new Creator();

    @c(Navigation.CONFIG)
    @l
    private final Config config;

    @c("description")
    @l
    private final String description;

    @c("content")
    @l
    private final List<ExtendedProfileGalleryElement> images;

    @c("title")
    @l
    private final String title;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: ExtendedProfileAboutV2.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b#\u0010\n¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileAboutV2$Config;", "Landroid/os/Parcelable;", "", "title", "", "showMoreLinesCount", "showMoreTitle", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfileAboutV2$Config;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/lang/Integer;", "getShowMoreLinesCount", "getShowMoreTitle", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Config implements Parcelable {

        @k
        public static final Parcelable.Creator<Config> CREATOR = new Creator();

        @c("showMoreLinesCount")
        @l
        private final Integer showMoreLinesCount;

        @c("showMoreTitle")
        @l
        private final String showMoreTitle;

        @c("title")
        @l
        private final String title;

        /* compiled from: ExtendedProfileAboutV2.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Config createFromParcel(@k Parcel parcel) {
                return new Config(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Config[] newArray(int i12) {
                return new Config[i12];
            }
        }

        public Config(@l String str, @l Integer num, @l String str2) {
            this.title = str;
            this.showMoreLinesCount = num;
            this.showMoreTitle = str2;
        }

        public static /* synthetic */ Config copy$default(Config config, String str, Integer num, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = config.title;
            }
            if ((i12 & 2) != 0) {
                num = config.showMoreLinesCount;
            }
            if ((i12 & 4) != 0) {
                str2 = config.showMoreTitle;
            }
            return config.copy(str, num, str2);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final Integer getShowMoreLinesCount() {
            return this.showMoreLinesCount;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getShowMoreTitle() {
            return this.showMoreTitle;
        }

        @k
        public final Config copy(@l String title, @l Integer showMoreLinesCount, @l String showMoreTitle) {
            return new Config(title, showMoreLinesCount, showMoreTitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Config)) {
                return false;
            }
            Config config = (Config) other;
            return L.f(this.title, config.title) && L.f(this.showMoreLinesCount, config.showMoreLinesCount) && L.f(this.showMoreTitle, config.showMoreTitle);
        }

        @l
        public final Integer getShowMoreLinesCount() {
            return this.showMoreLinesCount;
        }

        @l
        public final String getShowMoreTitle() {
            return this.showMoreTitle;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.showMoreLinesCount;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.showMoreTitle;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Config(title=");
            sb2.append(this.title);
            sb2.append(", showMoreLinesCount=");
            sb2.append(this.showMoreLinesCount);
            sb2.append(", showMoreTitle=");
            return C22026a.c(sb2, this.showMoreTitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            Integer num = this.showMoreLinesCount;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                a.C(parcel, 1, num);
            }
            parcel.writeString(this.showMoreTitle);
        }
    }

    /* compiled from: ExtendedProfileAboutV2.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileAboutV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileAboutV2 createFromParcel(@k Parcel parcel) {
            ArrayList arrayList = null;
            Config configCreateFromParcel = parcel.readInt() == 0 ? null : Config.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = a.l(ExtendedProfileAboutV2.class, parcel, arrayList, iL2, 1);
                }
            }
            return new ExtendedProfileAboutV2(configCreateFromParcel, string, string2, arrayList, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileAboutV2[] newArray(int i12) {
            return new ExtendedProfileAboutV2[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExtendedProfileAboutV2(@l Config config, @l String str, @l String str2, @l List<? extends ExtendedProfileGalleryElement> list, @l String str3) {
        this.config = config;
        this.title = str;
        this.description = str2;
        this.images = list;
        this.widgetName = str3;
    }

    public static /* synthetic */ ExtendedProfileAboutV2 copy$default(ExtendedProfileAboutV2 extendedProfileAboutV2, Config config, String str, String str2, List list, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            config = extendedProfileAboutV2.config;
        }
        if ((i12 & 2) != 0) {
            str = extendedProfileAboutV2.title;
        }
        String str4 = str;
        if ((i12 & 4) != 0) {
            str2 = extendedProfileAboutV2.description;
        }
        String str5 = str2;
        if ((i12 & 8) != 0) {
            list = extendedProfileAboutV2.images;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            str3 = extendedProfileAboutV2.widgetName;
        }
        return extendedProfileAboutV2.copy(config, str4, str5, list2, str3);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Config getConfig() {
        return this.config;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    public final List<ExtendedProfileGalleryElement> component4() {
        return this.images;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @k
    public final ExtendedProfileAboutV2 copy(@l Config config, @l String title, @l String description, @l List<? extends ExtendedProfileGalleryElement> images, @l String widgetName) {
        return new ExtendedProfileAboutV2(config, title, description, images, widgetName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileAboutV2)) {
            return false;
        }
        ExtendedProfileAboutV2 extendedProfileAboutV2 = (ExtendedProfileAboutV2) other;
        return L.f(this.config, extendedProfileAboutV2.config) && L.f(this.title, extendedProfileAboutV2.title) && L.f(this.description, extendedProfileAboutV2.description) && L.f(this.images, extendedProfileAboutV2.images) && L.f(this.widgetName, extendedProfileAboutV2.widgetName);
    }

    @l
    public final Config getConfig() {
        return this.config;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final List<ExtendedProfileGalleryElement> getImages() {
        return this.images;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        Config config = this.config;
        int iHashCode = (config == null ? 0 : config.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<ExtendedProfileGalleryElement> list = this.images;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.widgetName;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileAboutV2(config=");
        sb2.append(this.config);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", widgetName=");
        return C22026a.c(sb2, this.widgetName, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Config config = this.config;
        if (config == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            config.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        List<ExtendedProfileGalleryElement> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeString(this.widgetName);
    }
}
