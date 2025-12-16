package com.avito.android.component.user_hat.items;

import com.avito.android.component.user_hat.PassportProfileCountItem;
import hw.InterfaceC41178c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: Count.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/items/A;", "Lcom/avito/android/component/user_hat/items/y;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class A implements y {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<com.avito.android.component.user_hat.e> f125322b;

    @Inject
    public A(@Y61.k l41.g<com.avito.android.component.user_hat.e> gVar) {
        this.f125322b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        C c12 = (C) eVar;
        c12.g30(((PassportProfileCountItem) aVar).f125282b);
        c12.a(new z(this));
    }
}
