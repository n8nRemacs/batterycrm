package com.avito.android.brand_global_rubricator;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.D6;
import com.avito.android.visual_rubricator.Space;
import com.avito.android.visual_rubricator.VisualRubricatorWidgetItem;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BrandGlobalRubricatorBlueprintImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/brand_global_rubricator/b;", "Lcom/avito/android/brand_global_rubricator/a;", "_avito_bx-content_widget_brand-global-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements com.avito.android.brand_global_rubricator.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final j f107427a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g.a<p> f107428b = new g.a<>(R.layout.bx_content_widget_brand_global_rubricator_layout, a.f107429l);

    /* compiled from: BrandGlobalRubricatorBlueprintImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "viewGroup", "Landroid/view/View;", "view", "Lcom/avito/android/brand_global_rubricator/p;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/brand_global_rubricator/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, p> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f107429l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final p invoke(ViewGroup viewGroup, View view) {
            return new p(view, D6.s(viewGroup));
        }
    }

    public b(@Y61.k j jVar) {
        this.f107427a = jVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f107427a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<p> b() {
        return this.f107428b;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof VisualRubricatorWidgetItem) {
            Space f327323d = ((VisualRubricatorWidgetItem) aVar).getF327323d();
            f327323d.getClass();
            if (f327323d == Space.f327306l || f327323d == Space.f327307m) {
                return true;
            }
        }
        return false;
    }
}
