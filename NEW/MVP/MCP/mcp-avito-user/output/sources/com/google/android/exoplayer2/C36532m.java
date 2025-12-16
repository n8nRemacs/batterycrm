package com.google.android.exoplayer2;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* compiled from: DefaultRenderersFactory.java */
/* renamed from: com.google.android.exoplayer2.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36532m implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f345464a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.mediacodec.j f345465b = new com.google.android.exoplayer2.mediacodec.j();

    /* renamed from: c, reason: collision with root package name */
    public final long f345466c = 5000;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.mediacodec.o f345467d = com.google.android.exoplayer2.mediacodec.n.f345616a;

    /* compiled from: DefaultRenderersFactory.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.exoplayer2.m$a */
    public @interface a {
    }

    public C36532m(Context context) {
        this.f345464a = context;
    }

    @Override // com.google.android.exoplayer2.k0
    public final h0[] a(Handler handler, com.google.android.exoplayer2.video.n nVar, com.google.android.exoplayer2.audio.i iVar, com.google.android.exoplayer2.text.n nVar2, com.google.android.exoplayer2.metadata.d dVar) {
        ArrayList arrayList = new ArrayList();
        com.google.android.exoplayer2.mediacodec.o oVar = this.f345467d;
        arrayList.add(new com.google.android.exoplayer2.video.g(this.f345464a, this.f345465b, oVar, this.f345466c, handler, nVar));
        DefaultAudioSink.e eVar = new DefaultAudioSink.e();
        com.google.android.exoplayer2.audio.e eVar2 = com.google.android.exoplayer2.audio.e.f343983c;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.f345464a;
        com.google.android.exoplayer2.audio.e eVarA = com.google.android.exoplayer2.audio.e.a(context, context.registerReceiver(null, intentFilter));
        eVarA.getClass();
        eVar.f343923a = eVarA;
        if (eVar.f343924b == null) {
            eVar.f343924b = new DefaultAudioSink.g(new AudioProcessor[0]);
        }
        DefaultAudioSink defaultAudioSink = new DefaultAudioSink(eVar, null);
        arrayList.add(new com.google.android.exoplayer2.audio.t(this.f345464a, this.f345465b, oVar, handler, iVar, defaultAudioSink));
        arrayList.add(new com.google.android.exoplayer2.text.o(nVar2, handler.getLooper()));
        arrayList.add(new com.google.android.exoplayer2.metadata.e(dVar, handler.getLooper()));
        arrayList.add(new com.google.android.exoplayer2.video.spherical.b());
        return (h0[]) arrayList.toArray(new h0[0]);
    }
}
