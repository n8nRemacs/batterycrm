package com.avito.android.publish.slots.auto_group_block.contact.item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GroupContactPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/auto_group_block/contact/item/g;", "Lcom/avito/android/publish/slots/auto_group_block/contact/item/e;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f243089b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C41981q0 f243090c;

    @Inject
    public g() {
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243089b = cVar;
        this.f243090c = new C41981q0(cVar);
    }

    @Override // com.avito.android.publish.slots.auto_group_block.contact.item.e
    @k
    /* renamed from: H, reason: from getter */
    public final C41981q0 getF243090c() {
        return this.f243090c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        c cVar = (c) aVar;
        iVar.V0(cVar.f243078d);
        iVar.a0(new f(this, cVar));
        iVar.kz(cVar.f243079e);
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
        if (((d) (obj instanceof d ? obj : null)) != null) {
            iVar.kz(cVar.f243079e);
            return;
        }
        iVar.V0(cVar.f243078d);
        iVar.a0(new f(this, cVar));
        iVar.kz(cVar.f243079e);
    }
}
