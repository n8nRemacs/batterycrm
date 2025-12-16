package wa1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.C42745f0;

/* loaded from: classes9.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f441627a;

    /* renamed from: b, reason: collision with root package name */
    public final int f441628b;

    public u(int i12, int i13) {
        this.f441627a = i12;
        this.f441628b = i13;
    }

    public final ArrayList a(ArrayList arrayList, int i12, int i13) {
        float f12 = this.f441627a / i12;
        float f13 = this.f441628b / i13;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            arrayList2.add(new int[]{(int) (iArr[0] / f12), (int) (iArr[1] / f13)});
        }
        return arrayList2;
    }
}
