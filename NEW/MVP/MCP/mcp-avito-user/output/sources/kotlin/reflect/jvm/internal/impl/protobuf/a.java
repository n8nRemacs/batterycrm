package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.o;

/* compiled from: AbstractMessageLite.java */
/* loaded from: classes8.dex */
public abstract class a implements o {

    /* compiled from: AbstractMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC11678a<BuilderType extends AbstractC11678a> implements o.a {
        @Override // 
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType e();

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public abstract BuilderType d(e eVar, f fVar);

        /* compiled from: AbstractMessageLite.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.a$a$a, reason: collision with other inner class name */
        public static final class C11679a extends FilterInputStream {

            /* renamed from: b, reason: collision with root package name */
            public int f409328b;

            public C11679a(ByteArrayInputStream byteArrayInputStream, int i12) {
                super(byteArrayInputStream);
                this.f409328b = i12;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int available() {
                return Math.min(super.available(), this.f409328b);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read() throws IOException {
                if (this.f409328b <= 0) {
                    return -1;
                }
                int i12 = super.read();
                if (i12 >= 0) {
                    this.f409328b--;
                }
                return i12;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final long skip(long j12) throws IOException {
                long jSkip = super.skip(Math.min(j12, this.f409328b));
                if (jSkip >= 0) {
                    this.f409328b = (int) (this.f409328b - jSkip);
                }
                return jSkip;
            }

            @Override // java.io.FilterInputStream, java.io.InputStream
            public final int read(byte[] bArr, int i12, int i13) throws IOException {
                int i14 = this.f409328b;
                if (i14 <= 0) {
                    return -1;
                }
                int i15 = super.read(bArr, i12, Math.min(i13, i14));
                if (i15 >= 0) {
                    this.f409328b -= i15;
                }
                return i15;
            }
        }
    }
}
