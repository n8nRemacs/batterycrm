package com.avito.android.select.sectioned_multiselect.container;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.viewpager2.widget.ViewPager2;
import com.avito.android.R;
import com.avito.android.lib.deprecated_design.tab.adapter.j;
import com.avito.android.lib.deprecated_design.tab.l;
import com.avito.android.lib.design.tab_layout.AvitoTabLayout;
import com.avito.android.select.sectioned_multiselect.container.tab_layout.ContainerTabItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kq0.C43487a;

/* compiled from: SectionedMultiselectContainerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/h;", "Lcom/avito/android/select/sectioned_multiselect/container/g;", "a", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43487a f266458a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j<ContainerTabItem> f266459b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.select.sectioned_multiselect.container.a f266460c;

    /* renamed from: d, reason: collision with root package name */
    public final int f266461d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AvitoTabLayout f266462e;

    /* compiled from: SectionedMultiselectContainerView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/h$a;", "", "<init>", "()V", "", "DEFAULT_TAB_INDEX", "I", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public h(@k View view, @k C43487a c43487a, @k j<ContainerTabItem> jVar, @k com.avito.android.select.sectioned_multiselect.container.a aVar, int i12) {
        this.f266458a = c43487a;
        this.f266459b = jVar;
        this.f266460c = aVar;
        this.f266461d = i12;
        View viewFindViewById = view.findViewById(R.id.sectioned_container_view_pager);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
        }
        ViewPager2 viewPager2 = (ViewPager2) viewFindViewById;
        AvitoTabLayout avitoTabLayout = (AvitoTabLayout) view.findViewById(R.id.sectioned_tab_layout);
        this.f266462e = avitoTabLayout;
        viewPager2.setAdapter(aVar);
        l.d(avitoTabLayout, c43487a);
        com.avito.android.lib.design.tab_layout.util.b.b(viewPager2, avitoTabLayout);
        viewPager2.setUserInputEnabled(false);
    }
}
