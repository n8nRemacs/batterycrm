package com.avito.android.lib.design.bottom_sheet;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.A0;
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
import j.InterfaceC42156l;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: TabletBottomSheetView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/A;", "Lcom/avito/android/lib/design/bottom_sheet/q;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f178472b;

    /* renamed from: c, reason: collision with root package name */
    public final View f178473c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f178474d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f178475e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f178476f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f178477g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f178478h;

    /* renamed from: i, reason: collision with root package name */
    public final FrameLayout f178479i;

    /* renamed from: j, reason: collision with root package name */
    public final FrameLayout f178480j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f178481k;

    /* renamed from: l, reason: collision with root package name */
    public final FrameLayout f178482l;

    /* renamed from: m, reason: collision with root package name */
    public final ViewGroup f178483m;

    /* renamed from: n, reason: collision with root package name */
    public final View f178484n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super View, ? super Integer, G0> f178485o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f178486p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public N f178487q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public N f178488r;

    /* renamed from: s, reason: collision with root package name */
    public final int f178489s;

    /* renamed from: t, reason: collision with root package name */
    public final int f178490t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f178491u;

    /* compiled from: TabletBottomSheetView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/lib/design/bottom_sheet/A$a", "Landroidx/core/view/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends C22808a {
        public a() {
        }

        @Override // androidx.core.view.C22808a
        public final void d(@Y61.k View view, @Y61.k androidx.core.view.accessibility.f fVar) {
            this.f44991a.onInitializeAccessibilityNodeInfo(view, fVar.f44999a);
            fVar.a(1048576);
            fVar.p(true);
        }

        @Override // androidx.core.view.C22808a
        public final boolean g(@Y61.k View view, int i12, @Y61.l Bundle bundle) {
            if (i12 != 1048576) {
                return super.g(view, i12, bundle);
            }
            A.this.dismiss();
            return true;
        }
    }

    /* compiled from: TabletBottomSheetView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/transition/L;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/transition/L;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<L, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(L l12) {
            A a12 = A.this;
            Y41.p<? super View, ? super Integer, G0> pVar = a12.f178485o;
            if (pVar != null) {
                ((e) pVar).invoke(a12.f178475e, 5);
            }
            return G0.f406611a;
        }
    }

    public A(@Y61.k ViewGroup viewGroup) {
        this.f178472b = viewGroup;
        this.f178473c = viewGroup.findViewById(R.id.bottom_sheet_touch_outside);
        this.f178474d = (FrameLayout) viewGroup.findViewById(R.id.bottom_sheet_background);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.bottom_sheet);
        this.f178475e = viewGroup2;
        this.f178476f = (ViewGroup) viewGroup2.findViewById(R.id.bottom_sheet_header);
        this.f178477g = (TextView) viewGroup2.findViewById(R.id.bottom_sheet_title);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.bottom_sheet_close_button);
        this.f178478h = imageView;
        this.f178479i = (FrameLayout) viewGroup2.findViewById(R.id.bottom_sheet_body);
        this.f178480j = (FrameLayout) viewGroup.findViewById(R.id.footer_container);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.bottom_sheet_action_button);
        this.f178481k = textView;
        this.f178482l = (FrameLayout) viewGroup2.findViewById(R.id.custom_bottom_sheet_header);
        this.f178483m = (ViewGroup) viewGroup2.findViewById(R.id.overlay_header);
        this.f178484n = viewGroup2.findViewById(R.id.header_divider);
        this.f178489s = C35835l0.d(R.attr.blue, viewGroup.getContext());
        this.f178490t = C35835l0.d(R.attr.gray28, viewGroup.getContext());
        D6.w(viewGroup);
        imageView.setOnClickListener(new z(this, 1));
        C22823h0.C(viewGroup2, new a());
        viewGroup2.setOnTouchListener(new Ha1.a(1));
        textView.setOnClickListener(new z(this, 2));
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void A(boolean z12) {
        View view = this.f178473c;
        if (z12) {
            view.setOnClickListener(new z(this, 0));
        } else {
            view.setOnClickListener(null);
        }
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void B(@Y61.k View view) {
        D6.w(this.f178476f);
        D6.w(this.f178482l);
        D6.w(this.f178484n);
        D6.c(this.f178475e, null, 0, null, null, 13);
        ViewGroup viewGroup = this.f178483m;
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        D6.G(viewGroup, true);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void C(boolean z12) {
        ViewGroup viewGroup = this.f178475e;
        if (z12) {
            viewGroup.getLayoutParams().height = -1;
        } else {
            viewGroup.getLayoutParams().height = -2;
        }
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void D(boolean z12) {
        D6.G(this.f178481k, z12);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void E(@Y61.l Y41.a<G0> aVar) {
        this.f178486p = aVar;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void F(@Y61.l CharSequence charSequence, @Y61.l CharSequence charSequence2, boolean z12, boolean z13) {
        D6.G(this.f178476f, (charSequence == null && charSequence2 == null && !z12) ? false : true);
        TextView textView = this.f178477g;
        textView.setText(charSequence);
        TextView textView2 = this.f178481k;
        textView2.setText(charSequence2);
        D6.G(textView, !(charSequence == null || C43066x.K(charSequence)));
        D6.G(textView2, !(charSequence == null || C43066x.K(charSequence)));
        D6.G(this.f178478h, z12);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    @Y61.k
    /* renamed from: T1, reason: from getter */
    public final FrameLayout getF178583j() {
        return this.f178479i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void U(@Y61.l Y41.a<G0> aVar) {
        this.f178487q = (N) aVar;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void d(@InterfaceC42156l int i12) {
        this.f178481k.setTextColor(i12);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void dismiss() {
        Y41.p<? super View, ? super Integer, G0> pVar = this.f178485o;
        if (pVar != null) {
            ((e) pVar).invoke(this.f178475e, 5);
        }
        Q5 q52 = new Q5(new C23503n());
        ViewGroup viewGroup = this.f178472b;
        q52.b(viewGroup);
        Q.a(viewGroup, q52.c());
        D6.w(viewGroup);
        Y41.a<G0> aVar = this.f178486p;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void f(@Y61.k View view) {
        D6.w(this.f178476f);
        FrameLayout frameLayout = this.f178482l;
        frameLayout.removeAllViews();
        D6.G(frameLayout, true);
        frameLayout.addView(view);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final FrameLayout getF178585l() {
        return this.f178480j;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void g7(int i12) {
        this.f178477g.setMaxLines(i12);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    @Y61.k
    /* renamed from: getTouchOutsideView, reason: from getter */
    public final View getF178577d() {
        return this.f178473c;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void h(int i12) {
        this.f178478h.setImageResource(i12);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final /* bridge */ /* synthetic */ Map i() {
        return null;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void l(boolean z12) {
        TextView textView = this.f178481k;
        if (z12) {
            textView.setClickable(true);
            textView.setTextColor(this.f178489s);
        } else {
            textView.setClickable(false);
            textView.setTextColor(this.f178490t);
        }
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void m(boolean z12) {
        this.f178491u = z12;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    @Y61.k
    /* renamed from: n, reason: from getter */
    public final FrameLayout getF178578e() {
        return this.f178474d;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void o(@Y61.k C23492c c23492c, @Y61.k Y41.a aVar) {
        aVar.invoke();
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void p(@Y61.k ColorStateList colorStateList) {
        this.f178481k.setTextColor(colorStateList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void q(@Y61.l Y41.a<G0> aVar) {
        this.f178488r = (N) aVar;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void r(@Y61.k C23492c c23492c, @Y61.k Y41.a aVar) {
        aVar.invoke();
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void s(@Y61.l Y41.p<? super View, ? super Integer, G0> pVar) {
        this.f178485o = pVar;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void show() {
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        ViewGroup viewGroup = this.f178472b;
        if (!viewGroup.isLaidOut() || D6.y(viewGroup)) {
            D6.H(viewGroup);
            Y41.p<? super View, ? super Integer, G0> pVar = this.f178485o;
            if (pVar != null) {
                ((e) pVar).invoke(this.f178475e, 4);
                return;
            }
            return;
        }
        Q5 q52 = new Q5(new C23503n());
        q52.b(viewGroup);
        q52.f318728c = new b();
        Q.a(viewGroup, q52.c());
        D6.H(viewGroup);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    @Y61.l
    public final Y41.a<G0> t() {
        return this.f178486p;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void u(@Y61.k Y41.a<Boolean> aVar) {
        this.f178473c.setOnClickListener(new t(1, aVar, this));
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void v(@Y61.l Drawable drawable) {
        this.f178478h.setImageDrawable(drawable);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void w(boolean z12) {
        this.f178479i.getLayoutParams().height = z12 ? -1 : -2;
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void x(boolean z12) {
        this.f178481k.setEnabled(z12);
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void a() {
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void j() {
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void j2() {
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void k() {
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void z() {
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void b(int i12) {
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void c(int i12) {
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void l2(boolean z12) {
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void setDraggable(boolean z12) {
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void y(int i12) {
    }

    @Override // com.avito.android.lib.design.bottom_sheet.q
    public final void e(boolean z12, boolean z13) {
    }
}
