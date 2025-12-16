package com.avito.android.screens.bbip_v2.ui.items.budget;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.screens.bbip_v2.ui.items.budget.b;
import hh.InterfaceC40936d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BbipV2BudgetItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/budget/f;", "Lcom/avito/android/screens/bbip_v2/ui/items/budget/e;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.p<b.a, Boolean, G0> f261585b;

    /* compiled from: BbipV2BudgetItemPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "price", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ b f261586l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ f f261587m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, f fVar) {
            super(1);
            this.f261586l = bVar;
            this.f261587m = fVar;
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            Object next;
            String str2 = str;
            b bVar = this.f261586l;
            Iterator<T> it = bVar.f261572d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((b.a) next).f261573a, str2)) {
                    break;
                }
            }
            b.a aVar = (b.a) next;
            if (aVar != null) {
                f fVar = this.f261587m;
                fVar.getClass();
                fVar.f261585b.invoke(aVar, Boolean.valueOf(bVar.f261571c && aVar.f261580h != null));
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@Y61.k @InterfaceC40936d Y41.p<? super b.a, ? super Boolean, G0> pVar) {
        this.f261585b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        b bVar = (b) aVar;
        hVar.setTitle(bVar.f261570b);
        k(hVar, bVar, bVar.f261571c);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        b bVar = (b) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null) {
            hVar.setTitle(bVar.f261570b);
            k(hVar, bVar, bVar.f261571c);
        } else if (bundle.containsKey("payload_should_block_budgets")) {
            k(hVar, bVar, bundle.getBoolean("payload_should_block_budgets"));
        }
    }

    public final void k(h hVar, b bVar, boolean z12) {
        Object next;
        List<b.a> list = bVar.f261572d;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        for (b.a aVar : list) {
            arrayList.add(new com.avito.android.screens.bbip_v2.ui.items.budget.a(aVar.f261577e, aVar.f261578f, aVar.f261580h != null, aVar.f261573a, aVar.f261574b));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (((com.avito.android.screens.bbip_v2.ui.items.budget.a) next).f261568d) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        com.avito.android.screens.bbip_v2.ui.items.budget.a aVar2 = (com.avito.android.screens.bbip_v2.ui.items.budget.a) next;
        hVar.xm(new a(bVar, this), aVar2 != null ? aVar2.f261565a : null, arrayList, z12);
    }
}
