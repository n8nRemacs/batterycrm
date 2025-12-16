package androidx.core.content.res;

import androidx.annotation.RestrictTo;
import j.InterfaceC42156l;
import j.N;
import java.util.ArrayList;

/* compiled from: GradientColorInflaterCompat.java */
@RestrictTo
/* loaded from: classes.dex */
final class g {

    /* compiled from: GradientColorInflaterCompat.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f44671a;

        /* renamed from: b, reason: collision with root package name */
        public final float[] f44672b;

        public a(@N ArrayList arrayList, @N ArrayList arrayList2) {
            int size = arrayList.size();
            this.f44671a = new int[size];
            this.f44672b = new float[size];
            for (int i12 = 0; i12 < size; i12++) {
                this.f44671a[i12] = ((Integer) arrayList.get(i12)).intValue();
                this.f44672b[i12] = ((Float) arrayList2.get(i12)).floatValue();
            }
        }

        public a(@InterfaceC42156l int i12, @InterfaceC42156l int i13) {
            this.f44671a = new int[]{i12, i13};
            this.f44672b = new float[]{0.0f, 1.0f};
        }

        public a(@InterfaceC42156l int i12, @InterfaceC42156l int i13, @InterfaceC42156l int i14) {
            this.f44671a = new int[]{i12, i13, i14};
            this.f44672b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
