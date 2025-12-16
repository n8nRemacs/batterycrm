package com.avito.android.evidence_request.details;

import com.avito.android.evidence_request.details.h;
import com.avito.android.items.ItemWithState;
import com.avito.android.validation.l1;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import l41.InterfaceC43543a;

/* compiled from: EvidenceDetailsViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/validation/l1$b;", "result", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lcom/avito/android/validation/l1$b;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f148536b;

    public k(h hVar) {
        this.f148536b = hVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        l1.b bVar = (l1.b) obj;
        boolean z12 = bVar instanceof l1.b.a;
        final h hVar = this.f148536b;
        if (z12) {
            j jVar = new j(hVar);
            return hVar.ke() == null ? (AbstractC41768a) jVar.invoke() : hVar.f148498N.d().o(new r(jVar, hVar));
        }
        if (bVar instanceof l1.b.C9896b) {
            return new C41826q(new InterfaceC43543a() { // from class: com.avito.android.evidence_request.details.i
                @Override // l41.InterfaceC43543a
                public final void run() {
                    h hVar2 = hVar;
                    Iterator it = hVar2.le().iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i12 = -1;
                            break;
                        }
                        com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) it.next();
                        if ((aVar instanceof ItemWithState) && !(((ItemWithState) aVar).getF173943c() instanceof ItemWithState.State.Normal)) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    hVar2.f148509Y.setValue(new h.c.f(i12, false, 2, null));
                }
            });
        }
        throw new NoWhenBranchMatchedException();
    }
}
