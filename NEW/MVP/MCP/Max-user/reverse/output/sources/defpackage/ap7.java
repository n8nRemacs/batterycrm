package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.os.Process;
import android.util.Base64;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import one.me.sdk.android.tools.SignatureGenerateException;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class ap7 {
    public static final String a = new ap7().getClass().getName();

    public static Intent a(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        Object obj = null;
        if (listQueryIntentActivities.isEmpty()) {
            return null;
        }
        Intent intentCreateChooser = Intent.createChooser(intent, null);
        for (Object obj2 : listQueryIntentActivities) {
            String str = ((ResolveInfo) obj2).activityInfo.packageName;
            if (fni.a(str, "org.telegram.messenger") || fni.a(str, "org.telegram.messenger.beta") || fni.a(str, "org.telegram.messenger.web")) {
                obj = obj2;
                break;
            }
        }
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        if (resolveInfo != null) {
            Intent intent2 = (Intent) intent.clone();
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.addFlags(268435456);
            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new LabeledIntent[]{new LabeledIntent(intent2, resolveInfo.activityInfo.packageName, resolveInfo.labelRes, resolveInfo.icon)});
        }
        return intentCreateChooser;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        return intent;
    }

    public static Intent c(Context context, boolean z) {
        if (!z) {
            return Build.VERSION.SDK_INT >= 34 ? new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.fromParts("package", context.getPackageName(), null)) : b(context);
        }
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setPackage("com.miui.securitycenter");
        intent.putExtra("extra_package_uid", Process.myUid());
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        return intent;
    }

    public static void e(Context context) {
        Object ipdVar;
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            context.startActivity(intent);
            ipdVar = qqg.a;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e(a, "openAppSettings error", thA);
        }
    }

    public static final Intent f(String str, String str2) {
        Uri uri;
        Intent intent = new Intent("android.intent.action.RINGTONE_PICKER");
        try {
            uri = Uri.parse(str2);
        } catch (Exception e) {
            wqi.p(intent.getClass().getName(), "openRingtoneSystemPickerIntent can't parse value defaultRingtone=" + str2, e);
            uri = null;
        }
        if (uri != null) {
            intent.putExtra("android.intent.extra.ringtone.EXISTING_URI", uri);
        }
        intent.putExtra("android.intent.extra.ringtone.TITLE", str);
        intent.putExtra("android.intent.extra.ringtone.SHOW_SILENT", false);
        intent.putExtra("android.intent.extra.ringtone.SHOW_DEFAULT", true);
        intent.putExtra("android.intent.extra.ringtone.TYPE", 1);
        return intent;
    }

    public static String g(String str, String str2) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        try {
            byte[] bArrDecode = Base64.decode(Pattern.compile("\\s").matcher(Pattern.compile("-----\\w+ PRIVATE KEY-----").matcher(str).replaceAll("")).replaceAll(""), 0);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArrDecode);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(keyFactory.generatePrivate(pKCS8EncodedKeySpec));
            signature.update(str2.getBytes(lb2.a));
            return Base64.encodeToString(signature.sign(), 2);
        } catch (Exception e) {
            throw new SignatureGenerateException("Error calculating cipher data. SIC!", e);
        }
    }

    public static void h(Context context, Uri uri, String str) {
        Object ipdVar;
        try {
            gge ggeVar = new gge(context);
            ((Intent) ggeVar.d).setType(str);
            ggeVar.o = null;
            if (uri != null) {
                ArrayList arrayList = new ArrayList();
                ggeVar.o = arrayList;
                arrayList.add(uri);
            }
            ggeVar.k();
            ipdVar = qqg.a;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e(a, "shareMedia: failed", thA);
        }
    }

    public static void i(Context context, CharSequence charSequence, Uri uri) {
        Object ipdVar;
        Activity activity;
        ArrayList<? extends Parcelable> arrayList;
        try {
            context.getClass();
            Intent action = new Intent().setAction("android.intent.action.SEND");
            action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
            action.addFlags(524288);
            Context baseContext = context;
            while (true) {
                ipdVar = null;
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else {
                    if (baseContext instanceof Activity) {
                        activity = (Activity) baseContext;
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                action.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
                action.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
            }
            action.setType((uri == null || uri.equals(Uri.EMPTY)) ? HTTP.PLAIN_TEXT_TYPE : "image/*");
            action.putExtra("android.intent.extra.TEXT", charSequence);
            if (uri != null) {
                arrayList = new ArrayList<>();
                arrayList.add(uri);
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.size() <= 1) {
                action.setAction("android.intent.action.SEND");
                if (arrayList == null || arrayList.isEmpty()) {
                    action.removeExtra("android.intent.extra.STREAM");
                    action.setClipData(null);
                    action.setFlags(action.getFlags() & (-2));
                } else {
                    action.putExtra("android.intent.extra.STREAM", arrayList.get(0));
                    faj.b(action, arrayList);
                }
            } else {
                action.setAction("android.intent.action.SEND_MULTIPLE");
                action.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                faj.b(action, arrayList);
            }
            Intent intentA = a(context, action);
            if (intentA != null) {
                context.startActivity(intentA);
                ipdVar = qqg.a;
            }
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e(a, "showInviteDialog error", thA);
        }
    }

    public static Uri j(Context context, Uri uri) {
        try {
            Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendQueryParameter("client", "613").appendQueryParameter("utm_source", "max");
            return builderAppendQueryParameter.appendQueryParameter("signature", g(context.getString(e4d.ya_key), builderAppendQueryParameter.build().toString())).build();
        } catch (SignatureGenerateException e) {
            wqi.e(a, "fail to generate signature", e);
            return uri;
        }
    }
}
