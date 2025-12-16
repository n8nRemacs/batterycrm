package com.avito.android.remote.model.advertising;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19824b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoNetworkBannerRawResponse.kt */
@InterfaceC19824b
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRawResponse;", "Landroid/os/Parcelable;", "NoContent", "Success", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRawResponse$NoContent;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRawResponse$Success;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface AvitoNetworkBannerRawResponse extends Parcelable {

    /* compiled from: AvitoNetworkBannerRawResponse.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRawResponse$NoContent;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRawResponse;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRawResponse$NoContent;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessage", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NoContent implements AvitoNetworkBannerRawResponse {

        @k
        public static final Parcelable.Creator<NoContent> CREATOR = new Creator();

        @c("message")
        @k
        private final String message;

        /* compiled from: AvitoNetworkBannerRawResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NoContent> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NoContent createFromParcel(@k Parcel parcel) {
                return new NoContent(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NoContent[] newArray(int i12) {
                return new NoContent[i12];
            }
        }

        public NoContent(@k String str) {
            this.message = str;
        }

        public static /* synthetic */ NoContent copy$default(NoContent noContent, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = noContent.message;
            }
            return noContent.copy(str);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @k
        public final NoContent copy(@k String message) {
            return new NoContent(message);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NoContent) && L.f(this.message, ((NoContent) other).message);
        }

        @k
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("NoContent(message="), this.message, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.message);
        }
    }

    /* compiled from: AvitoNetworkBannerRawResponse.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRawResponse$Success;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRawResponse;", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw;", AdFormat.BANNER, "<init>", "(Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw;)V", "component1", "()Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw;", "copy", "(Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw;)Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRawResponse$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/advertising/AvitoNetworkBannerRaw;", "getBanner", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Success implements AvitoNetworkBannerRawResponse {

        @k
        public static final Parcelable.Creator<Success> CREATOR = new Creator();

        @c(AdFormat.BANNER)
        @k
        private final AvitoNetworkBannerRaw banner;

        /* compiled from: AvitoNetworkBannerRawResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Success createFromParcel(@k Parcel parcel) {
                return new Success((AvitoNetworkBannerRaw) parcel.readParcelable(Success.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        public Success(@k AvitoNetworkBannerRaw avitoNetworkBannerRaw) {
            this.banner = avitoNetworkBannerRaw;
        }

        public static /* synthetic */ Success copy$default(Success success, AvitoNetworkBannerRaw avitoNetworkBannerRaw, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                avitoNetworkBannerRaw = success.banner;
            }
            return success.copy(avitoNetworkBannerRaw);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final AvitoNetworkBannerRaw getBanner() {
            return this.banner;
        }

        @k
        public final Success copy(@k AvitoNetworkBannerRaw banner) {
            return new Success(banner);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && L.f(this.banner, ((Success) other).banner);
        }

        @k
        public final AvitoNetworkBannerRaw getBanner() {
            return this.banner;
        }

        public int hashCode() {
            return this.banner.hashCode();
        }

        @k
        public String toString() {
            return "Success(banner=" + this.banner + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.banner, flags);
        }
    }
}
