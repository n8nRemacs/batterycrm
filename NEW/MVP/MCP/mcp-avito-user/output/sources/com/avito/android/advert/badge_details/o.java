package com.avito.android.advert.badge_details;

import android.content.res.Resources;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BadgeDetailsResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/badge_details/o;", "Lcom/avito/android/advert/badge_details/n;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f68809a;

    @Inject
    public o(@Y61.k Resources resources) {
        this.f68809a = resources.getString(R.string.unknown_server_error);
    }

    @Override // com.avito.android.advert.badge_details.n
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF68809a() {
        return this.f68809a;
    }
}
