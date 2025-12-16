package com.google.android.exoplayer2.decoder;

import androidx.appcompat.app.r;
import com.google.android.exoplayer2.H;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import v61.InterfaceC49173d;

/* loaded from: classes6.dex */
public class DecoderInputBuffer extends com.google.android.exoplayer2.decoder.a {

    /* renamed from: c, reason: collision with root package name */
    public final d f344204c = new d();

    /* renamed from: d, reason: collision with root package name */
    @P
    public ByteBuffer f344205d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f344206e;

    /* renamed from: f, reason: collision with root package name */
    public long f344207f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public ByteBuffer f344208g;

    /* renamed from: h, reason: collision with root package name */
    public final int f344209h;

    public static final class InsufficientCapacityException extends IllegalStateException {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static {
        H.a("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i12) {
        this.f344209h = i12;
    }

    public void h() {
        this.f344210b = 0;
        ByteBuffer byteBuffer = this.f344205d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f344208g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f344206e = false;
    }

    public final ByteBuffer i(int i12) {
        int i13 = this.f344209h;
        if (i13 == 1) {
            return ByteBuffer.allocate(i12);
        }
        if (i13 == 2) {
            return ByteBuffer.allocateDirect(i12);
        }
        ByteBuffer byteBuffer = this.f344205d;
        throw new InsufficientCapacityException(r.l(byteBuffer == null ? 0 : byteBuffer.capacity(), i12, "Buffer too small (", " < ", ")"));
    }

    @InterfaceC49173d
    public final void j(int i12) {
        ByteBuffer byteBuffer = this.f344205d;
        if (byteBuffer == null) {
            this.f344205d = i(i12);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i13 = i12 + iPosition;
        if (iCapacity >= i13) {
            this.f344205d = byteBuffer;
            return;
        }
        ByteBuffer byteBufferI = i(i13);
        byteBufferI.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferI.put(byteBuffer);
        }
        this.f344205d = byteBufferI;
    }

    public final void k() {
        ByteBuffer byteBuffer = this.f344205d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f344208g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
