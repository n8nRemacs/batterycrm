package com.avito.android.iac_incoming_call_ability.impl_module.iac_enable;

import com.avito.android.util.rx3.g1;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41823n;
import io.reactivex.rxjava3.internal.operators.completable.v;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacSettingsInteractorImpl.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/iac_enable/m;", "LNL/e;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ContributesBinding.b
/* loaded from: classes14.dex */
public final class m implements NL.e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_incoming_call_ability.impl_module.api.a f168317a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final OL.a f168318b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f168319c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Boolean> f168320d = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public m(@Y61.k com.avito.android.iac_incoming_call_ability.impl_module.api.a aVar, @Y61.k OL.a aVar2, @Y61.k a aVar3) {
        this.f168317a = aVar;
        this.f168318b = aVar2;
        this.f168319c = aVar3;
    }

    @Override // NL.e
    public final boolean a() {
        return this.f168318b.j();
    }

    @Override // NL.e
    public final void b(boolean z12) {
        this.f168318b.d(z12);
    }

    @Override // NL.e
    @Y61.k
    public final AbstractC41768a c() {
        OL.a aVar = this.f168318b;
        return aVar.j() != this.f168319c.b() ? e(aVar.j(), false) : C41823n.f402260b;
    }

    @Override // NL.a
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF168320d() {
        return this.f168320d;
    }

    @Override // NL.e
    @Y61.k
    public final v e(boolean z12, boolean z13) {
        return new v(g1.a(this.f168317a.b(z12)).k(new l(this, z12, z13)));
    }
}
