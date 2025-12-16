package com.avito.android.lib.design.list_item.layout;

import Y41.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.avito.android.util.p6;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: PaddingLinearLayout.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/lib/design/list_item/layout/PaddingLinearLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "minHeight", "Lkotlin/G0;", "setMinimumHeight", "(I)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PaddingLinearLayout extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    public int f179586b;

    /* renamed from: c, reason: collision with root package name */
    public int f179587c;

    /* compiled from: PaddingLinearLayout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<View, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f179588l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(View view) {
            return Boolean.valueOf(view.getVisibility() != 8);
        }
    }

    /* compiled from: PaddingLinearLayout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements l<View, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f179589l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(View view) {
            return Boolean.valueOf(view.getVisibility() != 8);
        }
    }

    /* compiled from: PaddingLinearLayout.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements l<View, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f179590l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Integer invoke(View view) {
            return Integer.valueOf(view.getMeasuredHeight());
        }
    }

    public PaddingLinearLayout(@Y61.l Context context, @Y61.l AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        if (this.f179587c < getMeasuredHeight()) {
            super.onLayout(z12, i12, i13, i14, i15);
            return;
        }
        int i16 = ((i15 - i13) - this.f179586b) / 2;
        C43025h.a aVar = new C43025h.a(C43033p.i(C43033p.b(new p6(this)), a.f179588l));
        while (aVar.hasNext()) {
            View view = (View) aVar.next();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i17 = 0;
            int i18 = i16 + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            int paddingLeft = getPaddingLeft() + (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
            int paddingRight = getPaddingRight() + view.getMeasuredWidth() + paddingLeft + (marginLayoutParams != null ? marginLayoutParams.rightMargin : 0);
            int measuredHeight = view.getMeasuredHeight() + i18;
            view.layout(paddingLeft, i18, paddingRight, measuredHeight);
            if (marginLayoutParams != null) {
                i17 = marginLayoutParams.bottomMargin;
            }
            i16 = measuredHeight + i17;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        o0.a aVar = new o0.a(new o0(C43033p.i(C43033p.b(new p6(this)), b.f179589l), c.f179590l));
        int iIntValue = 0;
        while (aVar.f410559b.hasNext()) {
            iIntValue += ((Number) aVar.next()).intValue();
        }
        this.f179586b = iIntValue;
        super.onMeasure(i12, i13);
    }

    @Override // android.view.View
    public void setMinimumHeight(int minHeight) {
        this.f179587c = minHeight;
        super.setMinimumHeight(minHeight);
    }
}
