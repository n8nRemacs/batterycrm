package com.google.android.gms.common.internal;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.collection.o1;
import androidx.core.os.C22779g;
import bZ0.InterfaceC25600a;
import com.google.android.gms.common.C36689h;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC25600a
    public static final o1 f349349a = new o1();

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC25600a
    @j.P
    public static Locale f349350b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = aY0.c.a(context).f20921a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    @j.N
    public static String b(int i12, Context context) {
        Resources resources = context.getResources();
        return i12 != 1 ? i12 != 2 ? i12 != 3 ? resources.getString(R.string.ok) : resources.getString(com.avito.android.R.string.common_google_play_services_enable_button) : resources.getString(com.avito.android.R.string.common_google_play_services_update_button) : resources.getString(com.avito.android.R.string.common_google_play_services_install_button);
    }

    @j.N
    public static String c(int i12, Context context) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i12 == 1) {
            return resources.getString(com.avito.android.R.string.common_google_play_services_install_text, strA);
        }
        if (i12 == 2) {
            return com.google.android.gms.common.util.l.b(context) ? resources.getString(com.avito.android.R.string.common_google_play_services_wear_update_text) : resources.getString(com.avito.android.R.string.common_google_play_services_update_text, strA);
        }
        if (i12 == 3) {
            return resources.getString(com.avito.android.R.string.common_google_play_services_enable_text, strA);
        }
        if (i12 == 5) {
            return e(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i12 == 7) {
            return e(context, "common_google_play_services_network_error_text", strA);
        }
        if (i12 == 9) {
            return resources.getString(com.avito.android.R.string.common_google_play_services_unsupported_text, strA);
        }
        if (i12 == 20) {
            return e(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i12) {
            case 16:
                return e(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return e(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(com.avito.android.R.string.common_google_play_services_updating_text, strA);
            default:
                return resources.getString(com.avito.android.R.string.common_google_play_services_unknown_issue, strA);
        }
    }

    @j.P
    public static String d(int i12, Context context) {
        Resources resources = context.getResources();
        if (i12 == 1) {
            return resources.getString(com.avito.android.R.string.common_google_play_services_install_title);
        }
        if (i12 == 2) {
            return resources.getString(com.avito.android.R.string.common_google_play_services_update_title);
        }
        if (i12 == 3) {
            return resources.getString(com.avito.android.R.string.common_google_play_services_enable_title);
        }
        if (i12 == 5) {
            return f(context, "common_google_play_services_invalid_account_title");
        }
        if (i12 == 7) {
            return f(context, "common_google_play_services_network_error_title");
        }
        if (i12 == 17) {
            return f(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i12 != 20) {
            return null;
        }
        return f(context, "common_google_play_services_restricted_profile_title");
    }

    public static String e(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strF = f(context, str);
        if (strF == null) {
            strF = resources.getString(com.avito.android.R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strF, str2);
    }

    @j.P
    public static String f(Context context, String str) {
        Resources resourcesForApplication;
        o1 o1Var = f349349a;
        synchronized (o1Var) {
            try {
                Locale localeB = C22779g.a(context.getResources().getConfiguration()).b(0);
                if (!localeB.equals(f349350b)) {
                    o1Var.clear();
                    f349350b = localeB;
                }
                String str2 = (String) o1Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i12 = C36689h.f349290e;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication == null) {
                    return null;
                }
                int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    return null;
                }
                String string = resourcesForApplication.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    return null;
                }
                f349349a.put(str, string);
                return string;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
