package com.avito.android.util;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import j.InterfaceC42156l;
import j.InterfaceC42158n;
import j.InterfaceC42161q;
import j.InterfaceC42165v;
import kotlin.Metadata;

/* compiled from: Views.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common-discouraged_utils_android"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes5.dex */
public final class D6 {

    /* compiled from: Views.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f318577l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<kotlin.G0> aVar) {
            super(0);
            this.f318577l = (kotlin.jvm.internal.N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final Boolean invoke() {
            this.f318577l.invoke();
            return Boolean.TRUE;
        }
    }

    /* compiled from: Views.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/ViewTreeObserver;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/ViewTreeObserver;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<ViewTreeObserver, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f318578l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(1);
            this.f318578l = cVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(ViewTreeObserver viewTreeObserver) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f318578l);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Views.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/util/D6$c", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f318579b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f318580c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.a aVar, View view) {
            this.f318579b = view;
            this.f318580c = (kotlin.jvm.internal.N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            A6.b(this.f318579b.getViewTreeObserver(), this);
            this.f318580c.invoke();
        }
    }

    public static final void A(@Y61.k View view, int i12) {
        if (Math.abs(i12 - view.getRotation()) > 180.0f) {
            i12 = (i12 - 360) % 360;
        }
        view.animate().rotation(i12);
    }

    public static final void B(@Y61.k Y41.a aVar, @Y61.k View view) {
        A6.a(view.getViewTreeObserver(), new b(new c(aVar, view)));
    }

    public static final void C(@Y61.k Y41.a aVar, @Y61.k View view) {
        Object tag = view.getTag(R.id.pre_draw_listener_tag);
        t6 t6Var = tag instanceof t6 ? (t6) tag : null;
        if (t6Var == null) {
            t6Var = new t6(view, aVar, false, 4, null);
        }
        t6Var.f319059c = new u6(aVar);
        if (!t6Var.f319061e) {
            View view2 = t6Var.f319058b;
            view2.addOnAttachStateChangeListener(t6Var.f319062f);
            s6 s6Var = new s6(t6Var);
            if (view2.getViewTreeObserver().isAlive()) {
                s6Var.invoke(view2.getViewTreeObserver());
            }
            t6Var.f319061e = true;
        }
        view.setTag(R.id.pre_draw_listener_tag, t6Var);
    }

    public static final void D(@Y61.k View view, @InterfaceC42165v int i12) {
        view.setBackground(view.getContext().getDrawable(i12));
    }

    public static final void E(@Y61.k View view, int i12, int i13) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) view.getLayoutParams();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12);
        sb2.append(':');
        sb2.append(i13);
        bVar.f44161H = sb2.toString();
    }

    public static final void F(@Y61.k View view, boolean z12) {
        view.setEnabled(z12);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount() - 1;
        if (childCount < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            F(viewGroup.getChildAt(i12), z12);
            if (i12 == childCount) {
                return;
            } else {
                i12++;
            }
        }
    }

    public static final void G(@Y61.l View view, boolean z12) {
        if (z12) {
            H(view);
        } else {
            w(view);
        }
    }

    public static final void H(@Y61.l View view) {
        if (view == null || view.getVisibility() == 0) {
            return;
        }
        view.setVisibility(0);
    }

    public static final int I(@Y61.k View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return s(view);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return s(view) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    public static final void a(@Y61.l Y41.a aVar, @Y61.k View view) {
        if (aVar != null) {
            if (!view.isClickable()) {
                view.setClickable(true);
            }
            view.setOnClickListener(new O5(aVar, 1));
        } else {
            if (view.isClickable()) {
                view.setClickable(false);
            }
            view.setOnClickListener(null);
        }
    }

    public static final void b(@Y61.k View view, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int iIntValue = num != null ? num.intValue() : marginLayoutParams.leftMargin;
        int iIntValue2 = num2 != null ? num2.intValue() : marginLayoutParams.topMargin;
        int iIntValue3 = num3 != null ? num3.intValue() : marginLayoutParams.rightMargin;
        int iIntValue4 = num4 != null ? num4.intValue() : marginLayoutParams.bottomMargin;
        if (iIntValue == marginLayoutParams.leftMargin && iIntValue2 == marginLayoutParams.topMargin && iIntValue3 == marginLayoutParams.rightMargin && iIntValue4 == marginLayoutParams.bottomMargin) {
            return;
        }
        marginLayoutParams.setMargins(iIntValue, iIntValue2, iIntValue3, iIntValue4);
        view.requestLayout();
    }

    public static /* synthetic */ void c(View view, Integer num, Integer num2, Integer num3, Integer num4, int i12) {
        if ((i12 & 1) != 0) {
            num = null;
        }
        if ((i12 & 2) != 0) {
            num2 = null;
        }
        if ((i12 & 4) != 0) {
            num3 = null;
        }
        if ((i12 & 8) != 0) {
            num4 = null;
        }
        b(view, num, num2, num3, num4);
    }

    public static final void d(@Y61.k View view, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l Integer num4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        int iIntValue = num != null ? num.intValue() : marginLayoutParams.getMarginStart();
        int iIntValue2 = num2 != null ? num2.intValue() : marginLayoutParams.topMargin;
        int iIntValue3 = num3 != null ? num3.intValue() : marginLayoutParams.getMarginEnd();
        int iIntValue4 = num4 != null ? num4.intValue() : marginLayoutParams.bottomMargin;
        if (iIntValue == marginLayoutParams.getMarginStart() && iIntValue2 == marginLayoutParams.topMargin && iIntValue3 == marginLayoutParams.getMarginEnd() && iIntValue4 == marginLayoutParams.bottomMargin) {
            return;
        }
        marginLayoutParams.setMarginStart(iIntValue);
        marginLayoutParams.topMargin = iIntValue2;
        marginLayoutParams.setMarginEnd(iIntValue3);
        marginLayoutParams.bottomMargin = iIntValue4;
        view.requestLayout();
    }

    public static /* synthetic */ void e(View view, Integer num, Integer num2, Integer num3, int i12) {
        if ((i12 & 2) != 0) {
            num2 = null;
        }
        if ((i12 & 4) != 0) {
            num3 = null;
        }
        d(view, num, num2, num3, null);
    }

    public static void f(View view, int i12, int i13, int i14, int i15, int i16) {
        if ((i16 & 1) != 0) {
            i12 = view.getPaddingLeft();
        }
        if ((i16 & 2) != 0) {
            i13 = view.getPaddingTop();
        }
        if ((i16 & 4) != 0) {
            i14 = view.getPaddingRight();
        }
        if ((i16 & 8) != 0) {
            i15 = view.getPaddingBottom();
        }
        view.setPadding(i12, i13, i14, i15);
    }

    public static final void g(@Y61.l View view) {
        if (view == null || view.getVisibility() == 4) {
            return;
        }
        view.setVisibility(4);
    }

    public static final void h(@Y61.l View view) {
        if (view != null && view.isEnabled()) {
            view.setEnabled(false);
        }
    }

    public static final int i(int i12, @Y61.k Context context) {
        return (int) (i12 * context.getResources().getDisplayMetrics().density);
    }

    public static final int j(@Y61.k View view, int i12) {
        return (int) (i12 * view.getResources().getDisplayMetrics().density);
    }

    public static final void k(@Y61.l View view) {
        if (view == null || view.isEnabled()) {
            return;
        }
        view.setEnabled(true);
    }

    public static final void l(boolean z12, @Y61.k View view, @Y61.k Y41.a aVar) {
        if (x(view)) {
            aVar.invoke();
            return;
        }
        a aVar2 = new a(aVar);
        Object tag = view.getTag(R.id.pre_draw_listener_tag);
        t6 t6Var = tag instanceof t6 ? (t6) tag : null;
        if (t6Var == null) {
            t6Var = new t6(z12, view, aVar2);
        }
        t6Var.f319059c = new u6(aVar2);
        if (!t6Var.f319061e) {
            View view2 = t6Var.f319058b;
            view2.addOnAttachStateChangeListener(t6Var.f319062f);
            s6 s6Var = new s6(t6Var);
            if (view2.getViewTreeObserver().isAlive()) {
                s6Var.invoke(view2.getViewTreeObserver());
            }
            t6Var.f319061e = true;
        }
        view.setTag(R.id.pre_draw_listener_tag, t6Var);
    }

    public static final void m(@Y61.k View view, int i12) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 == null) {
            V2.f318762a.c("Views", "extendTouchableArea(): view doesn't not have parent", null);
            return;
        }
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (rect.isEmpty()) {
            V2.f318762a.i("Views", "extendTouchableArea(): Hit rect is empty! Has the view been laid out?", null);
        }
        rect.top -= i12;
        rect.bottom += i12;
        rect.left -= i12;
        rect.right += i12;
        view2.setTouchDelegate(new TouchDelegate(rect, view));
    }

    public static final void n(@Y61.k View view, long j12) {
        if (view.getVisibility() == 0 && view.getAlpha() == 1.0f) {
            return;
        }
        view.animate().alpha(1.0f).setDuration(j12).withStartAction(new C6(view, 1));
    }

    public static final void o(@Y61.k View view, long j12) {
        if (view.getAlpha() == 0.0f || view.getVisibility() == 8) {
            return;
        }
        view.animate().alpha(0.0f).setDuration(j12).withEndAction(new C6(view, 0));
    }

    @Y61.l
    public static final RecyclerView p(@Y61.k View view) {
        if (view.getParent() instanceof RecyclerView) {
            ViewParent parent = view.getParent();
            if (parent instanceof RecyclerView) {
                return (RecyclerView) parent;
            }
            return null;
        }
        Object parent2 = view.getParent();
        View view2 = parent2 instanceof View ? (View) parent2 : null;
        if (view2 != null) {
            return p(view2);
        }
        return null;
    }

    @InterfaceC42156l
    public static final int q(@Y61.k View view, @InterfaceC42158n int i12) {
        return androidx.core.content.d.getColor(view.getContext(), i12);
    }

    public static final int r(@Y61.k View view) {
        if (view.getHeight() != 0) {
            return view.getHeight();
        }
        if (view.getMeasuredHeight() != 0) {
            return view.getMeasuredHeight();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return Math.max(layoutParams != null ? layoutParams.height : 0, 0);
    }

    public static final int s(@Y61.k View view) {
        if (view.getWidth() != 0) {
            return view.getWidth();
        }
        if (view.getMeasuredWidth() != 0) {
            return view.getMeasuredWidth();
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return Math.max(layoutParams != null ? layoutParams.width : 0, 0);
    }

    public static final int t(@Y61.k View view, @InterfaceC42161q int i12) {
        return (int) com.avito.android.authorization.auto_recovery.phone_confirm.b.b(view, i12);
    }

    @Y61.k
    public static final Drawable u(@Y61.k View view, @InterfaceC42165v int i12) {
        return view.getContext().getDrawable(i12);
    }

    public static final int v(@Y61.k View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static final void w(@Y61.l View view) {
        if (view == null || view.getVisibility() == 8) {
            return;
        }
        view.setVisibility(8);
    }

    public static final boolean x(@Y61.k View view) {
        return s(view) > 0 && r(view) > 0;
    }

    public static final boolean y(@Y61.k View view) {
        return view.getVisibility() == 0;
    }

    public static final void z(@Y61.l View view) {
        ViewParent parent;
        if (view == null || (parent = view.getParent()) == null) {
            return;
        }
        ((ViewGroup) parent).removeView(view);
    }
}
