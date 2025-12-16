package com.avito.android.lib.design.time_line;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.time_line.s;
import com.avito.android.util.I5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TimeLine.kt */
@s0
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002:\u0002\u0014\u0015J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/avito/android/lib/design/time_line/d;", "Landroidx/recyclerview/widget/RecyclerView;", "LLV/a;", "LGV/b;", "Lcom/avito/android/lib/design/time_line/s;", "", "Lcom/avito/android/lib/design/time_line/d$b;", "getCurrentTexts", "()Ljava/util/List;", "", "scrollToCurrentIndex", "Lkotlin/G0;", "setScrollToCurrentIndex", "(Z)V", "newStyle", "setStyle", "(Lcom/avito/android/lib/design/time_line/s;)V", "newState", "setState", "(LGV/b;)V", "a", "b", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d extends RecyclerView implements LV.a<GV.b, s> {

    /* renamed from: F0, reason: collision with root package name */
    @Y61.l
    public s f180984F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.l
    public GV.b f180985G0;

    /* renamed from: H0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.text_view.a f180986H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.text_view.a f180987I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public List<b> f180988J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.l
    public Integer f180989K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final e f180990L0;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.k
    public final p f180991M0;

    /* renamed from: N0, reason: collision with root package name */
    @Y61.k
    public final TimeLineLayoutManager f180992N0;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f180993O0;

    /* renamed from: P0, reason: collision with root package name */
    public final int f180994P0;

    /* renamed from: Q0, reason: collision with root package name */
    public final int f180995Q0;

    /* renamed from: R0, reason: collision with root package name */
    public boolean f180996R0;

    /* renamed from: S0, reason: collision with root package name */
    public boolean f180997S0;

    /* compiled from: TimeLine.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/time_line/d$a;", "", "<init>", "()V", "", "MIN_INDEX_TO_SCROLL_WITH_OFFSET", "I", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TimeLine.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/time_line/d$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f180998a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PK0.n f180999b;

        public b(@Y61.l String str, @Y61.k PK0.n nVar) {
            this.f180998a = str;
            this.f180999b = nVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f180998a, bVar.f180998a) && L.f(this.f180999b, bVar.f180999b);
        }

        public final int hashCode() {
            String str = this.f180998a;
            return this.f180999b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            return "MeasuredText(value=" + this.f180998a + ", style=" + this.f180999b + ')';
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        AttributeSet attributeSet2 = (i14 & 2) != 0 ? null : attributeSet;
        int i15 = (i14 & 4) != 0 ? R.attr.timeLineStandard : i12;
        int i16 = (i14 & 8) != 0 ? 0 : i13;
        super(context, attributeSet2);
        int i17 = 14;
        C42822w c42822w2 = null;
        AttributeSet attributeSet3 = null;
        int i18 = 0;
        int i19 = 0;
        com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(context, attributeSet3, i18, i19, i17, c42822w2);
        this.f180986H0 = aVar;
        com.avito.android.lib.design.text_view.a aVar2 = new com.avito.android.lib.design.text_view.a(context, attributeSet3, i18, i19, i17, c42822w2);
        this.f180987I0 = aVar2;
        this.f180988J0 = C42784z0.f406748b;
        this.f180993O0 = true;
        this.f180994P0 = context.getResources().getDimensionPixelOffset(R.dimen.time_line_icon_height);
        this.f180995Q0 = context.getResources().getDimensionPixelOffset(R.dimen.time_line_text_top_margin);
        this.f180996R0 = true;
        TimeLineLayoutManager timeLineLayoutManager = new TimeLineLayoutManager(0, false);
        this.f180992N0 = timeLineLayoutManager;
        setLayoutManager(timeLineLayoutManager);
        e eVar = new e();
        this.f180990L0 = eVar;
        setAdapter(eVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, d.n.f178940P0, i15, i16);
        s.f181035h.getClass();
        this.f180984F0 = s.a.b(typedArrayObtainStyledAttributes, context);
        typedArrayObtainStyledAttributes.recycle();
        s sVar = this.f180984F0;
        if (sVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        p pVar = new p(context, sVar.f181037b, sVar.f181040e, sVar.f181042g);
        this.f180991M0 = pVar;
        l(pVar, -1);
        com.avito.android.lib.design.text_view.e.a(aVar, sVar.f181036a);
        com.avito.android.lib.design.text_view.e.a(aVar2, sVar.f181039d);
        for (com.avito.android.lib.design.text_view.a aVar3 : C42745f0.U(aVar, aVar2)) {
            aVar3.setMaxLines(3);
            aVar3.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        setClipToPadding(false);
    }

    private final List<b> getCurrentTexts() {
        List<GV.a> list;
        s sVar = this.f180984F0;
        if (sVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        GV.b bVar = this.f180985G0;
        if (bVar == null || (list = bVar.f6517a) == null) {
            return C42784z0.f406748b;
        }
        List<GV.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            String str = ((GV.a) obj).f6516b;
            GV.b bVar2 = this.f180985G0;
            arrayList.add(new b(str, i12 <= (bVar2 != null ? bVar2.f6518b : 0) ? sVar.f181036a : sVar.f181039d));
            i12 = i13;
        }
        return arrayList;
    }

    private final void setScrollToCurrentIndex(boolean scrollToCurrentIndex) {
        if (this.f180993O0 != scrollToCurrentIndex) {
            this.f180993O0 = scrollToCurrentIndex;
            requestLayout();
        }
    }

    public final void M0(List<GV.a> list, int i12) {
        int i13 = i12;
        this.f180991M0.f181023f = i13;
        List<GV.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        int i14 = 0;
        for (Iterator it = list2.iterator(); it.hasNext(); it = it) {
            Object next = it.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                C42745f0.H0();
                throw null;
            }
            GV.a aVar = (GV.a) next;
            s sVar = this.f180984F0;
            if (sVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Integer num = aVar.f6515a;
            TimeLineAlignment timeLineAlignment = i14 == 0 ? TimeLineAlignment.f180954b : i14 == C42745f0.J(list) ? TimeLineAlignment.f180956d : TimeLineAlignment.f180955c;
            ItemType itemType = i14 < i13 ? ItemType.f180949b : i14 > i13 ? ItemType.f180950c : ItemType.f180951d;
            t tVar = t.f181043a;
            int size = list.size();
            tVar.getClass();
            arrayList.add(new c(i14, num, aVar.f6516b, timeLineAlignment, size == 2 ? TimeLineItemWidthType.f180959c : TimeLineItemWidthType.f180960d, sVar.f181042g, itemType, sVar.f181036a, sVar.f181037b, sVar.f181038c, sVar.f181040e, sVar.f181039d, sVar.f181041f));
            i13 = i12;
            i14 = i15;
        }
        this.f180990L0.l(arrayList, new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 9));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i12, int i13) {
        List<b> currentTexts = getCurrentTexts();
        if (!L.f(currentTexts, this.f180988J0)) {
            this.f180988J0 = currentTexts;
            List<b> list = currentTexts;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            int i14 = 0;
            for (Object obj : list) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                String str = ((b) obj).f180998a;
                t tVar = t.f181043a;
                int size = currentTexts.size();
                tVar.getClass();
                TimeLineItemWidthType timeLineItemWidthType = size == 2 ? TimeLineItemWidthType.f180959c : TimeLineItemWidthType.f180960d;
                GV.b bVar = this.f180985G0;
                com.avito.android.lib.design.text_view.a aVar = i14 <= (bVar != null ? bVar.f6518b : 0) ? this.f180986H0 : this.f180987I0;
                I5.a(aVar, str, false);
                aVar.measure(View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i12) - getPaddingStart()) - getPaddingEnd()) / timeLineItemWidthType.f180963b, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                arrayList.add(Integer.valueOf(aVar.getMeasuredHeight()));
                i14 = i15;
            }
            this.f180989K0 = Integer.valueOf(getPaddingBottom() + getPaddingTop() + ((Number) C42745f0.Z(arrayList)).intValue() + this.f180995Q0 + this.f180994P0);
        }
        Integer num = this.f180989K0;
        if (num != null) {
            i13 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i12, i13);
        if (this.f180996R0 && this.f180997S0 && this.f180993O0) {
            this.f180996R0 = false;
            GV.b bVar2 = this.f180985G0;
            int i16 = bVar2 != null ? bVar2.f6518b : 0;
            TimeLineLayoutManager timeLineLayoutManager = this.f180992N0;
            if (i16 >= 2) {
                timeLineLayoutManager.b2(i16, (((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()) * 3) / 15);
            } else {
                timeLineLayoutManager.l1(0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    @Override // LV.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setState(@Y61.k GV.b r7) {
        /*
            r6 = this;
            GV.b r0 = r6.f180985G0
            com.avito.android.lib.util.c r1 = new com.avito.android.lib.util.c
            r1.<init>(r7, r0)
            boolean r1 = r1.f181333c
            if (r1 != 0) goto L78
            java.util.List<GV.a> r1 = r7.f6517a
            int r2 = r1.size()
            r3 = 2
            if (r2 < r3) goto L70
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            kotlin.ranges.l r2 = kotlin.collections.C42745f0.I(r2)
            int r3 = r7.f6518b
            boolean r2 = r2.h(r3)
            if (r2 == 0) goto L68
            r6.f180985G0 = r7
            r2 = 0
            if (r0 == 0) goto L2b
            java.util.List<GV.a> r4 = r0.f6517a
            goto L2c
        L2b:
            r4 = r2
        L2c:
            boolean r4 = kotlin.jvm.internal.L.f(r1, r4)
            if (r4 == 0) goto L46
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L3f
            int r5 = r0.f6518b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L40
        L3f:
            r5 = r2
        L40:
            boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
            if (r4 != 0) goto L49
        L46:
            r6.M0(r1, r3)
        L49:
            boolean r7 = r7.f6519c
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            if (r0 == 0) goto L57
            boolean r0 = r0.f6519c
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
        L57:
            com.avito.android.lib.util.c r0 = new com.avito.android.lib.util.c
            r0.<init>(r7, r2)
            boolean r0 = r0.f181333c
            if (r0 != 0) goto L78
            boolean r7 = r7.booleanValue()
            r6.setScrollToCurrentIndex(r7)
            goto L78
        L68:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Not valid current index"
            r7.<init>(r0)
            throw r7
        L70:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Min items count is 2"
            r7.<init>(r0)
            throw r7
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.time_line.d.setState(GV.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00fb  */
    @Override // LV.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStyle(@Y61.k com.avito.android.lib.design.time_line.s r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.time_line.d.setStyle(com.avito.android.lib.design.time_line.s):void");
    }
}
