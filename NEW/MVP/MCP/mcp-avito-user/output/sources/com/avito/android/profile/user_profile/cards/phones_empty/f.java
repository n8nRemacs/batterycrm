package com.avito.android.profile.user_profile.cards.phones_empty;

import Ua0.InterfaceC15503a;
import Y41.l;
import Y61.k;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.user_profile.Device;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PhonesEmptyCardItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/phones_empty/f;", "Lcom/avito/android/profile/user_profile/cards/phones_empty/d;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15503a, G0> f225184b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super InterfaceC15503a, G0> lVar) {
        this.f225184b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        CardItem.PhonesEmptyCardItem phonesEmptyCardItem = (CardItem.PhonesEmptyCardItem) aVar;
        iVar.zo();
        List<Device> list = phonesEmptyCardItem.f224468d;
        if (list.size() > 3) {
            Iterator it = C42745f0.E0(list, 3).iterator();
            while (it.hasNext()) {
                iVar.KB(((Device) it.next()).getName());
            }
            iVar.hE(list.size() - 3);
        } else {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                iVar.KB(((Device) it2.next()).getName());
            }
        }
        iVar.Q(new e(this, phonesEmptyCardItem));
    }
}
