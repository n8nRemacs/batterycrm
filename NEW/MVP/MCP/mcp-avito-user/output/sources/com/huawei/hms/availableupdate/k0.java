package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.camera.camera2.internal.G;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.hms.utils.FileUtil;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.NetWorkUtil;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.yandex.div2.D8;
import java.io.File;
import java.io.Serializable;

/* compiled from: UpdateWizard.java */
/* loaded from: classes7.dex */
public class k0 extends p implements g {

    /* renamed from: j, reason: collision with root package name */
    public f f363394j;

    /* renamed from: k, reason: collision with root package name */
    public h f363395k;

    /* renamed from: l, reason: collision with root package name */
    public int f363396l = 0;

    /* compiled from: UpdateWizard.java */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f363397a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f363398b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ h f363399c;

        public a(g gVar, int i12, h hVar) {
            this.f363397a = gVar;
            this.f363398b = i12;
            this.f363399c = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f363397a.a(this.f363398b, this.f363399c);
        }
    }

    public final boolean b(int i12) {
        return i12 == 9;
    }

    public final void c() {
        f fVar = this.f363394j;
        if (fVar != null) {
            fVar.a();
            this.f363394j = null;
        }
    }

    public final void d() throws IllegalAccessException, InstantiationException {
        int iA2 = a(b());
        com.google.firebase.components.g.j(iA2, "current network is ", "UpdateWizard");
        if (iA2 != 1 && !b(iA2)) {
            a(w.class);
            HMSLog.i("UpdateWizard", "current network is not wifi");
        } else {
            a(a0.class);
            f();
            HMSLog.i("UpdateWizard", "current network is wifi");
        }
    }

    public final void e() {
        if (a(false)) {
            a(8, this.f363414f);
        } else {
            c(8, this.f363414f);
        }
    }

    public final void f() throws IllegalAccessException, InstantiationException {
        Activity activityB = b();
        if (activityB == null || activityB.isFinishing()) {
            a(g0.class);
        } else if (b(activityB)) {
            c();
            d dVar = new d(new e(activityB));
            this.f363394j = dVar;
            dVar.a(this, this.f363395k);
        }
    }

    public void g() {
        c(13, this.f363414f);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2006;
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) throws IllegalAccessException, InstantiationException {
        super.onBridgeActivityCreate(activity);
        if (this.f363411c == null) {
            return;
        }
        this.f363414f = 6;
        if (b(activity)) {
            if (this.f363411c.isNeedConfirm() && !TextUtils.isEmpty(this.f363416h)) {
                a(c0.class);
            } else {
                a(s.class);
                a(this);
            }
        }
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        c();
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i12, int i13, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.f363413e && (iBridgeActivityDelegate = this.f363410b) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i12, i13, intent);
        }
        if (this.f363414f != 6 || i12 != getRequestCode()) {
            return false;
        }
        if (a(this.f363415g, this.f363417i)) {
            c(0, this.f363414f);
            return true;
        }
        e();
        return true;
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i12, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.f363413e && (iBridgeActivityDelegate = this.f363410b) != null) {
            iBridgeActivityDelegate.onKeyUp(i12, keyEvent);
            return;
        }
        if (4 == i12) {
            HMSLog.i("UpdateWizard", "In onKeyUp, Call finish.");
            Activity activityB = b();
            if (activityB == null || activityB.isFinishing()) {
                return;
            }
            activityB.setResult(0, null);
            activityB.finish();
        }
    }

    public static Uri a(Context context, File file) {
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        String packageName = context.getPackageName();
        String strQ = androidx.appcompat.app.r.q(packageName, UpdateProvider.AUTHORITIES_SUFFIX);
        return (context.getApplicationInfo().targetSdkVersion <= 23 && !packageManagerHelper.hasProvider(packageName, strQ)) ? Uri.fromFile(file) : UpdateProvider.getUriForFile(context, strQ, file);
    }

    public final boolean b(Activity activity) {
        if (this.f363411c.getResolutionInstallHMS()) {
            HMSLog.i("UpdateWizard", "getResolutionInstallHMS, status: true");
            return true;
        }
        if (HMSPackageManager.getInstance(activity).isApkUpdateNecessary(this.f363411c.c())) {
            return true;
        }
        a();
        SystemManager.getInstance().notifyUpdateResult(0);
        return false;
    }

    @Override // com.huawei.hms.availableupdate.p
    public void b(q qVar) throws IllegalAccessException, InstantiationException {
        HMSLog.i("UpdateWizard", "Enter onDoWork.");
        if (qVar instanceof c0) {
            qVar.b();
            a(s.class);
            a(this);
            return;
        }
        if (qVar instanceof y) {
            qVar.b();
            g();
            return;
        }
        if (qVar instanceof x) {
            a(a0.class);
            f();
            return;
        }
        if (qVar instanceof w) {
            a(a0.class);
            f();
        } else if (qVar instanceof f0) {
            e();
        } else if (qVar instanceof g0) {
            e();
        } else if (qVar instanceof h0) {
            e();
        }
    }

    public static void a(g gVar, int i12, h hVar) {
        if (gVar != null) {
            new Handler(Looper.getMainLooper()).post(new a(gVar, i12, hVar));
        }
    }

    @Override // com.huawei.hms.availableupdate.g
    public void a(int i12, h hVar) throws IllegalAccessException, InstantiationException {
        HMSLog.i("UpdateWizard", "Enter onCheckUpdate, status: " + i.a(i12));
        if (i12 != 1000) {
            switch (i12) {
                case 1201:
                case 1202:
                case 1203:
                    a(f0.class);
                    break;
                default:
                    a(f0.class);
                    break;
            }
        }
        this.f363395k = hVar;
        d();
    }

    public final int a(Activity activity) {
        if (activity != null) {
            return NetWorkUtil.getNetworkType(activity);
        }
        return 0;
    }

    @Override // com.huawei.hms.availableupdate.g
    public void a(int i12, int i13, int i14, File file) throws IllegalAccessException, InstantiationException {
        HMSLog.i("UpdateWizard", "Enter onDownloadPackage, status: " + i.a(i12) + ", reveived: " + i13 + ", total: " + i14);
        if (i12 == 2000) {
            a();
            if (file == null) {
                e();
                return;
            } else if (FileUtil.verifyHash(this.f363395k.f363380e, file)) {
                a(file);
                return;
            } else {
                HMSLog.i("UpdateWizard", "Hash value mismatch for download file");
            }
        }
        if (i12 == 2100) {
            q qVar = this.f363412d;
            if (qVar == null || !(qVar instanceof a0)) {
                return;
            }
            int i15 = (i13 < 0 || i14 <= 0) ? 0 : (int) ((i13 * 100) / i14);
            this.f363396l = i15;
            ((a0) qVar).b(i15);
            return;
        }
        if (i12 != 2101) {
            switch (i12) {
                case 2201:
                    a(g0.class);
                    break;
                case 2202:
                    a(x.class);
                    break;
                case 2203:
                case 2204:
                    a(h0.class);
                    break;
            }
        }
    }

    /* compiled from: UpdateWizard.java */
    public class b implements CheckUpdateCallBack {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f363400a;

        public b(g gVar) {
            this.f363400a = gVar;
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketStoreError(int i12) {
            HMSLog.e("UpdateWizard", "onMarketStoreError responseCode: " + i12);
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateInfo(Intent intent) {
            if (intent != null) {
                k0.this.a(intent, this.f363400a);
            }
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateStoreError(int i12) {
            HMSLog.e("UpdateWizard", "onUpdateStoreError responseCode: " + i12);
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketInstallInfo(Intent intent) {
        }
    }

    public final void a(File file) {
        Activity activityB = b();
        if (activityB == null || activityB.isFinishing()) {
            return;
        }
        Uri uriA = a(activityB, file);
        if (uriA == null) {
            HMSLog.e("UpdateWizard", "In startInstaller, Failed to creates a Uri from a file.");
            e();
        } else if (b(activityB)) {
            try {
                activityB.startActivityForResult(a(uriA, activityB), getRequestCode());
            } catch (ActivityNotFoundException e12) {
                HMSLog.e("UpdateWizard", "In startInstaller, Failed to start package installer." + e12.getMessage());
                e();
            }
        }
    }

    public final Intent a(Uri uri, Activity activity) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        intent.setFlags(3);
        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        intent.putExtra("android.intent.extra.INSTALLER_PACKAGE_NAME", activity.getPackageName());
        return intent;
    }

    @Override // com.huawei.hms.availableupdate.p
    public void a(q qVar) throws IllegalAccessException, InstantiationException {
        HMSLog.i("UpdateWizard", "Enter onCancel.");
        if (qVar instanceof c0) {
            g();
            return;
        }
        if (qVar instanceof s) {
            c();
            g();
            return;
        }
        if (qVar instanceof a0) {
            c();
            a(y.class);
            return;
        }
        if (qVar instanceof y) {
            a(a0.class);
            f();
        } else if (qVar instanceof x) {
            g();
        } else if (qVar instanceof w) {
            g();
        } else {
            e();
        }
    }

    @Override // com.huawei.hms.availableupdate.p
    public void a(Class<? extends q> cls) throws IllegalAccessException, InstantiationException {
        if (b(b())) {
            a();
            try {
                q qVarNewInstance = cls.newInstance();
                if (!TextUtils.isEmpty(this.f363416h) && (qVarNewInstance instanceof c0)) {
                    String string = ResourceLoaderUtil.getString("hms_update_title");
                    this.f363416h = string;
                    ((c0) qVarNewInstance).a(string);
                }
                int i12 = this.f363396l;
                if (i12 > 0 && (qVarNewInstance instanceof a0)) {
                    ((a0) qVarNewInstance).a(i12);
                }
                qVarNewInstance.a(this);
                this.f363412d = qVarNewInstance;
            } catch (IllegalAccessException e12) {
                e = e12;
                D8.q(e, new StringBuilder("In showDialog, Failed to show the dialog."), "UpdateWizard");
            } catch (IllegalStateException e13) {
                e = e13;
                D8.q(e, new StringBuilder("In showDialog, Failed to show the dialog."), "UpdateWizard");
            } catch (InstantiationException e14) {
                e = e14;
                D8.q(e, new StringBuilder("In showDialog, Failed to show the dialog."), "UpdateWizard");
            }
        }
    }

    public final void a(g gVar) {
        if (gVar == null) {
            return;
        }
        Activity activityB = b();
        if (activityB != null && !activityB.isFinishing()) {
            if (b(activityB)) {
                UpdateSdkAPI.checkTargetAppUpdate(activityB, this.f363411c.b(), new b(gVar));
                return;
            }
            return;
        }
        a(gVar, 1201, (h) null);
    }

    public final void a(Intent intent, g gVar) {
        try {
            int intExtra = intent.getIntExtra("status", -99);
            HMSLog.i("UpdateWizard", "CheckUpdateCallBack status is " + intExtra);
            String stringExtra = intent.getStringExtra(UpdateKey.FAIL_REASON);
            if (!TextUtils.isEmpty(stringExtra)) {
                HMSLog.e("UpdateWizard", "checkTargetAppUpdate reason is " + stringExtra);
            }
            if (intExtra != 7) {
                if (intExtra == 3) {
                    a(gVar, 1202, (h) null);
                    return;
                } else {
                    a(gVar, 1201, (h) null);
                    return;
                }
            }
            Serializable serializableExtra = intent.getSerializableExtra(UpdateKey.INFO);
            if (serializableExtra instanceof ApkUpgradeInfo) {
                ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) serializableExtra;
                String package_ = apkUpgradeInfo.getPackage_();
                int versionCode_ = apkUpgradeInfo.getVersionCode_();
                String downurl_ = apkUpgradeInfo.getDownurl_();
                int size_ = apkUpgradeInfo.getSize_();
                String sha256_ = apkUpgradeInfo.getSha256_();
                if (!TextUtils.isEmpty(package_) && package_.equals(this.f363411c.b())) {
                    if (versionCode_ < this.f363411c.c()) {
                        StringBuilder sbJ = G.j(versionCode_, "CheckUpdateCallBack versionCode is ", "bean.getClientVersionCode() is ");
                        sbJ.append(this.f363411c.c());
                        HMSLog.e("UpdateWizard", sbJ.toString());
                        a(gVar, 1203, (h) null);
                        return;
                    }
                    if (!TextUtils.isEmpty(downurl_) && !TextUtils.isEmpty(sha256_)) {
                        a(gVar, 1000, new h(package_, versionCode_, downurl_, size_, sha256_));
                        return;
                    } else {
                        a(gVar, 1201, (h) null);
                        return;
                    }
                }
                a(gVar, 1201, (h) null);
            }
        } catch (Exception e12) {
            D8.q(e12, new StringBuilder("intent has some error"), "UpdateWizard");
            a(gVar, 1201, (h) null);
        }
    }
}
