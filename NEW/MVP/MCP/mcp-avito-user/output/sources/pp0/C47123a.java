package pp0;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BbipDiffUtil.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpp0/a;", "Landroidx/recyclerview/widget/o$b;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47123a extends C23424o.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<TV0.a> f428778a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<TV0.a> f428779b;

    /* JADX WARN: Multi-variable type inference failed */
    public C47123a(@k List<? extends TV0.a> list, @k List<? extends TV0.a> list2) {
        this.f428778a = list;
        this.f428779b = list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (kotlin.jvm.internal.L.f(r6.f260378g, r7.f260378g) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
    
        if (r0.containsAll(r7) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0123, code lost:
    
        if (kotlin.jvm.internal.L.f(r6.f260348j, r7.f260348j) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return true;
     */
    @Override // androidx.recyclerview.widget.C23424o.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean areContentsTheSame(int r6, int r7) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pp0.C47123a.areContentsTheSame(int, int):boolean");
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final boolean areItemsTheSame(int i12, int i13) {
        return this.f428778a.get(i12).getF269950b() == this.f428779b.get(i13).getF269950b();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    @l
    public final Object getChangePayload(int i12, int i13) {
        Bundle bundle;
        TV0.a aVar = this.f428778a.get(i12);
        TV0.a aVar2 = this.f428779b.get(i13);
        if ((aVar instanceof com.avito.android.screens.bbip.ui.items.forecast.a) && (aVar2 instanceof com.avito.android.screens.bbip.ui.items.forecast.a)) {
            bundle = new Bundle();
            com.avito.android.screens.bbip.ui.items.forecast.a aVar3 = (com.avito.android.screens.bbip.ui.items.forecast.a) aVar2;
            com.avito.android.screens.bbip.ui.items.forecast.a aVar4 = (com.avito.android.screens.bbip.ui.items.forecast.a) aVar;
            if (!L.f(aVar3.f260375d, aVar4.f260375d)) {
                bundle.putString("payload_forecast_value", aVar3.f260375d);
            }
            if (!L.f(aVar3.f260377f, aVar4.f260377f)) {
                bundle.putString("payload_total_price", aVar3.f260377f);
            }
            if (!L.f(aVar3.f260378g, aVar4.f260378g)) {
                bundle.putString("payload_total_budget", aVar3.f260378g);
            }
        } else {
            bundle = null;
        }
        if (bundle == null || bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getNewListSize() {
        return this.f428779b.size();
    }

    @Override // androidx.recyclerview.widget.C23424o.b
    public final int getOldListSize() {
        return this.f428778a.size();
    }
}
