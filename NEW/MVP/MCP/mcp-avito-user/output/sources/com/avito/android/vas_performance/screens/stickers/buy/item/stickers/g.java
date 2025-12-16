package com.avito.android.vas_performance.screens.stickers.buy.item.stickers;

import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: StickersItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/lib/design/chips/h;", "chipable", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/chips/h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements Y41.l<com.avito.android.lib.design.chips.h, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f320673l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f320674m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(b bVar, h hVar) {
        super(1);
        this.f320673l = bVar;
        this.f320674m = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.chips.h hVar) {
        Object next;
        com.avito.android.lib.design.chips.h hVar2 = hVar;
        Iterator<T> it = this.f320673l.f320667d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (L.f(((a) next).f320661b, ((a) hVar2).f320661b)) {
                break;
            }
        }
        a aVar = (a) next;
        if (aVar != null) {
            this.f320674m.f320676c.invoke(aVar);
        }
        return G0.f406611a;
    }
}
