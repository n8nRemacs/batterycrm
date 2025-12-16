package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.rg;
import j.InterfaceC42154j;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class g4 implements rg {

    /* renamed from: g, reason: collision with root package name */
    public static final g4 f385558g = new g4(null, new a[0], 0, -9223372036854775807L, 0);

    /* renamed from: h, reason: collision with root package name */
    private static final a f385559h = new a().a();

    /* renamed from: i, reason: collision with root package name */
    public static final rg.a<g4> f385560i = new L0(15);

    /* renamed from: a, reason: collision with root package name */
    @j.P
    public final Object f385561a;

    /* renamed from: b, reason: collision with root package name */
    public final int f385562b;

    /* renamed from: c, reason: collision with root package name */
    public final long f385563c;

    /* renamed from: d, reason: collision with root package name */
    public final long f385564d;

    /* renamed from: e, reason: collision with root package name */
    public final int f385565e;

    /* renamed from: f, reason: collision with root package name */
    private final a[] f385566f;

    public static final class a implements rg {

        /* renamed from: h, reason: collision with root package name */
        public static final rg.a<a> f385567h = new L0(16);

        /* renamed from: a, reason: collision with root package name */
        public final long f385568a;

        /* renamed from: b, reason: collision with root package name */
        public final int f385569b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri[] f385570c;

        /* renamed from: d, reason: collision with root package name */
        public final int[] f385571d;

        /* renamed from: e, reason: collision with root package name */
        public final long[] f385572e;

        /* renamed from: f, reason: collision with root package name */
        public final long f385573f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f385574g;

        public a() {
            this(0L, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public final int a(@j.F int i12) {
            int i13;
            int i14 = i12 + 1;
            while (true) {
                int[] iArr = this.f385571d;
                if (i14 >= iArr.length || this.f385574g || (i13 = iArr[i14]) == 0 || i13 == 1) {
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
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f385568a == aVar.f385568a && this.f385569b == aVar.f385569b && Arrays.equals(this.f385570c, aVar.f385570c) && Arrays.equals(this.f385571d, aVar.f385571d) && Arrays.equals(this.f385572e, aVar.f385572e) && this.f385573f == aVar.f385573f && this.f385574g == aVar.f385574g;
        }

        public final int hashCode() {
            int i12 = this.f385569b * 31;
            long j12 = this.f385568a;
            int iHashCode = (Arrays.hashCode(this.f385572e) + ((Arrays.hashCode(this.f385571d) + ((((i12 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + Arrays.hashCode(this.f385570c)) * 31)) * 31)) * 31;
            long j13 = this.f385573f;
            return ((iHashCode + ((int) (j13 ^ (j13 >>> 32)))) * 31) + (this.f385574g ? 1 : 0);
        }

        private a(long j12, int i12, int[] iArr, Uri[] uriArr, long[] jArr, long j13, boolean z12) {
            db.a(iArr.length == uriArr.length);
            this.f385568a = j12;
            this.f385569b = i12;
            this.f385571d = iArr;
            this.f385570c = uriArr;
            this.f385572e = jArr;
            this.f385573f = j13;
            this.f385574g = z12;
        }

        @InterfaceC42154j
        public final a a() {
            int[] iArr = this.f385571d;
            int length = iArr.length;
            int iMax = Math.max(0, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            long[] jArr = this.f385572e;
            int length2 = jArr.length;
            int iMax2 = Math.max(0, length2);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
            Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
            return new a(this.f385568a, 0, iArrCopyOf, (Uri[]) Arrays.copyOf(this.f385570c, 0), jArrCopyOf, this.f385573f, this.f385574g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a a(Bundle bundle) {
            long j12 = bundle.getLong(Integer.toString(0, 36));
            int i12 = bundle.getInt(Integer.toString(1, 36), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
            int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
            long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
            return new a(j12, i12, intArray == null ? new int[0] : intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, bundle.getLong(Integer.toString(5, 36)), bundle.getBoolean(Integer.toString(6, 36)));
        }
    }

    private g4(@j.P Object obj, a[] aVarArr, long j12, long j13, int i12) {
        this.f385561a = obj;
        this.f385563c = j12;
        this.f385564d = j13;
        this.f385562b = aVarArr.length + i12;
        this.f385566f = aVarArr;
        this.f385565e = i12;
    }

    public final a a(@j.F int i12) {
        int i13 = this.f385565e;
        return i12 < i13 ? f385559h : this.f385566f[i12 - i13];
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g4.class != obj.getClass()) {
            return false;
        }
        g4 g4Var = (g4) obj;
        return pc1.a(this.f385561a, g4Var.f385561a) && this.f385562b == g4Var.f385562b && this.f385563c == g4Var.f385563c && this.f385564d == g4Var.f385564d && this.f385565e == g4Var.f385565e && Arrays.equals(this.f385566f, g4Var.f385566f);
    }

    public final int hashCode() {
        int i12 = this.f385562b * 31;
        Object obj = this.f385561a;
        return ((((((((i12 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f385563c)) * 31) + ((int) this.f385564d)) * 31) + this.f385565e) * 31) + Arrays.hashCode(this.f385566f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdPlaybackState(adsId=");
        sb2.append(this.f385561a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f385563c);
        sb2.append(", adGroups=[");
        for (int i12 = 0; i12 < this.f385566f.length; i12++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f385566f[i12].f385568a);
            sb2.append(", ads=[");
            for (int i13 = 0; i13 < this.f385566f[i12].f385571d.length; i13++) {
                sb2.append("ad(state=");
                int i14 = this.f385566f[i12].f385571d[i13];
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
                sb2.append(this.f385566f[i12].f385572e[i13]);
                sb2.append(')');
                if (i13 < this.f385566f[i12].f385571d.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i12 < this.f385566f.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g4 a(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(1, 36));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i12 = 0; i12 < parcelableArrayList.size(); i12++) {
                aVarArr2[i12] = (a) a.f385567h.fromBundle((Bundle) parcelableArrayList.get(i12));
            }
            aVarArr = aVarArr2;
        }
        return new g4(null, aVarArr, bundle.getLong(Integer.toString(2, 36), 0L), bundle.getLong(Integer.toString(3, 36), -9223372036854775807L), bundle.getInt(Integer.toString(4, 36)));
    }
}
