package xa1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C42745f0;

/* renamed from: xa1.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49907a {

    /* renamed from: a, reason: collision with root package name */
    public final int f442548a;

    /* renamed from: b, reason: collision with root package name */
    public final int f442549b;

    public C49907a(int i12, int i13) {
        this.f442548a = i12;
        this.f442549b = i13;
    }

    public final boolean a(ArrayList arrayList) {
        List<int[]> listE0 = C42745f0.E0(arrayList, 6);
        if ((listE0 instanceof Collection) && listE0.isEmpty()) {
            return true;
        }
        for (int[] iArr : listE0) {
            int i12 = iArr[0];
            int i13 = iArr[1];
            if (i12 < 0 || i12 >= this.f442548a || i13 < 0 || i13 >= this.f442549b) {
                return false;
            }
        }
        return true;
    }
}
