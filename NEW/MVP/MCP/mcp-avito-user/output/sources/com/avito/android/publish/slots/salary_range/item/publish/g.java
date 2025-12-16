package com.avito.android.publish.slots.salary_range.item.publish;

import Y61.k;
import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishSalaryRangePresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/salary_range/item/publish/g;", "Lcom/avito/android/publish/slots/salary_range/item/publish/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<com.avito.android.publish.slots.salary_range.item.c> f244831b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f244832c;

    @Inject
    public g() {
        com.jakewharton.rxrelay3.c<com.avito.android.publish.slots.salary_range.item.c> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f244831b = cVar;
        this.f244832c = new C41981q0(cVar);
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((b) eVar, (com.avito.android.publish.slots.salary_range.item.c) aVar);
    }

    @Override // com.avito.android.publish.slots.salary_range.item.publish.d
    @k
    public final z<com.avito.android.publish.slots.salary_range.item.c> b() {
        return this.f244832c;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        b bVar = (b) eVar;
        com.avito.android.publish.slots.salary_range.item.c cVar = (com.avito.android.publish.slots.salary_range.item.c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.publish.slots.salary_range.item.f) {
                obj = obj2;
            }
        }
        if (((com.avito.android.publish.slots.salary_range.item.f) (obj instanceof com.avito.android.publish.slots.salary_range.item.f ? obj : null)) == null) {
            k(bVar, cVar);
        } else {
            bVar.Ja(cVar);
        }
    }

    public final void k(@k b bVar, @k com.avito.android.publish.slots.salary_range.item.c cVar) {
        bVar.vr();
        bVar.Qg(cVar.f244799f);
        bVar.xo(cVar.f244800g);
        bVar.Ja(cVar);
        bVar.l50(new e(cVar, this), new f(cVar, this));
    }
}
