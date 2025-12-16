package com.avito.android.user_address.list.mvi;

import XG0.a;
import XG0.d;
import com.avito.android.arch.mvi.a;
import com.avito.android.user_address.list.mvi.entity.UserAddressListMviInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.X;

/* compiled from: UserAddressListMviActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/user_address/list/mvi/g;", "Lcom/avito/android/arch/mvi/a;", "LXG0/a;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "LXG0/d;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements com.avito.android.arch.mvi.a<XG0.a, UserAddressListMviInternalAction, XG0.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_address.list.domain.f f307416a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_address.list.domain.c f307417b;

    @Inject
    public g(@Y61.k com.avito.android.user_address.list.domain.f fVar, @Y61.k com.avito.android.user_address.list.domain.c cVar) {
        this.f307416a = fVar;
        this.f307417b = cVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<UserAddressListMviInternalAction> b(XG0.a aVar, XG0.d dVar) {
        InterfaceC43160i<UserAddressListMviInternalAction> c43210w;
        XG0.a aVar2 = aVar;
        XG0.d dVar2 = dVar;
        if (aVar2 instanceof a.f) {
            return new C43210w(new UserAddressListMviInternalAction.StartChangeDefault(((a.f) aVar2).f18789a));
        }
        if (aVar2 instanceof a.b) {
            c43210w = new X(new C43152f0(C43175k.G(new d((a.b) aVar2, this, dVar2, null)), new e(3, null)), new f(3, null));
        } else if (aVar2 instanceof a.C1324a) {
            c43210w = new C43210w(UserAddressListMviInternalAction.NavigateToSuggest.f307407b);
        } else {
            if (aVar2 instanceof a.c) {
                return new C43210w(new UserAddressListMviInternalAction.NavigateToEditAddress(((a.c) aVar2).f18786a));
            }
            if (aVar2 instanceof a.e) {
                return !(dVar2 instanceof d.e) ? this.f307417b.a(false) : C43175k.w();
            }
            if (!(aVar2 instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(UserAddressListMviInternalAction.OpenFAQ.f307408b);
        }
        return c43210w;
    }
}
