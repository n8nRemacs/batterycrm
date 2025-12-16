package com.avito.android.vas_union.ui.items.vas_bundle;

import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.selector_card.SelectorCardGroup;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.vas_union.ui.items.vas_bundle.c;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: VasUnionV2BundleItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_union/ui/items/vas_bundle/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/vas_union/ui/items/vas_bundle/j;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f323301b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f323302c;

    /* renamed from: d, reason: collision with root package name */
    public final SelectorCardGroup f323303d;

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f323301b = aVar;
        this.f323302c = (TextView) view.findViewById(R.id.vas_union_v2_bundle_description);
        SelectorCardGroup selectorCardGroup = (SelectorCardGroup) view.findViewById(R.id.vas_union_v2_bundle_selector_group);
        selectorCardGroup.setContentBinderFactory(new b(aVar));
        this.f323303d = selectorCardGroup;
    }

    @Override // com.avito.android.vas_union.ui.items.vas_bundle.j
    public final void g(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f323302c, attributedText, this.f323301b);
    }

    @Override // com.avito.android.vas_union.ui.items.vas_bundle.j
    public final void qy(@Y61.k List<c.a> list, @Y61.k c.a aVar, @Y61.k Y41.l<? super c.a, G0> lVar) {
        SelectorCardGroup selectorCardGroup = this.f323303d;
        selectorCardGroup.setSelectedListener(null);
        selectorCardGroup.setData(list);
        selectorCardGroup.d(aVar, true);
        SelectorCardGroup.c(selectorCardGroup, aVar);
        selectorCardGroup.setSelectedListener(new a(lVar));
    }

    /* compiled from: VasUnionV2BundleItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/vas_union/ui/items/vas_bundle/k$a", "Lcom/avito/android/lib/design/selector_card/SelectorCardGroup$c;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SelectorCardGroup.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<c.a, G0> f323304a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super c.a, G0> lVar) {
            this.f323304a = lVar;
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void b(@Y61.k r rVar) {
            this.f323304a.invoke(rVar);
        }

        @Override // com.avito.android.lib.design.selector_card.SelectorCardGroup.c
        public final void a(@Y61.k r rVar) {
        }
    }
}
