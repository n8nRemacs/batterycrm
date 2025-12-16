package com.avito.android.code_check.phone_list.adapter.new_phone;

import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: NewPhoneItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/code_check/phone_list/adapter/new_phone/d;", "Lcom/avito/android/code_check/phone_list/adapter/new_phone/c;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f118938b;

    @Inject
    public d(@k Y41.a<G0> aVar) {
        this.f118938b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        NewPhoneItem newPhoneItem = (NewPhoneItem) aVar;
        fVar.y(newPhoneItem.f118931b);
        fVar.up(newPhoneItem.f118932c);
        fVar.a(this.f118938b);
    }
}
