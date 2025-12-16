package com.huawei.updatesdk.b.b;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f363823a;

    private b(SharedPreferences sharedPreferences) {
        this.f363823a = sharedPreferences;
    }

    public long a(String str, long j12) {
        try {
            return this.f363823a.getLong(str, j12);
        } catch (Exception unused) {
            return j12;
        }
    }

    public void b(String str, long j12) {
        try {
            SharedPreferences.Editor editorEdit = this.f363823a.edit();
            editorEdit.putLong(str, j12);
            editorEdit.commit();
        } catch (Exception e12) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("SharedPreferencesWrapper", "putLong error!!key:" + str, e12);
        }
    }

    public static b a(String str, Context context) {
        SharedPreferences sharedPreferences;
        try {
            sharedPreferences = context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0);
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("SharedPreferencesWrapper", "getSharedPreference error");
            sharedPreferences = null;
        }
        return new b(sharedPreferences);
    }

    public void b(String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = this.f363823a.edit();
            editorEdit.putString(str, str2);
            editorEdit.commit();
        } catch (Exception e12) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("SharedPreferencesWrapper", "putString error!!key:" + str, e12);
        }
    }

    public String a(String str, String str2) {
        try {
            return this.f363823a.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public void a(String str) {
        try {
            if (this.f363823a.contains(str)) {
                SharedPreferences.Editor editorEdit = this.f363823a.edit();
                editorEdit.remove(str);
                editorEdit.commit();
            }
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("SharedPreferencesWrapper", "remove error!!key:" + str);
        }
    }
}
