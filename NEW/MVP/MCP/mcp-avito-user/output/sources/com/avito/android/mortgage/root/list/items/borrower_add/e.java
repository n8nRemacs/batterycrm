package com.avito.android.mortgage.root.list.items.borrower_add;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.root.list.payloads.C32680a;
import com.avito.android.mortgage.root.list.payloads.m;
import f10.InterfaceC40199a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BorrowerAddPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/borrower_add/e;", "LTV0/f;", "Lcom/avito/android/mortgage/root/list/items/borrower_add/g;", "Lcom/avito/android/mortgage/root/list/items/borrower_add/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements TV0.f<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC40199a, G0> f202466b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC40199a, G0> lVar) {
        this.f202466b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((g) eVar, (c) aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        m mVar;
        g gVar = (g) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof List) {
                obj = obj2;
            }
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list2 = (List) obj;
        if (list2 != null) {
            Object obj3 = null;
            for (Object obj4 : list2) {
                if (obj4 instanceof m) {
                    obj3 = obj4;
                }
            }
            if (!(obj3 instanceof m)) {
                obj3 = null;
            }
            mVar = (m) obj3;
        } else {
            mVar = null;
        }
        if (list2 != null) {
            C32680a c32680a = null;
            for (Object obj5 : list2) {
                if (obj5 instanceof C32680a) {
                    c32680a = obj5;
                }
            }
            c32680a = c32680a instanceof C32680a ? c32680a : null;
        }
        if (mVar != null) {
            gVar.setEnabled(mVar.f202915a);
        }
        if (c32680a != null) {
            gVar.setLoading(c32680a.f202893a);
        }
        if (mVar == null && c32680a == null) {
            k(gVar, cVar);
        }
    }

    public final void k(@k g gVar, @k c cVar) {
        gVar.h7(new d(this));
        gVar.setEnabled(cVar.f202464f);
        gVar.setLoading(cVar.f202463e);
        gVar.setTitle(cVar.f202461c);
        gVar.h(cVar.f202462d);
    }
}
