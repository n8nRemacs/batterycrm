package com.avito.android.lib.design.bottom_sheet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C22808a;
import androidx.core.view.C22823h0;
import androidx.transition.C23492c;
import androidx.transition.C23503n;
import androidx.transition.L;
import androidx.transition.Q;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.Q5;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j.InterfaceC42156l;
import j.InterfaceC42165v;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ModalBottomSheetView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/u;", "Lcom/avito/android/lib/design/bottom_sheet/q;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes14.dex */
final class u implements q {

    /* renamed from: A, reason: collision with root package name */
    public final int f178571A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public w f178572B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f178573C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f178574D;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f178575b;

    /* renamed from: c, reason: collision with root package name */
    public final CoordinatorLayout f178576c;

    /* renamed from: d, reason: collision with root package name */
    public final View f178577d;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f178578e;

    /* renamed from: f, reason: collision with root package name */
    public final BoundedLinearLayout f178579f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f178580g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f178581h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView f178582i;

    /* renamed from: j, reason: collision with root package name */
    public final FrameLayout f178583j;

    /* renamed from: k, reason: collision with root package name */
    public final FrameLayout f178584k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f178585l;

    /* renamed from: m, reason: collision with root package name */
    public final TextView f178586m;

    /* renamed from: n, reason: collision with root package name */
    public final View f178587n;

    /* renamed from: o, reason: collision with root package name */
    public final View f178588o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.google.android.material.bottomsheet.BottomSheetBehavior<BoundedLinearLayout> f178589p;

    /* renamed from: q, reason: collision with root package name */
    public final FrameLayout f178590q;

    /* renamed from: r, reason: collision with root package name */
    public final ViewGroup f178591r;

    /* renamed from: s, reason: collision with root package name */
    public final View f178592s;

    /* renamed from: t, reason: collision with root package name */
    public final int f178593t;

    /* renamed from: u, reason: collision with root package name */
    public final int f178594u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super View, ? super Integer, G0> f178595v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f178596w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public N f178597x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public N f178598y;

    /* renamed from: z, reason: collision with root package name */
    public final int f178599z;

    /* compiled from: ModalBottomSheetView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/bottom_sheet/u$a", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends BottomSheetBehavior.c {
        public a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onSlide(@Y61.k View view, float f12) {
            u uVar = u.this;
            uVar.getClass();
            FrameLayout frameLayout = uVar.f178585l;
            if (f12 < 0.0f) {
                frameLayout.setTranslationY((-frameLayout.getHeight()) * f12);
            } else {
                frameLayout.setTranslationY(0.0f);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.c
        public final void onStateChanged(@Y61.k View view, int i12) {
            u uVar = u.this;
            Y41.p<? super View, ? super Integer, G0> pVar = uVar.f178595v;
            if (pVar != null) {
                ((com.avito.android.lib.design.bottom_sheet.e) pVar).invoke(view, Integer.valueOf(i12));
            }
            if (i12 == 1) {
                uVar.f178575b.postDelayed(new s(uVar), 250L);
            }
            if (i12 == 5) {
                uVar.G();
            }
        }
    }

    /* compiled from: ModalBottomSheetView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/bottom_sheet/u$b", "Landroidx/core/view/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends C22808a {
        public b() {
        }

        @Override // androidx.core.view.C22808a
        public final void d(@Y61.k View view, @Y61.k androidx.core.view.accessibility.f fVar) {
            this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
            if (!u.this.f178589p.f355972I) {
                fVar.p(false);
            } else {
                fVar.a(1048576);
                fVar.p(true);
            }
        }

        @Override // androidx.core.view.C22808a
        public final boolean g(@Y61.k View view, int i12, @Y61.l Bundle bundle) {
            if (i12 == 1048576) {
                u uVar = u.this;
                if (uVar.f178589p.f355972I) {
                    uVar.dismiss();
                    return true;
                }
            }
            return super.g(view, i12, bundle);
        }
    }

    /* compiled from: ModalBottomSheetView.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "<anonymous parameter 0>", "top", "<anonymous parameter 2>", "bottom", "Lkotlin/G0;", "invoke", "(IIII)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.r<Integer, Integer, Integer, Integer, G0> {
        public c() {
            super(4);
        }

        @Override // Y41.r
        public final G0 invoke(Integer num, Integer num2, Integer num3, Integer num4) {
            num.intValue();
            int iIntValue = num2.intValue();
            num3.intValue();
            int iIntValue2 = num4.intValue();
            u uVar = u.this;
            D6.c(uVar.f178576c, null, Integer.valueOf(iIntValue), null, Integer.valueOf(iIntValue2), 5);
            D6.c(uVar.f178585l, null, null, null, Integer.valueOf(iIntValue2), 7);
            View view = uVar.f178592s;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.height = iIntValue2;
            view.setLayoutParams(layoutParams);
            return G0.f406611a;
        }
    }

    /* compiled from: ModalBottomSheetView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<Integer, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            D6.c(u.this.f178576c, null, null, null, Integer.valueOf(num.intValue()), 7);
            return G0.f406611a;
        }
    }

    /* compiled from: ModalBottomSheetView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/bottom_sheet/u$e", "Landroid/view/ViewOutlineProvider;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends ViewOutlineProvider {
        public e() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@Y61.l View view, @Y61.l Outline outline) {
            if (view == null || outline == null) {
                return;
            }
            int width = view.getWidth();
            int height = view.getHeight();
            int i12 = u.this.f178594u;
            outline.setRoundRect(0, 0, width, height + i12, i12);
        }
    }

    /* compiled from: ModalBottomSheetView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/transition/L;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/transition/L;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<L, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(L l12) {
            u.this.f178589p.b(4);
            return G0.f406611a;
        }
    }

    public u(@Y61.k ViewGroup viewGroup) throws Resources.NotFoundException {
        this.f178575b = viewGroup;
        this.f178576c = (CoordinatorLayout) viewGroup.findViewById(R.id.coordinator);
        this.f178577d = viewGroup.findViewById(R.id.bottom_sheet_touch_outside);
        this.f178578e = (FrameLayout) viewGroup.findViewById(R.id.bottom_sheet_background);
        BoundedLinearLayout boundedLinearLayout = (BoundedLinearLayout) viewGroup.findViewById(R.id.bottom_sheet);
        this.f178579f = boundedLinearLayout;
        this.f178580g = (ViewGroup) boundedLinearLayout.findViewById(R.id.bottom_sheet_header);
        this.f178581h = (TextView) boundedLinearLayout.findViewById(R.id.bottom_sheet_title);
        ImageView imageView = (ImageView) boundedLinearLayout.findViewById(R.id.bottom_sheet_close_button);
        this.f178582i = imageView;
        this.f178583j = (FrameLayout) boundedLinearLayout.findViewById(R.id.bottom_sheet_body);
        this.f178584k = (FrameLayout) boundedLinearLayout.findViewById(R.id.bottom_sheet_body_container);
        this.f178585l = (FrameLayout) viewGroup.findViewById(R.id.footer_container);
        TextView textView = (TextView) boundedLinearLayout.findViewById(R.id.bottom_sheet_action_button);
        this.f178586m = textView;
        this.f178587n = boundedLinearLayout.findViewById(R.id.header_thumb);
        this.f178588o = boundedLinearLayout.findViewById(R.id.thumb_layout);
        com.google.android.material.bottomsheet.BottomSheetBehavior<BoundedLinearLayout> bottomSheetBehaviorB = com.google.android.material.bottomsheet.BottomSheetBehavior.B(boundedLinearLayout);
        this.f178589p = bottomSheetBehaviorB;
        this.f178590q = (FrameLayout) boundedLinearLayout.findViewById(R.id.custom_bottom_sheet_header);
        this.f178591r = (ViewGroup) boundedLinearLayout.findViewById(R.id.overlay_header);
        View viewFindViewById = viewGroup.findViewById(R.id.navigation_bar_overlay);
        this.f178592s = viewFindViewById;
        this.f178599z = C35835l0.d(R.attr.blue, viewGroup.getContext());
        this.f178571A = C35835l0.d(R.attr.gray28, viewGroup.getContext());
        this.f178574D = ((BottomSheetBehavior) bottomSheetBehaviorB).f178495g0;
        Context context = viewGroup.getContext();
        TypedValue typedValue = new TypedValue();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(viewGroup.getContext().getTheme().resolveAttribute(R.attr.bottomSheetDialog, typedValue, true) ? typedValue.resourceId : R.style.Design_Widget_BottomSheetDialog, new int[]{R.attr.bottomSheet_titleMarginWithoutThumb, R.attr.bottomSheet_cornerRadius});
        this.f178593t = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f178593t);
        this.f178594u = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, this.f178594u);
        typedArrayObtainStyledAttributes.recycle();
        com.avito.android.lib.util.b.a(bottomSheetBehaviorB);
        bottomSheetBehaviorB.v(new a());
        imageView.setOnClickListener(new r(this, 1));
        C22823h0.C(boundedLinearLayout, new b());
        boundedLinearLayout.setOnTouchListener(new Ha1.a(1));
        textView.setOnClickListener(new r(this, 2));
        com.avito.android.lib.util.i iVar = com.avito.android.lib.util.i.f181373a;
        iVar.getClass();
        boolean z12 = com.avito.android.lib.util.i.f181377e;
        if (z12) {
            viewFindViewById.setVisibility(0);
        }
        com.avito.android.lib.util.i.k(iVar, viewGroup, new c());
        d dVar = new d();
        if (z12) {
            C22823h0.R(viewGroup, new com.avito.android.lib.util.k(viewGroup, dVar));
        }
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void A(boolean z12) {
        View view = this.f178577d;
        if (z12) {
            view.setOnClickListener(new r(this, 0));
        } else {
            view.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void B(@Y61.k View view) {
        D6.w(this.f178580g);
        D6.w(this.f178590q);
        D6.w(this.f178588o);
        ViewGroup viewGroup = this.f178591r;
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        D6.G(viewGroup, true);
        j();
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void C(boolean z12) {
        BoundedLinearLayout boundedLinearLayout = this.f178579f;
        if (z12) {
            boundedLinearLayout.getLayoutParams().height = -1;
        } else {
            boundedLinearLayout.getLayoutParams().height = -2;
        }
        boundedLinearLayout.requestLayout();
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void D(boolean z12) {
        D6.G(this.f178586m, z12);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void E(@Y61.l Y41.a<G0> aVar) {
        this.f178596w = aVar;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void F(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, boolean z12, boolean z13) {
        D6.G(this.f178580g, (charSequence == null && charSequence2 == null && !z12) ? false : true);
        TextView textView = this.f178581h;
        textView.setText(charSequence);
        TextView textView2 = this.f178586m;
        textView2.setText(charSequence2);
        D6.B(new v(this), this.f178575b);
        D6.G(textView, !(charSequence == null || C43066x.K(charSequence)));
        D6.G(textView2, !(charSequence == null || C43066x.K(charSequence)));
        D6.G(this.f178582i, z12);
        D6.G(this.f178587n, z13);
    }

    public final void G() {
        Y41.a<G0> aVar = this.f178596w;
        if (aVar != null) {
            aVar.invoke();
        }
        Q5 q52 = new Q5(new C23503n());
        ViewGroup viewGroup = this.f178575b;
        q52.b(viewGroup);
        Q.a(viewGroup, q52.c());
        D6.w(viewGroup);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    @Y61.k
    /* renamed from: T1, reason: from getter */
    public final FrameLayout getF178583j() {
        return this.f178583j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void U(@Y61.l Y41.a<G0> aVar) {
        this.f178597x = (N) aVar;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void b(int i12) {
        this.f178589p.N(i12, false);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void c(int i12) {
        this.f178587n.getLayoutParams().width = i12;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void d(@InterfaceC42156l int i12) {
        this.f178586m.setTextColor(i12);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void dismiss() {
        com.google.android.material.bottomsheet.BottomSheetBehavior<BoundedLinearLayout> bottomSheetBehavior = this.f178589p;
        if (bottomSheetBehavior.f355972I) {
            com.avito.android.lib.util.b.a(bottomSheetBehavior);
        } else {
            G();
        }
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void e(boolean z12, boolean z13) {
        w wVar = this.f178572B;
        ViewGroup viewGroup = this.f178575b;
        if (wVar != null) {
            viewGroup.removeOnLayoutChangeListener(wVar);
        }
        if (z12) {
            w wVar2 = new w(viewGroup, z13, this);
            viewGroup.addOnLayoutChangeListener(wVar2);
            this.f178572B = wVar2;
        }
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void f(@Y61.k View view) {
        D6.w(this.f178580g);
        D6.w(this.f178591r);
        FrameLayout frameLayout = this.f178590q;
        frameLayout.removeAllViews();
        D6.G(frameLayout, true);
        frameLayout.addView(view);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final FrameLayout getF178585l() {
        return this.f178585l;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void g7(int i12) {
        this.f178581h.setMaxLines(i12);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    @Y61.k
    /* renamed from: getTouchOutsideView, reason: from getter */
    public final View getF178577d() {
        return this.f178577d;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void h(@InterfaceC42165v int i12) {
        this.f178582i.setImageResource(i12);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    @Y61.k
    public final Map<Class<?>, Y41.p<View, MotionEvent, Boolean>> i() {
        return this.f178574D;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void j() {
        BoundedLinearLayout boundedLinearLayout = this.f178579f;
        boundedLinearLayout.setClipToOutline(true);
        boundedLinearLayout.setOutlineProvider(new e());
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void j2() {
        this.f178589p.b(3);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void k() {
        this.f178589p.f355973J = true;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void l(boolean z12) {
        TextView textView = this.f178586m;
        if (z12) {
            textView.setClickable(true);
            textView.setTextColor(this.f178599z);
        } else {
            textView.setClickable(false);
            textView.setTextColor(this.f178571A);
        }
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void l2(boolean z12) {
        this.f178589p.M(z12);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void m(boolean z12) {
        this.f178573C = z12;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    @Y61.k
    /* renamed from: n, reason: from getter */
    public final FrameLayout getF178578e() {
        return this.f178578e;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void o(@Y61.k C23492c c23492c, @Y61.k Y41.a aVar) {
        CoordinatorLayout coordinatorLayout = this.f178576c;
        Q.b(coordinatorLayout);
        c23492c.M(this.f178579f);
        Q.a(coordinatorLayout, c23492c);
        aVar.invoke();
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void p(@Y61.k ColorStateList colorStateList) {
        this.f178586m.setTextColor(colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void q(@Y61.l Y41.a<G0> aVar) {
        this.f178598y = (N) aVar;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void r(@Y61.k C23492c c23492c, @Y61.k Y41.a aVar) {
        ViewGroup viewGroup = this.f178575b;
        Q.b(viewGroup);
        c23492c.M(this.f178579f);
        c23492c.M(this.f178585l);
        Q.a(viewGroup, c23492c);
        aVar.invoke();
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void s(@Y61.l Y41.p<? super View, ? super Integer, G0> pVar) {
        this.f178595v = pVar;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void setDraggable(boolean z12) {
        this.f178589p.f355974K = z12;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void show() {
        ViewGroup viewGroup = this.f178575b;
        if (!viewGroup.isLaidOut() || D6.y(viewGroup)) {
            D6.H(viewGroup);
            this.f178589p.b(4);
            return;
        }
        Q5 q52 = new Q5(new C23503n());
        q52.b(viewGroup);
        q52.f318728c = new f();
        Q.a(viewGroup, q52.c());
        D6.H(viewGroup);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    @Y61.l
    public final Y41.a<G0> t() {
        return this.f178596w;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void u(@Y61.k Y41.a<Boolean> aVar) {
        this.f178577d.setOnClickListener(new t(0, aVar, this));
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void v(@Y61.l Drawable drawable) {
        this.f178582i.setImageDrawable(drawable);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void w(boolean z12) {
        int i12 = z12 ? -1 : -2;
        this.f178584k.getLayoutParams().height = i12;
        this.f178583j.getLayoutParams().height = i12;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void x(boolean z12) {
        this.f178586m.setEnabled(z12);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void y(int i12) {
        View view = this.f178588o;
        view.getLayoutParams().height = i12;
        view.requestLayout();
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void z() {
        D6.H(this.f178587n);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void a() {
    }
}
