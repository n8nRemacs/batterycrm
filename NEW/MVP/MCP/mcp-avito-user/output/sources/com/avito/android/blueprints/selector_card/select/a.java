package com.avito.android.blueprints.selector_card.select;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SelectorCardGroupBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/selector_card/select/a;", "LTV0/b;", "Lcom/avito/android/blueprints/selector_card/select/g;", "Lcom/avito/android/category_parameters/ParameterElement$C$b;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<g, ParameterElement.C.b> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c f106657a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f106658b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<i> f106659c = new g.a<>(R.layout.selector_card_group, new C3191a());

    /* compiled from: SelectorCardGroupBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprints/selector_card/select/i;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprints/selector_card/select/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprints.selector_card.select.a$a, reason: collision with other inner class name */
    public static final class C3191a extends N implements p<ViewGroup, View, i> {
        public C3191a() {
            super(2);
        }

        @Override // Y41.p
        public final i invoke(ViewGroup viewGroup, View view) {
            return new i(view, a.this.f106658b);
        }
    }

    @Inject
    public a(@k c cVar, @k com.avito.android.util.text.a aVar) {
        this.f106657a = cVar;
        this.f106658b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f106657a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f106659c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof ParameterElement.C.b) && (((ParameterElement.C.b) aVar).f117213i instanceof ParameterElement.DisplayType.s);
    }
}
