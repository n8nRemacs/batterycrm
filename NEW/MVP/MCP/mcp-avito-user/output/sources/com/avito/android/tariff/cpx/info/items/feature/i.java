package com.avito.android.tariff.cpx.info.items.feature;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: TariffCpxInfoFeatureItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/feature/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpx/info/items/feature/h;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f296469g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f296470b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f296471c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f296472d;

    /* renamed from: e, reason: collision with root package name */
    public final SimpleDraweeView f296473e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f296474f;

    public i(@k View view) {
        super(view);
        this.f296470b = view;
        this.f296471c = (TextView) view.findViewById(R.id.tariff_cpx_info_feature_item_title);
        this.f296472d = (TextView) view.findViewById(R.id.tariff_cpx_info_feature_item_description);
        this.f296473e = (SimpleDraweeView) view.findViewById(R.id.tariff_cpx_info_feature_item_image);
        this.f296474f = (FrameLayout) view.findViewById(R.id.tariff_cpx_info_feature_item_lock_icon);
        FV.a aVar = FV.a.f4720a;
        TextView textView = (TextView) view.findViewById(R.id.tariff_cpx_info_feature_item_lock_icon_text);
        aVar.getClass();
        FV.a.c(textView, R.attr.textIconLock);
    }

    @Override // com.avito.android.tariff.cpx.info.items.feature.h
    public final void N0(boolean z12) {
        FrameLayout frameLayout = this.f296474f;
        if (z12) {
            D6.g(frameLayout);
        } else {
            D6.H(frameLayout);
        }
    }

    @Override // com.avito.android.tariff.cpx.info.items.feature.h
    public final void Q6(@l wZ.l lVar) {
        C35949t5.c(this.f296473e, com.avito.android.image_loader.b.b(lVar.a(this.f296470b.getContext())), null, null, null, 14);
    }

    @Override // com.avito.android.tariff.cpx.info.items.feature.h
    public final void c(@l Y41.a<G0> aVar) {
        View view = this.f296470b;
        if (aVar == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(10, aVar));
        }
    }

    @Override // com.avito.android.tariff.cpx.info.items.feature.h
    public final void g(@k AttributedText attributedText) {
        j.c(this.f296472d, attributedText, null);
    }

    @Override // com.avito.android.tariff.cpx.info.items.feature.h
    public final void setTitle(@k String str) {
        this.f296471c.setText(str);
    }
}
