package com.avito.android.search.filter.adapter.double_select;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.search.filter.converter.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DoubleSelectItemBlueprint.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/double_select/b;", "Lcom/avito/android/search/filter/adapter/double_select/a;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.search.filter.adapter.double_select.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f262269a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> f262270b = new g.a<>(R.layout.filter_screen_double_select_view, a.f262271l);

    /* compiled from: DoubleSelectItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/search/filter/adapter/double_select/r;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/search/filter/adapter/double_select/r;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, r> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f262271l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final r invoke(ViewGroup viewGroup, View view) {
            return new r(view);
        }
    }

    @Inject
    public b(@Y61.k d dVar) {
        this.f262269a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f262269a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f262270b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ParameterElement.v.a;
    }
}
