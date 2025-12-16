package com.avito.android.comfortable_deal.deal.item.digitalregistration.small;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.calltracking.item.m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DigitalRegistrationSmallBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/digitalregistration/small/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/deal/item/digitalregistration/small/f;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f121418c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f121419b;

    public g(@k View view) {
        super(view);
        this.f121419b = view;
        FV.a aVar = FV.a.f4720a;
        View viewFindViewById = view.findViewById(R.id.text_order);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        aVar.f((TextView) viewFindViewById, R.attr.textIconArrowForwardIos, FV.a.f4721b);
    }

    @Override // com.avito.android.comfortable_deal.deal.item.digitalregistration.small.f
    public final void a(@k Y41.a<G0> aVar) {
        this.f121419b.setOnClickListener(new m(19, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f121419b.setOnClickListener(null);
    }
}
