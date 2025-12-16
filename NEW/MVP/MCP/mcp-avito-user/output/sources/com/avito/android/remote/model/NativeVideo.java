package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: NativeVideo.kt */
@d
@s0
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J@\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0016¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/NativeVideo;", "Landroid/os/Parcelable;", "", ContextActionHandler.Link.URL, "Lcom/avito/android/remote/model/Image;", "thumbnail", "", "position", "Lcom/avito/android/remote/model/NativeVideoStatus;", "status", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/Integer;Lcom/avito/android/remote/model/NativeVideoStatus;)V", "", "hasThumbnail", "()Z", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Image;", "component3", "()Ljava/lang/Integer;", "component4", "()Lcom/avito/android/remote/model/NativeVideoStatus;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Image;Ljava/lang/Integer;Lcom/avito/android/remote/model/NativeVideoStatus;)Lcom/avito/android/remote/model/NativeVideo;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getUrl", "Lcom/avito/android/remote/model/Image;", "getThumbnail", "Ljava/lang/Integer;", "getPosition", "Lcom/avito/android/remote/model/NativeVideoStatus;", "getStatus", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NativeVideo implements Parcelable {

    @k
    public static final Parcelable.Creator<NativeVideo> CREATOR = new Creator();

    @c("position")
    @l
    private final Integer position;

    @c("status")
    @l
    private final NativeVideoStatus status;

    @c("thumbnail")
    @l
    private final Image thumbnail;

    @c(ContextActionHandler.Link.URL)
    @l
    private final String url;

    /* compiled from: NativeVideo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<NativeVideo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NativeVideo createFromParcel(@k Parcel parcel) {
            return new NativeVideo(parcel.readString(), (Image) parcel.readParcelable(NativeVideo.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? NativeVideoStatus.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final NativeVideo[] newArray(int i12) {
            return new NativeVideo[i12];
        }
    }

    public NativeVideo(@l String str, @l Image image, @l Integer num, @l NativeVideoStatus nativeVideoStatus) {
        this.url = str;
        this.thumbnail = image;
        this.position = num;
        this.status = nativeVideoStatus;
    }

    public static /* synthetic */ NativeVideo copy$default(NativeVideo nativeVideo, String str, Image image, Integer num, NativeVideoStatus nativeVideoStatus, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = nativeVideo.url;
        }
        if ((i12 & 2) != 0) {
            image = nativeVideo.thumbnail;
        }
        if ((i12 & 4) != 0) {
            num = nativeVideo.position;
        }
        if ((i12 & 8) != 0) {
            nativeVideoStatus = nativeVideo.status;
        }
        return nativeVideo.copy(str, image, num, nativeVideoStatus);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Image getThumbnail() {
        return this.thumbnail;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final NativeVideoStatus getStatus() {
        return this.status;
    }

    @k
    public final NativeVideo copy(@l String url, @l Image thumbnail, @l Integer position, @l NativeVideoStatus status) {
        return new NativeVideo(url, thumbnail, position, status);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeVideo)) {
            return false;
        }
        NativeVideo nativeVideo = (NativeVideo) other;
        return L.f(this.url, nativeVideo.url) && L.f(this.thumbnail, nativeVideo.thumbnail) && L.f(this.position, nativeVideo.position) && L.f(this.status, nativeVideo.status);
    }

    @l
    public final Integer getPosition() {
        return this.position;
    }

    @l
    public final NativeVideoStatus getStatus() {
        return this.status;
    }

    @l
    public final Image getThumbnail() {
        return this.thumbnail;
    }

    @l
    public final String getUrl() {
        return this.url;
    }

    public final boolean hasThumbnail() {
        return !(this.thumbnail != null ? r0.isEmpty() : true);
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.thumbnail;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Integer num = this.position;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        NativeVideoStatus nativeVideoStatus = this.status;
        return iHashCode3 + (nativeVideoStatus != null ? nativeVideoStatus.hashCode() : 0);
    }

    @k
    public String toString() {
        return "NativeVideo(url=" + this.url + ", thumbnail=" + this.thumbnail + ", position=" + this.position + ", status=" + this.status + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.url);
        parcel.writeParcelable(this.thumbnail, flags);
        Integer num = this.position;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        NativeVideoStatus nativeVideoStatus = this.status;
        if (nativeVideoStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nativeVideoStatus.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ NativeVideo(String str, Image image, Integer num, NativeVideoStatus nativeVideoStatus, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : image, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : nativeVideoStatus);
    }
}
