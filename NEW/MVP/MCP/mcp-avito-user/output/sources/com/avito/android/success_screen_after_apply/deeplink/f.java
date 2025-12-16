package com.avito.android.success_screen_after_apply.deeplink;

import Ku.AbstractC14350a;
import Ku.i;
import android.net.Uri;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.success_screen_after_apply.SuccessScreenAfterApplyDeeplink;
import com.google.gson.Gson;
import kotlin.Metadata;

/* compiled from: SuccessScreenAfterApplyDeeplinkParser.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/success_screen_after_apply/deeplink/f;", "LKu/a;", "Lcom/avito/android/success_screen_after_apply/SuccessScreenAfterApplyDeeplink;", "<init>", "()V", "_avito_job_success-screen-after-apply_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends AbstractC14350a<SuccessScreenAfterApplyDeeplink> {
    @Override // Ku.AbstractC14350a
    public final DeepLink r(Uri uri, Gson gson, x xVar) {
        return new SuccessScreenAfterApplyDeeplink(Long.parseLong(i.p(uri, "cvId")));
    }
}
