package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* compiled from: DefaultRenderersFactory.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23143l implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f49218a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.exoplayer.mediacodec.j f49219b = new androidx.media3.exoplayer.mediacodec.j();

    /* renamed from: c, reason: collision with root package name */
    public final long f49220c = 5000;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.mediacodec.q f49221d = androidx.media3.exoplayer.mediacodec.p.f49394a;

    /* compiled from: DefaultRenderersFactory.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.exoplayer.l$a */
    public @interface a {
    }

    public C23143l(Context context) {
        this.f49218a = context;
    }

    @Override // androidx.media3.exoplayer.f0
    public final c0[] a(Handler handler, androidx.media3.exoplayer.video.l lVar, androidx.media3.exoplayer.audio.h hVar, androidx.media3.exoplayer.text.c cVar, androidx.media3.exoplayer.metadata.b bVar) {
        ArrayList arrayList = new ArrayList();
        androidx.media3.exoplayer.mediacodec.q qVar = this.f49221d;
        arrayList.add(new androidx.media3.exoplayer.video.c(this.f49218a, this.f49219b, qVar, this.f49220c, handler, lVar));
        DefaultAudioSink.g gVar = new DefaultAudioSink.g(this.f49218a);
        if (gVar.f48832c == null) {
            gVar.f48832c = new DefaultAudioSink.i(new AudioProcessor[0]);
        }
        DefaultAudioSink defaultAudioSink = new DefaultAudioSink(gVar, null);
        arrayList.add(new androidx.media3.exoplayer.audio.r(this.f49218a, this.f49219b, qVar, handler, hVar, defaultAudioSink));
        arrayList.add(new androidx.media3.exoplayer.text.d(cVar, handler.getLooper()));
        arrayList.add(new androidx.media3.exoplayer.metadata.c(bVar, handler.getLooper()));
        arrayList.add(new androidx.media3.exoplayer.video.spherical.b());
        return (c0[]) arrayList.toArray(new c0[0]);
    }
}
