package androidx.media3.extractor.mkv;

import androidx.media3.extractor.C23191j;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

/* compiled from: DefaultEbmlReader.java */
/* loaded from: classes.dex */
final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f50748a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f50749b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    public final f f50750c = new f();

    /* renamed from: d, reason: collision with root package name */
    public androidx.media3.extractor.mkv.b f50751d;

    /* renamed from: e, reason: collision with root package name */
    public int f50752e;

    /* renamed from: f, reason: collision with root package name */
    public int f50753f;

    /* renamed from: g, reason: collision with root package name */
    public long f50754g;

    /* compiled from: DefaultEbmlReader.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f50755a;

        /* renamed from: b, reason: collision with root package name */
        public final long f50756b;

        public b(int i12, long j12, C1854a c1854a) {
            this.f50755a = i12;
            this.f50756b = j12;
        }
    }

    public final long a(C23191j c23191j, int i12) throws EOFException, InterruptedIOException {
        c23191j.d(this.f50748a, 0, i12, false);
        long j12 = 0;
        for (int i13 = 0; i13 < i12; i13++) {
            j12 = (j12 << 8) | (r0[i13] & 255);
        }
        return j12;
    }
}
