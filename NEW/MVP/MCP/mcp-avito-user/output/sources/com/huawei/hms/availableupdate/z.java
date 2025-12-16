package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.hms.utils.PackageManagerHelper;
import com.yandex.div2.D8;
import java.io.File;
import java.io.IOException;

/* compiled from: ConfirmInstallWizard.java */
/* loaded from: classes7.dex */
public class z extends p {
    @Override // com.huawei.hms.availableupdate.p
    public void a(Class<? extends q> cls) throws IllegalAccessException, InstantiationException {
        try {
            q qVarNewInstance = cls.newInstance();
            qVarNewInstance.a(this);
            this.f363412d = qVarNewInstance;
        } catch (IllegalAccessException | IllegalStateException | InstantiationException e12) {
            D8.q(e12, new StringBuilder("In ConfirmInstallWizard showDialog, failed to show the dialog."), "ConfirmInstallWizard");
        }
    }

    @Override // com.huawei.hms.availableupdate.p
    public void b(q qVar) {
        HMSLog.i("ConfirmInstallWizard", "begin to install hms.apk");
        a(b());
    }

    public final void c() {
        try {
            String str = b().getApplicationContext().getExternalCacheDir().getCanonicalPath() + File.separator + "hms.apk";
            File file = new File(str);
            if (!file.exists()) {
                HMSLog.i("ConfirmInstallWizard", str + " is not exist");
                return;
            }
            if (file.delete()) {
                HMSLog.i("ConfirmInstallWizard", "success delete file: " + str);
            }
        } catch (IOException e12) {
            HMSLog.e("ConfirmInstallWizard", "getExternalCacheDir or delete file error:  " + e12.getMessage());
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 0;
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) throws IllegalAccessException, InstantiationException {
        super.onBridgeActivityCreate(activity);
        a(c0.class);
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i12, int i13, Intent intent) {
        c();
        if (!a(this.f363415g, this.f363417i)) {
            c(8, 8);
            HMSLog.i("ConfirmInstallWizard", "biReportEvent install failure");
            return true;
        }
        c(0, 8);
        HMSLog.i("ConfirmInstallWizard", "biReportEvent install success, package: " + this.f363415g);
        return true;
    }

    @Override // com.huawei.hms.availableupdate.p
    public void a(q qVar) {
        HMSLog.i("ConfirmInstallWizard", "cancel to install hms.apk");
        c();
        c(13, 8);
    }

    public final void a(Activity activity) {
        try {
            String str = activity.getApplicationContext().getExternalCacheDir().getCanonicalPath() + File.separator + "hms.apk";
            File file = new File(str);
            if (!file.exists()) {
                HMSLog.e("ConfirmInstallWizard", str + " is not exist");
                return;
            }
            a(activity, file);
        } catch (IOException e12) {
            HMSLog.e("ConfirmInstallWizard", "getExternalCacheDir fail:  " + e12.getMessage());
        }
    }

    public void a(Activity activity, File file) {
        HMSLog.i("ConfirmInstallWizard", "install hms.apk path: " + file.getPath());
        Uri uriA = a((Context) activity, file);
        if (uriA == null) {
            HMSLog.e("ConfirmInstallWizard", "In startInstaller, failed to creates a uri from a file");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setDataAndType(uriA, "application/vnd.android.package-archive");
        intent.setFlags(3);
        intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        intent.putExtra("android.intent.extra.INSTALLER_PACKAGE_NAME", activity.getPackageName());
        try {
            activity.startActivityForResult(intent, getRequestCode());
        } catch (ActivityNotFoundException e12) {
            HMSLog.e("ConfirmInstallWizard", "In getInstallHmsIntent start activity error: " + e12.getMessage());
        }
    }

    public static Uri a(Context context, File file) {
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        String packageName = context.getPackageName();
        String strQ = androidx.appcompat.app.r.q(packageName, UpdateProvider.AUTHORITIES_SUFFIX);
        if (context.getApplicationInfo().targetSdkVersion > 23 || packageManagerHelper.hasProvider(packageName, strQ)) {
            return UpdateProvider.getUriForFile(context, strQ, file);
        }
        return Uri.fromFile(file);
    }
}
