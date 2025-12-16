package com.avito.android.publish.details.adapter.objects.re23;

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
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import t3.l0;

/* compiled from: ObjectsPreviewItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/details/adapter/objects/re23/a;", "LTV0/b;", "Lcom/avito/android/publish/details/adapter/objects/re23/k;", "Lcom/avito/android/category_parameters/ParameterElement$w;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a implements TV0.b<k, ParameterElement.w> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f233385a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f233386b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f233387c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g.a<l> f233388d = new g.a<>(R.layout.item_education_list_preview_re23_container, new C7082a());

    /* compiled from: ObjectsPreviewItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/details/adapter/objects/re23/l;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/details/adapter/objects/re23/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.details.adapter.objects.re23.a$a, reason: collision with other inner class name */
    public static final class C7082a extends N implements p<ViewGroup, View, l> {
        public C7082a() {
            super(2);
        }

        @Override // Y41.p
        public final l invoke(ViewGroup viewGroup, View view) {
            return new l(view, a.this.f233386b);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @Y61.k com.avito.android.util.text.a aVar, @l0 @Y61.k u3.l<SimpleTestGroupWithNone> lVar) {
        this.f233385a = cVar;
        this.f233386b = aVar;
        this.f233387c = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f233385a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<l> b() {
        return this.f233388d;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof ParameterElement.w) && !L.f(((ParameterElement.w) aVar).f117573i, "priceList") && this.f233387c.f439745a.f439749b.b();
    }
}
