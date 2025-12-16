package com.avito.android.video_snippets;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.util.D6;
import com.avito.android.video_snippets.b;
import com.avito.android.video_snippets.g;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.d0;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: VideoSnippetsPlayerListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/video_snippets/f;", "Lcom/google/android/exoplayer2/d0$g;", "_avito_video-snippets_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class f implements d0.g {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f326081b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC36534o f326082c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f326083d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final c f326084e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final l41.g<b> f326085f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f326086g;

    public f(boolean z12, @k InterfaceC36534o interfaceC36534o, @k SimpleDraweeView simpleDraweeView, @k c cVar, @l l41.g gVar) {
        this.f326081b = z12;
        this.f326082c = interfaceC36534o;
        this.f326083d = simpleDraweeView;
        this.f326084e = cVar;
        this.f326085f = gVar;
    }

    public final void a(InterfaceC36534o interfaceC36534o) {
        l41.g<b> gVar;
        if (this.f326086g && interfaceC36534o.getPlayWhenReady() && interfaceC36534o.getPlaybackState() == 3 && (gVar = this.f326085f) != null) {
            gVar.accept(new b.C10076b(J80.g.a(interfaceC36534o)));
        }
    }

    public final void b(VideoStopReason videoStopReason) {
        InterfaceC36534o interfaceC36534o = this.f326082c;
        Double dB2 = J80.g.b(interfaceC36534o);
        if (dB2 != null) {
            double dDoubleValue = dB2.doubleValue();
            l41.g<b> gVar = this.f326085f;
            if (gVar != null) {
                gVar.accept(new b.c(J80.g.a(interfaceC36534o), dDoubleValue, interfaceC36534o.getCurrentPosition() / 1000.0d, videoStopReason));
            }
        }
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onIsPlayingChanged(boolean z12) {
        g.c value;
        c cVar = this.f326084e;
        Map.Entry<String, g.c> entryI = cVar.i();
        Integer numValueOf = null;
        String key = entryI != null ? entryI.getKey() : null;
        String f220326i = cVar.f326070b.getF220326i();
        Map.Entry<String, g.c> entryI2 = cVar.i();
        if (entryI2 != null && (value = entryI2.getValue()) != null) {
            numValueOf = Integer.valueOf(value.f326089c);
        }
        cVar.f326069a.c(numValueOf, key, f220326i, z12);
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlayWhenReadyChanged(boolean z12, int i12) {
        if (!z12 && i12 == 1) {
            if (this.f326081b) {
                D6.H(this.f326083d);
            }
            b(VideoStopReason.f90113d);
        } else if (z12 && i12 == 1) {
            a(this.f326082c);
        }
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlaybackStateChanged(int i12) {
        g.c value;
        c cVar = this.f326084e;
        J80.b bVar = cVar.f326069a;
        if (i12 == 2) {
            bVar.g();
            return;
        }
        if (i12 != 3) {
            if (i12 != 4) {
                return;
            }
            if (this.f326081b) {
                D6.H(this.f326083d);
            }
            cVar.h(false);
            b(VideoStopReason.f90111b);
            return;
        }
        a(this.f326082c);
        Map.Entry<String, g.c> entryI = cVar.i();
        SimpleDraweeView simpleDraweeView = (entryI == null || (value = entryI.getValue()) == null) ? null : value.f326095i;
        if (simpleDraweeView != null) {
            simpleDraweeView.setVisibility(8);
        }
        bVar.b();
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlayerError(@k PlaybackException playbackException) {
        l41.g<b> gVar = this.f326085f;
        if (gVar != null) {
            String strA = J80.g.a(this.f326082c);
            String message = playbackException.getMessage();
            if (message == null) {
                message = "";
            }
            gVar.accept(new b.a(strA, message));
        }
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onRenderedFirstFrame() {
        this.f326084e.f326069a.d();
        this.f326086g = true;
        a(this.f326082c);
    }
}
