package com.avito.android.blueprints.publish.date;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.blueprints.select.k;
import com.avito.android.blueprints.select.m;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.k0;
import u3.l;

/* compiled from: DateItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/publish/date/a;", "LTV0/b;", "Lcom/avito/android/blueprints/select/k;", "Lcom/avito/android/category_parameters/ParameterElement$e;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<k, ParameterElement.C29377e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f106102a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f106103b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l<SimpleTestGroupWithNone> f106104c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<m> f106105d = new g.a<>(R.layout.component_container_with_select, new C3175a());

    /* compiled from: DateItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprints/select/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprints/select/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprints.publish.date.a$a, reason: collision with other inner class name */
    public static final class C3175a extends N implements p<ViewGroup, View, m> {
        public C3175a() {
            super(2);
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            return new m(view, a.this.f106103b, null, 4, null);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k com.avito.android.util.text.a aVar, @Y61.k @k0 l<SimpleTestGroupWithNone> lVar) {
        this.f106102a = cVar;
        this.f106103b = aVar;
        this.f106104c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f106102a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<m> b() {
        return this.f106105d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof ParameterElement.C29377e) && !this.f106104c.f439745a.f439749b.b();
    }
}
