package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.CheckBox;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;

/* renamed from: com.yandex.mobile.ads.impl.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C39361s {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final fy0 f389711a = new fy0();

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ys0 f389712b = new ys0();

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final j11<PlaybackControlsContainer> f389713c = new j11<>();

    @j.N
    public final gn0 a(@j.N Context context, @j.N oh1 oh1Var, @j.I int i12) {
        this.f389713c.getClass();
        PlaybackControlsContainer playbackControlsContainer = (PlaybackControlsContainer) j11.a(context, PlaybackControlsContainer.class, i12, null);
        dy0 dy0VarA = this.f389711a.a(context);
        gn0 gn0Var = new gn0(context, dy0VarA, playbackControlsContainer);
        if (playbackControlsContainer != null) {
            this.f389712b.getClass();
            CheckBox checkBox = (CheckBox) playbackControlsContainer.findViewById(R.id.video_mute_control);
            if (checkBox != null) {
                checkBox.setChecked(oh1Var.a());
            }
            playbackControlsContainer.setVisibility(8);
            gn0Var.addView(playbackControlsContainer);
        }
        dy0VarA.setVisibility(8);
        gn0Var.addView(dy0VarA);
        return gn0Var;
    }
}
