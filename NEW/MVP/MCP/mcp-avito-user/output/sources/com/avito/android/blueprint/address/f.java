package com.avito.android.blueprint.address;

import Hj.C13996a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishAddressPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/address/f;", "Lcom/avito/android/blueprint/address/c;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.C> f105368b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f105369c;

    /* renamed from: d, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f105370d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C41981q0 f105371e;

    public f() {
        com.jakewharton.rxrelay3.c<ParameterElement.C> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105368b = cVar;
        this.f105369c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<DeepLink> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105370d = cVar2;
        this.f105371e = new C41981q0(cVar2);
    }

    @Override // com.avito.android.blueprint.address.c
    @k
    /* renamed from: J, reason: from getter */
    public final C41981q0 getF105371e() {
        return this.f105371e;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        DeepLink deepLink;
        g gVar = (g) eVar;
        ParameterElement.C c12 = (ParameterElement.C) aVar;
        TipIconParameters tipIconParameters = c12.f117222r;
        gVar.a60(new C13996a(c12.f117208d, c12.f117219o, c12.f117220p, c12.f117227w, null, c12.f117209e, (tipIconParameters == null || (deepLink = tipIconParameters.getDeepLink()) == null) ? null : new e(this, deepLink), c12.f117211g, null, 272, null));
        gVar.o(c12.f117218n);
        gVar.m(c12.f117210f);
        SelectParameter.Displaying displaying = c12.f117223s;
        gVar.k0(displaying != null ? displaying.getCustomPaddings() : null);
        gVar.a(new d(this, c12));
        gVar.setEnabled(c12.f117216l);
        gVar.pb(true);
    }

    @Override // com.avito.android.blueprint.address.c
    @k
    public final z<ParameterElement.C> c() {
        return this.f105369c;
    }
}
