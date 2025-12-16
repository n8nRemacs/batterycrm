package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.util.U;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes6.dex */
public interface AudioProcessor {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f343846a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledAudioFormatException extends Exception {
        public UnhandledAudioFormatException(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f343847e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f343848a;

        /* renamed from: b, reason: collision with root package name */
        public final int f343849b;

        /* renamed from: c, reason: collision with root package name */
        public final int f343850c;

        /* renamed from: d, reason: collision with root package name */
        public final int f343851d;

        public a(int i12, int i13, int i14) {
            this.f343848a = i12;
            this.f343849b = i13;
            this.f343850c = i14;
            this.f343851d = U.F(i14) ? U.w(i14, i13) : -1;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AudioFormat[sampleRate=");
            sb2.append(this.f343848a);
            sb2.append(", channelCount=");
            sb2.append(this.f343849b);
            sb2.append(", encoding=");
            return androidx.appcompat.app.r.t(sb2, this.f343850c, ']');
        }
    }

    boolean a();

    a b(a aVar);

    ByteBuffer f();

    void flush();

    void g(ByteBuffer byteBuffer);

    void h();

    boolean isActive();

    void reset();
}
