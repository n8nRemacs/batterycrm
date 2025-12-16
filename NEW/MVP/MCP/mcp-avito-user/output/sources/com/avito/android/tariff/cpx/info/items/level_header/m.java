package com.avito.android.tariff.cpx.info.items.level_header;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TariffCpxInfoLevelHeaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/info/items/level_header/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpx/info/items/level_header/l;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f296553g = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f296554b;

    /* renamed from: c, reason: collision with root package name */
    public final Button f296555c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f296556d;

    /* renamed from: e, reason: collision with root package name */
    public final Banner f296557e;

    /* renamed from: f, reason: collision with root package name */
    public final float f296558f;

    public m(@Y61.k View view) {
        super(view);
        this.f296554b = (TextView) view.findViewById(R.id.tariff_cpx_info_level_header_title);
        this.f296555c = (Button) view.findViewById(R.id.tariff_cpx_info_level_header_button);
        TextView textView = (TextView) view.findViewById(R.id.tariff_cpx_info_level_header_description);
        this.f296556d = textView;
        this.f296557e = (Banner) view.findViewById(R.id.tariff_cpx_info_level_header_banner);
        this.f296558f = y6.b(24);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.tariff.cpx.info.items.level_header.l
    public final void Ql(@Y61.k a aVar, @Y61.k com.avito.android.util.text.a aVar2, @Y61.k Y41.a<G0> aVar3) {
        Banner banner = this.f296557e;
        D6.H(banner);
        wZ.k kVar = aVar.f296526a;
        Integer numA = kVar != null ? kVar.a(banner.getContext()) : null;
        if (numA != null) {
            banner.setBackgroundColor(numA.intValue());
        }
        v.a(banner, this.f296558f);
        TextView textView = (TextView) banner.getContainer().findViewById(R.id.tariff_cpx_info_level_header_item_banner_container_title);
        if (textView != null) {
            com.avito.android.util.text.j.a(textView, aVar.f296527b, aVar2);
        }
        Image imageA = aVar.f296528c.a(banner.getContext());
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) banner.getContainer().findViewById(R.id.tariff_cpx_info_level_header_item_banner_container_icon);
        if (simpleDraweeView != null) {
            C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(imageA), null, null, null, 14);
        }
        banner.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(13, aVar3));
    }

    @Override // com.avito.android.tariff.cpx.info.items.level_header.l
    public final void ZV() {
        D6.w(this.f296557e);
    }

    @Override // com.avito.android.tariff.cpx.info.items.level_header.l
    public final void de(@Y61.l AttributedText attributedText, @Y61.k com.avito.android.util.text.a aVar) {
        com.avito.android.util.text.j.a(this.f296556d, attributedText, aVar);
    }

    @Override // com.avito.android.tariff.cpx.info.items.level_header.l
    public final void setTitle(@Y61.k String str) {
        this.f296554b.setText(str);
    }

    @Override // com.avito.android.tariff.cpx.info.items.level_header.l
    public final void tk(@Y61.k b bVar, @Y61.k Y41.a<G0> aVar) {
        com.avito.android.sx_address.address_video_verification.view.b bVar2 = new com.avito.android.sx_address.address_video_verification.view.b(12, aVar);
        Button button = this.f296555c;
        button.setOnClickListener(bVar2);
        button.setAppearanceFromAttr(bVar.f296533d);
        Integer num = bVar.f296532c;
        String str = bVar.f296531b;
        if (str != null && num != null) {
            button.setText(str);
            Button.g(button, null, C35835l0.h(num.intValue(), this.itemView.getContext()), false, null, 13);
        } else if (str != null && num == null) {
            button.setText(str);
        } else {
            if (str != null || num == null) {
                return;
            }
            button.setImageDrawable(C35835l0.h(num.intValue(), this.itemView.getContext()));
        }
    }
}
