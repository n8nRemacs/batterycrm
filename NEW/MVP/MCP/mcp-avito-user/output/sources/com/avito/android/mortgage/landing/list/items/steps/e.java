package com.avito.android.mortgage.landing.list.items.steps;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.mortgage.document_upload.B;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StepsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/steps/e;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/landing/list/items/steps/d;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e extends com.avito.konveyor.adapter.b implements d {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f199983g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f199984b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f199985c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f199986d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f199987e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f199988f;

    public e(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.steps_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199984b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.steps_top_image);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f199985c = (ImageView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.steps_bottom_small_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f199986d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.steps_bottom_big_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f199987e = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.steps_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f199988f = (LinearLayout) viewFindViewById5;
        this.itemView.setClipToOutline(true);
        this.itemView.setBackgroundResource(0);
        View view2 = this.itemView;
        view2.setPadding(view2.getPaddingLeft(), y6.b(0), view2.getPaddingRight(), y6.b(0));
    }

    @Override // com.avito.android.mortgage.landing.list.items.steps.d
    public final void PK(@l UniversalImage universalImage) {
        ImageView imageView = this.f199987e;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(imageView.getContext())) : null;
        D6.G(imageView, imageDependsOnThemeOrDefault != null);
        if (imageDependsOnThemeOrDefault != null) {
            LinearLayout linearLayout = this.f199988f;
            linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), 0);
        }
        com.avito.android.image_loader.glide.utils.b.d(imageView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
    }

    @Override // com.avito.android.mortgage.landing.list.items.steps.d
    public final void Z30(@k Y41.l lVar, @k AttributedText attributedText) {
        j.a(this.f199984b, attributedText, null);
        attributedText.setOnDeepLinkClickListener(new B(1, lVar));
    }

    @Override // com.avito.android.mortgage.landing.list.items.steps.d
    public final void im(@l UniversalImage universalImage) {
        ImageView imageView = this.f199986d;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(imageView.getContext())) : null;
        D6.G(imageView, imageDependsOnThemeOrDefault != null);
        com.avito.android.image_loader.glide.utils.b.d(imageView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
    }

    @Override // com.avito.android.mortgage.landing.list.items.steps.d
    public final void vy(@l UniversalImage universalImage) {
        ImageView imageView = this.f199985c;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(imageView.getContext())) : null;
        D6.G(imageView, imageDependsOnThemeOrDefault != null);
        com.avito.android.image_loader.glide.utils.b.d(imageView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
    }
}
