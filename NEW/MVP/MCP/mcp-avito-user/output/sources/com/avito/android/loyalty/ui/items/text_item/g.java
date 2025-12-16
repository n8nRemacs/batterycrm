package com.avito.android.loyalty.ui.items.text_item;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LoyaltyTextItemView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/items/text_item/g;", "Lcom/avito/konveyor/adapter/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f183755b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Y41.a<G0> f183756c;

    public g(@k View view) {
        super(view);
        TextView textView = (TextView) this.itemView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.f183755b = textView;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f183756c;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f183756c = null;
    }
}
