package xa1;

import java.util.ArrayList;
import wa1.t;

/* renamed from: xa1.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49908b {

    /* renamed from: a, reason: collision with root package name */
    public final float f442550a;

    /* renamed from: b, reason: collision with root package name */
    public final float f442551b;

    public C49908b(int i12) {
        float f12 = i12;
        float f13 = 0.15f * f12;
        this.f442550a = f13;
        this.f442551b = f12 - f13;
    }

    public final boolean a(ArrayList arrayList) {
        boolean z12;
        int[] iArr = t.f441625a;
        int i12 = 0;
        while (true) {
            if (i12 >= 3) {
                z12 = true;
                break;
            }
            if (this.f442550a <= ((int[]) arrayList.get(iArr[i12]))[0]) {
                z12 = false;
                break;
            }
            i12++;
        }
        int[] iArr2 = t.f441626b;
        for (int i13 = 0; i13 < 3; i13++) {
            if (this.f442551b >= ((int[]) arrayList.get(iArr2[i13]))[0]) {
                return false;
            }
        }
        return z12;
    }
}
