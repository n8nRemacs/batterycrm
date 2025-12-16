package eS;

import Y61.k;
import Y61.l;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.beduin.v2.component.common.Orientation;
import com.avito.beduin.v2.component.gridlayout.android_view.e;
import com.avito.beduin.v2.component.gridlayout.state.c;
import com.avito.beduin.v2.render.android_view.A;
import fU0.AbstractC40338a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoGridComponent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeS/a;", "Lcom/avito/beduin/v2/component/gridlayout/android_view/e;", "_design-modules_beduin-v2_renderer_component_grid-layout"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eS.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40044a extends e {

    /* renamed from: u, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f395201u;

    /* renamed from: v, reason: collision with root package name */
    @l
    public Boolean f395202v;

    public C40044a(@k A a12, @k ScreenPerformanceTracker screenPerformanceTracker) {
        super(a12, Orientation.f335660c);
        this.f395201u = screenPerformanceTracker;
    }

    @Override // com.avito.beduin.v2.component.gridlayout.android_view.e, com.avito.beduin.v2.render.android_view.AbstractC36333c
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void l(@k RecyclerView recyclerView, @k com.avito.beduin.v2.theme.k kVar, @k c cVar) {
        AbstractC40338a[] abstractC40338aArr;
        super.l(recyclerView, kVar, cVar);
        if (this.f395202v == null) {
            com.avito.beduin.v2.engine.utils.c<AbstractC40338a> cVar2 = cVar.f335851l;
            boolean z12 = false;
            if (cVar2 != null && (abstractC40338aArr = cVar2.f336915a) != null) {
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
            this.f395202v = boolValueOf;
            if (boolValueOf.equals(Boolean.TRUE)) {
                this.f395201u.b(recyclerView);
            }
        }
    }
}
