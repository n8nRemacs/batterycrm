package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DivViewGroup.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/internal/widget/d;", "Landroid/view/ViewGroup;", "a", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public abstract class d extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f370251b = new a(null);

    /* compiled from: DivViewGroup.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/widget/d$a;", "", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r11 == Integer.MAX_VALUE) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
        
            r9 = r11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        
            if (r11 == Integer.MAX_VALUE) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0059, code lost:
        
            if (r11 == Integer.MAX_VALUE) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int a(int r7, int r8, int r9, int r10, int r11) {
            /*
                int r0 = android.view.View.MeasureSpec.getMode(r7)
                int r7 = android.view.View.MeasureSpec.getSize(r7)
                int r7 = r7 - r8
                r8 = 0
                int r7 = java.lang.Math.max(r8, r7)
                r1 = -3
                r2 = -2
                r3 = -1
                r4 = 1073741824(0x40000000, float:2.0)
                r5 = 2147483647(0x7fffffff, float:NaN)
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r6) goto L4e
                if (r0 == 0) goto L3e
                if (r0 == r4) goto L20
                goto L67
            L20:
                if (r9 < 0) goto L26
                if (r9 > r5) goto L26
            L24:
                r8 = r4
                goto L68
            L26:
                if (r9 != r3) goto L2a
                r9 = r7
                goto L24
            L2a:
                if (r9 != r2) goto L33
                if (r11 != r5) goto L30
            L2e:
                r9 = r7
                goto L68
            L30:
                r9 = r11
            L31:
                r8 = r6
                goto L68
            L33:
                if (r9 != r1) goto L67
                int r7 = java.lang.Math.max(r7, r10)
                int r9 = java.lang.Math.min(r7, r11)
                goto L31
            L3e:
                if (r9 < 0) goto L43
                if (r9 > r5) goto L43
                goto L24
            L43:
                if (r9 != r3) goto L46
                goto L2e
            L46:
                if (r9 != r2) goto L49
                goto L4b
            L49:
                if (r9 != r1) goto L67
            L4b:
                if (r11 != r5) goto L30
                goto L2e
            L4e:
                if (r9 < 0) goto L53
                if (r9 > r5) goto L53
                goto L24
            L53:
                if (r9 != r3) goto L57
                r9 = r7
                goto L31
            L57:
                if (r9 != r2) goto L5c
                if (r11 != r5) goto L30
                goto L2e
            L5c:
                if (r9 != r1) goto L67
                int r7 = java.lang.Math.max(r7, r10)
                int r9 = java.lang.Math.min(r7, r11)
                goto L31
            L67:
                r9 = r8
            L68:
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r8)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.d.a.a(int, int, int, int, int):int");
        }

        public a() {
        }
    }

    public /* synthetic */ d(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(@Y61.l ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.ViewGroup
    @Y61.k
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    @Y61.k
    public final ViewGroup.LayoutParams generateLayoutParams(@Y61.l AttributeSet attributeSet) {
        c cVar = new c(getContext(), attributeSet);
        cVar.f370243a = 51;
        cVar.f370247e = 1;
        cVar.f370248f = 1;
        cVar.f370249g = Integer.MAX_VALUE;
        cVar.f370250h = Integer.MAX_VALUE;
        return cVar;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(@Y61.k View view, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        }
        c cVar = (c) layoutParams;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int i14 = ((ViewGroup.MarginLayoutParams) cVar).width;
        int minimumWidth = view.getMinimumWidth();
        int i15 = cVar.f370250h;
        f370251b.getClass();
        view.measure(a.a(i12, paddingRight, i14, minimumWidth, i15), a.a(i13, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) cVar).height, view.getMinimumHeight(), cVar.f370249g));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(@Y61.k View view, int i12, int i13, int i14, int i15) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        }
        c cVar = (c) layoutParams;
        int paddingRight = getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin + ((ViewGroup.MarginLayoutParams) cVar).rightMargin + i13;
        int i16 = ((ViewGroup.MarginLayoutParams) cVar).width;
        int minimumWidth = view.getMinimumWidth();
        int i17 = cVar.f370250h;
        f370251b.getClass();
        view.measure(a.a(i12, paddingRight, i16, minimumWidth, i17), a.a(i14, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar).topMargin + ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + i15, ((ViewGroup.MarginLayoutParams) cVar).height, view.getMinimumHeight(), cVar.f370249g));
    }

    @X41.j
    public d(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        setClipToPadding(false);
    }

    @Override // android.view.ViewGroup
    @Y61.k
    public ViewGroup.LayoutParams generateLayoutParams(@Y61.l ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof c) {
            c cVar = (c) layoutParams;
            c cVar2 = new c(cVar);
            cVar2.f370243a = 51;
            cVar2.f370247e = 1;
            cVar2.f370248f = 1;
            cVar2.f370249g = Integer.MAX_VALUE;
            cVar2.f370250h = Integer.MAX_VALUE;
            cVar2.f370243a = cVar.f370243a;
            cVar2.f370244b = cVar.f370244b;
            cVar2.f370245c = cVar.f370245c;
            cVar2.f370246d = cVar.f370246d;
            cVar2.f370247e = cVar.f370247e;
            cVar2.f370248f = cVar.f370248f;
            cVar2.f370249g = cVar.f370249g;
            cVar2.f370250h = cVar.f370250h;
            return cVar2;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c cVar3 = new c((ViewGroup.MarginLayoutParams) layoutParams);
            cVar3.f370243a = 51;
            cVar3.f370247e = 1;
            cVar3.f370248f = 1;
            cVar3.f370249g = Integer.MAX_VALUE;
            cVar3.f370250h = Integer.MAX_VALUE;
            return cVar3;
        }
        c cVar4 = new c(layoutParams);
        cVar4.f370243a = 51;
        cVar4.f370247e = 1;
        cVar4.f370248f = 1;
        cVar4.f370249g = Integer.MAX_VALUE;
        cVar4.f370250h = Integer.MAX_VALUE;
        return cVar4;
    }
}
