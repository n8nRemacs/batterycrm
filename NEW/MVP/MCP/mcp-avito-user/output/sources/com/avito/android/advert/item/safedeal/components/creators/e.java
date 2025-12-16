package com.avito.android.advert.item.safedeal.components.creators;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.advert_core.safedeal.u;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderSafeDealViewCreator.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/safedeal/components/creators/e;", "Lcom/avito/android/advert_core/safedeal/u;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$Header;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements u<SafeDeal.Component.Header> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f78794a;

    public e(@k com.avito.android.util.text.a aVar) {
        this.f78794a = aVar;
    }

    @Override // com.avito.android.advert_core.safedeal.u
    public final boolean a(@k SafeDeal.Component component) {
        return component instanceof SafeDeal.Component.Header;
    }

    @Override // com.avito.android.advert_core.safedeal.u
    public final View b(ViewGroup viewGroup, SafeDeal.Component component, com.avito.android.advert_core.safedeal.a aVar) {
        SafeDeal.Component.Header header = (SafeDeal.Component.Header) component;
        View viewB = C0.b(viewGroup, R.layout.advert_details_safedeal_header_item, viewGroup, false);
        View viewFindViewById = viewB.findViewById(R.id.header_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        View viewFindViewById2 = viewB.findViewById(R.id.header_dropdown_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewB.findViewById(R.id.header_info_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView2 = (ImageView) viewFindViewById3;
        j.c(textView, header.getTitle(), this.f78794a);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        D6.G(imageView2, header.getInfoDeeplink() != null);
        DeepLink infoDeeplink = header.getInfoDeeplink();
        if (infoDeeplink != null) {
            imageView2.setOnClickListener(new a(aVar, infoDeeplink, 1));
        }
        D6.G(imageView, header.getTitleDeeplink() != null);
        DeepLink titleDeeplink = header.getTitleDeeplink();
        if (titleDeeplink != null) {
            textView.setOnClickListener(new a(aVar, titleDeeplink, 2));
            imageView.setOnClickListener(new a(aVar, titleDeeplink, 3));
        }
        String id2 = header.getId();
        if (id2 != null) {
            viewB.setTag(id2);
        }
        return viewB;
    }
}
