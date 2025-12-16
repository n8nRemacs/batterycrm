package defpackage;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public abstract class abi {
    public static final z0f a = new z0f(0);
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = k6i.a(context).a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        return i != 1 ? i != 2 ? i != 3 ? resources.getString(R.string.ok) : resources.getString(g5d.common_google_play_services_enable_button) : resources.getString(g5d.common_google_play_services_update_button) : resources.getString(g5d.common_google_play_services_install_button);
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i == 1) {
            return resources.getString(g5d.common_google_play_services_install_text, strA);
        }
        if (i == 2) {
            return d9j.b(context) ? resources.getString(g5d.common_google_play_services_wear_update_text) : resources.getString(g5d.common_google_play_services_update_text, strA);
        }
        if (i == 3) {
            return resources.getString(g5d.common_google_play_services_enable_text, strA);
        }
        if (i == 5) {
            return e(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i == 7) {
            return e(context, "common_google_play_services_network_error_text", strA);
        }
        if (i == 9) {
            return resources.getString(g5d.common_google_play_services_unsupported_text, strA);
        }
        if (i == 20) {
            return e(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i) {
            case 16:
                return e(context, "common_google_play_services_api_unavailable_text", strA);
            case LangUtils.HASH_SEED /* 17 */:
                return e(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(g5d.common_google_play_services_updating_text, strA);
            default:
                return resources.getString(h5d.common_google_play_services_unknown_issue, strA);
        }
    }

    public static String d(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(g5d.common_google_play_services_install_title);
            case 2:
                return resources.getString(g5d.common_google_play_services_update_title);
            case 3:
                return resources.getString(g5d.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return f(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return f(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            case 13:
            case Protos.Attaches.Attach.LOCATION /* 14 */:
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case LangUtils.HASH_SEED /* 17 */:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return f(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return f(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String e(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strF = f(context, str);
        if (strF == null) {
            strF = resources.getString(h5d.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strF, str2);
    }

    public static String f(Context context, String str) {
        Resources resourcesForApplication;
        z0f z0fVar = a;
        synchronized (z0fVar) {
            try {
                Locale locale = to3.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(b)) {
                    z0fVar.clear();
                    b = locale;
                }
                String str2 = (String) z0fVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = lw6.e;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            a.put(str, string);
                            return string;
                        }
                        Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
