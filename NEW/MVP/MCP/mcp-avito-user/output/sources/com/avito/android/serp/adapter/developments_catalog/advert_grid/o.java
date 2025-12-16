package com.avito.android.serp.adapter.developments_catalog.advert_grid;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.rich_snippets.realty.DevelopmentItem;
import com.facebook.drawee.view.SimpleDraweeView;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DevelopmentItemMainGridBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/advert_grid/o;", "LTV0/b;", "Lcom/avito/android/serp/adapter/developments_catalog/advert_grid/m;", "Lcom/avito/android/serp/adapter/rich_snippets/realty/DevelopmentItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o implements TV0.b<m, DevelopmentItem> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final i f269842a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f269843b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<q> f269844c = new g.a<>(R.layout.development_item_main_grid, new a());

    /* compiled from: DevelopmentItemMainGridBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/serp/adapter/developments_catalog/advert_grid/q;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/serp/adapter/developments_catalog/advert_grid/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, q> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final q invoke(ViewGroup viewGroup, View view) {
            q qVar = new q(view, o.this.f269843b);
            SimpleDraweeView simpleDraweeView = qVar.f269835e;
            simpleDraweeView.getLayoutParams().height = -2;
            simpleDraweeView.setAspectRatio(1.0f);
            return qVar;
        }
    }

    @Inject
    public o(@Y61.k i iVar, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        this.f269842a = iVar;
        this.f269843b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f269842a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<q> b() {
        return this.f269844c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof DevelopmentItem) {
            DevelopmentItem developmentItem = (DevelopmentItem) aVar;
            if (developmentItem.f270900i == SerpViewType.f268583c && developmentItem.f270901j.isGrid()) {
                return true;
            }
        }
        return false;
    }
}
