package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class s4f {
    public static final ov5 i = new ov5(23);
    public static final ov5 j = new ov5(25);
    public static final ov5 k = new ov5(24);
    public static final ov5 l = new ov5(26);
    public final /* synthetic */ int a;
    public final int b;
    public final ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final Object[] h;

    public s4f(int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = i2;
                this.h = new r4f[5];
                this.c = new ArrayList();
                this.d = -1;
                break;
            default:
                this.b = i2;
                this.h = new q4f[5];
                this.c = new ArrayList();
                this.d = -1;
                break;
        }
    }

    public final void a(int i2, float f) {
        q4f q4fVar;
        r4f r4fVar;
        switch (this.a) {
            case 0:
                q4f[] q4fVarArr = (q4f[]) this.h;
                int i3 = this.d;
                ArrayList arrayList = this.c;
                if (i3 != 1) {
                    Collections.sort(arrayList, i);
                    this.d = 1;
                }
                int i4 = this.g;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    this.g = i5;
                    q4fVar = q4fVarArr[i5];
                } else {
                    q4fVar = new q4f();
                }
                int i6 = this.e;
                this.e = i6 + 1;
                q4fVar.a = i6;
                q4fVar.b = i2;
                q4fVar.c = f;
                arrayList.add(q4fVar);
                this.f += i2;
                while (true) {
                    int i7 = this.f;
                    int i8 = this.b;
                    if (i7 <= i8) {
                        break;
                    } else {
                        int i9 = i7 - i8;
                        q4f q4fVar2 = (q4f) arrayList.get(0);
                        int i10 = q4fVar2.b;
                        if (i10 <= i9) {
                            this.f -= i10;
                            arrayList.remove(0);
                            int i11 = this.g;
                            if (i11 < 5) {
                                this.g = i11 + 1;
                                q4fVarArr[i11] = q4fVar2;
                            }
                        } else {
                            q4fVar2.b = i10 - i9;
                            this.f -= i9;
                        }
                    }
                }
            default:
                r4f[] r4fVarArr = (r4f[]) this.h;
                int i12 = this.d;
                ArrayList arrayList2 = this.c;
                if (i12 != 1) {
                    Collections.sort(arrayList2, k);
                    this.d = 1;
                }
                int i13 = this.g;
                if (i13 > 0) {
                    int i14 = i13 - 1;
                    this.g = i14;
                    r4fVar = r4fVarArr[i14];
                } else {
                    r4fVar = new r4f();
                }
                int i15 = this.e;
                this.e = i15 + 1;
                r4fVar.a = i15;
                r4fVar.b = i2;
                r4fVar.c = f;
                arrayList2.add(r4fVar);
                this.f += i2;
                while (true) {
                    int i16 = this.f;
                    int i17 = this.b;
                    if (i16 <= i17) {
                        break;
                    } else {
                        int i18 = i16 - i17;
                        r4f r4fVar2 = (r4f) arrayList2.get(0);
                        int i19 = r4fVar2.b;
                        if (i19 <= i18) {
                            this.f -= i19;
                            arrayList2.remove(0);
                            int i20 = this.g;
                            if (i20 < 5) {
                                this.g = i20 + 1;
                                r4fVarArr[i20] = r4fVar2;
                            }
                        } else {
                            r4fVar2.b = i19 - i18;
                            this.f -= i18;
                        }
                    }
                }
        }
    }

    public float b() {
        int i2 = this.d;
        ArrayList arrayList = this.c;
        if (i2 != 0) {
            Collections.sort(arrayList, j);
            this.d = 0;
        }
        float f = 0.5f * this.f;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            q4f q4fVar = (q4f) arrayList.get(i4);
            i3 += q4fVar.b;
            if (i3 >= f) {
                return q4fVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((q4f) wy1.d(arrayList, 1)).c;
    }

    public float c(float f) {
        int i2 = this.d;
        ArrayList arrayList = this.c;
        if (i2 != 0) {
            Collections.sort(arrayList, l);
            this.d = 0;
        }
        float f2 = f * this.f;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            r4f r4fVar = (r4f) arrayList.get(i4);
            i3 += r4fVar.b;
            if (i3 >= f2) {
                return r4fVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((r4f) wy1.d(arrayList, 1)).c;
    }
}
