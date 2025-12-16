package com.avito.android.fees_methods.screen.fees_by_package.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.fees_methods.deeplink.FeesApplyByPackageV2Link;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: FeesApplyByPackageDeeplinkParser.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_by_package/deeplink/e;", "LKu/a;", "Lcom/avito/android/fees_methods/deeplink/FeesApplyByPackageV2Link;", "<init>", "()V", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e extends AbstractC14350a<FeesApplyByPackageV2Link> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new FeesApplyByPackageV2Link(i.n(uri, "context"));
    }
}
