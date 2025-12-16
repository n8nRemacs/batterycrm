package com.avito.android.beduin.common.component.inline_filter;

import Y41.p;
import Y61.k;
import android.app.Activity;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: BeduinInlineFilterComponent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class b extends H implements p<View, Filter, G0> {
    public final void f(@k Filter filter) {
        a aVar = (a) this.receiver;
        RecyclerView recyclerView = aVar.f101493j;
        if (recyclerView != null) {
            Activity activityA = C35835l0.a(recyclerView.getContext());
            g gVar = activityA != null ? new g(activityA) : null;
            if (gVar != null) {
                gVar.a(filter, null, new d(aVar, filter));
            }
        }
    }

    @Override // Y41.p
    public final /* bridge */ /* synthetic */ G0 invoke(View view, Filter filter) {
        f(filter);
        return G0.f406611a;
    }
}
