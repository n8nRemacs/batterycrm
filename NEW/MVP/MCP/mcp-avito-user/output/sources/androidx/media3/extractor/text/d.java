package androidx.media3.extractor.text;

import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.decoder.DecoderInputBuffer;
import j.P;
import java.nio.ByteBuffer;

/* compiled from: SimpleSubtitleDecoder.java */
@J
/* loaded from: classes.dex */
public abstract class d extends androidx.media3.decoder.h<h, i, SubtitleDecoderException> implements f {

    /* renamed from: n, reason: collision with root package name */
    public final String f51243n;

    public d(String str) {
        super(new h[2], new i[2]);
        this.f51243n = str;
        int i12 = this.f48349g;
        DecoderInputBuffer[] decoderInputBufferArr = this.f48347e;
        C23110a.g(i12 == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.j(1024);
        }
    }

    @Override // androidx.media3.decoder.h
    public final androidx.media3.decoder.f e() {
        return new c(this);
    }

    @Override // androidx.media3.decoder.h
    public final SubtitleDecoderException f(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    @Override // androidx.media3.decoder.h
    @P
    public final SubtitleDecoderException g(DecoderInputBuffer decoderInputBuffer, androidx.media3.decoder.f fVar, boolean z12) {
        h hVar = (h) decoderInputBuffer;
        i iVar = (i) fVar;
        try {
            ByteBuffer byteBuffer = hVar.f48323d;
            byteBuffer.getClass();
            iVar.i(hVar.f48325f, i(byteBuffer.limit(), byteBuffer.array(), z12), hVar.f51300i);
            iVar.f48328b &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e12) {
            return e12;
        }
    }

    @Override // androidx.media3.decoder.e
    public final String getName() {
        return this.f51243n;
    }

    public abstract e i(int i12, byte[] bArr, boolean z12);

    @Override // androidx.media3.extractor.text.f
    public final void c(long j12) {
    }
}
