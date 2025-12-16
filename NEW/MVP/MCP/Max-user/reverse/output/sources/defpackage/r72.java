package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r72 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r72(Class cls, String str, int i) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(((v93) obj).s0);
            case 6:
                return Float.valueOf(((v93) obj).t0);
            case 7:
                return Float.valueOf(((f45) obj).b());
            case 8:
                return Float.valueOf(((s48) obj).s0);
            case 9:
                return Float.valueOf(((u48) obj).t0);
            case 10:
                return Float.valueOf(((SwitchCompat) obj).M0);
            case 11:
                return Float.valueOf(vhh.a.a((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                u72 u72Var = (u72) obj;
                PointF pointF = (PointF) obj2;
                u72Var.getClass();
                u72Var.a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                u72Var.b = iRound;
                int i = u72Var.f + 1;
                u72Var.f = i;
                if (i == u72Var.g) {
                    vhh.a(u72Var.e, u72Var.a, iRound, u72Var.c, u72Var.d);
                    u72Var.f = 0;
                    u72Var.g = 0;
                    break;
                }
                break;
            case 1:
                u72 u72Var2 = (u72) obj;
                PointF pointF2 = (PointF) obj2;
                u72Var2.getClass();
                u72Var2.c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                u72Var2.d = iRound2;
                int i2 = u72Var2.g + 1;
                u72Var2.g = i2;
                if (u72Var2.f == i2) {
                    vhh.a(u72Var2.e, u72Var2.a, u72Var2.b, u72Var2.c, iRound2);
                    u72Var2.f = 0;
                    u72Var2.g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                vhh.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                vhh.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                vhh.a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 5:
                v93 v93Var = (v93) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                v93Var.s0 = fFloatValue;
                int i3 = (int) (fFloatValue * 5400.0f);
                yq5 yq5Var = v93Var.X;
                ArrayList arrayList = (ArrayList) v93Var.c;
                p45 p45Var = (p45) arrayList.get(0);
                float f = v93Var.s0 * 1520.0f;
                p45Var.a = (-20.0f) + f;
                p45Var.b = f;
                for (int i4 = 0; i4 < 4; i4++) {
                    p45Var.b = (yq5Var.getInterpolation(n2.L(i3, v93.v0[i4], 667)) * 250.0f) + p45Var.b;
                    p45Var.a = (yq5Var.getInterpolation(n2.L(i3, v93.w0[i4], 667)) * 250.0f) + p45Var.a;
                }
                float f2 = p45Var.a;
                float f3 = p45Var.b;
                p45Var.a = (((f3 - f2) * v93Var.t0) + f2) / 360.0f;
                p45Var.b = f3 / 360.0f;
                int i5 = 0;
                while (true) {
                    if (i5 < 4) {
                        float fL = n2.L(i3, v93.x0[i5], 333);
                        if (fL < 0.0f || fL > 1.0f) {
                            i5++;
                        } else {
                            int i6 = i5 + v93Var.Z;
                            int[] iArr = v93Var.Y.c;
                            int length = i6 % iArr.length;
                            int length2 = (length + 1) % iArr.length;
                            int i7 = iArr[length];
                            int i8 = iArr[length2];
                            float interpolation = yq5Var.getInterpolation(fL);
                            p45 p45Var2 = (p45) arrayList.get(0);
                            Integer numValueOf = Integer.valueOf(i7);
                            Integer numValueOf2 = Integer.valueOf(i8);
                            int iIntValue = numValueOf.intValue();
                            float f4 = ((iIntValue >> 24) & 255) / 255.0f;
                            int iIntValue2 = numValueOf2.intValue();
                            float f5 = ((iIntValue2 >> 24) & 255) / 255.0f;
                            float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
                            float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
                            float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
                            float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
                            float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
                            float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
                            float fI = utb.i(f5, f4, interpolation, f4);
                            float fI2 = utb.i(fPow4, fPow, interpolation, fPow);
                            float fI3 = utb.i(fPow5, fPow2, interpolation, fPow2);
                            float fI4 = utb.i(fPow6, fPow3, interpolation, fPow3);
                            float fPow7 = ((float) Math.pow(fI2, 0.45454545454545453d)) * 255.0f;
                            float fPow8 = ((float) Math.pow(fI3, 0.45454545454545453d)) * 255.0f;
                            p45Var2.c = Integer.valueOf(Math.round(((float) Math.pow(fI4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fI * 255.0f) << 24) | (Math.round(fPow8) << 8)).intValue();
                        }
                    }
                }
                ((pj7) v93Var.b).invalidateSelf();
                break;
            case 6:
                ((v93) obj).t0 = ((Float) obj2).floatValue();
                break;
            case 7:
                f45 f45Var = (f45) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (f45Var.Z != fFloatValue2) {
                    f45Var.Z = fFloatValue2;
                    f45Var.invalidateSelf();
                    break;
                }
                break;
            case 8:
                s48 s48Var = (s48) obj;
                float fFloatValue3 = ((Float) obj2).floatValue();
                s48Var.s0 = fFloatValue3;
                ArrayList arrayList2 = (ArrayList) s48Var.c;
                ((p45) arrayList2.get(0)).a = 0.0f;
                float fL2 = n2.L((int) (fFloatValue3 * 333.0f), 0, 667);
                p45 p45Var3 = (p45) arrayList2.get(0);
                p45 p45Var4 = (p45) arrayList2.get(1);
                yq5 yq5Var2 = s48Var.o;
                float interpolation2 = yq5Var2.getInterpolation(fL2);
                p45Var4.a = interpolation2;
                p45Var3.b = interpolation2;
                p45 p45Var5 = (p45) arrayList2.get(1);
                p45 p45Var6 = (p45) arrayList2.get(2);
                float interpolation3 = yq5Var2.getInterpolation(fL2 + 0.49925038f);
                p45Var6.a = interpolation3;
                p45Var5.b = interpolation3;
                ((p45) arrayList2.get(2)).b = 1.0f;
                if (s48Var.Z && ((p45) arrayList2.get(1)).b < 1.0f) {
                    ((p45) arrayList2.get(2)).c = ((p45) arrayList2.get(1)).c;
                    ((p45) arrayList2.get(1)).c = ((p45) arrayList2.get(0)).c;
                    ((p45) arrayList2.get(0)).c = s48Var.X.c[s48Var.Y];
                    s48Var.Z = false;
                }
                ((pj7) s48Var.b).invalidateSelf();
                break;
            case 9:
                u48 u48Var = (u48) obj;
                float fFloatValue4 = ((Float) obj2).floatValue();
                u48Var.t0 = fFloatValue4;
                int i9 = (int) (fFloatValue4 * 1800.0f);
                Interpolator[] interpolatorArr = u48Var.X;
                ArrayList arrayList3 = (ArrayList) u48Var.c;
                for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                    p45 p45Var7 = (p45) arrayList3.get(i10);
                    int[] iArr2 = u48.w0;
                    int i11 = i10 * 2;
                    int i12 = iArr2[i11];
                    int[] iArr3 = u48.v0;
                    p45Var7.a = dui.d(interpolatorArr[i11].getInterpolation(n2.L(i9, i12, iArr3[i11])), 0.0f, 1.0f);
                    int i13 = i11 + 1;
                    p45Var7.b = dui.d(interpolatorArr[i13].getInterpolation(n2.L(i9, iArr2[i13], iArr3[i13])), 0.0f, 1.0f);
                }
                if (u48Var.s0) {
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ((p45) it.next()).c = u48Var.Y.c[u48Var.Z];
                    }
                    u48Var.s0 = false;
                }
                ((pj7) u48Var.b).invalidateSelf();
                break;
            case 10:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                break;
            case 11:
                vhh.a.d((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
