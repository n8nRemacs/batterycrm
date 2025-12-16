package com.avito.android.verification.inn.list.select;

import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.deep_linking.links.w;
import com.avito.android.di.B;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SelectItemPresenter.kt */
@B
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/select/g;", "LTV0/d;", "Lcom/avito/android/verification/inn/list/select/k;", "Lcom/avito/android/verification/inn/list/select/SelectItem;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements TV0.d<k, SelectItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final w f324084b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final c f324085c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f324086d;

    @Inject
    public g(@Y61.k w wVar, @Y61.k c cVar, @Y61.k com.avito.android.util.text.a aVar) {
        this.f324084b = wVar;
        this.f324085c = cVar;
        this.f324086d = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k kVar = (k) eVar;
        SelectItem selectItem = (SelectItem) aVar;
        AttributedText attributedText = selectItem.f324064h;
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(this.f324084b);
        }
        d dVar = new d(this, selectItem);
        kVar.getClass();
        A a12 = new A(23, dVar);
        Input input = kVar.f324094b;
        input.setOnClickListener(a12);
        kVar.f324096d = new f(kVar, selectItem);
        String str = selectItem.f324063g;
        ComponentContainer componentContainer = kVar.f324095c;
        componentContainer.setTitle(str);
        G0 g02 = null;
        ParcelableEntity<String> parcelableEntity = selectItem.f324066j;
        String title = parcelableEntity != null ? parcelableEntity.getTitle() : null;
        if (title == null) {
            title = "";
        }
        Input.t(input, title, false, 6);
        componentContainer.setEnabled(!selectItem.f324062f);
        input.setHint(selectItem.f324068l);
        com.avito.android.util.text.a aVar2 = this.f324086d;
        componentContainer.setMessage(attributedText != null ? aVar2.c(kVar.itemView.getContext(), attributedText) : null);
        if (selectItem.f324069m == null && selectItem.f324070n == null) {
            componentContainer.setTitleTipViewListener(null);
        } else {
            componentContainer.setTitleTipViewListener(new j(kVar, selectItem));
        }
        AttributedText attributedText2 = selectItem.f324061e;
        if (attributedText2 != null) {
            ComponentContainer.l(componentContainer, new int[]{input.getId()}, aVar2.c(kVar.itemView.getContext(), attributedText2), 4);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            componentContainer.k();
        }
        ((RecyclerView.n) kVar.itemView.getLayoutParams()).setMargins(0, y6.b(selectItem.f324071o), 0, y6.b(selectItem.f324072p));
    }
}
