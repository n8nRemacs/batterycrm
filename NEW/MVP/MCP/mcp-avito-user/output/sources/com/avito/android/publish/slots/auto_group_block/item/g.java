package com.avito.android.publish.slots.auto_group_block.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoGroupBlockPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/auto_group_block/item/g;", "Lcom/avito/android/publish/slots/auto_group_block/item/e;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f243109b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f243110c;

    @Inject
    public g() {
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243109b = cVar;
        this.f243110c = new C41981q0(cVar);
    }

    @Override // com.avito.android.publish.slots.auto_group_block.item.e
    @k
    /* renamed from: H, reason: from getter */
    public final C41981q0 getF243110c() {
        return this.f243110c;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((i) eVar, (c) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof d) {
                obj = obj2;
            }
        }
        d dVar = (d) (obj instanceof d ? obj : null);
        if (dVar == null) {
            k(iVar, cVar);
            return;
        }
        String str = dVar.f243105a;
        if (str != null) {
            iVar.n(str);
        }
        String str2 = dVar.f243106b;
        if (str2 != null) {
            iVar.V0(str2);
        }
    }

    public final void k(@k i iVar, @k c cVar) {
        iVar.F4(cVar.f243102e);
        iVar.b(cVar.f243101d);
        iVar.n(cVar.f243104g);
        iVar.V0(cVar.f243103f);
        iVar.a0(new f(this, cVar));
    }
}
