package com.avito.android.comfortable_deal.deal.player;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.InterfaceC23144m;
import com.avito.android.comfortable_deal.deal.player.m;
import j.X;
import kotlin.G0;
import kotlin.Metadata;
import org.webrtc.MediaStreamTrack;

/* compiled from: AudioFocusHelper.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/player/c;", "Lcom/avito/android/comfortable_deal/deal/player/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes12.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC23144m f121748a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f121749b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f121750c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f121751d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f121752e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f121753f = true;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f121754g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final AudioFocusRequest f121755h = new AudioFocusRequest.Builder(1).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: com.avito.android.comfortable_deal.deal.player.b
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i12) {
            c cVar = this.f121747b;
            if (i12 == -3) {
                Y41.a<G0> aVar = cVar.f121749b;
                if (aVar != null) {
                    ((m.b) aVar).invoke();
                    return;
                }
                return;
            }
            if (i12 == -2) {
                synchronized (cVar.f121754g) {
                    cVar.f121753f = cVar.f121748a.k();
                    cVar.f121752e = false;
                    G0 g02 = G0.f406611a;
                }
                Y41.a<G0> aVar2 = cVar.f121751d;
                if (aVar2 != null) {
                    ((m.d) aVar2).invoke();
                    return;
                }
                return;
            }
            if (i12 == -1) {
                synchronized (cVar.f121754g) {
                    cVar.f121753f = false;
                    cVar.f121752e = false;
                    G0 g03 = G0.f406611a;
                }
                Y41.a<G0> aVar3 = cVar.f121751d;
                if (aVar3 != null) {
                    ((m.d) aVar3).invoke();
                    return;
                }
                return;
            }
            if (i12 != 1) {
                return;
            }
            if (cVar.f121752e || cVar.f121753f) {
                synchronized (cVar.f121754g) {
                    cVar.f121752e = false;
                    cVar.f121753f = false;
                    G0 g04 = G0.f406611a;
                }
                Y41.a<G0> aVar4 = cVar.f121750c;
                if (aVar4 != null) {
                    ((m.c) aVar4).invoke();
                }
            }
        }
    }).setAcceptsDelayedFocusGain(true).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).build();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AudioManager f121756i;

    public c(@Y61.k InterfaceC23144m interfaceC23144m, @Y61.k Context context) {
        this.f121748a = interfaceC23144m;
        this.f121756i = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }

    @Override // com.avito.android.comfortable_deal.deal.player.a
    public final void a(@Y61.k Y41.a<G0> aVar) {
        this.f121750c = aVar;
    }

    @Override // com.avito.android.comfortable_deal.deal.player.a
    public final void b(@Y61.k Y41.a<G0> aVar) {
        this.f121751d = aVar;
    }

    @Override // com.avito.android.comfortable_deal.deal.player.a
    public final boolean c() {
        boolean z12;
        int iRequestAudioFocus = this.f121756i.requestAudioFocus(this.f121755h);
        synchronized (this.f121754g) {
            z12 = false;
            if (iRequestAudioFocus != 0) {
                try {
                    if (iRequestAudioFocus == 1) {
                        Y41.a<G0> aVar = this.f121750c;
                        if (aVar != null) {
                            aVar.invoke();
                        }
                        z12 = true;
                    } else if (iRequestAudioFocus == 2) {
                        this.f121752e = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return z12;
    }

    @Override // com.avito.android.comfortable_deal.deal.player.a
    public final void d(@Y61.k Y41.a<G0> aVar) {
        this.f121749b = aVar;
    }

    @Override // com.avito.android.comfortable_deal.deal.player.a
    public final void e() {
        this.f121756i.abandonAudioFocusRequest(this.f121755h);
        Y41.a<G0> aVar = this.f121751d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}
