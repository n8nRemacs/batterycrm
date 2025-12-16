package com.avito.android.publish.scanner_v2;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: InnerFrameCalculator.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/publish/scanner_v2/a;", "", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f239319a = new a();

    /* compiled from: InnerFrameCalculator.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/scanner_v2/a$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.scanner_v2.a$a, reason: collision with other inner class name */
    public static final /* data */ class C7196a {

        /* renamed from: a, reason: collision with root package name */
        public final int f239320a;

        /* renamed from: b, reason: collision with root package name */
        public final int f239321b;

        /* renamed from: c, reason: collision with root package name */
        public final int f239322c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f239323d;

        /* renamed from: e, reason: collision with root package name */
        public final int f239324e;

        public C7196a(int i12, int i13, int i14, int i15, boolean z12) {
            this.f239320a = i12;
            this.f239321b = i13;
            this.f239322c = i14;
            this.f239323d = z12;
            this.f239324e = i15;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C7196a)) {
                return false;
            }
            C7196a c7196a = (C7196a) obj;
            return this.f239320a == c7196a.f239320a && this.f239321b == c7196a.f239321b && this.f239322c == c7196a.f239322c && this.f239323d == c7196a.f239323d && this.f239324e == c7196a.f239324e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f239324e) + r.i(r.e(this.f239322c, r.e(this.f239321b, Integer.hashCode(this.f239320a) * 31, 31), 31), 31, this.f239323d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OverlayInnerPaddings(top=");
            sb2.append(this.f239320a);
            sb2.append(", bottom=");
            sb2.append(this.f239321b);
            sb2.append(", horizontal=");
            sb2.append(this.f239322c);
            sb2.append(", isControllerCollapsed=");
            sb2.append(this.f239323d);
            sb2.append(", statusBarHeight=");
            return r.t(sb2, this.f239324e, ')');
        }
    }

    @k
    public static C7196a a(float f12, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i22 = ((i13 - i15) - i16) - i17;
        int i23 = i22 - i18;
        int i24 = i22 - i19;
        float f13 = (i12 - (i14 * 2)) / f12;
        float f14 = i23;
        if (f14 > f13) {
            int i25 = ((int) (f14 - f13)) / 2;
            return new C7196a(i15 + i16 + i25, i17 + i18 + i25, i14, i15, false);
        }
        float f15 = i24;
        if (f15 <= f13) {
            return a(f12, i12, i13, (int) (i14 * 1.05d), i15, i16, i17, i18, i19);
        }
        int i26 = (int) (f15 - f13);
        return new C7196a(i15 + i16 + i26, i17 + i19 + i26, i14, i15, true);
    }
}
