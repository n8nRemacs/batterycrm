package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.nativeads.video.view.PlaybackControlsContainer;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes8.dex */
public final class gn0 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final dy0 f385783a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final PlaybackControlsContainer f385784b;

    public gn0(@j.N Context context, @j.N dy0 dy0Var, @j.P PlaybackControlsContainer playbackControlsContainer) {
        super(context);
        this.f385783a = dy0Var;
        this.f385784b = playbackControlsContainer;
    }

    @j.P
    public final PlaybackControlsContainer a() {
        return this.f385784b;
    }

    @j.N
    public final dy0 b() {
        return this.f385783a;
    }
}
