package com.avito.android.extended_profile_universal_widget_edit.edit;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.camera.camera2.internal.G;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.extended_profile_ui_components.InputWithCounter;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView;
import com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView;
import com.avito.android.extended_profile_universal_widget_edit.UniversalWidgetEditArguments;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.ComponentType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.segmented_control.SegmentedControl;
import com.avito.android.lib.util.y;
import com.avito.android.util.C35835l0;
import com.avito.android.util.y6;
import iB.InterfaceC41263a;
import j.InterfaceC42165v;
import jB.InterfaceC42227a;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: UniversalWidgetEditView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/edit/g;", "Lcom/avito/android/extended_profile_universal_widget_edit/edit/d;", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements com.avito.android.extended_profile_universal_widget_edit.edit.d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f153828a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f153829b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetEditArguments f153830c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n f153831d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC42227a, G0> f153832e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final NavBar f153833f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f153834g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetBlockView f153835h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetBlockView f153836i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetBlockView f153837j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final UniversalWidgetFourBlocksView f153838k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f153839l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ScrollView f153840m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ArrayList f153841n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile_ui_components.d f153842o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ImageView f153843p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f153844q;

    /* compiled from: UniversalWidgetEditView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f153832e.invoke(new InterfaceC42227a.d(2));
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetEditView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Integer, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            g.this.f153832e.invoke(new InterfaceC42227a.c(num.intValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetEditView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Integer, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Integer num) {
            g.this.f153832e.invoke(new InterfaceC42227a.d(num.intValue()));
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetEditView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f153832e.invoke(InterfaceC42227a.h.f405463a);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetEditView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f153832e.invoke(new InterfaceC42227a.d(0));
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetEditView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f153832e.invoke(new InterfaceC42227a.d(1));
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetEditView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LjB/a;", "it", "Lkotlin/G0;", "invoke", "(LjB/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_universal_widget_edit.edit.g$g, reason: collision with other inner class name */
    public static final class C4491g extends N implements Y41.l<InterfaceC42227a, G0> {
        public C4491g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC42227a interfaceC42227a) {
            g.this.f153832e.invoke(interfaceC42227a);
            return G0.f406611a;
        }
    }

    /* compiled from: UniversalWidgetEditView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            g.this.f153832e.invoke(InterfaceC42227a.b.f405455a);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@Y61.k View view, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k UniversalWidgetEditArguments universalWidgetEditArguments, @Y61.k n nVar, @Y61.k com.avito.android.util.text.a aVar, @Y61.k Y41.l<? super InterfaceC42227a, G0> lVar) {
        this.f153828a = view;
        this.f153829b = screenPerformanceTracker;
        this.f153830c = universalWidgetEditArguments;
        this.f153831d = nVar;
        this.f153832e = lVar;
        View viewFindViewById = view.findViewById(R.id.extended_profile_universal_widget_edit_nav_bar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.nav_bar.NavBar");
        }
        NavBar navBar = (NavBar) viewFindViewById;
        this.f153833f = navBar;
        View viewFindViewById2 = view.findViewById(R.id.extended_profile_universal_widget_edit_progress);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f153834g = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.universal_widget_edit_first_block);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView");
        }
        UniversalWidgetBlockView universalWidgetBlockView = (UniversalWidgetBlockView) viewFindViewById3;
        this.f153835h = universalWidgetBlockView;
        View viewFindViewById4 = view.findViewById(R.id.universal_widget_edit_second_block);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView");
        }
        UniversalWidgetBlockView universalWidgetBlockView2 = (UniversalWidgetBlockView) viewFindViewById4;
        this.f153836i = universalWidgetBlockView2;
        View viewFindViewById5 = view.findViewById(R.id.universal_widget_edit_third_block);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetBlockView");
        }
        UniversalWidgetBlockView universalWidgetBlockView3 = (UniversalWidgetBlockView) viewFindViewById5;
        this.f153837j = universalWidgetBlockView3;
        View viewFindViewById6 = view.findViewById(R.id.universal_widget_edit_four_blocks);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.extended_profile_ui_components.universal_widget.UniversalWidgetFourBlocksView");
        }
        UniversalWidgetFourBlocksView universalWidgetFourBlocksView = (UniversalWidgetFourBlocksView) viewFindViewById6;
        this.f153838k = universalWidgetFourBlocksView;
        View viewFindViewById7 = view.findViewById(R.id.universal_widget_settings_container);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f153839l = (LinearLayout) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.extended_profile_universal_widget_save_button);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.universal_widget_section_scroll_view);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ScrollView");
        }
        this.f153840m = (ScrollView) viewFindViewById9;
        this.f153841n = new ArrayList();
        this.f153842o = new com.avito.android.extended_profile_ui_components.d(view.getContext(), y6.b(16), aVar, new C4491g(), new h());
        navBar.c(R.attr.ic_close24, new d());
        ImageView imageView = new ImageView(view.getContext());
        imageView.setImageResource(R.drawable.ic_universal_widget_invisible_blocked);
        imageView.setPadding(y6.b(8), y6.b(8), y6.b(8), y6.b(8));
        this.f153843p = imageView;
        ImageView imageView2 = new ImageView(view.getContext());
        imageView2.setImageResource(R.drawable.ic_universal_widget_delete_section);
        imageView2.setPadding(y6.b(8), y6.b(8), y6.b(8), y6.b(8));
        imageView2.setOnClickListener(new com.avito.android.extended_profile_universal_widget_edit.edit.f(this, 0));
        navBar.setActions(imageView, imageView2);
        com.avito.android.lib.design.button.b.a(button, universalWidgetEditArguments.f153657g.getSaveSectionActionButton(), false);
        button.setOnClickListener(new com.avito.android.extended_profile_universal_widget_edit.edit.f(this, 1));
        universalWidgetBlockView.setOnClickListener(new com.avito.android.extended_profile_universal_widget_edit.edit.f(this, 2));
        universalWidgetBlockView.setOnRemoveClickListener(new e());
        universalWidgetBlockView2.setOnClickListener(new com.avito.android.extended_profile_universal_widget_edit.edit.f(this, 3));
        universalWidgetBlockView2.setOnRemoveClickListener(new f());
        universalWidgetBlockView3.setOnClickListener(new com.avito.android.extended_profile_universal_widget_edit.edit.f(this, 4));
        universalWidgetBlockView3.setOnRemoveClickListener(new a());
        universalWidgetFourBlocksView.setOnBlockClickListener(new b());
        universalWidgetFourBlocksView.setOnRemoveClickListener(new c());
    }

    public final CharSequence a(@InterfaceC42165v Integer num, String str) {
        Drawable drawableA;
        Drawable drawable = null;
        if (num != null && (drawableA = C43852a.a(this.f153828a.getContext(), num.intValue())) != null) {
            drawableA.setBounds(0, 0, drawableA.getIntrinsicWidth(), drawableA.getIntrinsicHeight());
            drawable = drawableA;
        }
        int iB2 = str.length() > 0 ? y6.b(4) : y6.b(0);
        if (drawable == null) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(G.f("__", str));
        spannableStringBuilder.setSpan(new y(drawable), 0, 1, 33);
        spannableStringBuilder.setSpan(new PK0.h(iB2), 1, 2, 33);
        return spannableStringBuilder;
    }

    public final ViewGroup b(InterfaceC41263a interfaceC41263a) throws Resources.NotFoundException {
        boolean z12 = interfaceC41263a instanceof InterfaceC41263a.c;
        View view = this.f153828a;
        if (z12) {
            InterfaceC41263a.c cVar = (InterfaceC41263a.c) interfaceC41263a;
            InputWithCounter inputWithCounter = new InputWithCounter(view.getContext(), null, 0, 6, null);
            inputWithCounter.setInputAppearance(R.style.InputLWhiteBackground);
            String str = cVar.f398424a;
            InputWithCounter.a(inputWithCounter, str);
            String str2 = cVar.f398427d;
            if (str2 == null) {
                str = null;
            }
            String str3 = str;
            inputWithCounter.setState(new InputWithCounter.a(cVar.f398425b, false, cVar.f398426c, str3, str2, false, null, false, 224, null));
            inputWithCounter.f153303b.b(new s("", new com.avito.android.extended_profile_universal_widget_edit.edit.h(this, cVar)));
            return inputWithCounter;
        }
        if (!(interfaceC41263a instanceof InterfaceC41263a.d)) {
            if (!(interfaceC41263a instanceof InterfaceC41263a.C11369a)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC41263a.C11369a c11369a = (InterfaceC41263a.C11369a) interfaceC41263a;
            Input input = new Input(view.getContext(), null, 0, 0, 14, null);
            input.setAppearance(R.style.InputLWhiteBackground);
            InterfaceC41263a.b bVar = (InterfaceC41263a.b) c11369a.f398418a.get(c11369a.f398419b);
            Input.t(input, a(Integer.valueOf(bVar.f398423c), bVar.f398422b), false, 6);
            input.setRightIcon(C35835l0.h(R.attr.ic_arrowDown20, input.getRootView().getContext()));
            input.setComponentType(ComponentType.f179284e);
            input.setOnClickListener(new com.avito.android.extended_profile_universal_widget_edit.edit.e(this, c11369a, 1));
            return input;
        }
        InterfaceC41263a.d dVar = (InterfaceC41263a.d) interfaceC41263a;
        SegmentedControl segmentedControl = new SegmentedControl(view.getContext(), null, 0, R.style.UniversalWidgetSegmentedControl, 6, null);
        Iterable<InterfaceC41263a.e> iterable = dVar.f398428a;
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
        for (InterfaceC41263a.e eVar : iterable) {
            arrayList.add(new SegmentedControl.c(true, a(eVar.f398432c, eVar.f398431b)));
        }
        segmentedControl.r(dVar.f398429b, arrayList);
        segmentedControl.setAppearance(R.style.UniversalWidgetSegmentedControl);
        segmentedControl.setPadding(y6.b(4), y6.b(4), y6.b(4), y6.b(4));
        segmentedControl.setOnSegmentClickListener(new i(this, dVar));
        return segmentedControl;
    }
}
