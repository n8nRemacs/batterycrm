package B31;

import android.content.Context;
import c31.C26934a;

/* loaded from: classes8.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f862a;

    /* renamed from: b, reason: collision with root package name */
    public final C26934a f863b;

    public j(Context context, C26934a c26934a) {
        this.f862a = context;
        this.f863b = c26934a;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a() {
        /*
            r12 = this;
            android.content.Context r0 = r12.f862a
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            int r1 = r0.checkSelfPermission(r1)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto Le
            r1 = r3
            goto Lf
        Le:
            r1 = r2
        Lf:
            java.lang.String r4 = ""
            if (r1 != 0) goto L14
            return r4
        L14:
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            if (r0 == 0) goto L65
            android.net.Network[] r1 = r0.getAllNetworks()
            int r5 = r1.length
            r6 = 0
            java.lang.String r7 = "CELLULAR"
            java.lang.String r8 = "WIFI"
            if (r5 != 0) goto L2b
            goto L50
        L2b:
            int r5 = r1.length
            r9 = r2
        L2d:
            if (r9 >= r5) goto L50
            r10 = r1[r9]
            android.net.NetworkCapabilities r10 = r0.getNetworkCapabilities(r10)
            if (r10 != 0) goto L38
            goto L48
        L38:
            boolean r11 = r10.hasTransport(r3)
            if (r11 == 0) goto L40
            r10 = r8
            goto L49
        L40:
            boolean r10 = r10.hasTransport(r2)
            if (r10 == 0) goto L48
            r10 = r7
            goto L49
        L48:
            r10 = r6
        L49:
            if (r10 == 0) goto L4d
            r6 = r10
            goto L50
        L4d:
            int r9 = r9 + 1
            goto L2d
        L50:
            if (r6 == 0) goto L53
            return r6
        L53:
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L65
            int r0 = r0.getType()
            if (r0 == 0) goto L64
            if (r0 == r3) goto L62
            goto L65
        L62:
            r4 = r8
            goto L65
        L64:
            r4 = r7
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: B31.j.a():java.lang.String");
    }
}
