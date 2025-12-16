package com.avito.android.re_agent_landing.landing.items.info_block;

import Y61.k;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.n;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.Metadata;

/* compiled from: InfoBlockView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/info_block/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/re_agent_landing/landing/items/info_block/g;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f250774b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f250775c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f250776d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f250777e;

    public h(@k View view) {
        super(view);
        this.f250774b = view.getContext();
        this.f250775c = (ImageView) view.findViewById(R.id.re_agent_profile_create_landing_info_image);
        this.f250776d = (TextView) view.findViewById(R.id.re_agent_profile_create_landing_info_title);
        this.f250777e = (TextView) view.findViewById(R.id.re_agent_profile_create_landing_info_description);
    }

    @Override // com.avito.android.re_agent_landing.landing.items.info_block.g
    public final void h(@k String str) {
        I5.a(this.f250777e, str, false);
    }

    @Override // com.avito.android.re_agent_landing.landing.items.info_block.g
    public final void i(@k UniversalImage universalImage) {
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f250774b));
        boolean z12 = imageDependsOnThemeOrDefault != null;
        ImageView imageView = this.f250775c;
        D6.G(imageView, z12);
        com.avito.android.image_loader.glide.utils.b.c(imageView, n.a(imageDependsOnThemeOrDefault).a(imageView));
    }

    @Override // com.avito.android.re_agent_landing.landing.items.info_block.g
    public final void setTitle(@k String str) {
        I5.a(this.f250776d, str, false);
    }
}
