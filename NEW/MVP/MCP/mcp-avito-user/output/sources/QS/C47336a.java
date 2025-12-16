package qS;

import Y61.k;
import Y61.l;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.C29270c0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.beduin.v2.component.lazy_row.android_view.LazyRowComponent;
import com.avito.beduin.v2.render.android_view.A;
import fU0.AbstractC40338a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: AvitoLazyRowComponent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LqS/a;", "Lcom/avito/beduin/v2/component/lazy_row/android_view/LazyRowComponent;", "_design-modules_beduin-v2_renderer_component_lazy-row"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qS.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C47336a extends LazyRowComponent {

    /* renamed from: q, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f429274q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final C29270c0 f429275r;

    /* renamed from: s, reason: collision with root package name */
    @l
    public Boolean f429276s;

    public C47336a(@k A a12, @k ScreenPerformanceTracker screenPerformanceTracker, @k C29270c0 c29270c0) {
        super(a12);
        this.f429274q = screenPerformanceTracker;
        this.f429275r = c29270c0;
    }

    @Override // com.avito.beduin.v2.component.lazy_row.android_view.LazyRowComponent, com.avito.beduin.v2.render.android_view.AbstractC36333c
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void l(@k RecyclerView recyclerView, @k com.avito.beduin.v2.theme.k kVar, @k com.avito.beduin.v2.component.lazy_row.state.a aVar) {
        super.l(recyclerView, kVar, aVar);
        if (this.f429276s == null) {
            AbstractC40338a[] abstractC40338aArr = aVar.f336076k.f336915a;
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
            this.f429276s = boolValueOf;
            if (boolValueOf.equals(Boolean.TRUE)) {
                this.f429274q.b(recyclerView);
            }
        }
    }

    @Override // com.avito.beduin.v2.component.lazy_row.android_view.LazyRowComponent, com.avito.beduin.v2.render.android_view.AbstractC36333c
    @k
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final RecyclerView n(@k ViewGroup viewGroup) {
        RecyclerView recyclerViewN = super.n(viewGroup);
        C29270c0 c29270c0 = this.f429275r;
        c29270c0.getClass();
        n<Object> nVar = C29270c0.f113263t[5];
        if (((Boolean) c29270c0.f113269g.a().invoke()).booleanValue()) {
            recyclerViewN.setNestedScrollingEnabled(false);
        }
        return recyclerViewN;
    }
}
