package com.avito.android.blueprints.selector_card.multiselect;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import bj.InterfaceC25659b;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import gj.InterfaceC40691b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MultiselectSelectorCardGroupBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/selector_card/multiselect/a;", "LTV0/b;", "Lcom/avito/android/blueprints/selector_card/multiselect/i;", "Lcom/avito/android/category_parameters/ParameterElement$E;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements TV0.b<i, ParameterElement.E> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f106627a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g.a<j> f106628b;

    /* compiled from: MultiselectSelectorCardGroupBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/blueprints/selector_card/multiselect/j;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/blueprints/selector_card/multiselect/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.blueprints.selector_card.multiselect.a$a, reason: collision with other inner class name */
    public static final class C3190a extends N implements p<ViewGroup, View, j> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC40691b f106629l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC25659b f106630m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3190a(InterfaceC40691b interfaceC40691b, InterfaceC25659b interfaceC25659b) {
            super(2);
            this.f106629l = interfaceC40691b;
            this.f106630m = interfaceC25659b;
        }

        @Override // Y41.p
        public final j invoke(ViewGroup viewGroup, View view) {
            return new j(this.f106629l, this.f106630m, view);
        }
    }

    @Inject
    public a(@k e eVar, @k InterfaceC40691b interfaceC40691b, @k InterfaceC25659b interfaceC25659b) {
        this.f106627a = eVar;
        this.f106628b = new g.a<>(R.layout.multiselect_selector_card_group, new C3190a(interfaceC40691b, interfaceC25659b));
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f106627a;
    }

    @Override // TV0.b
    @k
    public final g.a<j> b() {
        return this.f106628b;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof ParameterElement.E;
    }
}
