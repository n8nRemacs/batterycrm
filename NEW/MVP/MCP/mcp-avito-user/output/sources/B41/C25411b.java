package b41;

import Y61.k;
import io.ktor.utils.io.core.C41640m;
import io.ktor.utils.io.core.F;
import java.nio.ByteBuffer;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeflaterUtils.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-websockets"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: b41.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C25411b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final byte[] f56903a = {0, 0, 0, -1, -1};

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final byte[] f56904b = {0, 0, -1, -1};

    public static final int a(C41640m c41640m, Deflater deflater, ByteBuffer byteBuffer, boolean z12) {
        byteBuffer.clear();
        int iDeflate = z12 ? deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit(), 2) : deflater.deflate(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit());
        if (iDeflate == 0) {
            return 0;
        }
        byteBuffer.position(byteBuffer.position() + iDeflate);
        byteBuffer.flip();
        F.a(c41640m, byteBuffer);
        return iDeflate;
    }
}
