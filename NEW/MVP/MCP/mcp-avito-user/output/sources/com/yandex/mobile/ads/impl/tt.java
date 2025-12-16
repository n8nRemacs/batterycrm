package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.C36533n;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.audio.C36506d;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;

/* loaded from: classes8.dex */
public final class tt implements d0.g {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final xf f390304a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final wt f390305b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final it0 f390306c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final mt0 f390307d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final ft0 f390308e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final j91 f390309f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final us0 f390310g;

    public tt(@j.N xf xfVar, @j.N wt wtVar, @j.N ft0 ft0Var, @j.N mt0 mt0Var, @j.N it0 it0Var, @j.N j91 j91Var, @j.N us0 us0Var) {
        this.f390304a = xfVar;
        this.f390305b = wtVar;
        this.f390308e = ft0Var;
        this.f390306c = it0Var;
        this.f390307d = mt0Var;
        this.f390309f = j91Var;
        this.f390310g = us0Var;
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onCues(com.google.android.exoplayer2.text.d dVar) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlayWhenReadyChanged(boolean z12, int i12) {
        com.google.android.exoplayer2.d0 d0VarA = this.f390305b.a();
        if (!this.f390304a.b() || d0VarA == null) {
            return;
        }
        this.f390307d.a(z12, d0VarA.getPlaybackState());
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlaybackStateChanged(int i12) {
        com.google.android.exoplayer2.d0 d0VarA = this.f390305b.a();
        if (!this.f390304a.b() || d0VarA == null) {
            return;
        }
        this.f390308e.b(d0VarA, i12);
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlayerError(@j.N PlaybackException playbackException) {
        this.f390306c.a(playbackException);
    }

    @Override // com.google.android.exoplayer2.d0.g
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onRenderedFirstFrame() {
        com.google.android.exoplayer2.d0 d0VarA = this.f390305b.a();
        if (d0VarA != null) {
            onPlaybackStateChanged(d0VarA.getPlaybackState());
        }
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onTimelineChanged(@j.N com.google.android.exoplayer2.s0 s0Var, int i12) {
        this.f390309f.a(s0Var);
    }

    @Override // com.google.android.exoplayer2.d0.g
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPositionDiscontinuity(@j.N d0.k kVar, @j.N d0.k kVar2, int i12) {
        this.f390310g.a();
    }

    @Override // com.google.android.exoplayer2.d0.g
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed() {
    }

    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(C36506d c36506d) {
    }

    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(d0.c cVar) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(C36533n c36533n) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z12) {
    }

    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(com.google.android.exoplayer2.P p12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onMetadata(Metadata metadata) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.c0 c0Var) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(@j.P PlaybackException playbackException) {
    }

    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(com.google.android.exoplayer2.P p12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i12) {
    }

    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j12) {
    }

    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.r rVar) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onTracksChanged(com.google.android.exoplayer2.t0 t0Var) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(com.google.android.exoplayer2.video.o oVar) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i12, boolean z12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onEvents(com.google.android.exoplayer2.d0 d0Var, d0.f fVar) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onMediaItemTransition(@j.P com.google.android.exoplayer2.O o12, int i12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z12, int i12) {
    }

    @Override // com.google.android.exoplayer2.d0.g
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i12, int i13) {
    }
}
