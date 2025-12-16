package com.avito.android.advert.item.safedeal.components.creators;

import Y61.k;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.R;
import com.avito.android.advert_core.safedeal.u;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.remote.model.text.TextIconAttribute;
import com.avito.android.remote.safedeal.SafeDeal;
import com.avito.android.util.text.j;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ExpandableListItemSafeDealViewCreator.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/components/creators/c;", "Lcom/avito/android/advert_core/safedeal/u;", "Lcom/avito/android/remote/safedeal/SafeDeal$Component$ExpandableListItem;", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements u<SafeDeal.Component.ExpandableListItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f78791b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f78792a;

    /* compiled from: ExpandableListItemSafeDealViewCreator.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/safedeal/components/creators/c$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k com.avito.android.util.text.a aVar) {
        this.f78792a = aVar;
    }

    @Override // com.avito.android.advert_core.safedeal.u
    public final boolean a(@k SafeDeal.Component component) {
        return component instanceof SafeDeal.Component.ExpandableListItem;
    }

    @Override // com.avito.android.advert_core.safedeal.u
    public final View b(ViewGroup viewGroup, SafeDeal.Component component, com.avito.android.advert_core.safedeal.a aVar) {
        View viewB = C0.b(viewGroup, R.layout.advert_details_safedeal_expandable_list_item, viewGroup, false);
        SafeDeal.Component.ExpandableListItem expandableListItemA = SafeDeal.Component.ExpandableListItem.a((SafeDeal.Component.ExpandableListItem) component, true);
        d dVar = d.f78793l;
        f78791b.getClass();
        View viewFindViewById = viewB.findViewById(R.id.expand_click_overlay);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        View viewFindViewById2 = viewB.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewB.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView2 = (TextView) viewFindViewById3;
        View viewFindViewById4 = viewB.findViewById(R.id.arrow_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView3 = (TextView) viewFindViewById4;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        AttributedText title = expandableListItemA.getTitle();
        com.avito.android.util.text.a aVar2 = this.f78792a;
        j.c(textView, title, aVar2);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        j.c(textView2, expandableListItemA.getDescription(), aVar2);
        boolean z12 = expandableListItemA.f254348b;
        textView2.setVisibility(z12 ? 0 : 8);
        j.c(textView3, new AttributedText("{{icon}}", Collections.singletonList(new TextIconAttribute("icon", z12 ? "expandLess" : "expandMore", null, Collections.singletonList(new FontParameter.ColorParameter(null, null, AvitoMapMarkerKt.AMENITY_TYPE_BLACK)), 4, null)), 1), aVar2);
        viewFindViewById.setOnClickListener(new com.avito.android.advert.item.parking.h(11, dVar));
        return viewB;
    }
}
