package nS;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.beduin.v2.render.android_view.A;
import fU0.AbstractC40338a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoLazyColumnComponent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LnS/a;", "Lcom/avito/beduin/v2/component/lazy_column/android_view/b;", "_design-modules_beduin-v2_renderer_component_lazy-column"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nS.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C44326a extends com.avito.beduin.v2.component.lazy_column.android_view.b {

    /* renamed from: q, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f415137q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public Boolean f415138r;

    public C44326a(@k A a12, @k ScreenPerformanceTracker screenPerformanceTracker) {
        super(a12);
        this.f415137q = screenPerformanceTracker;
    }

    @Override // com.avito.beduin.v2.component.lazy_column.android_view.b, com.avito.beduin.v2.render.android_view.AbstractC36333c
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void l(@k RecyclerView recyclerView, @k com.avito.beduin.v2.theme.k kVar, @k com.avito.beduin.v2.component.lazy_column.state.a aVar) {
        super.l(recyclerView, kVar, aVar);
        if (this.f415138r == null) {
            AbstractC40338a[] abstractC40338aArr = aVar.f335997k.f336915a;
            boolean z12 = false;
            if (abstractC40338aArr != null) {
                int length = abstractC40338aArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    if (abstractC40338aArr[i12] instanceof AbstractC40338a.C11153a) {
                        z12 = true;
                        break;
                    }
                    i12++;
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z12);
            this.f415138r = boolValueOf;
            if (boolValueOf.equals(Boolean.TRUE)) {
                this.f415137q.b(recyclerView);
            }
        }
    }
}
