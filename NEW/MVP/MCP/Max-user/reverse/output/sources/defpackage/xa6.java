package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.a;
import com.google.android.flexbox.FlexboxLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes2.dex */
public final class xa6 implements gof {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object o;

    public xa6(qjg qjgVar, HashMap map, HashMap map2, HashMap map3) {
        this.a = qjgVar;
        this.d = map2;
        this.o = map3;
        this.c = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        qjgVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.b = jArr;
    }

    public void a(n95 n95Var, l95 l95Var, boolean z) {
        m0g m0gVar = (m0g) this.b;
        Resources resources = (Resources) this.a;
        bwd.b((qu1) this.o);
        e2f e2fVarB = (l95Var == null || !l95Var.d) ? ((uaj) this.c).b(resources, m0gVar) : ((uaj) this.d).b(resources, m0gVar);
        qu1 qu1Var = new qu1(new ys5(this, n95Var, l95Var, z), 2, new iqa(9, this));
        e2fVarB.k(qu1Var);
        this.o = qu1Var;
    }

    public ob0 b() {
        String strI = ((Size) this.a) == null ? " resolution" : "";
        if (((u75) this.b) == null) {
            strI = strI.concat(" dynamicRange");
        }
        if (((Range) this.c) == null) {
            strI = az1.i(strI, " expectedFrameRateRange");
        }
        if (((Boolean) this.o) == null) {
            strI = az1.i(strI, " zslDisabled");
        }
        if (strI.isEmpty()) {
            return new ob0((Size) this.a, (u75) this.b, (Range) this.c, (ao3) this.d, ((Boolean) this.o).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strI));
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0458 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(defpackage.kce r27, int r28, int r29, int r30, int r31, int r32, java.util.List r33) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa6.c(kce, int, int, int, int, int, java.util.List):void");
    }

    public void d(View view, int i) {
        boolean z;
        e26 e26Var = (e26) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        h26 h26Var = (h26) e26Var;
        int i2 = h26Var.s0;
        boolean z2 = true;
        if (measuredWidth >= i2 && measuredWidth <= (i2 = h26Var.u0)) {
            z = false;
        } else {
            measuredWidth = i2;
            z = true;
        }
        int i3 = h26Var.t0;
        if (measuredHeight < i3) {
            measuredHeight = i3;
        } else {
            int i4 = h26Var.v0;
            if (measuredHeight > i4) {
                measuredHeight = i4;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            w(view, i, iMakeMeasureSpec, iMakeMeasureSpec2);
            ((FlexboxLayoutManager) this.a).l1(view, i);
        }
    }

    @Override // defpackage.gof
    public int e(long j) {
        long[] jArr = (long[]) this.b;
        int iB = xxg.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    public void f(int i, List list) {
        int i2 = ((int[]) this.c)[i];
        if (i2 == -1) {
            i2 = 0;
        }
        if (list.size() > i2) {
            list.subList(i2, list.size()).clear();
        }
        int[] iArr = (int[]) this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = (long[]) this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    @Override // defpackage.gof
    public long g(int i) {
        return ((long[]) this.b)[i];
    }

    public void h(int i, int i2, int i3) {
        int size;
        int iK;
        int iL;
        int i4;
        int i5;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.a;
        int iB = flexboxLayoutManager.y.b();
        boolean[] zArr = (boolean[]) this.b;
        if (zArr == null) {
            this.b = new boolean[Math.max(iB, 10)];
        } else if (zArr.length < iB) {
            this.b = new boolean[Math.max(zArr.length * 2, iB)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= flexboxLayoutManager.y.b()) {
            return;
        }
        int i6 = flexboxLayoutManager.p;
        if (i6 == 0 || i6 == 1) {
            int mode = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int iB1 = flexboxLayoutManager.b1();
            if (mode != 1073741824) {
                size = Math.min(iB1, size);
            }
            iK = flexboxLayoutManager.K();
            iL = flexboxLayoutManager.L();
        } else {
            if (i6 != 2 && i6 != 3) {
                throw new IllegalArgumentException(ho7.f(i6, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                size = flexboxLayoutManager.b1();
            }
            iK = flexboxLayoutManager.M();
            iL = flexboxLayoutManager.J();
        }
        int i7 = iL + iK;
        int i8 = size;
        int[] iArr = (int[]) this.c;
        int i9 = iArr != null ? iArr[i3] : 0;
        List list = flexboxLayoutManager.v;
        int size2 = list.size();
        while (i9 < size2) {
            f26 f26Var = (f26) list.get(i9);
            int i10 = f26Var.a;
            if (i10 >= i8 || !f26Var.m) {
                i4 = i;
                i5 = i2;
                if (i10 > i8 && f26Var.n) {
                    r(i4, i5, f26Var, i8, i7, false);
                }
            } else {
                i4 = i;
                i5 = i2;
                l(i4, i5, f26Var, i8, i7, false);
            }
            i9++;
            i = i4;
            i2 = i5;
        }
    }

    public void i(int i) {
        int[] iArr = (int[]) this.c;
        if (iArr == null) {
            this.c = new int[Math.max(i, 10)];
        } else if (iArr.length < i) {
            this.c = Arrays.copyOf((int[]) this.c, Math.max(iArr.length * 2, i));
        }
    }

    public void j(int i) {
        long[] jArr = (long[]) this.d;
        if (jArr == null) {
            this.d = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.d = Arrays.copyOf((long[]) this.d, Math.max(jArr.length * 2, i));
        }
    }

    public void k(int i) {
        long[] jArr = (long[]) this.o;
        if (jArr == null) {
            this.o = new long[Math.max(i, 10)];
        } else if (jArr.length < i) {
            this.o = Arrays.copyOf((long[]) this.o, Math.max(jArr.length * 2, i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r28, int r29, defpackage.f26 r30, int r31, int r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa6.l(int, int, f26, int, int, boolean):void");
    }

    @Override // defpackage.gof
    public List m(long j) {
        qjg qjgVar = (qjg) this.a;
        Map map = (Map) this.c;
        HashMap map2 = (HashMap) this.d;
        HashMap map3 = (HashMap) this.o;
        ArrayList arrayList = new ArrayList();
        qjgVar.g(j, qjgVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        qjgVar.i(j, false, qjgVar.h, treeMap);
        qjgVar.h(j, map, map2, qjgVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                tjg tjgVar = (tjg) map2.get(pair.first);
                tjgVar.getClass();
                arrayList2.add(new gb4(null, null, null, bitmapDecodeByteArray, tjgVar.c, 0, tjgVar.e, tjgVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, tjgVar.f, tjgVar.g, false, -16777216, tjgVar.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            tjg tjgVar2 = (tjg) map2.get(entry.getKey());
            tjgVar2.getClass();
            eb4 eb4Var = (eb4) entry.getValue();
            CharSequence charSequence = eb4Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (nt4 nt4Var : (nt4[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), nt4.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(nt4Var), spannableStringBuilder.getSpanEnd(nt4Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = tjgVar2.c;
            int i9 = tjgVar2.d;
            eb4Var.e = f;
            eb4Var.f = i9;
            eb4Var.g = tjgVar2.e;
            eb4Var.h = tjgVar2.b;
            eb4Var.l = tjgVar2.f;
            float f2 = tjgVar2.i;
            int i10 = tjgVar2.h;
            eb4Var.k = f2;
            eb4Var.j = i10;
            eb4Var.p = tjgVar2.j;
            arrayList2.add(eb4Var.a());
        }
        return arrayList2;
    }

    public int n(int i, e26 e26Var, int i2) {
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.a;
        h26 h26Var = (h26) e26Var;
        int iY = a.y(flexboxLayoutManager.g(), flexboxLayoutManager.o, flexboxLayoutManager.m, flexboxLayoutManager.J() + flexboxLayoutManager.M() + ((ViewGroup.MarginLayoutParams) h26Var).topMargin + ((ViewGroup.MarginLayoutParams) h26Var).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) h26Var).height);
        int size = View.MeasureSpec.getSize(iY);
        int i3 = h26Var.v0;
        if (size > i3) {
            return View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(iY));
        }
        int i4 = h26Var.t0;
        return size < i4 ? View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(iY)) : iY;
    }

    public int o(int i, e26 e26Var, int i2) {
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.a;
        h26 h26Var = (h26) e26Var;
        int iY = a.y(flexboxLayoutManager.f(), flexboxLayoutManager.n, flexboxLayoutManager.l, flexboxLayoutManager.L() + flexboxLayoutManager.K() + ((ViewGroup.MarginLayoutParams) h26Var).leftMargin + ((ViewGroup.MarginLayoutParams) h26Var).rightMargin + i2, ((ViewGroup.MarginLayoutParams) h26Var).width);
        int size = View.MeasureSpec.getSize(iY);
        int i3 = h26Var.u0;
        if (size > i3) {
            return View.MeasureSpec.makeMeasureSpec(i3, View.MeasureSpec.getMode(iY));
        }
        int i4 = h26Var.s0;
        return size < i4 ? View.MeasureSpec.makeMeasureSpec(i4, View.MeasureSpec.getMode(iY)) : iY;
    }

    public void p(View view, f26 f26Var, int i, int i2, int i3, int i4) {
        e26 e26Var = (e26) view.getLayoutParams();
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.a;
        int i5 = flexboxLayoutManager.r;
        h26 h26Var = (h26) e26Var;
        int i6 = h26Var.Y;
        if (i6 != -1) {
            i5 = i6;
        }
        int i7 = f26Var.c;
        if (i5 != 0) {
            if (i5 == 1) {
                if (flexboxLayoutManager.q != 2) {
                    int i8 = i2 + i7;
                    int measuredHeight = i8 - view.getMeasuredHeight();
                    int i9 = ((ViewGroup.MarginLayoutParams) h26Var).bottomMargin;
                    view.layout(i, measuredHeight - i9, i3, i8 - i9);
                    return;
                }
                view.layout(i, view.getMeasuredHeight() + (i2 - i7) + ((ViewGroup.MarginLayoutParams) h26Var).topMargin, i3, view.getMeasuredHeight() + (i4 - i7) + ((ViewGroup.MarginLayoutParams) h26Var).topMargin);
                return;
            }
            if (i5 == 2) {
                int measuredHeight2 = (((i7 - view.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) h26Var).topMargin) - ((ViewGroup.MarginLayoutParams) h26Var).bottomMargin) / 2;
                if (flexboxLayoutManager.q != 2) {
                    int i10 = i2 + measuredHeight2;
                    view.layout(i, i10, i3, view.getMeasuredHeight() + i10);
                    return;
                } else {
                    int i11 = i2 - measuredHeight2;
                    view.layout(i, i11, i3, view.getMeasuredHeight() + i11);
                    return;
                }
            }
            if (i5 == 3) {
                if (flexboxLayoutManager.q != 2) {
                    int iMax = Math.max(f26Var.h - view.getBaseline(), ((ViewGroup.MarginLayoutParams) h26Var).topMargin);
                    view.layout(i, i2 + iMax, i3, i4 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (f26Var.h - view.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) h26Var).bottomMargin);
                    view.layout(i, i2 - iMax2, i3, i4 - iMax2);
                    return;
                }
            }
            if (i5 != 4) {
                return;
            }
        }
        if (flexboxLayoutManager.q != 2) {
            int i12 = ((ViewGroup.MarginLayoutParams) h26Var).topMargin;
            view.layout(i, i2 + i12, i3, i4 + i12);
        } else {
            int i13 = ((ViewGroup.MarginLayoutParams) h26Var).bottomMargin;
            view.layout(i, i2 - i13, i3, i4 - i13);
        }
    }

    public void q(View view, f26 f26Var, boolean z, int i, int i2, int i3, int i4) {
        e26 e26Var = (e26) view.getLayoutParams();
        int i5 = ((FlexboxLayoutManager) this.a).r;
        h26 h26Var = (h26) e26Var;
        int i6 = h26Var.Y;
        if (i6 != -1) {
            i5 = i6;
        }
        int i7 = f26Var.c;
        if (i5 != 0) {
            if (i5 == 1) {
                if (!z) {
                    view.layout(((i + i7) - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) h26Var).rightMargin, i2, ((i3 + i7) - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) h26Var).rightMargin, i4);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i - i7) + ((ViewGroup.MarginLayoutParams) h26Var).leftMargin, i2, view.getMeasuredWidth() + (i3 - i7) + ((ViewGroup.MarginLayoutParams) h26Var).leftMargin, i4);
                return;
            }
            if (i5 == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i7 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z) {
                    view.layout(i - marginStart, i2, i3 - marginStart, i4);
                    return;
                } else {
                    view.layout(i + marginStart, i2, i3 + marginStart, i4);
                    return;
                }
            }
            if (i5 != 3 && i5 != 4) {
                return;
            }
        }
        if (z) {
            int i8 = ((ViewGroup.MarginLayoutParams) h26Var).rightMargin;
            view.layout(i - i8, i2, i3 - i8, i4);
        } else {
            int i9 = ((ViewGroup.MarginLayoutParams) h26Var).leftMargin;
            view.layout(i + i9, i2, i3 + i9, i4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(int r27, int r28, defpackage.f26 r29, int r30, int r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa6.r(int, int, f26, int, int, boolean):void");
    }

    @Override // defpackage.gof
    public int s() {
        return ((long[]) this.b).length;
    }

    public void t(View view, int i, int i2) {
        h26 h26Var = (h26) ((e26) view.getLayoutParams());
        int i3 = (i - ((ViewGroup.MarginLayoutParams) h26Var).leftMargin) - ((ViewGroup.MarginLayoutParams) h26Var).rightMargin;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.a;
        int iMin = Math.min(Math.max(i3 - flexboxLayoutManager.Z0(view), h26Var.s0), h26Var.u0);
        long[] jArr = (long[]) this.o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        w(view, i2, iMakeMeasureSpec2, iMakeMeasureSpec);
        flexboxLayoutManager.l1(view, i2);
    }

    public void u(View view, int i, int i2) {
        h26 h26Var = (h26) ((e26) view.getLayoutParams());
        int i3 = (i - ((ViewGroup.MarginLayoutParams) h26Var).topMargin) - ((ViewGroup.MarginLayoutParams) h26Var).bottomMargin;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.a;
        int iMin = Math.min(Math.max(i3 - flexboxLayoutManager.Z0(view), h26Var.t0), h26Var.v0);
        long[] jArr = (long[]) this.o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        w(view, i2, iMakeMeasureSpec, iMakeMeasureSpec2);
        flexboxLayoutManager.l1(view, i2);
    }

    public void v(int i) {
        View viewA1;
        int i2;
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) this.a;
        if (i >= flexboxLayoutManager.y.b()) {
            return;
        }
        int i3 = flexboxLayoutManager.p;
        if (flexboxLayoutManager.r != 4) {
            for (f26 f26Var : flexboxLayoutManager.v) {
                Iterator it = f26Var.j.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    View viewA12 = flexboxLayoutManager.a1(num.intValue());
                    if (i3 == 0 || i3 == 1) {
                        u(viewA12, f26Var.c, num.intValue());
                    } else {
                        if (i3 != 2 && i3 != 3) {
                            throw new IllegalArgumentException(ho7.f(i3, "Invalid flex direction: "));
                        }
                        t(viewA12, f26Var.c, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = (int[]) this.c;
        List list = flexboxLayoutManager.v;
        int size = list.size();
        for (int i4 = iArr != null ? iArr[i] : 0; i4 < size; i4++) {
            f26 f26Var2 = (f26) list.get(i4);
            int i5 = f26Var2.d;
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = f26Var2.k + i6;
                if (i6 < flexboxLayoutManager.y.b() && (viewA1 = flexboxLayoutManager.a1(i7)) != null && viewA1.getVisibility() != 8 && ((i2 = ((h26) ((e26) viewA1.getLayoutParams())).Y) == -1 || i2 == 4)) {
                    if (i3 == 0 || i3 == 1) {
                        u(viewA1, f26Var2.c, i7);
                    } else {
                        if (i3 != 2 && i3 != 3) {
                            throw new IllegalArgumentException(ho7.f(i3, "Invalid flex direction: "));
                        }
                        t(viewA1, f26Var2.c, i7);
                    }
                }
            }
        }
    }

    public void w(View view, int i, int i2, int i3) {
        long[] jArr = (long[]) this.d;
        if (jArr != null) {
            jArr[i] = (i2 & 4294967295L) | (i3 << 32);
        }
        long[] jArr2 = (long[]) this.o;
        if (jArr2 != null) {
            jArr2[i] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }
}
