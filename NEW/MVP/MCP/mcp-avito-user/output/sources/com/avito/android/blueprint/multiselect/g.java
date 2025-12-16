package com.avito.android.blueprint.multiselect;

import Hj.C13996a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.CustomPaddings;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishMultiselectPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprint/multiselect/g;", "Lcom/avito/android/blueprint/multiselect/c;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.v> f105593b;

    /* renamed from: c, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.v> f105594c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f105595d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f105596e;

    /* renamed from: f, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f105597f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C41981q0 f105598g;

    @Inject
    public g() {
        com.jakewharton.rxrelay3.c<ParameterElement.v> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105593b = cVar;
        com.jakewharton.rxrelay3.c<ParameterElement.v> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105594c = cVar2;
        this.f105595d = cVar;
        this.f105596e = cVar2;
        com.jakewharton.rxrelay3.c<DeepLink> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f105597f = cVar3;
        this.f105598g = new C41981q0(cVar3);
    }

    @Override // com.avito.android.blueprint.multiselect.c
    @k
    /* renamed from: I, reason: from getter */
    public final C41981q0 getF105598g() {
        return this.f105598g;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        ParameterElement.v vVar = (ParameterElement.v) aVar;
        DeepLink deepLink = vVar.f117560u;
        iVar.a60(new C13996a(vVar.f117543d, vVar.f117555p, vVar.f117556q, vVar.f117564y, null, vVar.f117557r, deepLink != null ? new f(this, deepLink) : null, vVar.f117546g, null, 272, null));
        ParameterElement.v.a aVar2 = vVar.f117551l;
        iVar.k0(new CustomPaddings(aVar2 != null ? aVar2.f117566a : null, aVar2 != null ? aVar2.f117567b : null));
        iVar.o(vVar.f117554o);
        iVar.m(vVar.f117544e);
        String str = vVar.f117544e;
        iVar.p2(!(str == null || str.length() == 0));
        iVar.K(new d(this, vVar));
        iVar.a(new e(this, vVar));
        iVar.setEnabled(vVar.f117553n);
    }

    @Override // com.avito.android.blueprint.multiselect.c
    @k
    public final z<ParameterElement.v> c() {
        return this.f105595d;
    }

    @Override // com.avito.android.blueprint.multiselect.c
    @k
    public final z<ParameterElement.v> z() {
        return this.f105596e;
    }
}
