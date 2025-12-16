package androidx.media3.exoplayer.source;

import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.C23192k;

/* compiled from: BundledExtractorsAdapter.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.exoplayer.source.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23151b implements G {

    /* renamed from: a, reason: collision with root package name */
    public final C23192k f49734a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    public androidx.media3.extractor.p f49735b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public C23191j f49736c;

    public C23151b(C23192k c23192k) {
        this.f49734a = c23192k;
    }

    @Override // androidx.media3.exoplayer.source.G
    public final void a(long j12, long j13) {
        androidx.media3.extractor.p pVar = this.f49735b;
        pVar.getClass();
        pVar.a(j12, j13);
    }

    @Override // androidx.media3.exoplayer.source.G
    public final void b() {
        androidx.media3.extractor.p pVar = this.f49735b;
        if (pVar instanceof androidx.media3.extractor.mp3.d) {
            ((androidx.media3.extractor.mp3.d) pVar).f50897r = true;
        }
    }

    @Override // androidx.media3.exoplayer.source.G
    public final long c() {
        C23191j c23191j = this.f49736c;
        if (c23191j != null) {
            return c23191j.f50583d;
        }
        return -1L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // androidx.media3.exoplayer.source.G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(androidx.media3.datasource.j r23, android.net.Uri r24, java.util.Map r25, long r26, long r28, androidx.media3.extractor.r r30) throws androidx.media3.exoplayer.source.UnrecognizedInputFormatException {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.C23151b.d(androidx.media3.datasource.j, android.net.Uri, java.util.Map, long, long, androidx.media3.extractor.r):void");
    }

    @Override // androidx.media3.exoplayer.source.G
    public final int e(androidx.media3.extractor.F f12) {
        androidx.media3.extractor.p pVar = this.f49735b;
        pVar.getClass();
        C23191j c23191j = this.f49736c;
        c23191j.getClass();
        return pVar.h(c23191j, f12);
    }

    @Override // androidx.media3.exoplayer.source.G
    public final void release() {
        androidx.media3.extractor.p pVar = this.f49735b;
        if (pVar != null) {
            pVar.release();
            this.f49735b = null;
        }
        this.f49736c = null;
    }
}
