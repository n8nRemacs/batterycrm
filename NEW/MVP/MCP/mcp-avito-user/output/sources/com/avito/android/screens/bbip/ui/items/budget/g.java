package com.avito.android.screens.bbip.ui.items.budget;

import androidx.compose.runtime.internal.P;
import com.avito.android.screens.bbip.ui.items.budget.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BudgetItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/budget/g;", "Lcom/avito/android/screens/bbip/ui/items/budget/e;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<b.a> f260320b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e f260321c;

    @Inject
    public g() {
        io.reactivex.rxjava3.subjects.e<b.a> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f260320b = eVar;
        this.f260321c = eVar;
    }

    @Override // com.avito.android.screens.bbip.ui.items.budget.e
    @Y61.k
    /* renamed from: C2, reason: from getter */
    public final io.reactivex.rxjava3.subjects.e getF260321c() {
        return this.f260321c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Object next;
        i iVar = (i) eVar;
        b bVar = (b) aVar;
        List<b.a> list = bVar.f260306d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (b.a aVar2 : list) {
            arrayList.add(new a(aVar2.f260307a, aVar2.f260308b, aVar2.f260311e, aVar2.f260312f));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((a) next).f260303d) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        a aVar3 = (a) next;
        String str = aVar3 != null ? aVar3.f260300a : null;
        iVar.setTitle(bVar.f260305c);
        iVar.ev(arrayList, str, new f(bVar, this));
    }
}
