package com.avito.android.profile.user_profile.cards.avito_pro;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.profile.user_profile.cards.CardItem;
import f90.InterfaceC40251E;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AvitoProCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/avito_pro/f;", "Lcom/avito/android/profile/user_profile/cards/avito_pro/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f224814b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC40251E f224815c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC15503a, G0> lVar, @k InterfaceC40251E interfaceC40251E) {
        this.f224814b = lVar;
        this.f224815c = interfaceC40251E;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        CardItem.AvitoProCardItem avitoProCardItem = (CardItem.AvitoProCardItem) aVar;
        hVar.b(avitoProCardItem.f224361d);
        hVar.n(avitoProCardItem.f224362e);
        hVar.NW(avitoProCardItem.f224365h);
        hVar.c(new d(this, avitoProCardItem));
        String str = avitoProCardItem.f224363f;
        if (str == null || str.length() == 0 || this.f224815c.b(str)) {
            return;
        }
        hVar.T6(str, new e(this, str));
    }
}
