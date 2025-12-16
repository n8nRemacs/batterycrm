package com.avito.android.remote.parse.adapter.messenger;

import com.avito.android.remote.C34328m0;
import com.avito.android.remote.model.messenger.video.VideoStatus;
import com.google.gson.g;
import com.google.gson.h;
import com.google.gson.i;
import com.google.gson.n;
import com.google.gson.o;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoStatusTypeAdapter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/parse/adapter/messenger/VideoStatusTypeAdapter;", "Lcom/google/gson/o;", "Lcom/avito/android/remote/model/messenger/video/VideoStatus;", "Lcom/google/gson/h;", "<init>", "()V", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VideoStatusTypeAdapter implements o<VideoStatus>, h<VideoStatus> {
    @Override // com.google.gson.o
    public final i a(Object obj, n nVar) {
        String name;
        VideoStatus videoStatus = (VideoStatus) obj;
        if (videoStatus instanceof VideoStatus.Created) {
            name = "created";
        } else if (videoStatus instanceof VideoStatus.Uploading) {
            name = "uploading";
        } else if (videoStatus instanceof VideoStatus.Uploaded) {
            name = "uploaded";
        } else if (videoStatus instanceof VideoStatus.Banned) {
            name = "banned";
        } else if (videoStatus instanceof VideoStatus.Error) {
            name = "error";
        } else {
            if (!(videoStatus instanceof VideoStatus.Unsupported)) {
                throw new NoWhenBranchMatchedException();
            }
            name = ((VideoStatus.Unsupported) videoStatus).getName();
        }
        return nVar.c(name);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.google.gson.h
    public final VideoStatus deserialize(i iVar, Type type, g gVar) {
        String strE = C34328m0.e(iVar);
        if (strE == null) {
            return null;
        }
        switch (strE.hashCode()) {
            case -1396343010:
                if (strE.equals("banned")) {
                    return VideoStatus.Banned.INSTANCE;
                }
                break;
            case 96784904:
                if (strE.equals("error")) {
                    return VideoStatus.Error.INSTANCE;
                }
                break;
            case 1028554472:
                if (strE.equals("created")) {
                    return VideoStatus.Created.INSTANCE;
                }
                break;
            case 1239105089:
                if (strE.equals("uploading")) {
                    return VideoStatus.Uploading.INSTANCE;
                }
                break;
            case 1563991648:
                if (strE.equals("uploaded")) {
                    return VideoStatus.Uploaded.INSTANCE;
                }
                break;
        }
        return new VideoStatus.Unsupported(strE);
    }
}
