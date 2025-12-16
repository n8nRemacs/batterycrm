package com.avito.android.advert.item.branding_advantages.block;

import Oi0.C14700d;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.advert.item.branding_advantages.block_element.BrandingAdvantagesBlockElementItem;
import com.avito.android.util.ExpandablePanelLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BrandingAdvantagesBlockItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/branding_advantages/block/h;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f74191b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14700d f74192c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f74193d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ArrayList f74194e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final UV0.c<BrandingAdvantagesBlockElementItem> f74195f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final RecyclerView f74196g;

    /* renamed from: h, reason: collision with root package name */
    public final ExpandablePanelLayout f74197h;

    public h(@k View view, @k com.avito.konveyor.adapter.a aVar, @k C14700d c14700d) {
        super(view);
        this.f74191b = aVar;
        this.f74192c = c14700d;
        this.f74193d = (TextView) view.findViewById(R.id.advert_details_branding_advantages_block_title);
        ArrayList arrayList = new ArrayList();
        this.f74194e = arrayList;
        this.f74195f = new UV0.c<>(arrayList);
        View viewFindViewById = view.findViewById(R.id.advert_details_branding_advantages_block_elements);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f74196g = recyclerView;
        this.f74197h = (ExpandablePanelLayout) view.findViewById(R.id.advert_details_branding_advantages_block_description_root);
        recyclerView.setAdapter(c14700d);
        view.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(3));
        recyclerView.l(new N4.a(view.getResources().getDimensionPixelSize(R.dimen.branding_advantages_elements_padding)), -1);
    }
}
