package com.avito.android.change_specific.adapter;

import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lo.InterfaceC43808a;

/* compiled from: Specific.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/change_specific/adapter/q;", "Lcom/avito/android/change_specific/adapter/o;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q implements o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC43808a, G0> f117912b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public q(@Y61.k Y41.l<? super InterfaceC43808a, G0> lVar) {
        this.f117912b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        s sVar = (s) eVar;
        m mVar = (m) aVar;
        sVar.setTitle(mVar.f117905b.getTitle());
        sVar.setChecked(mVar.f117906c);
        sVar.a4(false);
        sVar.a(new p(this, mVar));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        s sVar = (s) eVar;
        m mVar = (m) aVar;
        Iterator it = list.iterator();
        Object obj = null;
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null ? next instanceof n : true) {
                obj = next;
            }
        }
        n nVar = (n) (obj instanceof n ? obj : null);
        if (nVar != null) {
            sVar.setChecked(nVar.f117908a);
            if (nVar.f117909b) {
                sVar.a4(false);
                return;
            }
            return;
        }
        sVar.setTitle(mVar.f117905b.getTitle());
        sVar.setChecked(mVar.f117906c);
        sVar.a4(false);
        sVar.a(new p(this, mVar));
    }
}
