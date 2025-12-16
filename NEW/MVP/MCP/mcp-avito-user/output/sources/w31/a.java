package W31;

import V31.e;
import V31.h;
import Y61.k;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.MalformedInputException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CharsetJVM.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000*\n\u0010\u0003\"\u00020\u00022\u00020\u0002*\n\u0010\u0005\"\u00020\u00042\u00020\u0004*\n\u0010\u0007\"\u00020\u00062\u00020\u0006¨\u0006\b"}, d2 = {"Ljava/nio/charset/Charset;", "Charset", "Ljava/nio/charset/CharsetDecoder;", "CharsetDecoder", "Ljava/nio/charset/CharsetEncoder;", "CharsetEncoder", "Lkotlin/text/d;", "Charsets", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final CharBuffer f17734a = CharBuffer.allocate(0);

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final ByteBuffer f17735b = ByteBuffer.allocate(0);

    public static final boolean a(@k CharsetEncoder charsetEncoder, @k io.ktor.utils.io.core.internal.b bVar) throws CharacterCodingException {
        int i12 = bVar.f400876c;
        int i13 = bVar.f400878e - i12;
        e.a aVar = e.f16906b;
        ByteBuffer byteBufferC = h.c(bVar.f400874a, i12, i13);
        CoderResult coderResultEncode = charsetEncoder.encode(f17734a, byteBufferC, true);
        if (coderResultEncode.isMalformed() || coderResultEncode.isUnmappable()) {
            d(coderResultEncode);
        }
        boolean zIsUnderflow = coderResultEncode.isUnderflow();
        if (byteBufferC.limit() != i13) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        bVar.a(byteBufferC.position());
        return zIsUnderflow;
    }

    public static final int b(@k CharsetEncoder charsetEncoder, @k CharSequence charSequence, int i12, int i13, @k io.ktor.utils.io.core.internal.b bVar) throws CharacterCodingException {
        CharBuffer charBufferWrap = CharBuffer.wrap(charSequence, i12, i13);
        int iRemaining = charBufferWrap.remaining();
        int i14 = bVar.f400876c;
        int i15 = bVar.f400878e - i14;
        e.a aVar = e.f16906b;
        ByteBuffer byteBufferC = h.c(bVar.f400874a, i14, i15);
        CoderResult coderResultEncode = charsetEncoder.encode(charBufferWrap, byteBufferC, false);
        if (coderResultEncode.isMalformed() || coderResultEncode.isUnmappable()) {
            d(coderResultEncode);
        }
        if (byteBufferC.limit() != i15) {
            throw new IllegalStateException("Buffer's limit change is not allowed");
        }
        bVar.a(byteBufferC.position());
        return iRemaining - charBufferWrap.remaining();
    }

    @k
    public static final byte[] c(@k CharsetEncoder charsetEncoder, @k CharSequence charSequence, int i12) throws CharacterCodingException {
        if (charSequence instanceof String) {
            return i12 == ((String) charSequence).length() ? ((String) charSequence).getBytes(charsetEncoder.charset()) : ((String) charSequence).substring(0, i12).getBytes(charsetEncoder.charset());
        }
        ByteBuffer byteBufferEncode = charsetEncoder.encode(CharBuffer.wrap(charSequence, 0, i12));
        byte[] bArr = null;
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            byte[] bArrArray = byteBufferEncode.array();
            if (bArrArray.length == byteBufferEncode.remaining()) {
                bArr = bArrArray;
            }
        }
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr2);
        return bArr2;
    }

    public static final void d(CoderResult coderResult) throws CharacterCodingException {
        try {
            coderResult.throwException();
        } catch (MalformedInputException e12) {
            String message = e12.getMessage();
            if (message == null) {
                message = "Failed to decode bytes";
            }
            throw new io.ktor.utils.io.charsets.MalformedInputException(message);
        }
    }
}
