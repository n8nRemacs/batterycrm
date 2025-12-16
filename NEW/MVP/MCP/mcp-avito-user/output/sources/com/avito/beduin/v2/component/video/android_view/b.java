package com.avito.beduin.v2.component.video.android_view;

import Y61.k;
import Y61.l;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.AbstractC36510e;
import com.google.android.exoplayer2.O;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.trackselection.r;
import com.google.android.exoplayer2.video.o;
import j.InterfaceC42167x;
import j.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BeduinPlayer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/video/android_view/b;", "Lcom/google/android/exoplayer2/d0;", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements d0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d0 f336319a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public UU0.a f336320b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f336321c;

    public b(@k d0 d0Var) {
        this.f336319a = d0Var;
    }

    @Override // com.google.android.exoplayer2.d0
    public final int A() {
        return ((AbstractC36510e) this.f336319a).A();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void C() {
        ((AbstractC36510e) this.f336319a).C();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void D(@l @P SurfaceView surfaceView) {
        this.f336319a.D(surfaceView);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void E() {
        this.f336319a.E();
    }

    @Override // com.google.android.exoplayer2.d0
    @k
    public final Looper G() {
        return this.f336319a.G();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void K() {
        ((AbstractC36510e) this.f336319a).K();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void N(@k d0.g gVar) {
        this.f336319a.N(gVar);
    }

    @Override // com.google.android.exoplayer2.d0
    @l
    @P
    public final PlaybackException a() {
        return this.f336319a.a();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void d(@k c0 c0Var) {
        this.f336319a.d(c0Var);
    }

    @Override // com.google.android.exoplayer2.d0
    @k
    public final o e() {
        return this.f336319a.e();
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && L.f(this.f336319a, ((b) obj).f336319a);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void f(int i12, long j12) {
        this.f336319a.f(i12, j12);
    }

    @Override // com.google.android.exoplayer2.d0
    @k
    public final r g() {
        return this.f336319a.g();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long getContentPosition() {
        return this.f336319a.getContentPosition();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getCurrentAdGroupIndex() {
        return this.f336319a.getCurrentAdGroupIndex();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getCurrentAdIndexInAdGroup() {
        return this.f336319a.getCurrentAdIndexInAdGroup();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getCurrentMediaItemIndex() {
        return this.f336319a.getCurrentMediaItemIndex();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getCurrentPeriodIndex() {
        return this.f336319a.getCurrentPeriodIndex();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long getCurrentPosition() {
        return this.f336319a.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.d0
    @k
    public final s0 getCurrentTimeline() {
        return this.f336319a.getCurrentTimeline();
    }

    @Override // com.google.android.exoplayer2.d0
    @k
    public final t0 getCurrentTracks() {
        return this.f336319a.getCurrentTracks();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long getDuration() {
        return this.f336319a.getDuration();
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean getPlayWhenReady() {
        return this.f336319a.getPlayWhenReady();
    }

    @Override // com.google.android.exoplayer2.d0
    @k
    public final c0 getPlaybackParameters() {
        return this.f336319a.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getPlaybackState() {
        return this.f336319a.getPlaybackState();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getPlaybackSuppressionReason() {
        return this.f336319a.getPlaybackSuppressionReason();
    }

    @Override // com.google.android.exoplayer2.d0
    public final int getRepeatMode() {
        return this.f336319a.getRepeatMode();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long getTotalBufferedDuration() {
        return this.f336319a.getTotalBufferedDuration();
    }

    @Override // com.google.android.exoplayer2.d0
    @InterfaceC42167x
    public final float getVolume() {
        return this.f336319a.getVolume();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void h(boolean z12) {
        this.f336319a.h(z12);
    }

    public final int hashCode() {
        return this.f336319a.hashCode();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long i() {
        return ((AbstractC36510e) this.f336319a).i();
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean isPlayingAd() {
        return this.f336319a.isPlayingAd();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long j() {
        return this.f336319a.j();
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean k() {
        return ((AbstractC36510e) this.f336319a).k();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long l() {
        return this.f336319a.l();
    }

    @Override // com.google.android.exoplayer2.d0
    @k
    public final com.google.android.exoplayer2.text.d m() {
        return this.f336319a.m();
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean o() {
        return this.f336319a.o();
    }

    @Override // com.google.android.exoplayer2.d0
    @k
    public final com.google.android.exoplayer2.P p() {
        return this.f336319a.p();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void pause() {
        ((AbstractC36510e) this.f336319a).setPlayWhenReady(false);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void play() {
        ((AbstractC36510e) this.f336319a).setPlayWhenReady(true);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void prepare() {
        this.f336319a.prepare();
    }

    @Override // com.google.android.exoplayer2.d0
    public final long q() {
        return this.f336319a.q();
    }

    @Override // com.google.android.exoplayer2.d0
    public final void r(@k O o12) {
        ((AbstractC36510e) this.f336319a).r(o12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void release() {
        this.f336319a.release();
        this.f336321c = true;
    }

    @Override // com.google.android.exoplayer2.d0
    public final void s(@k d0.g gVar) {
        this.f336319a.s(gVar);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void seekTo(long j12) {
        ((AbstractC36510e) this.f336319a).seekTo(j12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void setPlayWhenReady(boolean z12) {
        this.f336319a.setPlayWhenReady(z12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void setRepeatMode(int i12) {
        this.f336319a.setRepeatMode(i12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void setVideoTextureView(@l @P TextureView textureView) {
        this.f336319a.setVideoTextureView(textureView);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void setVolume(@InterfaceC42167x float f12) {
        this.f336319a.setVolume(f12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void t(@l @P SurfaceView surfaceView) {
        this.f336319a.t(surfaceView);
    }

    @k
    public final String toString() {
        return "BeduinPlayer(player=" + this.f336319a + ')';
    }

    @Override // com.google.android.exoplayer2.d0
    public final boolean u(int i12) {
        return ((AbstractC36510e) this.f336319a).u(i12);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void v(@l @P TextureView textureView) {
        this.f336319a.v(textureView);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void w(@k r rVar) {
        this.f336319a.w(rVar);
    }

    @Override // com.google.android.exoplayer2.d0
    public final void z() {
        this.f336319a.z();
    }
}
