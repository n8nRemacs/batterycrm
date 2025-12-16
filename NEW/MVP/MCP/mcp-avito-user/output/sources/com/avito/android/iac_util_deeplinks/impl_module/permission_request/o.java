package com.avito.android.iac_util_deeplinks.impl_module.permission_request;

import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: PermissionRequestLinkParser.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_util_deeplinks/impl_module/permission_request/o;", "", "<init>", "()V", "_avito_iac-util-deeplinks_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final o f169188a = new o();

    @Y61.k
    public static List a(@Y61.k String str) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        if (lowerCase.equals("mic".toLowerCase(locale))) {
            return Collections.singletonList("android.permission.RECORD_AUDIO");
        }
        if (lowerCase.equals("camera".toLowerCase(locale))) {
            return Collections.singletonList("android.permission.CAMERA");
        }
        if (lowerCase.equals(NotificationsSettings.Section.SECTION_PAID_SERVICES.toLowerCase(locale))) {
            return Collections.singletonList("android.permission.POST_NOTIFICATIONS");
        }
        if (lowerCase.equals("readPhoneState".toLowerCase(locale))) {
            return Collections.singletonList("android.permission.READ_PHONE_STATE");
        }
        if (lowerCase.equals("readWritePhoneBook".toLowerCase(locale))) {
            return C42745f0.U("android.permission.WRITE_CONTACTS", "android.permission.READ_CONTACTS");
        }
        throw new UnsupportedOperationException(AK.c.k("permission type '", str, "' is not supported"));
    }
}
