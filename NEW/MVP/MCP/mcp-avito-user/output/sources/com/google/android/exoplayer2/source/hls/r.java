package com.google.android.exoplayer2.source.hls;

import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$SeekableInputReader;
import android.text.TextUtils;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import com.google.android.exoplayer2.util.z;
import com.google.common.collect.AbstractC37401r1;
import j.X;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* compiled from: MediaParserHlsMediaChunkExtractor.java */
@X
/* loaded from: classes6.dex */
public final class r implements m {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.mediaparser.c f346594a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.source.mediaparser.a f346595b = new com.google.android.exoplayer2.source.mediaparser.a();

    /* renamed from: c, reason: collision with root package name */
    public final MediaParser f346596c;

    /* renamed from: d, reason: collision with root package name */
    public final I f346597d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f346598e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC37401r1<MediaFormat> f346599f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.exoplayer2.analytics.p f346600g;

    /* renamed from: h, reason: collision with root package name */
    public int f346601h;

    /* compiled from: MediaParserHlsMediaChunkExtractor.java */
    public static final class b implements MediaParser$SeekableInputReader {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.extractor.k f346602a;

        /* renamed from: b, reason: collision with root package name */
        public int f346603b;

        public b(com.google.android.exoplayer2.extractor.k kVar, a aVar) {
            this.f346602a = kVar;
        }

        public final long getLength() {
            return this.f346602a.getLength();
        }

        public final long getPosition() {
            return this.f346602a.g();
        }

        public final int read(byte[] bArr, int i12, int i13) {
            int iJ2 = this.f346602a.j(i12, i13, bArr);
            this.f346603b += iJ2;
            return iJ2;
        }

        public final void seekToPosition(long j12) {
            throw new UnsupportedOperationException();
        }
    }

    public r(MediaParser mediaParser, com.google.android.exoplayer2.source.mediaparser.c cVar, I i12, boolean z12, AbstractC37401r1<MediaFormat> abstractC37401r1, int i13, com.google.android.exoplayer2.analytics.p pVar) {
        this.f346596c = mediaParser;
        this.f346594a = cVar;
        this.f346598e = z12;
        this.f346599f = abstractC37401r1;
        this.f346597d = i12;
        this.f346600g = pVar;
        this.f346601h = i13;
    }

    @Override // com.google.android.exoplayer2.source.hls.m
    public final boolean a(com.google.android.exoplayer2.extractor.f fVar) throws EOFException, InterruptedIOException {
        fVar.i(this.f346601h);
        this.f346601h = 0;
        com.google.android.exoplayer2.source.mediaparser.a aVar = this.f346595b;
        aVar.f346634a = fVar;
        aVar.f346635b = fVar.f344494c;
        aVar.f346637d = -1L;
        return this.f346596c.advance(aVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.m
    public final void b(com.google.android.exoplayer2.extractor.l lVar) {
        this.f346594a.f346645f = lVar;
    }

    @Override // com.google.android.exoplayer2.source.hls.m
    public final boolean c() {
        String parserName = this.f346596c.getParserName();
        return "android.media.mediaparser.FragmentedMp4Parser".equals(parserName) || "android.media.mediaparser.TsParser".equals(parserName);
    }

    @Override // com.google.android.exoplayer2.source.hls.m
    public final boolean d() {
        String parserName = this.f346596c.getParserName();
        return "android.media.mediaparser.Ac3Parser".equals(parserName) || "android.media.mediaparser.Ac4Parser".equals(parserName) || "android.media.mediaparser.AdtsParser".equals(parserName) || "android.media.mediaparser.Mp3Parser".equals(parserName);
    }

    @Override // com.google.android.exoplayer2.source.hls.m
    public final m e() {
        C36585a.d(!c());
        String[] strArr = {this.f346596c.getParserName()};
        com.google.android.exoplayer2.source.mediaparser.c cVar = this.f346594a;
        AbstractC37401r1<MediaFormat> abstractC37401r1 = this.f346599f;
        com.google.android.exoplayer2.analytics.p pVar = this.f346600g;
        I i12 = this.f346597d;
        boolean z12 = this.f346598e;
        MediaParser mediaParserCreateByName = strArr.length == 1 ? MediaParser.createByName(strArr[0], cVar) : MediaParser.create(cVar, strArr);
        mediaParserCreateByName.setParameter("android.media.mediaParser.exposeCaptionFormats", abstractC37401r1);
        mediaParserCreateByName.setParameter("android.media.mediaParser.overrideInBandCaptionDeclarations", Boolean.valueOf(z12));
        mediaParserCreateByName.setParameter("android.media.mediaparser.inBandCryptoInfo", Boolean.TRUE);
        mediaParserCreateByName.setParameter("android.media.mediaparser.eagerlyExposeTrackType", Boolean.TRUE);
        mediaParserCreateByName.setParameter("android.media.mediaparser.ignoreTimestampOffset", Boolean.TRUE);
        mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreSpliceInfoStream", Boolean.TRUE);
        mediaParserCreateByName.setParameter("android.media.mediaparser.ts.mode", "hls");
        String str = i12.f343473j;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(z.b(str))) {
                mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreAacStream", Boolean.TRUE);
            }
            if (!"video/avc".equals(z.j(str))) {
                mediaParserCreateByName.setParameter("android.media.mediaparser.ts.ignoreAvcStream", Boolean.TRUE);
            }
        }
        if (U.f348106a >= 31) {
            com.google.android.exoplayer2.source.mediaparser.b.a(mediaParserCreateByName, pVar);
        }
        return new r(mediaParserCreateByName, cVar, this.f346597d, this.f346598e, abstractC37401r1, 0, this.f346600g);
    }

    @Override // com.google.android.exoplayer2.source.hls.m
    public final void f() {
        this.f346596c.seek(MediaParser.SeekPoint.START);
    }
}
