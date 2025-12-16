package com.avito.android.advert.item;

import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/rating_ui/attributed_text/b;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/rating_ui/attributed_text/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.advert.item.p0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C28157p0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f78128b;

    public C28157p0(C28136i0 c28136i0) {
        this.f78128b = c28136i0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Z0 z02;
        Z0 z03;
        com.avito.android.rating_ui.attributed_text.b bVar = (com.avito.android.rating_ui.attributed_text.b) obj;
        DeepLink deepLink = bVar.f249937a;
        C28136i0 c28136i0 = this.f78128b;
        if (deepLink != null && (z03 = c28136i0.f76327Z0) != null) {
            z03.g(null, deepLink, null);
        }
        String str = bVar.f249938b;
        if (str == null || (z02 = c28136i0.f76327Z0) == null) {
            return;
        }
        z02.x(Uri.parse(str));
    }
}
