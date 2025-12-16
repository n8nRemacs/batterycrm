package com.avito.android.messenger.conversation.mvi.video;

import android.net.Uri;
import com.avito.android.remote.model.messenger.video.VideoInfo;
import com.avito.android.remote.model.messenger.video.VideosResponse;
import com.avito.android.util.X2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.o;

/* compiled from: VideoMessageClickInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/messenger/video/VideosResponse;", "videosResponse", "Lkotlin/G0;", "apply", "(Lcom/avito/android/remote/model/messenger/video/VideosResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f195000b;

    public i(j jVar) {
        this.f195000b = jVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        VideoInfo videoInfo;
        List<VideoInfo> videos = ((VideosResponse) obj).getVideos();
        String embedUrl = (videos == null || (videoInfo = (VideoInfo) C42745f0.G(videos)) == null) ? null : videoInfo.getEmbedUrl();
        j jVar = this.f195000b;
        if (embedUrl == null || C43066x.K(embedUrl)) {
            X2.f318778a.j(jVar.f207131E, "BubbleClickMutator failed: videoUrl = " + embedUrl, null);
        } else {
            jVar.f195006a0.postValue(Uri.parse(embedUrl));
            jVar.f195007b0.accept(Uri.parse(embedUrl));
        }
        return G0.f406611a;
    }
}
