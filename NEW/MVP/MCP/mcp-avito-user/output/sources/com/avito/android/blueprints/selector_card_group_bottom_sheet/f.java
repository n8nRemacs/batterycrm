package com.avito.android.blueprints.selector_card_group_bottom_sheet;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectorCardGroupBottomSheetBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/selector_card_group_bottom_sheet/f;", "LTV0/b;", "Lcom/avito/android/blueprints/select/k;", "Lcom/avito/android/category_parameters/ParameterElement$F;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements TV0.b<com.avito.android.blueprints.select.k, ParameterElement.F> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final l f106687a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f106688b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<com.avito.android.blueprints.select.m> f106689c = new g.a<>(R.layout.component_container_with_select, new a());

    /* compiled from: SelectorCardGroupBottomSheetBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprints/select/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprints/select/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<ViewGroup, View, com.avito.android.blueprints.select.m> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.blueprints.select.m invoke(ViewGroup viewGroup, View view) {
            f fVar = f.this;
            return new com.avito.android.blueprints.select.m(view, fVar.f106688b, new e(fVar));
        }
    }

    @Inject
    public f(@Y61.k l lVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f106687a = lVar;
        this.f106688b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f106687a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<com.avito.android.blueprints.select.m> b() {
        return this.f106689c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return aVar instanceof ParameterElement.F;
    }
}
