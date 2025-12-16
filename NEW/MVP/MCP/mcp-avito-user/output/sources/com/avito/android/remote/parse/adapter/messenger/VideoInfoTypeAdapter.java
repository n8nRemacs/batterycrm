package com.avito.android.remote.parse.adapter.messenger;

import com.avito.android.remote.model.messenger.video.VideoInfo;
import com.avito.android.remote.model.messenger.video.VideoStatus;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VideoInfoTypeAdapter.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/VideoInfoTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/video/VideoInfo;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VideoInfoTypeAdapter implements o<VideoInfo>, h<VideoInfo> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        i iVarC;
        VideoInfo videoInfo = (VideoInfo) obj;
        k kVar = new k();
        kVar.t("id", nVar.c(videoInfo.getId()));
        kVar.t(VideoInfo.EMBED_URL, nVar.c(videoInfo.getEmbedUrl()));
        kVar.t(VideoInfo.THUMBNAIL_URL, nVar.c(videoInfo.getThumbnailUrl()));
        kVar.t("duration", nVar.c(Long.valueOf(videoInfo.getDuration())));
        VideoStatus status = videoInfo.getStatus();
        if (status != null && (iVarC = nVar.c(status)) != null) {
            kVar.t("status", iVarC);
        }
        return kVar;
    }

    @Override // com.google.gson.h
    public final VideoInfo deserialize(i iVar, Type type, g gVar) {
        k kVarI = iVar.i();
        String strS = kVarI.D("id").s();
        if (strS == null) {
            return null;
        }
        String strS2 = kVarI.D(VideoInfo.EMBED_URL).s();
        String strS3 = kVarI.D(VideoInfo.THUMBNAIL_URL).s();
        long jL2 = kVarI.D("duration").l();
        i iVarD = kVarI.D("status");
        return new VideoInfo(strS, strS2, strS3, (VideoStatus) (iVarD != null ? gVar.b(iVarD, VideoStatus.class) : null), jL2);
    }
}
