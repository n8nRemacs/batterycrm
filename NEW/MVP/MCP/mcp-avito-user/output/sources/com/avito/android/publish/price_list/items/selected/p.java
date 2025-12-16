package com.avito.android.publish.price_list.items.selected;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: SelectedPriceListItemsRe23Presenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/price_list/items/selected/p;", "Lcom/avito/android/publish/price_list/items/selected/l;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class p implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e2 f238738b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e2 f238739c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final e2 f238740d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final e2 f238741e;

    @Inject
    public p() {
        BufferOverflow bufferOverflow = BufferOverflow.f410778c;
        e2 e2VarB = f2.b(0, 1, bufferOverflow, 1);
        this.f238738b = e2VarB;
        this.f238739c = e2VarB;
        e2 e2VarB2 = f2.b(0, 1, bufferOverflow, 1);
        this.f238740d = e2VarB2;
        this.f238741e = e2VarB2;
    }

    @Override // com.avito.android.publish.price_list.items.selected.l
    @Y61.k
    /* renamed from: M0, reason: from getter */
    public final e2 getF238739c() {
        return this.f238739c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        r rVar = (r) eVar;
        d dVar = (d) aVar;
        rVar.n3(dVar.f238721d);
        Integer num = dVar.f238720c;
        if (num != null) {
            rVar.Ke(num.intValue());
        }
        rVar.N3(C42745f0.M0(dVar.f238722e));
        rVar.D4(new m(dVar, rVar));
        rVar.lc(new n(this));
        rVar.eM(new o(this));
    }

    @Override // com.avito.android.publish.price_list.items.selected.l
    @Y61.k
    /* renamed from: s7, reason: from getter */
    public final e2 getF238741e() {
        return this.f238741e;
    }
}
