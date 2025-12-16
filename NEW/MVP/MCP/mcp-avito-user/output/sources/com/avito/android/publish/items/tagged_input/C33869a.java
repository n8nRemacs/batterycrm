package com.avito.android.publish.items.tagged_input;

import TV0.g;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.category_parameters.ParameterElement;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiStateInputWithTagsItemBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/tagged_input/a;", "LTV0/b;", "Lcom/avito/android/publish/items/tagged_input/A;", "Lcom/avito/android/category_parameters/ParameterElement$H;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.items.tagged_input.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C33869a implements TV0.b<A, ParameterElement.H> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33870b f237131a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u3.l<SimpleTestGroupWithNone> f237132b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final g.a<D> f237133c;

    /* compiled from: MultiStateInputWithTagsItemBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/publish/items/tagged_input/D;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/publish/items/tagged_input/D;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.publish.items.tagged_input.a$a, reason: collision with other inner class name */
    public static final class C7145a extends N implements Y41.p<ViewGroup, View, D> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ jG0.c f237134l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C7145a(jG0.c cVar) {
            super(2);
            this.f237134l = cVar;
        }

        @Override // Y41.p
        public final D invoke(ViewGroup viewGroup, View view) {
            return new D(view, new com.avito.android.ui.widget.tagged_input.f(this.f237134l));
        }
    }

    public C33869a(@Y61.k InterfaceC33870b interfaceC33870b, @Y61.k jG0.c cVar, @Y61.k u3.l<SimpleTestGroupWithNone> lVar) {
        this.f237131a = interfaceC33870b;
        this.f237132b = lVar;
        this.f237133c = new g.a<>(R.layout.component_container_with_tagged_input, new C7145a(cVar));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f237131a;
    }

    @Override // TV0.b
    @Y61.k
    public final g.a<D> b() {
        return this.f237133c;
    }

    @Override // TV0.b
    @Y61.k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@Y61.k TV0.a aVar) {
        return (aVar instanceof ParameterElement.H) && !this.f237132b.f439745a.f439749b.b();
    }
}
