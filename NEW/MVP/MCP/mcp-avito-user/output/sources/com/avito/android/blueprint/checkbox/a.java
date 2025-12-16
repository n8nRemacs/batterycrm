package com.avito.android.blueprint.checkbox;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.l0;

/* compiled from: PublishCheckboxBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/checkbox/a;", "LTV0/b;", "Lcom/avito/android/blueprint/checkbox/j;", "Lcom/avito/android/category_parameters/ParameterElement$C$b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<j, ParameterElement.C.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f105374a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f105375b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f105376c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f105377d = new g.a<>(R.layout.view_publish_checkbox_container, new C3154a());

    /* compiled from: PublishCheckboxBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprint/checkbox/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprint/checkbox/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprint.checkbox.a$a, reason: collision with other inner class name */
    public static final class C3154a extends N implements p<ViewGroup, View, k> {
        public C3154a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return new k(view, a.this.f105375b);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k com.avito.android.util.text.a aVar, @l0 @Y61.k u3.l<SimpleTestGroupWithNone> lVar) {
        this.f105374a = cVar;
        this.f105375b = aVar;
        this.f105376c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f105374a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f105377d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof ParameterElement.C.b) && (((ParameterElement.C.b) aVar).f117213i instanceof ParameterElement.DisplayType.e) && this.f105376c.f439745a.f439749b.b();
    }
}
