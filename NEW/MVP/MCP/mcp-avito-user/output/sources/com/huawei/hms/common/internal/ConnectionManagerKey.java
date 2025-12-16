package com.huawei.hms.common.internal;

import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class ConnectionManagerKey<TOption extends Api.ApiOptions> {
    private static final String TAG = "ConnectionManagerKey";
    private final Api<TOption> mApi;
    private final WeakReference<Context> mContextRef;
    private final int mHashKey;
    private final boolean mHaveOption;
    private final TOption mOption;
    private final String subAppId;

    private ConnectionManagerKey(Context context, Api<TOption> api, TOption toption, String str) {
        this.mHaveOption = false;
        WeakReference<Context> weakReference = new WeakReference<>(context);
        this.mContextRef = weakReference;
        this.mApi = api;
        this.mOption = toption;
        this.mHashKey = Objects.hashCode(weakReference.get(), api, toption);
        this.subAppId = str;
    }

    public static <TOption extends Api.ApiOptions> ConnectionManagerKey<TOption> createConnectionManagerKey(Context context, Api<TOption> api, TOption toption, String str) {
        return new ConnectionManagerKey<>(context, api, toption, str);
    }

    public final boolean equals(Object obj) {
        boolean z12;
        if (obj == this) {
            HMSLog.i(TAG, "result: true.");
            return true;
        }
        if (!(obj instanceof ConnectionManagerKey)) {
            HMSLog.i(TAG, "wrong instance, result: false.");
            return false;
        }
        ConnectionManagerKey connectionManagerKey = (ConnectionManagerKey) obj;
        WeakReference<Context> weakReference = this.mContextRef;
        if (weakReference != null && connectionManagerKey.mContextRef != null) {
            z12 = this.mHaveOption == connectionManagerKey.mHaveOption && Objects.equal(this.mApi, connectionManagerKey.mApi) && Objects.equal(this.mOption, connectionManagerKey.mOption) && Objects.equal(this.subAppId, connectionManagerKey.subAppId) && Objects.equal(this.mContextRef.get(), connectionManagerKey.mContextRef.get());
            HMSLog.i(TAG, "mContextRef is not null, result:" + z12);
            return z12;
        }
        if (weakReference != null || connectionManagerKey.mContextRef != null) {
            HMSLog.i(TAG, "result: false.");
            return false;
        }
        z12 = this.mHaveOption == connectionManagerKey.mHaveOption && Objects.equal(this.mApi, connectionManagerKey.mApi) && Objects.equal(this.mOption, connectionManagerKey.mOption) && Objects.equal(this.subAppId, connectionManagerKey.subAppId);
        HMSLog.i(TAG, "mContextRef is null, result:" + z12);
        return z12;
    }

    public WeakReference<Context> getmContextRef() {
        return this.mContextRef;
    }

    public final int hashCode() {
        return this.mHashKey;
    }

    public String toString() {
        return "ConnectionManagerKey{mApi=" + this.mApi + ", mOption=" + this.mOption + ", mHaveOption=" + this.mHaveOption + ", mHashKey=" + this.mHashKey + ", subAppId='" + this.subAppId + "', mContextRef=" + this.mContextRef + '}';
    }

    public static <TOption extends Api.ApiOptions> ConnectionManagerKey<TOption> createConnectionManagerKey(Api<TOption> api, String str) {
        return new ConnectionManagerKey<>(api, str);
    }

    private ConnectionManagerKey(Api<TOption> api, String str) {
        this.mHaveOption = true;
        this.mApi = api;
        this.mOption = null;
        this.mHashKey = System.identityHashCode(this);
        this.subAppId = str;
        this.mContextRef = null;
    }
}
