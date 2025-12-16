package com.otaliastudios.transcoder.internal.codec;

import android.media.MediaCodec;
import android.view.Surface;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.k;
import com.otaliastudios.transcoder.internal.utils.m;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: Encoder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/otaliastudios/transcoder/internal/codec/g;", "Lcom/otaliastudios/transcoder/internal/pipeline/j;", "Lcom/otaliastudios/transcoder/internal/codec/l;", "Lcom/otaliastudios/transcoder/internal/codec/k;", "Lcom/otaliastudios/transcoder/internal/data/i;", "Lcom/otaliastudios/transcoder/internal/data/h;", "a", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class g extends com.otaliastudios.transcoder.internal.pipeline.j<l, k, com.otaliastudios.transcoder.internal.data.i, com.otaliastudios.transcoder.internal.data.h> implements k {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f366067m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public static final m<AtomicInteger> f366068n;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final MediaCodec f366069c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Surface f366070d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f366071e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.j f366072f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final i f366073g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final j f366074h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final g f366075i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f366076j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final MediaCodec.BufferInfo f366077k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f366078l;

    /* compiled from: Encoder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/otaliastudios/transcoder/internal/codec/g$a;", "", "<init>", "()V", "Lcom/otaliastudios/transcoder/internal/utils/m;", "Ljava/util/concurrent/atomic/AtomicInteger;", "ID", "Lcom/otaliastudios/transcoder/internal/utils/m;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: Encoder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f366079l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: Encoder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "<anonymous>", "()V"}, k = 3, mv = {1, 5, 1})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f366081m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12) {
            super(0);
            this.f366081m = i12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            g gVar = g.this;
            gVar.f366069c.releaseOutputBuffer(this.f366081m, false);
            gVar.f366074h.setValue(gVar, g.f366067m[1], Integer.valueOf(gVar.i() - 1));
            return G0.f406611a;
        }
    }

    static {
        Y y12 = new Y(g.class, "dequeuedInputs", "getDequeuedInputs()I", 0);
        n0 n0Var = m0.f406844a;
        f366067m = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(g.class, "dequeuedOutputs", "getDequeuedOutputs()I", 0, n0Var)};
        new a(null);
        f366068n = com.otaliastudios.transcoder.internal.utils.n.c(new AtomicInteger(0), new AtomicInteger(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Y61.k com.otaliastudios.transcoder.internal.d dVar, @Y61.k TrackType trackType) {
        com.otaliastudios.transcoder.internal.a aVar = dVar.f366093d;
        MediaCodec mediaCodec = (MediaCodec) aVar.n6(trackType).f406619b;
        Surface surface = (Surface) aVar.n6(trackType).f406620c;
        boolean zBooleanValue = ((Boolean) dVar.f366094e.n6(trackType)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) dVar.f366095f.n6(trackType)).booleanValue();
        this.f366069c = mediaCodec;
        this.f366070d = surface;
        this.f366071e = zBooleanValue2;
        TrackType trackType2 = surface != null ? TrackType.f365975c : TrackType.f365974b;
        trackType2.toString();
        f366068n.n6(trackType2).getAndIncrement();
        this.f366072f = new com.otaliastudios.transcoder.internal.utils.j();
        kotlin.properties.c cVar = kotlin.properties.c.f406879a;
        this.f366073g = new i(this);
        this.f366074h = new j(this);
        this.f366075i = this;
        this.f366076j = C42727D.c(new h(this));
        this.f366077k = new MediaCodec.BufferInfo();
        if (zBooleanValue) {
            mediaCodec.start();
        }
    }

    @Override // com.otaliastudios.transcoder.internal.codec.k
    @Y61.l
    public final Q<ByteBuffer, Integer> a() {
        int iDequeueInputBuffer = this.f366069c.dequeueInputBuffer(0L);
        if (iDequeueInputBuffer < 0) {
            h();
            i();
            this.f366072f.getClass();
            return null;
        }
        int iH2 = h() + 1;
        this.f366073g.setValue(this, f366067m[0], Integer.valueOf(iH2));
        return new Q<>(((com.otaliastudios.transcoder.internal.media.a) this.f366076j.getValue()).f366150a.getInputBuffer(iDequeueInputBuffer), Integer.valueOf(iDequeueInputBuffer));
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.j
    @Y61.k
    public final com.otaliastudios.transcoder.internal.pipeline.k<com.otaliastudios.transcoder.internal.data.i> e() {
        long j12 = this.f366078l ? 5000L : 0L;
        MediaCodec.BufferInfo bufferInfo = this.f366077k;
        MediaCodec mediaCodec = this.f366069c;
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, j12);
        InterfaceC42726C interfaceC42726C = this.f366076j;
        if (iDequeueOutputBuffer == -3) {
            ((com.otaliastudios.transcoder.internal.media.a) interfaceC42726C.getValue()).getClass();
            return k.c.f366180a;
        }
        com.otaliastudios.transcoder.internal.utils.j jVar = this.f366072f;
        if (iDequeueOutputBuffer == -2) {
            L.j(mediaCodec.getOutputFormat(), "INFO_OUTPUT_FORMAT_CHANGED! format=");
            jVar.getClass();
            Object obj = this.f366152b;
            if (obj == null) {
                obj = null;
            }
            ((com.otaliastudios.transcoder.internal.data.h) obj).d(mediaCodec.getOutputFormat());
            return k.c.f366180a;
        }
        if (iDequeueOutputBuffer == -1) {
            if (!this.f366078l) {
                jVar.getClass();
                return k.d.f366181a;
            }
            h();
            i();
            jVar.getClass();
            return new k.a(new com.otaliastudios.transcoder.internal.data.i(ByteBuffer.allocateDirect(0), 0L, 0, b.f366079l));
        }
        if ((bufferInfo.flags & 2) != 0) {
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            return k.c.f366180a;
        }
        this.f366074h.setValue(this, f366067m[1], Integer.valueOf(i() + 1));
        int i12 = bufferInfo.flags;
        boolean z12 = (i12 & 4) != 0;
        ByteBuffer outputBuffer = ((com.otaliastudios.transcoder.internal.media.a) interfaceC42726C.getValue()).f366150a.getOutputBuffer(iDequeueOutputBuffer);
        long j13 = bufferInfo.presentationTimeUs;
        outputBuffer.clear();
        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
        outputBuffer.position(bufferInfo.offset);
        com.otaliastudios.transcoder.internal.data.i iVar = new com.otaliastudios.transcoder.internal.data.i(outputBuffer, j13, i12 & (-5), new c(iDequeueOutputBuffer));
        return z12 ? new k.a(iVar) : new k.b(iVar);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.j
    public final void f(l lVar) throws MediaCodec.CryptoException {
        l lVar2 = lVar;
        if (this.f366070d != null) {
            return;
        }
        ByteBuffer byteBuffer = lVar2.f366087a;
        if (byteBuffer == null) {
            throw new IllegalArgumentException("Audio should always pass a buffer to Encoder.");
        }
        this.f366069c.queueInputBuffer(lVar2.f366088b, byteBuffer.position(), byteBuffer.remaining(), lVar2.f366089c, 0);
        this.f366073g.setValue(this, f366067m[0], Integer.valueOf(h() - 1));
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.j
    public final void g(l lVar) throws MediaCodec.CryptoException {
        l lVar2 = lVar;
        Surface surface = this.f366070d;
        boolean z12 = this.f366071e;
        if (surface != null) {
            if (z12) {
                this.f366069c.signalEndOfInputStream();
                return;
            } else {
                this.f366078l = true;
                return;
            }
        }
        if (!z12) {
            this.f366078l = true;
        }
        this.f366069c.queueInputBuffer(lVar2.f366088b, 0, 0, 0L, !z12 ? 0 : 4);
        this.f366073g.setValue(this, f366067m[0], Integer.valueOf(h() - 1));
    }

    @Override // com.otaliastudios.transcoder.internal.codec.k
    @Y61.l
    /* renamed from: getSurface, reason: from getter */
    public final Surface getF366070d() {
        return this.f366070d;
    }

    public final int h() {
        return this.f366073g.getValue(this, f366067m[0]).intValue();
    }

    public final int i() {
        return this.f366074h.getValue(this, f366067m[1]).intValue();
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final com.otaliastudios.transcoder.internal.pipeline.b r() {
        return this.f366075i;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.a, com.otaliastudios.transcoder.internal.pipeline.l
    public final void release() {
        h();
        i();
        this.f366072f.getClass();
        if (this.f366071e) {
            this.f366069c.stop();
        }
    }
}
