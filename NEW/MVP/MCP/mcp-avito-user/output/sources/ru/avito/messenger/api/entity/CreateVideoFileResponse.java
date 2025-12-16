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

/* compiled from: CreateVideoFileResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/avito/messenger/api/entity/CreateVideoFileResponse;", "", "", "fileId", MessageBody.Video.VIDEO_ID, "Lcom/avito/android/remote/model/messenger/video/VideoInfo;", "alreadyExistingVideo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/video/VideoInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFileId", "getVideoId", "Lcom/avito/android/remote/model/messenger/video/VideoInfo;", "getAlreadyExistingVideo", "()Lcom/avito/android/remote/model/messenger/video/VideoInfo;", "Companion", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class CreateVideoFileResponse {

    @c("alreadyExistingVideo")
    @l
    private final VideoInfo alreadyExistingVideo;

    @c("fileId")
    @k
    private final String fileId;

    @c(MessageBody.Video.VIDEO_ID)
    @k
    private final String videoId;

    public CreateVideoFileResponse(@k String str, @k String str2, @l VideoInfo videoInfo) {
        this.fileId = str;
        this.videoId = str2;
        this.alreadyExistingVideo = videoInfo;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateVideoFileResponse)) {
            return false;
        }
        CreateVideoFileResponse createVideoFileResponse = (CreateVideoFileResponse) other;
        return L.f(this.fileId, createVideoFileResponse.fileId) && L.f(this.videoId, createVideoFileResponse.videoId) && L.f(this.alreadyExistingVideo, createVideoFileResponse.alreadyExistingVideo);
    }

    public int hashCode() {
        int iD2 = H.d(this.fileId.hashCode() * 31, 31, this.videoId);
        VideoInfo videoInfo = this.alreadyExistingVideo;
        return iD2 + (videoInfo == null ? 0 : videoInfo.hashCode());
    }

    @k
    public String toString() {
        return "CreateVideoFileResponse(fileId=" + this.fileId + ", videoId=" + this.videoId + ", alreadyExistingVideo=" + this.alreadyExistingVideo + ')';
    }
}
