package com.avito.android.component.user_hat.items;

import com.avito.android.component.user_hat.PassportProfileAddItem;
import hw.InterfaceC41178c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: Add.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/items/r;", "Lcom/avito/android/component/user_hat/items/p;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class r implements p {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<com.avito.android.component.user_hat.e> f125353b;

    @Inject
    public r(@Y61.k l41.g<com.avito.android.component.user_hat.e> gVar) {
        this.f125353b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((t) eVar).a(new q(this, (PassportProfileAddItem) aVar));
    }
}
