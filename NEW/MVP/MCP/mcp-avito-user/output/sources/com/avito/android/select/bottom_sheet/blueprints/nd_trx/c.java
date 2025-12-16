package com.avito.android.select.bottom_sheet.blueprints.nd_trx;

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

/* compiled from: NdTrxEntryPointItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/nd_trx/c;", "Lcom/avito/android/select/bottom_sheet/blueprints/nd_trx/b;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f265163a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<com.avito.konveyor.adapter.b> f265164b = new g.a<>(R.layout.nd_trx_entry_point_list_item, a.f265165l);

    /* compiled from: NdTrxEntryPointItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/konveyor/adapter/b;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/konveyor/adapter/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, com.avito.konveyor.adapter.b> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f265165l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.konveyor.adapter.b invoke(ViewGroup viewGroup, View view) {
            return new i(view);
        }
    }

    @Inject
    public c(@k e eVar) {
        this.f265163a = eVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f265163a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.konveyor.adapter.b> b() {
        return this.f265164b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.select.bottom_sheet.blueprints.nd_trx.a;
    }
}
