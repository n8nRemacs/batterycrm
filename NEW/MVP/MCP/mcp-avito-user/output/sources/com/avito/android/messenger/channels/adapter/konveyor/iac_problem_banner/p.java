package com.avito.android.messenger.channels.adapter.konveyor.iac_problem_banner;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ChannelsIacProblemBannerView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/adapter/konveyor/iac_problem_banner/p;", "Lcom/avito/android/messenger/channels/adapter/konveyor/iac_problem_banner/m;", "Lcom/avito/konveyor/adapter/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f186967d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f186968b;

    /* renamed from: c, reason: collision with root package name */
    public final Banner f186969c;

    public p(@Y61.k View view, boolean z12) {
        super(view);
        this.f186968b = z12;
        this.f186969c = (Banner) view.findViewById(R.id.promo_block);
    }

    @Override // com.avito.android.messenger.channels.adapter.konveyor.iac_problem_banner.m
    public final void vl(@Y61.k ChannelsListItem.d dVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2) {
        ViewGroup container;
        Banner banner = this.f186969c;
        if (banner == null || (container = banner.getContainer()) == null) {
            return;
        }
        ((TextView) container.findViewById(R.id.message)).setText(container.getResources().getString(dVar.f186814d));
        ((TextView) container.findViewById(R.id.link)).setText(container.getResources().getString(dVar.f186815e));
        ImageView imageView = (ImageView) container.findViewById(R.id.iac_banner_close_icon);
        if (imageView != null) {
            imageView.setOnClickListener(new com.avito.android.lib.design.list_item.a(23, aVar2));
        }
        container.setOnClickListener(new com.avito.android.lib.design.list_item.a(24, aVar));
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) container.findViewById(R.id.banner_image);
        Image imageDependsOnThemeOrDefault = this.f186968b ? UniversalImageKt.getImageDependsOnThemeOrDefault(dVar.f186816f, com.avito.android.lib.util.darkTheme.c.b(container.getContext())) : null;
        if (imageDependsOnThemeOrDefault == null) {
            D6.g(simpleDraweeView);
            return;
        }
        ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
        aVarA.d(com.avito.android.image_loader.b.b(imageDependsOnThemeOrDefault));
        aVarA.f169500r = false;
        aVarA.c();
        D6.H(simpleDraweeView);
    }
}
