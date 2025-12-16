package com.avito.android.advert_core.expand_items_button;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExpandItemsButtonView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/expand_items_button/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/expand_items_button/k;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class l extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f83587c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f83588b;

    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.expand_items_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83588b = (TextView) viewFindViewById;
    }

    @Override // com.avito.android.advert_core.expand_items_button.k
    public final void PZ(@Y61.l String str, @Y61.k Y41.a<G0> aVar) {
        TextView textView = this.f83588b;
        I5.a(textView, str, false);
        textView.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(7, aVar));
    }
}
