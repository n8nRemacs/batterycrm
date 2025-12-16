package com.avito.android.tariff.cpx.levels.ui.items.business_tool;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CpxBusinessToolItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpx/levels/ui/items/business_tool/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpx/levels/ui/items/business_tool/h;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f297170h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f297171b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f297172c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f297173d;

    /* renamed from: e, reason: collision with root package name */
    public final SimpleDraweeView f297174e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f297175f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f297176g;

    public i(@k View view) {
        super(view);
        this.f297171b = view;
        this.f297172c = (TextView) view.findViewById(R.id.cpx_business_tool_item_title);
        this.f297173d = (TextView) view.findViewById(R.id.cpx_business_tool_item_description);
        this.f297174e = (SimpleDraweeView) view.findViewById(R.id.cpx_business_tool_item_image);
        this.f297175f = (FrameLayout) view.findViewById(R.id.cpx_business_tool_item_lock_icon);
        this.f297176g = (ImageView) view.findViewById(R.id.cpx_business_tool_item_navigation_icon);
        FV.a aVar = FV.a.f4720a;
        TextView textView = (TextView) view.findViewById(R.id.cpx_business_tool_item_lock_icon_text);
        aVar.getClass();
        FV.a.c(textView, R.attr.textIconLock);
    }

    @Override // com.avito.android.tariff.cpx.levels.ui.items.business_tool.h
    public final void N0(boolean z12) {
        FrameLayout frameLayout = this.f297175f;
        if (z12) {
            D6.g(frameLayout);
        } else {
            D6.H(frameLayout);
        }
    }

    @Override // com.avito.android.tariff.cpx.levels.ui.items.business_tool.h
    public final void c(@l Y41.a<G0> aVar) {
        View view = this.f297171b;
        ImageView imageView = this.f297176g;
        if (aVar == null) {
            D6.w(imageView);
            view.setOnClickListener(null);
        } else {
            D6.H(imageView);
            view.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(14, aVar));
        }
    }

    @Override // com.avito.android.tariff.cpx.levels.ui.items.business_tool.h
    public final void g(@l AttributedText attributedText) {
        j.a(this.f297173d, attributedText, null);
    }

    @Override // com.avito.android.tariff.cpx.levels.ui.items.business_tool.h
    public final void i(@k UniversalImage universalImage) {
        C35949t5.c(this.f297174e, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f297171b.getContext()))), null, null, null, 14);
    }

    @Override // com.avito.android.tariff.cpx.levels.ui.items.business_tool.h
    public final void setTitle(@k String str) {
        this.f297172c.setText(str);
    }
}
