package com.avito.android.screens.bbip.ui.items.budget;

import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BudgetItemViewState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/budget/p;", "", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class p {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f260332c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final p f260333d = new p(C42784z0.f406748b, null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f260334a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f260335b;

    /* compiled from: BudgetItemViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/budget/p$a;", "", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public p(@Y61.k List<com.avito.android.screens.bbip.ui.items.budget.a> list, @Y61.l Integer num) {
        this.f260334a = list;
        this.f260335b = num;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f260334a, pVar.f260334a) && L.f(this.f260335b, pVar.f260335b);
    }

    public final int hashCode() {
        int iHashCode = this.f260334a.hashCode() * 31;
        Integer num = this.f260335b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BudgetItemViewState(items=");
        sb2.append(this.f260334a);
        sb2.append(", indexToScroll=");
        return s.j(sb2, this.f260335b, ')');
    }
}
