package androidx.media3.common;

import android.os.Bundle;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23114e;
import com.google.common.collect.AbstractC37401r1;
import java.util.Arrays;
import java.util.List;

/* compiled from: Tracks.java */
/* loaded from: classes.dex */
public final class V implements InterfaceC23096j {

    /* renamed from: c, reason: collision with root package name */
    public static final V f47535c = new V(AbstractC37401r1.C());

    /* renamed from: d, reason: collision with root package name */
    public static final String f47536d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final S f47537e;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC37401r1<a> f47538b;

    /* compiled from: Tracks.java */
    public static final class a implements InterfaceC23096j {

        /* renamed from: g, reason: collision with root package name */
        public static final String f47539g;

        /* renamed from: h, reason: collision with root package name */
        public static final String f47540h;

        /* renamed from: i, reason: collision with root package name */
        public static final String f47541i;

        /* renamed from: j, reason: collision with root package name */
        public static final String f47542j;

        /* renamed from: k, reason: collision with root package name */
        @androidx.media3.common.util.J
        public static final S f47543k;

        /* renamed from: b, reason: collision with root package name */
        public final int f47544b;

        /* renamed from: c, reason: collision with root package name */
        public final Q f47545c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f47546d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f47547e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean[] f47548f;

        static {
            int i12 = androidx.media3.common.util.M.f47887a;
            f47539g = Integer.toString(0, 36);
            f47540h = Integer.toString(1, 36);
            f47541i = Integer.toString(3, 36);
            f47542j = Integer.toString(4, 36);
            f47543k = new S(2);
        }

        @androidx.media3.common.util.J
        public a(Q q12, boolean z12, int[] iArr, boolean[] zArr) {
            int i12 = q12.f47439b;
            this.f47544b = i12;
            boolean z13 = false;
            C23110a.b(i12 == iArr.length && i12 == zArr.length);
            this.f47545c = q12;
            if (z12 && i12 > 1) {
                z13 = true;
            }
            this.f47546d = z13;
            this.f47547e = (int[]) iArr.clone();
            this.f47548f = (boolean[]) zArr.clone();
        }

        public final C23108t a(int i12) {
            return this.f47545c.f47442e[i12];
        }

        public final boolean b(int i12) {
            return this.f47548f[i12];
        }

        public final boolean equals(@j.P Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47546d == aVar.f47546d && this.f47545c.equals(aVar.f47545c) && Arrays.equals(this.f47547e, aVar.f47547e) && Arrays.equals(this.f47548f, aVar.f47548f);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f47548f) + ((Arrays.hashCode(this.f47547e) + (((this.f47545c.hashCode() * 31) + (this.f47546d ? 1 : 0)) * 31)) * 31);
        }

        @Override // androidx.media3.common.InterfaceC23096j
        public final Bundle k() {
            Bundle bundle = new Bundle();
            bundle.putBundle(f47539g, this.f47545c.k());
            bundle.putIntArray(f47540h, this.f47547e);
            bundle.putBooleanArray(f47541i, this.f47548f);
            bundle.putBoolean(f47542j, this.f47546d);
            return bundle;
        }
    }

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47536d = Integer.toString(0, 36);
        f47537e = new S(1);
    }

    @androidx.media3.common.util.J
    public V(List<a> list) {
        this.f47538b = AbstractC37401r1.v(list);
    }

    public final AbstractC37401r1<a> a() {
        return this.f47538b;
    }

    public final boolean b(int i12) {
        int i13 = 0;
        while (true) {
            AbstractC37401r1<a> abstractC37401r1 = this.f47538b;
            if (i13 >= abstractC37401r1.size()) {
                return false;
            }
            a aVar = abstractC37401r1.get(i13);
            boolean[] zArr = aVar.f47548f;
            int length = zArr.length;
            boolean z12 = false;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    break;
                }
                if (zArr[i14]) {
                    z12 = true;
                    break;
                }
                i14++;
            }
            if (z12 && aVar.f47545c.f47441d == i12) {
                return true;
            }
            i13++;
        }
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || V.class != obj.getClass()) {
            return false;
        }
        return this.f47538b.equals(((V) obj).f47538b);
    }

    public final int hashCode() {
        return this.f47538b.hashCode();
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f47536d, C23114e.b(this.f47538b));
        return bundle;
    }
}
