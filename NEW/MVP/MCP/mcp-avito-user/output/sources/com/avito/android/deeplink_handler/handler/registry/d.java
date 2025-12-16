package com.avito.android.deeplink_handler.handler.registry;

import com.avito.android.deeplink_handler.handler.bundle.DeeplinkBundleSaver;
import hv.C41170a;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import lv.C43834a;

/* compiled from: DeeplinkHandlerRegistry.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f134562l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar) {
        super(0);
        this.f134562l = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        e eVar = this.f134562l;
        C41170a c41170a = eVar.f134570P;
        c41170a.getClass();
        Iterator<T> it = eVar.f134563E.values().iterator();
        while (it.hasNext()) {
            C43834a.b bVar = ((C43834a) it.next()).f414238c;
            if (bVar instanceof C43834a.b.C11808a) {
                C43834a.b.C11808a c11808a = (C43834a.b.C11808a) bVar;
                String str = c11808a.f414239a;
                Iterable<DeeplinkBundleSaver.SavedData> iterable = (List) c41170a.f398293b.f134508a.b("dl_store_ss_" + str);
                if (iterable == null) {
                    iterable = C42784z0.f406748b;
                }
                for (DeeplinkBundleSaver.SavedData savedData : iterable) {
                    c41170a.a(c11808a.f414240b.get(), c11808a.f414239a, savedData.f134509b, new com.avito.android.deeplink_handler.handler.bundle.a(savedData.f134512e, savedData.f134510c, savedData.f134511d));
                }
            }
        }
        return G0.f406611a;
    }
}
