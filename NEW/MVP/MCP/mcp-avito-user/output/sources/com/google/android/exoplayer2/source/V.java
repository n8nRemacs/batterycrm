package com.google.android.exoplayer2.source;

import androidx.media3.common.C23088b;
import com.google.android.exoplayer2.InterfaceC36525h;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* compiled from: TrackGroup.java */
/* loaded from: classes6.dex */
public final class V implements InterfaceC36525h {

    /* renamed from: g, reason: collision with root package name */
    public static final K f346147g = new K(2);

    /* renamed from: b, reason: collision with root package name */
    public final int f346148b;

    /* renamed from: c, reason: collision with root package name */
    public final String f346149c;

    /* renamed from: d, reason: collision with root package name */
    public final int f346150d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.exoplayer2.I[] f346151e;

    /* renamed from: f, reason: collision with root package name */
    public int f346152f;

    public V(String str, com.google.android.exoplayer2.I... iArr) {
        C36585a.b(iArr.length > 0);
        this.f346149c = str;
        this.f346151e = iArr;
        this.f346148b = iArr.length;
        int i12 = com.google.android.exoplayer2.util.z.i(iArr[0].f343476m);
        this.f346150d = i12 == -1 ? com.google.android.exoplayer2.util.z.i(iArr[0].f343475l) : i12;
        String str2 = iArr[0].f343467d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i13 = iArr[0].f343469f | Http2.INITIAL_MAX_FRAME_SIZE;
        for (int i14 = 1; i14 < iArr.length; i14++) {
            String str3 = iArr[i14].f343467d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                b(i14, "languages", iArr[0].f343467d, iArr[i14].f343467d);
                return;
            } else {
                if (i13 != (iArr[i14].f343469f | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    b(i14, "role flags", Integer.toBinaryString(iArr[0].f343469f), Integer.toBinaryString(iArr[i14].f343469f));
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
        C36605v.a("", new IllegalStateException(sbB.toString()));
    }

    public final int a(com.google.android.exoplayer2.I i12) {
        int i13 = 0;
        while (true) {
            com.google.android.exoplayer2.I[] iArr = this.f346151e;
            if (i13 >= iArr.length) {
                return -1;
            }
            if (i12 == iArr[i13]) {
                return i13;
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
        V v12 = (V) obj;
        return this.f346149c.equals(v12.f346149c) && Arrays.equals(this.f346151e, v12.f346151e);
    }

    public final int hashCode() {
        if (this.f346152f == 0) {
            this.f346152f = androidx.compose.foundation.H.d(527, 31, this.f346149c) + Arrays.hashCode(this.f346151e);
        }
        return this.f346152f;
    }
}
