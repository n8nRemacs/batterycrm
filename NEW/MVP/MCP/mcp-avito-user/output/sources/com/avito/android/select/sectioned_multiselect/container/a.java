package com.avito.android.select.sectioned_multiselect.container;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.lib.deprecated_design.tab.adapter.j;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.select.sectioned_multiselect.container.tab_layout.ContainerTabItem;
import com.avito.android.select.sectioned_multiselect.tab.SectionedMultiselectTabFragment;
import com.avito.android.select.sectioned_multiselect.tab.SectionedMultiselectTabParams;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContainerPagerAdapter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/container/a;", "Landroidx/viewpager2/adapter/b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends androidx.viewpager2.adapter.b {

    /* renamed from: k, reason: collision with root package name */
    @k
    public final String f266427k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final j<ContainerTabItem> f266428l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final SearchParams f266429m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f266430n;

    @Inject
    public a(@k Fragment fragment, @k @com.avito.android.select.sectioned_multiselect.a String str, @k j<ContainerTabItem> jVar, @l SearchParams searchParams, boolean z12) {
        super(fragment);
        this.f266427k = str;
        this.f266428l = jVar;
        this.f266429m = searchParams;
        this.f266430n = z12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f266428l.getCount();
    }

    @Override // androidx.viewpager2.adapter.b
    @k
    public final Fragment l(int i12) {
        SectionedMultiselectTabFragment.a aVar = SectionedMultiselectTabFragment.f266694r0;
        SectionedMultiselectTabParams sectionedMultiselectTabParams = new SectionedMultiselectTabParams(this.f266427k, this.f266428l.getItem(i12).f266463d, this.f266429m, this.f266430n);
        aVar.getClass();
        SectionedMultiselectTabFragment sectionedMultiselectTabFragment = new SectionedMultiselectTabFragment();
        sectionedMultiselectTabFragment.f266699q0.setValue(sectionedMultiselectTabFragment, SectionedMultiselectTabFragment.f266695s0[0], sectionedMultiselectTabParams);
        return sectionedMultiselectTabFragment;
    }
}
