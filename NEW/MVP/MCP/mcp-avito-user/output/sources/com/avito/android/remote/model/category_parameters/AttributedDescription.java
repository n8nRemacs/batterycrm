package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoUploadParameter.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AttributedDescription;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes;", Navigation.ATTRIBUTES, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes;)Lcom/avito/android/remote/model/category_parameters/AttributedDescription;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getText", "Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes;", "getAttributes", "AttributedDescriptionAttributes", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AttributedDescription implements Parcelable {

    @k
    public static final Parcelable.Creator<AttributedDescription> CREATOR = new Creator();

    @c(Navigation.ATTRIBUTES)
    @l
    private final AttributedDescriptionAttributes attributes;

    @c("text")
    @l
    private final String text;

    /* compiled from: VideoUploadParameter.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink;", "link", "<init>", "(Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink;)V", "component1", "()Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink;", "copy", "(Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink;)Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink;", "getLink", "AttributedDescriptionLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class AttributedDescriptionAttributes implements Parcelable {

        @k
        public static final Parcelable.Creator<AttributedDescriptionAttributes> CREATOR = new Creator();

        @c("link")
        @l
        private final AttributedDescriptionLink link;

        /* compiled from: VideoUploadParameter.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink;", "Landroid/os/Parcelable;", "", "type", "Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink$Link;", "value", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink$Link;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink$Link;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink$Link;)Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink$Link;", "getValue", "Link", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class AttributedDescriptionLink implements Parcelable {

            @k
            public static final Parcelable.Creator<AttributedDescriptionLink> CREATOR = new Creator();

            @c("type")
            @l
            private final String type;

            @c("value")
            @l
            private final Link value;

            /* compiled from: VideoUploadParameter.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<AttributedDescriptionLink> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final AttributedDescriptionLink createFromParcel(@k Parcel parcel) {
                    return new AttributedDescriptionLink(parcel.readString(), parcel.readInt() == 0 ? null : Link.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final AttributedDescriptionLink[] newArray(int i12) {
                    return new AttributedDescriptionLink[i12];
                }
            }

            /* compiled from: VideoUploadParameter.kt */
            @d
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink$Link;", "Landroid/os/Parcelable;", "", "title", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/AttributedDescription$AttributedDescriptionAttributes$AttributedDescriptionLink$Link;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getUri", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Link implements Parcelable {

                @k
                public static final Parcelable.Creator<Link> CREATOR = new Creator();

                @c("title")
                @l
                private final String title;

                @c(TooltipAttribute.PARAM_DEEP_LINK)
                @l
                private final String uri;

                /* compiled from: VideoUploadParameter.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Link> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Link createFromParcel(@k Parcel parcel) {
                        return new Link(parcel.readString(), parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Link[] newArray(int i12) {
                        return new Link[i12];
                    }
                }

                public Link(@l String str, @l String str2) {
                    this.title = str;
                    this.uri = str2;
                }

                public static /* synthetic */ Link copy$default(Link link, String str, String str2, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        str = link.title;
                    }
                    if ((i12 & 2) != 0) {
                        str2 = link.uri;
                    }
                    return link.copy(str, str2);
                }

                @l
                /* renamed from: component1, reason: from getter */
                public final String getTitle() {
                    return this.title;
                }

                @l
                /* renamed from: component2, reason: from getter */
                public final String getUri() {
                    return this.uri;
                }

                @k
                public final Link copy(@l String title, @l String uri) {
                    return new Link(title, uri);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Link)) {
                        return false;
                    }
                    Link link = (Link) other;
                    return L.f(this.title, link.title) && L.f(this.uri, link.uri);
                }

                @l
                public final String getTitle() {
                    return this.title;
                }

                @l
                public final String getUri() {
                    return this.uri;
                }

                public int hashCode() {
                    String str = this.title;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.uri;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                @k
                public String toString() {
                    StringBuilder sb2 = new StringBuilder("Link(title=");
                    sb2.append(this.title);
                    sb2.append(", uri=");
                    return C22026a.c(sb2, this.uri, ')');
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(this.title);
                    parcel.writeString(this.uri);
                }
            }

            public AttributedDescriptionLink(@l String str, @l Link link) {
                this.type = str;
                this.value = link;
            }

            public static /* synthetic */ AttributedDescriptionLink copy$default(AttributedDescriptionLink attributedDescriptionLink, String str, Link link, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = attributedDescriptionLink.type;
                }
                if ((i12 & 2) != 0) {
                    link = attributedDescriptionLink.value;
                }
                return attributedDescriptionLink.copy(str, link);
            }

            @l
            /* renamed from: component1, reason: from getter */
            public final String getType() {
                return this.type;
            }

            @l
            /* renamed from: component2, reason: from getter */
            public final Link getValue() {
                return this.value;
            }

            @k
            public final AttributedDescriptionLink copy(@l String type, @l Link value) {
                return new AttributedDescriptionLink(type, value);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof AttributedDescriptionLink)) {
                    return false;
                }
                AttributedDescriptionLink attributedDescriptionLink = (AttributedDescriptionLink) other;
                return L.f(this.type, attributedDescriptionLink.type) && L.f(this.value, attributedDescriptionLink.value);
            }

            @l
            public final String getType() {
                return this.type;
            }

            @l
            public final Link getValue() {
                return this.value;
            }

            public int hashCode() {
                String str = this.type;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Link link = this.value;
                return iHashCode + (link != null ? link.hashCode() : 0);
            }

            @k
            public String toString() {
                return "AttributedDescriptionLink(type=" + this.type + ", value=" + this.value + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.type);
                Link link = this.value;
                if (link == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    link.writeToParcel(parcel, flags);
                }
            }
        }

        /* compiled from: VideoUploadParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AttributedDescriptionAttributes> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AttributedDescriptionAttributes createFromParcel(@k Parcel parcel) {
                return new AttributedDescriptionAttributes(parcel.readInt() == 0 ? null : AttributedDescriptionLink.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AttributedDescriptionAttributes[] newArray(int i12) {
                return new AttributedDescriptionAttributes[i12];
            }
        }

        public AttributedDescriptionAttributes(@l AttributedDescriptionLink attributedDescriptionLink) {
            this.link = attributedDescriptionLink;
        }

        public static /* synthetic */ AttributedDescriptionAttributes copy$default(AttributedDescriptionAttributes attributedDescriptionAttributes, AttributedDescriptionLink attributedDescriptionLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                attributedDescriptionLink = attributedDescriptionAttributes.link;
            }
            return attributedDescriptionAttributes.copy(attributedDescriptionLink);
        }

        @l
        /* renamed from: component1, reason: from getter */
        public final AttributedDescriptionLink getLink() {
            return this.link;
        }

        @k
        public final AttributedDescriptionAttributes copy(@l AttributedDescriptionLink link) {
            return new AttributedDescriptionAttributes(link);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AttributedDescriptionAttributes) && L.f(this.link, ((AttributedDescriptionAttributes) other).link);
        }

        @l
        public final AttributedDescriptionLink getLink() {
            return this.link;
        }

        public int hashCode() {
            AttributedDescriptionLink attributedDescriptionLink = this.link;
            if (attributedDescriptionLink == null) {
                return 0;
            }
            return attributedDescriptionLink.hashCode();
        }

        @k
        public String toString() {
            return "AttributedDescriptionAttributes(link=" + this.link + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            AttributedDescriptionLink attributedDescriptionLink = this.link;
            if (attributedDescriptionLink == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attributedDescriptionLink.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: VideoUploadParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AttributedDescription> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AttributedDescription createFromParcel(@k Parcel parcel) {
            return new AttributedDescription(parcel.readString(), parcel.readInt() == 0 ? null : AttributedDescriptionAttributes.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AttributedDescription[] newArray(int i12) {
            return new AttributedDescription[i12];
        }
    }

    public AttributedDescription(@l String str, @l AttributedDescriptionAttributes attributedDescriptionAttributes) {
        this.text = str;
        this.attributes = attributedDescriptionAttributes;
    }

    public static /* synthetic */ AttributedDescription copy$default(AttributedDescription attributedDescription, String str, AttributedDescriptionAttributes attributedDescriptionAttributes, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = attributedDescription.text;
        }
        if ((i12 & 2) != 0) {
            attributedDescriptionAttributes = attributedDescription.attributes;
        }
        return attributedDescription.copy(str, attributedDescriptionAttributes);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final AttributedDescriptionAttributes getAttributes() {
        return this.attributes;
    }

    @k
    public final AttributedDescription copy(@l String text, @l AttributedDescriptionAttributes attributes) {
        return new AttributedDescription(text, attributes);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttributedDescription)) {
            return false;
        }
        AttributedDescription attributedDescription = (AttributedDescription) other;
        return L.f(this.text, attributedDescription.text) && L.f(this.attributes, attributedDescription.attributes);
    }

    @l
    public final AttributedDescriptionAttributes getAttributes() {
        return this.attributes;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedDescriptionAttributes attributedDescriptionAttributes = this.attributes;
        return iHashCode + (attributedDescriptionAttributes != null ? attributedDescriptionAttributes.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AttributedDescription(text=" + this.text + ", attributes=" + this.attributes + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.text);
        AttributedDescriptionAttributes attributedDescriptionAttributes = this.attributes;
        if (attributedDescriptionAttributes == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            attributedDescriptionAttributes.writeToParcel(parcel, flags);
        }
    }
}
