package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import com.avito.android.remote.model.AdvertStatus;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RealBufferedSink.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/X;", "Lokio/m;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class X implements InterfaceC44803m {

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final c0 f420042b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final C44802l f420043c = new C44802l();

    /* renamed from: d, reason: collision with root package name */
    @X41.f
    public boolean f420044d;

    public X(@Y61.k c0 c0Var) {
        this.f420042b = c0Var;
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final InterfaceC44803m B1(@Y61.k C44805o c44805o) {
        if (this.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        this.f420043c.B(c44805o);
        W1();
        return this;
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final InterfaceC44803m Q4() {
        if (this.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        C44802l c44802l = this.f420043c;
        long j12 = c44802l.f420125c;
        if (j12 > 0) {
            this.f420042b.write(c44802l, j12);
        }
        return this;
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final InterfaceC44803m U0(long j12) {
        if (this.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        this.f420043c.F(j12);
        W1();
        return this;
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final InterfaceC44803m W1() {
        if (this.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        C44802l c44802l = this.f420043c;
        long j12 = c44802l.j();
        if (j12 > 0) {
            this.f420042b.write(c44802l, j12);
        }
        return this;
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final InterfaceC44803m b2(@Y61.k String str) {
        if (this.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        this.f420043c.O(str);
        W1();
        return this;
    }

    @Override // okio.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        c0 c0Var = this.f420042b;
        if (this.f420044d) {
            return;
        }
        try {
            C44802l c44802l = this.f420043c;
            long j12 = c44802l.f420125c;
            if (j12 > 0) {
                c0Var.write(c44802l, j12);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            c0Var.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f420044d = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.InterfaceC44803m, okio.c0, java.io.Flushable
    public final void flush() {
        if (this.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        C44802l c44802l = this.f420043c;
        long j12 = c44802l.f420125c;
        c0 c0Var = this.f420042b;
        if (j12 > 0) {
            c0Var.write(c44802l, j12);
        }
        c0Var.flush();
    }

    @Override // okio.InterfaceC44803m
    public final long h2(@Y61.k e0 e0Var) {
        long j12 = 0;
        while (true) {
            long j13 = e0Var.read(this.f420043c, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j13 == -1) {
                return j12;
            }
            j12 += j13;
            W1();
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f420044d;
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final InterfaceC44803m k6(int i12, int i13, @Y61.k byte[] bArr) {
        if (this.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        this.f420043c.write(bArr, i12, i13);
        W1();
        return this;
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final OutputStream q6() {
        return new a();
    }

    @Override // okio.c0
    @Y61.k
    public final i0 timeout() {
        return this.f420042b.timeout();
    }

    @Y61.k
    public final String toString() {
        return "buffer(" + this.f420042b + ')';
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    /* renamed from: v, reason: from getter */
    public final C44802l getF420043c() {
        return this.f420043c;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(@Y61.k ByteBuffer byteBuffer) {
        if (this.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        int iWrite = this.f420043c.write(byteBuffer);
        W1();
        return iWrite;
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final InterfaceC44803m writeByte(int i12) {
        if (this.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        this.f420043c.D(i12);
        W1();
        return this;
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final InterfaceC44803m writeInt(int i12) {
        if (this.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        this.f420043c.H(i12);
        W1();
        return this;
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final InterfaceC44803m writeLong(long j12) {
        if (this.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        this.f420043c.I(j12);
        W1();
        return this;
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final InterfaceC44803m writeShort(int i12) {
        if (this.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        this.f420043c.J(i12);
        W1();
        return this;
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final InterfaceC44803m z4(long j12) {
        if (this.f420044d) {
            throw new IllegalStateException(AdvertStatus.CLOSED);
        }
        this.f420043c.G(j12);
        W1();
        return this;
    }

    /* compiled from: RealBufferedSink.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/X$a", "Ljava/io/OutputStream;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws Throwable {
            X.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            X x12 = X.this;
            if (x12.f420044d) {
                return;
            }
            x12.flush();
        }

        @Y61.k
        public final String toString() {
            return X.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public final void write(int i12) throws IOException {
            X x12 = X.this;
            if (x12.f420044d) {
                throw new IOException(AdvertStatus.CLOSED);
            }
            x12.f420043c.D((byte) i12);
            x12.W1();
        }

        @Override // java.io.OutputStream
        public final void write(@Y61.k byte[] bArr, int i12, int i13) throws IOException {
            X x12 = X.this;
            if (!x12.f420044d) {
                x12.f420043c.write(bArr, i12, i13);
                x12.W1();
                return;
            }
            throw new IOException(AdvertStatus.CLOSED);
        }
    }

    @Override // okio.c0
    public final void write(@Y61.k C44802l c44802l, long j12) {
        if (!this.f420044d) {
            this.f420043c.write(c44802l, j12);
            W1();
            return;
        }
        throw new IllegalStateException(AdvertStatus.CLOSED);
    }

    @Override // okio.InterfaceC44803m
    @Y61.k
    public final InterfaceC44803m write(@Y61.k byte[] bArr) {
        if (!this.f420044d) {
            this.f420043c.m268write(bArr);
            W1();
            return this;
        }
        throw new IllegalStateException(AdvertStatus.CLOSED);
    }
}
