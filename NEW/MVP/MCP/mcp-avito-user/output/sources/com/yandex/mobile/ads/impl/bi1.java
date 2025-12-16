package com.yandex.mobile.ads.impl;

import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;

/* loaded from: classes8.dex */
public final class bi1 implements gg1 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final xi1 f383966a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final w9 f383967b = new w9();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final hm f383968c = new hm();

    public bi1(@j.N xi1 xi1Var) {
        this.f383966a = xi1Var;
    }

    @Override // com.yandex.mobile.ads.impl.gg1
    public final void a(long j12, long j13) {
        ho0 ho0VarB = this.f383966a.b();
        if (ho0VarB != null) {
            PlaybackControlsContainer playbackControlsContainerA = ho0VarB.a().a();
            ProgressBar progressBar = playbackControlsContainerA != null ? (ProgressBar) playbackControlsContainerA.findViewById(R.id.video_progress_control) : null;
            if (progressBar != null) {
                this.f383967b.getClass();
                w9.a(progressBar, j12, j13);
            }
            PlaybackControlsContainer playbackControlsContainerA2 = ho0VarB.a().a();
            TextView textView = playbackControlsContainerA2 != null ? (TextView) playbackControlsContainerA2.findViewById(R.id.video_count_down_control) : null;
            if (textView != null) {
                this.f383968c.a(textView, j12, j13);
            }
        }
    }
}
