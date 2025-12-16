package com.avito.android.model_card.routing;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.model_card.screen.ui.ModelCardActivity;
import com.avito.android.model_card.screen.ui.ModelCardArguments;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ModelCardNonTabDeepLink.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/model_card/routing/d;", "Lev/b;", "Lcom/avito/android/model_card/routing/ModelCardNonTabLink;", "_avito_model-card_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends AbstractC40162b<ModelCardNonTabLink> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Context f198052d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f198053e;

    @Inject
    public d(@k Context context, @k a.InterfaceC4053a interfaceC4053a) {
        this.f198052d = context;
        this.f198053e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        ModelCardArguments modelCardArguments = new ModelCardArguments(((ModelCardNonTabLink) deepLink).f198030b);
        ModelCardActivity.f198114m.getClass();
        this.f198053e.R(new Intent(this.f198052d, (Class<?>) ModelCardActivity.class).putExtra("model-card-arguments", modelCardArguments), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
