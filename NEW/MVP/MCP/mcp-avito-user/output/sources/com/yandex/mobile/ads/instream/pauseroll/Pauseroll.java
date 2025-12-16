package com.yandex.mobile.ads.instream.pauseroll;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakEventListener;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdPlayer;
import com.yandex.mobile.ads.instream.player.ad.InstreamAdView;
import com.yandex.mobile.ads.video.playback.VideoAdPlaybackListener;
import j.K;
import j.N;
import j.P;

@K
/* loaded from: classes8.dex */
public interface Pauseroll {
    @N
    InstreamAdBreak getInstreamAdBreak();

    void invalidate();

    void pause();

    void play(@N InstreamAdView instreamAdView);

    void prepare(@N InstreamAdPlayer instreamAdPlayer);

    void resume();

    void setListener(@P InstreamAdBreakEventListener instreamAdBreakEventListener);

    void setVideoAdPlaybackListener(@P VideoAdPlaybackListener videoAdPlaybackListener);
}
