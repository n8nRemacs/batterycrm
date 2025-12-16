package io.ktor.utils.io.streams;

import Y61.k;
import kotlin.Metadata;

/* compiled from: ByteArrays.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C11428a f401296a = new C11428a();

    /* compiled from: ByteArrays.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"io/ktor/utils/io/streams/a$a", "Lio/ktor/utils/io/pool/d;", "", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.streams.a$a, reason: collision with other inner class name */
    public static final class C11428a extends io.ktor.utils.io.pool.d<byte[]> {
        public C11428a() {
            super(128);
        }

        @Override // io.ktor.utils.io.pool.d
        public final byte[] g() {
            return new byte[4096];
        }

        @Override // io.ktor.utils.io.pool.d
        public final void i(byte[] bArr) {
            byte[] bArr2 = bArr;
            if (bArr2.length == 4096) {
                return;
            }
            throw new IllegalArgumentException(AK.c.i(bArr2.length, " != 4096", new StringBuilder("Unable to recycle buffer of wrong size: ")).toString());
        }
    }
}
