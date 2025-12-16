package com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi.a;
import com.avito.android.user_advert.advert.items.multiaddresses.addresses_list.mvi.j;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: MyAdvertAddressesListActor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0001B\t\b\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/mvi/a;", "Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/mvi/j;", "Lkotlin/G0;", "Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/mvi/MyAdvertAddressesListState;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.arch.mvi.a<a, j, G0> {
    @Inject
    public b() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<j> b(a aVar, G0 g02) {
        a aVar2 = aVar;
        if (aVar2 instanceof a.C9497a) {
            return new C43210w(new j.a(((a.C9497a) aVar2).f309714a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
