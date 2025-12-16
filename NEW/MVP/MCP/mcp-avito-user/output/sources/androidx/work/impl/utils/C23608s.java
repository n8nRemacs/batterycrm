package androidx.work.impl.utils;

import android.net.NetworkRequest;
import android.os.Build;
import j.X;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: NetworkRequestCompat.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.work.impl.utils.s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23608s {
    @Y61.k
    @X
    public static final int[] a(@Y61.k NetworkRequest networkRequest) {
        if (Build.VERSION.SDK_INT >= 31) {
            C23607q.f56025a.getClass();
            return networkRequest.getCapabilities();
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < 29; i12++) {
            int i13 = iArr[i12];
            C23605o.f56023a.getClass();
            if (networkRequest.hasCapability(i13)) {
                arrayList.add(Integer.valueOf(i13));
            }
        }
        return C42745f0.L0(arrayList);
    }

    @Y61.k
    @X
    public static final int[] b(@Y61.k NetworkRequest networkRequest) {
        if (Build.VERSION.SDK_INT >= 31) {
            C23607q.f56025a.getClass();
            return networkRequest.getTransportTypes();
        }
        int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < 9; i12++) {
            int i13 = iArr[i12];
            C23605o.f56023a.getClass();
            if (networkRequest.hasTransport(i13)) {
                arrayList.add(Integer.valueOf(i13));
            }
        }
        return C42745f0.L0(arrayList);
    }
}
