package com.huawei.hms.availableupdate;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: DownloadRecord.java */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public String f363338a;

    /* renamed from: b, reason: collision with root package name */
    public int f363339b;

    /* renamed from: c, reason: collision with root package name */
    public String f363340c;

    /* renamed from: d, reason: collision with root package name */
    public int f363341d;

    public void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.huawei.hms.update.DOWNLOAD_RECORD" + str, 0);
        this.f363338a = sharedPreferences.getString("mUri", "");
        this.f363339b = sharedPreferences.getInt("mSize", 0);
        this.f363340c = sharedPreferences.getString("mHash", "");
        this.f363341d = sharedPreferences.getInt("mReceived", 0);
    }

    public final void b(Context context, String str) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("com.huawei.hms.update.DOWNLOAD_RECORD" + str, 0).edit();
        editorEdit.putString("mUri", this.f363338a);
        editorEdit.putInt("mSize", this.f363339b);
        editorEdit.putString("mHash", this.f363340c);
        editorEdit.putInt("mReceived", this.f363341d);
        editorEdit.commit();
    }

    public void a(String str, int i12, String str2) {
        this.f363338a = str;
        this.f363339b = i12;
        this.f363340c = str2;
        this.f363341d = 0;
    }

    public int b() {
        return this.f363339b;
    }

    public boolean b(String str, int i12, String str2) {
        String str3;
        String str4;
        return str != null && str2 != null && (str3 = this.f363338a) != null && str3.equals(str) && this.f363339b == i12 && (str4 = this.f363340c) != null && str4.equals(str2) && this.f363341d <= this.f363339b;
    }

    public void a(Context context, int i12, String str) {
        this.f363341d = i12;
        b(context, str);
    }

    public int a() {
        return this.f363341d;
    }
}
