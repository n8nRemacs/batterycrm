package com.avito.android.vas_union.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: VasUnionV2DeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/vas_union/deeplink/g;", "LKu/a;", "Lcom/avito/android/vas_union/deeplink/VasUnionV2Link;", "<init>", "()V", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends AbstractC14350a<VasUnionV2Link> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new VasUnionV2Link(i.o(uri, "itemId"), i.o(uri, "checkoutContext"), Boolean.parseBoolean(i.o(uri, "closable")));
    }
}
