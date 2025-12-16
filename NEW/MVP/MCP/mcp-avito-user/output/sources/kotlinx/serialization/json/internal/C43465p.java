package kotlinx.serialization.json.internal;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import kotlin.Metadata;
import kotlin.collections.C42754k;

/* compiled from: CharsetReader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/json/internal/p;", "", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlinx.serialization.json.internal.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43465p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InputStream f413119a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final CharsetDecoder f413120b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ByteBuffer f413121c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f413122d;

    /* renamed from: e, reason: collision with root package name */
    public char f413123e;

    public C43465p(@Y61.k InputStream inputStream, @Y61.k Charset charset) {
        byte[] bArr;
        this.f413119a = inputStream;
        CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this.f413120b = charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        C43458i c43458i = C43458i.f413089b;
        synchronized (c43458i) {
            C42754k<byte[]> c42754k = c43458i.f413099a;
            byte[] bArrRemoveLast = c42754k.isEmpty() ? null : c42754k.removeLast();
            bArr = bArrRemoveLast != null ? bArrRemoveLast : null;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr == null ? new byte[8196] : bArr);
        this.f413121c = byteBufferWrap;
        byteBufferWrap.flip();
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e5, code lost:
    
        r2 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(@Y61.k char[] r11, int r12, int r13) throws java.nio.charset.CharacterCodingException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C43465p.a(char[], int, int):int");
    }
}
