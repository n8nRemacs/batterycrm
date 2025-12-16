package com.otaliastudios.transcoder.internal.transcode;

import android.media.MediaCodec;
import com.otaliastudios.transcoder.common.TrackStatus;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.m;
import com.otaliastudios.transcoder.internal.utils.m;
import java.util.Iterator;
import java.util.Objects;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.Z;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.sequences.C43033p;
import v11.C49143b;

/* compiled from: DefaultTranscodeEngine.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/transcoder/internal/transcode/a;", "Lcom/otaliastudios/transcoder/internal/transcode/l;", "a", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a extends l {

    /* renamed from: m, reason: collision with root package name */
    public static final long f366184m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f366185n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f366186o = 0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.e f366187c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.sink.b f366188d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.validator.a f366189e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final y11.c f366190f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C49143b f366191g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.utils.j f366192h = new com.otaliastudios.transcoder.internal.utils.j();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final m f366193i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.g f366194j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.l f366195k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.otaliastudios.transcoder.internal.d f366196l;

    /* compiled from: DefaultTranscodeEngine.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/otaliastudios/transcoder/internal/transcode/a$a;", "", "<init>", "()V", "", "PROGRESS_LOOPS", "J", "WAIT_MS", "lib_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.otaliastudios.transcoder.internal.transcode.a$a, reason: collision with other inner class name */
    public static final class C10802a {
        public /* synthetic */ C10802a(C42822w c42822w) {
            this();
        }

        public C10802a() {
        }
    }

    /* compiled from: DefaultTranscodeEngine.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[TrackStatus.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            iArr[3] = 4;
        }
    }

    static {
        new C10802a(null);
        f366184m = 10L;
        f366185n = 10L;
    }

    public a(@Y61.k com.otaliastudios.transcoder.internal.e eVar, @Y61.k com.otaliastudios.transcoder.sink.b bVar, @Y61.k com.otaliastudios.transcoder.internal.utils.m mVar, @Y61.k com.otaliastudios.transcoder.validator.a aVar, @Y61.k y11.c cVar, @Y61.k C49143b c49143b, @Y61.k com.otaliastudios.transcoder.time.a aVar2) {
        this.f366187c = eVar;
        this.f366188d = bVar;
        this.f366189e = aVar;
        this.f366190f = cVar;
        this.f366191g = c49143b;
        m mVar2 = new m(mVar, eVar);
        this.f366193i = mVar2;
        com.otaliastudios.transcoder.internal.g gVar = new com.otaliastudios.transcoder.internal.g(eVar, mVar2, new e(4, this, a.class, "createPipeline", "createPipeline(Lcom/otaliastudios/transcoder/common/TrackType;ILcom/otaliastudios/transcoder/common/TrackStatus;Landroid/media/MediaFormat;)Lcom/otaliastudios/transcoder/internal/pipeline/Pipeline;", 0));
        this.f366194j = gVar;
        com.otaliastudios.transcoder.internal.utils.k<Integer> kVar = gVar.f366130e;
        this.f366195k = new com.otaliastudios.transcoder.internal.l(aVar2, eVar, mVar2, kVar);
        this.f366196l = new com.otaliastudios.transcoder.internal.d(eVar, mVar2, kVar);
        bVar.f366251b.setOrientationHint(0);
        double[] dArr = (double[]) C43033p.n(C43033p.y(new C42770s0(C42745f0.v(C42745f0.h0(eVar.u(), eVar.q2()))), d.f366201l));
        if (dArr != null) {
            double d12 = dArr[0];
            double d13 = dArr[1];
            bVar.f366251b.setLocation((float) d12, (float) d13);
        }
        TrackType trackType = TrackType.f365975c;
        com.otaliastudios.transcoder.internal.utils.m<TrackStatus> mVar3 = mVar2.f366147a;
        bVar.c(trackType, mVar3.u());
        bVar.c(TrackType.f365974b, mVar3.q2());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        try {
            int i12 = Z.f406624c;
            com.otaliastudios.transcoder.internal.g gVar = this.f366194j;
            com.otaliastudios.transcoder.internal.utils.k<com.otaliastudios.transcoder.internal.f> kVar = gVar.f366129d;
            com.otaliastudios.transcoder.internal.f fVarL0 = kVar.L0();
            if (fVarL0 != null) {
                gVar.a(fVarL0);
            }
            com.otaliastudios.transcoder.internal.f fVarG3 = kVar.g3();
            if (fVarG3 != null) {
                gVar.a(fVarG3);
            }
            G0 g02 = G0.f406611a;
        } catch (Throwable unused) {
            int i13 = Z.f406624c;
        }
        try {
            com.otaliastudios.transcoder.sink.b bVar = this.f366188d;
            bVar.getClass();
            try {
                bVar.f366251b.release();
            } catch (Exception unused2) {
            }
            G0 g03 = G0.f406611a;
        } catch (Throwable unused3) {
            int i14 = Z.f406624c;
        }
        try {
            com.otaliastudios.transcoder.internal.e eVar = this.f366187c;
            eVar.f366117b.getClass();
            eVar.a(eVar.u());
            eVar.a(eVar.q2());
            eVar.a(eVar.f366118c);
            G0 g04 = G0.f406611a;
        } catch (Throwable unused4) {
            int i15 = Z.f406624c;
        }
        try {
            com.otaliastudios.transcoder.internal.a aVar = this.f366196l.f366093d;
            aVar.getClass();
            Iterator itB = m.a.b(aVar);
            while (itB.hasNext()) {
                ((MediaCodec) ((Q) itB.next()).f406619b).release();
            }
            G0 g05 = G0.f406611a;
            int i16 = Z.f406624c;
        } catch (Throwable unused5) {
            int i17 = Z.f406624c;
        }
    }

    public final void c(@Y61.k Y41.l<? super Double, G0> lVar) throws InterruptedException {
        com.otaliastudios.transcoder.internal.l lVar2 = this.f366195k;
        lVar2.a();
        com.otaliastudios.transcoder.internal.h hVar = lVar2.f366144f;
        Objects.toString(hVar.g3());
        Objects.toString(hVar.L0());
        this.f366192h.getClass();
        long j12 = 0;
        while (true) {
            TrackType trackType = TrackType.f365974b;
            com.otaliastudios.transcoder.internal.g gVar = this.f366194j;
            com.otaliastudios.transcoder.internal.f fVarC = gVar.c(trackType);
            TrackType trackType2 = TrackType.f365975c;
            com.otaliastudios.transcoder.internal.f fVarC2 = gVar.c(trackType2);
            boolean z12 = false;
            boolean zA2 = (fVarC == null ? false : fVarC.a()) | (fVarC2 == null ? false : fVarC2.a());
            if (!zA2 && !gVar.b(trackType2) && !gVar.b(trackType)) {
                z12 = true;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (z12) {
                ((k) lVar).invoke(Double.valueOf(1.0d));
                this.f366188d.f366251b.stop();
                return;
            } else if (zA2) {
                j12++;
                if (j12 % f366185n == 0) {
                    com.otaliastudios.transcoder.internal.k kVar = lVar2.f366145g;
                    ((k) lVar).invoke(Double.valueOf((((Number) kVar.u()).doubleValue() + ((Number) kVar.q2()).doubleValue()) / this.f366193i.f366149c.getSize()));
                }
            } else {
                Thread.sleep(f366184m);
            }
        }
    }

    public final boolean d() {
        TrackStatus trackStatus;
        com.otaliastudios.transcoder.internal.m mVar = this.f366193i;
        TrackStatus trackStatusU = mVar.f366147a.u();
        TrackStatus trackStatusQ2 = mVar.f366147a.q2();
        this.f366189e.getClass();
        TrackStatus trackStatus2 = TrackStatus.f365971e;
        if (trackStatusU == trackStatus2 || trackStatusQ2 == trackStatus2 || trackStatusU == (trackStatus = TrackStatus.f365969c) || trackStatusQ2 == trackStatus) {
            return true;
        }
        this.f366192h.getClass();
        return false;
    }
}
