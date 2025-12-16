package com.avito.android.user_address.deeplink;

import android.annotation.SuppressLint;
import android.content.Intent;
import com.avito.android.deep_linking.links.UserAddressLink;
import ev.AbstractC40161a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rv.C47918a;

/* compiled from: UserAddressLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_address/deeplink/o;", "Lcom/avito/android/deep_linking/links/UserAddressLink;", "T", "Lev/a;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"MissingDeeplinkHandlerResult"})
/* loaded from: classes4.dex */
public abstract class o<T extends UserAddressLink> extends AbstractC40161a<T> {
    @Y61.k
    public static UserAddressLink.Result k(@Y61.k C47918a c47918a) {
        Intent intent = c47918a.f437157c;
        if (intent != null) {
            k.f307239a.getClass();
            UserAddressLink.Result result = (UserAddressLink.Result) intent.getParcelableExtra("result.user_address");
            if (result != null) {
                return result;
            }
        }
        return UserAddressLink.Result.Canceled.f133803b;
    }
}
