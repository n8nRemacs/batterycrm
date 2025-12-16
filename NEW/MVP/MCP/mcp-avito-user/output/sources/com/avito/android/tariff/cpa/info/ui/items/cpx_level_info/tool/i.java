package com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool;

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

/* compiled from: CpxLevelInfoToolItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/tool/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/tariff/cpa/info/ui/items/cpx_level_info/tool/h;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f294874h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f294875b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f294876c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f294877d;

    /* renamed from: e, reason: collision with root package name */
    public final SimpleDraweeView f294878e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f294879f;

    /* renamed from: g, reason: collision with root package name */
    public final ImageView f294880g;

    public i(@k View view) {
        super(view);
        this.f294875b = view;
        this.f294876c = (TextView) view.findViewById(R.id.cpx_level_info_tool_item_title);
        this.f294877d = (TextView) view.findViewById(R.id.cpx_level_info_tool_item_description);
        this.f294878e = (SimpleDraweeView) view.findViewById(R.id.cpx_level_info_tool_item_image);
        this.f294879f = (FrameLayout) view.findViewById(R.id.cpx_level_info_tool_item_lock_icon);
        this.f294880g = (ImageView) view.findViewById(R.id.cpx_level_info_tool_item_navigation_icon);
        FV.a aVar = FV.a.f4720a;
        TextView textView = (TextView) view.findViewById(R.id.cpx_level_info_tool_item_lock_icon_text);
        aVar.getClass();
        FV.a.c(textView, R.attr.textIconLock);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool.h
    public final void N0(boolean z12) {
        FrameLayout frameLayout = this.f294879f;
        if (z12) {
            D6.g(frameLayout);
        } else {
            D6.H(frameLayout);
        }
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool.h
    public final void c(@l Y41.a<G0> aVar) {
        View view = this.f294875b;
        ImageView imageView = this.f294880g;
        if (aVar == null) {
            D6.w(imageView);
            view.setOnClickListener(null);
        } else {
            D6.H(imageView);
            view.setOnClickListener(new com.avito.android.sx_address.address_video_verification.view.b(6, aVar));
        }
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool.h
    public final void g(@l AttributedText attributedText) {
        j.a(this.f294877d, attributedText, null);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool.h
    public final void i(@k UniversalImage universalImage) {
        C35949t5.c(this.f294878e, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f294875b.getContext()))), null, null, null, 14);
    }

    @Override // com.avito.android.tariff.cpa.info.ui.items.cpx_level_info.tool.h
    public final void setTitle(@k String str) {
        this.f294876c.setText(str);
    }
}
