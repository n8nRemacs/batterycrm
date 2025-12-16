package o01;

import android.content.Context;
import android.content.SharedPreferences;
import com.huawei.hms.support.log.HMSLog;
import com.yandex.div2.D8;
import java.io.File;
import java.lang.reflect.Constructor;

/* compiled from: PushPreferences.java */
/* renamed from: o01.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C44501b {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f419290a;

    public C44501b(Context context, String str) throws NoSuchMethodException, SecurityException {
        File file;
        if (context == null) {
            throw new NullPointerException("context is null!");
        }
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("move_to_de_records", 0);
        if (sharedPreferences.getBoolean(str, false)) {
            context = contextCreateDeviceProtectedStorageContext;
        } else if (contextCreateDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(str, true);
            editorEdit.apply();
            context = contextCreateDeviceProtectedStorageContext;
        }
        SharedPreferences sharedPreferences2 = null;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getDataDir());
            sb2.append("/shared_prefs");
            file = new File(sb2.toString(), str.concat(".xml"));
        } catch (Exception e12) {
            D8.q(e12, new StringBuilder("get failed error."), "PushPreferences");
        }
        file = file.exists() ? file : null;
        if (file != null) {
            try {
                Constructor<?> declaredConstructor = Class.forName("android.app.SharedPreferencesImpl").getDeclaredConstructor(File.class, Integer.TYPE);
                declaredConstructor.setAccessible(true);
                sharedPreferences2 = (SharedPreferences) declaredConstructor.newInstance(file, 0);
            } catch (Exception e13) {
                D8.q(e13, new StringBuilder("get SharedPreferences error."), "PushPreferences");
            }
        }
        this.f419290a = sharedPreferences2;
        if (sharedPreferences2 == null) {
            HMSLog.w("PushPreferences", "get new sharedPreferences failed,start to get from context. ");
            this.f419290a = context.getSharedPreferences(str, 0);
        }
    }

    public final boolean a(String str) {
        SharedPreferences sharedPreferences = this.f419290a;
        return sharedPreferences != null && sharedPreferences.contains(str);
    }

    public final boolean b(String str) {
        SharedPreferences sharedPreferences = this.f419290a;
        return sharedPreferences != null && sharedPreferences.getBoolean(str, false);
    }

    public final String c(String str) {
        SharedPreferences sharedPreferences = this.f419290a;
        return sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
    }

    public final void d(String str) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f419290a;
        if (sharedPreferences == null || !sharedPreferences.contains(str) || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        editorEdit.remove(str).commit();
    }

    public final boolean e(String str, String str2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences sharedPreferences = this.f419290a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return false;
        }
        return editorEdit.putString(str, str2).commit();
    }
}
