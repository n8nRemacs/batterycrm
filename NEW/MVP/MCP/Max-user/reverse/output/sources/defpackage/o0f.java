package defpackage;

import android.net.Uri;
import android.os.Build;
import java.util.Locale;
import java.util.Set;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class o0f {
    public static String a(ag5 ag5Var) {
        int i = ag5Var.i;
        Uri.Builder builderBuildUpon = Uri.parse(ag5Var.e).buildUpon();
        String str = ag5Var.c;
        if (str != null) {
            builderBuildUpon.appendQueryParameter("userId", str);
        }
        builderBuildUpon.appendQueryParameter(ApiProtocol.KEY_TOKEN, ag5Var.b).appendQueryParameter(ApiProtocol.PARAM_CONVERSATION_ID, ag5Var.a);
        if (i >= 6) {
            builderBuildUpon.appendQueryParameter("deviceIdx", String.valueOf(ag5Var.d));
        }
        Long l = ag5Var.g;
        if (l != null) {
            builderBuildUpon.appendQueryParameter(ApiProtocol.PARAM_PEER_ID, String.valueOf(l.longValue()));
        }
        Locale locale = ag5Var.o;
        if (locale != null) {
            builderBuildUpon.appendQueryParameter("locale", locale.getLanguage());
        }
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("version", String.valueOf(i)).appendQueryParameter("capabilities", ag5Var.j).appendQueryParameter("device", Build.MANUFACTURER + "/" + Build.MODEL).appendQueryParameter(CallAnalyticsApiRequest.KEY_PLATFORM, AbstractUploader.SDK_TYPE_STRING).appendQueryParameter("clientType", ag5Var.h).appendQueryParameter("appVersion", ag5Var.f).appendQueryParameter("osVersion", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("ispAsOrg", ag5Var.l).appendQueryParameter("locCc", ag5Var.m).appendQueryParameter("locReg", ag5Var.n);
        Integer num = ag5Var.k;
        if (num != null) {
            builderAppendQueryParameter.appendQueryParameter("ispAsNo", String.valueOf(num.intValue()));
        }
        String str2 = ag5Var.p;
        if (str2 != null) {
            builderAppendQueryParameter.appendQueryParameter("compression", str2);
        }
        return builderAppendQueryParameter.build().toString();
    }

    public static String b(String str, String str2, String str3) {
        Uri.Builder builderBuildUpon;
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains(str2)) {
            builderBuildUpon = uri.buildUpon().clearQuery();
            for (String str4 : queryParameterNames) {
                if (str2.equals(str4)) {
                    builderBuildUpon.appendQueryParameter(str4, str3);
                } else {
                    builderBuildUpon.appendQueryParameter(str4, uri.getQueryParameter(str4));
                }
            }
        } else {
            builderBuildUpon = uri.buildUpon();
            builderBuildUpon.appendQueryParameter(str2, str3);
        }
        return builderBuildUpon.build().toString();
    }
}
