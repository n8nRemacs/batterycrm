package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.camera.camera2.internal.G;
import com.google.firebase.components.g;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.IPCTransport;
import com.huawei.hms.core.aidl.d;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.sql.Timestamp;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public abstract class BaseHmsClient implements AidlApiClient {
    private static final int BINDING = 5;
    private static final int CONNECTED = 3;
    private static final int DISCONNECTED = 1;
    private static final int DISCONNECTING = 4;
    private static final Object LOCK_CONNECT_TIMEOUT_HANDLER = new Object();
    private static final int MSG_CONN_TIMEOUT = 2;
    private static final String TAG = "BaseHmsClient";
    private String mAppID;
    private BinderAdapter mBinderAdapter;
    private final ClientSettings mClientSettings;
    private final AtomicInteger mConnStatus = new AtomicInteger(1);
    private Handler mConnectTimeoutHandler = null;
    private final ConnectionCallbacks mConnectionCallbacks;
    private final OnConnectionFailedListener mConnectionFailedListener;
    private final Context mContext;
    private volatile d mService;
    protected String sessionId;

    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 3;
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected();

        void onConnectionSuspended(int i12);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public BaseHmsClient(Context context, ClientSettings clientSettings, OnConnectionFailedListener onConnectionFailedListener, ConnectionCallbacks connectionCallbacks) {
        this.mContext = context;
        this.mClientSettings = clientSettings;
        this.mAppID = clientSettings.getAppID();
        this.mConnectionFailedListener = onConnectionFailedListener;
        this.mConnectionCallbacks = connectionCallbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bindCoreService() {
        String innerHmsPkg = this.mClientSettings.getInnerHmsPkg();
        String serviceAction = getServiceAction();
        if (innerHmsPkg.equalsIgnoreCase(this.mContext.getPackageName())) {
            String serviceActionMetadata = Util.getServiceActionMetadata(this.mContext);
            if (!TextUtils.isEmpty(serviceActionMetadata)) {
                serviceAction = serviceActionMetadata;
            }
        }
        HMSLog.i(TAG, "enter bindCoreService, packageName is " + innerHmsPkg + ", serviceAction is " + serviceAction);
        BinderAdapter binderAdapter = new BinderAdapter(this.mContext, serviceAction, innerHmsPkg);
        this.mBinderAdapter = binderAdapter;
        binderAdapter.binder(newBinderCallBack());
    }

    private void cancelConnDelayHandle() {
        synchronized (LOCK_CONNECT_TIMEOUT_HANDLER) {
            try {
                Handler handler = this.mConnectTimeoutHandler;
                if (handler != null) {
                    handler.removeMessages(2);
                    this.mConnectTimeoutHandler = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void checkAvailabilityAndConnect(int i12, boolean z12) {
        HMSLog.i(TAG, "====== HMSSDK version: 60300303 ======");
        int i13 = this.mConnStatus.get();
        g.j(i13, "Enter connect, Connection Status: ", TAG);
        if (z12 || !(i13 == 3 || i13 == 5 || i13 == 4)) {
            setConnectStatus(5);
            if (getMinApkVersion() > i12) {
                i12 = getMinApkVersion();
            }
            StringBuilder sbJ = G.j(i12, "connect minVersion:", " packageName:");
            sbJ.append(this.mClientSettings.getInnerHmsPkg());
            HMSLog.i(TAG, sbJ.toString());
            if (this.mContext.getPackageName().equals(this.mClientSettings.getInnerHmsPkg())) {
                HMSLog.i(TAG, "service packageName is same, bind core service return");
                bindCoreService();
                return;
            }
            if (!Util.isAvailableLibExist(this.mContext)) {
                int iIsHuaweiMobileServicesAvailable = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.mContext, i12);
                g.j(iIsHuaweiMobileServicesAvailable, "HuaweiApiAvailability check available result: ", TAG);
                if (iIsHuaweiMobileServicesAvailable == 0) {
                    bindCoreService();
                    return;
                } else {
                    notifyFailed(iIsHuaweiMobileServicesAvailable);
                    return;
                }
            }
            AvailableAdapter availableAdapter = new AvailableAdapter(i12);
            int iIsHuaweiMobileServicesAvailable2 = availableAdapter.isHuaweiMobileServicesAvailable(this.mContext);
            g.j(iIsHuaweiMobileServicesAvailable2, "check available result: ", TAG);
            if (iIsHuaweiMobileServicesAvailable2 == 0) {
                bindCoreService();
                return;
            }
            if (availableAdapter.isUserResolvableError(iIsHuaweiMobileServicesAvailable2)) {
                HMSLog.i(TAG, "bindCoreService3.0 fail, start resolution now.");
                resolution(availableAdapter, iIsHuaweiMobileServicesAvailable2);
            } else {
                if (availableAdapter.isUserNoticeError(iIsHuaweiMobileServicesAvailable2)) {
                    HMSLog.i(TAG, "bindCoreService3.0 fail, start notice now.");
                    notice(availableAdapter, iIsHuaweiMobileServicesAvailable2);
                    return;
                }
                HMSLog.i(TAG, "bindCoreService3.0 fail: " + iIsHuaweiMobileServicesAvailable2 + " is not resolvable.");
                notifyFailed(iIsHuaweiMobileServicesAvailable2);
            }
        }
    }

    private BinderAdapter.BinderCallBack newBinderCallBack() {
        return new BinderAdapter.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1
            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i12) {
                onBinderFailed(i12, null);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onNullBinding(ComponentName componentName) {
                BaseHmsClient.this.setConnectStatus(1);
                BaseHmsClient.this.notifyFailed(10);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                HMSLog.i(BaseHmsClient.TAG, "Enter onServiceConnected.");
                BaseHmsClient.this.mService = d.a.a(iBinder);
                if (BaseHmsClient.this.mService == null) {
                    BaseHmsClient.this.tryUnBind();
                } else {
                    BaseHmsClient.this.onConnecting();
                }
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceDisconnected(ComponentName componentName) {
                HMSLog.i(BaseHmsClient.TAG, "Enter onServiceDisconnected.");
                BaseHmsClient.this.setConnectStatus(1);
                if (BaseHmsClient.this.mConnectionCallbacks != null) {
                    BaseHmsClient.this.mConnectionCallbacks.onConnectionSuspended(1);
                }
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i12, Intent intent) {
                if (intent == null) {
                    HMSLog.i(BaseHmsClient.TAG, "onBinderFailed: intent is null!");
                    BaseHmsClient.this.notifyFailed(new ConnectionResult(10, (PendingIntent) null));
                    BaseHmsClient.this.mService = null;
                    return;
                }
                Activity activeActivity = Util.getActiveActivity(BaseHmsClient.this.getClientSettings().getCpActivity(), BaseHmsClient.this.getContext());
                if (activeActivity == null) {
                    HMSLog.i(BaseHmsClient.TAG, "onBinderFailed: return pendingIntent to kit and cp");
                    BaseHmsClient.this.notifyFailed(new ConnectionResult(10, PendingIntent.getActivity(BaseHmsClient.this.mContext, 11, intent, 67108864)));
                    BaseHmsClient.this.mService = null;
                    return;
                }
                HMSLog.i(BaseHmsClient.TAG, "onBinderFailed: SDK try to resolve and reConnect!");
                long time = new Timestamp(System.currentTimeMillis()).getTime();
                FailedBinderCallBack.getInstance().setCallBack(Long.valueOf(time), new FailedBinderCallBack.BinderCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.1.1
                    @Override // com.huawei.hms.api.FailedBinderCallBack.BinderCallBack
                    public void binderCallBack(int i13) {
                        if (i13 != 0) {
                            BaseHmsClient.this.notifyFailed(new ConnectionResult(10, (PendingIntent) null));
                            BaseHmsClient.this.mService = null;
                        }
                    }
                });
                intent.putExtra(FailedBinderCallBack.CALLER_ID, time);
                activeActivity.startActivity(intent);
            }
        };
    }

    private void notice(AvailableAdapter availableAdapter, int i12) {
        HMSLog.i(TAG, "enter notice");
        if (!getClientSettings().isHasActivity()) {
            if (i12 == 29) {
                i12 = 9;
            }
            notifyFailed(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.mContext, i12, 0)));
        } else {
            Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
            if (activeActivity != null) {
                availableAdapter.startNotice(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.2
                    @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                    public void onComplete(int i13) {
                        BaseHmsClient.this.notifyFailed(i13);
                    }
                });
            } else {
                notifyFailed(26);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFailed(int i12) {
        g.j(i12, "notifyFailed result: ", TAG);
        OnConnectionFailedListener onConnectionFailedListener = this.mConnectionFailedListener;
        if (onConnectionFailedListener != null) {
            onConnectionFailedListener.onConnectionFailed(new ConnectionResult(i12));
        }
    }

    private void resolution(AvailableAdapter availableAdapter, int i12) {
        HMSLog.i(TAG, "enter HmsCore resolution");
        if (!getClientSettings().isHasActivity()) {
            notifyFailed(new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(this.mContext, i12, 0)));
            return;
        }
        Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
        if (activeActivity != null) {
            availableAdapter.startResolution(activeActivity, new AvailableAdapter.AvailableCallBack() { // from class: com.huawei.hms.common.internal.BaseHmsClient.3
                @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                public void onComplete(int i13) {
                    if (i13 == 0) {
                        BaseHmsClient.this.bindCoreService();
                    } else {
                        BaseHmsClient.this.notifyFailed(i13);
                    }
                }
            });
        } else {
            notifyFailed(26);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectStatus(int i12) {
        this.mConnStatus.set(i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tryUnBind() {
        HMSLog.e(TAG, "Failed to get service as interface, trying to unbind.");
        this.mBinderAdapter.unBind();
        setConnectStatus(1);
        notifyFailed(10);
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(int i12) {
        checkAvailabilityAndConnect(i12, false);
    }

    public final void connectionConnected() {
        setConnectStatus(3);
        ConnectionCallbacks connectionCallbacks = this.mConnectionCallbacks;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnected();
        }
    }

    public void disconnect() {
        int i12 = this.mConnStatus.get();
        g.j(i12, "Enter disconnect, Connection Status: ", TAG);
        if (i12 != 1) {
            if (i12 == 3) {
                BinderAdapter binderAdapter = this.mBinderAdapter;
                if (binderAdapter != null) {
                    binderAdapter.unBind();
                }
                setConnectStatus(1);
                return;
            }
            if (i12 == 4 || i12 != 5) {
                return;
            }
            cancelConnDelayHandle();
            setConnectStatus(4);
        }
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        return this.mClientSettings.getApiName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.mAppID;
    }

    public ClientSettings getClientSettings() {
        return this.mClientSettings;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.mContext;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.mClientSettings.getCpID();
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.mClientSettings.getClientPackageName();
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public d getService() {
        return this.mService;
    }

    public String getServiceAction() {
        HMSPackageManager hMSPackageManager = HMSPackageManager.getInstance(this.mContext);
        return this.mClientSettings.isUseInnerHms() ? hMSPackageManager.getInnerServiceAction() : hMSPackageManager.getServiceAction();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public SubAppInfo getSubAppInfo() {
        return this.mClientSettings.getSubAppID();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        return this.mConnStatus.get() == 3 || this.mConnStatus.get() == 4;
    }

    public boolean isConnecting() {
        return this.mConnStatus.get() == 5;
    }

    public void onConnecting() {
        connectionConnected();
    }

    public void connect(int i12, boolean z12) {
        checkAvailabilityAndConnect(i12, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFailed(ConnectionResult connectionResult) {
        HMSLog.i(TAG, "notifyFailed result: " + connectionResult.getErrorCode());
        OnConnectionFailedListener onConnectionFailedListener = this.mConnectionFailedListener;
        if (onConnectionFailedListener != null) {
            onConnectionFailedListener.onConnectionFailed(connectionResult);
        }
    }
}
