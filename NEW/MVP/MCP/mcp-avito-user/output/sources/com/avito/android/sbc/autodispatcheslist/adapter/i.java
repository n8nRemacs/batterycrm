package com.avito.android.sbc.autodispatcheslist.adapter;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SbcAutoDispatchItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/i;", "LTV0/d;", "Lcom/avito/android/sbc/autodispatcheslist/adapter/n;", "Lcom/avito/android/sbc/autodispatcheslist/adapter/f;", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements TV0.d<n, f> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f259059b;

    /* compiled from: SbcAutoDispatchItemPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/adapter/i$a;", "", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(@Y61.k f fVar);

        void b(@Y61.k f fVar);

        void c(@Y61.k f fVar);
    }

    @Inject
    public i(@Y61.k a aVar) {
        this.f259059b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        n nVar = (n) eVar;
        f fVar = (f) aVar;
        j jVar = new j(this, fVar);
        k kVar = new k(this, fVar);
        l lVar = new l(this, fVar);
        com.avito.android.saved_searches.presentation.items.switcher.l lVar2 = new com.avito.android.saved_searches.presentation.items.switcher.l(1, jVar);
        View view = nVar.f259068b;
        view.setOnClickListener(lVar2);
        com.avito.android.saved_searches.presentation.items.switcher.l lVar3 = new com.avito.android.saved_searches.presentation.items.switcher.l(2, kVar);
        TextView textView = nVar.f259077k;
        textView.setOnClickListener(lVar3);
        com.avito.android.saved_searches.presentation.items.switcher.l lVar4 = new com.avito.android.saved_searches.presentation.items.switcher.l(3, lVar);
        Button button = nVar.f259082p;
        button.setOnClickListener(lVar4);
        nVar.f259070d.setText(fVar.f259048g);
        DispatchViewStatus dispatchViewStatus = fVar.f259044c;
        int iOrdinal = dispatchViewStatus.ordinal();
        Badge badge = nVar.f259072f;
        Badge badge2 = nVar.f259071e;
        if (iOrdinal == 0) {
            D6.H(badge2);
            D6.w(badge);
        } else if (iOrdinal == 1) {
            D6.w(badge2);
            D6.H(badge);
        } else if (iOrdinal == 2) {
            D6.w(badge2);
            D6.w(badge);
        }
        nVar.f259074h.setText(fVar.f259047f);
        Resources resources = view.getContext().getResources();
        List<com.avito.android.sbc.autodispatcheslist.adapter.a> list = fVar.f259045d;
        nVar.f259075i.setText(resources.getQuantityString(R.plurals.sbc_auto_dispatch_advert, list.size(), Integer.valueOf(list.size())));
        b bVar = nVar.f259083q;
        D6.G(bVar.f259033a, list.size() > 0);
        b bVar2 = nVar.f259084r;
        D6.G(bVar2.f259033a, list.size() > 1);
        b bVar3 = nVar.f259085s;
        D6.G(bVar3.f259033a, list.size() > 2);
        com.avito.android.sbc.autodispatcheslist.adapter.a aVar2 = (com.avito.android.sbc.autodispatcheslist.adapter.a) C42745f0.K(0, list);
        if (aVar2 != null) {
            bVar.a(aVar2);
        }
        com.avito.android.sbc.autodispatcheslist.adapter.a aVar3 = (com.avito.android.sbc.autodispatcheslist.adapter.a) C42745f0.K(1, list);
        if (aVar3 != null) {
            bVar2.a(aVar3);
        }
        com.avito.android.sbc.autodispatcheslist.adapter.a aVar4 = (com.avito.android.sbc.autodispatcheslist.adapter.a) C42745f0.K(2, list);
        if (aVar4 != null) {
            bVar3.a(aVar4);
        }
        ColorStateList colorStateListE = C35835l0.e(R.attr.black, view.getContext());
        ImageView imageView = nVar.f259073g;
        imageView.setImageTintList(colorStateListE);
        boolean z12 = fVar.f259046e;
        DescriptionParameterItem descriptionParameterItem = nVar.f259081o;
        DescriptionParameterItem descriptionParameterItem2 = nVar.f259080n;
        DescriptionParameterItem descriptionParameterItem3 = nVar.f259079m;
        DescriptionParameterItem descriptionParameterItem4 = nVar.f259078l;
        ViewGroup viewGroup = nVar.f259076j;
        if (!z12) {
            imageView.setImageResource(R.drawable.common_ic_arrow_expand_less_24);
            D6.w(viewGroup);
            D6.w(textView);
            D6.w(descriptionParameterItem4);
            D6.w(descriptionParameterItem3);
            D6.w(descriptionParameterItem2);
            D6.w(descriptionParameterItem);
            D6.w(button);
            return;
        }
        imageView.setImageResource(R.drawable.common_ic_arrow_expand_more_24);
        D6.H(viewGroup);
        int size = list.size() - 3;
        if (size > 0) {
            D6.H(textView);
            textView.setText(view.getContext().getResources().getQuantityString(R.plurals.sbc_auto_dispatch_more_adverts, size, Integer.valueOf(size)));
        } else {
            D6.w(textView);
        }
        D6.H(descriptionParameterItem4);
        D6.H(descriptionParameterItem3);
        D6.H(descriptionParameterItem2);
        D6.H(descriptionParameterItem);
        if (dispatchViewStatus != DispatchViewStatus.f259025d && nVar.f259069c) {
            D6.H(button);
        }
        descriptionParameterItem4.getLeftTextView().setText("Получатели");
        descriptionParameterItem4.getRightTextView().setText(fVar.f259049h);
        descriptionParameterItem3.getLeftTextView().setText("Созданные чаты");
        descriptionParameterItem3.getRightTextView().setText(fVar.f259050i);
        descriptionParameterItem2.getLeftTextView().setText("Бюджет");
        descriptionParameterItem2.getRightTextView().setText(fVar.f259051j);
        descriptionParameterItem.getLeftTextView().setText("Расходы");
        descriptionParameterItem.getRightTextView().setText(fVar.f259052k);
    }
}
