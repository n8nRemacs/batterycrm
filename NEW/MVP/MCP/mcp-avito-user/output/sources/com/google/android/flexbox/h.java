package com.google.android.flexbox;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.r;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.N;
import j.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: FlexboxHelper.java */
/* loaded from: classes6.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    public final d f348515a;

    /* renamed from: b, reason: collision with root package name */
    public boolean[] f348516b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public int[] f348517c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public long[] f348518d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public long[] f348519e;

    /* compiled from: FlexboxHelper.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public List<f> f348520a;

        /* renamed from: b, reason: collision with root package name */
        public int f348521b;
    }

    /* compiled from: FlexboxHelper.java */
    public static class c implements Comparable<c> {

        /* renamed from: b, reason: collision with root package name */
        public int f348522b;

        /* renamed from: c, reason: collision with root package name */
        public int f348523c;

        public c() {
        }

        @Override // java.lang.Comparable
        public final int compareTo(@N c cVar) {
            c cVar2 = cVar;
            int i12 = this.f348523c;
            int i13 = cVar2.f348523c;
            return i12 != i13 ? i12 - i13 : this.f348522b - cVar2.f348522b;
        }

        @N
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Order{order=");
            sb2.append(this.f348523c);
            sb2.append(", index=");
            return r.t(sb2, this.f348522b, '}');
        }
    }

    public h(d dVar) {
        this.f348515a = dVar;
    }

    public static ArrayList e(int i12, int i13, List list) {
        int i14 = (i12 - i13) / 2;
        ArrayList arrayList = new ArrayList();
        f fVar = new f();
        fVar.f348503g = i14;
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (i15 == 0) {
                arrayList.add(fVar);
            }
            arrayList.add((f) list.get(i15));
            if (i15 == list.size() - 1) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    public static int[] r(int i12, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i12];
        Iterator it = arrayList.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            c cVar = (c) it.next();
            int i14 = cVar.f348522b;
            iArr[i13] = i14;
            sparseIntArray.append(i14, cVar.f348523c);
            i13++;
        }
        return iArr;
    }

    public final void a(List<f> list, f fVar, int i12, int i13) {
        fVar.f348509m = i13;
        this.f348515a.m(fVar);
        fVar.f348512p = i12;
        list.add(fVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x039c A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.google.android.flexbox.h.b r28, int r29, int r30, int r31, int r32, int r33, @j.P java.util.List<com.google.android.flexbox.f> r34) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.h.b(com.google.android.flexbox.h$b, int, int, int, int, int, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.FlexItem r0 = (com.google.android.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.z0()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.z0()
        L19:
            r3 = r4
            goto L27
        L1b:
            int r3 = r0.d0()
            if (r1 <= r3) goto L26
            int r1 = r0.d0()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.k3()
            if (r2 >= r5) goto L32
            int r2 = r0.k3()
            goto L3e
        L32:
            int r5 = r0.p3()
            if (r2 <= r5) goto L3d
            int r2 = r0.p3()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.v(r8, r1, r0, r7)
            com.google.android.flexbox.d r0 = r6.f348515a
            r0.d(r7, r8)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.h.c(android.view.View, int):void");
    }

    public final void d(int i12, List list) {
        int i13 = this.f348517c[i12];
        if (i13 == -1) {
            i13 = 0;
        }
        for (int size = list.size() - 1; size >= i13; size--) {
            list.remove(size);
        }
        int[] iArr = this.f348517c;
        int length = iArr.length - 1;
        if (i12 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i12, length, -1);
        }
        long[] jArr = this.f348518d;
        int length2 = jArr.length - 1;
        if (i12 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i12, length2, 0L);
        }
    }

    @N
    public final ArrayList f(int i12) {
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            FlexItem flexItem = (FlexItem) this.f348515a.q(i13).getLayoutParams();
            c cVar = new c();
            cVar.f348523c = flexItem.getOrder();
            cVar.f348522b = i13;
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public final void g(int i12, int i13, int i14) {
        int mode;
        int size;
        d dVar = this.f348515a;
        int flexDirection = dVar.getFlexDirection();
        if (flexDirection == 0 || flexDirection == 1) {
            mode = View.MeasureSpec.getMode(i13);
            size = View.MeasureSpec.getSize(i13);
        } else {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(AK.c.g(flexDirection, "Invalid flex direction: "));
            }
            mode = View.MeasureSpec.getMode(i12);
            size = View.MeasureSpec.getSize(i12);
        }
        List<f> flexLinesInternal = dVar.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = dVar.getSumOfCrossSize() + i14;
            int i15 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f348503g = size - i14;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = dVar.getAlignContent();
                if (alignContent == 1) {
                    f fVar = new f();
                    fVar.f348503g = size - sumOfCrossSize;
                    flexLinesInternal.add(0, fVar);
                    return;
                }
                if (alignContent == 2) {
                    dVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize >= size) {
                        return;
                    }
                    float size2 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                    ArrayList arrayList = new ArrayList();
                    int size3 = flexLinesInternal.size();
                    float f12 = 0.0f;
                    while (i15 < size3) {
                        arrayList.add(flexLinesInternal.get(i15));
                        if (i15 != flexLinesInternal.size() - 1) {
                            f fVar2 = new f();
                            if (i15 == flexLinesInternal.size() - 2) {
                                fVar2.f348503g = Math.round(f12 + size2);
                                f12 = 0.0f;
                            } else {
                                fVar2.f348503g = Math.round(size2);
                            }
                            int i16 = fVar2.f348503g;
                            float f13 = (size2 - i16) + f12;
                            if (f13 > 1.0f) {
                                fVar2.f348503g = i16 + 1;
                                f13 -= 1.0f;
                            } else if (f13 < -1.0f) {
                                fVar2.f348503g = i16 - 1;
                                f13 += 1.0f;
                            }
                            f12 = f13;
                            arrayList.add(fVar2);
                        }
                        i15++;
                    }
                    dVar.setFlexLines(arrayList);
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        dVar.setFlexLines(e(size, sumOfCrossSize, flexLinesInternal));
                        return;
                    }
                    int size4 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    f fVar3 = new f();
                    fVar3.f348503g = size4;
                    for (f fVar4 : flexLinesInternal) {
                        arrayList2.add(fVar3);
                        arrayList2.add(fVar4);
                        arrayList2.add(fVar3);
                    }
                    dVar.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size5 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size6 = flexLinesInternal.size();
                    float f14 = 0.0f;
                    while (i15 < size6) {
                        f fVar5 = flexLinesInternal.get(i15);
                        float f15 = fVar5.f348503g + size5;
                        if (i15 == flexLinesInternal.size() - 1) {
                            f15 += f14;
                            f14 = 0.0f;
                        }
                        int iRound = Math.round(f15);
                        float f16 = (f15 - iRound) + f14;
                        if (f16 > 1.0f) {
                            iRound++;
                            f16 -= 1.0f;
                        } else if (f16 < -1.0f) {
                            iRound--;
                            f16 += 1.0f;
                        }
                        f14 = f16;
                        fVar5.f348503g = iRound;
                        i15++;
                    }
                }
            }
        }
    }

    public final void h(int i12, int i13, int i14) {
        int size;
        int paddingLeft;
        int paddingRight;
        d dVar = this.f348515a;
        int flexItemCount = dVar.getFlexItemCount();
        boolean[] zArr = this.f348516b;
        if (zArr == null) {
            if (flexItemCount < 10) {
                flexItemCount = 10;
            }
            this.f348516b = new boolean[flexItemCount];
        } else if (zArr.length < flexItemCount) {
            int length = zArr.length * 2;
            if (length >= flexItemCount) {
                flexItemCount = length;
            }
            this.f348516b = new boolean[flexItemCount];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i14 >= dVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = dVar.getFlexDirection();
        int flexDirection2 = dVar.getFlexDirection();
        if (flexDirection2 == 0 || flexDirection2 == 1) {
            int mode = View.MeasureSpec.getMode(i12);
            size = View.MeasureSpec.getSize(i12);
            int largestMainSize = dVar.getLargestMainSize();
            if (mode != 1073741824 && largestMainSize <= size) {
                size = largestMainSize;
            }
            paddingLeft = dVar.getPaddingLeft();
            paddingRight = dVar.getPaddingRight();
        } else {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(AK.c.g(flexDirection, "Invalid flex direction: "));
            }
            int mode2 = View.MeasureSpec.getMode(i13);
            size = View.MeasureSpec.getSize(i13);
            if (mode2 != 1073741824) {
                size = dVar.getLargestMainSize();
            }
            paddingLeft = dVar.getPaddingTop();
            paddingRight = dVar.getPaddingBottom();
        }
        int i15 = paddingLeft + paddingRight;
        int[] iArr = this.f348517c;
        List<f> flexLinesInternal = dVar.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        for (int i16 = iArr != null ? iArr[i14] : 0; i16 < size2; i16++) {
            f fVar = flexLinesInternal.get(i16);
            int i17 = fVar.f348501e;
            if (i17 < size && fVar.f348513q) {
                l(i12, i13, fVar, size, i15, false);
            } else if (i17 > size && fVar.f348514r) {
                q(i12, i13, fVar, size, i15, false);
            }
        }
    }

    public final void i(int i12) {
        int[] iArr = this.f348517c;
        if (iArr == null) {
            if (i12 < 10) {
                i12 = 10;
            }
            this.f348517c = new int[i12];
        } else if (iArr.length < i12) {
            int length = iArr.length * 2;
            if (length >= i12) {
                i12 = length;
            }
            this.f348517c = Arrays.copyOf(iArr, i12);
        }
    }

    public final void j(int i12) {
        long[] jArr = this.f348518d;
        if (jArr == null) {
            if (i12 < 10) {
                i12 = 10;
            }
            this.f348518d = new long[i12];
        } else if (jArr.length < i12) {
            int length = jArr.length * 2;
            if (length >= i12) {
                i12 = length;
            }
            this.f348518d = Arrays.copyOf(jArr, i12);
        }
    }

    public final void k(int i12) {
        long[] jArr = this.f348519e;
        if (jArr == null) {
            if (i12 < 10) {
                i12 = 10;
            }
            this.f348519e = new long[i12];
        } else if (jArr.length < i12) {
            int length = jArr.length * 2;
            if (length >= i12) {
                i12 = length;
            }
            this.f348519e = Arrays.copyOf(jArr, i12);
        }
    }

    public final void l(int i12, int i13, f fVar, int i14, int i15, boolean z12) {
        int i16;
        int i17;
        d dVar;
        View view;
        View view2;
        int iMax;
        FlexItem flexItem;
        double d12;
        double d13;
        float f12 = fVar.f348506j;
        if (f12 <= 0.0f || i14 < (i16 = fVar.f348501e)) {
            return;
        }
        float f13 = (i14 - i16) / f12;
        fVar.f348501e = i15 + fVar.f348502f;
        if (!z12) {
            fVar.f348503g = BeduinInputModel.MIN_TEXT_VERSION;
        }
        int i18 = 0;
        boolean z13 = false;
        int i19 = 0;
        float f14 = 0.0f;
        while (i18 < fVar.f348504h) {
            int i22 = fVar.f348511o + i18;
            d dVar2 = this.f348515a;
            View viewU = dVar2.u(i22);
            if (viewU == null || viewU.getVisibility() == 8) {
                i17 = i16;
            } else {
                FlexItem flexItem2 = (FlexItem) viewU.getLayoutParams();
                int flexDirection = dVar2.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i17 = i16;
                    int measuredWidth = viewU.getMeasuredWidth();
                    long[] jArr = this.f348519e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i22];
                    }
                    int measuredHeight = viewU.getMeasuredHeight();
                    long[] jArr2 = this.f348519e;
                    if (jArr2 != null) {
                        long j12 = jArr2[i22];
                        dVar = dVar2;
                        view = viewU;
                        measuredHeight = (int) (j12 >> 32);
                    } else {
                        dVar = dVar2;
                        view = viewU;
                    }
                    if (this.f348516b[i22] || flexItem2.k2() <= 0.0f) {
                        view2 = view;
                    } else {
                        float fK2 = (flexItem2.k2() * f13) + measuredWidth;
                        if (i18 == fVar.f348504h - 1) {
                            fK2 += f14;
                            f14 = 0.0f;
                        }
                        int iRound = Math.round(fK2);
                        if (iRound > flexItem2.d0()) {
                            iRound = flexItem2.d0();
                            this.f348516b[i22] = true;
                            fVar.f348506j -= flexItem2.k2();
                            flexItem = flexItem2;
                            z13 = true;
                        } else {
                            float f15 = (fK2 - iRound) + f14;
                            flexItem = flexItem2;
                            double d14 = f15;
                            if (d14 > 1.0d) {
                                iRound++;
                                d12 = d14 - 1.0d;
                            } else {
                                if (d14 < -1.0d) {
                                    iRound--;
                                    d12 = d14 + 1.0d;
                                }
                                f14 = f15;
                            }
                            f15 = (float) d12;
                            f14 = f15;
                        }
                        flexItem2 = flexItem;
                        int iM2 = m(i13, flexItem2, fVar.f348509m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        view2 = view;
                        view2.measure(iMakeMeasureSpec, iM2);
                        int measuredWidth2 = view2.getMeasuredWidth();
                        int measuredHeight2 = view2.getMeasuredHeight();
                        v(i22, iMakeMeasureSpec, iM2, view2);
                        dVar.d(view2, i22);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i19, measuredHeight + flexItem2.G0() + flexItem2.i1() + dVar.e(view2));
                    fVar.f348501e = measuredWidth + flexItem2.c3() + flexItem2.j3() + fVar.f348501e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewU.getMeasuredHeight();
                    long[] jArr3 = this.f348519e;
                    if (jArr3 != null) {
                        i17 = i16;
                        measuredHeight3 = (int) (jArr3[i22] >> 32);
                    } else {
                        i17 = i16;
                    }
                    int measuredWidth3 = viewU.getMeasuredWidth();
                    long[] jArr4 = this.f348519e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i22];
                    }
                    if (!this.f348516b[i22] && flexItem2.k2() > 0.0f) {
                        float fK22 = (flexItem2.k2() * f13) + measuredHeight3;
                        if (i18 == fVar.f348504h - 1) {
                            fK22 += f14;
                            f14 = 0.0f;
                        }
                        int iRound2 = Math.round(fK22);
                        if (iRound2 > flexItem2.p3()) {
                            iRound2 = flexItem2.p3();
                            this.f348516b[i22] = true;
                            fVar.f348506j -= flexItem2.k2();
                            z13 = true;
                        } else {
                            float f16 = (fK22 - iRound2) + f14;
                            double d15 = f16;
                            if (d15 > 1.0d) {
                                iRound2++;
                                d13 = d15 - 1.0d;
                            } else {
                                if (d15 < -1.0d) {
                                    iRound2--;
                                    d13 = d15 + 1.0d;
                                }
                                f14 = f16;
                            }
                            f16 = (float) d13;
                            f14 = f16;
                        }
                        int iN2 = n(i12, flexItem2, fVar.f348509m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewU.measure(iN2, iMakeMeasureSpec2);
                        int measuredWidth4 = viewU.getMeasuredWidth();
                        int measuredHeight4 = viewU.getMeasuredHeight();
                        v(i22, iN2, iMakeMeasureSpec2, viewU);
                        dVar2.d(viewU, i22);
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i19, measuredWidth3 + flexItem2.c3() + flexItem2.j3() + dVar2.e(viewU));
                    fVar.f348501e = measuredHeight3 + flexItem2.G0() + flexItem2.i1() + fVar.f348501e;
                }
                fVar.f348503g = Math.max(fVar.f348503g, iMax);
                i19 = iMax;
            }
            i18++;
            i16 = i17;
        }
        int i23 = i16;
        if (!z13 || i23 == fVar.f348501e) {
            return;
        }
        l(i12, i13, fVar, i14, i15, true);
    }

    public final int m(int i12, FlexItem flexItem, int i13) {
        d dVar = this.f348515a;
        int iS2 = dVar.s(i12, dVar.getPaddingTop() + dVar.getPaddingBottom() + flexItem.G0() + flexItem.i1() + i13, flexItem.getHeight());
        int size = View.MeasureSpec.getSize(iS2);
        return size > flexItem.p3() ? View.MeasureSpec.makeMeasureSpec(flexItem.p3(), View.MeasureSpec.getMode(iS2)) : size < flexItem.k3() ? View.MeasureSpec.makeMeasureSpec(flexItem.k3(), View.MeasureSpec.getMode(iS2)) : iS2;
    }

    public final int n(int i12, FlexItem flexItem, int i13) {
        d dVar = this.f348515a;
        int iX2 = dVar.x(i12, dVar.getPaddingLeft() + dVar.getPaddingRight() + flexItem.c3() + flexItem.j3() + i13, flexItem.getWidth());
        int size = View.MeasureSpec.getSize(iX2);
        return size > flexItem.d0() ? View.MeasureSpec.makeMeasureSpec(flexItem.d0(), View.MeasureSpec.getMode(iX2)) : size < flexItem.z0() ? View.MeasureSpec.makeMeasureSpec(flexItem.z0(), View.MeasureSpec.getMode(iX2)) : iX2;
    }

    public final void o(View view, f fVar, int i12, int i13, int i14, int i15) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        d dVar = this.f348515a;
        int alignItems = dVar.getAlignItems();
        if (flexItem.R4() != -1) {
            alignItems = flexItem.R4();
        }
        int i16 = fVar.f348503g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (dVar.getFlexWrap() != 2) {
                    int i17 = i13 + i16;
                    view.layout(i12, (i17 - view.getMeasuredHeight()) - flexItem.i1(), i14, i17 - flexItem.i1());
                    return;
                } else {
                    view.layout(i12, view.getMeasuredHeight() + (i13 - i16) + flexItem.G0(), i14, view.getMeasuredHeight() + (i15 - i16) + flexItem.G0());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i16 - view.getMeasuredHeight()) + flexItem.G0()) - flexItem.i1()) / 2;
                if (dVar.getFlexWrap() != 2) {
                    int i18 = i13 + measuredHeight;
                    view.layout(i12, i18, i14, view.getMeasuredHeight() + i18);
                    return;
                } else {
                    int i19 = i13 - measuredHeight;
                    view.layout(i12, i19, i14, view.getMeasuredHeight() + i19);
                    return;
                }
            }
            if (alignItems == 3) {
                if (dVar.getFlexWrap() != 2) {
                    int iMax = Math.max(fVar.f348508l - view.getBaseline(), flexItem.G0());
                    view.layout(i12, i13 + iMax, i14, i15 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max(view.getBaseline() + (fVar.f348508l - view.getMeasuredHeight()), flexItem.i1());
                    view.layout(i12, i13 - iMax2, i14, i15 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (dVar.getFlexWrap() != 2) {
            view.layout(i12, i13 + flexItem.G0(), i14, i15 + flexItem.G0());
        } else {
            view.layout(i12, i13 - flexItem.i1(), i14, i15 - flexItem.i1());
        }
    }

    public final void p(View view, f fVar, boolean z12, int i12, int i13, int i14, int i15) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int alignItems = this.f348515a.getAlignItems();
        if (flexItem.R4() != -1) {
            alignItems = flexItem.R4();
        }
        int i16 = fVar.f348503g;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z12) {
                    view.layout(((i12 + i16) - view.getMeasuredWidth()) - flexItem.j3(), i13, ((i14 + i16) - view.getMeasuredWidth()) - flexItem.j3(), i15);
                    return;
                }
                view.layout(view.getMeasuredWidth() + (i12 - i16) + flexItem.c3(), i13, view.getMeasuredWidth() + (i14 - i16) + flexItem.c3(), i15);
                return;
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int marginStart = ((marginLayoutParams.getMarginStart() + (i16 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                if (z12) {
                    view.layout(i12 - marginStart, i13, i14 - marginStart, i15);
                    return;
                } else {
                    view.layout(i12 + marginStart, i13, i14 + marginStart, i15);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (z12) {
            view.layout(i12 - flexItem.j3(), i13, i14 - flexItem.j3(), i15);
        } else {
            view.layout(i12 + flexItem.c3(), i13, i14 + flexItem.c3(), i15);
        }
    }

    public final void q(int i12, int i13, f fVar, int i14, int i15, boolean z12) {
        int i16;
        int i17;
        int iMax;
        int i18;
        float f12;
        int i19;
        float f13;
        float f14;
        int i22 = fVar.f348501e;
        float f15 = fVar.f348507k;
        if (f15 <= 0.0f || i14 > i22) {
            return;
        }
        float f16 = (i22 - i14) / f15;
        fVar.f348501e = i15 + fVar.f348502f;
        if (!z12) {
            fVar.f348503g = BeduinInputModel.MIN_TEXT_VERSION;
        }
        int i23 = 0;
        boolean z13 = false;
        int i24 = 0;
        float f17 = 0.0f;
        while (i23 < fVar.f348504h) {
            int i25 = fVar.f348511o + i23;
            d dVar = this.f348515a;
            View viewU = dVar.u(i25);
            if (viewU == null || viewU.getVisibility() == 8) {
                i16 = i22;
                i17 = i23;
                iMax = i24;
                f17 = f17;
            } else {
                FlexItem flexItem = (FlexItem) viewU.getLayoutParams();
                int flexDirection = dVar.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i17 = i23;
                    int i26 = i24;
                    float f18 = f17;
                    int i27 = i22;
                    int measuredWidth = viewU.getMeasuredWidth();
                    long[] jArr = this.f348519e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i25];
                    }
                    int measuredHeight = viewU.getMeasuredHeight();
                    long[] jArr2 = this.f348519e;
                    if (jArr2 != null) {
                        i16 = i27;
                        measuredHeight = (int) (jArr2[i25] >> 32);
                    } else {
                        i16 = i27;
                    }
                    if (this.f348516b[i25] || flexItem.S1() <= 0.0f) {
                        f17 = f18;
                    } else {
                        float fS1 = measuredWidth - (flexItem.S1() * f16);
                        if (i17 == fVar.f348504h - 1) {
                            fS1 += f18;
                            f18 = 0.0f;
                        }
                        int iRound = Math.round(fS1);
                        if (iRound < flexItem.z0()) {
                            iRound = flexItem.z0();
                            this.f348516b[i25] = true;
                            fVar.f348507k -= flexItem.S1();
                            z13 = true;
                            f17 = f18;
                        } else {
                            float f19 = (fS1 - iRound) + f18;
                            double d12 = f19;
                            if (d12 > 1.0d) {
                                iRound++;
                                f19 -= 1.0f;
                            } else if (d12 < -1.0d) {
                                iRound--;
                                f19 += 1.0f;
                            }
                            f17 = f19;
                        }
                        int iM2 = m(i13, flexItem, fVar.f348509m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewU.measure(iMakeMeasureSpec, iM2);
                        int measuredWidth2 = viewU.getMeasuredWidth();
                        int measuredHeight2 = viewU.getMeasuredHeight();
                        v(i25, iMakeMeasureSpec, iM2, viewU);
                        dVar.d(viewU, i25);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i26, measuredHeight + flexItem.G0() + flexItem.i1() + dVar.e(viewU));
                    fVar.f348501e = measuredWidth + flexItem.c3() + flexItem.j3() + fVar.f348501e;
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewU.getMeasuredHeight();
                    long[] jArr3 = this.f348519e;
                    if (jArr3 != null) {
                        long j12 = jArr3[i25];
                        i18 = i24;
                        f12 = f17;
                        measuredHeight3 = (int) (j12 >> 32);
                    } else {
                        i18 = i24;
                        f12 = f17;
                    }
                    int measuredWidth3 = viewU.getMeasuredWidth();
                    long[] jArr4 = this.f348519e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i25];
                    }
                    if (this.f348516b[i25] || flexItem.S1() <= 0.0f) {
                        i19 = i22;
                        i17 = i23;
                    } else {
                        float fS12 = measuredHeight3 - (flexItem.S1() * f16);
                        if (i23 == fVar.f348504h - 1) {
                            fS12 += f12;
                            f13 = 0.0f;
                        } else {
                            f13 = f12;
                        }
                        int iRound2 = Math.round(fS12);
                        if (iRound2 < flexItem.k3()) {
                            iRound2 = flexItem.k3();
                            this.f348516b[i25] = true;
                            fVar.f348507k -= flexItem.S1();
                            i17 = i23;
                            f14 = f13;
                            z13 = true;
                            i19 = i22;
                        } else {
                            f14 = (fS12 - iRound2) + f13;
                            i19 = i22;
                            i17 = i23;
                            double d13 = f14;
                            if (d13 > 1.0d) {
                                iRound2++;
                                f14 -= 1.0f;
                            } else if (d13 < -1.0d) {
                                iRound2--;
                                f14 += 1.0f;
                            }
                        }
                        int iN2 = n(i12, flexItem, fVar.f348509m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewU.measure(iN2, iMakeMeasureSpec2);
                        int measuredWidth4 = viewU.getMeasuredWidth();
                        int measuredHeight4 = viewU.getMeasuredHeight();
                        v(i25, iN2, iMakeMeasureSpec2, viewU);
                        dVar.d(viewU, i25);
                        f12 = f14;
                        measuredWidth3 = measuredWidth4;
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i18, measuredWidth3 + flexItem.c3() + flexItem.j3() + dVar.e(viewU));
                    fVar.f348501e = measuredHeight3 + flexItem.G0() + flexItem.i1() + fVar.f348501e;
                    i16 = i19;
                    f17 = f12;
                }
                fVar.f348503g = Math.max(fVar.f348503g, iMax);
            }
            i23 = i17 + 1;
            i24 = iMax;
            i22 = i16;
        }
        int i28 = i22;
        if (!z13 || i28 == fVar.f348501e) {
            return;
        }
        q(i12, i13, fVar, i14, i15, true);
    }

    public final void s(View view, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iC3 = (i12 - flexItem.c3()) - flexItem.j3();
        d dVar = this.f348515a;
        int iMin = Math.min(Math.max(iC3 - dVar.e(view), flexItem.z0()), flexItem.d0());
        long[] jArr = this.f348519e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i13] >> 32) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        v(i13, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        dVar.d(view, i13);
    }

    public final void t(View view, int i12, int i13) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int iG02 = (i12 - flexItem.G0()) - flexItem.i1();
        d dVar = this.f348515a;
        int iMin = Math.min(Math.max(iG02 - dVar.e(view), flexItem.k3()), flexItem.p3());
        long[] jArr = this.f348519e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i13] : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        v(i13, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        dVar.d(view, i13);
    }

    public final void u(int i12) {
        View viewU;
        d dVar = this.f348515a;
        if (i12 >= dVar.getFlexItemCount()) {
            return;
        }
        int flexDirection = dVar.getFlexDirection();
        if (dVar.getAlignItems() != 4) {
            for (f fVar : dVar.getFlexLinesInternal()) {
                Iterator it = fVar.f348510n.iterator();
                while (it.hasNext()) {
                    Integer num = (Integer) it.next();
                    View viewU2 = dVar.u(num.intValue());
                    if (flexDirection == 0 || flexDirection == 1) {
                        t(viewU2, fVar.f348503g, num.intValue());
                    } else {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException(AK.c.g(flexDirection, "Invalid flex direction: "));
                        }
                        s(viewU2, fVar.f348503g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f348517c;
        List<f> flexLinesInternal = dVar.getFlexLinesInternal();
        int size = flexLinesInternal.size();
        for (int i13 = iArr != null ? iArr[i12] : 0; i13 < size; i13++) {
            f fVar2 = flexLinesInternal.get(i13);
            int i14 = fVar2.f348504h;
            for (int i15 = 0; i15 < i14; i15++) {
                int i16 = fVar2.f348511o + i15;
                if (i15 < dVar.getFlexItemCount() && (viewU = dVar.u(i16)) != null && viewU.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) viewU.getLayoutParams();
                    if (flexItem.R4() == -1 || flexItem.R4() == 4) {
                        if (flexDirection == 0 || flexDirection == 1) {
                            t(viewU, fVar2.f348503g, i16);
                        } else {
                            if (flexDirection != 2 && flexDirection != 3) {
                                throw new IllegalArgumentException(AK.c.g(flexDirection, "Invalid flex direction: "));
                            }
                            s(viewU, fVar2.f348503g, i16);
                        }
                    }
                }
            }
        }
    }

    public final void v(int i12, int i13, int i14, View view) {
        long[] jArr = this.f348518d;
        if (jArr != null) {
            jArr[i12] = (i13 & 4294967295L) | (i14 << 32);
        }
        long[] jArr2 = this.f348519e;
        if (jArr2 != null) {
            jArr2[i12] = (view.getMeasuredWidth() & 4294967295L) | (view.getMeasuredHeight() << 32);
        }
    }
}
