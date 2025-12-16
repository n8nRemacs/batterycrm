package com.avito.android.remote.model.messenger.video;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoInfo.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0011R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0013¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/messenger/video/VideoInfo;", "Landroid/os/Parcelable;", "", "id", VideoInfo.EMBED_URL, VideoInfo.THUMBNAIL_URL, "Lcom/avito/android/remote/model/messenger/video/VideoStatus;", "status", "", "duration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/video/VideoStatus;J)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/messenger/video/VideoStatus;", "component5", "()J", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/video/VideoStatus;J)Lcom/avito/android/remote/model/messenger/video/VideoInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getEmbedUrl", "getThumbnailUrl", "Lcom/avito/android/remote/model/messenger/video/VideoStatus;", "getStatus", "J", "getDuration", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VideoInfo implements Parcelable {

    @k
    public static final String DURATION = "duration";

    @k
    public static final String EMBED_URL = "embedUrl";

    /* renamed from: ID, reason: collision with root package name */
    @k
    public static final String f253884ID = "id";

    @k
    public static final String STATUS = "status";

    @k
    public static final String THUMBNAIL_URL = "thumbnailUrl";

    @c("duration")
    private final long duration;

    @c(EMBED_URL)
    @k
    private final String embedUrl;

    @c("id")
    @k
    private final String id;

    @c("status")
    @l
    private final VideoStatus status;

    @c(THUMBNAIL_URL)
    @k
    private final String thumbnailUrl;

    @k
    public static final Parcelable.Creator<VideoInfo> CREATOR = new Creator();

    /* compiled from: VideoInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VideoInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VideoInfo createFromParcel(@k Parcel parcel) {
            return new VideoInfo(parcel.readString(), parcel.readString(), parcel.readString(), (VideoStatus) parcel.readParcelable(VideoInfo.class.getClassLoader()), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VideoInfo[] newArray(int i12) {
            return new VideoInfo[i12];
        }
    }

    public VideoInfo(@k String str, @k String str2, @k String str3, @l VideoStatus videoStatus, long j12) {
        this.id = str;
        this.embedUrl = str2;
        this.thumbnailUrl = str3;
        this.status = videoStatus;
        this.duration = j12;
    }

    public static /* synthetic */ VideoInfo copy$default(VideoInfo videoInfo, String str, String str2, String str3, VideoStatus videoStatus, long j12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = videoInfo.id;
        }
        if ((i12 & 2) != 0) {
            str2 = videoInfo.embedUrl;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = videoInfo.thumbnailUrl;
        }
        String str5 = str3;
        if ((i12 & 8) != 0) {
            videoStatus = videoInfo.status;
        }
        VideoStatus videoStatus2 = videoStatus;
        if ((i12 & 16) != 0) {
            j12 = videoInfo.duration;
        }
        return videoInfo.copy(str, str4, str5, videoStatus2, j12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getEmbedUrl() {
        return this.embedUrl;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final VideoStatus getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    @k
    public final VideoInfo copy(@k String id2, @k String embedUrl, @k String thumbnailUrl, @l VideoStatus status, long duration) {
        return new VideoInfo(id2, embedUrl, thumbnailUrl, status, duration);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) other;
        return L.f(this.id, videoInfo.id) && L.f(this.embedUrl, videoInfo.embedUrl) && L.f(this.thumbnailUrl, videoInfo.thumbnailUrl) && L.f(this.status, videoInfo.status) && this.duration == videoInfo.duration;
    }

    public final long getDuration() {
        return this.duration;
    }

    @k
    public final String getEmbedUrl() {
        return this.embedUrl;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final VideoStatus getStatus() {
        return this.status;
    }

    @k
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(this.id.hashCode() * 31, 31, this.embedUrl), 31, this.thumbnailUrl);
        VideoStatus videoStatus = this.status;
        return Long.hashCode(this.duration) + ((iD2 + (videoStatus == null ? 0 : videoStatus.hashCode())) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VideoInfo(id=");
        sb2.append(this.id);
        sb2.append(", embedUrl=");
        sb2.append(this.embedUrl);
        sb2.append(", thumbnailUrl=");
        sb2.append(this.thumbnailUrl);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", duration=");
        return r.u(sb2, this.duration, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.embedUrl);
        parcel.writeString(this.thumbnailUrl);
        parcel.writeParcelable(this.status, flags);
        parcel.writeLong(this.duration);
    }
}
