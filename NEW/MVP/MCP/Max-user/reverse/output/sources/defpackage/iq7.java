package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public abstract class iq7 {
    public static jq7 a(byte[] bArr) throws ProtoException {
        try {
            Tasks.InvalidateAndDownloadAudio invalidateAndDownloadAudio = (Tasks.InvalidateAndDownloadAudio) fl9.mergeFrom(new Tasks.InvalidateAndDownloadAudio(), bArr);
            Tasks.FileDownload fileDownload = invalidateAndDownloadAudio.fileDownload;
            long j = fileDownload.messageId;
            long j2 = fileDownload.videoId;
            long j3 = fileDownload.audioId;
            long j4 = fileDownload.mp4GifId;
            long j5 = fileDownload.stickerId;
            long j6 = fileDownload.fileId;
            String str = fileDownload.fileName;
            return new jq7(invalidateAndDownloadAudio.requestId, invalidateAndDownloadAudio.outputPath, invalidateAndDownloadAudio.chatServerId, invalidateAndDownloadAudio.serverMessageId, new m2g(j, fileDownload.attachType, j2, j3, j4, j5, fileDownload.url, fileDownload.notifyProgress, fileDownload.checkAutoloadConnection, j6, str, fileDownload.invalidateCount, fileDownload.useOriginalExtension, fileDownload.notCopyVideoToGallery, ""));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }
}
