package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.InterfaceC41649d1;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Blocking.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/jvm/javaio/h;", "Ljava/io/OutputStream;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class h extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41649d1 f401126b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g f401127c = new g(this);

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public byte[] f401128d;

    public h(@Y61.k InterfaceC41649d1 interfaceC41649d1) {
        this.f401126b = interfaceC41649d1;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f401127c.d(b.f401108b);
            this.f401127c.c();
        } finally {
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final synchronized void flush() {
        this.f401127c.d(b.f401109c);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i12) {
        try {
            byte[] bArr = this.f401128d;
            if (bArr == null) {
                bArr = new byte[1];
                this.f401128d = bArr;
            }
            bArr[0] = (byte) i12;
            g gVar = this.f401127c;
            gVar.f401100d = 0;
            gVar.f401101e = 1;
            gVar.d(bArr);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(@Y61.l byte[] bArr, int i12, int i13) {
        g gVar = this.f401127c;
        gVar.f401100d = i12;
        gVar.f401101e = i13;
        gVar.d(bArr);
    }
}
