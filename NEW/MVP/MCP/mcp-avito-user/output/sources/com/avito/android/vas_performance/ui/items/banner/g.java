package com.avito.android.vas_performance.ui.items.banner;

import Y61.k;
import Y61.l;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: VasBundleBannerItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/banner/g;", "Lcom/avito/android/vas_performance/ui/items/banner/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f321600b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f321601c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ViewGroup f321602d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SimpleDraweeView f321603e;

    public g(@k View view) {
        super(view);
        this.f321600b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f321601c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.vas_bundle_banner_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f321602d = (ViewGroup) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.picture);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f321603e = (SimpleDraweeView) viewFindViewById3;
    }

    @Override // com.avito.android.vas_performance.ui.items.banner.f
    public final void i(@l UniversalImage universalImage) {
        G0 g02;
        SimpleDraweeView simpleDraweeView = this.f321603e;
        if (universalImage != null) {
            C35949t5.c(this.f321603e, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f321600b.getContext()))), null, null, null, 14);
            D6.H(simpleDraweeView);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            D6.w(simpleDraweeView);
        }
    }

    @Override // com.avito.android.vas_performance.ui.items.banner.f
    public final void setText(@k String str) {
        I5.a(this.f321601c, str, false);
    }

    @Override // com.avito.android.vas_performance.ui.items.banner.f
    public final void v(@k UniversalColor universalColor) {
        this.f321602d.setBackgroundTintList(ColorStateList.valueOf(C48063a.f437606a.a(this.f321600b.getContext(), universalColor)));
    }
}
