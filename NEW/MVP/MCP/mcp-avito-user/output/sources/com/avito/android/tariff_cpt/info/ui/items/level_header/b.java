package com.avito.android.tariff_cpt.info.ui.items.level_header;

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

/* compiled from: CptInfoLevelHeaderItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/level_header/b;", "LTV0/b;", "Lcom/avito/android/tariff_cpt/info/ui/items/level_header/i;", "Lcom/avito/android/tariff_cpt/info/ui/items/level_header/a;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements TV0.b<i, com.avito.android.tariff_cpt.info.ui.items.level_header.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f298403a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f298404b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<j> f298405c = new g.a<>(R.layout.cpt_info_level_header_item, new a());

    /* compiled from: CptInfoLevelHeaderItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/tariff_cpt/info/ui/items/level_header/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/tariff_cpt/info/ui/items/level_header/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, j> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, b.this.f298404b);
        }
    }

    @Inject
    public b(@k d dVar, @k com.avito.android.util.text.a aVar) {
        this.f298403a = dVar;
        this.f298404b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f298403a;
    }

    @Override // TV0.b
    @k
    public final g.a<j> b() {
        return this.f298405c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof com.avito.android.tariff_cpt.info.ui.items.level_header.a;
    }
}
