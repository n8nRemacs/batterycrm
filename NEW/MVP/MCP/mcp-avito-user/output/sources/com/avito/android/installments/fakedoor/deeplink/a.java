package com.avito.android.installments.fakedoor.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InstallmentsFakeDoorLink;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsFakeDoorLinkParser.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/installments/fakedoor/deeplink/a;", "LKu/a;", "Lcom/avito/android/deep_linking/links/InstallmentsFakeDoorLink;", "<init>", "()V", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends AbstractC14350a<InstallmentsFakeDoorLink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new InstallmentsFakeDoorLink(i.m(uri, "itemID"), i.p(uri, "installmentsPlan"), i.p(uri, "fromPage"), xVar.b(i.p(uri, "buyButtonDeeplink")), uri.getQueryParameter("context"), i.m(uri, "loanAmount"));
    }
}
