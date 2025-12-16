package androidx.media3.exoplayer.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import androidx.media3.common.C23108t;
import androidx.media3.common.InterfaceC23102m;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.s;
import androidx.media3.exoplayer.source.C23172x;
import androidx.media3.extractor.C23195n;
import androidx.media3.extractor.H;
import androidx.media3.extractor.I;
import androidx.media3.extractor.J;
import androidx.media3.extractor.r;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import j.X;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: OutputConsumerAdapterV30.java */
@SuppressLint({"Override"})
@J
@X
/* loaded from: classes.dex */
public final class e implements MediaParser$OutputConsumer {

    /* renamed from: n, reason: collision with root package name */
    public static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> f49799n = Pair.create(MediaParser.SeekPoint.START, MediaParser.SeekPoint.START);

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f49800o = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");

    /* renamed from: g, reason: collision with root package name */
    @P
    public MediaParser.SeekMap f49807g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public String f49808h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f49811k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f49812l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f49813m;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<androidx.media3.extractor.J> f49801a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<C23108t> f49802b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<MediaCodec.CryptoInfo> f49803c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<J.a> f49804d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final b f49805e = new b();

    /* renamed from: f, reason: collision with root package name */
    public r f49806f = new C23195n();

    /* renamed from: j, reason: collision with root package name */
    public final long f49810j = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public final List<C23108t> f49809i = AbstractC37401r1.C();

    /* compiled from: OutputConsumerAdapterV30.java */
    public static final class b implements InterfaceC23102m {

        /* renamed from: a, reason: collision with root package name */
        @P
        public MediaParser$InputReader f49814a;

        public b() {
        }

        @Override // androidx.media3.common.InterfaceC23102m
        public final int read(byte[] bArr, int i12, int i13) {
            MediaParser$InputReader mediaParser$InputReader = this.f49814a;
            int i14 = M.f47887a;
            return d.i(mediaParser$InputReader).read(bArr, i12, i13);
        }
    }

    /* compiled from: OutputConsumerAdapterV30.java */
    public static final class c implements H {

        /* renamed from: a, reason: collision with root package name */
        public final MediaParser.SeekMap f49815a;

        public c(MediaParser.SeekMap seekMap) {
            this.f49815a = seekMap;
        }

        @Override // androidx.media3.extractor.H
        public final long d() {
            long durationMicros = this.f49815a.getDurationMicros();
            if (durationMicros != -2147483648L) {
                return durationMicros;
            }
            return -9223372036854775807L;
        }

        @Override // androidx.media3.extractor.H
        public final H.a f(long j12) {
            Pair seekPoints = this.f49815a.getSeekPoints(j12);
            Object obj = seekPoints.first;
            if (obj == seekPoints.second) {
                MediaParser.SeekPoint seekPointB = C23172x.b(obj);
                I i12 = new I(seekPointB.timeMicros, seekPointB.position);
                return new H.a(i12, i12);
            }
            MediaParser.SeekPoint seekPointB2 = C23172x.b(obj);
            I i13 = new I(seekPointB2.timeMicros, seekPointB2.position);
            MediaParser.SeekPoint seekPointB3 = C23172x.b(seekPoints.second);
            return new H.a(i13, new I(seekPointB3.timeMicros, seekPointB3.position));
        }

        @Override // androidx.media3.extractor.H
        public final boolean g() {
            return this.f49815a.isSeekable();
        }
    }

    public final void a(int i12) {
        for (int size = this.f49801a.size(); size <= i12; size++) {
            this.f49801a.add(null);
            this.f49802b.add(null);
            this.f49803c.add(null);
            this.f49804d.add(null);
        }
    }

    public final void b() {
        if (!this.f49811k || this.f49812l) {
            return;
        }
        int size = this.f49801a.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f49801a.get(i12) == null) {
                return;
            }
        }
        this.f49806f.b();
        this.f49812l = true;
    }

    public final void c(String str) {
        String str2;
        str.getClass();
        switch (str) {
            case "android.media.mediaparser.Mp4Parser":
            case "android.media.mediaparser.FragmentedMp4Parser":
                str2 = "video/mp4";
                break;
            case "android.media.mediaparser.OggParser":
                str2 = "audio/ogg";
                break;
            case "android.media.mediaparser.TsParser":
                str2 = "video/mp2t";
                break;
            case "android.media.mediaparser.AdtsParser":
                str2 = "audio/mp4a-latm";
                break;
            case "android.media.mediaparser.WavParser":
                str2 = "audio/raw";
                break;
            case "android.media.mediaparser.PsParser":
                str2 = "video/mp2p";
                break;
            case "android.media.mediaparser.Ac3Parser":
                str2 = "audio/ac3";
                break;
            case "android.media.mediaparser.AmrParser":
                str2 = "audio/amr";
                break;
            case "android.media.mediaparser.FlacParser":
                str2 = "audio/flac";
                break;
            case "android.media.mediaparser.MatroskaParser":
                str2 = "video/webm";
                break;
            case "android.media.mediaparser.Ac4Parser":
                str2 = "audio/ac4";
                break;
            case "android.media.mediaparser.Mp3Parser":
                str2 = "audio/mpeg";
                break;
            case "android.media.mediaparser.FlvParser":
                str2 = "video/x-flv";
                break;
            default:
                throw new IllegalArgumentException("Illegal parser name: ".concat(str));
        }
        this.f49808h = str2;
    }

    public final void onSampleCompleted(int i12, long j12, int i13, int i14, int i15, @P MediaCodec.CryptoInfo cryptoInfo) throws NumberFormatException {
        int i16;
        int i17;
        J.a aVar;
        ArrayList<J.a> arrayList = this.f49804d;
        ArrayList<MediaCodec.CryptoInfo> arrayList2 = this.f49803c;
        long j13 = this.f49810j;
        if (j13 == -9223372036854775807L || j12 < j13) {
            androidx.media3.extractor.J j14 = this.f49801a.get(i12);
            j14.getClass();
            if (cryptoInfo == null) {
                aVar = null;
            } else if (arrayList2.get(i12) == cryptoInfo) {
                aVar = arrayList.get(i12);
                aVar.getClass();
            } else {
                try {
                    Matcher matcher = f49800o.matcher(cryptoInfo.toString());
                    matcher.find();
                    String strGroup = matcher.group(1);
                    int i18 = M.f47887a;
                    i16 = Integer.parseInt(strGroup);
                    i17 = Integer.parseInt(matcher.group(2));
                } catch (RuntimeException e12) {
                    s.d("Unexpected error while parsing CryptoInfo: " + cryptoInfo, e12);
                    i16 = 0;
                    i17 = 0;
                }
                J.a aVar2 = new J.a(cryptoInfo.mode, i16, i17, cryptoInfo.key);
                arrayList2.set(i12, cryptoInfo);
                arrayList.set(i12, aVar2);
                aVar = aVar2;
            }
            j14.f(j12, i13, i14, i15, aVar);
        }
    }

    public final void onSampleDataFound(int i12, MediaParser$InputReader mediaParser$InputReader) {
        a(i12);
        this.f49805e.f49814a = mediaParser$InputReader;
        androidx.media3.extractor.J jC2 = this.f49801a.get(i12);
        if (jC2 == null) {
            jC2 = this.f49806f.c(i12, -1);
            this.f49801a.set(i12, jC2);
        }
        jC2.a(this.f49805e, (int) mediaParser$InputReader.getLength(), true);
    }

    public final void onSeekMapFound(MediaParser.SeekMap seekMap) {
        H cVar;
        this.f49807g = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        r rVar = this.f49806f;
        if (this.f49813m) {
            if (durationMicros == -2147483648L) {
                durationMicros = -9223372036854775807L;
            }
            cVar = new H.b(durationMicros);
        } else {
            cVar = new c(seekMap);
        }
        rVar.e(cVar);
    }

    public final void onTrackCountFound(int i12) {
        this.f49811k = true;
        b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTrackDataFound(int r19, android.media.MediaParser.TrackData r20) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.mediaparser.e.onTrackDataFound(int, android.media.MediaParser$TrackData):void");
    }
}
