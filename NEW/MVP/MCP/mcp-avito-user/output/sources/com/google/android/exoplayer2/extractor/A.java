package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.upstream.InterfaceC36580j;
import com.google.android.exoplayer2.util.F;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: TrackOutput.java */
/* loaded from: classes6.dex */
public interface A {

    /* compiled from: TrackOutput.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f344372a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f344373b;

        /* renamed from: c, reason: collision with root package name */
        public final int f344374c;

        /* renamed from: d, reason: collision with root package name */
        public final int f344375d;

        public a(int i12, int i13, int i14, byte[] bArr) {
            this.f344372a = i12;
            this.f344373b = bArr;
            this.f344374c = i13;
            this.f344375d = i14;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f344372a == aVar.f344372a && this.f344374c == aVar.f344374c && this.f344375d == aVar.f344375d && Arrays.equals(this.f344373b, aVar.f344373b);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f344373b) + (this.f344372a * 31)) * 31) + this.f344374c) * 31) + this.f344375d;
        }
    }

    /* compiled from: TrackOutput.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    void a(I i12);

    default int b(InterfaceC36580j interfaceC36580j, int i12, boolean z12) {
        return d(interfaceC36580j, i12, z12);
    }

    default void c(int i12, F f12) {
        e(i12, f12);
    }

    int d(InterfaceC36580j interfaceC36580j, int i12, boolean z12);

    void e(int i12, F f12);

    void f(long j12, int i12, int i13, int i14, @P a aVar);
}
