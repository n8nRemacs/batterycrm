package com.huawei.hms.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.appcompat.app.r;
import androidx.media3.common.C23088b;
import androidx.media3.exoplayer.analytics.m;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class HMSPackageManager {

    /* renamed from: l, reason: collision with root package name */
    public static HMSPackageManager f363693l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f363694m = new Object();

    /* renamed from: n, reason: collision with root package name */
    public static final Object f363695n = new Object();

    /* renamed from: o, reason: collision with root package name */
    public static final Object f363696o = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Context f363697a;

    /* renamed from: b, reason: collision with root package name */
    public final PackageManagerHelper f363698b;

    /* renamed from: c, reason: collision with root package name */
    public String f363699c;

    /* renamed from: d, reason: collision with root package name */
    public String f363700d;

    /* renamed from: e, reason: collision with root package name */
    public int f363701e;

    /* renamed from: f, reason: collision with root package name */
    public String f363702f;

    /* renamed from: g, reason: collision with root package name */
    public String f363703g;

    /* renamed from: h, reason: collision with root package name */
    public String f363704h;

    /* renamed from: i, reason: collision with root package name */
    public int f363705i;

    /* renamed from: j, reason: collision with root package name */
    public int f363706j;

    /* renamed from: k, reason: collision with root package name */
    public long f363707k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("HMSPackageManager", "enter asyncOnceCheckMDMState");
            Iterator<ResolveInfo> it = HMSPackageManager.this.f363697a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128).iterator();
            while (it.hasNext()) {
                if ("com.huawei.hwid".equals(it.next().serviceInfo.applicationInfo.packageName)) {
                    HMSPackageManager.this.c();
                }
            }
            HMSLog.i("HMSPackageManager", "quit asyncOnceCheckMDMState");
        }
    }

    public static class b implements Comparable<b> {

        /* renamed from: a, reason: collision with root package name */
        public String f363709a;

        /* renamed from: b, reason: collision with root package name */
        public String f363710b;

        /* renamed from: c, reason: collision with root package name */
        public String f363711c;

        /* renamed from: d, reason: collision with root package name */
        public String f363712d;

        /* renamed from: e, reason: collision with root package name */
        public String f363713e;

        /* renamed from: f, reason: collision with root package name */
        public Long f363714f;

        public b(String str, String str2, String str3, String str4, String str5, long j12) {
            this.f363709a = str;
            this.f363710b = str2;
            this.f363711c = str3;
            this.f363712d = str4;
            this.f363713e = str5;
            this.f363714f = Long.valueOf(j12);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return TextUtils.equals(this.f363713e, bVar.f363713e) ? this.f363714f.compareTo(bVar.f363714f) : this.f363713e.compareTo(bVar.f363713e);
        }
    }

    public HMSPackageManager(Context context) {
        this.f363697a = context;
        this.f363698b = new PackageManagerHelper(context);
    }

    public static HMSPackageManager getInstance(Context context) {
        synchronized (f363694m) {
            try {
                if (f363693l == null) {
                    if (context.getApplicationContext() != null) {
                        f363693l = new HMSPackageManager(context.getApplicationContext());
                    } else {
                        f363693l = new HMSPackageManager(context);
                    }
                    f363693l.j();
                    f363693l.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f363693l;
    }

    public final int c() {
        synchronized (f363696o) {
            try {
                HMSLog.i("HMSPackageManager", "enter checkHmsIsSpoof");
                long packageFirstInstallTime = this.f363698b.getPackageFirstInstallTime("com.huawei.hwid");
                if (this.f363706j != 3 && this.f363707k == packageFirstInstallTime) {
                    HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof cached state: " + a(this.f363706j));
                    return this.f363706j;
                }
                this.f363706j = b() ? 2 : 1;
                this.f363707k = this.f363698b.getPackageFirstInstallTime("com.huawei.hwid");
                HMSLog.i("HMSPackageManager", "quit checkHmsIsSpoof state: " + a(this.f363706j));
                return this.f363706j;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d() {
        synchronized (f363695n) {
            this.f363702f = null;
            this.f363703g = null;
            this.f363704h = null;
            this.f363705i = 0;
        }
    }

    public final void e() {
        synchronized (f363695n) {
            this.f363699c = null;
            this.f363700d = null;
            this.f363701e = 0;
        }
    }

    public final Pair<String, String> f() throws PackageManager.NameNotFoundException {
        List<ResolveInfo> listQueryIntentServices = this.f363697a.getPackageManager().queryIntentServices(new Intent("com.huawei.hms.core.aidlservice"), 128);
        if (listQueryIntentServices.size() == 0) {
            return null;
        }
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            String str = serviceInfo.applicationInfo.packageName;
            Bundle bundle = serviceInfo.metaData;
            if (bundle == null) {
                HMSLog.e("HMSPackageManager", "skip package " + str + " for metadata is null");
            } else if (!bundle.containsKey("hms_app_signer")) {
                HMSLog.e("HMSPackageManager", "skip package " + str + " for no signer");
            } else if (bundle.containsKey("hms_app_cert_chain")) {
                String packageSignature = this.f363698b.getPackageSignature(str);
                if (a(r.r(str, ContainerUtils.FIELD_DELIMITER, packageSignature), bundle.getString("hms_app_signer"), bundle.getString("hms_app_cert_chain"))) {
                    return new Pair<>(str, packageSignature);
                }
                HMSLog.e("HMSPackageManager", "checkSigner failed");
            } else {
                HMSLog.e("HMSPackageManager", "skip package " + str + " for no cert chain");
            }
        }
        return null;
    }

    public final Pair<String, String> g() throws PackageManager.NameNotFoundException {
        Pair<String, String> pairF = f();
        if (pairF != null) {
            HMSLog.i("HMSPackageManager", "aidlService pkgName: " + ((String) pairF.first));
            this.f363704h = "com.huawei.hms.core.aidlservice";
            return pairF;
        }
        ArrayList<b> arrayListH = h();
        if (arrayListH == null) {
            HMSLog.e("HMSPackageManager", "PackagePriorityInfo list is null");
            return null;
        }
        Iterator<b> it = arrayListH.iterator();
        while (it.hasNext()) {
            b next = it.next();
            String str = next.f363709a;
            String str2 = next.f363710b;
            String str3 = next.f363711c;
            String str4 = next.f363712d;
            String packageSignature = this.f363698b.getPackageSignature(str);
            if (a(str + ContainerUtils.FIELD_DELIMITER + packageSignature + ContainerUtils.FIELD_DELIMITER + str2, str3, str4)) {
                StringBuilder sbB = C23088b.b("result: ", str, ", ", str2, ", ");
                sbB.append(next.f363714f);
                HMSLog.i("HMSPackageManager", sbB.toString());
                this.f363704h = PackageConstants.GENERAL_SERVICES_ACTION;
                b(str2);
                return new Pair<>(str, packageSignature);
            }
        }
        return null;
    }

    public String getHMSFingerprint() {
        String str = this.f363700d;
        return str == null ? "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05" : str;
    }

    public String getHMSPackageName() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageName");
        refresh();
        String str = this.f363699c;
        if (str != null) {
            if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f363698b.getPackageStates(str))) {
                HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
                i();
            }
            String str2 = this.f363699c;
            if (str2 != null) {
                return str2;
            }
        }
        if (!PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f363698b.getPackageStates("com.huawei.hwid"))) {
            "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05".equalsIgnoreCase(this.f363698b.getPackageSignature("com.huawei.hwid"));
        }
        return "com.huawei.hwid";
    }

    public String getHMSPackageNameForMultiService() {
        HMSLog.i("HMSPackageManager", "Enter getHMSPackageNameForMultiService");
        refreshForMultiService();
        String str = this.f363702f;
        if (str == null) {
            return "com.huawei.hwid";
        }
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(this.f363698b.getPackageStates(str))) {
            HMSLog.i("HMSPackageManager", "The package name is not installed and needs to be refreshed again");
            j();
        }
        String str2 = this.f363702f;
        return str2 != null ? str2 : "com.huawei.hwid";
    }

    public PackageManagerHelper.PackageStates getHMSPackageStates() {
        synchronized (f363694m) {
            refresh();
            PackageManagerHelper.PackageStates packageStates = this.f363698b.getPackageStates(this.f363699c);
            PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
            if (packageStates == packageStates2) {
                e();
                return packageStates2;
            }
            if ("com.huawei.hwid".equals(this.f363699c) && c() == 1) {
                return PackageManagerHelper.PackageStates.SPOOF;
            }
            return (packageStates != PackageManagerHelper.PackageStates.ENABLED || this.f363700d.equals(this.f363698b.getPackageSignature(this.f363699c))) ? packageStates : packageStates2;
        }
    }

    public PackageManagerHelper.PackageStates getHMSPackageStatesForMultiService() {
        synchronized (f363694m) {
            refreshForMultiService();
            PackageManagerHelper.PackageStates packageStates = this.f363698b.getPackageStates(this.f363702f);
            PackageManagerHelper.PackageStates packageStates2 = PackageManagerHelper.PackageStates.NOT_INSTALLED;
            if (packageStates == packageStates2) {
                d();
                return packageStates2;
            }
            if ("com.huawei.hwid".equals(this.f363702f) && c() == 1) {
                return PackageManagerHelper.PackageStates.SPOOF;
            }
            return (packageStates != PackageManagerHelper.PackageStates.ENABLED || this.f363703g.equals(this.f363698b.getPackageSignature(this.f363702f))) ? packageStates : packageStates2;
        }
    }

    public int getHmsMultiServiceVersion() {
        return this.f363698b.getPackageVersionCode(getHMSPackageNameForMultiService());
    }

    public int getHmsVersionCode() {
        return this.f363698b.getPackageVersionCode(getHMSPackageName());
    }

    public String getInnerServiceAction() {
        return PackageConstants.INTERNAL_SERVICES_ACTION;
    }

    public String getServiceAction() {
        return !TextUtils.isEmpty(this.f363704h) ? this.f363704h : "com.huawei.hms.core.aidlservice";
    }

    public final ArrayList<b> h() throws PackageManager.NameNotFoundException {
        List<ResolveInfo> listQueryIntentServices = this.f363697a.getPackageManager().queryIntentServices(new Intent(PackageConstants.GENERAL_SERVICES_ACTION), 128);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            HMSLog.e("HMSPackageManager", "resolveInfoList is null or empty");
            return null;
        }
        ArrayList<b> arrayList = new ArrayList<>();
        for (ResolveInfo resolveInfo : listQueryIntentServices) {
            String str = resolveInfo.serviceInfo.applicationInfo.packageName;
            long packageFirstInstallTime = this.f363698b.getPackageFirstInstallTime(str);
            Bundle bundle = resolveInfo.serviceInfo.metaData;
            if (bundle == null) {
                HMSLog.e("HMSPackageManager", "package " + str + " get metaData is null");
            } else {
                String strA = a(bundle, "hms_app_checker_config");
                String strA2 = a(strA);
                if (TextUtils.isEmpty(strA2)) {
                    HMSLog.i("HMSPackageManager", "get priority fail. hmsCheckerCfg: " + strA);
                } else {
                    String strA3 = a(bundle, "hms_app_signer_v2");
                    if (TextUtils.isEmpty(strA3)) {
                        HMSLog.i("HMSPackageManager", "get signerV2 fail.");
                    } else {
                        String strA4 = a(bundle, "hms_app_cert_chain");
                        if (TextUtils.isEmpty(strA4)) {
                            HMSLog.i("HMSPackageManager", "get certChain fail.");
                        } else {
                            StringBuilder sbB = C23088b.b("add: ", str, ", ", strA, ", ");
                            sbB.append(packageFirstInstallTime);
                            HMSLog.i("HMSPackageManager", sbB.toString());
                            arrayList.add(new b(str, strA, strA3, strA4, strA2, packageFirstInstallTime));
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public boolean hmsVerHigherThan(int i12) {
        if (this.f363701e >= i12 || !k()) {
            return true;
        }
        int packageVersionCode = this.f363698b.getPackageVersionCode(getHMSPackageName());
        this.f363701e = packageVersionCode;
        return packageVersionCode >= i12;
    }

    public final void i() {
        synchronized (f363695n) {
            try {
                Pair<String, String> pairF = f();
                if (pairF == null) {
                    HMSLog.e("HMSPackageManager", "<initHmsPackageInfo> Failed to find HMS apk");
                    e();
                    return;
                }
                this.f363699c = (String) pairF.first;
                this.f363700d = (String) pairF.second;
                this.f363701e = this.f363698b.getPackageVersionCode(getHMSPackageName());
                HMSLog.i("HMSPackageManager", "<initHmsPackageInfo> Succeed to find HMS apk: " + this.f363699c + " version: " + this.f363701e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean isApkUpdateNecessary(int i12) {
        int hmsVersionCode = getHmsVersionCode();
        HMSLog.i("HMSPackageManager", "current versionCode:" + hmsVersionCode + ", minimum version requirements: " + i12);
        return k() && hmsVersionCode < i12;
    }

    public final void j() {
        synchronized (f363695n) {
            try {
                Pair<String, String> pairG = g();
                if (pairG == null) {
                    HMSLog.e("HMSPackageManager", "<initHmsPackageInfoForMultiService> Failed to find HMS apk");
                    d();
                    return;
                }
                this.f363702f = (String) pairG.first;
                this.f363703g = (String) pairG.second;
                this.f363705i = this.f363698b.getPackageVersionCode(getHMSPackageNameForMultiService());
                HMSLog.i("HMSPackageManager", "<initHmsPackageInfoForMultiService> Succeed to find HMS apk: " + this.f363702f + " version: " + this.f363705i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean k() {
        Bundle bundle;
        PackageManager packageManager = this.f363697a.getPackageManager();
        if (packageManager == null) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to get 'PackageManager' instance.");
            return true;
        }
        try {
        } catch (PackageManager.NameNotFoundException unused) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.");
        } catch (RuntimeException e12) {
            HMSLog.e("HMSPackageManager", "In isMinApkVersionEffective, Failed to read meta data for HMSCore API level.", e12);
        }
        if (TextUtils.isEmpty(this.f363704h) || (!this.f363704h.equals(PackageConstants.GENERAL_SERVICES_ACTION) && !this.f363704h.equals(PackageConstants.INTERNAL_SERVICES_ACTION))) {
            ApplicationInfo applicationInfo = packageManager.getPackageInfo(getHMSPackageName(), 128).applicationInfo;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("com.huawei.hms.kit.api_level:hmscore") && (getHmsVersionCode() >= 50000000 || getHmsVersionCode() <= 19999999)) {
                HMSLog.i("HMSPackageManager", "MinApkVersion is disabled.");
                return false;
            }
            return true;
        }
        HMSLog.i("HMSPackageManager", "action = " + this.f363704h + " exist");
        return false;
    }

    public void refresh() {
        if (TextUtils.isEmpty(this.f363699c) || TextUtils.isEmpty(this.f363700d)) {
            i();
        }
    }

    public void refreshForMultiService() {
        if (TextUtils.isEmpty(this.f363702f) || TextUtils.isEmpty(this.f363703g)) {
            j();
        }
    }

    public void resetMultiServiceState() {
        d();
    }

    public final String a(Bundle bundle, String str) {
        if (bundle.containsKey(str)) {
            return bundle.getString(str);
        }
        HMSLog.e("HMSPackageManager", "no " + str + " in metaData");
        return null;
    }

    public final void b(String str) {
        String strA = a(str);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        strA.substring(9);
    }

    public final String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("priority=");
        if (iIndexOf == -1) {
            HMSLog.e("HMSPackageManager", "get indexOfIdentifier -1");
            return null;
        }
        int iIndexOf2 = str.indexOf(",", iIndexOf);
        if (iIndexOf2 == -1) {
            iIndexOf2 = str.length();
        }
        return str.substring(iIndexOf, iIndexOf2);
    }

    public final boolean b() {
        String hmsPath = ReadApkFileUtil.getHmsPath(this.f363697a);
        if (hmsPath == null) {
            HMSLog.i("HMSPackageManager", "hmsPath is null!");
            return false;
        }
        if (!ReadApkFileUtil.isCertFound(hmsPath)) {
            HMSLog.i("HMSPackageManager", "NO huawer.cer in HMS!");
            return false;
        }
        if (!ReadApkFileUtil.checkSignature()) {
            HMSLog.i("HMSPackageManager", "checkSignature fail!");
            return false;
        }
        if (ReadApkFileUtil.verifyApkHash(hmsPath)) {
            return true;
        }
        HMSLog.i("HMSPackageManager", "verifyApkHash fail!");
        return false;
    }

    public final boolean a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            List<X509Certificate> listB = com.huawei.hms.device.a.b(str3);
            if (listB.size() == 0) {
                HMSLog.e("HMSPackageManager", "certChain is empty");
                return false;
            }
            if (!com.huawei.hms.device.a.a(com.huawei.hms.device.a.a(this.f363697a), listB)) {
                HMSLog.e("HMSPackageManager", "failed to verify cert chain");
                return false;
            }
            X509Certificate x509Certificate = (X509Certificate) m.h(1, listB);
            if (!com.huawei.hms.device.a.a(x509Certificate, "Huawei CBG HMS")) {
                HMSLog.e("HMSPackageManager", "CN is invalid");
                return false;
            }
            if (!com.huawei.hms.device.a.b(x509Certificate, "Huawei CBG Cloud Security Signer")) {
                HMSLog.e("HMSPackageManager", "OU is invalid");
                return false;
            }
            if (com.huawei.hms.device.a.a(x509Certificate, str, str2)) {
                return true;
            }
            HMSLog.e("HMSPackageManager", "signature is invalid: " + str);
            return false;
        }
        HMSLog.e("HMSPackageManager", "args is invalid");
        return false;
    }

    public final void a() {
        new Thread(new a(), "Thread-asyncOnceCheckMDMState").start();
    }

    public static String a(int i12) {
        if (i12 == 1) {
            return "SPOOFED";
        }
        if (i12 == 2) {
            return "SUCCESS";
        }
        if (i12 == 3) {
            return "UNCHECKED";
        }
        HMSLog.e("HMSPackageManager", "invalid checkMDM state: " + i12);
        return "";
    }
}
