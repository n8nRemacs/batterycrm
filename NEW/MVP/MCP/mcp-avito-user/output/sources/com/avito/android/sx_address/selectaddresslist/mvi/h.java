package com.avito.android.sx_address.selectaddresslist.mvi;

import UA0.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.sx_address.SelectAddressListParams;
import com.avito.android.sx_address.selectaddresslist.mvi.entity.SelectAddressListState;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SelectAddressListActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sx_address/selectaddresslist/mvi/h;", "Lcom/avito/android/arch/mvi/a;", "LUA0/a;", "LUA0/b;", "Lcom/avito/android/sx_address/selectaddresslist/mvi/entity/SelectAddressListState;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements com.avito.android.arch.mvi.a<UA0.a, UA0.b, SelectAddressListState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.selectaddresslist.domain.a f294128a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f294129b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final SelectAddressListParams f294130c;

    @Inject
    public h(@Y61.k com.avito.android.sx_address.selectaddresslist.domain.a aVar, @Y61.k R0 r02, @Y61.k SelectAddressListParams selectAddressListParams) {
        this.f294128a = aVar;
        this.f294129b = r02;
        this.f294130c = selectAddressListParams;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<UA0.b> b(UA0.a aVar, SelectAddressListState selectAddressListState) {
        UA0.a aVar2 = aVar;
        SelectAddressListState selectAddressListState2 = selectAddressListState;
        if (aVar2 instanceof a.b) {
            return C43175k.G(new a(2, null));
        }
        if (aVar2 instanceof a.f) {
            return C43175k.G(new b((a.f) aVar2, null));
        }
        if (aVar2 instanceof a.c) {
            return C43175k.G(new c(selectAddressListState2, this, null));
        }
        if (aVar2 instanceof a.C1104a) {
            return C43175k.G(new d(selectAddressListState2.f294110a.f294078d, null));
        }
        if (aVar2 instanceof a.d) {
            return C43175k.I(this.f294129b.a(), new C43152f0(C43175k.G(new e(this, null)), new f(3, null)));
        }
        if (aVar2 instanceof a.e) {
            return C43175k.n(C43175k.r(C43175k.G(new g(selectAddressListState2, this, (a.e) aVar2, null))), 300L);
        }
        throw new NoWhenBranchMatchedException();
    }
}
