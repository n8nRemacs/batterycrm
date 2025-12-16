package com.avito.android.tariff_cpt.info.ui.items.feature;

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

/* compiled from: CptInfoFeatureItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/ui/items/feature/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff_cpt/info/ui/items/feature/h;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f298309h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f298310b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f298311c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f298312d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f298313e;

    /* renamed from: f, reason: collision with root package name */
    public final SimpleDraweeView f298314f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f298315g;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f298310b = view;
        this.f298311c = aVar;
        this.f298312d = (TextView) view.findViewById(R.id.cpt_info_feature_item_title);
        this.f298313e = (TextView) view.findViewById(R.id.cpt_info_feature_item_description);
        this.f298314f = (SimpleDraweeView) view.findViewById(R.id.cpt_info_feature_item_image);
        this.f298315g = (FrameLayout) view.findViewById(R.id.cpt_info_feature_item_lock_icon);
        FV.a aVar2 = FV.a.f4720a;
        TextView textView = (TextView) view.findViewById(R.id.cpt_info_feature_item_lock_icon_text);
        aVar2.getClass();
        FV.a.c(textView, R.attr.textIconLock);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.feature.h
    public final void N0(boolean z12) {
        FrameLayout frameLayout = this.f298315g;
        if (z12) {
            D6.g(frameLayout);
        } else {
            D6.H(frameLayout);
        }
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.feature.h
    public final void Q4(@k iC0.f fVar) {
        C35949t5.c(this.f298314f, com.avito.android.image_loader.b.b(fVar.a(this.f298310b.getContext())), null, null, null, 14);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.feature.h
    public final void c(@l Y41.a<G0> aVar) {
        View view = this.f298310b;
        if (aVar == null) {
            view.setOnClickListener(null);
        } else {
            view.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(18, aVar));
        }
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.feature.h
    public final void g(@l AttributedText attributedText) {
        j.a(this.f298313e, attributedText, this.f298311c);
    }

    @Override // com.avito.android.tariff_cpt.info.ui.items.feature.h
    public final void setTitle(@k String str) {
        this.f298312d.setText(str);
    }
}
