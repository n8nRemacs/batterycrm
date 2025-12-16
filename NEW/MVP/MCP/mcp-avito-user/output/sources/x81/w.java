package X81;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.video.VideoStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VideoUpdatedEvent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LX81/w;", "", "", "channelId", MessageBody.Video.VIDEO_ID, "Lcom/avito/android/remote/model/messenger/video/VideoStatus;", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/messenger/video/VideoStatus;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "Lcom/avito/android/remote/model/messenger/video/VideoStatus;", "b", "()Lcom/avito/android/remote/model/messenger/video/VideoStatus;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class w {

    @com.google.gson.annotations.c("channelId")
    @Y61.k
    private final String channelId;

    @com.google.gson.annotations.c("status")
    @Y61.k
    private final VideoStatus status;

    @com.google.gson.annotations.c(MessageBody.Video.VIDEO_ID)
    @Y61.k
    private final String videoId;

    public w(@Y61.k String str, @Y61.k String str2, @Y61.k VideoStatus videoStatus) {
        this.channelId = str;
        this.videoId = str2;
        this.status = videoStatus;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final VideoStatus getStatus() {
        return this.status;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getVideoId() {
        return this.videoId;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return L.f(this.channelId, wVar.channelId) && L.f(this.videoId, wVar.videoId) && L.f(this.status, wVar.status);
    }

    public final int hashCode() {
        return this.status.hashCode() + H.d(this.channelId.hashCode() * 31, 31, this.videoId);
    }

    @Y61.k
    public final String toString() {
        return "VideoUpdatedEvent(channelId=" + this.channelId + ", videoId=" + this.videoId + ", status=" + this.status + ')';
    }
}
