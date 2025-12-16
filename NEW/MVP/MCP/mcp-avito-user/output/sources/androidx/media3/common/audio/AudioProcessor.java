package androidx.media3.common.audio;

import aZ0.InterfaceC19845a;
import androidx.appcompat.app.r;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import j.P;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

@J
/* loaded from: classes.dex */
public interface AudioProcessor {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f47559a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(a aVar) {
            this("Unhandled input format:", aVar);
        }

        public UnhandledAudioFormatException(String str, a aVar) {
            super(str + " " + aVar);
        }
    }

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f47560e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f47561a;

        /* renamed from: b, reason: collision with root package name */
        public final int f47562b;

        /* renamed from: c, reason: collision with root package name */
        public final int f47563c;

        /* renamed from: d, reason: collision with root package name */
        public final int f47564d;

        public a(int i12, int i13, int i14) {
            this.f47561a = i12;
            this.f47562b = i13;
            this.f47563c = i14;
            this.f47564d = M.C(i14) ? M.v(i14, i13) : -1;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47561a == aVar.f47561a && this.f47562b == aVar.f47562b && this.f47563c == aVar.f47563c;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f47561a), Integer.valueOf(this.f47562b), Integer.valueOf(this.f47563c)});
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
            sb2.append(this.f47561a);
            sb2.append(", channelCount=");
            sb2.append(this.f47562b);
            sb2.append(", encoding=");
            return r.t(sb2, this.f47563c, ']');
        }
    }

    boolean a();

    ByteBuffer f();

    void flush();

    void g(ByteBuffer byteBuffer);

    void h();

    @InterfaceC19845a
    a i(a aVar);

    boolean isActive();

    void reset();
}
