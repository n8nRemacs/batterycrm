package com.avito.android.advert.item.safedeal.trust_factors.header;

import Y61.k;
import Y61.l;
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

/* compiled from: TrustFactorsHeaderView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/safedeal/trust_factors/header/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/safedeal/trust_factors/n;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f79166b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final i f79167c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f79168d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f79169e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f79170f;

    public f(@k ViewGroup viewGroup, @k com.avito.android.util.text.a aVar, @l i iVar) {
        super(viewGroup);
        this.f79166b = aVar;
        this.f79167c = iVar;
        View viewFindViewById = viewGroup.findViewById(R.id.header_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f79168d = (TextView) viewFindViewById;
        View viewFindViewById2 = viewGroup.findViewById(R.id.header_dropdown_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f79169e = (ImageView) viewFindViewById2;
        View viewFindViewById3 = viewGroup.findViewById(R.id.header_info_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f79170f = (ImageView) viewFindViewById3;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        i iVar = this.f79167c;
        if (iVar != null) {
            iVar.a();
        }
    }
}
