package com.huawei.updatesdk.service.otaupdate;

import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f363931b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static d f363932c;

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<CheckUpdateCallBack> f363933a;

    public static d a() {
        d dVar;
        synchronized (f363931b) {
            try {
                if (f363932c == null) {
                    f363932c = new d();
                }
                dVar = f363932c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVar;
    }

    public void b(Intent intent) {
        CheckUpdateCallBack checkUpdateCallBack;
        WeakReference<CheckUpdateCallBack> weakReference = this.f363933a;
        if (weakReference == null || (checkUpdateCallBack = weakReference.get()) == null) {
            return;
        }
        checkUpdateCallBack.onUpdateInfo(intent);
    }

    public void a(int i12) {
        CheckUpdateCallBack checkUpdateCallBack;
        WeakReference<CheckUpdateCallBack> weakReference = this.f363933a;
        if (weakReference == null || (checkUpdateCallBack = weakReference.get()) == null) {
            return;
        }
        checkUpdateCallBack.onMarketStoreError(i12);
    }

    public void a(Intent intent) {
        CheckUpdateCallBack checkUpdateCallBack;
        WeakReference<CheckUpdateCallBack> weakReference = this.f363933a;
        if (weakReference == null || (checkUpdateCallBack = weakReference.get()) == null) {
            return;
        }
        checkUpdateCallBack.onMarketInstallInfo(intent);
    }

    public void a(CheckUpdateCallBack checkUpdateCallBack) {
        this.f363933a = new WeakReference<>(checkUpdateCallBack);
    }
}
