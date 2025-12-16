package com.avito.android.compose_items.chips_multiselect;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ChipsMultiselectComposeItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/compose_items/chips_multiselect/a;", "LTV0/b;", "Lcom/avito/android/compose_items/views/b;", "Lcom/avito/android/category_parameters/ParameterElement$v;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements TV0.b<com.avito.android.compose_items.views.b, ParameterElement.v> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f125361a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f125362b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<com.avito.android.compose_items.views.e> f125363c = new g.a<>(R.layout.component_container_with_composable_view, new C3722a());

    /* compiled from: ChipsMultiselectComposeItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/compose_items/views/e;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/compose_items/views/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.compose_items.chips_multiselect.a$a, reason: collision with other inner class name */
    public static final class C3722a extends N implements p<ViewGroup, View, com.avito.android.compose_items.views.e> {
        public C3722a() {
            super(2);
        }

        @Override // Y41.p
        public final com.avito.android.compose_items.views.e invoke(ViewGroup viewGroup, View view) {
            return new com.avito.android.compose_items.views.e(view, a.this.f125362b);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar) {
        this.f125361a = cVar;
        this.f125362b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f125361a;
    }

    @Override // TV0.b
    @k
    public final g.a<com.avito.android.compose_items.views.e> b() {
        return this.f125363c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        if (aVar instanceof ParameterElement.v) {
            ParameterElement.v vVar = (ParameterElement.v) aVar;
            if ((vVar.f117547h instanceof ParameterElement.DisplayType.Chips) && vVar.f117548i) {
                return true;
            }
        }
        return false;
    }
}
