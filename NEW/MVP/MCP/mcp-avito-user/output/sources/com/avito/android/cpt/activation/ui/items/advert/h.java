package com.avito.android.cpt.activation.ui.items.advert;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: CptActivationAdvertItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/activation/ui/items/advert/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cpt/activation/ui/items/advert/g;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f126316b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f126317c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f126318d;

    public h(@k View view) {
        super(view);
        this.f126316b = (SimpleDraweeView) view.findViewById(R.id.cpt_activation_advert_image);
        this.f126317c = (TextView) view.findViewById(R.id.cpt_activation_advert_title);
        this.f126318d = (TextView) view.findViewById(R.id.cpt_activation_advert_price);
    }

    @Override // com.avito.android.cpt.activation.ui.items.advert.g
    public final void l(@k Image image) {
        ImageRequest.a aVarA = C35949t5.a(this.f126316b);
        aVarA.d(com.avito.android.image_loader.b.b(image));
        aVarA.f169495m = ImageRequest.SourcePlace.f169477b;
        aVarA.c();
    }

    @Override // com.avito.android.cpt.activation.ui.items.advert.g
    public final void p(@l String str) {
        I5.a(this.f126318d, str, false);
    }

    @Override // com.avito.android.cpt.activation.ui.items.advert.g
    public final void setTitle(@l String str) {
        I5.a(this.f126317c, str, false);
    }
}
