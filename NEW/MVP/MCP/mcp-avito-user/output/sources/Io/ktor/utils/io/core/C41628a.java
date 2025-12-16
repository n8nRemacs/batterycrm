package io.ktor.utils.io.core;

import java.nio.ByteBuffer;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.X;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: Buffer.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0006B\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/core/a;", "", "LV31/e;", "memory", "<init>", "(Ljava/nio/ByteBuffer;Lkotlin/jvm/internal/w;)V", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC42830m
/* renamed from: io.ktor.utils.io.core.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C41628a {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final C11424a f400873g = new C11424a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ByteBuffer f400874a;

    /* renamed from: b, reason: collision with root package name */
    public int f400875b;

    /* renamed from: c, reason: collision with root package name */
    public int f400876c;

    /* renamed from: d, reason: collision with root package name */
    public int f400877d;

    /* renamed from: e, reason: collision with root package name */
    public int f400878e;

    /* renamed from: f, reason: collision with root package name */
    public final int f400879f;

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/ktor/utils/io/core/a$a;", "", "<init>", "()V", "", "ReservedSize", "I", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.core.a$a, reason: collision with other inner class name */
    public static final class C11424a {
        public /* synthetic */ C11424a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static io.ktor.utils.io.core.internal.b a() {
            io.ktor.utils.io.core.internal.b.f400881j.getClass();
            return io.ktor.utils.io.core.internal.b.f400886o;
        }

        public C11424a() {
        }
    }

    public C41628a(ByteBuffer byteBuffer, C42822w c42822w) {
        this.f400874a = byteBuffer;
        this.f400878e = byteBuffer.limit();
        this.f400879f = byteBuffer.limit();
    }

    public final void a(int i12) {
        int i13 = this.f400876c;
        int i14 = i13 + i12;
        if (i12 < 0 || i14 > this.f400878e) {
            C41632e.a(i12, this.f400878e - i13);
            throw null;
        }
        this.f400876c = i14;
    }

    @X
    public final void b(int i12) {
        int i13 = this.f400878e;
        int i14 = this.f400876c;
        if (i12 < i14) {
            C41632e.a(i12 - i14, i13 - i14);
            throw null;
        }
        if (i12 < i13) {
            this.f400876c = i12;
        } else if (i12 == i13) {
            this.f400876c = i12;
        } else {
            C41632e.a(i12 - i14, i13 - i14);
            throw null;
        }
    }

    public final void c(int i12) {
        if (i12 == 0) {
            return;
        }
        int i13 = this.f400875b;
        int i14 = i13 + i12;
        if (i12 < 0 || i14 > this.f400876c) {
            C41632e.b(i12, this.f400876c - i13);
            throw null;
        }
        this.f400875b = i14;
    }

    public final void d(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "newReadPosition shouldn't be negative: ").toString());
        }
        if (i12 > this.f400875b) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "newReadPosition shouldn't be ahead of the read position: ", " > ");
            sbJ.append(this.f400875b);
            throw new IllegalArgumentException(sbJ.toString().toString());
        }
        this.f400875b = i12;
        if (this.f400877d > i12) {
            this.f400877d = i12;
        }
    }

    public final void e() {
        int i12 = this.f400879f;
        int i13 = i12 - 8;
        int i14 = this.f400876c;
        if (i13 >= i14) {
            this.f400878e = i13;
            return;
        }
        if (i13 < 0) {
            throw new IllegalArgumentException(AK.c.g(i12, "End gap 8 is too big: capacity is "));
        }
        if (i13 < this.f400877d) {
            throw new IllegalArgumentException(AK.c.i(this.f400877d, " bytes reserved in the beginning", new StringBuilder("End gap 8 is too big: there are already ")));
        }
        if (this.f400875b == i14) {
            this.f400878e = i13;
            this.f400875b = i13;
            this.f400876c = i13;
        } else {
            throw new IllegalArgumentException("Unable to reserve end gap 8: there are already " + (this.f400876c - this.f400875b) + " content bytes at offset " + this.f400875b);
        }
    }

    public final void f(int i12) {
        int i13 = this.f400877d;
        this.f400875b = i13;
        this.f400876c = i13;
        this.f400878e = i12;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Buffer(");
        sb2.append(this.f400876c - this.f400875b);
        sb2.append(" used, ");
        sb2.append(this.f400878e - this.f400876c);
        sb2.append(" free, ");
        int i12 = this.f400877d;
        int i13 = this.f400878e;
        int i14 = this.f400879f;
        sb2.append((i14 - i13) + i12);
        sb2.append(" reserved of ");
        return androidx.appcompat.app.r.t(sb2, i14, ')');
    }
}
