package com.avito.android.publish.details.adapter.objects;

import TV0.g;
import Y41.p;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import t3.l0;

/* compiled from: MultiStateObjectsItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/a;", "LTV0/b;", "Lcom/avito/android/publish/details/adapter/objects/i;", "Lcom/avito/android/category_parameters/ParameterElement$w;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<i, ParameterElement.w> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final b f233286a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f233287b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f233288c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<j> f233289d = new g.a<>(R.layout.objects_item_view, new C7079a());

    /* compiled from: MultiStateObjectsItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/details/adapter/objects/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/details/adapter/objects/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.adapter.objects.a$a, reason: collision with other inner class name */
    public static final class C7079a extends N implements p<ViewGroup, View, j> {
        public C7079a() {
            super(2);
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(view, a.this.f233287b);
        }
    }

    public a(@Y61.k b bVar, @Y61.k com.avito.android.util.text.a aVar, @l0 @Y61.k u3.l<SimpleTestGroupWithNone> lVar) {
        this.f233286a = bVar;
        this.f233287b = aVar;
        this.f233288c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f233286a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<j> b() {
        return this.f233289d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        if ((aVar instanceof ParameterElement.w) && !this.f233288c.f439745a.f439749b.b()) {
            String str = ((ParameterElement.w) aVar).f117573i;
            if (!L.f(str, "priceList") && !L.f(str, "educationList")) {
                return true;
            }
        }
        return false;
    }
}
