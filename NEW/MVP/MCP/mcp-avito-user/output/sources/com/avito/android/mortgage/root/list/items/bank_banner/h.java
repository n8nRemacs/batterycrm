package com.avito.android.mortgage.root.list.items.bank_banner;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35829k2;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BankBannerView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/bank_banner/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/bank_banner/g;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImageView f202401b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f202402c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ImageView f202403d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f202404e;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f202401b = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202402c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.chevron);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f202403d = (ImageView) viewFindViewById3;
        this.itemView.setOnClickListener(new ViewOnClickListenerC31873b(this, 20));
    }

    @Override // com.avito.android.mortgage.root.list.items.bank_banner.g
    public final void M(@l UniversalImage universalImage) {
        ImageView imageView = this.f202401b;
        Image imageDependsOnThemeOrDefault = universalImage != null ? UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(imageView.getContext())) : null;
        Uri uriD = imageDependsOnThemeOrDefault != null ? C35829k2.c(imageDependsOnThemeOrDefault, imageView, 1, 22).d() : null;
        if (uriD == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
            com.avito.android.image_loader.glide.utils.b.c(imageView, uriD);
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.bank_banner.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f202404e = aVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.bank_banner.g
    public final void r(@k AttributedText attributedText) {
        j.c(this.f202402c, attributedText, null);
    }

    @Override // com.avito.android.mortgage.root.list.items.bank_banner.g
    public final void setEnabled(boolean z12) {
        ImageView imageView = this.f202403d;
        TextView textView = this.f202402c;
        ImageView imageView2 = this.f202401b;
        if (z12) {
            this.itemView.setEnabled(true);
            this.itemView.setAlpha(1.0f);
            imageView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            imageView.setAlpha(1.0f);
            return;
        }
        this.itemView.setAlpha(0.4f);
        imageView2.setAlpha(0.4f);
        textView.setAlpha(0.4f);
        imageView.setAlpha(0.4f);
        this.itemView.setEnabled(false);
    }
}
