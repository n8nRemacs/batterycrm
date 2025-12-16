package com.avito.android.certificate_pinning;

import android.os.Bundle;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.certificate_pinning.h;
import com.avito.android.di.C29972i;
import com.avito.android.util.C35853n2;
import com.avito.android.util.G;
import com.avito.android.util.Kundle;
import ho.d;
import io.reactivex.rxjava3.internal.operators.observable.O;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;

/* compiled from: UnsafeNetworkActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/certificate_pinning/UnsafeNetworkActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/certificate_pinning/h$b;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UnsafeNetworkActivity extends com.avito.android.ui.activity.a implements h.b, InterfaceC28477j.b {

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public C35853n2 f117753m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public n f117754n;

    @Override // com.avito.android.ui.activity.a, androidx.view.n, android.app.Activity
    public final void onBackPressed() {
        n nVar = this.f117754n;
        if (nVar == null) {
            nVar = null;
        }
        s sVar = nVar.f117846c;
        if (sVar != null) {
            sVar.c();
        }
        nVar.a(false);
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ((d.a) C29972i.a(C29972i.b(this), d.a.class)).ui().a(bundle != null ? G.a(bundle, "presenter_state") : null).a(this);
        setContentView(R.layout.unsafe_network_screen);
        n nVar = this.f117754n;
        n nVar2 = nVar != null ? nVar : null;
        s sVar = new s(findViewById(android.R.id.content));
        nVar2.f117846c = sVar;
        O oK2 = com.avito.android.lib.deprecated_design.button.g.a(sVar.f117862g).K(new i(sVar));
        j jVar = new j(nVar2);
        l41.g<? super Throwable> gVar = k.f117796b;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = oK2.v0(jVar, gVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar = nVar2.f117850g;
        cVar.b(dVarV0);
        cVar.b(com.avito.android.lib.deprecated_design.button.g.a(sVar.f117863h).v0(new l(nVar2), m.f117798b, interfaceC43543a));
        sVar.c();
        nVar2.a(false);
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        n nVar = this.f117754n;
        if (nVar == null) {
            nVar = null;
        }
        nVar.f117850g.e();
        nVar.f117846c = null;
        super.onDestroy();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onResume() {
        super.onResume();
        n nVar = this.f117754n;
        if (nVar == null) {
            nVar = null;
        }
        nVar.a(true);
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        n nVar = this.f117754n;
        if (nVar == null) {
            nVar = null;
        }
        nVar.getClass();
        Kundle kundle = new Kundle();
        kundle.m("redirect_url", nVar.f117848e);
        G.c(bundle, "presenter_state", kundle);
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStart() {
        super.onStart();
        n nVar = this.f117754n;
        if (nVar == null) {
            nVar = null;
        }
        nVar.f117847d = this;
    }

    @Override // com.avito.android.ui.activity.a, androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onStop() {
        n nVar = this.f117754n;
        if (nVar == null) {
            nVar = null;
        }
        nVar.f117847d = null;
        super.onStop();
    }
}
