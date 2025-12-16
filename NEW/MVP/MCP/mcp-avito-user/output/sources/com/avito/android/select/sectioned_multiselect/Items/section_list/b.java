package com.avito.android.select.sectioned_multiselect.Items.section_list;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SectionedMultiselectItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_list/b;", "LTV0/b;", "Lcom/avito/android/select/sectioned_multiselect/Items/section_list/f;", "Lcom/avito/android/select/sectioned_multiselect/Items/section_list/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements TV0.b<f, com.avito.android.select.sectioned_multiselect.Items.section_list.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f266393a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f266394b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.recycler.data_aware.e f266395c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<g> f266396d = new g.a<>(R.layout.sectioned_multiselect_view, new a());

    /* compiled from: SectionedMultiselectItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/select/sectioned_multiselect/Items/section_list/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/select/sectioned_multiselect/Items/section_list/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, g> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            b bVar = b.this;
            return new g(view, bVar.f266395c, bVar.f266394b);
        }
    }

    @Inject
    public b(@k d dVar, @k @com.avito.android.select.sectioned_multiselect.tab.di.b com.avito.konveyor.a aVar, @k @com.avito.android.select.sectioned_multiselect.tab.di.b com.avito.android.recycler.data_aware.e eVar) {
        this.f266393a = dVar;
        this.f266394b = aVar;
        this.f266395c = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f266393a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f266396d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.select.sectioned_multiselect.Items.section_list.a;
    }
}
