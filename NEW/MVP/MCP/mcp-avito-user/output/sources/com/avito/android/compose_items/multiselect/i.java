package com.avito.android.compose_items.multiselect;

import JO.m;
import Y61.k;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import com.avito.android.Q1;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.util.InterfaceC35807h4;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: MultiselectComposeItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/compose_items/multiselect/i;", "Lcom/avito/android/compose_items/multiselect/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends c {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f125414d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35807h4 f125415e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Q1 f125416f;

    /* renamed from: g, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.v> f125417g;

    /* renamed from: h, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.v> f125418h;

    /* renamed from: i, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<Q<ParameterElement.v, m>> f125419i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final C41981q0 f125420j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final C41981q0 f125421k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final C41981q0 f125422l;

    @Inject
    public i(@k com.avito.android.util.text.a aVar, @k InterfaceC35807h4 interfaceC35807h4, @k Q1 q12) {
        this.f125414d = aVar;
        this.f125415e = interfaceC35807h4;
        this.f125416f = q12;
        com.jakewharton.rxrelay3.c<ParameterElement.v> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f125417g = cVar;
        com.jakewharton.rxrelay3.c<ParameterElement.v> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f125418h = cVar2;
        com.jakewharton.rxrelay3.c<Q<ParameterElement.v, m>> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f125419i = cVar3;
        this.f125420j = new C41981q0(cVar);
        this.f125421k = new C41981q0(cVar2);
        this.f125422l = new C41981q0(cVar3);
    }

    @Override // com.avito.android.compose_items.views.g
    @k
    public final C22096n O(@k ParameterElement.v vVar) {
        return new C22096n(-1541066786, new h(vVar, this), true);
    }

    @Override // com.avito.android.compose_items.views.g
    @k
    /* renamed from: V, reason: from getter */
    public final Q1 getF125416f() {
        return this.f125416f;
    }

    @Override // com.avito.android.compose_items.views.g
    @k
    /* renamed from: Y, reason: from getter */
    public final InterfaceC35807h4 getF125415e() {
        return this.f125415e;
    }

    @Override // com.avito.android.compose_items.multiselect.c
    @k
    public final z<ParameterElement.v> c() {
        return this.f125420j;
    }

    @Override // com.avito.android.compose_items.multiselect.c
    @k
    /* renamed from: g0, reason: from getter */
    public final C41981q0 getF125422l() {
        return this.f125422l;
    }

    @Override // com.avito.android.compose_items.views.g
    @k
    /* renamed from: k, reason: from getter */
    public final com.avito.android.util.text.a getF125414d() {
        return this.f125414d;
    }

    @Override // com.avito.android.compose_items.multiselect.c
    @k
    public final z<ParameterElement.v> z() {
        return this.f125421k;
    }
}
