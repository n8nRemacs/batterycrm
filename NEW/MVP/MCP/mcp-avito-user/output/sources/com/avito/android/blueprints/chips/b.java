package com.avito.android.blueprints.chips;

import TV0.g;
import Y41.p;
import Y61.k;
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
import u3.l;

/* compiled from: ChipsSelectItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/chips/b;", "LTV0/b;", "Lcom/avito/android/blueprints/chips/g;", "Lcom/avito/android/category_parameters/ParameterElement$C$b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements TV0.b<g, ParameterElement.C.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f105840a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f105841b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f105842c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<i> f105843d = new g.a<>(R.layout.chips_item_view, new a());

    /* compiled from: ChipsSelectItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprints/chips/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprints/chips/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<ViewGroup, View, i> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view, b.this.f105841b);
        }
    }

    @Inject
    public b(@k d dVar, @k com.avito.android.util.text.a aVar, @k @k0 l<SimpleTestGroupWithNone> lVar) {
        this.f105840a = dVar;
        this.f105841b = aVar;
        this.f105842c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f105840a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f105843d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        SelectParameter.Displaying displaying;
        if (aVar instanceof ParameterElement.C.b) {
            ParameterElement.C.b bVar = (ParameterElement.C.b) aVar;
            if ((bVar.f117213i instanceof ParameterElement.DisplayType.Chips) && (((displaying = bVar.f117223s) == null || !displaying.isComposeView()) && !this.f105842c.f439745a.f439749b.b())) {
                return true;
            }
        }
        return false;
    }
}
