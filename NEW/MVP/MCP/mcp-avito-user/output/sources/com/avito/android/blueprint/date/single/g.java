package com.avito.android.blueprint.date.single;

import Hj.C13996a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.category_parameters.SelectionType;
import com.avito.android.util.D0;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDatePresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprint/date/single/g;", "Lcom/avito/android/blueprint/date/single/c;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final D0 f105497b;

    /* renamed from: c, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.C29377e> f105498c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C41981q0 f105499d;

    /* renamed from: e, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.C29377e> f105500e;

    /* renamed from: f, reason: collision with root package name */
    public final C41981q0 f105501f;

    /* renamed from: g, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<DeepLink> f105502g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C41981q0 f105503h;

    @Inject
    public g(@k D0 d02) {
        this.f105497b = d02;
        com.jakewharton.rxrelay3.c<ParameterElement.C29377e> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f105498c = cVar;
        this.f105499d = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<ParameterElement.C29377e> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f105500e = cVar2;
        this.f105501f = new C41981q0(cVar2);
        com.jakewharton.rxrelay3.c<DeepLink> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f105502g = cVar3;
        this.f105503h = new C41981q0(cVar3);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String strA;
        i iVar = (i) eVar;
        ParameterElement.C29377e c29377e = (ParameterElement.C29377e) aVar;
        ItemWithState.State state = c29377e.f117419p;
        DeepLink deepLink = c29377e.f117417n;
        iVar.a60(new C13996a(c29377e.f117407d, state, false, c29377e.f117420q, null, null, deepLink != null ? new f(this, deepLink) : null, null, null, 436, null));
        iVar.setEnabled(c29377e.f117416m);
        iVar.o(c29377e.f117415l);
        Long l12 = c29377e.f117408e;
        if (l12 != null) {
            long jLongValue = l12.longValue();
            SelectionType selectionType = c29377e.f117414k;
            if (selectionType == null) {
                selectionType = new SelectionType(C42745f0.U(SelectionType.TYPE_DAY, SelectionType.TYPE_MONTH, SelectionType.TYPE_YEAR));
            }
            strA = this.f105497b.a(jLongValue, selectionType);
        } else {
            strA = null;
        }
        iVar.m(strA);
        iVar.a(new d(this, c29377e));
        iVar.M5(new e(this, c29377e));
    }

    @Override // com.avito.android.blueprint.date.single.c
    @k
    public final z<ParameterElement.C29377e> c() {
        return this.f105499d;
    }

    @Override // com.avito.android.blueprint.date.single.c
    @k
    /* renamed from: o, reason: from getter */
    public final C41981q0 getF105503h() {
        return this.f105503h;
    }

    @Override // com.avito.android.blueprint.date.single.c
    public final z<ParameterElement.C29377e> r() {
        return this.f105501f;
    }
}
