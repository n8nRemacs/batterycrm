package com.huawei.hms.common.internal;

import H01.b;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hmf.tasks.l;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public class HuaweiApiManager implements Handler.Callback {
    private static final String HANDLER_NAME = "HuaweiApiHandler";
    private static final Object LOCK_OBJECT = new Object();
    private static final int MSG_RECEIVE_SEND_REQ = 4;
    private static final String TAG = "HuaweiApiManager";
    private static HuaweiApiManager mInstance;
    private final Handler mHandler;
    private final AtomicInteger mSerial = new AtomicInteger(0);
    private final Map<ConnectionManagerKey<?>, ConnectionManager<?>> mConnectionCache = new ConcurrentHashMap(5, 0.75f, 1);

    public class ConnectionManager<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {
        private final HuaweiApi<OptionsT> mApi;
        private final AnyClient mClient;
        private final ConnectionManagerKey mConnectionManagerKey;
        private ResolveClientBean mResolveClientBean;
        private final Queue<TaskApiCallbackWrapper> callbackWaitQueue = new LinkedList();
        private final Queue<TaskApiCallbackWrapper> callbackRunQueue = new LinkedList();
        private ConnectionResult mConnectionResult = null;

        public ConnectionManager(HuaweiApi<OptionsT> huaweiApi) {
            this.mApi = huaweiApi;
            this.mClient = huaweiApi.getClient(HuaweiApiManager.this.mHandler.getLooper(), this);
            this.mConnectionManagerKey = huaweiApi.getConnectionManagerKey();
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private java.lang.String errorReason(com.huawei.hms.api.ConnectionResult r5) {
            /*
                r4 = this;
                com.huawei.hms.common.HuaweiApi<OptionsT extends com.huawei.hms.api.Api$ApiOptions> r0 = r4.mApi
                android.content.Context r0 = r0.getContext()
                boolean r0 = com.huawei.hms.utils.Util.isAvailableLibExist(r0)
                r1 = 10
                r2 = 8
                r3 = -1
                if (r0 == 0) goto L3c
                int r5 = r5.getErrorCode()
                if (r5 == r3) goto L4f
                r0 = 3
                if (r5 == r0) goto L39
                if (r5 == r2) goto L4c
                if (r5 == r1) goto L49
                r0 = 13
                if (r5 == r0) goto L36
                r0 = 21
                if (r5 == r0) goto L33
                switch(r5) {
                    case 25: goto L30;
                    case 26: goto L2d;
                    case 27: goto L2a;
                    default: goto L29;
                }
            L29:
                goto L46
            L2a:
                java.lang.String r5 = "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while"
                goto L51
            L2d:
                java.lang.String r5 = "update failed, because no activity incoming, can't pop update page"
                goto L51
            L30:
                java.lang.String r5 = "failed to get update result"
                goto L51
            L33:
                java.lang.String r5 = "device is too old to be support"
                goto L51
            L36:
                java.lang.String r5 = "update cancelled"
                goto L51
            L39:
                java.lang.String r5 = "HuaWei Mobile Service is disabled"
                goto L51
            L3c:
                int r5 = r5.getErrorCode()
                if (r5 == r3) goto L4f
                if (r5 == r2) goto L4c
                if (r5 == r1) goto L49
            L46:
                java.lang.String r5 = "unknown errorReason"
                goto L51
            L49:
                java.lang.String r5 = "application configuration error, please developer check configuration"
                goto L51
            L4c:
                java.lang.String r5 = "internal error"
                goto L51
            L4f:
                java.lang.String r5 = "get update result, but has other error codes"
            L51:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.errorReason(com.huawei.hms.api.ConnectionResult):java.lang.String");
        }

        private String getTransactionId(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.mApi.getAppID(), str2) : str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void innerConnected() {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            this.mConnectionResult = null;
            this.callbackRunQueue.clear();
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                postMessage(it.next());
            }
            this.callbackWaitQueue.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void innerConnectionFailed(ConnectionResult connectionResult) {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            this.mConnectionResult = connectionResult;
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            boolean z12 = true;
            while (it.hasNext()) {
                TaskApiCallWrapper apiCallWrapper = it.next().getApiCallWrapper();
                ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Failed:" + errorReason(connectionResult) + "(" + connectionResult.getErrorCode() + ")");
                responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
                b.a(this.mApi.getContext(), responseHeader, String.valueOf(this.mApi.getKitSdkVersion()));
                if (this.mConnectionResult.getResolution() != null && z12) {
                    responseHeader.setParcelable(this.mConnectionResult.getResolution());
                    if (Util.isAvailableLibExist(this.mApi.getContext()) && this.mConnectionResult.getErrorCode() == 26) {
                        responseHeader.setResolution(CommonCode.Resolution.HAS_RESOLUTION);
                    }
                    z12 = false;
                }
                apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
            }
            this.callbackWaitQueue.clear();
            this.callbackRunQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
            HuaweiApiManager.this.mConnectionCache.remove(this.mConnectionManagerKey);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void innerConnectionSuspended(int i12) {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            HMSLog.i(HuaweiApiManager.TAG, "wait queue size = " + this.callbackWaitQueue.size());
            HMSLog.i(HuaweiApiManager.TAG, "run queue size = " + this.callbackRunQueue.size());
            Iterator<TaskApiCallbackWrapper> it = this.callbackWaitQueue.iterator();
            while (it.hasNext()) {
                sendConnectionSuspended(it.next());
            }
            Iterator<TaskApiCallbackWrapper> it2 = this.callbackRunQueue.iterator();
            while (it2.hasNext()) {
                sendConnectionSuspended(it2.next());
            }
            this.callbackWaitQueue.clear();
            this.callbackRunQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
            HuaweiApiManager.this.mConnectionCache.remove(this.mConnectionManagerKey);
        }

        private void postMessage(final TaskApiCallbackWrapper taskApiCallbackWrapper) {
            this.callbackRunQueue.add(taskApiCallbackWrapper);
            String uri = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall().getUri();
            RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.mApi.getAppID() + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + this.mApi.getSubAppID());
            requestHeader.setPkgName(this.mApi.getContext().getPackageName());
            requestHeader.setSessionId(this.mClient.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall();
            requestHeader.setTransactionId(getTransactionId(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.mApi.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.mApi.getApiLevel(), taskApiCall.getApiLevel()));
            this.mClient.post(requestHeader, taskApiCall.getRequestJson(), new AnyClient.CallBack() { // from class: com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.1
                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    AnyClient.CallBack callBack = taskApiCallbackWrapper.getCallBack();
                    if (callBack != null) {
                        callBack.onCallback(iMessageEntity, str);
                    }
                    if (Looper.myLooper() == HuaweiApiManager.this.mHandler.getLooper()) {
                        ConnectionManager.this.callbackRunQueue.remove(taskApiCallbackWrapper);
                    } else {
                        HuaweiApiManager.this.mHandler.post(new Runnable() { // from class: com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ConnectionManager.this.callbackRunQueue.remove(taskApiCallbackWrapper);
                            }
                        });
                    }
                }
            });
        }

        private void sendConnectionSuspended(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            TaskApiCallWrapper apiCallWrapper = taskApiCallbackWrapper.getApiCallWrapper();
            ResponseHeader responseHeader = new ResponseHeader(1, CommonCode.ErrorCode.CLIENT_API_INVALID, "Connection Suspended");
            responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
            apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
        }

        private TaskApiCallbackWrapper wrapperRequest(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() { // from class: com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.2
                private AtomicBoolean isFirstRsp = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    if (!(iMessageEntity instanceof ResponseHeader)) {
                        HMSLog.e(HuaweiApiManager.TAG, "header is not instance of ResponseHeader");
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                    if (responseHeader.getErrorCode() == 11) {
                        if (Looper.myLooper() == HuaweiApiManager.this.mHandler.getLooper()) {
                            ConnectionManager.this.disconnect();
                        } else {
                            HuaweiApiManager.this.mHandler.post(new Runnable() { // from class: com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    ConnectionManager.this.disconnect();
                                }
                            });
                        }
                        HMSLog.i(HuaweiApiManager.TAG, "unbind service");
                    }
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        HMSLog.e(HuaweiApiManager.TAG, "Response has resolution: " + responseHeader.getResolution());
                    }
                    if (this.isFirstRsp.compareAndSet(true, false)) {
                        b.a(ConnectionManager.this.mApi.getContext(), responseHeader, String.valueOf(ConnectionManager.this.mApi.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(ConnectionManager.this.mClient, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        public synchronized void connect(int i12) {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            if (this.mClient.isConnected()) {
                HMSLog.d(HuaweiApiManager.TAG, "client is connected");
                return;
            }
            if (this.mClient.isConnecting()) {
                HMSLog.d(HuaweiApiManager.TAG, "client is isConnecting");
                return;
            }
            if (this.mApi.getActivity() != null) {
                if (this.mResolveClientBean == null) {
                    this.mResolveClientBean = new ResolveClientBean(this.mClient, i12);
                }
                if (BindResolveClients.getInstance().isClientRegistered(this.mResolveClientBean)) {
                    HMSLog.i(HuaweiApiManager.TAG, "mResolveClientBean has already register, return!");
                    return;
                }
                BindResolveClients.getInstance().register(this.mResolveClientBean);
            }
            this.mClient.connect(i12);
        }

        public boolean disconnect() {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            this.mClient.disconnect();
            return true;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.i(HuaweiApiManager.TAG, "onConnected");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            if (Looper.myLooper() == HuaweiApiManager.this.mHandler.getLooper()) {
                innerConnected();
            } else {
                HuaweiApiManager.this.mHandler.post(new Runnable() { // from class: com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ConnectionManager.this.innerConnected();
                    }
                });
            }
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(final ConnectionResult connectionResult) {
            HMSLog.i(HuaweiApiManager.TAG, "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            if (Looper.myLooper() == HuaweiApiManager.this.mHandler.getLooper()) {
                innerConnectionFailed(connectionResult);
            } else {
                HuaweiApiManager.this.mHandler.post(new Runnable() { // from class: com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ConnectionManager.this.innerConnectionFailed(connectionResult);
                    }
                });
            }
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(final int i12) {
            HMSLog.i(HuaweiApiManager.TAG, "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            if (Looper.myLooper() == HuaweiApiManager.this.mHandler.getLooper()) {
                innerConnectionSuspended(i12);
            } else {
                HuaweiApiManager.this.mHandler.post(new Runnable() { // from class: com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.5
                    @Override // java.lang.Runnable
                    public void run() {
                        ConnectionManager.this.innerConnectionSuspended(i12);
                    }
                });
            }
        }

        public void sendRequest(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.i(HuaweiApiManager.TAG, "sendRequest");
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            TaskApiCallbackWrapper taskApiCallbackWrapperWrapperRequest = wrapperRequest(taskApiCallWrapper);
            int minApkVersion = taskApiCallWrapper.getTaskApiCall().getMinApkVersion();
            if (this.mClient.isConnected()) {
                HMSLog.i(HuaweiApiManager.TAG, "isConnected:true.");
                if (HMSPackageManager.getInstance(this.mApi.getContext()).hmsVerHigherThan(minApkVersion)) {
                    postMessage(taskApiCallbackWrapperWrapperRequest);
                    return;
                }
                disconnect();
                this.callbackWaitQueue.add(taskApiCallbackWrapperWrapperRequest);
                connect(minApkVersion);
                return;
            }
            HMSLog.i(HuaweiApiManager.TAG, "isConnected:false.");
            this.callbackWaitQueue.add(taskApiCallbackWrapperWrapperRequest);
            ConnectionResult connectionResult = this.mConnectionResult;
            if (connectionResult == null || connectionResult.getErrorCode() == 0) {
                connect(minApkVersion);
            } else {
                onConnectionFailed(this.mConnectionResult);
            }
        }
    }

    public static class TaskApiCallbackWrapper {
        private final TaskApiCallWrapper mApiCallWrapper;
        private final AnyClient.CallBack mCallBack;

        public TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.mApiCallWrapper = taskApiCallWrapper;
            this.mCallBack = callBack;
        }

        public TaskApiCallWrapper getApiCallWrapper() {
            return this.mApiCallWrapper;
        }

        public AnyClient.CallBack getCallBack() {
            return this.mCallBack;
        }
    }

    private HuaweiApiManager(Context context, Looper looper, HuaweiApiAvailability huaweiApiAvailability) {
        this.mHandler = new Handler(looper, this);
    }

    private void checkRemoveConnectCache() {
        if (this.mConnectionCache.size() == 0) {
            return;
        }
        Iterator<Map.Entry<ConnectionManagerKey<?>, ConnectionManager<?>>> it = this.mConnectionCache.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<ConnectionManagerKey<?>, ConnectionManager<?>> next = it.next();
            WeakReference<Context> weakReference = next.getKey().getmContextRef();
            if (weakReference != null) {
                ConnectionManager<?> value = next.getValue();
                Context context = weakReference.get();
                if (context == null) {
                    HMSLog.d(TAG, "checkRemoveConnectCache: context == null");
                    it.remove();
                    if (value != null) {
                        value.disconnect();
                    }
                } else if ((context instanceof Activity) && ((Activity) context).isDestroyed()) {
                    HMSLog.d(TAG, "checkRemoveConnectCache: activity.isDestroyed");
                    it.remove();
                    if (value != null) {
                        value.disconnect();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void connectAndSendRequest(HandlerMessageWrapper handlerMessageWrapper) {
        try {
            HuaweiApi<?> huaweiApi = handlerMessageWrapper.mApi;
            checkRemoveConnectCache();
            ConnectionManager<?> connectionManager = this.mConnectionCache.get(huaweiApi.getConnectionManagerKey());
            if (connectionManager == null) {
                connectionManager = new ConnectionManager<>(huaweiApi);
                this.mConnectionCache.put(huaweiApi.getConnectionManagerKey(), connectionManager);
            }
            connectionManager.sendRequest((TaskApiCallWrapper) handlerMessageWrapper.mContentWrapper);
        } catch (NullPointerException e12) {
            HMSLog.e(TAG, "<connectAndSendRequest> " + Log.getStackTraceString(e12));
            notifyCpException(handlerMessageWrapper, e12);
        }
    }

    public static HuaweiApiManager getInstance(Context context) {
        synchronized (LOCK_OBJECT) {
            try {
                if (mInstance == null) {
                    HandlerThread handlerThread = new HandlerThread(TAG);
                    handlerThread.start();
                    mInstance = new HuaweiApiManager(context.getApplicationContext(), handlerThread.getLooper(), HuaweiApiAvailability.getInstance());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void innerDisconnect(HuaweiApi<?> huaweiApi, l<Boolean> lVar) {
        ConnectionManager<?> connectionManager = this.mConnectionCache.get(huaweiApi.getConnectionManagerKey());
        if (connectionManager == null) {
            lVar.b(Boolean.FALSE);
        } else {
            lVar.b(Boolean.valueOf(connectionManager.disconnect()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.huawei.hms.common.internal.AnyClient] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void notifyCpException(com.huawei.hms.common.internal.HandlerMessageWrapper r9, java.lang.NullPointerException r10) {
        /*
            r8 = this;
            com.huawei.hms.common.internal.BaseContentWrapper r0 = r9.mContentWrapper
            boolean r1 = r0 instanceof com.huawei.hms.common.internal.TaskApiCallWrapper
            java.lang.String r2 = "HuaweiApiManager"
            r3 = 0
            if (r1 == 0) goto L61
            com.huawei.hms.common.internal.TaskApiCallWrapper r0 = (com.huawei.hms.common.internal.TaskApiCallWrapper) r0     // Catch: java.lang.Exception -> L45
            com.huawei.hms.common.HuaweiApi<?> r9 = r9.mApi     // Catch: java.lang.Exception -> L45
            android.os.Handler r1 = r8.mHandler     // Catch: java.lang.Exception -> L45
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Exception -> L45
            com.huawei.hms.common.internal.AnyClient r9 = r9.getClient(r1, r3)     // Catch: java.lang.Exception -> L45
            com.huawei.hms.common.internal.ResponseHeader r1 = new com.huawei.hms.common.internal.ResponseHeader     // Catch: java.lang.Exception -> L42
            java.lang.String r10 = android.util.Log.getStackTraceString(r10)     // Catch: java.lang.Exception -> L42
            r4 = 1
            r5 = 907135001(0x3611c819, float:2.1723156E-6)
            r1.<init>(r4, r5, r10)     // Catch: java.lang.Exception -> L42
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3e
            r10.<init>()     // Catch: java.lang.Exception -> L3e
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Exception -> L3e
            com.huawei.hmf.tasks.l r4 = r0.getTaskCompletionSource()     // Catch: java.lang.Exception -> L3b
            com.huawei.hms.common.internal.TaskApiCall r3 = r0.getTaskApiCall()     // Catch: java.lang.Exception -> L39
        L35:
            r7 = r3
            r3 = r9
            r9 = r7
            goto L65
        L39:
            r0 = move-exception
            goto L4b
        L3b:
            r0 = move-exception
            r4 = r3
            goto L4b
        L3e:
            r0 = move-exception
            r10 = r3
            r4 = r10
            goto L4b
        L42:
            r10 = move-exception
            r0 = r10
            goto L48
        L45:
            r9 = move-exception
            r0 = r9
            r9 = r3
        L48:
            r10 = r3
            r1 = r10
            r4 = r1
        L4b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "<notifyCpException> "
            r5.<init>(r6)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            com.huawei.hms.support.log.HMSLog.e(r2, r0)
            goto L35
        L61:
            r9 = r3
            r10 = r9
            r1 = r10
            r4 = r1
        L65:
            if (r3 == 0) goto L73
            if (r1 == 0) goto L73
            if (r10 == 0) goto L73
            if (r4 == 0) goto L73
            if (r9 == 0) goto L73
            r9.doExecute(r3, r1, r10, r4)
            goto L78
        L73:
            java.lang.String r9 = "<notifyCpException> isNotify is false, Can not notify CP."
            com.huawei.hms.support.log.HMSLog.e(r2, r9)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.common.internal.HuaweiApiManager.notifyCpException(com.huawei.hms.common.internal.HandlerMessageWrapper, java.lang.NullPointerException):void");
    }

    public void disconnectService(final HuaweiApi<?> huaweiApi, final l<Boolean> lVar) {
        if (Looper.myLooper() == this.mHandler.getLooper()) {
            innerDisconnect(huaweiApi, lVar);
        } else {
            this.mHandler.post(new Runnable() { // from class: com.huawei.hms.common.internal.HuaweiApiManager.1
                @Override // java.lang.Runnable
                public void run() {
                    HuaweiApiManager.this.innerDisconnect(huaweiApi, lVar);
                }
            });
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 4) {
            connectAndSendRequest((HandlerMessageWrapper) message.obj);
            return true;
        }
        HMSLog.w(TAG, "Unknown message id: " + message.what);
        return false;
    }

    public final <TOption extends Api.ApiOptions, TResult> void sendRequest(HuaweiApi<TOption> huaweiApi, TaskApiCall<? extends AnyClient, TResult> taskApiCall, l<TResult> lVar) {
        TaskApiCallWrapper taskApiCallWrapper = new TaskApiCallWrapper(taskApiCall, lVar);
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(4, new HandlerMessageWrapper(taskApiCallWrapper, this.mSerial.getAndIncrement(), huaweiApi)));
    }
}
