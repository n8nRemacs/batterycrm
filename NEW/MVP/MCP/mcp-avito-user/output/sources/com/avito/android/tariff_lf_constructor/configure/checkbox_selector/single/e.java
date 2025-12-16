package com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.toggle.State;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.d;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.l;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SingleCheckBoxItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/single/e;", "Lcom/avito/android/tariff_lf_constructor/configure/checkbox_selector/single/c;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l f299542b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<d.b> f299543c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f299544d;

    @Inject
    public e(@k l lVar) {
        this.f299542b = lVar;
        com.jakewharton.rxrelay3.c<d.b> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f299543c = cVar;
        this.f299544d = cVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        d.b bVar = (d.b) aVar;
        gVar.setTitle(bVar.f299477h);
        gVar.f(bVar.f299483n);
        gVar.setChecked(bVar.f299478i == State.f181147b);
        gVar.G7(this.f299542b.a(bVar.f299480k));
        gVar.I(bVar.f299481l);
        gVar.a(new d(this, bVar));
    }

    @Override // com.avito.android.tariff_lf_constructor.configure.checkbox_selector.single.c
    @k
    public final z<d.b> d() {
        return this.f299544d;
    }
}
