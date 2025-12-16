package com.huawei.hms.availableupdate;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.camera.camera2.internal.G;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.util.AGCUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.NetWorkUtil;
import com.huawei.hms.utils.PackageManagerHelper;
import com.yandex.div2.D8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: AbsUpdateWizard.java */
/* loaded from: classes7.dex */
public abstract class p implements IBridgeActivityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<Activity> f363409a;

    /* renamed from: b, reason: collision with root package name */
    public IBridgeActivityDelegate f363410b;

    /* renamed from: c, reason: collision with root package name */
    public UpdateBean f363411c = null;

    /* renamed from: d, reason: collision with root package name */
    public q f363412d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f363413e = false;

    /* renamed from: f, reason: collision with root package name */
    public int f363414f = -1;

    /* renamed from: g, reason: collision with root package name */
    public String f363415g = null;

    /* renamed from: h, reason: collision with root package name */
    public String f363416h = null;

    /* renamed from: i, reason: collision with root package name */
    public int f363417i = 0;

    public void a(q qVar) {
    }

    public abstract void a(Class<? extends q> cls);

    public void b(q qVar) {
    }

    public void c(int i12, int i13) {
        Activity activityB = b();
        if (activityB == null || activityB.isFinishing()) {
            return;
        }
        a(i12, i13);
        Intent intent = new Intent();
        intent.putExtra(BridgeActivity.EXTRA_DELEGATE_CLASS_NAME, getClass().getName());
        intent.putExtra(BridgeActivity.EXTRA_RESULT, i12);
        activityB.setResult(-1, intent);
        activityB.finish();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.f363409a = new WeakReference<>(activity);
        if (this.f363411c == null) {
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            UpdateBean updateBean = (UpdateBean) intent.getSerializableExtra(BridgeActivity.EXTRA_DELEGATE_UPDATE_INFO);
            this.f363411c = updateBean;
            if (updateBean == null) {
                return;
            }
        }
        this.f363415g = this.f363411c.b();
        this.f363416h = this.f363411c.getClientAppName();
        this.f363417i = this.f363411c.c();
        this.f363411c.a();
        this.f363410b = null;
        this.f363413e = false;
        this.f363414f = -1;
        t.b().a(false);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        this.f363409a = null;
        a();
        if (!this.f363413e || (iBridgeActivityDelegate = this.f363410b) == null) {
            return;
        }
        iBridgeActivityDelegate.onBridgeActivityDestroy();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.f363413e && (iBridgeActivityDelegate = this.f363410b) != null) {
            iBridgeActivityDelegate.onBridgeConfigurationChanged();
            return;
        }
        q qVar = this.f363412d;
        if (qVar == null) {
            return;
        }
        Class<?> cls = qVar.getClass();
        this.f363412d.b();
        this.f363412d = null;
        t.b().a(true);
        a((Class<? extends q>) cls);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i12, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (!this.f363413e || (iBridgeActivityDelegate = this.f363410b) == null) {
            return;
        }
        iBridgeActivityDelegate.onKeyUp(i12, keyEvent);
    }

    public static String a(int i12) {
        return i12 != 0 ? i12 != 5 ? i12 != 6 ? i12 != 7 ? i12 != 8 ? "" : z.class.getName() : r.class.getName() : k0.class.getName() : b0.class.getName() : j0.class.getName();
    }

    public Activity b() {
        WeakReference<Activity> weakReference = this.f363409a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final String b(int i12, int i13) {
        String strValueOf = String.valueOf(i12);
        if (i13 == 0) {
            return G.f("0000", strValueOf);
        }
        if (i13 == 8) {
            return G.f("8000", strValueOf);
        }
        if (i13 != 5) {
            return i13 != 6 ? strValueOf : G.f("4000", strValueOf);
        }
        return G.f("5000", strValueOf);
    }

    public void a() {
        q qVar = this.f363412d;
        if (qVar == null) {
            return;
        }
        try {
            qVar.b();
            this.f363412d = null;
        } catch (IllegalStateException e12) {
            HMSLog.e("AbsUpdateWizard", "In dismissDialog, Failed to dismiss the dialog." + e12.getMessage());
        }
    }

    public void a(int i12, int i13) {
        if (!SystemUtils.isChinaROM()) {
            HMSLog.i("AbsUpdateWizard", "not ChinaROM ");
            return;
        }
        Activity activityB = b();
        if (activityB == null || activityB.isFinishing()) {
            return;
        }
        PackageManagerHelper packageManagerHelper = new PackageManagerHelper(activityB);
        boolean zIsPackageFreshInstall = packageManagerHelper.isPackageFreshInstall(this.f363415g);
        SharedPreferences sharedPreferences = activityB.getSharedPreferences(HiAnalyticsConstant.BI_TYPE_UPDATE, 0);
        if (sharedPreferences.getInt(HiAnalyticsConstant.SP_KEY_INSTALL_REPORTED, 0) == 1 && i12 == 0 && zIsPackageFreshInstall) {
            HMSLog.i("AbsUpdateWizard", "not need report");
            return;
        }
        String str = zIsPackageFreshInstall ? "1" : "2";
        int packageVersionCode = packageManagerHelper.getPackageVersionCode(this.f363415g);
        int packageVersionCode2 = packageManagerHelper.getPackageVersionCode(activityB.getPackageName());
        HashMap map = new HashMap();
        map.put("package", activityB.getPackageName());
        map.put(HiAnalyticsConstant.BI_KEY_PACKAGE_VER, String.valueOf(packageVersionCode2));
        map.put(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, this.f363415g);
        map.put(HiAnalyticsConstant.BI_KEY_TARGET_VER, String.valueOf(packageVersionCode));
        map.put(HiAnalyticsConstant.BI_KEY_TARGET_FACTORY, Build.MANUFACTURER);
        map.put(HiAnalyticsConstant.BI_KEY_TARGET_BRAND, Build.BRAND);
        map.put(HiAnalyticsConstant.BI_KEY_SDK_VER, String.valueOf(60300303));
        map.put(HiAnalyticsConstant.BI_KEY_APP_ID, AGCUtils.getAppId(activityB));
        map.put(HiAnalyticsConstant.BI_KEY_TRIGGER_API, "core.connnect");
        map.put(HiAnalyticsConstant.BI_KEY_UPDATE_TYPE, String.valueOf(i13));
        map.put(HiAnalyticsConstant.BI_KEY_NET_TYPE, String.valueOf(NetWorkUtil.getNetworkType(activityB)));
        map.put(HiAnalyticsConstant.BI_KEY_INSTALL_TYPE, str);
        map.put("service", HiAnalyticsConstant.BI_VALUE_SDK_SERVICE);
        map.put("result", b(i12, i13));
        HiAnalyticsUtils.getInstance().onEvent(activityB, HiAnalyticsConstant.BI_TYPE_UPDATE, map);
        if (i12 == 0 && zIsPackageFreshInstall) {
            sharedPreferences.edit().putInt(HiAnalyticsConstant.SP_KEY_INSTALL_REPORTED, 1).commit();
        }
    }

    public boolean a(boolean z12) {
        Activity activityB = b();
        boolean z13 = false;
        if (activityB == null) {
            return false;
        }
        ArrayList typeList = this.f363411c.getTypeList();
        if (typeList.size() > 0) {
            typeList.remove(0);
        }
        if (this.f363410b == null) {
            a(typeList);
        }
        if (this.f363410b != null) {
            z13 = true;
            this.f363413e = true;
            this.f363411c.setTypeList(typeList);
            this.f363411c.setNeedConfirm(z12);
            IBridgeActivityDelegate iBridgeActivityDelegate = this.f363410b;
            if (iBridgeActivityDelegate instanceof p) {
                ((p) iBridgeActivityDelegate).a(this.f363411c);
            }
            this.f363410b.onBridgeActivityCreate(activityB);
        }
        return z13;
    }

    public final void a(ArrayList arrayList) {
        String strA = (arrayList == null || arrayList.size() <= 0) ? null : a(((Integer) arrayList.get(0)).intValue());
        if (strA == null) {
            return;
        }
        try {
            this.f363410b = (IBridgeActivityDelegate) Class.forName(strA).asSubclass(IBridgeActivityDelegate.class).newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException e12) {
            D8.q(e12, new StringBuilder("getBridgeActivityDelegate error"), "AbsUpdateWizard");
        }
    }

    public final void a(UpdateBean updateBean) {
        this.f363411c = updateBean;
    }

    public boolean a(String str, int i12) {
        Activity activityB;
        return (TextUtils.isEmpty(str) || (activityB = b()) == null || activityB.isFinishing() || new PackageManagerHelper(activityB).getPackageVersionCode(str) < i12) ? false : true;
    }
}
