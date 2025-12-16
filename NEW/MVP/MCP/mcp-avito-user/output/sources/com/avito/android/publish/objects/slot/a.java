package com.avito.android.publish.objects.slot;

import com.avito.android.category_parameters.f;
import com.avito.android.category_parameters.j;
import com.avito.android.remote.model.category_parameters.slot.Slot;
import java.util.Iterator;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import l41.g;

/* compiled from: ObjectFillFormSlotManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/category_parameters/f;", "refreshType", "Lkotlin/G0;", "accept", "(Lcom/avito/android/category_parameters/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class a<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f238092b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set<j<? extends Slot<?>>> f238093c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(c cVar, Set<? extends j<? extends Slot<?>>> set) {
        this.f238092b = cVar;
        this.f238093c = set;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        f fVar = (f) obj;
        boolean z12 = fVar instanceof f.b;
        c cVar = this.f238092b;
        if (z12) {
            cVar.f238096b.accept(G0.f406611a);
            return;
        }
        if (fVar instanceof f.a) {
            f.a aVar = (f.a) fVar;
            cVar.getClass();
            Iterator<j<? extends Slot<?>>> it = this.f238093c.iterator();
            while (it.hasNext()) {
                if (it.next().e(aVar.f117643b) instanceof f.b) {
                    cVar.f238096b.accept(G0.f406611a);
                }
            }
        }
    }
}
