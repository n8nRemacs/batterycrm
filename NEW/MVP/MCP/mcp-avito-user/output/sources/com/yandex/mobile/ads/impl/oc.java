package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes8.dex */
public interface oc {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteBuffer f388484a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final a f388485e = new a(-1, -1, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f388486a;

        /* renamed from: b, reason: collision with root package name */
        public final int f388487b;

        /* renamed from: c, reason: collision with root package name */
        public final int f388488c;

        /* renamed from: d, reason: collision with root package name */
        public final int f388489d;

        public a(int i12, int i13, int i14) {
            this.f388486a = i12;
            this.f388487b = i13;
            this.f388488c = i14;
            this.f388489d = pc1.e(i14) ? pc1.b(i14, i13) : -1;
        }

        public final String toString() {
            StringBuilder sbA = Cif.a("AudioFormat[sampleRate=");
            sbA.append(this.f388486a);
            sbA.append(", channelCount=");
            sbA.append(this.f388487b);
            sbA.append(", encoding=");
            return androidx.appcompat.app.r.t(sbA, this.f388488c, ']');
        }
    }

    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    a a(a aVar);

    void a(ByteBuffer byteBuffer);

    boolean a();

    ByteBuffer b();

    void c();

    boolean d();

    void flush();

    void reset();
}
