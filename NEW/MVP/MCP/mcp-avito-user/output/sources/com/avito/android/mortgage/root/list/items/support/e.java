package com.avito.android.mortgage.root.list.items.support;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.root.list.payloads.m;
import f10.InterfaceC40199a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SupportPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/support/e;", "LTV0/f;", "Lcom/avito/android/mortgage/root/list/items/support/g;", "Lcom/avito/android/mortgage/root/list/items/support/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements TV0.f<g, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC40199a, G0> f202846b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC40199a, G0> lVar) {
        this.f202846b = lVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((g) eVar, (c) aVar);
        throw null;
    }

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
        if (mVar == null) {
            k(gVar, cVar);
            throw null;
        }
        gVar.setEnabled(mVar.f202915a);
    }

    public final void k(@k g gVar, @k c cVar) {
        gVar.U(new d(this));
        cVar.getClass();
        gVar.setEnabled(false);
        throw null;
    }
}
