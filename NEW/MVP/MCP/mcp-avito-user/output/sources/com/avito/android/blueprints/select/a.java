package com.avito.android.blueprints.select;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.k0;

/* compiled from: MultiStateSelectItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/select/a;", "LTV0/b;", "Lcom/avito/android/blueprints/select/k;", "Lcom/avito/android/category_parameters/ParameterElement$C;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<k, ParameterElement.C> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f106582a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f106583b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f106584c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<m> f106585d = new g.a<>(R.layout.component_container_with_select, new C3188a());

    /* compiled from: MultiStateSelectItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprints/select/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprints/select/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprints.select.a$a, reason: collision with other inner class name */
    public static final class C3188a extends N implements p<ViewGroup, View, m> {
        public C3188a() {
            super(2);
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            return new m(view, a.this.f106583b, null, 4, null);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k com.avito.android.util.text.a aVar, @Y61.k @k0 u3.l<SimpleTestGroupWithNone> lVar) {
        this.f106582a = cVar;
        this.f106583b = aVar;
        this.f106584c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f106582a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<m> b() {
        return this.f106585d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (!(aVar instanceof ParameterElement.C)) {
            return false;
        }
        ParameterElement.C c12 = (ParameterElement.C) aVar;
        ParameterElement.DisplayType displayType = c12.f117213i;
        if ((displayType instanceof ParameterElement.DisplayType.Chips) || (displayType instanceof ParameterElement.DisplayType.o) || (displayType instanceof ParameterElement.DisplayType.e) || (displayType instanceof ParameterElement.DisplayType.s) || (displayType instanceof ParameterElement.DisplayType.t) || (displayType instanceof ParameterElement.DisplayType.r) || (displayType instanceof ParameterElement.DisplayType.n) || (displayType instanceof ParameterElement.DisplayType.h) || (displayType instanceof ParameterElement.DisplayType.w) || (displayType instanceof ParameterElement.DisplayType.m)) {
            return false;
        }
        SelectParameter.Displaying displaying = c12.f117223s;
        if (displaying != null && displaying.isComposeView()) {
            return false;
        }
        boolean z12 = aVar instanceof ParameterElement.C.b;
        u3.l<SimpleTestGroupWithNone> lVar = this.f106584c;
        if (z12 && ((ParameterElement.C.b) aVar).f117240I) {
            if (lVar.f439745a.f439749b.b()) {
                return false;
            }
        } else if (lVar.f439745a.f439749b.b()) {
            return false;
        }
        return true;
    }
}
