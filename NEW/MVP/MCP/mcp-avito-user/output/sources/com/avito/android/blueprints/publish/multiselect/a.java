package com.avito.android.blueprints.publish.multiselect;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.blueprints.select.m;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import t3.l0;
import u3.l;

/* compiled from: MultiselectItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/publish/multiselect/a;", "LTV0/b;", "Lcom/avito/android/blueprints/select/m;", "Lcom/avito/android/category_parameters/ParameterElement$v;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<m, ParameterElement.v> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f106338a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f106339b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f106340c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<m> f106341d = new g.a<>(R.layout.component_container_with_select, new C3179a());

    /* compiled from: MultiselectItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprints/select/m;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprints/select/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprints.publish.multiselect.a$a, reason: collision with other inner class name */
    public static final class C3179a extends N implements p<ViewGroup, View, m> {
        public C3179a() {
            super(2);
        }

        @Override // Y41.p
        public final m invoke(ViewGroup viewGroup, View view) {
            return new m(view, a.this.f106339b, null, 4, null);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar, @l0 @k l<SimpleTestGroupWithNone> lVar) {
        this.f106338a = cVar;
        this.f106339b = aVar;
        this.f106340c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f106338a;
    }

    @Override // TV0.b
    @k
    public final g.a<m> b() {
        return this.f106341d;
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
            ParameterElement.DisplayType displayType = vVar.f117547h;
            if (!(displayType instanceof ParameterElement.DisplayType.Chips) && !(displayType instanceof ParameterElement.DisplayType.k) && !vVar.f117548i && !this.f106340c.f439745a.f439749b.b()) {
                return true;
            }
        }
        return false;
    }
}
