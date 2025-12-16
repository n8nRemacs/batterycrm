package com.avito.android.blueprint.input;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import t3.k0;

/* compiled from: PublishInputBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/input/a;", "LTV0/b;", "Lcom/avito/android/blueprint/input/s;", "Lcom/avito/android/items/d;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<s, com.avito.android.items.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f105511a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f105512b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f105513c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<v> f105514d = new g.a<>(R.layout.view_publish_input_container, new C3158a());

    /* compiled from: PublishInputBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprint/input/v;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprint/input/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprint.input.a$a, reason: collision with other inner class name */
    public static final class C3158a extends N implements Y41.p<ViewGroup, View, v> {
        public C3158a() {
            super(2);
        }

        @Override // Y41.p
        public final v invoke(ViewGroup viewGroup, View view) {
            return new v(view, a.this.f105512b);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k com.avito.android.util.text.a aVar, @Y61.k @k0 u3.l<SimpleTestGroupWithNone> lVar) {
        this.f105511a = cVar;
        this.f105512b = aVar;
        this.f105513c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f105511a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<v> b() {
        return this.f105514d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof ParameterElement.p) {
            DisplayingOptions displayingOptions = ((ParameterElement.p) aVar).f117489n;
            if (!L.f(displayingOptions != null ? displayingOptions.getType() : null, "vehicleRegNumber") && this.f105513c.f439745a.f439749b.b()) {
                return true;
            }
        }
        return false;
    }
}
