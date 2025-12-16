package com.avito.android.advert_stats.detail.tab.items.button;

import Y61.k;
import Y61.l;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.Attribute;
import com.avito.android.remote.model.text.AttributedText;
import eb.InterfaceC40078a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ButtonItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/button/h;", "Lcom/avito/android/advert_stats/detail/tab/items/button/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f86262e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f86263b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f86264c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f86265d;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f86263b = view;
        this.f86264c = aVar;
        this.f86265d = (TextView) view.findViewById(R.id.tv_dialog_link_item);
    }

    @Override // com.avito.android.advert_stats.detail.tab.items.button.f
    public final void kf(@l AttributedText attributedText, @k com.jakewharton.rxrelay3.c<G0> cVar, @k com.jakewharton.rxrelay3.c<DeepLink> cVar2, @k Y41.l<? super InterfaceC40078a, G0> lVar) {
        List<Attribute> attributes;
        CharSequence charSequenceC = this.f86264c.c(this.f86263b.getContext(), attributedText);
        TextView textView = this.f86265d;
        textView.setText(charSequenceC);
        if (attributedText != null && (attributes = attributedText.getAttributes()) != null && attributes.isEmpty()) {
            textView.setOnClickListener(new g(cVar, lVar, 0));
            return;
        }
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new com.avito.android.advert_details_items.buyer_bonuses.g(1, cVar2, lVar));
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
