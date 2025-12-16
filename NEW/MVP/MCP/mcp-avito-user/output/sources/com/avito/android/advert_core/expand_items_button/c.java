package com.avito.android.advert_core.expand_items_button;

import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExpandItemsButtonAutoRedesignViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_core/expand_items_button/c;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/expand_items_button/k;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends com.avito.konveyor.adapter.b implements k {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f83577c = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f83578b;

    public c(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.expand_items_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f83578b = (Button) viewFindViewById;
    }

    @Override // com.avito.android.advert_core.expand_items_button.k
    public final void PZ(@Y61.l String str, @Y61.k Y41.a<G0> aVar) {
        Button button = this.f83578b;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.advert_collection.adapter.order.h(6, aVar));
    }
}
