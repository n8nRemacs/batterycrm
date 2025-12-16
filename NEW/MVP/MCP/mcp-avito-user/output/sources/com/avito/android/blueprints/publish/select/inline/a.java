package com.avito.android.blueprints.publish.select.inline;

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
import u3.l;

/* compiled from: CheckboxSelectItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/publish/select/inline/a;", "LTV0/b;", "Lcom/avito/android/blueprints/publish/select/inline/h;", "Lcom/avito/android/category_parameters/ParameterElement$C$b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<h, ParameterElement.C.b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final c f106463a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<SimpleTestGroupWithNone> f106464b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<k> f106465c = new g.a<>(R.layout.publish_checkbox_select, C3183a.f106466l);

    /* compiled from: CheckboxSelectItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprints/publish/select/inline/k;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprints/publish/select/inline/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprints.publish.select.inline.a$a, reason: collision with other inner class name */
    public static final class C3183a extends N implements p<ViewGroup, View, k> {

        /* renamed from: l, reason: collision with root package name */
        public static final C3183a f106466l = new C3183a();

        public C3183a() {
            super(2);
        }

        @Override // Y41.p
        public final k invoke(ViewGroup viewGroup, View view) {
            return new k(view);
        }
    }

    @Inject
    public a(@Y61.k c cVar, @l0 @Y61.k l<SimpleTestGroupWithNone> lVar) {
        this.f106463a = cVar;
        this.f106464b = lVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f106463a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<k> b() {
        return this.f106465c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof ParameterElement.C.b) && (((ParameterElement.C.b) aVar).f117213i instanceof ParameterElement.DisplayType.e) && !this.f106464b.f439745a.f439749b.b();
    }
}
