package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.List;

/* compiled from: ForwardingPlayer.java */
/* loaded from: classes6.dex */
public class K implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC36534o f343522a;

    /* compiled from: ForwardingPlayer.java */
    public static final class a implements d0.g {

        /* renamed from: b, reason: collision with root package name */
        public final K f343523b;

        /* renamed from: c, reason: collision with root package name */
        public final d0.g f343524c;

        public a(K k12, d0.g gVar) {
            this.f343523b = k12;
            this.f343524c = gVar;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f343523b.equals(aVar.f343523b)) {
                return this.f343524c.equals(aVar.f343524c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f343524c.hashCode() + (this.f343523b.hashCode() * 31);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onAvailableCommandsChanged(d0.c cVar) {
            this.f343524c.onAvailableCommandsChanged(cVar);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onCues(List<com.google.android.exoplayer2.text.a> list) {
            this.f343524c.onCues(list);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onDeviceInfoChanged(C36533n c36533n) {
            this.f343524c.onDeviceInfoChanged(c36533n);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onDeviceVolumeChanged(int i12, boolean z12) {
            this.f343524c.onDeviceVolumeChanged(i12, z12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onEvents(d0 d0Var, d0.f fVar) {
            this.f343524c.onEvents(this.f343523b, fVar);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onIsLoadingChanged(boolean z12) {
            this.f343524c.onIsLoadingChanged(z12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onIsPlayingChanged(boolean z12) {
            this.f343524c.onIsPlayingChanged(z12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onLoadingChanged(boolean z12) {
            this.f343524c.onIsLoadingChanged(z12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onMediaItemTransition(@j.P O o12, int i12) {
            this.f343524c.onMediaItemTransition(o12, i12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onMediaMetadataChanged(P p12) {
            this.f343524c.onMediaMetadataChanged(p12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onMetadata(Metadata metadata) {
            this.f343524c.onMetadata(metadata);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlayWhenReadyChanged(boolean z12, int i12) {
            this.f343524c.onPlayWhenReadyChanged(z12, i12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlaybackParametersChanged(c0 c0Var) {
            this.f343524c.onPlaybackParametersChanged(c0Var);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlaybackStateChanged(int i12) {
            this.f343524c.onPlaybackStateChanged(i12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlaybackSuppressionReasonChanged(int i12) {
            this.f343524c.onPlaybackSuppressionReasonChanged(i12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlayerError(PlaybackException playbackException) {
            this.f343524c.onPlayerError(playbackException);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlayerErrorChanged(@j.P PlaybackException playbackException) {
            this.f343524c.onPlayerErrorChanged(playbackException);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPlayerStateChanged(boolean z12, int i12) {
            this.f343524c.onPlayerStateChanged(z12, i12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPositionDiscontinuity(int i12) {
            this.f343524c.onPositionDiscontinuity(i12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onRenderedFirstFrame() {
            this.f343524c.onRenderedFirstFrame();
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onRepeatModeChanged(int i12) {
            this.f343524c.onRepeatModeChanged(i12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onSeekProcessed() {
            this.f343524c.onSeekProcessed();
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onShuffleModeEnabledChanged(boolean z12) {
            this.f343524c.onShuffleModeEnabledChanged(z12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onSkipSilenceEnabledChanged(boolean z12) {
            this.f343524c.onSkipSilenceEnabledChanged(z12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onSurfaceSizeChanged(int i12, int i13) {
            this.f343524c.onSurfaceSizeChanged(i12, i13);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onTimelineChanged(s0 s0Var, int i12) {
            this.f343524c.onTimelineChanged(s0Var, i12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.r rVar) {
            this.f343524c.onTrackSelectionParametersChanged(rVar);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onTracksChanged(t0 t0Var) {
            this.f343524c.onTracksChanged(t0Var);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onVideoSizeChanged(com.google.android.exoplayer2.video.o oVar) {
            this.f343524c.onVideoSizeChanged(oVar);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onVolumeChanged(float f12) {
            this.f343524c.onVolumeChanged(f12);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onCues(com.google.android.exoplayer2.text.d dVar) {
            this.f343524c.onCues(dVar);
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onPositionDiscontinuity(d0.k kVar, d0.k kVar2, int i12) {
            this.f343524c.onPositionDiscontinuity(kVar, kVar2, i12);
        }
    }

    public K(InterfaceC36534o interfaceC36534o) {
        this.f343522a = interfaceC36534o;
    }

    @Override // com.google.android.exoplayer2.d0
    public final int A() {
        return this.f343522a.A();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void C() {
        this.f343522a.C();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void D(@j.P SurfaceView surfaceView) {
        this.f343522a.D(surfaceView);
    }

    @Override // com.google.android.exoplayer2.d0
    public void E() {
        this.f343522a.E();
    }

    @Override // com.google.android.exoplayer2.d0
    public final Looper G() {
        return this.f343522a.G();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void K() {
        this.f343522a.K();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void N(d0.g gVar) {
        this.f343522a.N(new a(this, gVar));
    }

    @Override // com.google.android.exoplayer2.d0
    @j.P
    public final PlaybackException a() {
        return this.f343522a.a();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void d(c0 c0Var) {
        this.f343522a.d(c0Var);
    }

    @Override // com.google.android.exoplayer2.d0
    public final com.google.android.exoplayer2.video.o e() {
        return this.f343522a.e();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void f(int i12, long j12) {
        this.f343522a.f(i12, j12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final com.google.android.exoplayer2.trackselection.r g() {
        return this.f343522a.g();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long getContentPosition() {
        return this.f343522a.getContentPosition();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getCurrentAdGroupIndex() {
        return this.f343522a.getCurrentAdGroupIndex();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getCurrentAdIndexInAdGroup() {
        return this.f343522a.getCurrentAdIndexInAdGroup();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getCurrentMediaItemIndex() {
        return this.f343522a.getCurrentMediaItemIndex();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getCurrentPeriodIndex() {
        return this.f343522a.getCurrentPeriodIndex();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long getCurrentPosition() {
        return this.f343522a.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.d0
    public final s0 getCurrentTimeline() {
        return this.f343522a.getCurrentTimeline();
    }

    @Override // com.google.android.exoplayer2.d0
    public final t0 getCurrentTracks() {
        return this.f343522a.getCurrentTracks();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long getDuration() {
        return this.f343522a.getDuration();
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean getPlayWhenReady() {
        return this.f343522a.getPlayWhenReady();
    }

    @Override // com.google.android.exoplayer2.d0
    public final c0 getPlaybackParameters() {
        return this.f343522a.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getPlaybackState() {
        return this.f343522a.getPlaybackState();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getPlaybackSuppressionReason() {
        return this.f343522a.getPlaybackSuppressionReason();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getRepeatMode() {
        return this.f343522a.getRepeatMode();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long getTotalBufferedDuration() {
        return this.f343522a.getTotalBufferedDuration();
    }

    @Override // com.google.android.exoplayer2.d0
    public final float getVolume() {
        return this.f343522a.getVolume();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void h(boolean z12) {
        this.f343522a.h(z12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final long i() {
        return this.f343522a.i();
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean isPlayingAd() {
        return this.f343522a.isPlayingAd();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long j() {
        return this.f343522a.j();
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean k() {
        return this.f343522a.k();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long l() {
        return this.f343522a.l();
    }

    @Override // com.google.android.exoplayer2.d0
    public final com.google.android.exoplayer2.text.d m() {
        return this.f343522a.m();
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean o() {
        return this.f343522a.o();
    }

    @Override // com.google.android.exoplayer2.d0
    public final P p() {
        return this.f343522a.p();
    }

    @Override // com.google.android.exoplayer2.d0
    public void pause() {
        this.f343522a.pause();
    }

    @Override // com.google.android.exoplayer2.d0
    public void play() {
        this.f343522a.play();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void prepare() {
        this.f343522a.prepare();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long q() {
        return this.f343522a.q();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void r(O o12) {
        this.f343522a.r(o12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void release() {
        this.f343522a.release();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void s(d0.g gVar) {
        this.f343522a.s(new a(this, gVar));
    }

    @Override // com.google.android.exoplayer2.d0
    public final void seekTo(long j12) {
        this.f343522a.seekTo(j12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void setPlayWhenReady(boolean z12) {
        this.f343522a.setPlayWhenReady(z12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void setRepeatMode(int i12) {
        this.f343522a.setRepeatMode(i12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void setVideoTextureView(@j.P TextureView textureView) {
        this.f343522a.setVideoTextureView(textureView);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void setVolume(float f12) {
        this.f343522a.setVolume(f12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void t(@j.P SurfaceView surfaceView) {
        this.f343522a.t(surfaceView);
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean u(int i12) {
        return this.f343522a.u(i12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void v(@j.P TextureView textureView) {
        this.f343522a.v(textureView);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void w(com.google.android.exoplayer2.trackselection.r rVar) {
        this.f343522a.w(rVar);
    }

    @Override // com.google.android.exoplayer2.d0
    public void z() {
        this.f343522a.z();
    }
}
