package ru.avito.messenger.api.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CreateChunkedVideoFileResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/avito/messenger/api/entity/CreateChunkedVideoFileResponse;", "", "", "fileId", MessageBody.Video.VIDEO_ID, "uploadSessionId", "Lcom/avito/android/remote/model/messenger/video/VideoInfo;", "alreadyExistingVideo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/video/VideoInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFileId", "getVideoId", "getUploadSessionId", "Lcom/avito/android/remote/model/messenger/video/VideoInfo;", "getAlreadyExistingVideo", "()Lcom/avito/android/remote/model/messenger/video/VideoInfo;", "Companion", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CreateChunkedVideoFileResponse {

    @c("alreadyExistingVideo")
    @l
    private final VideoInfo alreadyExistingVideo;

    @c("fileId")
    @k
    private final String fileId;

    @c("uploadSessionId")
    @k
    private final String uploadSessionId;

    @c(MessageBody.Video.VIDEO_ID)
    @k
    private final String videoId;

    public CreateChunkedVideoFileResponse(@k String str, @k String str2, @k String str3, @l VideoInfo videoInfo) {
        this.fileId = str;
        this.videoId = str2;
        this.uploadSessionId = str3;
        this.alreadyExistingVideo = videoInfo;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateChunkedVideoFileResponse)) {
            return false;
        }
        CreateChunkedVideoFileResponse createChunkedVideoFileResponse = (CreateChunkedVideoFileResponse) other;
        return L.f(this.fileId, createChunkedVideoFileResponse.fileId) && L.f(this.videoId, createChunkedVideoFileResponse.videoId) && L.f(this.uploadSessionId, createChunkedVideoFileResponse.uploadSessionId) && L.f(this.alreadyExistingVideo, createChunkedVideoFileResponse.alreadyExistingVideo);
    }

    @l
    public final VideoInfo getAlreadyExistingVideo() {
        return this.alreadyExistingVideo;
    }

    @k
    public final String getFileId() {
        return this.fileId;
    }

    @k
    public final String getUploadSessionId() {
        return this.uploadSessionId;
    }

    @k
    public final String getVideoId() {
        return this.videoId;
    }

    public int hashCode() {
        int iD2 = H.d(H.d(this.fileId.hashCode() * 31, 31, this.videoId), 31, this.uploadSessionId);
        VideoInfo videoInfo = this.alreadyExistingVideo;
        return iD2 + (videoInfo == null ? 0 : videoInfo.hashCode());
    }

    @k
    public String toString() {
        return "CreateChunkedVideoFileResponse(fileId=" + this.fileId + ", videoId=" + this.videoId + ", uploadSessionId=" + this.uploadSessionId + ", alreadyExistingVideo=" + this.alreadyExistingVideo + ')';
    }
}
