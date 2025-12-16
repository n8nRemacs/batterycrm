package com.google.android.exoplayer2.analytics;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.c0;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.source.C36557u;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.util.C36599o;
import com.google.common.base.F;
import j.P;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: AnalyticsListener.java */
/* loaded from: classes6.dex */
public interface b {

    /* compiled from: AnalyticsListener.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: AnalyticsListener.java */
    /* renamed from: com.google.android.exoplayer2.analytics.b$b, reason: collision with other inner class name */
    public static final class C10568b {

        /* renamed from: a, reason: collision with root package name */
        public final long f343743a;

        /* renamed from: b, reason: collision with root package name */
        public final s0 f343744b;

        /* renamed from: c, reason: collision with root package name */
        public final int f343745c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public final y.b f343746d;

        /* renamed from: e, reason: collision with root package name */
        public final long f343747e;

        /* renamed from: f, reason: collision with root package name */
        public final s0 f343748f;

        /* renamed from: g, reason: collision with root package name */
        public final int f343749g;

        /* renamed from: h, reason: collision with root package name */
        @P
        public final y.b f343750h;

        /* renamed from: i, reason: collision with root package name */
        public final long f343751i;

        /* renamed from: j, reason: collision with root package name */
        public final long f343752j;

        public C10568b(long j12, s0 s0Var, int i12, @P y.b bVar, long j13, s0 s0Var2, int i13, @P y.b bVar2, long j14, long j15) {
            this.f343743a = j12;
            this.f343744b = s0Var;
            this.f343745c = i12;
            this.f343746d = bVar;
            this.f343747e = j13;
            this.f343748f = s0Var2;
            this.f343749g = i13;
            this.f343750h = bVar2;
            this.f343751i = j14;
            this.f343752j = j15;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10568b.class != obj.getClass()) {
                return false;
            }
            C10568b c10568b = (C10568b) obj;
            return this.f343743a == c10568b.f343743a && this.f343745c == c10568b.f343745c && this.f343747e == c10568b.f343747e && this.f343749g == c10568b.f343749g && this.f343751i == c10568b.f343751i && this.f343752j == c10568b.f343752j && F.a(this.f343744b, c10568b.f343744b) && F.a(this.f343746d, c10568b.f343746d) && F.a(this.f343748f, c10568b.f343748f) && F.a(this.f343750h, c10568b.f343750h);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f343743a), this.f343744b, Integer.valueOf(this.f343745c), this.f343746d, Long.valueOf(this.f343747e), this.f343748f, Integer.valueOf(this.f343749g), this.f343750h, Long.valueOf(this.f343751i), Long.valueOf(this.f343752j)});
        }
    }

    /* compiled from: AnalyticsListener.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final C36599o f343753a;

        /* renamed from: b, reason: collision with root package name */
        public final SparseArray<C10568b> f343754b;

        public c(C36599o c36599o, SparseArray<C10568b> sparseArray) {
            this.f343753a = c36599o;
            SparseBooleanArray sparseBooleanArray = c36599o.f348141a;
            SparseArray<C10568b> sparseArray2 = new SparseArray<>(sparseBooleanArray.size());
            for (int i12 = 0; i12 < sparseBooleanArray.size(); i12++) {
                int iA2 = c36599o.a(i12);
                C10568b c10568b = sparseArray.get(iA2);
                c10568b.getClass();
                sparseArray2.append(iA2, c10568b);
            }
            this.f343754b = sparseArray2;
        }

        public final boolean a(int i12) {
            return this.f343753a.f348141a.get(i12);
        }

        public final C10568b b(int i12) {
            C10568b c10568b = this.f343754b.get(i12);
            c10568b.getClass();
            return c10568b;
        }
    }

    default void CC(C10568b c10568b) {
    }

    default void Ff(C10568b c10568b) {
    }

    default void Om(C10568b c10568b) {
    }

    default void TG(C10568b c10568b) {
    }

    default void TO(C10568b c10568b) {
    }

    default void aP(C10568b c10568b) {
    }

    default void fl(C10568b c10568b) {
    }

    default void mC(C10568b c10568b) {
    }

    default void Bg(C10568b c10568b, Metadata metadata) {
    }

    default void Dh(C10568b c10568b, I i12) {
    }

    default void FA(C10568b c10568b, c0 c0Var) {
    }

    default void Gs(C10568b c10568b, int i12) {
    }

    @Deprecated
    default void JW(C10568b c10568b, String str) {
    }

    default void Kx(C10568b c10568b, t0 t0Var) {
    }

    default void QK(C10568b c10568b, boolean z12) {
    }

    default void QW(d0 d0Var, c cVar) {
    }

    default void TD(C10568b c10568b, String str) {
    }

    default void TF(C10568b c10568b, boolean z12) {
    }

    default void TU(C10568b c10568b, String str) {
    }

    default void UC(C10568b c10568b, float f12) {
    }

    default void WB(C10568b c10568b, int i12) {
    }

    default void ZT(C10568b c10568b, int i12) {
    }

    default void at(C10568b c10568b, Exception exc) {
    }

    default void ch(C10568b c10568b, int i12) {
    }

    default void fI(C10568b c10568b, int i12) {
    }

    default void hp(C10568b c10568b, C36557u c36557u) {
    }

    default void jC(C10568b c10568b, com.google.android.exoplayer2.video.o oVar) {
    }

    default void kR(C10568b c10568b, boolean z12) {
    }

    default void mo(C10568b c10568b, Object obj) {
    }

    default void nR(C10568b c10568b, C36557u c36557u) {
    }

    default void o40(C10568b c10568b, I i12) {
    }

    default void qi(C10568b c10568b, boolean z12) {
    }

    default void tN(C10568b c10568b, com.google.android.exoplayer2.decoder.f fVar) {
    }

    @Deprecated
    default void th(C10568b c10568b, String str) {
    }

    default void wO(C10568b c10568b, PlaybackException playbackException) {
    }

    default void OX(C10568b c10568b, int i12, int i13) {
    }

    default void Uz(int i12, long j12, C10568b c10568b) {
    }

    default void Xi(C10568b c10568b, int i12, boolean z12) {
    }

    default void mt(C10568b c10568b, C36557u c36557u, IOException iOException) {
    }

    default void YO(C10568b c10568b, int i12, long j12, long j13) {
    }

    default void jp(C10568b c10568b, d0.k kVar, d0.k kVar2, int i12) {
    }
}
