package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.appcompat.app.r;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.common.internal.AutoLifecycleFragment;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.core.aidl.c;
import com.huawei.hms.core.aidl.d;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.BundleResult;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.core.ConnectService;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateKey;
import com.yandex.div2.D8;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public class HuaweiApiClientImpl extends HuaweiApiClient implements InnerApiClient, ServiceConnection {

    /* renamed from: B, reason: collision with root package name */
    private static final Object f363276B = new Object();

    /* renamed from: C, reason: collision with root package name */
    private static final Object f363277C = new Object();
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;

    /* renamed from: A, reason: collision with root package name */
    private CheckUpdateCallBack f363278A;

    /* renamed from: b, reason: collision with root package name */
    private final Context f363280b;

    /* renamed from: c, reason: collision with root package name */
    private final String f363281c;

    /* renamed from: d, reason: collision with root package name */
    private String f363282d;

    /* renamed from: e, reason: collision with root package name */
    private String f363283e;

    /* renamed from: f, reason: collision with root package name */
    private volatile com.huawei.hms.core.aidl.d f363284f;

    /* renamed from: g, reason: collision with root package name */
    private String f363285g;

    /* renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f363286h;

    /* renamed from: i, reason: collision with root package name */
    private WeakReference<Activity> f363287i;

    /* renamed from: l, reason: collision with root package name */
    private List<Scope> f363290l;

    /* renamed from: m, reason: collision with root package name */
    private List<PermissionInfo> f363291m;

    /* renamed from: n, reason: collision with root package name */
    private Map<Api<?>, Api.ApiOptions> f363292n;

    /* renamed from: o, reason: collision with root package name */
    private SubAppInfo f363293o;

    /* renamed from: s, reason: collision with root package name */
    private final ReentrantLock f363297s;

    /* renamed from: t, reason: collision with root package name */
    private final Condition f363298t;

    /* renamed from: u, reason: collision with root package name */
    private ConnectionResult f363299u;

    /* renamed from: v, reason: collision with root package name */
    private HuaweiApiClient.ConnectionCallbacks f363300v;

    /* renamed from: w, reason: collision with root package name */
    private HuaweiApiClient.OnConnectionFailedListener f363301w;

    /* renamed from: x, reason: collision with root package name */
    private Handler f363302x;

    /* renamed from: y, reason: collision with root package name */
    private Handler f363303y;

    /* renamed from: z, reason: collision with root package name */
    private CheckUpdatelistener f363304z;

    /* renamed from: a, reason: collision with root package name */
    private int f363279a = -1;

    /* renamed from: j, reason: collision with root package name */
    private boolean f363288j = false;

    /* renamed from: k, reason: collision with root package name */
    private AtomicInteger f363289k = new AtomicInteger(1);

    /* renamed from: p, reason: collision with root package name */
    private long f363294p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f363295q = 0;

    /* renamed from: r, reason: collision with root package name */
    private final Object f363296r = new Object();

    public class a implements CheckUpdateCallBack {
        public a() {
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketInstallInfo(Intent intent) {
            if (intent != null) {
                int intExtra = intent.getIntExtra(UpdateKey.MARKET_DLD_STATUS, -99);
                StringBuilder sbY = r.y(intent.getIntExtra(UpdateKey.MARKET_INSTALL_STATE, -99), intent.getIntExtra(UpdateKey.MARKET_INSTALL_TYPE, -99), "onMarketInstallInfo installState: ", ",installType: ", ",downloadCode: ");
                sbY.append(intExtra);
                HMSLog.i("HuaweiApiClientImpl", sbY.toString());
            }
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onMarketStoreError(int i12) {
            HMSLog.e("HuaweiApiClientImpl", "onMarketStoreError responseCode: " + i12);
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateInfo(Intent intent) {
            if (intent == null || HuaweiApiClientImpl.this.f363304z == null) {
                return;
            }
            try {
                int intExtra = intent.getIntExtra("status", -99);
                HMSLog.i("HuaweiApiClientImpl", "onUpdateInfo status: " + intExtra + ",failcause: " + intent.getIntExtra(UpdateKey.FAIL_CODE, -99) + ",isExit: " + intent.getBooleanExtra(UpdateKey.MUST_UPDATE, false));
                if (intExtra == 7) {
                    ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) intent.getSerializableExtra(UpdateKey.INFO);
                    if (apkUpgradeInfo != null) {
                        HMSLog.i("HuaweiApiClientImpl", "onUpdateInfo: " + apkUpgradeInfo.toString());
                    }
                    HuaweiApiClientImpl.this.f363304z.onResult(1);
                } else if (intExtra == 3) {
                    HuaweiApiClientImpl.this.f363304z.onResult(0);
                } else {
                    HuaweiApiClientImpl.this.f363304z.onResult(-1);
                }
                HuaweiApiClientImpl.this.f363304z = null;
            } catch (Exception e12) {
                D8.q(e12, new StringBuilder("intent has some error"), "HuaweiApiClientImpl");
                HuaweiApiClientImpl.this.f363304z.onResult(-1);
            }
        }

        @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
        public void onUpdateStoreError(int i12) {
            HMSLog.e("HuaweiApiClientImpl", "onUpdateStoreError responseCode: " + i12);
        }
    }

    public class b implements Handler.Callback {
        public b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 2) {
                return false;
            }
            HMSLog.e("HuaweiApiClientImpl", "In connect, bind core service time out");
            if (HuaweiApiClientImpl.this.f363289k.get() == 5) {
                HuaweiApiClientImpl.this.c(1);
                HuaweiApiClientImpl.this.b();
            }
            return true;
        }
    }

    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 3) {
                return false;
            }
            HMSLog.e("HuaweiApiClientImpl", "In connect, process time out");
            if (HuaweiApiClientImpl.this.f363289k.get() == 2) {
                HuaweiApiClientImpl.this.c(1);
                HuaweiApiClientImpl.this.b();
            }
            return true;
        }
    }

    public class d extends c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ResultCallback f363308a;

        public d(HuaweiApiClientImpl huaweiApiClientImpl, ResultCallback resultCallback) {
            this.f363308a = resultCallback;
        }

        @Override // com.huawei.hms.core.aidl.c
        public void call(com.huawei.hms.core.aidl.b bVar) {
            if (bVar == null) {
                HMSLog.i("HuaweiApiClientImpl", "Exit asyncRequest onResult -1");
                this.f363308a.onResult(new BundleResult(-1, null));
                return;
            }
            com.huawei.hms.core.aidl.e eVarA = com.huawei.hms.core.aidl.a.a(bVar.c());
            ResponseHeader responseHeader = new ResponseHeader();
            eVarA.a(bVar.f363446b, responseHeader);
            BundleResult bundleResult = new BundleResult(responseHeader.getStatusCode(), bVar.a());
            HMSLog.i("HuaweiApiClientImpl", "Exit asyncRequest onResult");
            this.f363308a.onResult(bundleResult);
        }
    }

    public static class e extends PendingResultImpl<Status, IMessageEntity> {
        public e(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        @Override // com.huawei.hms.support.api.PendingResultImpl
        public Status onComplete(IMessageEntity iMessageEntity) {
            return new Status(0);
        }
    }

    public class f implements ResultCallback<ResolveResult<ConnectResp>> {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ResolveResult f363310a;

            public a(ResolveResult resolveResult) {
                this.f363310a = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.a((ResolveResult<ConnectResp>) this.f363310a);
            }
        }

        private f() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<ConnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }

        public /* synthetic */ f(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
            this();
        }
    }

    public class g implements ResultCallback<ResolveResult<DisconnectResp>> {

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ResolveResult f363313a;

            public a(ResolveResult resolveResult) {
                this.f363313a = resolveResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                HuaweiApiClientImpl.this.b((ResolveResult<DisconnectResp>) this.f363313a);
            }
        }

        private g() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<DisconnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new a(resolveResult));
        }

        public /* synthetic */ g(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
            this();
        }
    }

    public class h implements ResultCallback<ResolveResult<JosGetNoticeResp>> {
        private h() {
        }

        @Override // com.huawei.hms.support.api.client.ResultCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onResult(ResolveResult<JosGetNoticeResp> resolveResult) {
            JosGetNoticeResp value;
            Intent noticeIntent;
            if (resolveResult == null || !resolveResult.getStatus().isSuccess() || (noticeIntent = (value = resolveResult.getValue()).getNoticeIntent()) == null || value.getStatusCode() != 0) {
                return;
            }
            HMSLog.i("HuaweiApiClientImpl", "get notice has intent.");
            Activity validActivity = Util.getValidActivity((Activity) HuaweiApiClientImpl.this.f363286h.get(), HuaweiApiClientImpl.this.getTopActivity());
            if (validActivity == null) {
                HMSLog.e("HuaweiApiClientImpl", "showNotice no valid activity!");
            } else {
                HuaweiApiClientImpl.this.f363288j = true;
                validActivity.startActivity(noticeIntent);
            }
        }

        public /* synthetic */ h(HuaweiApiClientImpl huaweiApiClientImpl, a aVar) {
            this();
        }
    }

    public HuaweiApiClientImpl(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f363297s = reentrantLock;
        this.f363298t = reentrantLock.newCondition();
        this.f363302x = null;
        this.f363303y = null;
        this.f363304z = null;
        this.f363280b = context;
        String appId = Util.getAppId(context);
        this.f363281c = appId;
        this.f363282d = appId;
        this.f363283e = Util.getCpId(context);
    }

    private int e() {
        int hmsVersion = Util.getHmsVersion(this.f363280b);
        if (hmsVersion != 0 && hmsVersion >= 20503000) {
            return hmsVersion;
        }
        int iF2 = f();
        if (h()) {
            if (iF2 < 20503000) {
                return 20503000;
            }
            return iF2;
        }
        if (iF2 < 20600000) {
            return 20600000;
        }
        return iF2;
    }

    private int f() {
        Integer num;
        int iIntValue;
        Map<Api<?>, Api.ApiOptions> apiMap = getApiMap();
        int i12 = 0;
        if (apiMap == null) {
            return 0;
        }
        Iterator<Api<?>> it = apiMap.keySet().iterator();
        while (it.hasNext()) {
            String apiName = it.next().getApiName();
            if (!TextUtils.isEmpty(apiName) && (num = HuaweiApiAvailability.getApiMap().get(apiName)) != null && (iIntValue = num.intValue()) > i12) {
                i12 = iIntValue;
            }
        }
        return i12;
    }

    private void g() {
        this.f363278A = new a();
    }

    private boolean h() {
        Map<Api<?>, Api.ApiOptions> map = this.f363292n;
        if (map == null) {
            return false;
        }
        Iterator<Api<?>> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (HuaweiApiAvailability.HMS_API_NAME_GAME.equals(it.next().getApiName())) {
                return true;
            }
        }
        return false;
    }

    private void i() {
        Handler handler = this.f363302x;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.f363302x = new Handler(Looper.getMainLooper(), new b());
        }
        this.f363302x.sendEmptyMessageDelayed(2, 5000L);
    }

    private void j() {
        synchronized (f363277C) {
            try {
                Handler handler = this.f363303y;
                if (handler != null) {
                    handler.removeMessages(3);
                } else {
                    this.f363303y = new Handler(Looper.getMainLooper(), new c());
                }
                HMSLog.d("HuaweiApiClientImpl", "sendEmptyMessageDelayed for onConnectionResult 3 seconds. the result is : " + this.f363303y.sendEmptyMessageDelayed(3, 3000L));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void k() {
        HMSLog.i("HuaweiApiClientImpl", "Enter sendConnectApiServceRequest.");
        ConnectService.connect(this, c()).setResultCallback(new f(this, null));
    }

    private void l() {
        ConnectService.disconnect(this, d()).setResultCallback(new g(this, null));
    }

    private void m() {
        HMSLog.i("HuaweiApiClientImpl", "Enter sendForceConnectApiServceRequest.");
        ConnectService.forceConnect(this, c()).setResultCallback(new f(this, null));
    }

    private void n() {
        if (this.f363288j) {
            HMSLog.i("HuaweiApiClientImpl", "Connect notice has been shown.");
        } else if (HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(this.f363280b) == 0) {
            ConnectService.getNotice(this, 0, "6.3.0.303").setResultCallback(new h(this, null));
        }
    }

    private void o() {
        Util.unBindServiceCatchException(this.f363280b, this);
        this.f363284f = null;
    }

    public int asyncRequest(Bundle bundle, String str, int i12, ResultCallback<BundleResult> resultCallback) {
        HMSLog.i("HuaweiApiClientImpl", "Enter asyncRequest.");
        if (resultCallback == null || str == null || bundle == null) {
            HMSLog.e("HuaweiApiClientImpl", "arguments is invalid.");
            return CommonCode.ErrorCode.ARGUMENTS_INVALID;
        }
        if (!innerIsConnected()) {
            HMSLog.e("HuaweiApiClientImpl", "client is unConnect.");
            return CommonCode.ErrorCode.CLIENT_API_INVALID;
        }
        com.huawei.hms.core.aidl.b bVar = new com.huawei.hms.core.aidl.b(str, i12);
        com.huawei.hms.core.aidl.e eVarA = com.huawei.hms.core.aidl.a.a(bVar.c());
        bVar.a(bundle);
        RequestHeader requestHeader = new RequestHeader(getAppID(), getPackageName(), 60300303, getSessionId());
        requestHeader.setApiNameList(getApiNameList());
        bVar.f363446b = eVarA.a(requestHeader, new Bundle());
        try {
            getService().a(bVar, new d(this, resultCallback));
            return 0;
        } catch (RemoteException e12) {
            HMSLog.e("HuaweiApiClientImpl", "remote exception:" + e12.getMessage());
            return CommonCode.ErrorCode.INTERNAL_ERROR;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener) {
        if (!Util.isAvailableLibExist(this.f363280b)) {
            HMSLog.i("HuaweiApiClientImpl", "available lib does not exist.");
            return;
        }
        HMSLog.i("HuaweiApiClientImpl", "Enter checkUpdate");
        if (checkUpdatelistener == null) {
            HMSLog.e("HuaweiApiClientImpl", "listener is null!");
            return;
        }
        if (activity == null || activity.isFinishing()) {
            HMSLog.e("HuaweiApiClientImpl", "checkUpdate, activity is illegal: " + activity);
            checkUpdatelistener.onResult(-1);
            return;
        }
        this.f363304z = checkUpdatelistener;
        if (this.f363278A == null) {
            g();
        }
        UpdateSdkAPI.checkClientOTAUpdate(activity, this.f363278A, true, 0, true);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(Activity activity) {
        HMSLog.i("HuaweiApiClientImpl", "====== HMSSDK version: 60300303 ======");
        int i12 = this.f363289k.get();
        com.google.firebase.components.g.j(i12, "Enter connect, Connection Status: ", "HuaweiApiClientImpl");
        if (i12 == 3 || i12 == 5 || i12 == 2 || i12 == 4) {
            return;
        }
        if (activity != null) {
            this.f363286h = new WeakReference<>(activity);
            this.f363287i = new WeakReference<>(activity);
        }
        this.f363282d = TextUtils.isEmpty(this.f363281c) ? Util.getAppId(this.f363280b) : this.f363281c;
        int iE2 = e();
        HMSLog.i("HuaweiApiClientImpl", "connect minVersion:" + iE2);
        HuaweiApiAvailability.setServicesVersionCode(iE2);
        int iIsHuaweiMobileServicesAvailable = HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(this.f363280b, iE2);
        com.google.firebase.components.g.j(iIsHuaweiMobileServicesAvailable, "In connect, isHuaweiMobileServicesAvailable result: ", "HuaweiApiClientImpl");
        this.f363295q = HMSPackageManager.getInstance(this.f363280b).getHmsMultiServiceVersion();
        if (iIsHuaweiMobileServicesAvailable != 0) {
            if (this.f363301w != null) {
                b(iIsHuaweiMobileServicesAvailable);
                return;
            }
            return;
        }
        c(5);
        if (this.f363284f == null) {
            a();
            return;
        }
        c(2);
        k();
        j();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connectForeground() {
        HMSLog.i("HuaweiApiClientImpl", "====== HMSSDK version: 60300303 ======");
        int i12 = this.f363289k.get();
        com.google.firebase.components.g.j(i12, "Enter forceConnect, Connection Status: ", "HuaweiApiClientImpl");
        if (i12 == 3 || i12 == 5 || i12 == 2 || i12 == 4) {
            return;
        }
        this.f363282d = TextUtils.isEmpty(this.f363281c) ? Util.getAppId(this.f363280b) : this.f363281c;
        m();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disableLifeCycleManagement(Activity activity) {
        if (this.f363279a < 0) {
            throw new IllegalStateException("disableLifeCycleManagement failed");
        }
        AutoLifecycleFragment.getInstance(activity).stopAutoManage(this.f363279a);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public PendingResult<Status> discardAndReconnect() {
        return new e(this, null, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disconnect() {
        int i12 = this.f363289k.get();
        com.google.firebase.components.g.j(i12, "Enter disconnect, Connection Status: ", "HuaweiApiClientImpl");
        if (i12 == 2) {
            c(4);
            return;
        }
        if (i12 == 3) {
            c(4);
            l();
        } else {
            if (i12 != 5) {
                return;
            }
            a(2);
            c(4);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Map<Api<?>, Api.ApiOptions> getApiMap() {
        return this.f363292n;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f363292n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.f363282d;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult getConnectionResult(Api<?> api) {
        if (isConnected()) {
            this.f363299u = null;
            return new ConnectionResult(0, (PendingIntent) null);
        }
        ConnectionResult connectionResult = this.f363299u;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.f363280b;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.f363283e;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.f363280b.getPackageName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<PermissionInfo> getPermissionInfos() {
        return this.f363291m;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<Scope> getScopes() {
        return this.f363290l;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public com.huawei.hms.core.aidl.d getService() {
        return this.f363284f;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.f363285g;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public final SubAppInfo getSubAppInfo() {
        return this.f363293o;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Activity getTopActivity() {
        WeakReference<Activity> weakReference = this.f363287i;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectedApi(Api<?> api) {
        return isConnected();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f363296r) {
            try {
                return this.f363301w == onConnectionFailedListener;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f363296r) {
            try {
                return this.f363300v == connectionCallbacks;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("blockingConnect must not be called on the UI thread");
        }
        this.f363297s.lock();
        try {
            connect((Activity) null);
            while (isConnecting()) {
                this.f363298t.await();
            }
            if (isConnected()) {
                this.f363299u = null;
                return new ConnectionResult(0, (PendingIntent) null);
            }
            ConnectionResult connectionResult = this.f363299u;
            return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, (PendingIntent) null);
        } finally {
            this.f363297s.unlock();
        }
    }

    @Override // com.huawei.hms.support.api.client.InnerApiClient
    public boolean innerIsConnected() {
        return this.f363289k.get() == 3 || this.f363289k.get() == 4;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient, com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        if (this.f363295q == 0) {
            this.f363295q = HMSPackageManager.getInstance(this.f363280b).getHmsMultiServiceVersion();
        }
        if (this.f363295q >= 20504000) {
            return innerIsConnected();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f363294p;
        if (jCurrentTimeMillis > 0 && jCurrentTimeMillis < 300000) {
            return innerIsConnected();
        }
        if (!innerIsConnected()) {
            return false;
        }
        Status status = ((ResolveResult) ConnectService.checkconnect(this, new CheckConnectInfo()).awaitOnAnyThread(2000L, TimeUnit.MILLISECONDS)).getStatus();
        if (status.isSuccess()) {
            this.f363294p = System.currentTimeMillis();
            return true;
        }
        int statusCode = status.getStatusCode();
        com.google.firebase.components.g.j(statusCode, "isConnected is false, statuscode:", "HuaweiApiClientImpl");
        if (statusCode == 907135004) {
            return false;
        }
        o();
        c(1);
        this.f363294p = System.currentTimeMillis();
        return false;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean isConnecting() {
        int i12 = this.f363289k.get();
        return i12 == 2 || i12 == 5;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onPause(Activity activity) {
        HMSLog.i("HuaweiApiClientImpl", "onPause");
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onResume(Activity activity) {
        if (activity != null) {
            HMSLog.i("HuaweiApiClientImpl", "onResume");
            this.f363287i = new WeakReference<>(activity);
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.i("HuaweiApiClientImpl", "Enter onServiceConnected.");
        a(2);
        this.f363284f = d.a.a(iBinder);
        if (this.f363284f != null) {
            if (this.f363289k.get() == 5) {
                c(2);
                k();
                j();
                return;
            } else {
                if (this.f363289k.get() != 3) {
                    o();
                    return;
                }
                return;
            }
        }
        HMSLog.e("HuaweiApiClientImpl", "In onServiceConnected, mCoreService must not be null.");
        o();
        c(1);
        if (this.f363301w != null) {
            WeakReference<Activity> weakReference = this.f363286h;
            ConnectionResult connectionResult = new ConnectionResult(10, (weakReference == null || weakReference.get() == null) ? null : HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f363286h.get(), 10));
            this.f363301w.onConnectionFailed(connectionResult);
            this.f363299u = connectionResult;
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.i("HuaweiApiClientImpl", "Enter onServiceDisconnected.");
        this.f363284f = null;
        c(1);
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f363300v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnectionSuspended(1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void reconnect() {
        disconnect();
        connect((Activity) null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, "onConnectionFailedListener should not be null");
        synchronized (this.f363296r) {
            try {
                if (this.f363301w != onConnectionFailedListener) {
                    HMSLog.w("HuaweiApiClientImpl", "unregisterConnectionFailedListener: this onConnectionFailedListener has not been registered");
                } else {
                    this.f363301w = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, "connectionCallbacksListener should not be null");
        synchronized (this.f363296r) {
            try {
                if (this.f363300v != connectionCallbacks) {
                    HMSLog.w("HuaweiApiClientImpl", "unregisterConnectionCallback: this connectionCallbacksListener has not been registered");
                } else {
                    this.f363300v = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void setApiMap(Map<Api<?>, Api.ApiOptions> map) {
        this.f363292n = map;
    }

    public void setAutoLifecycleClientId(int i12) {
        this.f363279a = i12;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionCallbacks(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f363300v = connectionCallbacks;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionFailedListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f363301w = onConnectionFailedListener;
    }

    public void setHasShowNotice(boolean z12) {
        this.f363288j = z12;
    }

    public void setPermissionInfos(List<PermissionInfo> list) {
        this.f363291m = list;
    }

    public void setScopes(List<Scope> list) {
        this.f363290l = list;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.i("HuaweiApiClientImpl", "Enter setSubAppInfo");
        if (subAppInfo == null) {
            HMSLog.e("HuaweiApiClientImpl", "subAppInfo is null");
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.e("HuaweiApiClientImpl", "subAppId is empty");
            return false;
        }
        if (subAppID.equals(TextUtils.isEmpty(this.f363281c) ? Util.getAppId(this.f363280b) : this.f363281c)) {
            HMSLog.e("HuaweiApiClientImpl", "subAppId is host appid");
            return false;
        }
        this.f363293o = new SubAppInfo(subAppInfo);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i12) {
        this.f363289k.set(i12);
        if (i12 == 1 || i12 == 3 || i12 == 2) {
            this.f363297s.lock();
            try {
                this.f363298t.signalAll();
            } finally {
                this.f363297s.unlock();
            }
        }
    }

    private DisconnectInfo d() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f363292n;
        if (map != null) {
            Iterator<Api<?>> it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getApiName());
            }
        }
        return new DisconnectInfo(this.f363290l, arrayList);
    }

    private void b(int i12) {
        PendingIntent resolveErrorPendingIntent;
        WeakReference<Activity> weakReference = this.f363286h;
        if (weakReference == null || weakReference.get() == null) {
            resolveErrorPendingIntent = null;
        } else {
            resolveErrorPendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f363286h.get(), i12);
            com.google.firebase.components.g.j(i12, "connect 2.0 fail: ", "HuaweiApiClientImpl");
        }
        ConnectionResult connectionResult = new ConnectionResult(i12, resolveErrorPendingIntent);
        this.f363301w.onConnectionFailed(connectionResult);
        this.f363299u = connectionResult;
    }

    private void a() {
        Intent intent = new Intent(HMSPackageManager.getInstance(this.f363280b).getServiceAction());
        HMSPackageManager.getInstance(this.f363280b).refreshForMultiService();
        intent.setPackage(HMSPackageManager.getInstance(this.f363280b).getHMSPackageNameForMultiService());
        synchronized (f363276B) {
            try {
                if (this.f363280b.bindService(intent, this, 1)) {
                    i();
                    return;
                }
                c(1);
                HMSLog.e("HuaweiApiClientImpl", "In connect, bind core service fail");
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private ConnectInfo c() throws PackageManager.NameNotFoundException {
        String packageSignature = new PackageManagerHelper(this.f363280b).getPackageSignature(this.f363280b.getPackageName());
        if (packageSignature == null) {
            packageSignature = "";
        }
        SubAppInfo subAppInfo = this.f363293o;
        return new ConnectInfo(getApiNameList(), this.f363290l, packageSignature, subAppInfo == null ? null : subAppInfo.getSubAppID());
    }

    private void c(ResolveResult<ConnectResp> resolveResult) {
        if (resolveResult.getValue() != null) {
            ProtocolNegotiate.getInstance().negotiate(resolveResult.getValue().protocolVersion);
        }
        c(3);
        this.f363299u = null;
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f363300v;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnected();
        }
        if (this.f363286h != null) {
            n();
        }
        for (Map.Entry<Api<?>, Api.ApiOptions> entry : getApiMap().entrySet()) {
            if (entry.getKey().getmConnetctPostList() != null && !entry.getKey().getmConnetctPostList().isEmpty()) {
                HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult, get the ConnetctPostList ");
                for (ConnectionPostProcessor connectionPostProcessor : entry.getKey().getmConnetctPostList()) {
                    HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult, processor.run");
                    connectionPostProcessor.run(this, this.f363286h);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        o();
        if (this.f363301w != null) {
            int i12 = UIUtil.isBackground(this.f363280b) ? 7 : 6;
            WeakReference<Activity> weakReference = this.f363286h;
            ConnectionResult connectionResult = new ConnectionResult(i12, (weakReference == null || weakReference.get() == null) ? null : HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f363286h.get(), i12));
            this.f363301w.onConnectionFailed(connectionResult);
            this.f363299u = connectionResult;
        }
    }

    private void a(int i12) {
        if (i12 == 2) {
            synchronized (f363276B) {
                try {
                    Handler handler = this.f363302x;
                    if (handler != null) {
                        handler.removeMessages(i12);
                        this.f363302x = null;
                    }
                } finally {
                }
            }
        }
        if (i12 == 3) {
            synchronized (f363277C) {
                try {
                    Handler handler2 = this.f363303y;
                    if (handler2 != null) {
                        handler2.removeMessages(i12);
                        this.f363303y = null;
                    }
                } finally {
                }
            }
        }
        synchronized (f363276B) {
            try {
                Handler handler3 = this.f363302x;
                if (handler3 != null) {
                    handler3.removeMessages(2);
                    this.f363302x = null;
                }
            } finally {
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect(long j12, TimeUnit timeUnit) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.f363297s.lock();
            try {
                connect((Activity) null);
                long nanos = timeUnit.toNanos(j12);
                while (isConnecting()) {
                    if (nanos <= 0) {
                        disconnect();
                        return new ConnectionResult(14, (PendingIntent) null);
                    }
                    nanos = this.f363298t.awaitNanos(nanos);
                }
                if (isConnected()) {
                    this.f363299u = null;
                    return new ConnectionResult(0, (PendingIntent) null);
                }
                ConnectionResult connectionResult = this.f363299u;
                return connectionResult != null ? connectionResult : new ConnectionResult(13, (PendingIntent) null);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, (PendingIntent) null);
            } finally {
                this.f363297s.unlock();
            }
        }
        throw new IllegalStateException("blockingConnect must not be called on the UI thread");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ResolveResult<DisconnectResp> resolveResult) {
        HMSLog.i("HuaweiApiClientImpl", "Enter onDisconnectionResult, disconnect from server result: " + resolveResult.getStatus().getStatusCode());
        o();
        c(1);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(int i12) {
        connect((Activity) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ResolveResult<ConnectResp> resolveResult) {
        HMSLog.i("HuaweiApiClientImpl", "Enter onConnectionResult");
        if (this.f363284f != null && this.f363289k.get() == 2) {
            a(3);
            ConnectResp value = resolveResult.getValue();
            if (value != null) {
                this.f363285g = value.sessionId;
            }
            SubAppInfo subAppInfo = this.f363293o;
            PendingIntent resolveErrorPendingIntent = null;
            String subAppID = subAppInfo == null ? null : subAppInfo.getSubAppID();
            if (!TextUtils.isEmpty(subAppID)) {
                this.f363282d = subAppID;
            }
            int statusCode = resolveResult.getStatus().getStatusCode();
            com.google.firebase.components.g.j(statusCode, "Enter onConnectionResult, connect to server result: ", "HuaweiApiClientImpl");
            if (Status.SUCCESS.equals(resolveResult.getStatus())) {
                c(resolveResult);
                return;
            }
            if (resolveResult.getStatus() != null && resolveResult.getStatus().getStatusCode() == 1001) {
                o();
                c(1);
                HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f363300v;
                if (connectionCallbacks != null) {
                    connectionCallbacks.onConnectionSuspended(3);
                    return;
                }
                return;
            }
            o();
            c(1);
            if (this.f363301w != null) {
                WeakReference<Activity> weakReference = this.f363286h;
                if (weakReference != null && weakReference.get() != null) {
                    resolveErrorPendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.f363286h.get(), statusCode);
                }
                ConnectionResult connectionResult = new ConnectionResult(statusCode, resolveErrorPendingIntent);
                this.f363301w.onConnectionFailed(connectionResult);
                this.f363299u = connectionResult;
                return;
            }
            return;
        }
        HMSLog.e("HuaweiApiClientImpl", "Invalid onConnectionResult");
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void print(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
