package com.yandex.mobile.ads.impl;

import androidx.media3.exoplayer.C23179x;
import com.yandex.mobile.ads.impl.oc;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public interface qc {

    public static final class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f389136a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f389137b;

        /* renamed from: c, reason: collision with root package name */
        public final vw f389138c;

        /* JADX WARN: Illegal instructions before constructor call */
        public b(int i12, int i13, int i14, int i15, vw vwVar, boolean z12, @j.P RuntimeException runtimeException) {
            StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "AudioTrack init failed ", " Config(", ", ");
            C23179x.a(sbY, i14, ", ", i15, ")");
            sbY.append(z12 ? " (recoverable)" : "");
            super(sbY.toString(), runtimeException);
            this.f389136a = i12;
            this.f389137b = z12;
            this.f389138c = vwVar;
        }
    }

    public interface c {
    }

    public static final class d extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        public d(long j12, long j13) {
            StringBuilder sbQ = androidx.compose.foundation.H.q(j13, "Unexpected audio track timestamp discontinuity: expected ", ", got ");
            sbQ.append(j12);
            super(sbQ.toString());
        }
    }

    public static final class e extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final int f389139a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f389140b;

        /* renamed from: c, reason: collision with root package name */
        public final vw f389141c;

        public e(int i12, vw vwVar, boolean z12) {
            super(ba.a("AudioTrack write failed: ", i12));
            this.f389140b = z12;
            this.f389139a = i12;
            this.f389141c = vwVar;
        }
    }

    long a(boolean z12);

    void a(int i12);

    void a(ct0 ct0Var);

    void a(dd ddVar);

    void a(jc jcVar);

    default void a(@j.P jt0 jt0Var) {
    }

    void a(vw vwVar, @j.P int[] iArr);

    boolean a();

    boolean a(vw vwVar);

    boolean a(ByteBuffer byteBuffer, long j12, int i12);

    int b(vw vwVar);

    void b();

    void b(boolean z12);

    void c();

    boolean d();

    void e();

    void f();

    void flush();

    ct0 getPlaybackParameters();

    void pause();

    void play();

    void reset();

    void setVolume(float f12);

    public static final class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final vw f389135a;

        public a(oc.b bVar, vw vwVar) {
            super(bVar);
            this.f389135a = vwVar;
        }

        public a(String str, vw vwVar) {
            super(str);
            this.f389135a = vwVar;
        }
    }
}
