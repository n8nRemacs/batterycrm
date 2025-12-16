package com.avito.android.lf_levels.ui.items.business_tool;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
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

/* compiled from: LfBusinessToolItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/lf_levels/ui/items/business_tool/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/lf_levels/ui/items/business_tool/h;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f175417i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f175418b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f175419c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f175420d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f175421e;

    /* renamed from: f, reason: collision with root package name */
    public final SimpleDraweeView f175422f;

    /* renamed from: g, reason: collision with root package name */
    public final FrameLayout f175423g;

    /* renamed from: h, reason: collision with root package name */
    public final ImageView f175424h;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f175418b = view;
        this.f175419c = aVar;
        this.f175420d = (TextView) view.findViewById(R.id.lf_business_tool_item_title);
        this.f175421e = (TextView) view.findViewById(R.id.lf_business_tool_item_description);
        this.f175422f = (SimpleDraweeView) view.findViewById(R.id.lf_business_tool_item_image);
        this.f175423g = (FrameLayout) view.findViewById(R.id.lf_business_tool_item_lock_icon);
        this.f175424h = (ImageView) view.findViewById(R.id.lf_business_tool_item_navigation_icon);
        FV.a aVar2 = FV.a.f4720a;
        TextView textView = (TextView) view.findViewById(R.id.lf_business_tool_item_lock_icon_text);
        aVar2.getClass();
        FV.a.c(textView, R.attr.textIconLock);
    }

    @Override // com.avito.android.lf_levels.ui.items.business_tool.h
    public final void N0(boolean z12) {
        FrameLayout frameLayout = this.f175423g;
        if (z12) {
            D6.g(frameLayout);
        } else {
            D6.H(frameLayout);
        }
    }

    @Override // com.avito.android.lf_levels.ui.items.business_tool.h
    public final void c(@l Y41.a<G0> aVar) {
        View view = this.f175418b;
        ImageView imageView = this.f175424h;
        if (aVar == null) {
            D6.w(imageView);
            view.setOnClickListener(null);
        } else {
            D6.H(imageView);
            view.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(28, aVar));
        }
    }

    @Override // com.avito.android.lf_levels.ui.items.business_tool.h
    public final void g(@l AttributedText attributedText) {
        j.a(this.f175421e, attributedText, this.f175419c);
    }

    @Override // com.avito.android.lf_levels.ui.items.business_tool.h
    public final void i(@k UniversalImage universalImage) {
        C35949t5.c(this.f175422f, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f175418b.getContext()))), null, null, null, 14);
    }

    @Override // com.avito.android.lf_levels.ui.items.business_tool.h
    public final void setTitle(@k String str) {
        this.f175420d.setText(str);
    }
}
