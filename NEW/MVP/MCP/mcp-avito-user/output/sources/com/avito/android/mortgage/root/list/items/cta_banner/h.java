package com.avito.android.mortgage.root.list.items.cta_banner;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35829k2;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CtaBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/cta_banner/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/cta_banner/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f202531f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f202532b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f202533c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f202534d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f202535e;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f202532b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202533c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.description);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202534d = (TextView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.action);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f202535e = (Button) viewFindViewById4;
    }

    @Override // com.avito.android.mortgage.root.list.items.cta_banner.g
    public final void Fb(@l String str) {
        com.avito.android.lib.design.button.b.a(this.f202535e, str, false);
    }

    @Override // com.avito.android.mortgage.root.list.items.cta_banner.g
    public final void M(@l UniversalImage universalImage) {
        ImageView imageView = this.f202532b;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(imageView.getContext())) : null;
        Uri uriD = imageDependsOnThemeOrDefault != null ? C35829k2.c(imageDependsOnThemeOrDefault, imageView, 1, 22).d() : null;
        if (uriD == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            com.avito.android.image_loader.glide.utils.b.c(imageView, uriD);
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.cta_banner.g
    public final void U(@k Y41.a<G0> aVar) {
        this.f202535e.setOnClickListener(new com.avito.android.mortgage.applicant_type.a(29, aVar));
    }

    @Override // com.avito.android.mortgage.root.list.items.cta_banner.g
    public final void n(@l String str) {
        I5.a(this.f202534d, str, false);
    }

    @Override // com.avito.android.mortgage.root.list.items.cta_banner.g
    public final void setEnabled(boolean z12) {
        TextView textView = this.f202534d;
        TextView textView2 = this.f202533c;
        ImageView imageView = this.f202532b;
        Button button = this.f202535e;
        if (z12) {
            button.setEnabled(true);
            imageView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            return;
        }
        imageView.setAlpha(0.4f);
        textView2.setAlpha(0.4f);
        textView.setAlpha(0.4f);
        button.setEnabled(false);
    }

    @Override // com.avito.android.mortgage.root.list.items.cta_banner.g
    public final void setTitle(@k String str) {
        this.f202533c.setText(str);
    }
}
