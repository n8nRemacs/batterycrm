package com.avito.android.blueprints.input;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.remote.model.category_parameters.DisplayingOptions;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import t3.k0;

/* compiled from: MultiStateInputItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/input/b;", "LTV0/b;", "Lcom/avito/android/blueprints/input/z;", "Lcom/avito/android/items/d;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.blueprints.input.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28877b implements TV0.b<z, com.avito.android.items.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f105938a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f105939b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<B> f105940c = new g.a<>(R.layout.component_container_with_input, a.f105941l);

    /* compiled from: MultiStateInputItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprints/input/B;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprints/input/B;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprints.input.b$a */
    public static final class a extends N implements Y41.p<ViewGroup, View, B> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f105941l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final B invoke(ViewGroup viewGroup, View view) {
            return new B(view);
        }
    }

    @Inject
    public C28877b(@Y61.k d dVar, @Y61.k @k0 u3.l<SimpleTestGroupWithNone> lVar) {
        this.f105938a = dVar;
        this.f105939b = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f105938a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<B> b() {
        return this.f105940c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if (aVar instanceof com.avito.android.items.d) {
            DisplayingOptions f117489n = ((com.avito.android.items.d) aVar).getF117489n();
            if (!L.f(f117489n != null ? f117489n.getType() : null, "vehicleRegNumber") && !this.f105939b.f439745a.f439749b.b()) {
                return true;
            }
        }
        return false;
    }
}
