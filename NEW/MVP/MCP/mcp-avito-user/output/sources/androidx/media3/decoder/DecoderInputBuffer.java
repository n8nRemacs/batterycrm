package androidx.media3.decoder;

import androidx.appcompat.app.r;
import androidx.media3.common.A;
import androidx.media3.common.util.J;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import v61.InterfaceC49173d;

@J
/* loaded from: classes.dex */
public class DecoderInputBuffer extends androidx.media3.decoder.a {

    /* renamed from: c, reason: collision with root package name */
    public final d f48322c = new d();

    /* renamed from: d, reason: collision with root package name */
    @P
    public ByteBuffer f48323d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f48324e;

    /* renamed from: f, reason: collision with root package name */
    public long f48325f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public ByteBuffer f48326g;

    /* renamed from: h, reason: collision with root package name */
    public final int f48327h;

    public static final class InsufficientCapacityException extends IllegalStateException {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static {
        A.a("media3.decoder");
    }

    public DecoderInputBuffer(int i12) {
        this.f48327h = i12;
    }

    public void h() {
        this.f48328b = 0;
        ByteBuffer byteBuffer = this.f48323d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f48326g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f48324e = false;
    }

    public final ByteBuffer i(int i12) {
        int i13 = this.f48327h;
        if (i13 == 1) {
            return ByteBuffer.allocate(i12);
        }
        if (i13 == 2) {
            return ByteBuffer.allocateDirect(i12);
        }
        ByteBuffer byteBuffer = this.f48323d;
        throw new InsufficientCapacityException(r.l(byteBuffer == null ? 0 : byteBuffer.capacity(), i12, "Buffer too small (", " < ", ")"));
    }

    @InterfaceC49173d
    public final void j(int i12) {
        ByteBuffer byteBuffer = this.f48323d;
        if (byteBuffer == null) {
            this.f48323d = i(i12);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i13 = i12 + iPosition;
        if (iCapacity >= i13) {
            this.f48323d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferI = i(i13);
        byteBufferI.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferI.put(byteBuffer);
        }
        this.f48323d = byteBufferI;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.f48323d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f48326g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
