package com.avito.android.advert.item.safedeal.trust_factors.list_item;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.safedeal.trust_factors.i;
import com.avito.android.advert.item.safedeal.trust_factors.n;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TrustFactorsListItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/list_item/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/safedeal/trust_factors/n;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f79206b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final i f79207c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f79208d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f79209e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f79210f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ImageView f79211g;

    public f(@k ViewGroup viewGroup, @k com.avito.android.util.text.a aVar, @l i iVar) {
        super(viewGroup);
        this.f79206b = aVar;
        this.f79207c = iVar;
        this.f79208d = viewGroup.getContext();
        View viewFindViewById = viewGroup.findViewById(R.id.trust_factor_icon);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f79209e = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.trust_factor_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79210f = (TextView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.trust_factor_hint_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f79211g = (ImageView) viewFindViewById3;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        i iVar = this.f79207c;
        if (iVar != null) {
            iVar.a();
        }
    }
}
