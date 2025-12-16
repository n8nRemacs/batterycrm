package com.yandex.div.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.div.internal.widget.d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import q21.e;

/* compiled from: GridContainer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0011\u0018\u00002\u00020\u0001:\u0007\u0014\u0015\u0004\u0016\u0017\u0018\u0019R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\r\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/core/widget/l;", "Lcom/yandex/div/internal/widget/d;", "", "value", "c", "I", "getGravity", "()I", "setGravity", "(I)V", "gravity", "getColumnCount", "setColumnCount", "columnCount", "getRowCount", "rowCount", "getPaddingHorizontal", "paddingHorizontal", "getPaddingVertical", "paddingVertical", "a", "b", "d", "e", "f", "g", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SuppressLint({"RtlHardcoded"})
/* loaded from: classes7.dex */
public class l extends com.yandex.div.internal.widget.d {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int gravity;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final d f369259d;

    /* renamed from: e, reason: collision with root package name */
    public int f369260e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f369261f;

    /* compiled from: GridContainer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/widget/l$a;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f369262a;

        /* renamed from: b, reason: collision with root package name */
        public final int f369263b;

        /* renamed from: c, reason: collision with root package name */
        public final int f369264c;

        /* renamed from: d, reason: collision with root package name */
        public final int f369265d;

        /* renamed from: e, reason: collision with root package name */
        public int f369266e;

        public a(int i12, int i13, int i14, int i15, int i16) {
            this.f369262a = i12;
            this.f369263b = i13;
            this.f369264c = i14;
            this.f369265d = i15;
            this.f369266e = i16;
        }
    }

    /* compiled from: GridContainer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/widget/l$b;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f369267a;

        /* renamed from: b, reason: collision with root package name */
        public final int f369268b;

        /* renamed from: c, reason: collision with root package name */
        public final int f369269c;

        /* renamed from: d, reason: collision with root package name */
        public final int f369270d;

        /* renamed from: e, reason: collision with root package name */
        public final int f369271e;

        public b(int i12, int i13, int i14, int i15, int i16, float f12) {
            this.f369267a = i12;
            this.f369268b = i13;
            this.f369269c = i14;
            this.f369270d = i15;
            this.f369271e = i16;
        }

        public final int a() {
            return this.f369268b + this.f369269c + this.f369270d;
        }
    }

    /* compiled from: GridContainer.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/yandex/div/core/widget/l$c;", "", "<init>", "()V", "", "DEFAULT_COLUMN_COUNT", "I", "MAX_SIZE", "", "TAG", "Ljava/lang/String;", "UNINITIALIZED_HASH", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: GridContainer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/widget/l$d;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class d {

        /* renamed from: a, reason: collision with root package name */
        public int f369272a = 1;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C<List<a>> f369273b = new C<>(new a());

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final C<List<e>> f369274c = new C<>(new b());

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final C<List<e>> f369275d = new C<>(new c());

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final f f369276e = new f(0, 0, 3, null);

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final f f369277f = new f(0, 0, 3, null);

        /* compiled from: GridContainer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/yandex/div/core/widget/l$a;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends N implements Y41.a<List<? extends a>> {
            public a() {
                super(0);
            }

            @Override // Y41.a
            public final List<? extends a> invoke() {
                int i12;
                Integer numValueOf;
                d dVar = d.this;
                l lVar = l.this;
                if (lVar.getChildCount() == 0) {
                    return C42784z0.f406748b;
                }
                int i13 = dVar.f369272a;
                ArrayList arrayList = new ArrayList(lVar.getChildCount());
                int[] iArr = new int[i13];
                int[] iArr2 = new int[i13];
                int childCount = lVar.getChildCount();
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                while (i16 < childCount) {
                    int i17 = i16 + 1;
                    View childAt = lVar.getChildAt(i16);
                    if (childAt.getVisibility() == 8) {
                        i16 = i17;
                    } else {
                        Integer numV = C42756l.V(iArr2);
                        int iIntValue = numV == null ? i14 : numV.intValue();
                        int iG2 = C42756l.G(iIntValue, iArr2);
                        int i18 = i15 + iIntValue;
                        kotlin.ranges.l lVarR = kotlin.ranges.s.r(i14, i13);
                        int i19 = lVarR.f406905b;
                        int i22 = lVarR.f406906c;
                        if (i19 <= i22) {
                            while (true) {
                                int i23 = i19 + 1;
                                iArr2[i19] = Math.max(i14, iArr2[i19] - iIntValue);
                                if (i19 == i22) {
                                    break;
                                }
                                i19 = i23;
                            }
                        }
                        d.a aVar = com.yandex.div.internal.widget.d.f370251b;
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                        }
                        com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
                        int iMin = Math.min(cVar.f370247e, i13 - iG2);
                        int i24 = cVar.f370248f;
                        arrayList.add(new a(i16, iG2, i18, iMin, i24));
                        int i25 = iG2 + iMin;
                        while (true) {
                            int i26 = iG2;
                            if (i26 >= i25) {
                                break;
                            }
                            iG2 = i26 + 1;
                            if (iArr2[i26] > 0) {
                                a aVar2 = (a) arrayList.get(iArr[i26]);
                                int i27 = aVar2.f369263b;
                                int i28 = aVar2.f369265d + i27;
                                while (i27 < i28) {
                                    int i29 = iArr2[i27];
                                    iArr2[i27] = 0;
                                    i27++;
                                }
                                aVar2.f369266e = i18 - aVar2.f369264c;
                            }
                            iArr[i26] = i16;
                            iArr2[i26] = i24;
                        }
                        i16 = i17;
                        i15 = i18;
                        i14 = 0;
                    }
                }
                if (i13 == 0) {
                    numValueOf = null;
                    i12 = 0;
                } else {
                    i12 = 0;
                    int i32 = iArr2[0];
                    int i33 = i13 - 1;
                    if (i33 == 0) {
                        numValueOf = Integer.valueOf(i32);
                    } else {
                        int iMax = Math.max(1, i32);
                        if (1 <= i33) {
                            int i34 = 1;
                            while (true) {
                                int i35 = i34 + 1;
                                int i36 = iArr2[i34];
                                int iMax2 = Math.max(1, i36);
                                if (iMax > iMax2) {
                                    i32 = i36;
                                    iMax = iMax2;
                                }
                                if (i34 == i33) {
                                    break;
                                }
                                i34 = i35;
                            }
                        }
                        numValueOf = Integer.valueOf(i32);
                    }
                }
                int iIntValue2 = ((a) C42745f0.Q(arrayList)).f369264c + (numValueOf == null ? 1 : numValueOf.intValue());
                int size = arrayList.size();
                while (true) {
                    int i37 = i12;
                    if (i37 >= size) {
                        return arrayList;
                    }
                    i12 = i37 + 1;
                    a aVar3 = (a) arrayList.get(i37);
                    int i38 = aVar3.f369264c;
                    if (aVar3.f369266e + i38 > iIntValue2) {
                        aVar3.f369266e = iIntValue2 - i38;
                    }
                }
            }
        }

        /* compiled from: GridContainer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/yandex/div/core/widget/l$e;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends N implements Y41.a<List<? extends e>> {
            public b() {
                super(0);
            }

            @Override // Y41.a
            public final List<? extends e> invoke() {
                float f12;
                float f13;
                int i12;
                int i13 = 1;
                d dVar = d.this;
                int i14 = dVar.f369272a;
                List<a> listA = dVar.f369273b.a();
                ArrayList arrayList = new ArrayList(i14);
                int i15 = 0;
                while (i15 < i14) {
                    i15++;
                    arrayList.add(new e());
                }
                int size = listA.size();
                int i16 = 0;
                while (true) {
                    l lVar = l.this;
                    if (i16 >= size) {
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = listA.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            int i18 = i17 + 1;
                            a aVar = listA.get(i17);
                            View childAt = lVar.getChildAt(aVar.f369262a);
                            d.a aVar2 = com.yandex.div.internal.widget.d.f370251b;
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                            }
                            com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
                            int measuredWidth = childAt.getMeasuredWidth();
                            int i19 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                            int i22 = ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                            float f14 = cVar.f370246d;
                            int i23 = aVar.f369265d;
                            b bVar = new b(aVar.f369263b, measuredWidth, i19, i22, i23, f14);
                            if (i23 > 1) {
                                arrayList2.add(bVar);
                            }
                            i17 = i18;
                        }
                        C42745f0.z0(arrayList2, g.f369287b);
                        int size3 = arrayList2.size();
                        int i24 = 0;
                        while (i24 < size3) {
                            int i25 = i24 + 1;
                            b bVar2 = (b) arrayList2.get(i24);
                            int i26 = bVar2.f369267a;
                            int i27 = bVar2.f369271e;
                            int i28 = (i26 + i27) - i13;
                            int iA2 = bVar2.a();
                            int i29 = iA2;
                            if (i26 <= i28) {
                                int i32 = i26;
                                f13 = 0.0f;
                                i12 = 0;
                                while (true) {
                                    int i33 = i32 + 1;
                                    e eVar = (e) arrayList.get(i32);
                                    iA2 -= eVar.f369283b;
                                    if (eVar.b()) {
                                        f13 += eVar.f369284c;
                                    } else {
                                        int i34 = eVar.f369283b;
                                        if (i34 == 0) {
                                            i12++;
                                        }
                                        i29 -= i34;
                                    }
                                    if (i32 == i28) {
                                        break;
                                    }
                                    i32 = i33;
                                }
                                f12 = 0.0f;
                            } else {
                                f12 = 0.0f;
                                f13 = 0.0f;
                                i12 = 0;
                            }
                            if (f13 > f12) {
                                if (i26 <= i28) {
                                    while (true) {
                                        int i35 = i26 + 1;
                                        e eVar2 = (e) arrayList.get(i26);
                                        if (eVar2.b()) {
                                            e.a(eVar2, (int) Math.ceil((eVar2.f369284c / f13) * i29), 0.0f, 2);
                                        }
                                        if (i26 == i28) {
                                            break;
                                        }
                                        i26 = i35;
                                    }
                                }
                            } else if (iA2 > 0 && i26 <= i28) {
                                while (true) {
                                    int i36 = i26 + 1;
                                    e eVar3 = (e) arrayList.get(i26);
                                    if (i12 <= 0) {
                                        e.a(eVar3, (iA2 / i27) + eVar3.f369283b, 0.0f, 2);
                                    } else if (eVar3.f369283b == 0 && !eVar3.b()) {
                                        e.a(eVar3, (iA2 / i12) + eVar3.f369283b, 0.0f, 2);
                                    }
                                    if (i26 == i28) {
                                        break;
                                    }
                                    i26 = i36;
                                }
                            }
                            i24 = i25;
                            i13 = 1;
                        }
                        d.a(arrayList, dVar.f369276e);
                        int size4 = arrayList.size();
                        int i37 = 0;
                        for (int i38 = 0; i38 < size4; i38++) {
                            e eVar4 = (e) arrayList.get(i38);
                            eVar4.f369282a = i37;
                            i37 += eVar4.f369283b;
                        }
                        return arrayList;
                    }
                    int i39 = i16 + 1;
                    a aVar3 = listA.get(i16);
                    View childAt2 = lVar.getChildAt(aVar3.f369262a);
                    d.a aVar4 = com.yandex.div.internal.widget.d.f370251b;
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    }
                    com.yandex.div.internal.widget.c cVar2 = (com.yandex.div.internal.widget.c) layoutParams2;
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int i42 = ((ViewGroup.MarginLayoutParams) cVar2).leftMargin;
                    int i43 = ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    float f15 = cVar2.f370246d;
                    int i44 = aVar3.f369265d;
                    int i45 = aVar3.f369263b;
                    b bVar3 = new b(i45, measuredWidth2, i42, i43, i44, f15);
                    if (i44 == 1) {
                        e eVar5 = (e) arrayList.get(i45);
                        eVar5.f369283b = Math.max(eVar5.f369283b, bVar3.a());
                        eVar5.f369284c = Math.max(eVar5.f369284c, f15);
                    } else {
                        int i46 = i44 - 1;
                        float f16 = f15 / i44;
                        if (i46 >= 0) {
                            int i47 = 0;
                            while (true) {
                                int i48 = i47 + 1;
                                e.a((e) arrayList.get(bVar3.f369267a + i47), 0, f16, 1);
                                if (i47 == i46) {
                                    break;
                                }
                                i47 = i48;
                            }
                        }
                    }
                    i16 = i39;
                }
            }
        }

        /* compiled from: GridContainer.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/yandex/div/core/widget/l$e;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends N implements Y41.a<List<? extends e>> {
            public c() {
                super(0);
            }

            @Override // Y41.a
            public final List<? extends e> invoke() {
                int i12;
                float f12;
                float f13;
                int i13;
                int i14 = 1;
                d dVar = d.this;
                List<a> listA = dVar.f369273b.a();
                if (listA.isEmpty()) {
                    i12 = 0;
                } else {
                    a aVar = (a) C42745f0.Q(listA);
                    i12 = aVar.f369264c + aVar.f369266e;
                }
                List<a> listA2 = dVar.f369273b.a();
                ArrayList arrayList = new ArrayList(i12);
                int i15 = 0;
                while (i15 < i12) {
                    i15++;
                    arrayList.add(new e());
                }
                int size = listA2.size();
                int i16 = 0;
                while (true) {
                    l lVar = l.this;
                    if (i16 >= size) {
                        ArrayList arrayList2 = new ArrayList();
                        int size2 = listA2.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            int i18 = i17 + 1;
                            a aVar2 = listA2.get(i17);
                            View childAt = lVar.getChildAt(aVar2.f369262a);
                            d.a aVar3 = com.yandex.div.internal.widget.d.f370251b;
                            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                            if (layoutParams == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                            }
                            com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i19 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                            int i22 = ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
                            int i23 = aVar2.f369266e;
                            b bVar = new b(aVar2.f369264c, measuredHeight, i19, i22, i23, cVar.f370245c);
                            if (i23 > 1) {
                                arrayList2.add(bVar);
                            }
                            i17 = i18;
                        }
                        C42745f0.z0(arrayList2, g.f369287b);
                        int size3 = arrayList2.size();
                        int i24 = 0;
                        while (i24 < size3) {
                            int i25 = i24 + 1;
                            b bVar2 = (b) arrayList2.get(i24);
                            int i26 = bVar2.f369267a;
                            int i27 = bVar2.f369271e;
                            int i28 = (i26 + i27) - i14;
                            int iA2 = bVar2.a();
                            int i29 = iA2;
                            if (i26 <= i28) {
                                int i32 = i26;
                                f13 = 0.0f;
                                i13 = 0;
                                while (true) {
                                    int i33 = i32 + 1;
                                    e eVar = (e) arrayList.get(i32);
                                    iA2 -= eVar.f369283b;
                                    if (eVar.b()) {
                                        f13 += eVar.f369284c;
                                    } else {
                                        int i34 = eVar.f369283b;
                                        if (i34 == 0) {
                                            i13++;
                                        }
                                        i29 -= i34;
                                    }
                                    if (i32 == i28) {
                                        break;
                                    }
                                    i32 = i33;
                                }
                                f12 = 0.0f;
                            } else {
                                f12 = 0.0f;
                                f13 = 0.0f;
                                i13 = 0;
                            }
                            if (f13 > f12) {
                                if (i26 <= i28) {
                                    while (true) {
                                        int i35 = i26 + 1;
                                        e eVar2 = (e) arrayList.get(i26);
                                        if (eVar2.b()) {
                                            e.a(eVar2, (int) Math.ceil((eVar2.f369284c / f13) * i29), 0.0f, 2);
                                        }
                                        if (i26 == i28) {
                                            break;
                                        }
                                        i26 = i35;
                                    }
                                }
                            } else if (iA2 > 0 && i26 <= i28) {
                                while (true) {
                                    int i36 = i26 + 1;
                                    e eVar3 = (e) arrayList.get(i26);
                                    if (i13 <= 0) {
                                        e.a(eVar3, (iA2 / i27) + eVar3.f369283b, 0.0f, 2);
                                    } else if (eVar3.f369283b == 0 && !eVar3.b()) {
                                        e.a(eVar3, (iA2 / i13) + eVar3.f369283b, 0.0f, 2);
                                    }
                                    if (i26 == i28) {
                                        break;
                                    }
                                    i26 = i36;
                                }
                            }
                            i24 = i25;
                            i14 = 1;
                        }
                        d.a(arrayList, dVar.f369277f);
                        int size4 = arrayList.size();
                        int i37 = 0;
                        for (int i38 = 0; i38 < size4; i38++) {
                            e eVar4 = (e) arrayList.get(i38);
                            eVar4.f369282a = i37;
                            i37 += eVar4.f369283b;
                        }
                        return arrayList;
                    }
                    int i39 = i16 + 1;
                    a aVar4 = listA2.get(i16);
                    View childAt2 = lVar.getChildAt(aVar4.f369262a);
                    d.a aVar5 = com.yandex.div.internal.widget.d.f370251b;
                    ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    }
                    com.yandex.div.internal.widget.c cVar2 = (com.yandex.div.internal.widget.c) layoutParams2;
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    int i42 = ((ViewGroup.MarginLayoutParams) cVar2).topMargin;
                    int i43 = ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin;
                    int i44 = aVar4.f369266e;
                    float f14 = cVar2.f370245c;
                    int i45 = aVar4.f369264c;
                    b bVar3 = new b(i45, measuredHeight2, i42, i43, i44, f14);
                    if (i44 == 1) {
                        e eVar5 = (e) arrayList.get(i45);
                        eVar5.f369283b = Math.max(eVar5.f369283b, bVar3.a());
                        eVar5.f369284c = Math.max(eVar5.f369284c, f14);
                    } else {
                        int i46 = i44 - 1;
                        float f15 = f14 / i44;
                        if (i46 >= 0) {
                            int i47 = 0;
                            while (true) {
                                int i48 = i47 + 1;
                                e.a((e) arrayList.get(bVar3.f369267a + i47), 0, f15, 1);
                                if (i47 == i46) {
                                    break;
                                }
                                i47 = i48;
                            }
                        }
                    }
                    i16 = i39;
                }
            }
        }

        public d() {
        }

        public static void a(ArrayList arrayList, f fVar) {
            int size = arrayList.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            float f12 = 0.0f;
            float fMax = 0.0f;
            while (i13 < size) {
                int i15 = i13 + 1;
                e eVar = (e) arrayList.get(i13);
                if (eVar.b()) {
                    float f13 = eVar.f369284c;
                    f12 += f13;
                    fMax = Math.max(fMax, eVar.f369283b / f13);
                } else {
                    i14 += eVar.f369283b;
                }
                i13 = i15;
            }
            int size2 = arrayList.size();
            int i16 = 0;
            int iCeil = 0;
            while (i16 < size2) {
                int i17 = i16 + 1;
                e eVar2 = (e) arrayList.get(i16);
                iCeil += eVar2.b() ? (int) Math.ceil(eVar2.f369284c * fMax) : eVar2.f369283b;
                i16 = i17;
            }
            float fMax2 = Math.max(0, Math.max(fVar.f369285a, iCeil) - i14) / f12;
            int size3 = arrayList.size();
            while (i12 < size3) {
                int i18 = i12 + 1;
                e eVar3 = (e) arrayList.get(i12);
                if (eVar3.b()) {
                    e.a(eVar3, (int) Math.ceil(eVar3.f369284c * fMax2), 0.0f, 2);
                }
                i12 = i18;
            }
        }

        public static int b(List list) {
            if (list.isEmpty()) {
                return 0;
            }
            e eVar = (e) C42745f0.Q(list);
            return eVar.f369282a + eVar.f369283b;
        }
    }

    /* compiled from: GridContainer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/widget/l$e;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public int f369282a;

        /* renamed from: b, reason: collision with root package name */
        public int f369283b;

        /* renamed from: c, reason: collision with root package name */
        public float f369284c;

        public static void a(e eVar, int i12, float f12, int i13) {
            if ((i13 & 1) != 0) {
                i12 = 0;
            }
            if ((i13 & 2) != 0) {
                f12 = 0.0f;
            }
            eVar.f369283b = Math.max(eVar.f369283b, i12);
            eVar.f369284c = Math.max(eVar.f369284c, f12);
        }

        public final boolean b() {
            return this.f369284c > 0.0f;
        }
    }

    /* compiled from: GridContainer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/widget/l$f;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public int f369285a;

        /* renamed from: b, reason: collision with root package name */
        public int f369286b;

        public f() {
            this(0, 0, 3, null);
        }

        public final void a(int i12) {
            int mode = View.MeasureSpec.getMode(i12);
            int size = View.MeasureSpec.getSize(i12);
            if (mode == Integer.MIN_VALUE) {
                this.f369285a = 0;
                this.f369286b = size;
            } else if (mode == 0) {
                this.f369285a = 0;
                this.f369286b = 32768;
            } else {
                if (mode != 1073741824) {
                    return;
                }
                this.f369285a = size;
                this.f369286b = size;
            }
        }

        public f(int i12, int i13, int i14, C42822w c42822w) {
            i12 = (i14 & 1) != 0 ? 0 : i12;
            i13 = (i14 & 2) != 0 ? 32768 : i13;
            this.f369285a = i12;
            this.f369286b = i13;
        }
    }

    /* compiled from: GridContainer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/div/core/widget/l$g;", "Ljava/util/Comparator;", "Lcom/yandex/div/core/widget/l$b;", "Lkotlin/Comparator;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class g implements Comparator<b> {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final g f369287b = new g();

        @Override // java.util.Comparator
        public final int compare(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            int iA2 = bVar3.a();
            int i12 = bVar3.f369271e;
            int i13 = iA2 / i12;
            int iA3 = bVar4.a();
            int i14 = bVar4.f369271e;
            if (i13 < iA3 / i14) {
                return 1;
            }
            return bVar3.a() / i12 > bVar4.a() / i14 ? -1 : 0;
        }
    }

    static {
        new c(null);
    }

    public /* synthetic */ l(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    private final int getPaddingHorizontal() {
        return getPaddingRight() + getPaddingLeft();
    }

    private final int getPaddingVertical() {
        return getPaddingBottom() + getPaddingTop();
    }

    public static void i(View view, int i12, int i13, int i14, int i15, int i16, int i17) {
        int iA2;
        int iA3;
        d.a aVar = com.yandex.div.internal.widget.d.f370251b;
        if (i14 == -1) {
            iA2 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
        } else {
            int minimumWidth = view.getMinimumWidth();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            }
            int i18 = ((com.yandex.div.internal.widget.c) layoutParams).f370250h;
            aVar.getClass();
            iA2 = d.a.a(i12, 0, i14, minimumWidth, i18);
        }
        if (i15 == -1) {
            iA3 = View.MeasureSpec.makeMeasureSpec(i17, 1073741824);
        } else {
            int minimumHeight = view.getMinimumHeight();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            }
            int i19 = ((com.yandex.div.internal.widget.c) layoutParams2).f370249g;
            aVar.getClass();
            iA3 = d.a.a(i13, 0, i15, minimumHeight, i19);
        }
        view.measure(iA2, iA3);
    }

    public final void f() {
        int i12 = this.f369260e;
        int i13 = 0;
        if (i12 != 0) {
            if (i12 != h()) {
                this.f369260e = 0;
                d dVar = this.f369259d;
                dVar.f369273b.f369241b = null;
                dVar.f369274c.f369241b = null;
                dVar.f369275d.f369241b = null;
                f();
                return;
            }
            return;
        }
        int childCount = getChildCount();
        while (i13 < childCount) {
            int i14 = i13 + 1;
            ViewGroup.LayoutParams layoutParams = getChildAt(i13).getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            }
            com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
            if (cVar.f370247e < 0 || cVar.f370248f < 0) {
                throw new IllegalStateException("Negative spans are not supported.");
            }
            if (cVar.f370246d < 0.0f || cVar.f370245c < 0.0f) {
                throw new IllegalStateException("Negative weights are not supported.");
            }
            i13 = i14;
        }
        this.f369260e = h();
    }

    public final int getColumnCount() {
        return this.f369259d.f369272a;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getRowCount() {
        List<a> listA = this.f369259d.f369273b.a();
        if (listA.isEmpty()) {
            return 0;
        }
        a aVar = (a) C42745f0.Q(listA);
        return aVar.f369266e + aVar.f369264c;
    }

    public final int h() {
        int childCount = getChildCount();
        int iHashCode = 223;
        int i12 = 0;
        while (i12 < childCount) {
            int i13 = i12 + 1;
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int i14 = iHashCode * 31;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                }
                iHashCode = i14 + ((com.yandex.div.internal.widget.c) layoutParams).hashCode();
            }
            i12 = i13;
        }
        return iHashCode;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        char c12;
        char c13;
        char c14;
        char c15;
        l lVar = this;
        int i16 = 1;
        SystemClock.elapsedRealtime();
        f();
        d dVar = lVar.f369259d;
        List<e> listA = dVar.f369274c.a();
        C<List<e>> c16 = dVar.f369275d;
        List<e> listA2 = c16.a();
        List<a> listA3 = dVar.f369273b.a();
        int i17 = lVar.gravity & 7;
        C<List<e>> c17 = dVar.f369274c;
        int i18 = 0;
        int iB2 = c17.f369241b != null ? d.b(c17.a()) : 0;
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        char c18 = 5;
        char c19 = 2;
        int paddingLeft = i17 != 1 ? i17 != 5 ? getPaddingLeft() : (getPaddingLeft() + measuredWidth) - iB2 : androidx.appcompat.app.r.f(measuredWidth, iB2, 2, getPaddingLeft());
        int i19 = lVar.gravity & 112;
        int iB3 = c16.f369241b != null ? d.b(c16.a()) : 0;
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        char c22 = 16;
        int paddingTop = i19 != 16 ? i19 != 80 ? getPaddingTop() : (getPaddingTop() + measuredHeight) - iB3 : androidx.appcompat.app.r.f(measuredHeight, iB3, 2, getPaddingTop());
        int childCount = getChildCount();
        while (i18 < childCount) {
            int i22 = i18 + 1;
            View childAt = lVar.getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                c12 = c18;
                c14 = c19;
                c13 = c22;
                c15 = 'P';
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                }
                com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
                a aVar = listA3.get(i18);
                int iF2 = listA.get(aVar.f369263b).f369282a + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                int i23 = aVar.f369264c;
                int iF3 = listA2.get(i23).f369282a + ((ViewGroup.MarginLayoutParams) cVar).topMargin;
                e eVar = listA.get((aVar.f369263b + aVar.f369265d) - i16);
                int i24 = ((eVar.f369282a + eVar.f369283b) - iF2) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                e eVar2 = listA2.get((i23 + aVar.f369266e) - i16);
                int i25 = ((eVar2.f369282a + eVar2.f369283b) - iF3) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin;
                int measuredWidth2 = childAt.getMeasuredWidth();
                int i26 = cVar.f370243a & 7;
                if (i26 != i16) {
                    c12 = 5;
                    if (i26 == 5) {
                        iF2 = (iF2 + i24) - measuredWidth2;
                    }
                } else {
                    c12 = 5;
                    iF2 = androidx.appcompat.app.r.f(i24, measuredWidth2, 2, iF2);
                }
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i27 = cVar.f370243a & 112;
                c13 = 16;
                if (i27 != 16) {
                    c15 = 'P';
                    if (i27 == 80) {
                        iF3 = (iF3 + i25) - measuredHeight2;
                    }
                    c14 = 2;
                } else {
                    c14 = 2;
                    c15 = 'P';
                    iF3 = androidx.appcompat.app.r.f(i25, measuredHeight2, 2, iF3);
                }
                int i28 = iF2 + paddingLeft;
                int i29 = iF3 + paddingTop;
                childAt.layout(i28, i29, childAt.getMeasuredWidth() + i28, childAt.getMeasuredHeight() + i29);
            }
            lVar = this;
            i18 = i22;
            c19 = c14;
            c18 = c12;
            i16 = 1;
            c22 = c13;
        }
        SystemClock.elapsedRealtime();
        int i32 = com.yandex.div.internal.p.f370124a;
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14;
        List<a> list;
        List<e> list2;
        List<a> list3;
        C<List<a>> c12;
        int i15;
        String str;
        int i16;
        SystemClock.elapsedRealtime();
        f();
        d dVar = this.f369259d;
        dVar.f369274c.f369241b = null;
        dVar.f369275d.f369241b = null;
        int paddingHorizontal = getPaddingHorizontal();
        int paddingVertical = getPaddingVertical();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12 - paddingHorizontal), View.MeasureSpec.getMode(i12));
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i13 - paddingVertical), View.MeasureSpec.getMode(i13));
        int childCount = getChildCount();
        int i17 = 0;
        while (true) {
            String str2 = "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams";
            int i18 = 8;
            if (i17 >= childCount) {
                f fVar = dVar.f369276e;
                fVar.a(iMakeMeasureSpec);
                int i19 = fVar.f369285a;
                C<List<e>> c13 = dVar.f369274c;
                int iMax = Math.max(i19, Math.min(d.b(c13.a()), fVar.f369286b));
                C<List<a>> c14 = dVar.f369273b;
                List<a> listA = c14.a();
                List<e> listA2 = c13.a();
                int childCount2 = getChildCount();
                int i22 = 0;
                while (i22 < childCount2) {
                    int i23 = i22 + 1;
                    View childAt = getChildAt(i22);
                    int i24 = childCount2;
                    if (childAt.getVisibility() == i18) {
                        list2 = listA2;
                        list3 = listA;
                        c12 = c14;
                        i15 = i18;
                        str = str2;
                    } else {
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        if (layoutParams == null) {
                            throw new NullPointerException(str2);
                        }
                        com.yandex.div.internal.widget.c cVar = (com.yandex.div.internal.widget.c) layoutParams;
                        if (((ViewGroup.MarginLayoutParams) cVar).width != -1) {
                            list2 = listA2;
                            list3 = listA;
                            c12 = c14;
                            str = str2;
                            i15 = 8;
                        } else {
                            a aVar = listA.get(i22);
                            e eVar = listA2.get((aVar.f369263b + aVar.f369265d) - 1);
                            int iA2 = ((eVar.f369282a + eVar.f369283b) - listA2.get(aVar.f369263b).f369282a) - cVar.a();
                            list2 = listA2;
                            list3 = listA;
                            c12 = c14;
                            i15 = 8;
                            str = str2;
                            i(childAt, iMakeMeasureSpec, iMakeMeasureSpec2, ((ViewGroup.MarginLayoutParams) cVar).width, ((ViewGroup.MarginLayoutParams) cVar).height, iA2, 0);
                        }
                    }
                    i18 = i15;
                    str2 = str;
                    i22 = i23;
                    listA2 = list2;
                    childCount2 = i24;
                    listA = list3;
                    c14 = c12;
                }
                int i25 = i18;
                String str3 = str2;
                f fVar2 = dVar.f369277f;
                fVar2.a(iMakeMeasureSpec2);
                int i26 = fVar2.f369285a;
                C<List<e>> c15 = dVar.f369275d;
                int iMax2 = Math.max(i26, Math.min(d.b(c15.a()), fVar2.f369286b));
                List<a> listA3 = c14.a();
                List<e> listA4 = c13.a();
                List<e> listA5 = c15.a();
                int childCount3 = getChildCount();
                int i27 = 0;
                while (i27 < childCount3) {
                    int i28 = i27 + 1;
                    View childAt2 = getChildAt(i27);
                    if (childAt2.getVisibility() == i25) {
                        i14 = childCount3;
                        list = listA3;
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                        if (layoutParams2 == null) {
                            throw new NullPointerException(str3);
                        }
                        com.yandex.div.internal.widget.c cVar2 = (com.yandex.div.internal.widget.c) layoutParams2;
                        if (((ViewGroup.MarginLayoutParams) cVar2).height != -1) {
                            i14 = childCount3;
                            list = listA3;
                        } else {
                            a aVar2 = listA3.get(i27);
                            e eVar2 = listA4.get((aVar2.f369263b + aVar2.f369265d) - 1);
                            int iA3 = ((eVar2.f369282a + eVar2.f369283b) - listA4.get(aVar2.f369263b).f369282a) - cVar2.a();
                            int i29 = aVar2.f369266e;
                            int i32 = aVar2.f369264c;
                            e eVar3 = listA5.get((i29 + i32) - 1);
                            i14 = childCount3;
                            list = listA3;
                            i(childAt2, iMakeMeasureSpec, iMakeMeasureSpec2, ((ViewGroup.MarginLayoutParams) cVar2).width, ((ViewGroup.MarginLayoutParams) cVar2).height, iA3, ((eVar3.f369282a + eVar3.f369283b) - listA5.get(i32).f369282a) - cVar2.b());
                        }
                    }
                    listA3 = list;
                    i27 = i28;
                    childCount3 = i14;
                    i25 = 8;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + paddingHorizontal, getSuggestedMinimumWidth()), i12, 0), View.resolveSizeAndState(Math.max(iMax2 + paddingVertical, getSuggestedMinimumHeight()), i13, 0));
                SystemClock.elapsedRealtime();
                int i33 = com.yandex.div.internal.p.f370124a;
                return;
            }
            int i34 = i17 + 1;
            View childAt3 = getChildAt(i17);
            if (childAt3.getVisibility() == 8) {
                i16 = childCount;
            } else {
                ViewGroup.LayoutParams layoutParams3 = childAt3.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                }
                com.yandex.div.internal.widget.c cVar3 = (com.yandex.div.internal.widget.c) layoutParams3;
                int i35 = ((ViewGroup.MarginLayoutParams) cVar3).width;
                if (i35 == -1) {
                    i35 = 0;
                }
                int i36 = ((ViewGroup.MarginLayoutParams) cVar3).height;
                if (i36 == -1) {
                    i36 = 0;
                }
                int minimumWidth = childAt3.getMinimumWidth();
                ViewGroup.LayoutParams layoutParams4 = childAt3.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                }
                int i37 = ((com.yandex.div.internal.widget.c) layoutParams4).f370250h;
                com.yandex.div.internal.widget.d.f370251b.getClass();
                i16 = childCount;
                int iA4 = d.a.a(iMakeMeasureSpec, 0, i35, minimumWidth, i37);
                int minimumHeight = childAt3.getMinimumHeight();
                ViewGroup.LayoutParams layoutParams5 = childAt3.getLayoutParams();
                if (layoutParams5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                }
                childAt3.measure(iA4, d.a.a(iMakeMeasureSpec2, 0, i36, minimumHeight, ((com.yandex.div.internal.widget.c) layoutParams5).f370249g));
            }
            i17 = i34;
            childCount = i16;
        }
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(@Y61.k View view) {
        super.onViewAdded(view);
        this.f369260e = 0;
        d dVar = this.f369259d;
        dVar.f369273b.f369241b = null;
        dVar.f369274c.f369241b = null;
        dVar.f369275d.f369241b = null;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(@Y61.k View view) {
        super.onViewRemoved(view);
        this.f369260e = 0;
        d dVar = this.f369259d;
        dVar.f369273b.f369241b = null;
        dVar.f369274c.f369241b = null;
        dVar.f369275d.f369241b = null;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        if (this.f369261f) {
            d dVar = this.f369259d;
            dVar.f369274c.f369241b = null;
            dVar.f369275d.f369241b = null;
        }
    }

    public final void setColumnCount(int i12) {
        d dVar = this.f369259d;
        if (i12 <= 0) {
            dVar.getClass();
        } else if (dVar.f369272a != i12) {
            dVar.f369272a = i12;
            dVar.f369273b.f369241b = null;
            dVar.f369274c.f369241b = null;
            dVar.f369275d.f369241b = null;
        }
        this.f369260e = 0;
        dVar.f369273b.f369241b = null;
        dVar.f369274c.f369241b = null;
        dVar.f369275d.f369241b = null;
        requestLayout();
    }

    public final void setGravity(int i12) {
        this.gravity = i12;
        requestLayout();
    }

    @X41.j
    public l(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.gravity = 51;
        this.f369259d = new d();
        if (isInEditMode()) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.f428999d, i12, 0);
            try {
                setColumnCount(typedArrayObtainStyledAttributes.getInt(1, 1));
                setGravity(typedArrayObtainStyledAttributes.getInt(0, 51));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.f369261f = true;
    }
}
