package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.se1;
import com.yandex.mobile.ads.instream.view.InstreamMuteView;
import com.yandex.mobile.ads.video.playback.view.VideoAdControlsContainer;

/* loaded from: classes8.dex */
public final class np {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final x50 f388345a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final j11<VideoAdControlsContainer> f388346b = new j11<>();

    public np(@Y61.k x50 x50Var) {
        this.f388345a = x50Var;
    }

    @Y61.l
    public final se1 a(@Y61.k Context context, @Y61.k ViewGroup viewGroup) {
        int iA2 = c60.a(this.f388345a);
        this.f388346b.getClass();
        VideoAdControlsContainer videoAdControlsContainer = (VideoAdControlsContainer) j11.a(context, VideoAdControlsContainer.class, iA2, viewGroup);
        if (videoAdControlsContainer == null) {
            return null;
        }
        ImageView imageView = (ImageView) videoAdControlsContainer.findViewById(R.id.sponsored_image);
        ImageView imageView2 = (ImageView) videoAdControlsContainer.findViewById(R.id.favicon);
        TextView textView = (TextView) videoAdControlsContainer.findViewById(R.id.call_to_action);
        ImageView imageView3 = (ImageView) videoAdControlsContainer.findViewById(R.id.instream_call_to_action);
        InstreamMuteView instreamMuteView = (InstreamMuteView) videoAdControlsContainer.findViewById(R.id.instream_mute);
        ProgressBar progressBar = (ProgressBar) videoAdControlsContainer.findViewById(R.id.instream_progress_display_view);
        View viewFindViewById = videoAdControlsContainer.findViewById(R.id.instream_skip);
        TextView textView2 = (TextView) videoAdControlsContainer.findViewById(R.id.domain);
        TextView textView3 = (TextView) videoAdControlsContainer.findViewById(R.id.sponsored);
        TextView textView4 = (TextView) videoAdControlsContainer.findViewById(R.id.ad_position);
        ImageView imageView4 = (ImageView) videoAdControlsContainer.findViewById(R.id.trademark_icon);
        TextView textView5 = (TextView) videoAdControlsContainer.findViewById(R.id.trademark_delimiter);
        View viewFindViewById2 = videoAdControlsContainer.findViewById(R.id.instream_cta_container);
        ImageView imageView5 = (ImageView) videoAdControlsContainer.findViewById(R.id.f382503feedback);
        TextView textView6 = (TextView) videoAdControlsContainer.findViewById(R.id.timer_value);
        return new se1.a(videoAdControlsContainer).d(imageView).b(imageView2).b(textView).a(imageView3).a((gj0) instreamMuteView).a(progressBar).b(viewFindViewById).e(textView3).c(textView2).a(textView4).e(imageView4).f(textView5).d(textView6).a(viewFindViewById2).c(imageView5).g((TextView) videoAdControlsContainer.findViewById(R.id.warning)).a();
    }
}
