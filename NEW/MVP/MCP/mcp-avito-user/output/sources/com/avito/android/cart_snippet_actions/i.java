package com.avito.android.cart_snippet_actions;

import Cn.InterfaceC13327a;
import Km.InterfaceC14327a;
import com.avito.android.Z0;
import com.avito.android.util.A4;
import com.avito.android.util.InterfaceC35745a5;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.rx3.Q;
import l41.s;
import yn.C50271a;

/* compiled from: CartActionsInteractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_snippet_actions/i;", "Lcom/avito/android/cart_snippet_actions/e;", "_avito_cart-snippet-actions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public class i implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC14327a> f116257a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC13327a> f116258b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f116259c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Z0 f116260d;

    @Inject
    public i(@Y61.k h31.e<InterfaceC14327a> eVar, @Y61.k h31.e<InterfaceC13327a> eVar2, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k Z0 z02) {
        this.f116257a = eVar;
        this.f116258b = eVar2;
        this.f116259c = interfaceC35745a5;
        this.f116260d = z02;
    }

    @Override // com.avito.android.cart_snippet_actions.e
    @Y61.k
    public final W a(@Y61.l final String str, @Y61.k final List list, final boolean z12, final boolean z13, final boolean z14) {
        return new C42007e(new s() { // from class: com.avito.android.cart_snippet_actions.f
            @Override // l41.s
            public final Object get() {
                i iVar = this.f116160b;
                Z0 z02 = iVar.f116260d;
                kotlin.reflect.n<Object> nVar = Z0.f67595D[26];
                boolean zBooleanValue = ((Boolean) z02.f67598C.a().invoke()).booleanValue();
                List list2 = list;
                boolean z15 = z12;
                boolean z16 = z13;
                String str2 = str;
                boolean z17 = z14;
                if (zBooleanValue) {
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Dn.e(Long.parseLong(((C50271a) it.next()).getItemId()), r2.getQuantity()));
                    }
                    return Q.a(EmptyCoroutineContext.INSTANCE, new g(iVar, z15, z17, str2, arrayList, z16, null)).r(h.f116256b);
                }
                List list4 = list2;
                int iF2 = P0.f(C42745f0.q(list4, 10));
                if (iF2 < 16) {
                    iF2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
                Iterator it2 = list4.iterator();
                while (it2.hasNext()) {
                    linkedHashMap.put("items[" + ((C50271a) it2.next()).getItemId() + ']', Long.valueOf(r2.getQuantity()));
                }
                InterfaceC14327a interfaceC14327a = iVar.f116257a.get();
                Boolean boolValueOf = Boolean.valueOf(z15);
                if (!z15) {
                    boolValueOf = null;
                }
                Map<String, String> mapJ = A4.j(A4.f318516a, linkedHashMap);
                Boolean boolValueOf2 = Boolean.valueOf(z17);
                if (!z17) {
                    boolValueOf2 = null;
                }
                return interfaceC14327a.a(boolValueOf, mapJ, z16, str2, boolValueOf2 != null ? Integer.valueOf(boolValueOf2.equals(Boolean.TRUE) ? 1 : 0) : null);
            }
        }).z(this.f116259c.a());
    }
}
