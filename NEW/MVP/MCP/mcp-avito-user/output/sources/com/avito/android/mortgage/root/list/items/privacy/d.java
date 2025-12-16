package com.avito.android.mortgage.root.list.items.privacy;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.auction.details.i;
import com.avito.android.mortgage.root.list.payloads.m;
import f10.InterfaceC40199a;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PrivacyPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/privacy/d;", "LTV0/f;", "Lcom/avito/android/mortgage/root/list/items/privacy/f;", "Lcom/avito/android/mortgage/root/list/items/privacy/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d implements TV0.f<f, c> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC40199a, G0> f202734b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super InterfaceC40199a, G0> lVar) {
        this.f202734b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        c cVar = (c) aVar;
        fVar.Yn(cVar.f202732c, new i(this, 11));
        fVar.setEnabled(cVar.f202733d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        f fVar = (f) eVar;
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
            m mVar = null;
            for (Object obj3 : list2) {
                if (obj3 instanceof m) {
                    mVar = obj3;
                }
            }
            mVar = mVar instanceof m ? mVar : null;
        }
        if (mVar != null) {
            fVar.setEnabled(mVar.f202915a);
        } else {
            fVar.Yn(cVar.f202732c, new i(this, 11));
            fVar.setEnabled(cVar.f202733d);
        }
    }
}
