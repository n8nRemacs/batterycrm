package com.avito.android.publish.price_list.items.group;

import androidx.compose.runtime.internal.P;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SelectPriceListGroupItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/items/group/i;", "Lcom/avito/android/publish/price_list/items/group/f;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f238643b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f238644c;

    @Inject
    public i() {
        e2 e2VarB = f2.b(0, 1, BufferOverflow.f410778c, 1);
        this.f238643b = e2VarB;
        this.f238644c = e2VarB;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        a aVar2 = (a) aVar;
        kVar.setTitle(aVar2.f238630c);
        kVar.n3(aVar2.f238631d);
        kVar.a(new h(this, aVar2));
    }

    @Override // com.avito.android.publish.price_list.items.group.f
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final e2 getF238644c() {
        return this.f238644c;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        k kVar = (k) eVar;
        a aVar2 = (a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.publish.price_list.items.diff.a) {
                obj = obj2;
            }
        }
        if (((com.avito.android.publish.price_list.items.diff.a) (obj instanceof com.avito.android.publish.price_list.items.diff.a ? obj : null)) != null) {
            kVar.n3(aVar2.f238631d);
            kVar.a(new g(this, aVar2));
        } else {
            kVar.setTitle(aVar2.f238630c);
            kVar.n3(aVar2.f238631d);
            kVar.a(new h(this, aVar2));
        }
    }
}
