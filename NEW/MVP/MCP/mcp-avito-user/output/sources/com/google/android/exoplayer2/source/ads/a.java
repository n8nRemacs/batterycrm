package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import com.google.android.exoplayer2.InterfaceC36525h;
import com.google.android.exoplayer2.analytics.h;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.F;
import j.InterfaceC42154j;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

/* compiled from: AdPlaybackState.java */
/* loaded from: classes6.dex */
public final class a implements InterfaceC36525h {

    /* renamed from: h, reason: collision with root package name */
    public static final a f346179h = new a(null, new b[0], 0, -9223372036854775807L, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final b f346180i = new b(0).c(0);

    /* renamed from: j, reason: collision with root package name */
    public static final h f346181j = new h(24);

    /* renamed from: b, reason: collision with root package name */
    @P
    public final Object f346182b;

    /* renamed from: c, reason: collision with root package name */
    public final int f346183c;

    /* renamed from: d, reason: collision with root package name */
    public final long f346184d;

    /* renamed from: e, reason: collision with root package name */
    public final long f346185e;

    /* renamed from: f, reason: collision with root package name */
    public final int f346186f;

    /* renamed from: g, reason: collision with root package name */
    public final b[] f346187g;

    /* compiled from: AdPlaybackState.java */
    public static final class b implements InterfaceC36525h {

        /* renamed from: i, reason: collision with root package name */
        public static final h f346188i = new h(25);

        /* renamed from: b, reason: collision with root package name */
        public final long f346189b;

        /* renamed from: c, reason: collision with root package name */
        public final int f346190c;

        /* renamed from: d, reason: collision with root package name */
        public final Uri[] f346191d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f346192e;

        /* renamed from: f, reason: collision with root package name */
        public final long[] f346193f;

        /* renamed from: g, reason: collision with root package name */
        public final long f346194g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f346195h;

        @InterfaceC42154j
        public static long[] a(long[] jArr, int i12) {
            int length = jArr.length;
            int iMax = Math.max(i12, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        public final int b(@F int i12) {
            int i13;
            int i14 = i12 + 1;
            while (true) {
                int[] iArr = this.f346192e;
                if (i14 >= iArr.length || this.f346195h || (i13 = iArr[i14]) == 0 || i13 == 1) {
                    break;
                }
                i14++;
            }
            return i14;
        }

        @InterfaceC42154j
        public final b c(int i12) {
            int[] iArr = this.f346192e;
            int length = iArr.length;
            int iMax = Math.max(i12, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            long[] jArrA = a(this.f346193f, i12);
            return new b(this.f346189b, i12, iArrCopyOf, (Uri[]) Arrays.copyOf(this.f346191d, i12), jArrA, this.f346194g, this.f346195h);
        }

        @InterfaceC42154j
        public final b d(int i12, @F int i13) {
            int i14 = this.f346190c;
            C36585a.b(i14 == -1 || i13 < i14);
            int[] iArr = this.f346192e;
            int length = iArr.length;
            int iMax = Math.max(i13 + 1, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            int i15 = iArrCopyOf[i13];
            C36585a.b(i15 == 0 || i15 == 1 || i15 == i12);
            long[] jArrA = this.f346193f;
            if (jArrA.length != iArrCopyOf.length) {
                jArrA = a(jArrA, iArrCopyOf.length);
            }
            long[] jArr = jArrA;
            Uri[] uriArr = this.f346191d;
            if (uriArr.length != iArrCopyOf.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrCopyOf.length);
            }
            Uri[] uriArr2 = uriArr;
            iArrCopyOf[i13] = i12;
            return new b(this.f346189b, this.f346190c, iArrCopyOf, uriArr2, jArr, this.f346194g, this.f346195h);
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f346189b == bVar.f346189b && this.f346190c == bVar.f346190c && Arrays.equals(this.f346191d, bVar.f346191d) && Arrays.equals(this.f346192e, bVar.f346192e) && Arrays.equals(this.f346193f, bVar.f346193f) && this.f346194g == bVar.f346194g && this.f346195h == bVar.f346195h;
        }

        public final int hashCode() {
            int i12 = this.f346190c * 31;
            long j12 = this.f346189b;
            int iHashCode = (Arrays.hashCode(this.f346193f) + ((Arrays.hashCode(this.f346192e) + ((((i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + Arrays.hashCode(this.f346191d)) * 31)) * 31)) * 31;
            long j13 = this.f346194g;
            return ((iHashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f346195h ? 1 : 0);
        }

        public b(long j12) {
            this(j12, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public b(long j12, int i12, int[] iArr, Uri[] uriArr, long[] jArr, long j13, boolean z12) {
            C36585a.b(iArr.length == uriArr.length);
            this.f346189b = j12;
            this.f346190c = i12;
            this.f346192e = iArr;
            this.f346191d = uriArr;
            this.f346193f = jArr;
            this.f346194g = j13;
            this.f346195h = z12;
        }
    }

    /* compiled from: AdPlaybackState.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public a(@P Object obj, b[] bVarArr, long j12, long j13, int i12) {
        this.f346182b = obj;
        this.f346184d = j12;
        this.f346185e = j13;
        this.f346183c = bVarArr.length + i12;
        this.f346187g = bVarArr;
        this.f346186f = i12;
    }

    public final b a(@F int i12) {
        int i13 = this.f346186f;
        return i12 < i13 ? f346180i : this.f346187g[i12 - i13];
    }

    public final int b(long j12, long j13) {
        int i12;
        b bVarA;
        int i13;
        if (j12 == Long.MIN_VALUE) {
            return -1;
        }
        if (j13 != -9223372036854775807L && j12 >= j13) {
            return -1;
        }
        int i14 = this.f346186f;
        while (true) {
            i12 = this.f346183c;
            if (i14 >= i12 || ((a(i14).f346189b == Long.MIN_VALUE || a(i14).f346189b > j12) && ((i13 = (bVarA = a(i14)).f346190c) == -1 || bVarA.b(-1) < i13))) {
                break;
            }
            i14++;
        }
        if (i14 < i12) {
            return i14;
        }
        return -1;
    }

    public final int c(long j12, long j13) {
        int i12 = this.f346183c - 1;
        while (i12 >= 0 && j12 != Long.MIN_VALUE) {
            long j14 = a(i12).f346189b;
            if (j14 != Long.MIN_VALUE) {
                if (j12 >= j14) {
                    break;
                }
                i12--;
            } else {
                if (j13 != -9223372036854775807L && j12 >= j13) {
                    break;
                }
                i12--;
            }
        }
        if (i12 >= 0) {
            b bVarA = a(i12);
            int i13 = bVarA.f346190c;
            if (i13 == -1) {
                return i12;
            }
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = bVarA.f346192e[i14];
                if (i15 == 0 || i15 == 1) {
                    return i12;
                }
            }
        }
        return -1;
    }

    public final boolean d(@F int i12, @F int i13) {
        b bVarA;
        int i14;
        return i12 < this.f346183c && (i14 = (bVarA = a(i12)).f346190c) != -1 && i13 < i14 && bVarA.f346192e[i13] == 4;
    }

    @InterfaceC42154j
    public final a e(@F int i12, @F int i13) {
        C36585a.b(i13 > 0);
        int i14 = i12 - this.f346186f;
        b[] bVarArr = this.f346187g;
        if (bVarArr[i14].f346190c == i13) {
            return this;
        }
        b[] bVarArr2 = (b[]) U.J(bVarArr.length, bVarArr);
        bVarArr2[i14] = bVarArr[i14].c(i13);
        return new a(this.f346182b, bVarArr2, this.f346184d, this.f346185e, this.f346186f);
    }

    public final boolean equals(@P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return U.a(this.f346182b, aVar.f346182b) && this.f346183c == aVar.f346183c && this.f346184d == aVar.f346184d && this.f346185e == aVar.f346185e && this.f346186f == aVar.f346186f && Arrays.equals(this.f346187g, aVar.f346187g);
    }

    @InterfaceC42154j
    public final a f(long j12) {
        if (this.f346184d == j12) {
            return this;
        }
        return new a(this.f346182b, this.f346187g, j12, this.f346185e, this.f346186f);
    }

    @InterfaceC42154j
    public final a g(@F int i12, @F int i13) {
        int i14 = i12 - this.f346186f;
        b[] bVarArr = this.f346187g;
        b[] bVarArr2 = (b[]) U.J(bVarArr.length, bVarArr);
        bVarArr2[i14] = bVarArr2[i14].d(2, i13);
        return new a(this.f346182b, bVarArr2, this.f346184d, this.f346185e, this.f346186f);
    }

    @InterfaceC42154j
    public final a h(@F int i12) {
        b bVar;
        int i13 = i12 - this.f346186f;
        b[] bVarArr = this.f346187g;
        b[] bVarArr2 = (b[]) U.J(bVarArr.length, bVarArr);
        b bVar2 = bVarArr2[i13];
        if (bVar2.f346190c == -1) {
            bVar = new b(bVar2.f346189b, 0, new int[0], new Uri[0], new long[0], bVar2.f346194g, bVar2.f346195h);
        } else {
            int[] iArr = bVar2.f346192e;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = iArrCopyOf[i14];
                if (i15 == 1 || i15 == 0) {
                    iArrCopyOf[i14] = 2;
                }
            }
            bVar = new b(bVar2.f346189b, length, iArrCopyOf, bVar2.f346191d, bVar2.f346193f, bVar2.f346194g, bVar2.f346195h);
        }
        bVarArr2[i13] = bVar;
        return new a(this.f346182b, bVarArr2, this.f346184d, this.f346185e, this.f346186f);
    }

    public final int hashCode() {
        int i12 = this.f346183c * 31;
        Object obj = this.f346182b;
        return ((((((((i12 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f346184d)) * 31) + ((int) this.f346185e)) * 31) + this.f346186f) * 31) + Arrays.hashCode(this.f346187g);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f346182b);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f346184d);
        sb2.append(", adGroups=[");
        int i12 = 0;
        while (true) {
            b[] bVarArr = this.f346187g;
            if (i12 >= bVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(bVarArr[i12].f346189b);
            sb2.append(", ads=[");
            for (int i13 = 0; i13 < bVarArr[i12].f346192e.length; i13++) {
                sb2.append("ad(state=");
                int i14 = bVarArr[i12].f346192e[i13];
                if (i14 == 0) {
                    sb2.append('_');
                } else if (i14 == 1) {
                    sb2.append('R');
                } else if (i14 == 2) {
                    sb2.append('S');
                } else if (i14 == 3) {
                    sb2.append('P');
                } else if (i14 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(bVarArr[i12].f346193f[i13]);
                sb2.append(')');
                if (i13 < bVarArr[i12].f346192e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i12 < bVarArr.length - 1) {
                sb2.append(", ");
            }
            i12++;
        }
    }
}
