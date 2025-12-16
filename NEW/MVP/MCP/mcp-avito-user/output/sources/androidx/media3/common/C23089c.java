package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.common.util.C23110a;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: AdPlaybackState.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.common.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23089c implements InterfaceC23096j {

    /* renamed from: g, reason: collision with root package name */
    public static final C23089c f47615g = new C23089c(new b[0], 0, -9223372036854775807L, 0);

    /* renamed from: h, reason: collision with root package name */
    public static final b f47616h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f47617i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f47618j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f47619k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f47620l;

    /* renamed from: m, reason: collision with root package name */
    public static final C23088b f47621m;

    /* renamed from: b, reason: collision with root package name */
    public final int f47622b;

    /* renamed from: c, reason: collision with root package name */
    public final long f47623c;

    /* renamed from: d, reason: collision with root package name */
    public final long f47624d;

    /* renamed from: e, reason: collision with root package name */
    public final int f47625e;

    /* renamed from: f, reason: collision with root package name */
    public final b[] f47626f;

    /* compiled from: AdPlaybackState.java */
    /* renamed from: androidx.media3.common.c$b */
    public static final class b implements InterfaceC23096j {

        /* renamed from: j, reason: collision with root package name */
        public static final String f47627j;

        /* renamed from: k, reason: collision with root package name */
        public static final String f47628k;

        /* renamed from: l, reason: collision with root package name */
        public static final String f47629l;

        /* renamed from: m, reason: collision with root package name */
        public static final String f47630m;

        /* renamed from: n, reason: collision with root package name */
        public static final String f47631n;

        /* renamed from: o, reason: collision with root package name */
        public static final String f47632o;

        /* renamed from: p, reason: collision with root package name */
        public static final String f47633p;

        /* renamed from: q, reason: collision with root package name */
        public static final String f47634q;

        /* renamed from: r, reason: collision with root package name */
        public static final C23088b f47635r;

        /* renamed from: b, reason: collision with root package name */
        public final long f47636b;

        /* renamed from: c, reason: collision with root package name */
        public final int f47637c;

        /* renamed from: d, reason: collision with root package name */
        public final int f47638d;

        /* renamed from: e, reason: collision with root package name */
        public final Uri[] f47639e;

        /* renamed from: f, reason: collision with root package name */
        public final int[] f47640f;

        /* renamed from: g, reason: collision with root package name */
        public final long[] f47641g;

        /* renamed from: h, reason: collision with root package name */
        public final long f47642h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f47643i;

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f47627j = Integer.toString(0, 36);
            f47628k = Integer.toString(1, 36);
            f47629l = Integer.toString(2, 36);
            f47630m = Integer.toString(3, 36);
            f47631n = Integer.toString(4, 36);
            f47632o = Integer.toString(5, 36);
            f47633p = Integer.toString(6, 36);
            f47634q = Integer.toString(7, 36);
            f47635r = new C23088b(1);
        }

        public final int a(@j.F int i12) {
            int i13;
            int i14 = i12 + 1;
            while (true) {
                int[] iArr = this.f47640f;
                if (i14 >= iArr.length || this.f47643i || (i13 = iArr[i14]) == 0 || i13 == 1) {
                    break;
                }
                i14++;
            }
            return i14;
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f47636b == bVar.f47636b && this.f47637c == bVar.f47637c && this.f47638d == bVar.f47638d && Arrays.equals(this.f47639e, bVar.f47639e) && Arrays.equals(this.f47640f, bVar.f47640f) && Arrays.equals(this.f47641g, bVar.f47641g) && this.f47642h == bVar.f47642h && this.f47643i == bVar.f47643i;
        }

        public final int hashCode() {
            int i12 = ((this.f47637c * 31) + this.f47638d) * 31;
            long j12 = this.f47636b;
            int iHashCode = (Arrays.hashCode(this.f47641g) + ((Arrays.hashCode(this.f47640f) + ((((i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + Arrays.hashCode(this.f47639e)) * 31)) * 31)) * 31;
            long j13 = this.f47642h;
            return ((iHashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f47643i ? 1 : 0);
        }

        @Override // androidx.media3.common.InterfaceC23096j
        public final Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putLong(f47627j, this.f47636b);
            bundle.putInt(f47628k, this.f47637c);
            bundle.putInt(f47634q, this.f47638d);
            bundle.putParcelableArrayList(f47629l, new ArrayList<>(Arrays.asList(this.f47639e)));
            bundle.putIntArray(f47630m, this.f47640f);
            bundle.putLongArray(f47631n, this.f47641g);
            bundle.putLong(f47632o, this.f47642h);
            bundle.putBoolean(f47633p, this.f47643i);
            return bundle;
        }

        public b(long j12, int i12, int i13, int[] iArr, Uri[] uriArr, long[] jArr, long j13, boolean z12) {
            C23110a.b(iArr.length == uriArr.length);
            this.f47636b = j12;
            this.f47637c = i12;
            this.f47638d = i13;
            this.f47640f = iArr;
            this.f47639e = uriArr;
            this.f47641g = jArr;
            this.f47642h = j13;
            this.f47643i = z12;
        }
    }

    /* compiled from: AdPlaybackState.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.c$c, reason: collision with other inner class name */
    public @interface InterfaceC1815c {
    }

    static {
        b bVar = new b(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = bVar.f47640f;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = bVar.f47641g;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        f47616h = new b(bVar.f47636b, 0, bVar.f47638d, iArrCopyOf, (Uri[]) Arrays.copyOf(bVar.f47639e, 0), jArrCopyOf, bVar.f47642h, bVar.f47643i);
        int i12 = androidx.media3.common.util.M.f47887a;
        f47617i = Integer.toString(1, 36);
        f47618j = Integer.toString(2, 36);
        f47619k = Integer.toString(3, 36);
        f47620l = Integer.toString(4, 36);
        f47621m = new C23088b(0);
    }

    public C23089c(b[] bVarArr, long j12, long j13, int i12) {
        this.f47623c = j12;
        this.f47624d = j13;
        this.f47622b = bVarArr.length + i12;
        this.f47626f = bVarArr;
        this.f47625e = i12;
    }

    public final b a(@j.F int i12) {
        int i13 = this.f47625e;
        return i12 < i13 ? f47616h : this.f47626f[i12 - i13];
    }

    public final boolean b(int i12) {
        if (i12 == this.f47622b - 1) {
            b bVarA = a(i12);
            if (bVarA.f47643i && bVarA.f47636b == Long.MIN_VALUE && bVarA.f47637c == -1) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23089c.class != obj.getClass()) {
            return false;
        }
        C23089c c23089c = (C23089c) obj;
        return androidx.media3.common.util.M.a(null, null) && this.f47622b == c23089c.f47622b && this.f47623c == c23089c.f47623c && this.f47624d == c23089c.f47624d && this.f47625e == c23089c.f47625e && Arrays.equals(this.f47626f, c23089c.f47626f);
    }

    public final int hashCode() {
        return (((((((this.f47622b * 961) + ((int) this.f47623c)) * 31) + ((int) this.f47624d)) * 31) + this.f47625e) * 31) + Arrays.hashCode(this.f47626f);
    }

    @Override // androidx.media3.common.InterfaceC23096j
    public final Bundle k() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (b bVar : this.f47626f) {
            arrayList.add(bVar.k());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f47617i, arrayList);
        }
        long j12 = this.f47623c;
        if (j12 != 0) {
            bundle.putLong(f47618j, j12);
        }
        long j13 = this.f47624d;
        if (j13 != -9223372036854775807L) {
            bundle.putLong(f47619k, j13);
        }
        int i12 = this.f47625e;
        if (i12 != 0) {
            bundle.putInt(f47620l, i12);
        }
        return bundle;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb2.append(this.f47623c);
        sb2.append(", adGroups=[");
        int i12 = 0;
        while (true) {
            b[] bVarArr = this.f47626f;
            if (i12 >= bVarArr.length) {
                sb2.append("])");
                return sb2.toString();
            }
            sb2.append("adGroup(timeUs=");
            sb2.append(bVarArr[i12].f47636b);
            sb2.append(", ads=[");
            for (int i13 = 0; i13 < bVarArr[i12].f47640f.length; i13++) {
                sb2.append("ad(state=");
                int i14 = bVarArr[i12].f47640f[i13];
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
                sb2.append(bVarArr[i12].f47641g[i13]);
                sb2.append(')');
                if (i13 < bVarArr[i12].f47640f.length - 1) {
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
