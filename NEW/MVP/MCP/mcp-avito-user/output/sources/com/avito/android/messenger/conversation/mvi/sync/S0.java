package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.messenger.conversation.mvi.sync.Q0;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import com.avito.android.remote.model.messenger.video.VideosResponse;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: VideoInfoSyncAgent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/video/VideosResponse;", "response", "Lcom/avito/android/messenger/conversation/mvi/sync/Q0$b;", "apply", "(Lcom/avito/android/remote/model/messenger/video/VideosResponse;)Lcom/avito/android/messenger/conversation/mvi/sync/Q0$b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class S0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q0.b f194701b;

    public S0(Q0.b bVar) {
        this.f194701b = bVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        LinkedHashMap linkedHashMap;
        List<VideoInfo> videos = ((VideosResponse) obj).getVideos();
        if (videos != null) {
            List<VideoInfo> list = videos;
            int iF2 = kotlin.collections.P0.f(C42745f0.q(list, 10));
            if (iF2 < 16) {
                iF2 = 16;
            }
            linkedHashMap = new LinkedHashMap(iF2);
            for (T t12 : list) {
                linkedHashMap.put(((VideoInfo) t12).getId(), t12);
            }
        } else {
            linkedHashMap = null;
        }
        Q0.b bVar = this.f194701b;
        return linkedHashMap != null ? new Q0.b(kotlin.collections.P0.k(bVar.f194684a, linkedHashMap)) : bVar;
    }
}
