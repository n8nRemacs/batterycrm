package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.yandex.div2.D8;
import java.util.ArrayList;
import java.util.List;
import shark.AndroidResourceIdNames;

/* compiled from: HiappWizard.java */
/* loaded from: classes7.dex */
public class b0 extends p {
    @Override // com.huawei.hms.availableupdate.p
    public void a(q qVar) {
        HMSLog.i("HiappWizard", "Enter onCancel.");
        if (qVar instanceof c0) {
            d();
        }
    }

    @Override // com.huawei.hms.availableupdate.p
    public void b(q qVar) {
        HMSLog.i("HiappWizard", "Enter onDoWork.");
        if (qVar instanceof c0) {
            qVar.b();
            if (c()) {
                return;
            }
            if (a(false)) {
                a(8, this.f363414f);
            } else {
                c(8, this.f363414f);
            }
        }
    }

    public final boolean c() {
        Activity activityB = b();
        if (activityB == null || activityB.isFinishing() || TextUtils.isEmpty(this.f363415g)) {
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("com.huawei.appmarket.intent.action.AppDetail");
            intent.putExtra("APP_PACKAGENAME", this.f363415g);
            if (SystemUtils.isTVDevice()) {
                int packageVersionCode = new PackageManagerHelper(activityB).getPackageVersionCode("com.hisilicon.android.hiRMService");
                HMSLog.i("HiappWizard", "version " + packageVersionCode);
                if (packageVersionCode == 1) {
                    HMSLog.i("HiappWizard", "startActivity");
                    intent.addFlags(268435456);
                    a(intent);
                    activityB.startActivity(intent);
                    activityB.finish();
                    return true;
                }
            }
            HMSLog.i("HiappWizard", "startActivityForResult");
            a(intent);
            activityB.startActivityForResult(intent, getRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            HMSLog.e("HiappWizard", "can not open hiapp");
            return false;
        }
    }

    public void d() {
        c(13, this.f363414f);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2005;
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) throws IllegalAccessException, InstantiationException {
        super.onBridgeActivityCreate(activity);
        UpdateBean updateBean = this.f363411c;
        if (updateBean == null) {
            return;
        }
        this.f363414f = 5;
        if (updateBean.isNeedConfirm() && !TextUtils.isEmpty(this.f363416h)) {
            a(c0.class);
        } else {
            if (c()) {
                return;
            }
            if (a(false)) {
                a(8, this.f363414f);
            } else {
                c(8, this.f363414f);
            }
        }
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i12, int i13, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.f363413e && (iBridgeActivityDelegate = this.f363410b) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i12, i13, intent);
        }
        if (this.f363414f != 5 || i12 != getRequestCode()) {
            return false;
        }
        if (a(this.f363415g, this.f363417i)) {
            c(0, this.f363414f);
            return true;
        }
        c(8, this.f363414f);
        return true;
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i12, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.f363413e && (iBridgeActivityDelegate = this.f363410b) != null) {
            iBridgeActivityDelegate.onKeyUp(i12, keyEvent);
            return;
        }
        if (4 == i12) {
            HMSLog.i("HiappWizard", "In onKeyUp, Call finish.");
            Activity activityB = b();
            if (activityB == null || activityB.isFinishing()) {
                return;
            }
            activityB.setResult(0, null);
            activityB.finish();
        }
    }

    public final void a(Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = b().getPackageManager().queryIntentActivities(intent, AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR);
        if (listQueryIntentActivities == null || listQueryIntentActivities.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(PackageConstants.SERVICES_PACKAGE_APPMARKET_TV);
        arrayList.add(PackageConstants.SERVICES_PACKAGE_APPMARKET_CAR);
        arrayList.add(PackageConstants.SERVICES_PACKAGE_APPMARKET);
        if (listQueryIntentActivities.size() == 1) {
            return;
        }
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            if (arrayList.contains(resolveInfo.activityInfo.packageName)) {
                intent.setPackage(resolveInfo.activityInfo.packageName);
                return;
            }
        }
    }

    @Override // com.huawei.hms.availableupdate.p
    public void a(Class<? extends q> cls) throws IllegalAccessException, InstantiationException {
        a();
        try {
            q qVarNewInstance = cls.newInstance();
            if (!TextUtils.isEmpty(this.f363416h) && (qVarNewInstance instanceof c0)) {
                String string = ResourceLoaderUtil.getString("hms_update_title");
                this.f363416h = string;
                ((c0) qVarNewInstance).a(string);
            }
            qVarNewInstance.a(this);
            this.f363412d = qVarNewInstance;
        } catch (IllegalAccessException e12) {
            e = e12;
            D8.q(e, new StringBuilder("In showDialog, Failed to show the dialog."), "HiappWizard");
        } catch (IllegalStateException e13) {
            e = e13;
            D8.q(e, new StringBuilder("In showDialog, Failed to show the dialog."), "HiappWizard");
        } catch (InstantiationException e14) {
            e = e14;
            D8.q(e, new StringBuilder("In showDialog, Failed to show the dialog."), "HiappWizard");
        }
    }
}
