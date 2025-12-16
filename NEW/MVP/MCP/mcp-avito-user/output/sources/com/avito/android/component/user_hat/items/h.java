package com.avito.android.component.user_hat.items;

import com.avito.android.component.user_hat.PassportParticularProfileItem;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ParticularProfile.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/component/user_hat/items/h;", "Lcom/avito/android/component/user_hat/items/f;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l41.g<com.avito.android.component.user_hat.e> f125332b;

    @Inject
    public h(@Y61.k l41.g<com.avito.android.component.user_hat.e> gVar) {
        this.f125332b = gVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        j jVar = (j) eVar;
        PassportParticularProfileItem passportParticularProfileItem = (PassportParticularProfileItem) aVar;
        jVar.l(passportParticularProfileItem.f125273b);
        jVar.a(new g(this, passportParticularProfileItem));
        jVar.Td(passportParticularProfileItem.f125276e);
        jVar.B9(passportParticularProfileItem.f125277f, passportParticularProfileItem.f125278g);
        jVar.Jj(passportParticularProfileItem.f125275d);
    }
}
