package com.avito.android.remote.parse.adapter.messenger;

import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VideoMessageBodyTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/VideoMessageBodyTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/message/MessageBody$Video;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VideoMessageBodyTypeAdapter implements o<MessageBody.Video>, h<MessageBody.Video> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        MessageBody.Video video = (MessageBody.Video) obj;
        k kVar = new k();
        String fileId = video.getFileId();
        if (fileId != null) {
            kVar.t("fileId", nVar.c(fileId));
        }
        String videoId = video.getVideoId();
        if (videoId != null) {
            kVar.t(MessageBody.Video.VIDEO_ID, nVar.c(videoId));
        }
        String randomId = video.getRandomId();
        if (randomId != null) {
            kVar.t(MessageBody.RANDOM_ID, nVar.c(randomId));
        }
        return kVar;
    }

    @Override // com.google.gson.h
    public final MessageBody.Video deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        i iVarD = kVarI.D("fileId");
        String strE = iVarD != null ? C34328m0.e(iVarD) : null;
        i iVarD2 = kVarI.D(MessageBody.Video.VIDEO_ID);
        String strE2 = iVarD2 != null ? C34328m0.e(iVarD2) : null;
        i iVarD3 = kVarI.D(MessageBody.RANDOM_ID);
        return new MessageBody.Video(strE, strE2, iVarD3 != null ? C34328m0.e(iVarD3) : null);
    }
}
