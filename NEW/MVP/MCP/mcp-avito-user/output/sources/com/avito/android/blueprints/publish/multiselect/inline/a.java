package com.avito.android.blueprints.publish.multiselect.inline;

import TV0.g;
import Y41.p;
import Y61.k;
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
import u3.l;

/* compiled from: PublishInlineMultiselectItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/publish/multiselect/inline/a;", "LTV0/b;", "Lcom/avito/android/blueprints/publish/multiselect/inline/f;", "Lcom/avito/android/category_parameters/ParameterElement$v;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<f, ParameterElement.v> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f106364a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<SimpleTestGroupWithNone> f106365b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<g> f106366c = new g.a<>(R.layout.publish_inline_multiselect_item_view, C3180a.f106367l);

    /* compiled from: PublishInlineMultiselectItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprints/publish/multiselect/inline/g;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprints/publish/multiselect/inline/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprints.publish.multiselect.inline.a$a, reason: collision with other inner class name */
    public static final class C3180a extends N implements p<ViewGroup, View, g> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3180a f106367l = new C3180a();

        public C3180a() {
            super(2);
        }

        @Override // Y41.p
        public final g invoke(ViewGroup viewGroup, View view) {
            return new g(view);
        }
    }

    @Inject
    public a(@k c cVar, @l0 @k l<SimpleTestGroupWithNone> lVar) {
        this.f106364a = cVar;
        this.f106365b = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f106364a;
    }

    @Override // TV0.b
    @k
    public final g.a<g> b() {
        return this.f106366c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof ParameterElement.v) && (((ParameterElement.v) aVar).f117547h instanceof ParameterElement.DisplayType.k) && !this.f106365b.f439745a.f439749b.b();
    }
}
