package com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.chips;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.ItemType;
import hs0.m;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VerticalSearchFilterChipsItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/chips/b;", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/chips/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.chips.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.d f273454a;

    /* compiled from: VerticalSearchFilterChipsItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/chips/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/adapter/chips/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, e> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f273455l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final e invoke(ViewGroup viewGroup, View view) {
            return new e(view);
        }
    }

    @Inject
    public b(@m @k com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.segmented.d dVar) {
        this.f273454a = dVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f273454a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return new g.a<>(R.layout.vertical_main_ships_item, a.f273455l);
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e) {
            if (((com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.e) aVar).f273467d == ItemType.f273437i) {
                return true;
            }
        }
        return false;
    }
}
