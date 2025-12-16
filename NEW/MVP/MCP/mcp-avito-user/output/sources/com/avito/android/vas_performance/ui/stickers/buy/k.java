package com.avito.android.vas_performance.ui.stickers.buy;

import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: StickersBuyVasFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StickersBuyVasFragment f321956l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.vas_performance.ui.items.stickers.a f321957m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(StickersBuyVasFragment stickersBuyVasFragment, com.avito.android.vas_performance.ui.items.stickers.a aVar) {
        super(0);
        this.f321956l = stickersBuyVasFragment;
        this.f321957m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        StickersBuyVasFragment stickersBuyVasFragment = this.f321956l;
        v vVar = stickersBuyVasFragment.f321933p0;
        Object obj = null;
        if (vVar == null) {
            vVar = null;
        }
        vVar.getClass();
        Boolean bool = Boolean.TRUE;
        com.avito.android.vas_performance.ui.items.stickers.a aVar = this.f321957m;
        aVar.f321724d = bool;
        FL0.d dVar = vVar.f321981W;
        if (dVar != null) {
            Iterator<T> it = dVar.j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(aVar.f321722b, ((EL0.a) next).getId())) {
                    obj = next;
                    break;
                }
            }
            EL0.a aVar2 = (EL0.a) obj;
            if (aVar2 != null) {
                aVar2.e(aVar.f321724d);
            }
            vVar.le(dVar);
        }
        UL0.a aVar3 = stickersBuyVasFragment.f321929I0;
        if (aVar3 != null) {
            aVar3.r();
        }
        return G0.f406611a;
    }
}
