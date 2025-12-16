package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.yandex.div2.D8;
import java.util.Iterator;
import java.util.List;

/* compiled from: AppTouchWizard.java */
/* loaded from: classes7.dex */
public class r extends p {
    @Override // com.huawei.hms.availableupdate.p
    public void a(q qVar) {
        HMSLog.i("AppTouchWizard", "Enter onCancel.");
        if (qVar instanceof c0) {
            d();
        }
    }

    @Override // com.huawei.hms.availableupdate.p
    public void b(q qVar) {
        HMSLog.i("AppTouchWizard", "Enter onDoWork.");
        if (qVar instanceof c0) {
            qVar.b();
            if (c()) {
                return;
            }
            a(8, this.f363414f);
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
            a(intent);
            activityB.startActivityForResult(intent, getRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            HMSLog.e("AppTouchWizard", "can not open AppTouch detail page");
            return false;
        }
    }

    public void d() {
        c(13, this.f363414f);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2007;
    }

    @Override // com.huawei.hms.availableupdate.p, com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) throws IllegalAccessException, InstantiationException {
        super.onBridgeActivityCreate(activity);
        UpdateBean updateBean = this.f363411c;
        if (updateBean == null) {
            return;
        }
        this.f363414f = 7;
        if (updateBean.isNeedConfirm() && !TextUtils.isEmpty(this.f363416h)) {
            a(c0.class);
        } else {
            if (c()) {
                return;
            }
            a(8, this.f363414f);
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
        if (this.f363414f != 7 || i12 != getRequestCode()) {
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
            HMSLog.i("AppTouchWizard", "In onKeyUp, Call finish.");
            Activity activityB = b();
            if (activityB == null || activityB.isFinishing()) {
                return;
            }
            activityB.setResult(0, null);
            activityB.finish();
        }
    }

    public final void a(Intent intent) {
        String str;
        List<ResolveInfo> listQueryIntentServices = b().getPackageManager().queryIntentServices(new Intent("com.apptouch.intent.action.update_hms"), 0);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            str = null;
        } else {
            Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
            while (it.hasNext()) {
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    str = serviceInfo.packageName;
                    if (!TextUtils.isEmpty(str)) {
                        break;
                    }
                }
            }
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        intent.setPackage(str);
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
            D8.q(e, new StringBuilder("In showDialog, Failed to show the dialog."), "AppTouchWizard");
        } catch (IllegalStateException e13) {
            e = e13;
            D8.q(e, new StringBuilder("In showDialog, Failed to show the dialog."), "AppTouchWizard");
        } catch (InstantiationException e14) {
            e = e14;
            D8.q(e, new StringBuilder("In showDialog, Failed to show the dialog."), "AppTouchWizard");
        }
    }
}
