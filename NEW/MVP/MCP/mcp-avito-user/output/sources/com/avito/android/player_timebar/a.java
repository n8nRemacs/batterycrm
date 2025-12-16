package com.avito.android.player_timebar;

import Y61.k;
import com.google.android.material.slider.Slider;
import kotlin.Metadata;

/* compiled from: VideoPlayerTimeBar.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player_timebar/a;", "Lcom/google/android/material/slider/Slider$b;", "_avito_player-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements Slider.b {

    /* renamed from: a, reason: collision with root package name */
    public int f220334a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoPlayerTimeBar f220335b;

    public a(VideoPlayerTimeBar videoPlayerTimeBar) {
        this.f220335b = videoPlayerTimeBar;
    }

    @Override // com.google.android.material.slider.Slider.b, com.google.android.material.slider.b
    /* renamed from: d */
    public final void a(@k Slider slider) {
        VideoPlayerTimeBar videoPlayerTimeBar = this.f220335b;
        this.f220334a = videoPlayerTimeBar.getThumbRadius();
        videoPlayerTimeBar.setThumbRadius((int) (videoPlayerTimeBar.getThumbRadius() * 1.5f));
    }

    @Override // com.google.android.material.slider.Slider.b, com.google.android.material.slider.b
    /* renamed from: f */
    public final void b(@k Slider slider) {
        this.f220335b.setThumbRadius(this.f220334a);
    }
}
