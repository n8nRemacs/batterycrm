package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoUploadParameter.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DeliveryOnVideoUploadConfig;", "Landroid/os/Parcelable;", "", "condition", "Lcom/avito/android/remote/model/category_parameters/DeliveryOnVideoUploadConfig$DeliveryLinkOnVideoUploadConfig;", "link", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/DeliveryOnVideoUploadConfig$DeliveryLinkOnVideoUploadConfig;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/category_parameters/DeliveryOnVideoUploadConfig$DeliveryLinkOnVideoUploadConfig;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/DeliveryOnVideoUploadConfig$DeliveryLinkOnVideoUploadConfig;)Lcom/avito/android/remote/model/category_parameters/DeliveryOnVideoUploadConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCondition", "Lcom/avito/android/remote/model/category_parameters/DeliveryOnVideoUploadConfig$DeliveryLinkOnVideoUploadConfig;", "getLink", "DeliveryLinkOnVideoUploadConfig", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliveryOnVideoUploadConfig implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryOnVideoUploadConfig> CREATOR = new Creator();

    @c("condition")
    @k
    private final String condition;

    @c("link")
    @l
    private final DeliveryLinkOnVideoUploadConfig link;

    /* compiled from: VideoUploadParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryOnVideoUploadConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryOnVideoUploadConfig createFromParcel(@k Parcel parcel) {
            return new DeliveryOnVideoUploadConfig(parcel.readString(), parcel.readInt() == 0 ? null : DeliveryLinkOnVideoUploadConfig.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryOnVideoUploadConfig[] newArray(int i12) {
            return new DeliveryOnVideoUploadConfig[i12];
        }
    }

    /* compiled from: VideoUploadParameter.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\b¨\u0006\u001f"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DeliveryOnVideoUploadConfig$DeliveryLinkOnVideoUploadConfig;", "Landroid/os/Parcelable;", "", "title", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/DeliveryOnVideoUploadConfig$DeliveryLinkOnVideoUploadConfig;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getUri", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DeliveryLinkOnVideoUploadConfig implements Parcelable {

        @k
        public static final Parcelable.Creator<DeliveryLinkOnVideoUploadConfig> CREATOR = new Creator();

        @c("title")
        @k
        private final String title;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final String uri;

        /* compiled from: VideoUploadParameter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DeliveryLinkOnVideoUploadConfig> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DeliveryLinkOnVideoUploadConfig createFromParcel(@k Parcel parcel) {
                return new DeliveryLinkOnVideoUploadConfig(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DeliveryLinkOnVideoUploadConfig[] newArray(int i12) {
                return new DeliveryLinkOnVideoUploadConfig[i12];
            }
        }

        public DeliveryLinkOnVideoUploadConfig(@k String str, @k String str2) {
            this.title = str;
            this.uri = str2;
        }

        public static /* synthetic */ DeliveryLinkOnVideoUploadConfig copy$default(DeliveryLinkOnVideoUploadConfig deliveryLinkOnVideoUploadConfig, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = deliveryLinkOnVideoUploadConfig.title;
            }
            if ((i12 & 2) != 0) {
                str2 = deliveryLinkOnVideoUploadConfig.uri;
            }
            return deliveryLinkOnVideoUploadConfig.copy(str, str2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        @k
        public final DeliveryLinkOnVideoUploadConfig copy(@k String title, @k String uri) {
            return new DeliveryLinkOnVideoUploadConfig(title, uri);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeliveryLinkOnVideoUploadConfig)) {
                return false;
            }
            DeliveryLinkOnVideoUploadConfig deliveryLinkOnVideoUploadConfig = (DeliveryLinkOnVideoUploadConfig) other;
            return L.f(this.title, deliveryLinkOnVideoUploadConfig.title) && L.f(this.uri, deliveryLinkOnVideoUploadConfig.uri);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @k
        public final String getUri() {
            return this.uri;
        }

        public int hashCode() {
            return this.uri.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("DeliveryLinkOnVideoUploadConfig(title=");
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

    public DeliveryOnVideoUploadConfig(@k String str, @l DeliveryLinkOnVideoUploadConfig deliveryLinkOnVideoUploadConfig) {
        this.condition = str;
        this.link = deliveryLinkOnVideoUploadConfig;
    }

    public static /* synthetic */ DeliveryOnVideoUploadConfig copy$default(DeliveryOnVideoUploadConfig deliveryOnVideoUploadConfig, String str, DeliveryLinkOnVideoUploadConfig deliveryLinkOnVideoUploadConfig, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = deliveryOnVideoUploadConfig.condition;
        }
        if ((i12 & 2) != 0) {
            deliveryLinkOnVideoUploadConfig = deliveryOnVideoUploadConfig.link;
        }
        return deliveryOnVideoUploadConfig.copy(str, deliveryLinkOnVideoUploadConfig);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getCondition() {
        return this.condition;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeliveryLinkOnVideoUploadConfig getLink() {
        return this.link;
    }

    @k
    public final DeliveryOnVideoUploadConfig copy(@k String condition, @l DeliveryLinkOnVideoUploadConfig link) {
        return new DeliveryOnVideoUploadConfig(condition, link);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryOnVideoUploadConfig)) {
            return false;
        }
        DeliveryOnVideoUploadConfig deliveryOnVideoUploadConfig = (DeliveryOnVideoUploadConfig) other;
        return L.f(this.condition, deliveryOnVideoUploadConfig.condition) && L.f(this.link, deliveryOnVideoUploadConfig.link);
    }

    @k
    public final String getCondition() {
        return this.condition;
    }

    @l
    public final DeliveryLinkOnVideoUploadConfig getLink() {
        return this.link;
    }

    public int hashCode() {
        int iHashCode = this.condition.hashCode() * 31;
        DeliveryLinkOnVideoUploadConfig deliveryLinkOnVideoUploadConfig = this.link;
        return iHashCode + (deliveryLinkOnVideoUploadConfig == null ? 0 : deliveryLinkOnVideoUploadConfig.hashCode());
    }

    @k
    public String toString() {
        return "DeliveryOnVideoUploadConfig(condition=" + this.condition + ", link=" + this.link + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.condition);
        DeliveryLinkOnVideoUploadConfig deliveryLinkOnVideoUploadConfig = this.link;
        if (deliveryLinkOnVideoUploadConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deliveryLinkOnVideoUploadConfig.writeToParcel(parcel, flags);
        }
    }
}
