package com.avito.android.theme_settings;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.serp.adapter.Y0;
import com.avito.android.serp.adapter.h1;
import com.avito.android.theme_settings.di.c;
import com.avito.android.theme_settings.viewmodel.e;
import com.avito.konveyor.adapter.j;
import com.google.common.collect.H1;
import e11.ViewOnClickListenerC39879j1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import mE0.C43954a;

/* compiled from: ThemeSettingsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/theme_settings/ThemeSettingsFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ThemeSettingsFragment extends Fragment implements InterfaceC28477j.b {

    /* renamed from: o0, reason: collision with root package name */
    @k
    public static final a f301289o0 = new a(null);

    /* renamed from: f0, reason: collision with root package name */
    @Inject
    public j f301290f0;

    /* renamed from: g0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f301291g0;

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public e f301292h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public H1 f301293i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public h1 f301294j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public GridLayoutManager.c f301295k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public Y0 f301296l0;

    /* renamed from: m0, reason: collision with root package name */
    public RecyclerView f301297m0;

    /* renamed from: n0, reason: collision with root package name */
    public Toolbar f301298n0;

    /* compiled from: ThemeSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/theme_settings/ThemeSettingsFragment$a;", "", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(@k Context context) {
        super.onAttach(context);
        com.avito.android.theme_settings.di.a.a().a(this, context, (c) C29972i.a(C29972i.b(this), c.class)).a(this);
        e eVar = this.f301292h0;
        if (eVar == null) {
            eVar = null;
        }
        H1 h12 = this.f301293i0;
        eVar.a(h12 != null ? h12 : null);
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        return layoutInflater.inflate(R.layout.theme_settings_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        view.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(2, 1);
        GridLayoutManager.c cVar = this.f301295k0;
        if (cVar == null) {
            cVar = null;
        }
        gridLayoutManager.f53667M = cVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        this.f301297m0 = recyclerView;
        j jVar = this.f301290f0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        RecyclerView recyclerView2 = this.f301297m0;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView3 = this.f301297m0;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        Context contextRequireContext = requireContext();
        C43954a c43954a = new C43954a();
        c43954a.f414432b = contextRequireContext.getResources().getDimensionPixelSize(R.dimen.list_padding);
        c43954a.f414433c = contextRequireContext.getResources().getDimensionPixelSize(R.dimen.list_spacing_horizontal);
        c43954a.f414434d = contextRequireContext.getResources().getDimensionPixelSize(R.dimen.list_spacing_vertical);
        recyclerView3.l(c43954a, -1);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.f301298n0 = toolbar;
        toolbar.setTitle(R.string.ui_theme);
        Toolbar toolbar2 = this.f301298n0;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes = toolbar2.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.navigationIcon});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, R.drawable.ic_back_24_blue);
        typedArrayObtainStyledAttributes.recycle();
        toolbar2.setNavigationIcon(resourceId);
        Toolbar toolbar3 = this.f301298n0;
        if (toolbar3 == null) {
            toolbar3 = null;
        }
        toolbar3.setNavigationOnClickListener(new ViewOnClickListenerC39879j1(this, 5));
        e eVar = this.f301292h0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.getF301385O().observe(getViewLifecycleOwner(), new L91.e(this, 12));
        e eVar2 = this.f301292h0;
        (eVar2 != null ? eVar2 : null).Qc();
    }
}
