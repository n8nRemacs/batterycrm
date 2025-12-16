package wa1;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C42745f0;
import za1.C50538c;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f441584f = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final int f441579a = 468;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f441580b = new int[468];

    /* renamed from: c, reason: collision with root package name */
    public final List f441581c = C42745f0.U(new C50538c(), new C50538c());

    /* renamed from: d, reason: collision with root package name */
    public final float[] f441582d = new float[468];

    /* renamed from: e, reason: collision with root package name */
    public final float[] f441583e = new float[468];

    public c() {
        kotlin.ranges.k it = kotlin.ranges.s.r(0, 26).iterator();
        int i12 = 0;
        while (it.f406910d) {
            int iA2 = it.a();
            kotlin.ranges.k it2 = kotlin.ranges.s.r(0, 18).iterator();
            while (it2.f406910d) {
                int iA3 = it2.a();
                this.f441582d[i12] = iA3;
                this.f441583e[i12] = iA2;
                ArrayList arrayList = new ArrayList();
                if (iA3 < 17) {
                    arrayList.add(Integer.valueOf((iA2 * 18) + iA3 + 1));
                }
                if (iA2 < 25) {
                    arrayList.add(Integer.valueOf(((iA2 + 1) * 18) + iA3));
                }
                if (iA3 > 0) {
                    arrayList.add(Integer.valueOf((iA2 * 18) + (iA3 - 1)));
                }
                if (iA2 > 0) {
                    arrayList.add(Integer.valueOf(((iA2 - 1) * 18) + iA3));
                }
                this.f441584f.add(C42745f0.L0(arrayList));
                i12++;
            }
        }
    }
}
