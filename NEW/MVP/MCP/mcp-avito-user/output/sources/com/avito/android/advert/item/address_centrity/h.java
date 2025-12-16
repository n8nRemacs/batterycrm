package com.avito.android.advert.item.address_centrity;

import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.address_centrity.d;
import com.avito.android.image_loader.fresco.s;
import com.avito.android.lib.design.deprecated_banner.Banner;
import com.avito.android.remote.address_centrity.AddressCentrityBlock;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: AddressCentrityBlockView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/address_centrity/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/address_centrity/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f72654e = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f72655b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Banner f72656c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public AddressCentrityBlock f72657d;

    public h(@Y61.k ViewGroup viewGroup) {
        super(viewGroup);
        this.f72655b = viewGroup;
    }

    @Override // com.avito.android.advert.item.address_centrity.f
    public final void lR(@Y61.k final Y41.l lVar, @Y61.k final AddressCentrityBlock addressCentrityBlock) {
        ViewGroup.LayoutParams layoutParams;
        AddressCentrityBlock addressCentrityBlock2;
        if (addressCentrityBlock.equals(this.f72657d)) {
            Banner banner = this.f72656c;
            if (banner == null || (addressCentrityBlock2 = this.f72657d) == null || banner.getImageContainer().getF179015b() != null) {
                return;
            }
            s.b(banner.getImageContainer(), addressCentrityBlock2.getBanner().getBackground().getImage(), null, 30);
            return;
        }
        ViewGroup viewGroup = this.f72655b;
        viewGroup.removeAllViews();
        this.f72657d = addressCentrityBlock;
        Banner banner2 = new Banner(new ContextThemeWrapper(viewGroup.getContext(), R.style.Theme_DesignSystem_Re23), null, 0, 0, 14, null);
        XU.a content = banner2.getContent();
        String title = addressCentrityBlock.getBanner().getTitle();
        content.f18890a = title;
        TextView textView = content.f18894e;
        if (textView != null) {
            I5.a(textView, title, false);
        }
        String subtitle = addressCentrityBlock.getBanner().getSubtitle();
        content.f18891b = subtitle;
        TextView textView2 = content.f18895f;
        if (textView2 != null) {
            I5.a(textView2, subtitle, false);
        }
        content.a(addressCentrityBlock.getBanner().getButton().getTitle(), new View.OnClickListener() { // from class: com.avito.android.advert.item.address_centrity.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = h.f72654e;
                ((d.a) lVar).invoke(addressCentrityBlock.getBanner().getButton().getOnConfirmDeeplink());
            }
        });
        int iB2 = y6.b(24);
        int iB3 = y6.b(20);
        int iB4 = y6.b(32);
        ViewGroup viewGroup2 = banner2.f179008q;
        if (viewGroup2 != null) {
            viewGroup2.setPadding(iB2, iB3, 0, iB4);
        }
        banner2.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        int iB5 = y6.b(116);
        int iB6 = y6.b(198);
        ImageView imageView = banner2.f179010s;
        if (imageView != null && (layoutParams = imageView.getLayoutParams()) != null) {
            layoutParams.width = iB5;
            layoutParams.height = iB6;
        }
        ImageView imageView2 = banner2.f179010s;
        ViewGroup.LayoutParams layoutParams2 = imageView2 != null ? imageView2.getLayoutParams() : null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.rightMargin = 0;
        }
        this.f72656c = banner2;
        viewGroup.addView(banner2);
        Banner banner3 = this.f72656c;
        if (banner3 != null) {
            s.b(banner3.getImageContainer(), addressCentrityBlock.getBanner().getBackground().getImage(), null, 30);
        }
    }
}
