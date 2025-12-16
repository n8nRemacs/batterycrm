package com.avito.android.beduin.common.component.inline_filter.item;

import Y41.p;
import android.view.View;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.search.Filter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InlineFilterPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/inline_filter/item/m;", "LTV0/d;", "Lcom/avito/android/beduin/common/component/inline_filter/item/k;", "Lcom/avito/android/beduin/common/component/inline_filter/item/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m implements TV0.d<k, a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final p<View, Filter, G0> f101526b;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@Y61.k p<? super View, ? super Filter, G0> pVar) {
        this.f101526b = pVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        a aVar2 = (a) aVar;
        Filter filter = aVar2.f101504b;
        String displayTitle = filter.getDisplayTitle();
        if (displayTitle == null && (displayTitle = filter.getTitle()) == null) {
            displayTitle = "";
        }
        Button button = kVar.f101523c;
        button.setText(displayTitle);
        button.setActivated(L.f(filter.isHighlighted(), Boolean.TRUE));
        button.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(21, new l(this, aVar2), kVar));
    }
}
