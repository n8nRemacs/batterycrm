package com.avito.android.realty_agency.checkerboard.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.SearchParamsFactory;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: CheckerboardLinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/deeplink/g;", "LKu/a;", "Lcom/avito/android/realty_agency/checkerboard/deeplink/CheckerboardLink;", "<init>", "()V", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends AbstractC14350a<CheckerboardLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new CheckerboardLink(i.m(uri, "developmentId"), i.p(uri, "developmentName"), i.p(uri, "developerName"), SearchParamsFactory.INSTANCE.fromUri(uri));
    }
}
