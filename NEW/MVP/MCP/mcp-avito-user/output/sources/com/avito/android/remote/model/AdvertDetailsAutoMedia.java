package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsAutoMedia.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\nR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\f¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsAutoMedia;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/AdvertDetailsAutoMedia$AdvertDetailsAutoMediaContentSection;", "content", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/AdvertDetailsAutoMedia;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getContent", "AdvertDetailsAutoMediaContentSection", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertDetailsAutoMedia implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertDetailsAutoMedia> CREATOR = new Creator();

    @c("content")
    @l
    private final List<AdvertDetailsAutoMediaContentSection> content;

    @c("title")
    @l
    private final String title;

    /* compiled from: AdvertDetailsAutoMedia.kt */
    @d
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0015¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/AdvertDetailsAutoMedia$AdvertDetailsAutoMediaContentSection;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Image;", "image", "", "title", "tag", "Lcom/avito/android/remote/model/MediaSectionType;", "type", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/MediaSectionType;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/Image;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/remote/model/MediaSectionType;", "component5", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/Image;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/MediaSectionType;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/AdvertDetailsAutoMedia$AdvertDetailsAutoMediaContentSection;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Image;", "getImage", "Ljava/lang/String;", "getTitle", "getTag", "Lcom/avito/android/remote/model/MediaSectionType;", "getType", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertDetailsAutoMediaContentSection implements Parcelable {

        @k
        public static final Parcelable.Creator<AdvertDetailsAutoMediaContentSection> CREATOR = new Creator();

        @c("images")
        @l
        private final Image image;

        @c("tag")
        @l
        private final String tag;

        @c("title")
        @l
        private final String title;

        @c("type")
        @l
        private final MediaSectionType type;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: AdvertDetailsAutoMedia.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AdvertDetailsAutoMediaContentSection> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AdvertDetailsAutoMediaContentSection createFromParcel(@k Parcel parcel) {
                return new AdvertDetailsAutoMediaContentSection((Image) parcel.readParcelable(AdvertDetailsAutoMediaContentSection.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : MediaSectionType.CREATOR.createFromParcel(parcel), (DeepLink) parcel.readParcelable(AdvertDetailsAutoMediaContentSection.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AdvertDetailsAutoMediaContentSection[] newArray(int i12) {
                return new AdvertDetailsAutoMediaContentSection[i12];
            }
        }

        public AdvertDetailsAutoMediaContentSection(@l Image image, @l String str, @l String str2, @l MediaSectionType mediaSectionType, @l DeepLink deepLink) {
            this.image = image;
            this.title = str;
            this.tag = str2;
            this.type = mediaSectionType;
            this.uri = deepLink;
        }

        public static /* synthetic */ AdvertDetailsAutoMediaContentSection copy$default(AdvertDetailsAutoMediaContentSection advertDetailsAutoMediaContentSection, Image image, String str, String str2, MediaSectionType mediaSectionType, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                image = advertDetailsAutoMediaContentSection.image;
            }
            if ((i12 & 2) != 0) {
                str = advertDetailsAutoMediaContentSection.title;
            }
            String str3 = str;
            if ((i12 & 4) != 0) {
                str2 = advertDetailsAutoMediaContentSection.tag;
            }
            String str4 = str2;
            if ((i12 & 8) != 0) {
                mediaSectionType = advertDetailsAutoMediaContentSection.type;
            }
            MediaSectionType mediaSectionType2 = mediaSectionType;
            if ((i12 & 16) != 0) {
                deepLink = advertDetailsAutoMediaContentSection.uri;
            }
            return advertDetailsAutoMediaContentSection.copy(image, str3, str4, mediaSectionType2, deepLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final Image getImage() {
            return this.image;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final MediaSectionType getType() {
            return this.type;
        }

        @l
        /* renamed from: component5, reason: from getter */
        public final DeepLink getUri() {
            return this.uri;
        }

        @k
        public final AdvertDetailsAutoMediaContentSection copy(@l Image image, @l String title, @l String tag, @l MediaSectionType type, @l DeepLink uri) {
            return new AdvertDetailsAutoMediaContentSection(image, title, tag, type, uri);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdvertDetailsAutoMediaContentSection)) {
                return false;
            }
            AdvertDetailsAutoMediaContentSection advertDetailsAutoMediaContentSection = (AdvertDetailsAutoMediaContentSection) other;
            return L.f(this.image, advertDetailsAutoMediaContentSection.image) && L.f(this.title, advertDetailsAutoMediaContentSection.title) && L.f(this.tag, advertDetailsAutoMediaContentSection.tag) && this.type == advertDetailsAutoMediaContentSection.type && L.f(this.uri, advertDetailsAutoMediaContentSection.uri);
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @l
        public final String getTag() {
            return this.tag;
        }

        @l
        public final String getTitle() {
            return this.title;
        }

        @l
        public final MediaSectionType getType() {
            return this.type;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        public int hashCode() {
            Image image = this.image;
            int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
            String str = this.title;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.tag;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            MediaSectionType mediaSectionType = this.type;
            int iHashCode4 = (iHashCode3 + (mediaSectionType == null ? 0 : mediaSectionType.hashCode())) * 31;
            DeepLink deepLink = this.uri;
            return iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertDetailsAutoMediaContentSection(image=");
            sb2.append(this.image);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", tag=");
            sb2.append(this.tag);
            sb2.append(", type=");
            sb2.append(this.type);
            sb2.append(", uri=");
            return a.v(sb2, this.uri, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.image, flags);
            parcel.writeString(this.title);
            parcel.writeString(this.tag);
            MediaSectionType mediaSectionType = this.type;
            if (mediaSectionType == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                mediaSectionType.writeToParcel(parcel, flags);
            }
            parcel.writeParcelable(this.uri, flags);
        }
    }

    /* compiled from: AdvertDetailsAutoMedia.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertDetailsAutoMedia> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsAutoMedia createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(AdvertDetailsAutoMediaContentSection.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new AdvertDetailsAutoMedia(string, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertDetailsAutoMedia[] newArray(int i12) {
            return new AdvertDetailsAutoMedia[i12];
        }
    }

    public AdvertDetailsAutoMedia(@l String str, @l List<AdvertDetailsAutoMediaContentSection> list) {
        this.title = str;
        this.content = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvertDetailsAutoMedia copy$default(AdvertDetailsAutoMedia advertDetailsAutoMedia, String str, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = advertDetailsAutoMedia.title;
        }
        if ((i12 & 2) != 0) {
            list = advertDetailsAutoMedia.content;
        }
        return advertDetailsAutoMedia.copy(str, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<AdvertDetailsAutoMediaContentSection> component2() {
        return this.content;
    }

    @k
    public final AdvertDetailsAutoMedia copy(@l String title, @l List<AdvertDetailsAutoMediaContentSection> content) {
        return new AdvertDetailsAutoMedia(title, content);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertDetailsAutoMedia)) {
            return false;
        }
        AdvertDetailsAutoMedia advertDetailsAutoMedia = (AdvertDetailsAutoMedia) other;
        return L.f(this.title, advertDetailsAutoMedia.title) && L.f(this.content, advertDetailsAutoMedia.content);
    }

    @l
    public final List<AdvertDetailsAutoMediaContentSection> getContent() {
        return this.content;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<AdvertDetailsAutoMediaContentSection> list = this.content;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertDetailsAutoMedia(title=");
        sb2.append(this.title);
        sb2.append(", content=");
        return H.p(sb2, this.content, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        List<AdvertDetailsAutoMediaContentSection> list = this.content;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((AdvertDetailsAutoMediaContentSection) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
