package com.avito.android.screens.bbip_v2.ui.items.budget;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BbipV2BudgetItemViewState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/budget/o;", "", "a", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class o {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f261598d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final o f261599e = new o(C42784z0.f406748b, false, null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.screens.bbip_v2.ui.items.budget.a> f261600a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f261601b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Integer f261602c;

    /* compiled from: BbipV2BudgetItemViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/screens/bbip_v2/ui/items/budget/o$a;", "", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public o(@Y61.k List<com.avito.android.screens.bbip_v2.ui.items.budget.a> list, boolean z12, @Y61.l Integer num) {
        this.f261600a = list;
        this.f261601b = z12;
        this.f261602c = num;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f261600a, oVar.f261600a) && this.f261601b == oVar.f261601b && L.f(this.f261602c, oVar.f261602c);
    }

    public final int hashCode() {
        int i12 = r.i(this.f261600a.hashCode() * 31, 31, this.f261601b);
        Integer num = this.f261602c;
        return i12 + (num == null ? 0 : num.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipV2BudgetItemViewState(items=");
        sb2.append(this.f261600a);
        sb2.append(", shouldBlockBudgets=");
        sb2.append(this.f261601b);
        sb2.append(", indexToScroll=");
        return s.j(sb2, this.f261602c, ')');
    }
}
