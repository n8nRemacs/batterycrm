package com.avito.android.advert.item.icebreakers;

import com.avito.android.remote.model.IceBreaker;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IceBreakersPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f76468l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ IceBreakersItem f76469m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f76470n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, IceBreakersItem iceBreakersItem, m mVar) {
        super(0);
        this.f76468l = jVar;
        this.f76469m = iceBreakersItem;
        this.f76470n = mVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        j jVar = this.f76468l;
        String strO = jVar.O();
        Iterator<IceBreaker> it = this.f76469m.f76445d.getTexts().iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (it.next().getId() == jVar.f76478h) {
                break;
            }
            i12++;
        }
        jVar.f76472b.D3(i12, jVar.f76478h, strO);
        j.k(jVar, this.f76470n, strO);
        return G0.f406611a;
    }
}
