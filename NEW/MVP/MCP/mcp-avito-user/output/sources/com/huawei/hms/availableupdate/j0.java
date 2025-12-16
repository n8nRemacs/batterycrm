package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeBundle;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import com.yandex.div2.D8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SilentUpdateWizard.java */
/* loaded from: classes7.dex */
public class j0 extends p {

    /* renamed from: j, reason: collision with root package name */
    public BroadcastReceiver f363386j;

    /* renamed from: k, reason: collision with root package name */
    public Handler f363387k = new Handler();

    /* renamed from: l, reason: collision with root package name */
    public int f363388l = 0;

    /* renamed from: m, reason: collision with root package name */
    public Handler f363389m = new a();

    /* compiled from: SilentUpdateWizard.java */
    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws IllegalAccessException, InstantiationException {
            SafeBundle safeBundle = new SafeBundle((Bundle) message.obj);
            switch (message.what) {
                case UpdateStatusCode.DialogButton.CONFIRM /* 101 */:
                    j0.this.a(safeBundle);
                    break;
                case 102:
                    j0.this.b(safeBundle);
                    break;
                case 103:
                    j0.this.c(safeBundle);
                    break;
            }
        }
    }

    /* compiled from: SilentUpdateWizard.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            j0.this.c(14);
        }

        public /* synthetic */ b(j0 j0Var, a aVar) {
            this();
        }
    }

    public final void d() {
        BroadcastReceiver broadcastReceiver;
        Activity activityB = b();
        if (activityB == null || (broadcastReceiver = this.f363386j) == null) {
            return;
        }
        activityB.unregisterReceiver(broadcastReceiver);
        this.f363386j = null;
    }

    public void e() {
        c(13, this.f363414f);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2000;
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        if (this.f363411c == null) {
            return;
        }
        this.f363414f = 0;
        if (a(activity)) {
            return;
        }
        if (a(true)) {
            a(8, this.f363414f);
        } else {
            c(8, this.f363414f);
        }
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        this.f363387k.removeCallbacksAndMessages(null);
        d();
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i12, int i13, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.f363413e && (iBridgeActivityDelegate = this.f363410b) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i12, i13, intent);
        }
        HMSLog.i("SilentUpdateWizard", "onBridgeActivityResult requestCode is " + i12 + "resultCode is " + i13);
        if (i12 != getRequestCode()) {
            return false;
        }
        if (i13 == 0) {
            c();
            b(20000);
            return true;
        }
        if (i13 == 4) {
            e();
            return true;
        }
        if (a(true)) {
            a(i13, this.f363414f);
        } else {
            c(i13, this.f363414f);
        }
        return true;
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i12, KeyEvent keyEvent) {
        super.onKeyUp(i12, keyEvent);
    }

    public final void b(int i12) {
        this.f363387k.removeCallbacksAndMessages(null);
        this.f363387k.postDelayed(new b(this, null), i12);
    }

    public final void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.appmarket.service.downloadservice.Receiver");
        intentFilter.addAction("com.huawei.appmarket.service.downloadservice.progress.Receiver");
        intentFilter.addAction("com.huawei.appmarket.service.installerservice.Receiver");
        this.f363386j = new o(this.f363389m);
        Activity activityB = b();
        if (activityB != null) {
            activityB.registerReceiver(this.f363386j, intentFilter);
        }
    }

    public final boolean a(Activity activity) throws JSONException {
        if (TextUtils.isEmpty(this.f363415g)) {
            return false;
        }
        Intent intent = new Intent("com.huawei.appmarket.intent.action.ThirdUpdateAction");
        intent.setPackage(PackageConstants.SERVICES_PACKAGE_APPMARKET);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pkgName", this.f363415g);
            jSONObject.put("versioncode", this.f363417i);
            jSONArray.put(jSONObject);
            intent.putExtra("params", jSONArray.toString());
            intent.putExtra("isHmsOrApkUpgrade", this.f363411c.d());
            intent.putExtra("buttonDlgY", ResourceLoaderUtil.getString("hms_install"));
            intent.putExtra("buttonDlgN", ResourceLoaderUtil.getString("hms_cancel"));
            intent.putExtra("upgradeDlgContent", ResourceLoaderUtil.getString("hms_update_message_new", "%P"));
            try {
                HMSLog.i("SilentUpdateWizard", "start silent activity of AppMarket");
                activity.startActivityForResult(intent, getRequestCode());
                HMSLog.i("SilentUpdateWizard", "start silent activity finished");
                return true;
            } catch (ActivityNotFoundException unused) {
                HMSLog.e("SilentUpdateWizard", "ActivityNotFoundException");
                return false;
            }
        } catch (JSONException e12) {
            HMSLog.e("SilentUpdateWizard", "create hmsJsonObject fail" + e12.getMessage());
            return false;
        }
    }

    public final void b(SafeBundle safeBundle) throws IllegalAccessException, InstantiationException {
        String string = safeBundle.containsKey("UpgradePkgName") ? safeBundle.getString("UpgradePkgName") : null;
        if (string != null && string.equals(this.f363415g) && safeBundle.containsKey("UpgradeDownloadProgress") && safeBundle.containsKey("UpgradeAppName")) {
            int i12 = safeBundle.getInt("UpgradeDownloadProgress");
            HMSLog.i("SilentUpdateWizard", "handlerDownloadProgress-progress is " + i12);
            b(20000);
            if (i12 >= 99) {
                i12 = 99;
            }
            this.f363388l = i12;
            if (this.f363412d == null) {
                a(a0.class);
            }
            q qVar = this.f363412d;
            if (qVar != null) {
                ((a0) qVar).b(i12);
            }
        }
    }

    public final void c(int i12) {
        this.f363387k.removeCallbacksAndMessages(null);
        d();
        a();
        if (!a(false)) {
            c(i12, this.f363414f);
        } else {
            a(i12, this.f363414f);
        }
    }

    public final void c(SafeBundle safeBundle) {
        if (safeBundle.containsKey("packagename") && safeBundle.containsKey("status")) {
            String string = safeBundle.getString("packagename");
            int i12 = safeBundle.getInt("status");
            com.google.firebase.components.g.j(i12, "handlerInstallStatus-status is ", "SilentUpdateWizard");
            if (string == null || !string.equals(this.f363415g)) {
                return;
            }
            if (i12 == 2) {
                this.f363387k.removeCallbacksAndMessages(null);
                q qVar = this.f363412d;
                if (qVar != null) {
                    ((a0) qVar).b(100);
                }
                c(0, this.f363414f);
                return;
            }
            if (i12 != -1 && i12 != -2) {
                b(60000);
            } else {
                c(i12);
            }
        }
    }

    public final void a(SafeBundle safeBundle) {
        String string = safeBundle.containsKey("UpgradePkgName") ? safeBundle.getString("UpgradePkgName") : null;
        if (string != null && string.equals(this.f363415g) && safeBundle.containsKey("downloadtask.status")) {
            int i12 = safeBundle.getInt("downloadtask.status");
            com.google.firebase.components.g.j(i12, "handleDownloadStatus-status is ", "SilentUpdateWizard");
            if (i12 == 3 || i12 == 5 || i12 == 6 || i12 == 8) {
                c(i12);
            } else if (i12 == 4) {
                b(60000);
            } else {
                b(20000);
            }
        }
    }

    @Override // com.huawei.hms.availableupdate.p
    public void a(Class<? extends q> cls) throws IllegalAccessException, InstantiationException {
        try {
            q qVarNewInstance = cls.newInstance();
            int i12 = this.f363388l;
            if (i12 > 0 && (qVarNewInstance instanceof a0)) {
                ((a0) qVarNewInstance).a(i12);
            }
            qVarNewInstance.a(this);
            this.f363412d = qVarNewInstance;
        } catch (IllegalAccessException e12) {
            e = e12;
            D8.q(e, new StringBuilder("In showDialog, Failed to show the dialog."), "SilentUpdateWizard");
        } catch (IllegalStateException e13) {
            e = e13;
            D8.q(e, new StringBuilder("In showDialog, Failed to show the dialog."), "SilentUpdateWizard");
        } catch (InstantiationException e14) {
            e = e14;
            D8.q(e, new StringBuilder("In showDialog, Failed to show the dialog."), "SilentUpdateWizard");
        }
    }
}
