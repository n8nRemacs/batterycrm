package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;
import androidx.compose.ui.platform.C22491k0;

/* compiled from: LogAdaptor.java */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public String f363427b;

    /* renamed from: a, reason: collision with root package name */
    public int f363426a = 4;

    /* renamed from: c, reason: collision with root package name */
    public b f363428c = new e();

    public void a(Context context, int i12, String str) {
        this.f363426a = i12;
        this.f363427b = str;
        this.f363428c.a(context, "HMSCore");
    }

    public void b(int i12, String str, String str2, Throwable th2) {
        if (a(i12)) {
            c cVarA = a(i12, str, str2, th2);
            String str3 = cVarA.c() + cVarA.a();
            b bVar = this.f363428c;
            StringBuilder sbB = C22491k0.b(str2, '\n');
            sbB.append(Log.getStackTraceString(th2));
            bVar.a(str3, i12, str, sbB.toString());
        }
    }

    public b a() {
        return this.f363428c;
    }

    public void a(b bVar) {
        this.f363428c = bVar;
    }

    public boolean a(int i12) {
        return i12 >= this.f363426a;
    }

    public void a(int i12, String str, String str2) {
        if (a(i12)) {
            c cVarA = a(i12, str, str2, null);
            this.f363428c.a(cVarA.c() + cVarA.a(), i12, str, str2);
        }
    }

    public void a(String str, String str2) {
        c cVarA = a(4, str, str2, null);
        this.f363428c.a(cVarA.c() + '\n' + cVarA.a(), 4, str, str2);
    }

    public final c a(int i12, String str, String str2, Throwable th2) {
        c cVar = new c(8, this.f363427b, i12, str);
        cVar.a((c) str2);
        cVar.a(th2);
        return cVar;
    }
}
