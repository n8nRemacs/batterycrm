package com.avito.android.vas_performance.ui.stickers.edit;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: StickersEditVasViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/stickers/a;", "sticker", "Lkotlin/G0;", "accept", "(Lcom/avito/android/vas_performance/ui/items/stickers/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f322034b;

    public o(q qVar) {
        this.f322034b = qVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        T next;
        com.avito.android.vas_performance.ui.items.stickers.a aVar = (com.avito.android.vas_performance.ui.items.stickers.a) obj;
        q qVar = this.f322034b;
        GL0.c cVar = qVar.f322045R;
        if (cVar != null) {
            Iterator<T> it = cVar.j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = (T) null;
                    break;
                }
                next = it.next();
                EL0.a aVar2 = (EL0.a) next;
                if (L.f(aVar.f321722b, aVar2.getId())) {
                    if (L.f(aVar.f321723c, aVar2.getTitle())) {
                        break;
                    }
                }
            }
            EL0.a aVar3 = next;
            if (aVar3 != null) {
                aVar3.e(aVar.f321724d);
            }
            qVar.f322049V = q.ne(cVar.j());
            qVar.me(cVar);
        }
    }
}
