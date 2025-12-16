package androidx.media3.extractor;

import j.P;

/* compiled from: SeekMap.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public interface H {

    /* compiled from: SeekMap.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final I f50373a;

        /* renamed from: b, reason: collision with root package name */
        public final I f50374b;

        public a(I i12, I i13) {
            this.f50373a = i12;
            this.f50374b = i13;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f50373a.equals(aVar.f50373a) && this.f50374b.equals(aVar.f50374b);
        }

        public final int hashCode() {
            return this.f50374b.hashCode() + (this.f50373a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("[");
            I i12 = this.f50373a;
            sb2.append(i12);
            I i13 = this.f50374b;
            if (i12.equals(i13)) {
                str = "";
            } else {
                str = ", " + i13;
            }
            return AK.c.s(sb2, str, "]");
        }
    }

    /* compiled from: SeekMap.java */
    public static class b implements H {

        /* renamed from: a, reason: collision with root package name */
        public final long f50375a;

        /* renamed from: b, reason: collision with root package name */
        public final a f50376b;

        public b(long j12) {
            this(j12, 0L);
        }

        @Override // androidx.media3.extractor.H
        public final long d() {
            return this.f50375a;
        }

        @Override // androidx.media3.extractor.H
        public final a f(long j12) {
            return this.f50376b;
        }

        @Override // androidx.media3.extractor.H
        public final boolean g() {
            return false;
        }

        public b(long j12, long j13) {
            this.f50375a = j12;
            I i12 = j13 == 0 ? I.f50377c : new I(0L, j13);
            this.f50376b = new a(i12, i12);
        }
    }

    long d();

    a f(long j12);

    boolean g();
}
