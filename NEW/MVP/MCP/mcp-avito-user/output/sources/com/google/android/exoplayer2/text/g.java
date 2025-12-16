package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.util.C36585a;
import j.P;
import java.nio.ByteBuffer;

/* compiled from: SimpleSubtitleDecoder.java */
/* loaded from: classes6.dex */
public abstract class g extends com.google.android.exoplayer2.decoder.j<l, m, SubtitleDecoderException> implements i {

    /* renamed from: n, reason: collision with root package name */
    public final String f346909n;

    public g(String str) {
        super(new l[2], new m[2]);
        this.f346909n = str;
        int i12 = this.f344248g;
        DecoderInputBuffer[] decoderInputBufferArr = this.f344246e;
        C36585a.d(i12 == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.j(1024);
        }
    }

    @Override // com.google.android.exoplayer2.decoder.j
    public final com.google.android.exoplayer2.decoder.g e() {
        return new f(this);
    }

    @Override // com.google.android.exoplayer2.decoder.j
    public final SubtitleDecoderException f(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    @Override // com.google.android.exoplayer2.decoder.j
    @P
    public final SubtitleDecoderException g(DecoderInputBuffer decoderInputBuffer, com.google.android.exoplayer2.decoder.g gVar, boolean z12) {
        l lVar = (l) decoderInputBuffer;
        m mVar = (m) gVar;
        try {
            ByteBuffer byteBuffer = lVar.f344205d;
            byteBuffer.getClass();
            mVar.i(lVar.f344207f, i(byteBuffer.limit(), byteBuffer.array(), z12), lVar.f346915i);
            mVar.f344210b &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e12) {
            return e12;
        }
    }

    @Override // com.google.android.exoplayer2.decoder.e
    public final String getName() {
        return this.f346909n;
    }

    public abstract h i(int i12, byte[] bArr, boolean z12);

    @Override // com.google.android.exoplayer2.text.i
    public final void c(long j12) {
    }
}
