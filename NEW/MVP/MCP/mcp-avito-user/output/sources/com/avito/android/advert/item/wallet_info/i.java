package com.avito.android.advert.item.wallet_info;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35829k2;
import com.avito.android.util.C35949t5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: WalletInfoView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/wallet_info/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/wallet_info/h;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f80735e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f80736b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f80737c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SimpleDraweeView f80738d;

    public i(@k View view) {
        super(view);
        this.f80736b = view;
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80737c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
        }
        this.f80738d = (SimpleDraweeView) viewFindViewById2;
    }

    @Override // com.avito.android.advert.item.wallet_info.h
    public final void R5(@l UniversalImage universalImage) {
        Uri uriD;
        SimpleDraweeView simpleDraweeView = this.f80738d;
        if (universalImage == null) {
            simpleDraweeView.setVisibility(8);
            return;
        }
        Image imageG = com.avito.android.advert.item.delivery_suggests.l.g(this.f80736b, universalImage);
        if (imageG == null || (uriD = C35829k2.c(imageG, simpleDraweeView, 2, 22).d()) == null) {
            return;
        }
        simpleDraweeView.setVisibility(0);
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.f(uriD);
        aVarA.c();
    }

    @Override // com.avito.android.advert.item.wallet_info.h
    public final void a(@k Y41.a<G0> aVar) {
        this.f80736b.setOnClickListener(new com.avito.android.advert.item.parking.h(27, aVar));
    }

    @Override // com.avito.android.advert.item.wallet_info.h
    public final void e(@l AttributedText attributedText) {
        j.a(this.f80737c, attributedText, null);
    }
}
