package com.avito.android.advert_details_items.search_suggests;

import Y41.l;
import Y61.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsSearchSuggestsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_details_items/search_suggests/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_details_items/search_suggests/g;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f85527e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f85528b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f85529c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinearLayout f85530d;

    public h(@k View view) {
        super(view);
        this.f85528b = view;
        View viewFindViewById = view.findViewById(R.id.section_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f85529c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_details_search_suggests);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f85530d = (LinearLayout) viewFindViewById2;
    }

    @Override // com.avito.android.advert_details_items.search_suggests.g
    public final void L3(@k l lVar, @k List list) {
        LinearLayout linearLayout = this.f85530d;
        linearLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f85528b.getContext());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AdvertDetailsSearchSuggestItem advertDetailsSearchSuggestItem = (AdvertDetailsSearchSuggestItem) it.next();
            View viewInflate = layoutInflaterFrom.inflate(R.layout.advert_details_search_suggest_item, (ViewGroup) linearLayout, false);
            Integer numM = com.avito.android.lib.util.f.m("category");
            if (numM != null) {
                int iIntValue = numM.intValue();
                FV.a aVar = FV.a.f4720a;
                View viewFindViewById = viewInflate.findViewById(R.id.icon);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                aVar.getClass();
                FV.a.c((TextView) viewFindViewById, iIntValue);
            }
            Integer numM2 = com.avito.android.lib.util.f.m("arrowForwardIos");
            if (numM2 != null) {
                int iIntValue2 = numM2.intValue();
                FV.a aVar2 = FV.a.f4720a;
                View viewFindViewById2 = viewInflate.findViewById(R.id.right_arrow_icon);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                aVar2.getClass();
                FV.a.c((TextView) viewFindViewById2, iIntValue2);
            }
            View viewFindViewById3 = viewInflate.findViewById(R.id.title);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById3;
            textView.setText(advertDetailsSearchSuggestItem.f85504c);
            String str = advertDetailsSearchSuggestItem.f85505d;
            if (str != null) {
                if ((str.length() > 0 ? str : null) != null) {
                    textView.setMaxLines(1);
                    View viewFindViewById4 = viewInflate.findViewById(R.id.subtitle);
                    if (viewFindViewById4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView2 = (TextView) viewFindViewById4;
                    textView2.setText(str);
                    textView2.setVisibility(0);
                } else {
                    continue;
                }
            }
            viewInflate.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(24, lVar, advertDetailsSearchSuggestItem));
            linearLayout.addView(viewInflate);
        }
    }

    @Override // com.avito.android.advert_details_items.search_suggests.g
    public final void setTitle(@Y61.l String str) {
        this.f85529c.setText(str);
    }

    @Override // com.avito.android.advert_details_items.search_suggests.g
    public final void setVisible(boolean z12) {
        this.f85528b.setVisibility(!z12 ? 8 : 0);
    }
}
