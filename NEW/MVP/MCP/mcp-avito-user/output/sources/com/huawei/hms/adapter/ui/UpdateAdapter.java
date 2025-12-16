package com.huawei.hms.adapter.ui;

import AK.c;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.firebase.components.g;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.availableupdate.a;
import com.huawei.hms.availableupdate.p;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.kpms.KpmsConstant;
import com.huawei.hms.update.manager.UpdateManager;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.IOUtils;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class UpdateAdapter implements IBridgeActivityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f363243a;

    /* renamed from: b, reason: collision with root package name */
    public int f363244b;

    /* renamed from: c, reason: collision with root package name */
    public UpdateBean f363245c;

    /* renamed from: d, reason: collision with root package name */
    public String f363246d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f363247e = false;

    public final boolean a(Activity activity) throws Throwable {
        InputStream inputStreamOpen;
        Throwable th2;
        StringBuilder sb2 = new StringBuilder(PackageConstants.SERVICES_PACKAGE_ALL_SCENE);
        String str = File.separator;
        FileOutputStream fileOutputStream = null;
        try {
            inputStreamOpen = activity.getApplicationContext().getAssets().open(c.s(sb2, str, "hms.apk"));
        } catch (IOException e12) {
            e = e12;
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpen = null;
        }
        try {
            if (inputStreamOpen == null) {
                HMSLog.e("UpdateAdapter", "open hms.apk error, inputStream is null");
                IOUtils.closeQuietly(inputStreamOpen);
                IOUtils.closeQuietly((OutputStream) null);
                return false;
            }
            File file = new File(activity.getApplicationContext().getExternalCacheDir().getCanonicalPath() + str + "hms.apk");
            if (!file.exists() && !file.createNewFile()) {
                IOUtils.closeQuietly(inputStreamOpen);
                IOUtils.closeQuietly((OutputStream) null);
                return false;
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[4096];
                int i12 = 0;
                while (true) {
                    int i13 = inputStreamOpen.read(bArr);
                    if (i13 <= 0) {
                        HMSLog.i("UpdateAdapter", "copy hms.apk, size: " + i12);
                        IOUtils.closeQuietly(inputStreamOpen);
                        IOUtils.closeQuietly((OutputStream) fileOutputStream2);
                        return true;
                    }
                    i12 += i13;
                    fileOutputStream2.write(bArr, 0, i13);
                }
            } catch (IOException e13) {
                fileOutputStream = fileOutputStream2;
                e = e13;
                try {
                    HMSLog.e("UpdateAdapter", "copy assets hms.apk error: " + e.getMessage());
                    IOUtils.closeQuietly(inputStreamOpen);
                    IOUtils.closeQuietly((OutputStream) fileOutputStream);
                    return false;
                } catch (Throwable th4) {
                    th2 = th4;
                    IOUtils.closeQuietly(inputStreamOpen);
                    IOUtils.closeQuietly((OutputStream) fileOutputStream);
                    throw th2;
                }
            } catch (Throwable th5) {
                th2 = th5;
                fileOutputStream = fileOutputStream2;
                IOUtils.closeQuietly(inputStreamOpen);
                IOUtils.closeQuietly((OutputStream) fileOutputStream);
                throw th2;
            }
        } catch (IOException e14) {
            e = e14;
        } catch (Throwable th6) {
            th = th6;
            th2 = th;
            IOUtils.closeQuietly(inputStreamOpen);
            IOUtils.closeQuietly((OutputStream) fileOutputStream);
            throw th2;
        }
    }

    public final Activity b() {
        WeakReference<Activity> weakReference = this.f363243a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final void c() {
        SystemManager.getInstance().notifyUpdateResult(8);
        a();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        if (activity == null) {
            HMSLog.i("UpdateAdapter", "activity == null");
            c();
            return;
        }
        activity.getApplicationContext();
        this.f363243a = new WeakReference<>(activity);
        if (a.f363332b.a(b())) {
            Intent intent = activity.getIntent();
            if (intent == null) {
                c();
                return;
            }
            int intExtra = intent.getIntExtra(CommonCode.MapKey.UPDATE_VERSION, 0);
            this.f363244b = intExtra;
            if (intExtra == 0) {
                c();
                return;
            }
            if (intent.hasExtra("installHMS")) {
                this.f363247e = true;
            }
            if (a(intent, activity)) {
                return;
            }
            this.f363246d = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
            UpdateBean updateBean = new UpdateBean();
            updateBean.setHmsOrApkUpgrade(true);
            updateBean.setResolutionInstallHMS(this.f363247e);
            HMSLog.i("UpdateAdapter", "target HMS Core packageName is " + this.f363246d);
            updateBean.setClientPackageName(this.f363246d);
            updateBean.setClientVersionCode(this.f363244b);
            updateBean.setClientAppId("C10132067");
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(activity.getApplicationContext());
            }
            updateBean.setClientAppName(ResourceLoaderUtil.getString("hms_update_title"));
            this.f363245c = updateBean;
            if (a(activity)) {
                Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, p.a(8));
                intentStartBridgeActivity.putExtra(BridgeActivity.EXTRA_DELEGATE_UPDATE_INFO, updateBean);
                activity.startActivityForResult(intentStartBridgeActivity, 1001);
            } else {
                HMSLog.i("UpdateAdapter", "old framework HMSCore upgrade process");
                UpdateManager.startUpdate(activity, 1001, updateBean);
                this.f363245c = null;
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i("UpdateAdapter", "onBridgeActivityDestroy");
        a.f363332b.b(b());
        this.f363243a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i12, int i13, Intent intent) {
        if (i12 != getRequestCode()) {
            this.f363245c = null;
            return false;
        }
        g.j(i13, "onBridgeActivityResult ", "UpdateAdapter");
        if (i13 == 1214) {
            HMSLog.i("UpdateAdapter", "Enter update escape route");
            Activity activityB = b();
            if (activityB == null) {
                HMSLog.e("UpdateAdapter", "bridgeActivity is null, update escape failed ");
                this.f363245c = null;
                return true;
            }
            UpdateManager.startUpdate(activityB, 1001, this.f363245c);
            this.f363245c = null;
        }
        if (i13 == -1) {
            if (intent != null) {
                if (intent.getIntExtra(KpmsConstant.KIT_UPDATE_RESULT, 0) == 1) {
                    HMSLog.i("UpdateAdapter", "new framework update process,Error resolved successfully!");
                    SystemManager.getInstance().notifyUpdateResult(0);
                    this.f363245c = null;
                    a();
                    return true;
                }
                a(intent);
            }
        } else if (i13 == 0) {
            HMSLog.i("UpdateAdapter", "Activity.RESULT_CANCELED");
            this.f363245c = null;
            Activity activityB2 = b();
            if (activityB2 == null) {
                return true;
            }
            String hMSPackageName = HMSPackageManager.getInstance(activityB2.getApplicationContext()).getHMSPackageName();
            if (this.f363247e || a(activityB2, hMSPackageName, this.f363244b)) {
                HMSLog.i("UpdateAdapter", "Resolve error, process canceled by user clicking back button!");
                SystemManager.getInstance().notifyUpdateResult(13);
            } else {
                SystemManager.getInstance().notifyUpdateResult(0);
            }
        } else if (i13 == 1) {
            SystemManager.getInstance().notifyUpdateResult(28);
        }
        a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i("UpdateAdapter", "onBridgeConfigurationChanged");
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i12, KeyEvent keyEvent) {
        HMSLog.i("UpdateAdapter", "On key up when resolve conn error");
    }

    public final boolean a(Intent intent, Activity activity) {
        if (!intent.getBooleanExtra(CommonCode.MapKey.NEW_UPDATE, false)) {
            return false;
        }
        HMSLog.i("UpdateAdapter", "4.0 framework HMSCore upgrade process");
        String hMSPackageName = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
        ComponentName componentName = new ComponentName(hMSPackageName, "com.huawei.hms.fwksdk.stub.UpdateStubActivity");
        Intent intent2 = new Intent();
        intent2.putExtra(KpmsConstant.CALLER_PACKAGE_NAME, activity.getApplicationContext().getPackageName());
        intent2.putExtra(KpmsConstant.UPDATE_PACKAGE_NAME, hMSPackageName);
        intent2.setComponent(componentName);
        activity.startActivityForResult(intent2, 1001);
        return true;
    }

    public final void a(Intent intent) {
        int intExtra = intent.getIntExtra(BridgeActivity.EXTRA_RESULT, -1);
        if (intExtra == 0) {
            HMSLog.i("UpdateAdapter", "Error resolved successfully!");
            SystemManager.getInstance().notifyUpdateResult(0);
        } else if (intExtra == 13) {
            HMSLog.i("UpdateAdapter", "Resolve error process canceled by user!");
            SystemManager.getInstance().notifyUpdateResult(13);
        } else if (intExtra == 8) {
            HMSLog.i("UpdateAdapter", "Internal error occurred, recommended retry.");
            SystemManager.getInstance().notifyUpdateResult(8);
        } else {
            HMSLog.i("UpdateAdapter", "Other error codes.");
            SystemManager.getInstance().notifyUpdateResult(intExtra);
        }
    }

    public final void a() {
        Activity activityB = b();
        if (activityB == null || activityB.isFinishing()) {
            return;
        }
        activityB.finish();
    }

    public final boolean a(Context context, String str, int i12) {
        if (context == null || TextUtils.isEmpty(str) || i12 == 0) {
            return false;
        }
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(context);
        return PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(packageManagerHelper.getPackageStates(str)) || packageManagerHelper.getPackageVersionCode(str) < i12;
    }
}
