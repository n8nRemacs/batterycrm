package com.avito.android.early_access;

import Ju.AbstractC14250d;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.early_access.deeplink.EarlyAccessStatusLink;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EarlyAccessStatusDeepLinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access/z;", "Lev/a;", "Lcom/avito/android/early_access/deeplink/EarlyAccessStatusLink;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class z extends AbstractC40161a<EarlyAccessStatusLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final t f145584f;

    @Inject
    public z(@Y61.k t tVar) {
        this.f145584f = tVar;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f145584f.b(((EarlyAccessStatusLink) deepLink).f145278c);
        j(AbstractC14250d.c.f9171c);
    }
}
