package com.huawei.hms.update.ui;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class UpdateBean implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f363670a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f363671b;

    /* renamed from: c, reason: collision with root package name */
    public String f363672c;

    /* renamed from: d, reason: collision with root package name */
    public int f363673d;

    /* renamed from: e, reason: collision with root package name */
    public String f363674e;

    /* renamed from: f, reason: collision with root package name */
    public String f363675f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f363676g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f363677h = true;

    public static <T> T a(T t12) {
        return t12;
    }

    public String b() {
        return (String) a(this.f363672c);
    }

    public int c() {
        return ((Integer) a(Integer.valueOf(this.f363673d))).intValue();
    }

    public boolean d() {
        return ((Boolean) a(Boolean.valueOf(this.f363670a))).booleanValue();
    }

    public String getClientAppName() {
        return (String) a(this.f363675f);
    }

    public boolean getResolutionInstallHMS() {
        return this.f363671b;
    }

    public ArrayList getTypeList() {
        return (ArrayList) a(this.f363676g);
    }

    public boolean isNeedConfirm() {
        return ((Boolean) a(Boolean.valueOf(this.f363677h))).booleanValue();
    }

    public void setClientAppId(String str) {
        this.f363674e = str;
    }

    public void setClientAppName(String str) {
        this.f363675f = str;
    }

    public void setClientPackageName(String str) {
        this.f363672c = str;
    }

    public void setClientVersionCode(int i12) {
        this.f363673d = i12;
    }

    public void setHmsOrApkUpgrade(boolean z12) {
        this.f363670a = z12;
    }

    public void setNeedConfirm(boolean z12) {
        this.f363677h = z12;
    }

    public void setResolutionInstallHMS(boolean z12) {
        this.f363671b = z12;
    }

    public void setTypeList(ArrayList arrayList) {
        this.f363676g = arrayList;
    }

    public String a() {
        return (String) a(this.f363674e);
    }
}
