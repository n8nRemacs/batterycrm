package com.avito.android.publish.price_list.items.selected;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SelectedPriceListItemsPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/items/selected/h;", "Lcom/avito/android/publish/price_list/items/selected/e;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f238725b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f238726c;

    @Inject
    public h() {
        e2 e2VarB = f2.b(0, 1, BufferOverflow.f410778c, 1);
        this.f238725b = e2VarB;
        this.f238726c = e2VarB;
    }

    @Override // com.avito.android.publish.price_list.items.selected.e
    @Y61.k
    /* renamed from: M0, reason: from getter */
    public final e2 getF238726c() {
        return this.f238726c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        s sVar = (s) eVar;
        d dVar = (d) aVar;
        sVar.N3(C42745f0.M0(dVar.f238722e));
        sVar.n3(dVar.f238721d);
        Integer num = dVar.f238720c;
        if (num != null) {
            sVar.w5(num.intValue());
        }
        sVar.D4(new f(dVar));
        sVar.lc(new g(this));
    }
}
