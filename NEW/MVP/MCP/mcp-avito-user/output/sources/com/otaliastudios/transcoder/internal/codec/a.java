package com.otaliastudios.transcoder.internal.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.pipeline.k;
import com.otaliastudios.transcoder.internal.utils.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.ranges.o;
import kotlin.reflect.n;
import x11.d;

/* compiled from: Decoder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/otaliastudios/transcoder/internal/codec/a;", "Lcom/otaliastudios/transcoder/internal/pipeline/j;", "Lcom/otaliastudios/transcoder/internal/data/d;", "Lcom/otaliastudios/transcoder/internal/data/c;", "Lcom/otaliastudios/transcoder/internal/codec/c;", "Lcom/otaliastudios/transcoder/internal/codec/b;", "a", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a extends com.otaliastudios.transcoder.internal.pipeline.j<com.otaliastudios.transcoder.internal.data.d, com.otaliastudios.transcoder.internal.data.c, com.otaliastudios.transcoder.internal.codec.c, com.otaliastudios.transcoder.internal.codec.b> implements com.otaliastudios.transcoder.internal.data.c {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f366037l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final m<AtomicInteger> f366038m;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final MediaFormat f366039c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.j f366040d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f366041e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final MediaCodec f366042f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f366043g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final MediaCodec.BufferInfo f366044h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.codec.d f366045i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final d f366046j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final e f366047k;

    /* compiled from: Decoder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/otaliastudios/transcoder/internal/codec/a$a;", "", "<init>", "()V", "Lcom/otaliastudios/transcoder/internal/utils/m;", "Ljava/util/concurrent/atomic/AtomicInteger;", "ID", "Lcom/otaliastudios/transcoder/internal/utils/m;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.otaliastudios.transcoder.internal.codec.a$a, reason: collision with other inner class name */
    public static final class C10799a {
        public /* synthetic */ C10799a(C42822w c42822w) {
            this();
        }

        public C10799a() {
        }
    }

    /* compiled from: Decoder.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/otaliastudios/transcoder/internal/media/a;", "<anonymous>", "()Lcom/otaliastudios/transcoder/internal/media/a;"}, k = 3, mv = {1, 5, 1})
    public static final class b extends N implements Y41.a<com.otaliastudios.transcoder.internal.media.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.otaliastudios.transcoder.internal.media.a invoke() {
            return new com.otaliastudios.transcoder.internal.media.a(a.this.f366042f);
        }
    }

    /* compiled from: Decoder.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 5, 1})
    public static final class c extends N implements Y41.l<Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f366050m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12) {
            super(1);
            this.f366050m = i12;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            a aVar = a.this;
            aVar.f366042f.releaseOutputBuffer(this.f366050m, zBooleanValue);
            aVar.f366047k.setValue(aVar, a.f366037l[1], Integer.valueOf(aVar.i() - 1));
            return G0.f406611a;
        }
    }

    /* compiled from: Delegates.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/properties/a", "Lkotlin/properties/e;", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    public static final class d extends kotlin.properties.e<Integer> {
        public d() {
            super(0);
        }

        @Override // kotlin.properties.e
        public final void afterChange(@Y61.k n<?> nVar, Integer num, Integer num2) {
            num2.intValue();
            num.intValue();
            n<Object>[] nVarArr = a.f366037l;
            a.this.getClass();
        }
    }

    /* compiled from: Delegates.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/properties/a", "Lkotlin/properties/e;", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    public static final class e extends kotlin.properties.e<Integer> {
        public e() {
            super(0);
        }

        @Override // kotlin.properties.e
        public final void afterChange(@Y61.k n<?> nVar, Integer num, Integer num2) {
            num2.intValue();
            num.intValue();
            n<Object>[] nVarArr = a.f366037l;
            a.this.getClass();
        }
    }

    static {
        Y y12 = new Y(a.class, "dequeuedInputs", "getDequeuedInputs()I", 0);
        n0 n0Var = m0.f406844a;
        f366037l = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(a.class, "dequeuedOutputs", "getDequeuedOutputs()I", 0, n0Var)};
        new C10799a(null);
        f366038m = com.otaliastudios.transcoder.internal.utils.n.c(new AtomicInteger(0), new AtomicInteger(0));
    }

    public a(@Y61.k MediaFormat mediaFormat, boolean z12) {
        this.f366039c = mediaFormat;
        TrackType trackTypeA = com.otaliastudios.transcoder.common.c.a(mediaFormat);
        if (trackTypeA == null) {
            throw new IllegalArgumentException(L.j(mediaFormat.getString("mime"), "Unexpected mime type: ").toString());
        }
        trackTypeA.toString();
        m<AtomicInteger> mVar = f366038m;
        TrackType trackTypeA2 = com.otaliastudios.transcoder.common.c.a(mediaFormat);
        if (trackTypeA2 == null) {
            throw new IllegalArgumentException(L.j(mediaFormat.getString("mime"), "Unexpected mime type: ").toString());
        }
        mVar.n6(trackTypeA2).getAndIncrement();
        this.f366040d = new com.otaliastudios.transcoder.internal.utils.j();
        this.f366041e = this;
        this.f366042f = MediaCodec.createDecoderByType(mediaFormat.getString("mime"));
        this.f366043g = C42727D.c(new b());
        this.f366044h = new MediaCodec.BufferInfo();
        this.f366045i = new com.otaliastudios.transcoder.internal.codec.d(z12);
        kotlin.properties.c cVar = kotlin.properties.c.f406879a;
        this.f366046j = new d();
        this.f366047k = new e();
    }

    @Override // com.otaliastudios.transcoder.internal.data.c
    @Y61.l
    public final Q<ByteBuffer, Integer> a() {
        int iDequeueInputBuffer = this.f366042f.dequeueInputBuffer(0L);
        if (iDequeueInputBuffer < 0) {
            h();
            i();
            this.f366040d.getClass();
            return null;
        }
        int iH2 = h() + 1;
        this.f366046j.setValue(this, f366037l[0], Integer.valueOf(iH2));
        return new Q<>(((com.otaliastudios.transcoder.internal.media.a) this.f366043g.getValue()).f366150a.getInputBuffer(iDequeueInputBuffer), Integer.valueOf(iDequeueInputBuffer));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.otaliastudios.transcoder.internal.pipeline.j
    @Y61.k
    public final com.otaliastudios.transcoder.internal.pipeline.k<com.otaliastudios.transcoder.internal.codec.c> e() {
        Long l12;
        Long lValueOf;
        Long l13;
        com.otaliastudios.transcoder.internal.pipeline.k<com.otaliastudios.transcoder.internal.codec.c> aVar;
        MediaCodec.BufferInfo bufferInfo = this.f366044h;
        MediaCodec mediaCodec = this.f366042f;
        int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
        InterfaceC42726C interfaceC42726C = this.f366043g;
        com.otaliastudios.transcoder.internal.utils.j jVar = this.f366040d;
        if (iDequeueOutputBuffer == -3) {
            jVar.getClass();
            ((com.otaliastudios.transcoder.internal.media.a) interfaceC42726C.getValue()).getClass();
            return k.c.f366180a;
        }
        if (iDequeueOutputBuffer == -2) {
            L.j(mediaCodec.getOutputFormat(), "drain(): got INFO_OUTPUT_FORMAT_CHANGED, handling format and retrying. format=");
            jVar.getClass();
            Object obj = this.f366152b;
            ((com.otaliastudios.transcoder.internal.codec.b) (obj != null ? obj : null)).c(mediaCodec.getOutputFormat());
            return k.c.f366180a;
        }
        if (iDequeueOutputBuffer == -1) {
            jVar.getClass();
            return k.d.f366181a;
        }
        boolean z12 = (bufferInfo.flags & 4) != 0;
        if (z12) {
            l13 = 0L;
        } else {
            long j12 = bufferInfo.presentationTimeUs;
            com.otaliastudios.transcoder.internal.codec.d dVar = this.f366045i;
            if (dVar.f366061f == null) {
                dVar.f366061f = Long.valueOf(j12);
            }
            long jLongValue = (j12 - dVar.f366061f.longValue()) + dVar.f366060e.longValue();
            ArrayList arrayList = dVar.f366058c;
            Iterator it = arrayList.iterator();
            long jLongValue2 = 0;
            while (true) {
                boolean zHasNext = it.hasNext();
                boolean z13 = dVar.f366056a;
                if (zHasNext) {
                    o oVar = (o) it.next();
                    jLongValue2 = ((Number) dVar.f366057b.get(oVar)).longValue() + jLongValue2;
                    if (oVar.b(jLongValue)) {
                        lValueOf = z13 ? Long.valueOf(j12 - jLongValue2) : Long.valueOf(j12);
                    }
                } else {
                    o oVar2 = dVar.f366059d;
                    if (oVar2 == null || !oVar2.b(jLongValue)) {
                        L.j(Long.valueOf(j12), "OUTPUT: SKIPPING! outputTimeUs=");
                        l12 = null;
                    } else {
                        if (!arrayList.isEmpty()) {
                            jLongValue2 = (dVar.f366059d.f406915b - ((o) C42745f0.Q(arrayList)).f406916c) + jLongValue2;
                        }
                        lValueOf = z13 ? Long.valueOf(j12 - jLongValue2) : Long.valueOf(j12);
                    }
                }
            }
            l12 = lValueOf;
            l13 = l12;
        }
        if (l13 != null) {
            this.f366047k.setValue(this, f366037l[1], Integer.valueOf(i() + 1));
            com.otaliastudios.transcoder.internal.codec.c cVar = new com.otaliastudios.transcoder.internal.codec.c(((com.otaliastudios.transcoder.internal.media.a) interfaceC42726C.getValue()).f366150a.getOutputBuffer(iDequeueOutputBuffer), l13.longValue(), new c(iDequeueOutputBuffer));
            aVar = z12 ? new k.a<>(cVar) : new k.b<>(cVar);
        } else {
            mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
            aVar = k.d.f366181a;
        }
        L.j(aVar, "drain(): returning ");
        jVar.getClass();
        return aVar;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.j
    public final void f(com.otaliastudios.transcoder.internal.data.d dVar) throws MediaCodec.CryptoException {
        long j12;
        com.otaliastudios.transcoder.internal.data.d dVar2 = dVar;
        this.f366046j.setValue(this, f366037l[0], Integer.valueOf(h() - 1));
        d.a aVar = dVar2.f366105a;
        this.f366042f.queueInputBuffer(dVar2.f366106b, aVar.f442094a.position(), aVar.f442094a.remaining(), aVar.f442096c, aVar.f442095b ? 1 : 0);
        long j13 = aVar.f442096c;
        boolean z12 = aVar.f442097d;
        com.otaliastudios.transcoder.internal.codec.d dVar3 = this.f366045i;
        if (dVar3.f366060e == null) {
            dVar3.f366060e = Long.valueOf(j13);
        }
        if (z12) {
            L.j(Long.valueOf(j13), "INPUT: inputUs=");
            if (dVar3.f366059d == null) {
                dVar3.f366059d = new o(j13, Long.MAX_VALUE);
                return;
            } else {
                dVar3.f366059d = new o(dVar3.f366059d.f406915b, j13);
                return;
            }
        }
        L.j(Long.valueOf(j13), "INPUT: Got SKIPPING input! inputUs=");
        o oVar = dVar3.f366059d;
        if (oVar != null && oVar.f406916c != Long.MAX_VALUE) {
            ArrayList arrayList = dVar3.f366058c;
            arrayList.add(oVar);
            LinkedHashMap linkedHashMap = dVar3.f366057b;
            o oVar2 = dVar3.f366059d;
            if (arrayList.size() >= 2) {
                j12 = dVar3.f366059d.f406915b - ((o) arrayList.get(C42745f0.J(arrayList) - 1)).f406916c;
            } else {
                j12 = 0;
            }
            linkedHashMap.put(oVar2, Long.valueOf(j12));
        }
        dVar3.f366059d = null;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.j
    public final void g(com.otaliastudios.transcoder.internal.data.d dVar) throws MediaCodec.CryptoException {
        this.f366040d.getClass();
        this.f366046j.setValue(this, f366037l[0], Integer.valueOf(h() - 1));
        this.f366042f.queueInputBuffer(dVar.f366106b, 0, 0, 0L, 4);
    }

    public final int h() {
        return this.f366046j.getValue(this, f366037l[0]).intValue();
    }

    public final int i() {
        return this.f366047k.getValue(this, f366037l[1]).intValue();
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final com.otaliastudios.transcoder.internal.pipeline.b r() {
        return this.f366041e;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.a, com.otaliastudios.transcoder.internal.pipeline.l
    public final void release() {
        h();
        i();
        this.f366040d.getClass();
        MediaCodec mediaCodec = this.f366042f;
        mediaCodec.stop();
        mediaCodec.release();
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.a, com.otaliastudios.transcoder.internal.pipeline.l
    public final void t(com.otaliastudios.transcoder.internal.pipeline.b bVar) {
        com.otaliastudios.transcoder.internal.codec.b bVar2 = (com.otaliastudios.transcoder.internal.codec.b) bVar;
        this.f366152b = bVar2;
        this.f366040d.getClass();
        MediaFormat mediaFormat = this.f366039c;
        Surface surfaceB = bVar2.b(mediaFormat);
        MediaCodec mediaCodec = this.f366042f;
        mediaCodec.configure(mediaFormat, surfaceB, (MediaCrypto) null, 0);
        mediaCodec.start();
    }
}
