package com.avito.android.sx_address.list.mvi;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.sx_address.SxAddressListParams;
import com.avito.android.sx_address.list.domain.AddressItem;
import com.avito.android.sx_address.list.domain.Filter;
import com.avito.android.sx_address.list.mvi.entity.ListState;
import com.avito.android.sx_address.list.mvi.entity.a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import zA0.InterfaceC50429b;

/* compiled from: SxAddressListActor.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sx_address/list/mvi/x;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/sx_address/list/mvi/entity/a;", "Lcom/avito/android/sx_address/list/mvi/entity/b;", "Lcom/avito/android/sx_address/list/mvi/entity/ListState;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class x implements com.avito.android.arch.mvi.a<com.avito.android.sx_address.list.mvi.entity.a, com.avito.android.sx_address.list.mvi.entity.b, ListState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.list.domain.b f293376a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SxAddressListParams f293377b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f293378c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SharedPreferences f293379d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.provider.a f293380e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.list.e f293381f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50429b f293382g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.sx_address.list.analytics.i f293383h;

    @Inject
    public x(@Y61.k com.avito.android.sx_address.list.domain.b bVar, @Y61.k SxAddressListParams sxAddressListParams, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k @com.avito.android.sx_address.list.di.A SharedPreferences sharedPreferences, @Y61.k com.avito.android.analytics.provider.a aVar2, @Y61.k com.avito.android.sx_address.list.e eVar, @Y61.k InterfaceC50429b interfaceC50429b, @Y61.k com.avito.android.sx_address.list.analytics.i iVar) {
        this.f293376a = bVar;
        this.f293377b = sxAddressListParams;
        this.f293378c = aVar;
        this.f293379d = sharedPreferences;
        this.f293380e = aVar2;
        this.f293381f = eVar;
        this.f293382g = interfaceC50429b;
        this.f293383h = iVar;
    }

    public static final ArrayList c(x xVar, List list, String str, Filter filter) {
        xVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            AddressItem addressItem = (AddressItem) obj;
            AddressItem.Status status = addressItem.f293126g.f293136b;
            if (filter == Filter.f293146c || ((filter == Filter.f293147d && (status == AddressItem.Status.f293140c || status == AddressItem.Status.f293139b)) || ((filter == Filter.f293148e && status == AddressItem.Status.f293141d) || (filter == Filter.f293149f && status == AddressItem.Status.f293142e)))) {
                if (C43066x.q(addressItem.f293128i, str, true) || C43066x.q(addressItem.f293123d, str, true)) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<com.avito.android.sx_address.list.mvi.entity.b> b(com.avito.android.sx_address.list.mvi.entity.a aVar, ListState listState) {
        C43152f0 c43152f0;
        com.avito.android.sx_address.list.mvi.entity.a aVar2 = aVar;
        ListState listState2 = listState;
        if (aVar2 instanceof a.e) {
            return C43175k.G(new k(2, null));
        }
        if (aVar2 instanceof a.d) {
            return C43175k.G(new p(this, (a.d) aVar2, null));
        }
        if (aVar2 instanceof a.n) {
            c43152f0 = new C43152f0(C43175k.G(new q((a.n) aVar2, this, listState2, null)), new r(3, null));
        } else if (aVar2 instanceof a.o) {
            c43152f0 = new C43152f0(C43175k.G(new s((a.o) aVar2, this, null)), new t(3, null));
        } else {
            if (aVar2 instanceof a.p) {
                return C43175k.G(new C35183g((a.p) aVar2, this, null));
            }
            if (aVar2 instanceof a.l) {
                return C43175k.G(new C35184h((a.l) aVar2, this, null));
            }
            if (aVar2 instanceof a.c) {
                return C43175k.G(new u(2, null));
            }
            if (aVar2 instanceof a.f) {
                return C43175k.G(new v(this, (a.f) aVar2, null));
            }
            if (aVar2 instanceof a.s) {
                return C43175k.G(new w(listState2, (a.s) aVar2, this, null));
            }
            if (aVar2 instanceof a.i) {
                return C43175k.G(new C35177a(listState2, null));
            }
            if (aVar2 instanceof a.b) {
                return C43175k.G(new C35179c(listState2, this, null));
            }
            if (aVar2 instanceof a.C8903a) {
                return C43175k.G(new C35178b(listState2, (a.C8903a) aVar2, this, null));
            }
            if (aVar2 instanceof a.g) {
                return C43175k.G(new C35180d((a.g) aVar2, null));
            }
            if (!(aVar2 instanceof a.h)) {
                if (aVar2 instanceof a.m) {
                    return C43175k.G(new l(2, null));
                }
                if (aVar2 instanceof a.q) {
                    return C43175k.G(new m(2, null));
                }
                if (aVar2 instanceof a.r) {
                    return C43175k.G(new n(2, null));
                }
                if (aVar2 instanceof a.t) {
                    return C43175k.G(new C35185i((a.t) aVar2, this, null));
                }
                if (aVar2 instanceof a.j) {
                    return C43175k.G(new j(this, null));
                }
                if (aVar2 instanceof a.k) {
                    return C43175k.G(new o(this, (a.k) aVar2, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            c43152f0 = new C43152f0(C43175k.G(new C35181e(this, null)), new C35182f(3, null));
        }
        return c43152f0;
    }
}
