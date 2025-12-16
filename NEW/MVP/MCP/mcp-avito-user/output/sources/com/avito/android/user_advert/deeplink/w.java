package com.avito.android.user_advert.deeplink;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.L;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertRestorationDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/deeplink/w;", "Lev/b;", "Lcom/avito/android/deep_linking/links/MyAdvertLink$Restore;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class w extends AbstractC40162b<MyAdvertLink.Restore> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final L f310778d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final eH0.c f310779e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f310780f;

    @Inject
    public w(@Y61.k L l12, @Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k eH0.c cVar) {
        this.f310778d = l12;
        this.f310779e = cVar;
        this.f310780f = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        Intent intentA;
        MyAdvertLink.Restore restore = (MyAdvertLink.Restore) deepLink;
        if (bundle == null || !bundle.containsKey("up_intent")) {
            intentA = L.a.a(this.f310778d, null, 3);
        } else {
            intentA = (Intent) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("up_intent", Intent.class) : bundle.getParcelable("up_intent"));
        }
        this.f310780f.R(this.f310779e.c(restore.f133505c).putExtra("up_intent", intentA), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
