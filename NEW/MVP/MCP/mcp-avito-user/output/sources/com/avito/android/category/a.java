package com.avito.android.category;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.CategoriesLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.remote.model.CaseText;
import com.avito.android.remote.model.Location;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CategoriesLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/category/a;", "Lev/b;", "Lcom/avito/android/deep_linking/links/CategoriesLink;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40162b<CategoriesLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final m f116490d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f116491e;

    @Inject
    public a(@Y61.k m mVar, @Y61.k a.InterfaceC4053a interfaceC4053a) {
        this.f116490d = mVar;
        this.f116491e = interfaceC4053a;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        CategoriesLink categoriesLink = (CategoriesLink) deepLink;
        String str2 = categoriesLink.f133091c;
        this.f116491e.R(this.f116490d.a(str2 != null ? new Location(str2, new CaseText(), false, false, false, false, null, null, false, null, null, null, 4092, null) : null, categoriesLink.f133090b), com.avito.android.deeplink_handler.view.b.f134588l);
        return AbstractC14250d.c.f9171c;
    }
}
