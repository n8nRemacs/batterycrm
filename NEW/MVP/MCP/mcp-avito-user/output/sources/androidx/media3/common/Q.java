package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.media3.common.util.C23110a;
import j.InterfaceC42154j;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* compiled from: TrackGroup.java */
/* loaded from: classes.dex */
public final class Q implements InterfaceC23096j {

    /* renamed from: g, reason: collision with root package name */
    public static final String f47436g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f47437h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final C23088b f47438i;

    /* renamed from: b, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47439b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final String f47440c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.media3.common.util.J
    public final int f47441d;

    /* renamed from: e, reason: collision with root package name */
    public final C23108t[] f47442e;

    /* renamed from: f, reason: collision with root package name */
    public int f47443f;

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47436g = Integer.toString(0, 36);
        f47437h = Integer.toString(1, 36);
        f47438i = new C23088b(28);
    }

    @androidx.media3.common.util.J
    public Q(String str, C23108t... c23108tArr) {
        C23110a.b(c23108tArr.length > 0);
        this.f47440c = str;
        this.f47442e = c23108tArr;
        this.f47439b = c23108tArr.length;
        int iF2 = D.f(c23108tArr[0].f47757m);
        this.f47441d = iF2 == -1 ? D.f(c23108tArr[0].f47756l) : iF2;
        String str2 = c23108tArr[0].f47748d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i12 = c23108tArr[0].f47750f | Http2.INITIAL_MAX_FRAME_SIZE;
        for (int i13 = 1; i13 < c23108tArr.length; i13++) {
            String str3 = c23108tArr[i13].f47748d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b(i13, "languages", c23108tArr[0].f47748d, c23108tArr[i13].f47748d);
                return;
            } else {
                if (i12 != (c23108tArr[i13].f47750f | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    b(i13, "role flags", Integer.toBinaryString(c23108tArr[0].f47750f), Integer.toBinaryString(c23108tArr[i13].f47750f));
                    return;
                }
            }
        }
    }

    public static void b(int i12, String str, @j.P String str2, @j.P String str3) {
        StringBuilder sbB = C23088b.b("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbB.append(str3);
        sbB.append("' (track ");
        sbB.append(i12);
        sbB.append(")");
        androidx.media3.common.util.s.d("", new IllegalStateException(sbB.toString()));
    }

    @InterfaceC42154j
    @androidx.media3.common.util.J
    public final Q a(String str) {
        return new Q(str, this.f47442e);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q.class != obj.getClass()) {
            return false;
        }
        Q q12 = (Q) obj;
        return this.f47440c.equals(q12.f47440c) && Arrays.equals(this.f47442e, q12.f47442e);
    }

    public final int hashCode() {
        if (this.f47443f == 0) {
            this.f47443f = androidx.compose.foundation.H.d(527, 31, this.f47440c) + Arrays.hashCode(this.f47442e);
        }
        return this.f47443f;
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    public final Bundle k() {
        Bundle bundle = new Bundle();
        C23108t[] c23108tArr = this.f47442e;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(c23108tArr.length);
        for (C23108t c23108t : c23108tArr) {
            arrayList.add(c23108t.j(true));
        }
        bundle.putParcelableArrayList(f47436g, arrayList);
        bundle.putString(f47437h, this.f47440c);
        return bundle;
    }
}
