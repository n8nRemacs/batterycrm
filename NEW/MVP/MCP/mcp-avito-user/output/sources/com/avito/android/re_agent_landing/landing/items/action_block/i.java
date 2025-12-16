package com.avito.android.re_agent_landing.landing.items.action_block;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.image_loader.n;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ActionBlockView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/re_agent_landing/landing/items/action_block/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/re_agent_landing/landing/items/action_block/h;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f250749g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f250750b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f250751c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f250752d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f250753e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Button f250754f;

    public i(@k View view) {
        super(view);
        this.f250750b = view.getContext();
        this.f250751c = (ImageView) view.findViewById(R.id.re_agent_profile_create_landing_action_image);
        this.f250752d = (TextView) view.findViewById(R.id.re_agent_profile_create_landing_action_title);
        this.f250753e = (TextView) view.findViewById(R.id.re_agent_profile_create_landing_action_description);
        this.f250754f = (Button) view.findViewById(R.id.re_agent_profile_create_landing_action_button);
    }

    @Override // com.avito.android.re_agent_landing.landing.items.action_block.h
    public final void Y(@k Y41.a<G0> aVar) {
        this.f250754f.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(22, aVar));
    }

    @Override // com.avito.android.re_agent_landing.landing.items.action_block.h
    public final void c1(@l String str) {
        com.avito.android.lib.design.button.b.a(this.f250754f, str, false);
    }

    @Override // com.avito.android.re_agent_landing.landing.items.action_block.h
    public final void h(@k String str) {
        I5.a(this.f250753e, str, false);
    }

    @Override // com.avito.android.re_agent_landing.landing.items.action_block.h
    public final void i(@k UniversalImage universalImage) {
        Image imageDependsOnThemeOrDefault = UniversalImageKt.getImageDependsOnThemeOrDefault(universalImage, com.avito.android.lib.util.darkTheme.c.b(this.f250750b));
        boolean z12 = imageDependsOnThemeOrDefault != null;
        ImageView imageView = this.f250751c;
        D6.G(imageView, z12);
        com.avito.android.image_loader.glide.utils.b.c(imageView, n.a(imageDependsOnThemeOrDefault).a(imageView));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f250754f.setOnClickListener(null);
    }

    @Override // com.avito.android.re_agent_landing.landing.items.action_block.h
    public final void setTitle(@k String str) {
        I5.a(this.f250752d, str, false);
    }
}
