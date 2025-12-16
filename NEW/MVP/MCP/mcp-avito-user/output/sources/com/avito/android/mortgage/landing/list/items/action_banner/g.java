package com.avito.android.mortgage.landing.list.items.action_banner;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ActionBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/action_banner/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/landing/list/items/action_banner/f;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f199661b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f199662c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f199663d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Button f199664e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.a<G0> f199665f;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.banner_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199661b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.banner_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f199662c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.banner_image);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f199663d = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.action_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById4;
        this.f199664e = button;
        button.setOnClickListener(new ViewOnClickListenerC31873b(this, 13));
    }

    @Override // com.avito.android.mortgage.landing.list.items.action_banner.f
    public final void a0(@k Y41.a<G0> aVar) {
        this.f199665f = aVar;
    }

    @Override // com.avito.android.mortgage.landing.list.items.action_banner.f
    public final void e(@k AttributedText attributedText) {
        j.a(this.f199661b, attributedText, null);
    }

    @Override // com.avito.android.mortgage.landing.list.items.action_banner.f
    public final void g(@k AttributedText attributedText) {
        j.a(this.f199662c, attributedText, null);
    }

    @Override // com.avito.android.mortgage.landing.list.items.action_banner.f
    public final void i(@k UniversalImage universalImage) {
        ImageView imageView = this.f199663d;
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(imageView.getContext()));
        D6.G(imageView, imageDependsOnThemeOrDefault != null);
        if (imageDependsOnThemeOrDefault != null) {
            com.avito.android.image_loader.glide.utils.b.d(imageView, com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f199665f = null;
    }

    @Override // com.avito.android.mortgage.landing.list.items.action_banner.f
    public final void lY(@l CharSequence charSequence) {
        boolean z12 = true ^ (charSequence == null || charSequence.length() == 0);
        Button button = this.f199664e;
        D6.G(button, z12);
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        button.setText(string);
    }
}
