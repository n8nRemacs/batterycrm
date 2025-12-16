package t11;

import X41.i;
import Y61.k;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.Metadata;

/* compiled from: buffers.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000*\n\u0010\u0003\"\u00020\u00022\u00020\u0002*\n\u0010\u0005\"\u00020\u00042\u00020\u0004*\n\u0010\u0007\"\u00020\u00062\u00020\u0006*\n\u0010\t\"\u00020\b2\u00020\b¨\u0006\n"}, d2 = {"Ljava/nio/Buffer;", "Buffer", "Ljava/nio/ByteBuffer;", "ByteBuffer", "Ljava/nio/FloatBuffer;", "FloatBuffer", "Ljava/nio/IntBuffer;", "IntBuffer", "Ljava/nio/ShortBuffer;", "ShortBuffer", "library_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
@i
/* renamed from: t11.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C48460a {
    @k
    public static final FloatBuffer a(int i12) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i12 * 4).order(ByteOrder.nativeOrder());
        byteBufferOrder.limit(byteBufferOrder.capacity());
        return byteBufferOrder.asFloatBuffer();
    }
}
