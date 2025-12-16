package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaCodec;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import androidx.media3.exoplayer.source.C23172x;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.h;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.extractor.z;
import com.google.android.exoplayer2.upstream.InterfaceC36580j;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.U;
import com.google.common.collect.AbstractC37401r1;
import j.P;
import j.X;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: OutputConsumerAdapterV30.java */
@SuppressLint({"Override"})
@X
/* loaded from: classes6.dex */
public final class c implements MediaParser$OutputConsumer {

    /* renamed from: n, reason: collision with root package name */
    public static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> f346638n = Pair.create(MediaParser.SeekPoint.START, MediaParser.SeekPoint.START);

    /* renamed from: o, reason: collision with root package name */
    public static final Pattern f346639o = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");

    /* renamed from: g, reason: collision with root package name */
    @P
    public MediaParser.SeekMap f346646g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public String f346647h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f346650k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f346651l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f346652m;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<A> f346640a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<I> f346641b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<MediaCodec.CryptoInfo> f346642c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<A.a> f346643d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public final b f346644e = new b();

    /* renamed from: f, reason: collision with root package name */
    public l f346645f = new h();

    /* renamed from: j, reason: collision with root package name */
    public final long f346649j = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    public final List<I> f346648i = AbstractC37401r1.C();

    /* compiled from: OutputConsumerAdapterV30.java */
    public static final class b implements InterfaceC36580j {

        /* renamed from: a, reason: collision with root package name */
        @P
        public MediaParser$InputReader f346653a;

        public b() {
        }

        @Override // com.google.android.exoplayer2.upstream.InterfaceC36580j
        public final int read(byte[] bArr, int i12, int i13) {
            MediaParser$InputReader mediaParser$InputReader = this.f346653a;
            int i14 = U.f348106a;
            return androidx.media3.exoplayer.source.mediaparser.d.i(mediaParser$InputReader).read(bArr, i12, i13);
        }
    }

    /* compiled from: OutputConsumerAdapterV30.java */
    /* renamed from: com.google.android.exoplayer2.source.mediaparser.c$c, reason: collision with other inner class name */
    public static final class C10597c implements y {

        /* renamed from: a, reason: collision with root package name */
        public final MediaParser.SeekMap f346654a;

        public C10597c(MediaParser.SeekMap seekMap) {
            this.f346654a = seekMap;
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final long d() {
            long durationMicros = this.f346654a.getDurationMicros();
            if (durationMicros != -2147483648L) {
                return durationMicros;
            }
            return -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final y.a f(long j12) {
            Pair seekPoints = this.f346654a.getSeekPoints(j12);
            Object obj = seekPoints.first;
            if (obj == seekPoints.second) {
                MediaParser.SeekPoint seekPointB = C23172x.b(obj);
                z zVar = new z(seekPointB.timeMicros, seekPointB.position);
                return new y.a(zVar, zVar);
            }
            MediaParser.SeekPoint seekPointB2 = C23172x.b(obj);
            z zVar2 = new z(seekPointB2.timeMicros, seekPointB2.position);
            MediaParser.SeekPoint seekPointB3 = C23172x.b(seekPoints.second);
            return new y.a(zVar2, new z(seekPointB3.timeMicros, seekPointB3.position));
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final boolean g() {
            return this.f346654a.isSeekable();
        }
    }

    public final void a(int i12) {
        for (int size = this.f346640a.size(); size <= i12; size++) {
            this.f346640a.add(null);
            this.f346641b.add(null);
            this.f346642c.add(null);
            this.f346643d.add(null);
        }
    }

    public final void b() {
        if (!this.f346650k || this.f346651l) {
            return;
        }
        int size = this.f346640a.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (this.f346640a.get(i12) == null) {
                return;
            }
        }
        this.f346645f.b();
        this.f346651l = true;
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
        this.f346647h = str2;
    }

    public final void onSampleCompleted(int i12, long j12, int i13, int i14, int i15, @P MediaCodec.CryptoInfo cryptoInfo) throws NumberFormatException {
        int i16;
        int i17;
        A.a aVar;
        ArrayList<A.a> arrayList = this.f346643d;
        ArrayList<MediaCodec.CryptoInfo> arrayList2 = this.f346642c;
        long j13 = this.f346649j;
        if (j13 == -9223372036854775807L || j12 < j13) {
            A a12 = this.f346640a.get(i12);
            a12.getClass();
            if (cryptoInfo == null) {
                aVar = null;
            } else if (arrayList2.get(i12) == cryptoInfo) {
                aVar = arrayList.get(i12);
                aVar.getClass();
            } else {
                try {
                    Matcher matcher = f346639o.matcher(cryptoInfo.toString());
                    matcher.find();
                    String strGroup = matcher.group(1);
                    int i18 = U.f348106a;
                    i16 = Integer.parseInt(strGroup);
                    i17 = Integer.parseInt(matcher.group(2));
                } catch (RuntimeException e12) {
                    C36605v.a("Unexpected error while parsing CryptoInfo: " + cryptoInfo, e12);
                    i16 = 0;
                    i17 = 0;
                }
                A.a aVar2 = new A.a(cryptoInfo.mode, i16, i17, cryptoInfo.key);
                arrayList2.set(i12, cryptoInfo);
                arrayList.set(i12, aVar2);
                aVar = aVar2;
            }
            a12.f(j12, i13, i14, i15, aVar);
        }
    }

    public final void onSampleDataFound(int i12, MediaParser$InputReader mediaParser$InputReader) {
        a(i12);
        this.f346644e.f346653a = mediaParser$InputReader;
        A aC2 = this.f346640a.get(i12);
        if (aC2 == null) {
            aC2 = this.f346645f.c(i12, -1);
            this.f346640a.set(i12, aC2);
        }
        aC2.b(this.f346644e, (int) mediaParser$InputReader.getLength(), true);
    }

    public final void onSeekMapFound(MediaParser.SeekMap seekMap) {
        y c10597c;
        this.f346646g = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        l lVar = this.f346645f;
        if (this.f346652m) {
            if (durationMicros == -2147483648L) {
                durationMicros = -9223372036854775807L;
            }
            c10597c = new y.b(durationMicros);
        } else {
            c10597c = new C10597c(seekMap);
        }
        lVar.i(c10597c);
    }

    public final void onTrackCountFound(int i12) {
        this.f346650k = true;
        b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTrackDataFound(int r19, android.media.MediaParser.TrackData r20) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.mediaparser.c.onTrackDataFound(int, android.media.MediaParser$TrackData):void");
    }
}
