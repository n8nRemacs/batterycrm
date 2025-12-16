package com.avito.android.advert_details_items.price_history;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PriceHistoryView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/price_history/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/price_history/i;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f85405b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f85406c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Y41.a<G0> f85407d;

    /* compiled from: PriceHistoryView.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f85408l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a<G0> aVar) {
            super(0);
            this.f85408l = aVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f85408l.invoke();
            return G0.f406611a;
        }
    }

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f85405b = aVar;
        this.f85406c = (TextView) view.findViewById(R.id.item_price_history);
    }

    @Override // com.avito.android.advert_details_items.price_history.i
    public final void d(@k Y41.a<G0> aVar) {
        this.f85407d = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f85407d;
        if (aVar != null) {
            aVar.invoke();
        }
        this.f85407d = null;
    }

    @Override // com.avito.android.advert_details_items.price_history.i
    public final void r20(@k AttributedText attributedText, @k Y41.a<G0> aVar) {
        TextView textView = this.f85406c;
        com.avito.android.util.text.j.a(textView, attributedText, this.f85405b);
        I5.c(textView, new a(aVar));
    }
}
