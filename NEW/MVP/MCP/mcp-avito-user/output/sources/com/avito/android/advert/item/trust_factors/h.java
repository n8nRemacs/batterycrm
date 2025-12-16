package com.avito.android.advert.item.trust_factors;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.DeliveryTrustFactors;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DeliveryTrustFactorsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/trust_factors/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/trust_factors/g;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f80630l = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f80631b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f80632c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f80633d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f80634e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f80635f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f80636g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f80637h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final TextView f80638i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final TextView f80639j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f80640k;

    public h(@k View view) {
        super(view);
        this.f80631b = view;
        this.f80632c = view.findViewById(R.id.trust_factors_container);
        View viewFindViewById = view.findViewById(R.id.tv_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80633d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.tv_footerText);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80634e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tv_trust_factor_1);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80635f = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.tv_trust_factor_2);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80636g = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.tv_trust_factor_3);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80637h = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.tv_icon_1);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80638i = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tv_icon_2);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80639j = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.tv_icon_3);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80640k = (TextView) viewFindViewById8;
    }

    @Override // com.avito.android.advert.item.trust_factors.g
    public final void Lk(@k String str) {
        this.f80634e.setText(str);
    }

    @Override // com.avito.android.advert.item.trust_factors.g
    public final void TC(@k List<DeliveryTrustFactors.TrustFactor> list) {
        List listU = C42745f0.U(this.f80635f, this.f80636g, this.f80637h);
        List listU2 = C42745f0.U(this.f80638i, this.f80639j, this.f80640k);
        int i12 = 0;
        for (Object obj : C42745f0.E0(list, listU.size())) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            DeliveryTrustFactors.TrustFactor trustFactor = (DeliveryTrustFactors.TrustFactor) obj;
            ((TextView) listU.get(i12)).setText(trustFactor.getTitle());
            Integer numM = com.avito.android.lib.util.f.m(trustFactor.getIcon());
            if (numM != null) {
                int iIntValue = numM.intValue();
                FV.a aVar = FV.a.f4720a;
                TextView textView = (TextView) listU2.get(i12);
                aVar.getClass();
                FV.a.c(textView, iIntValue);
            }
            i12 = i13;
        }
    }

    @Override // com.avito.android.advert.item.trust_factors.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f80632c.setOnClickListener(new com.avito.android.advert.item.parking.h(24, aVar));
    }

    @Override // com.avito.android.advert.item.trust_factors.g
    public final void setTitle(@k String str) {
        this.f80633d.setText(str);
    }
}
