package com.google.android.exoplayer2.extractor;

import j.P;

/* compiled from: SeekMap.java */
/* loaded from: classes6.dex */
public interface y {

    /* compiled from: SeekMap.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final z f345389a;

        /* renamed from: b, reason: collision with root package name */
        public final z f345390b;

        public a(z zVar, z zVar2) {
            this.f345389a = zVar;
            this.f345390b = zVar2;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f345389a.equals(aVar.f345389a) && this.f345390b.equals(aVar.f345390b);
        }

        public final int hashCode() {
            return this.f345390b.hashCode() + (this.f345389a.hashCode() * 31);
        }

        public final String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("[");
            z zVar = this.f345389a;
            sb2.append(zVar);
            z zVar2 = this.f345390b;
            if (zVar.equals(zVar2)) {
                str = "";
            } else {
                str = ", " + zVar2;
            }
            return AK.c.s(sb2, str, "]");
        }
    }

    /* compiled from: SeekMap.java */
    public static class b implements y {

        /* renamed from: a, reason: collision with root package name */
        public final long f345391a;

        /* renamed from: b, reason: collision with root package name */
        public final a f345392b;

        public b(long j12) {
            this(j12, 0L);
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final long d() {
            return this.f345391a;
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final a f(long j12) {
            return this.f345392b;
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final boolean g() {
            return false;
        }

        public b(long j12, long j13) {
            this.f345391a = j12;
            z zVar = j13 == 0 ? z.f345393c : new z(0L, j13);
            this.f345392b = new a(zVar, zVar);
        }
    }

    long d();

    a f(long j12);

    boolean g();
}
