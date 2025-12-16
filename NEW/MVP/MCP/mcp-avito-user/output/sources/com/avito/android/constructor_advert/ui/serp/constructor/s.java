package com.avito.android.constructor_advert.ui.serp.constructor;

import Cr.InterfaceC13346a;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SnippetSize;
import com.avito.android.serp.NoTouchEventRecyclerView;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: ConstructorAdvertStaticItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/s;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItemViewImpl;", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class s extends ConstructorAdvertItemViewImpl {

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.beduin_shared.common.component.adapter.b f125828y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final NoTouchEventRecyclerView f125829z;

    public s(com.avito.android.beduin_shared.common.component.adapter.b bVar, View view, InterfaceC13346a interfaceC13346a, b bVar2, com.avito.android.video_snippets.g gVar, AsyncViewportTracker.ViewContext viewContext, Integer num, RecyclerView.t tVar, boolean z12, int i12, C42822w c42822w) {
        super(view, interfaceC13346a, bVar, bVar2, gVar, viewContext, null, (i12 & 64) != 0 ? null : num, (i12 & 128) != 0 ? null : tVar, z12);
        this.f125828y = bVar;
        View viewFindViewById = view.findViewById(R.id.free_form_recycler_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.serp.NoTouchEventRecyclerView");
        }
        this.f125829z = (NoTouchEventRecyclerView) viewFindViewById;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItemViewImpl, com.avito.android.constructor_advert.ui.serp.constructor.n
    public final void xj(@Y61.l List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list, @Y61.l SnippetSize snippetSize, @Y61.l SerpDisplayType serpDisplayType) {
        NoTouchEventRecyclerView noTouchEventRecyclerView = this.f125829z;
        if (list == null) {
            noTouchEventRecyclerView.setVisibility(8);
        } else {
            noTouchEventRecyclerView.setVisibility(0);
            this.f125828y.k(list);
        }
    }
}
