package com.avito.android.user_viewed.screen.ui.item.error;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.advert.item.delivery_suggests.l;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import mK0.C43976a;

/* compiled from: UserViewedErrorView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_viewed/screen/ui/item/error/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_viewed/screen/ui/item/error/g;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f318497b;

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.image);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        ImageView imageView = (ImageView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f318497b = (Button) viewFindViewById2;
        C43976a.f414475a.getClass();
        Image imageG = l.g(view, C43976a.f414477c);
        if (imageG != null) {
            com.avito.android.image_loader.glide.utils.b.d(imageView, n.a(imageG));
        }
    }

    @Override // com.avito.android.user_viewed.screen.ui.item.error.g
    public final void G70(@Y61.l com.avito.android.user_adverts.root_screen.adverts_host.host_view.g gVar) {
        this.f318497b.setOnClickListener(gVar);
    }
}
