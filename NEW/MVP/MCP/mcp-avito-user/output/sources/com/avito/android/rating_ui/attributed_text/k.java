package com.avito.android.rating_ui.attributed_text;

import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: RatingAttributedTextItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/attributed_text/k;", "Lcom/avito/android/rating_ui/attributed_text/j;", "Lcom/avito/konveyor/adapter/b;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.a<G0> f249950b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f249951c;

    public k(@Y61.k View view) {
        super(view);
        this.f249951c = (TextView) view.findViewById(R.id.attributed_text);
    }

    @Override // com.avito.android.rating_ui.attributed_text.j
    public final void E(@Y61.k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        D6.c(this.f249951c, Integer.valueOf((int) this.itemView.getResources().getDimension(ratingItemsMarginHorizontal.H0())), null, null, null, 14);
    }

    @Override // com.avito.android.rating_ui.attributed_text.j
    public final void d(@l Y41.a<G0> aVar) {
        this.f249950b = aVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f249950b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.rating_ui.attributed_text.j
    public final void m0(@Y61.k AttributedText attributedText) {
        TextView textView = this.f249951c;
        com.avito.android.util.text.j.c(textView, attributedText, null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
