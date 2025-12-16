package x11;

import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import com.otaliastudios.transcoder.common.TrackType;
import com.otaliastudios.transcoder.internal.utils.k;
import com.otaliastudios.transcoder.internal.utils.n;
import j.N;
import j.P;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import x11.d;

/* compiled from: DefaultDataSource.java */
/* loaded from: classes7.dex */
public abstract class f implements d {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicInteger f442099l = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public final com.otaliastudios.transcoder.internal.utils.j f442100a;

    /* renamed from: b, reason: collision with root package name */
    public final k<MediaFormat> f442101b;

    /* renamed from: c, reason: collision with root package name */
    public final k<Integer> f442102c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet<TrackType> f442103d;

    /* renamed from: e, reason: collision with root package name */
    public final k<Long> f442104e;

    /* renamed from: f, reason: collision with root package name */
    public MediaMetadataRetriever f442105f;

    /* renamed from: g, reason: collision with root package name */
    public MediaExtractor f442106g;

    /* renamed from: h, reason: collision with root package name */
    public long f442107h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f442108i;

    /* renamed from: j, reason: collision with root package name */
    public long f442109j;

    /* renamed from: k, reason: collision with root package name */
    public long f442110k;

    public f() {
        f442099l.getAndIncrement();
        this.f442100a = new com.otaliastudios.transcoder.internal.utils.j();
        this.f442101b = n.a();
        this.f442102c = n.a();
        this.f442103d = new HashSet<>();
        this.f442104e = n.b(0L, 0L);
        this.f442105f = null;
        this.f442106g = null;
        this.f442107h = Long.MIN_VALUE;
        this.f442108i = false;
        this.f442109j = -1L;
        this.f442110k = -1L;
    }

    @Override // x11.d
    public final void a() {
        this.f442100a.getClass();
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.f442106g = mediaExtractor;
        try {
            m(mediaExtractor);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            this.f442105f = mediaMetadataRetriever;
            n(mediaMetadataRetriever);
            int trackCount = this.f442106g.getTrackCount();
            for (int i12 = 0; i12 < trackCount; i12++) {
                MediaFormat trackFormat = this.f442106g.getTrackFormat(i12);
                TrackType trackTypeA = com.otaliastudios.transcoder.common.c.a(trackFormat);
                if (trackTypeA != null) {
                    k<Integer> kVar = this.f442102c;
                    if (!kVar.K1(trackTypeA)) {
                        kVar.a5(trackTypeA, Integer.valueOf(i12));
                        this.f442101b.a5(trackTypeA, trackFormat);
                    }
                }
            }
            for (int i13 = 0; i13 < this.f442106g.getTrackCount(); i13++) {
                this.f442106g.selectTrack(i13);
            }
            this.f442107h = this.f442106g.getSampleTime();
            for (int i14 = 0; i14 < this.f442106g.getTrackCount(); i14++) {
                this.f442106g.unselectTrack(i14);
            }
            this.f442108i = true;
        } catch (IOException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // x11.d
    public final int b() {
        this.f442100a.getClass();
        try {
            return Integer.parseInt(this.f442105f.extractMetadata(24));
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @Override // x11.d
    public final long c() {
        if (!this.f442108i) {
            return 0L;
        }
        k<Long> kVar = this.f442104e;
        return Math.max(kVar.q2().longValue(), kVar.u().longValue()) - this.f442107h;
    }

    @Override // x11.d
    public final long d() {
        try {
            return Long.parseLong(this.f442105f.extractMetadata(9)) * 1000;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    @Override // x11.d
    public final boolean e() {
        return this.f442106g.getSampleTrackIndex() < 0;
    }

    @Override // x11.d
    public final void f(@N TrackType trackType) {
        Objects.toString(trackType);
        this.f442100a.getClass();
        HashSet<TrackType> hashSet = this.f442103d;
        if (hashSet.contains(trackType)) {
            return;
        }
        hashSet.add(trackType);
        this.f442106g.selectTrack(this.f442102c.n6(trackType).intValue());
    }

    @Override // x11.d
    public final void g() throws IOException {
        this.f442100a.getClass();
        try {
            this.f442106g.release();
        } catch (Exception unused) {
        }
        try {
            this.f442105f.release();
        } catch (Exception unused2) {
        }
        this.f442103d.clear();
        this.f442107h = Long.MIN_VALUE;
        this.f442104e.v1(0L, 0L);
        this.f442101b.v1(null, null);
        this.f442102c.v1(null, null);
        this.f442109j = -1L;
        this.f442110k = -1L;
        this.f442108i = false;
    }

    @Override // x11.d
    public final boolean h(@N TrackType trackType) {
        return this.f442106g.getSampleTrackIndex() == this.f442102c.n6(trackType).intValue();
    }

    @Override // x11.d
    public final void i(@N TrackType trackType) {
        Objects.toString(trackType);
        this.f442100a.getClass();
        HashSet<TrackType> hashSet = this.f442103d;
        if (hashSet.contains(trackType)) {
            hashSet.remove(trackType);
            this.f442106g.unselectTrack(this.f442102c.n6(trackType).intValue());
        }
    }

    @Override // x11.d
    public final boolean isInitialized() {
        return this.f442108i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    @Override // x11.d
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double[] j() {
        /*
            r7 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            com.otaliastudios.transcoder.internal.utils.j r3 = r7.f442100a
            r3.getClass()
            android.media.MediaMetadataRetriever r3 = r7.f442105f
            r4 = 23
            java.lang.String r3 = r3.extractMetadata(r4)
            r4 = 0
            if (r3 == 0) goto L51
            com.otaliastudios.transcoder.internal.utils.i r5 = new com.otaliastudios.transcoder.internal.utils.i
            r5.<init>()
            java.util.regex.Pattern r5 = r5.f366221a
            java.util.regex.Matcher r3 = r5.matcher(r3)
            boolean r5 = r3.find()
            if (r5 == 0) goto L41
            int r5 = r3.groupCount()
            if (r5 != r1) goto L41
            java.lang.String r5 = r3.group(r2)
            java.lang.String r3 = r3.group(r1)
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L41
            float r3 = java.lang.Float.parseFloat(r3)     // Catch: java.lang.NumberFormatException -> L41
            float[] r6 = new float[r1]     // Catch: java.lang.NumberFormatException -> L41
            r6[r0] = r5     // Catch: java.lang.NumberFormatException -> L41
            r6[r2] = r3     // Catch: java.lang.NumberFormatException -> L41
            goto L42
        L41:
            r6 = r4
        L42:
            if (r6 == 0) goto L51
            r3 = r6[r0]
            double r3 = (double) r3
            r5 = r6[r2]
            double r5 = (double) r5
            double[] r1 = new double[r1]
            r1[r0] = r3
            r1[r2] = r5
            return r1
        L51:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x11.f.j():double[]");
    }

    @Override // x11.d
    public final void k(@N d.a aVar) {
        int sampleTrackIndex = this.f442106g.getSampleTrackIndex();
        int iPosition = aVar.f442094a.position();
        int iLimit = aVar.f442094a.limit();
        int sampleData = this.f442106g.readSampleData(aVar.f442094a, iPosition);
        if (sampleData < 0) {
            throw new IllegalStateException("No samples available! Forgot to call canReadTrack / isDrained?");
        }
        int i12 = sampleData + iPosition;
        if (i12 > iLimit) {
            throw new IllegalStateException("MediaExtractor is not respecting the buffer limit. This might cause other issues down the pipeline.");
        }
        aVar.f442094a.limit(i12);
        aVar.f442094a.position(iPosition);
        aVar.f442095b = (this.f442106g.getSampleFlags() & 1) != 0;
        long sampleTime = this.f442106g.getSampleTime();
        aVar.f442096c = sampleTime;
        aVar.f442097d = sampleTime < this.f442109j || sampleTime >= this.f442110k;
        this.f442100a.getClass();
        k<Integer> kVar = this.f442102c;
        TrackType trackType = (kVar.b3() && kVar.q2().intValue() == sampleTrackIndex) ? TrackType.f365974b : (kVar.getHasVideo() && kVar.u().intValue() == sampleTrackIndex) ? TrackType.f365975c : null;
        if (trackType == null) {
            throw new RuntimeException(AK.c.g(sampleTrackIndex, "Unknown type: "));
        }
        this.f442104e.a5(trackType, Long.valueOf(aVar.f442096c));
        this.f442106g.advance();
        if (aVar.f442097d || !e()) {
            return;
        }
        aVar.f442097d = true;
    }

    @Override // x11.d
    @P
    public final MediaFormat l(@N TrackType trackType) {
        Objects.toString(trackType);
        this.f442100a.getClass();
        return this.f442101b.c4(trackType);
    }

    public abstract void m(@N MediaExtractor mediaExtractor);

    public abstract void n(@N MediaMetadataRetriever mediaMetadataRetriever);
}
