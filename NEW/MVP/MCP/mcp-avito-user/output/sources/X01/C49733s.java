package x01;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.media3.common.C23088b;

@SuppressLint({"ApplySharedPref"})
/* renamed from: x01.s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C49733s {
    public static long a(Context context, String str) {
        if (context == null || TextUtils.isEmpty("Privacy_MY") || TextUtils.isEmpty(str)) {
            m0.e("hmsSdk", "context is null or spName empty or spkey is empty");
            return -1L;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(f(context, "Privacy_MY"), 0);
        if (sharedPreferences != null) {
            return sharedPreferences.getLong(str, -1L);
        }
        return -1L;
    }

    public static String b(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            m0.e("hmsSdk", "context is null or spName empty or spkey is empty");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(f(context, str), 0);
        return sharedPreferences != null ? sharedPreferences.getString(str2, "") : "";
    }

    public static void c(Context context, String str, String... strArr) {
        if (context == null || TextUtils.isEmpty(str)) {
            m0.e("hmsSdk", "clearData(): parameter error.context,spname");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(f(context, str), 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (strArr.length == 0) {
                editorEdit.clear();
                editorEdit.commit();
                return;
            }
            for (String str2 : strArr) {
                if (sharedPreferences.contains(str2)) {
                    editorEdit.remove(str2);
                    editorEdit.commit();
                }
            }
        }
    }

    public static void d(Context context, long j12, String str) {
        if (context == null || TextUtils.isEmpty("Privacy_MY") || TextUtils.isEmpty(str)) {
            m0.e("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(f(context, "Privacy_MY"), 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong(str, j12);
            editorEdit.commit();
        }
    }

    public static void e(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            m0.d("hmsSdk", "context is null or spName empty or spkey is empty");
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(f(context, str), 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(str2, str3);
            editorEdit.commit();
        }
    }

    public static String f(Context context, String str) {
        String packageName = context.getPackageName();
        String str2 = AbstractC49725j.a("_hms_config_tag", "oper") != null ? null : "";
        if (TextUtils.isEmpty(str2)) {
            return androidx.compose.ui.graphics.colorspace.e.n("hms_", str, "_", packageName);
        }
        StringBuilder sbB = C23088b.b("hms_", str, "_", packageName, "_");
        sbB.append(str2);
        return sbB.toString();
    }
}
