package com.huawei.updatesdk.service.otaupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* loaded from: classes7.dex */
public class e extends AsyncTask<Void, Void, com.huawei.updatesdk.a.b.c.c.d> {

    /* renamed from: b, reason: collision with root package name */
    private Context f363935b;

    /* renamed from: c, reason: collision with root package name */
    private CheckUpdateCallBack f363936c;

    /* renamed from: d, reason: collision with root package name */
    private UpdateParams f363937d;

    /* renamed from: e, reason: collision with root package name */
    private Toast f363938e;

    /* renamed from: g, reason: collision with root package name */
    private com.huawei.updatesdk.a.b.c.b f363940g;

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f363934a = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f363939f = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f363941h = false;

    public e(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack) {
        this.f363937d = updateParams;
        this.f363935b = context;
        this.f363936c = checkUpdateCallBack;
        f.e().b(updateParams.getServiceZone());
    }

    private PackageInfo a(Context context, String str) {
        PackageInfo packageInfoA = com.huawei.updatesdk.b.h.b.a(str, context);
        if (packageInfoA == null) {
            packageInfoA = new PackageInfo();
            packageInfoA.packageName = str;
            packageInfoA.versionName = "1.0";
            packageInfoA.versionCode = 1;
            ApplicationInfo applicationInfo = new ApplicationInfo();
            applicationInfo.targetSdkVersion = 19;
            packageInfoA.applicationInfo = applicationInfo;
        }
        return com.huawei.updatesdk.a.a.d.e.a(packageInfoA);
    }

    private void b() {
        String targetPkgName = this.f363937d.getTargetPkgName();
        if (TextUtils.isEmpty(targetPkgName)) {
            targetPkgName = this.f363935b.getPackageName();
        }
        if (!com.huawei.updatesdk.b.h.d.a(this.f363937d.getPackageList())) {
            this.f363934a.addAll(this.f363937d.getPackageList());
        } else if (!TextUtils.isEmpty(targetPkgName)) {
            this.f363934a.add(targetPkgName);
        }
        com.huawei.updatesdk.a.a.a.b("UpdateSDKCheckTask", "start check update and packageNames are: " + this.f363934a.toString());
    }

    private boolean c() {
        return !this.f363939f && TextUtils.isEmpty(this.f363937d.getTargetPkgName()) && com.huawei.updatesdk.b.h.d.a(this.f363937d.getPackageList()) && com.huawei.updatesdk.b.h.d.a(this.f363937d.getParamList());
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
        com.huawei.updatesdk.a.b.c.b bVar = this.f363940g;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() throws Resources.NotFoundException {
        super.onPreExecute();
        if (c()) {
            Context context = this.f363935b;
            Toast toastMakeText = Toast.makeText(context, com.huawei.updatesdk.b.h.c.c(context, "upsdk_checking_update_prompt"), 1);
            this.f363938e = toastMakeText;
            toastMakeText.show();
        }
    }

    private com.huawei.updatesdk.a.b.c.c.d a(Context context, List<String> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(context, it.next()));
        }
        com.huawei.updatesdk.service.appmgr.bean.d dVar = !com.huawei.updatesdk.b.h.d.a(this.f363937d.getParamList()) ? new com.huawei.updatesdk.service.appmgr.bean.d(this.f363937d.getParamList()) : com.huawei.updatesdk.service.appmgr.bean.d.a(arrayList);
        com.huawei.updatesdk.b.e.a aVarA = com.huawei.updatesdk.b.e.f.a(this.f363941h);
        dVar.d(aVarA.c());
        dVar.b(0);
        dVar.d(com.huawei.updatesdk.a.a.d.i.c.b(context, aVarA.b()));
        if (isCancelled()) {
            com.huawei.updatesdk.a.a.a.c("UpdateSDKCheckTask", "UpdateSDK task is canceled and return empty upgradeInfo");
            return null;
        }
        com.huawei.updatesdk.a.b.c.b bVar = new com.huawei.updatesdk.a.b.c.b(dVar, null);
        this.f363940g = bVar;
        return bVar.c();
    }

    private void b(com.huawei.updatesdk.a.b.c.c.d dVar) {
        if (this.f363936c != null) {
            Intent intent = new Intent();
            intent.putExtra("status", 6);
            if (dVar.a() != null) {
                intent.putExtra(UpdateKey.FAIL_CODE, dVar.a().ordinal());
            }
            intent.putExtra(UpdateKey.FAIL_REASON, dVar.c());
            intent.putExtra(UpdateKey.RESPONSE_CODE, dVar.b());
            this.f363936c.onUpdateInfo(intent);
            this.f363936c.onUpdateStoreError(dVar.d());
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.huawei.updatesdk.a.b.c.c.d doInBackground(Void... voidArr) throws ExecutionException, InterruptedException, TimeoutException {
        com.huawei.updatesdk.a.a.c.a.a.a.a("UpdateSDKCheckTask", "CheckOtaAndUpdataTask doInBackground");
        com.huawei.updatesdk.b.b.a.d().c();
        com.huawei.updatesdk.b.g.b.a(this);
        b();
        com.huawei.updatesdk.b.e.a aVarA = com.huawei.updatesdk.b.e.f.a(this.f363941h);
        aVarA.a(this.f363934a);
        aVarA.d();
        com.huawei.updatesdk.a.b.c.c.c.c(aVarA.b(this.f363935b));
        com.huawei.updatesdk.b.b.a.d().e(f.e().a());
        return a(this.f363935b, this.f363934a);
    }

    public void b(boolean z12) {
        this.f363939f = z12;
    }

    private void a() {
        Toast toast = this.f363938e;
        if (toast != null) {
            toast.cancel();
        }
    }

    private void a(Context context, ApkUpgradeInfo apkUpgradeInfo) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) AppUpdateActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("app_update_parm", apkUpgradeInfo);
        bundle.putBoolean("app_must_btn", this.f363937d.isMustBtnOne());
        bundle.putBoolean("is_apptouch", this.f363941h);
        intent.putExtras(bundle);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e12) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("UpdateSDKCheckTask", "go AppUpdateActivity error: " + e12.toString());
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(com.huawei.updatesdk.a.b.c.c.d dVar) {
        ArrayList<ApkUpgradeInfo> arrayList;
        com.huawei.updatesdk.b.g.b.a().remove(this);
        a();
        if (this.f363936c == null) {
            com.huawei.updatesdk.a.a.a.c("UpdateSDKCheckTask", "UpdateSDK callback is null");
        }
        if (dVar == null) {
            if (this.f363936c != null) {
                Intent intent = new Intent();
                intent.putExtra("status", 3);
                this.f363936c.onUpdateInfo(intent);
                return;
            }
            return;
        }
        int iB2 = dVar.b();
        if (dVar.e()) {
            com.huawei.updatesdk.service.appmgr.bean.e eVar = (com.huawei.updatesdk.service.appmgr.bean.e) dVar;
            arrayList = eVar.list;
            if (!com.huawei.updatesdk.b.h.d.a(eVar.notRcmList)) {
                ApkUpgradeInfo apkUpgradeInfo = eVar.notRcmList.get(0);
                com.huawei.updatesdk.a.a.a.a("UpdateSDKCheckTask", "Updateinfo is not recommend, reason: " + apkUpgradeInfo.getNotRcmReason_() + " ,is same signature: " + apkUpgradeInfo.getSameS_());
            }
            a((List<ApkUpgradeInfo>) arrayList);
            if (com.huawei.updatesdk.b.h.d.a(arrayList) && this.f363936c != null) {
                com.huawei.updatesdk.a.a.a.b("UpdateSDKCheckTask", "no upgrade info");
                Intent intent2 = new Intent();
                intent2.putExtra("status", 3);
                intent2.putExtra(UpdateKey.RESPONSE_CODE, iB2);
                this.f363936c.onUpdateInfo(intent2);
            }
        } else {
            b(dVar);
            com.huawei.updatesdk.a.a.a.a("UpdateSDKCheckTask", "get app update msg failed,responseCode is " + dVar.d() + ",failreason: " + dVar.c() + ",response: " + dVar.toString());
            arrayList = null;
        }
        if (com.huawei.updatesdk.b.h.d.a(arrayList)) {
            if (c()) {
                com.huawei.updatesdk.a.a.a.b("UpdateSDKCheckTask", "show no upgrade info toast.");
                Context context = this.f363935b;
                Toast.makeText(context, com.huawei.updatesdk.b.h.c.c(context, "upsdk_update_check_no_new_version"), 0).show();
                return;
            } else {
                com.huawei.updatesdk.a.a.a.b("UpdateSDKCheckTask", "no upgrade info: " + this.f363934a.toString());
                return;
            }
        }
        ApkUpgradeInfo apkUpgradeInfo2 = arrayList.get(0);
        d.a().a(this.f363936c);
        if (this.f363936c != null) {
            Intent intent3 = new Intent();
            intent3.putExtra(UpdateKey.INFO, (Serializable) apkUpgradeInfo2);
            intent3.putParcelableArrayListExtra(UpdateKey.INFO_LIST, arrayList);
            intent3.putExtra("status", 7);
            intent3.putExtra(UpdateKey.RESPONSE_CODE, iB2);
            this.f363936c.onUpdateInfo(intent3);
        }
        a(arrayList);
        if (this.f363937d.isShowImmediate()) {
            a(this.f363935b, apkUpgradeInfo2);
        }
    }

    private void a(ArrayList<ApkUpgradeInfo> arrayList) {
        Iterator<ApkUpgradeInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            ApkUpgradeInfo next = it.next();
            com.huawei.updatesdk.a.a.a.b("UpdateSDKCheckTask", "ApkUpgradeInfo, version=" + next.getVersion_() + ", versionCode=" + next.getVersionCode_() + ", detailId=" + next.getDetailId_() + ", devType=" + next.getDevType_() + ", packageName=" + next.getPackage_() + ", oldVersionCode=" + next.getOldVersionCode_());
        }
    }

    private void a(List<ApkUpgradeInfo> list) {
        if (com.huawei.updatesdk.b.h.d.a(list)) {
            return;
        }
        for (ApkUpgradeInfo apkUpgradeInfo : list) {
            if (apkUpgradeInfo != null && !TextUtils.isEmpty(apkUpgradeInfo.getFullDownUrl_())) {
                if (apkUpgradeInfo.getDiffSize_() > 0) {
                    apkUpgradeInfo.setDiffDownUrl_(apkUpgradeInfo.getDownurl_());
                }
                apkUpgradeInfo.setDownurl_(apkUpgradeInfo.getFullDownUrl_());
            }
        }
    }

    public void a(boolean z12) {
        this.f363941h = z12;
    }
}
