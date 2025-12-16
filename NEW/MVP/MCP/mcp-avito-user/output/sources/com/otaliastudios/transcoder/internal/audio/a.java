package com.otaliastudios.transcoder.internal.audio;

import Y41.q;
import android.media.MediaFormat;
import android.view.Surface;
import com.otaliastudios.transcoder.internal.codec.k;
import com.otaliastudios.transcoder.internal.codec.l;
import com.otaliastudios.transcoder.internal.pipeline.j;
import com.otaliastudios.transcoder.internal.pipeline.k;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42754k;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import u11.C48765b;
import u11.InterfaceC48764a;
import v11.C49143b;
import v11.InterfaceC49142a;
import y11.InterfaceC50039a;

/* compiled from: AudioEngine.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u00020\u0003:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/otaliastudios/transcoder/internal/audio/a;", "Lcom/otaliastudios/transcoder/internal/pipeline/j;", "Lcom/otaliastudios/transcoder/internal/codec/c;", "Lcom/otaliastudios/transcoder/internal/codec/b;", "Lcom/otaliastudios/transcoder/internal/codec/l;", "Lcom/otaliastudios/transcoder/internal/codec/k;", "a", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a extends j<com.otaliastudios.transcoder.internal.codec.c, com.otaliastudios.transcoder.internal.codec.b, l, k> implements com.otaliastudios.transcoder.internal.codec.b {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final AtomicInteger f366009l;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final y11.c f366010c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C49143b f366011d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final MediaFormat f366012e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.j f366013f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a f366014g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final f f366015h;

    /* renamed from: i, reason: collision with root package name */
    public MediaFormat f366016i;

    /* renamed from: j, reason: collision with root package name */
    public d f366017j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC48764a f366018k;

    /* compiled from: AudioEngine.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/otaliastudios/transcoder/internal/audio/a$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicInteger;", "ID", "Ljava/util/concurrent/atomic/AtomicInteger;", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.otaliastudios.transcoder.internal.audio.a$a, reason: collision with other inner class name */
    public static final class C10798a {
        public /* synthetic */ C10798a(C42822w c42822w) {
            this();
        }

        public C10798a() {
        }
    }

    /* compiled from: AudioEngine.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Ljava/nio/ShortBuffer;", "inBuffer", "", "timeUs", "", "stretch", "Lcom/otaliastudios/transcoder/internal/pipeline/k$b;", "Lcom/otaliastudios/transcoder/internal/codec/l;", "<anonymous>", "(Ljava/nio/ShortBuffer;JD)Lcom/otaliastudios/transcoder/internal/pipeline/k$b;"}, k = 3, mv = {1, 5, 1})
    public static final class b extends N implements q<ShortBuffer, Long, Double, k.b<l>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ ShortBuffer f366019l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f366020m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ByteBuffer f366021n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f366022o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ShortBuffer shortBuffer, a aVar, ByteBuffer byteBuffer, int i12) {
            super(3);
            this.f366019l = shortBuffer;
            this.f366020m = aVar;
            this.f366021n = byteBuffer;
            this.f366022o = i12;
        }

        @Override // Y41.q
        public final k.b<l> invoke(ShortBuffer shortBuffer, Long l12, Double d12) {
            ShortBuffer shortBuffer2;
            String str;
            ShortBuffer shortBuffer3 = shortBuffer;
            long jLongValue = l12.longValue();
            double dDoubleValue = d12.doubleValue();
            ShortBuffer shortBuffer4 = this.f366019l;
            int iRemaining = shortBuffer4.remaining();
            int iRemaining2 = shortBuffer3.remaining();
            double d13 = iRemaining2;
            double dCeil = Math.ceil(d13 * dDoubleValue);
            a aVar = this.f366020m;
            InterfaceC48764a interfaceC48764a = aVar.f366018k;
            if (interfaceC48764a == null) {
                interfaceC48764a = null;
            }
            double dA2 = interfaceC48764a.a((int) dCeil);
            MediaFormat mediaFormat = aVar.f366012e;
            double integer = dA2 * mediaFormat.getInteger("sample-rate");
            MediaFormat mediaFormat2 = aVar.f366016i;
            if (mediaFormat2 == null) {
                mediaFormat2 = null;
            }
            double dCeil2 = Math.ceil(integer / mediaFormat2.getInteger("sample-rate"));
            double d14 = iRemaining;
            int iFloor = dCeil2 <= d14 ? iRemaining2 : (int) Math.floor(d14 / (dCeil2 / d13));
            shortBuffer3.limit(shortBuffer3.position() + iFloor);
            int iCeil = (int) Math.ceil(iFloor * dDoubleValue);
            f fVar = aVar.f366015h;
            ShortBuffer shortBufferA = fVar.a(iCeil, "stretch");
            MediaFormat mediaFormat3 = aVar.f366016i;
            if (mediaFormat3 == null) {
                mediaFormat3 = null;
            }
            int integer2 = mediaFormat3.getInteger("channel-count");
            aVar.f366010c.getClass();
            if (shortBuffer3.remaining() < shortBufferA.remaining()) {
                InterfaceC50039a.f442858c.getClass();
                if (shortBuffer3.remaining() >= shortBufferA.remaining()) {
                    throw new IllegalArgumentException("Illegal use of AudioStretcher.INSERT");
                }
                int i12 = 2;
                if (integer2 != 1 && integer2 != 2) {
                    throw new IllegalArgumentException(AK.c.g(integer2, "Illegal use of AudioStretcher.INSERT. Channels:"));
                }
                int iRemaining3 = shortBuffer3.remaining() / integer2;
                shortBuffer2 = shortBuffer4;
                str = "channel-count";
                int iFloor2 = (int) Math.floor((shortBufferA.remaining() - shortBuffer3.remaining()) / integer2);
                float f12 = iRemaining3;
                float f13 = f12 / f12;
                float f14 = iFloor2;
                float f15 = f14 / f14;
                while (iRemaining3 > 0 && iFloor2 > 0) {
                    if (f13 >= f15) {
                        shortBufferA.put(shortBuffer3.get());
                        if (integer2 == i12) {
                            shortBufferA.put(shortBuffer3.get());
                        }
                        iRemaining3--;
                        f13 = iRemaining3 / f12;
                    } else {
                        Random random = y11.d.f442859d;
                        int i13 = iRemaining3;
                        shortBufferA.put((short) random.nextInt(300));
                        if (integer2 == 2) {
                            shortBufferA.put((short) random.nextInt(300));
                        }
                        iFloor2--;
                        f15 = iFloor2 / f12;
                        i12 = 2;
                        iRemaining3 = i13;
                    }
                }
            } else {
                shortBuffer2 = shortBuffer4;
                str = "channel-count";
                if (shortBuffer3.remaining() > shortBufferA.remaining()) {
                    InterfaceC50039a.f442857b.getClass();
                    if (shortBuffer3.remaining() < shortBufferA.remaining()) {
                        throw new IllegalArgumentException("Illegal use of CutAudioStretcher");
                    }
                    int iRemaining4 = shortBuffer3.remaining() - shortBufferA.remaining();
                    shortBuffer3.limit(shortBuffer3.limit() - iRemaining4);
                    shortBufferA.put(shortBuffer3);
                    shortBuffer3.limit(shortBuffer3.limit() + iRemaining4);
                    shortBuffer3.position(shortBuffer3.limit());
                } else {
                    InterfaceC50039a.f442856a.getClass();
                    if (shortBuffer3.remaining() > shortBufferA.remaining()) {
                        throw new IllegalArgumentException("Illegal use of PassThroughAudioStretcher");
                    }
                    shortBufferA.put(shortBuffer3);
                }
            }
            shortBufferA.flip();
            InterfaceC48764a interfaceC48764a2 = aVar.f366018k;
            if (interfaceC48764a2 == null) {
                interfaceC48764a2 = null;
            }
            ShortBuffer shortBufferA2 = fVar.a(interfaceC48764a2.a(iCeil), "remix");
            InterfaceC48764a interfaceC48764a3 = aVar.f366018k;
            if (interfaceC48764a3 == null) {
                interfaceC48764a3 = null;
            }
            interfaceC48764a3.b(shortBufferA, shortBufferA2);
            shortBufferA2.flip();
            MediaFormat mediaFormat4 = aVar.f366016i;
            if (mediaFormat4 == null) {
                mediaFormat4 = null;
            }
            int integer3 = mediaFormat4.getInteger("sample-rate");
            int integer4 = mediaFormat.getInteger("sample-rate");
            int integer5 = mediaFormat.getInteger(str);
            aVar.f366011d.getClass();
            ShortBuffer shortBuffer5 = this.f366019l;
            if (integer3 < integer4) {
                InterfaceC49142a.f440365b.getClass();
                if (integer3 > integer4) {
                    throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
                }
                if (integer5 != 1 && integer5 != 2) {
                    throw new IllegalArgumentException(AK.c.g(integer5, "Illegal use of UpsampleAudioResampler. Channels:"));
                }
                int iRemaining5 = shortBufferA2.remaining() / integer5;
                int iCeil2 = ((int) Math.ceil((integer4 / integer3) * iRemaining5)) - iRemaining5;
                float f16 = iRemaining5;
                float f17 = f16 / f16;
                float f18 = iCeil2;
                float f19 = f18 / f18;
                while (iRemaining5 > 0 && iCeil2 > 0) {
                    if (f17 >= f19) {
                        shortBuffer5.put(shortBufferA2.get());
                        if (integer5 == 2) {
                            shortBuffer5.put(shortBufferA2.get());
                        }
                        iRemaining5--;
                        f17 = iRemaining5 / f16;
                    } else {
                        shortBuffer5.put(shortBuffer5.get(shortBuffer5.position() - integer5));
                        if (integer5 == 2) {
                            shortBuffer5.put(shortBuffer5.get(shortBuffer5.position() - integer5));
                        }
                        iCeil2--;
                        f19 = iCeil2 / f18;
                    }
                }
            } else if (integer3 > integer4) {
                InterfaceC49142a.f440364a.getClass();
                if (integer3 < integer4) {
                    throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
                }
                if (integer5 != 1 && integer5 != 2) {
                    throw new IllegalArgumentException(AK.c.g(integer5, "Illegal use of DownsampleAudioResampler. Channels:"));
                }
                int iRemaining6 = shortBufferA2.remaining() / integer5;
                int iCeil3 = (int) Math.ceil((integer4 / integer3) * iRemaining6);
                int i14 = iRemaining6 - iCeil3;
                float f22 = iCeil3;
                float f23 = f22 / f22;
                float f24 = i14;
                float f25 = f24 / f24;
                while (iCeil3 > 0 && i14 > 0) {
                    if (f23 >= f25) {
                        shortBuffer5.put(shortBufferA2.get());
                        if (integer5 == 2) {
                            shortBuffer5.put(shortBufferA2.get());
                        }
                        iCeil3--;
                        f23 = iCeil3 / f22;
                    } else {
                        shortBufferA2.position(shortBufferA2.position() + integer5);
                        i14--;
                        f25 = i14 / f24;
                    }
                }
            } else {
                InterfaceC49142a.f440366c.getClass();
                if (integer3 != integer4) {
                    throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
                }
                shortBuffer5.put(shortBufferA2);
            }
            shortBuffer2.flip();
            ByteBuffer byteBuffer = this.f366021n;
            byteBuffer.clear();
            byteBuffer.limit(shortBuffer2.limit() * 2);
            byteBuffer.position(shortBuffer2.position() * 2);
            return new k.b<>(new l(byteBuffer, jLongValue, this.f366022o));
        }
    }

    static {
        new C10798a(null);
        f366009l = new AtomicInteger(0);
    }

    public a(@Y61.k y11.c cVar, @Y61.k C49143b c49143b, @Y61.k MediaFormat mediaFormat) {
        this.f366010c = cVar;
        this.f366011d = c49143b;
        this.f366012e = mediaFormat;
        f366009l.getAndIncrement();
        this.f366013f = new com.otaliastudios.transcoder.internal.utils.j();
        this.f366014g = this;
        this.f366015h = new f();
    }

    @Override // com.otaliastudios.transcoder.internal.codec.b
    @Y61.l
    public final Surface b(@Y61.k MediaFormat mediaFormat) {
        return null;
    }

    @Override // com.otaliastudios.transcoder.internal.codec.b
    public final void c(@Y61.k MediaFormat mediaFormat) {
        mediaFormat.toString();
        this.f366013f.getClass();
        this.f366016i = mediaFormat;
        InterfaceC48764a.C12700a c12700a = InterfaceC48764a.f439723a;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = this.f366012e.getInteger("channel-count");
        c12700a.getClass();
        if (!C42756l.l0(new Integer[]{1, 2}).contains(Integer.valueOf(integer))) {
            throw new IllegalStateException(L.j(Integer.valueOf(integer), "Input channel count not supported: ").toString());
        }
        if (!C42756l.l0(new Integer[]{1, 2}).contains(Integer.valueOf(integer2))) {
            throw new IllegalStateException(L.j(Integer.valueOf(integer), "Input channel count not supported: ").toString());
        }
        this.f366018k = integer < integer2 ? new u11.d() : integer > integer2 ? new C48765b() : new u11.c();
        this.f366017j = new d(mediaFormat.getInteger("sample-rate"), mediaFormat.getInteger("channel-count"));
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.j
    @Y61.k
    public final com.otaliastudios.transcoder.internal.pipeline.k<l> e() {
        d dVar = this.f366017j;
        if (dVar == null) {
            dVar = null;
        }
        boolean zIsEmpty = dVar.f366033c.isEmpty();
        com.otaliastudios.transcoder.internal.utils.j jVar = this.f366013f;
        if (zIsEmpty) {
            jVar.getClass();
            return k.d.f366181a;
        }
        Object obj = this.f366152b;
        if (obj == null) {
            obj = null;
        }
        Q<ByteBuffer, Integer> qA2 = ((com.otaliastudios.transcoder.internal.codec.k) obj).a();
        if (qA2 == null) {
            jVar.getClass();
            return k.d.f366181a;
        }
        ByteBuffer byteBuffer = qA2.f406619b;
        int iIntValue = qA2.f406620c.intValue();
        ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
        d dVar2 = this.f366017j;
        d dVar3 = dVar2 != null ? dVar2 : null;
        com.otaliastudios.transcoder.internal.pipeline.k aVar = new k.a(new l(byteBuffer, 0L, iIntValue));
        b bVar = new b(shortBufferAsShortBuffer, this, byteBuffer, iIntValue);
        C42754k<c> c42754k = dVar3.f366033c;
        c cVarRemoveFirst = c42754k.removeFirst();
        c.f366024e.getClass();
        if (cVarRemoveFirst != c.f366025f) {
            int iRemaining = cVarRemoveFirst.f366026a.remaining();
            ShortBuffer shortBuffer = cVarRemoveFirst.f366026a;
            int iLimit = shortBuffer.limit();
            com.otaliastudios.transcoder.internal.pipeline.k kVarInvoke = bVar.invoke(shortBuffer, Long.valueOf(cVarRemoveFirst.f366027b), Double.valueOf(cVarRemoveFirst.f366028c));
            shortBuffer.limit(iLimit);
            if (shortBuffer.hasRemaining()) {
                c42754k.addFirst(new c(cVarRemoveFirst.f366026a, (((iRemaining - shortBuffer.remaining()) * 2) * 1000000) / ((dVar3.f366031a * 2) * dVar3.f366032b), cVarRemoveFirst.f366028c, cVarRemoveFirst.f366029d));
            } else {
                cVarRemoveFirst.f366029d.invoke();
            }
            aVar = kVarInvoke;
        }
        return aVar;
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.j
    public final void f(com.otaliastudios.transcoder.internal.codec.c cVar) {
        com.otaliastudios.transcoder.internal.codec.c cVar2 = cVar;
        com.otaliastudios.transcoder.internal.codec.f fVar = cVar2 instanceof com.otaliastudios.transcoder.internal.codec.f ? (com.otaliastudios.transcoder.internal.codec.f) cVar2 : null;
        double d12 = fVar == null ? 1.0d : fVar.f366066d;
        d dVar = this.f366017j;
        d dVar2 = dVar != null ? dVar : null;
        ShortBuffer shortBufferAsShortBuffer = cVar2.f366053a.asShortBuffer();
        com.otaliastudios.transcoder.internal.audio.b bVar = new com.otaliastudios.transcoder.internal.audio.b(cVar2);
        dVar2.getClass();
        if (!shortBufferAsShortBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        dVar2.f366033c.addLast(new c(shortBufferAsShortBuffer, cVar2.f366054b, d12, bVar));
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.j
    public final void g(com.otaliastudios.transcoder.internal.codec.c cVar) {
        this.f366013f.getClass();
        cVar.f366055c.invoke(Boolean.FALSE);
        d dVar = this.f366017j;
        if (dVar == null) {
            dVar = null;
        }
        dVar.getClass();
        c.f366024e.getClass();
        dVar.f366033c.addLast(c.f366025f);
    }

    @Override // com.otaliastudios.transcoder.internal.pipeline.l
    public final com.otaliastudios.transcoder.internal.pipeline.b r() {
        return this.f366014g;
    }
}
