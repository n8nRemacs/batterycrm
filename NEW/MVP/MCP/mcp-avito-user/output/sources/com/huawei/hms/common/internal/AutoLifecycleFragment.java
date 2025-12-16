package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.util.SparseArray;
import com.huawei.hms.api.HuaweiApiClient;

/* loaded from: classes7.dex */
public class AutoLifecycleFragment extends Fragment {
    private static final String TAG = "HmsAutoLifecycleFrag";
    private final SparseArray<ClientInfo> mAutoClientInfoMap = new SparseArray<>();
    private boolean mStarted;

    public static class ClientInfo {
        public final HuaweiApiClient apiClient;
        protected final int clientId;

        public ClientInfo(int i12, HuaweiApiClient huaweiApiClient) {
            this.apiClient = huaweiApiClient;
            this.clientId = i12;
        }

        public void stopAutoManage() {
            this.apiClient.disconnect();
        }
    }

    public static AutoLifecycleFragment getInstance(Activity activity) {
        Preconditions.checkMainThread("Must be called on the main thread");
        try {
            AutoLifecycleFragment autoLifecycleFragment = (AutoLifecycleFragment) activity.getFragmentManager().findFragmentByTag(TAG);
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (autoLifecycleFragment != null) {
                return autoLifecycleFragment;
            }
            AutoLifecycleFragment autoLifecycleFragment2 = new AutoLifecycleFragment();
            fragmentManager.beginTransaction().add(autoLifecycleFragment2, TAG).commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
            return autoLifecycleFragment2;
        } catch (ClassCastException e12) {
            throw new IllegalStateException("Fragment with tag HmsAutoLifecycleFrag is not a AutoLifecycleFragment", e12);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.mStarted = true;
        for (int i12 = 0; i12 < this.mAutoClientInfoMap.size(); i12++) {
            this.mAutoClientInfoMap.valueAt(i12).apiClient.connect((Activity) null);
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.mStarted = false;
        for (int i12 = 0; i12 < this.mAutoClientInfoMap.size(); i12++) {
            this.mAutoClientInfoMap.valueAt(i12).apiClient.disconnect();
        }
    }

    public void startAutoMange(int i12, HuaweiApiClient huaweiApiClient) {
        Preconditions.checkNotNull(huaweiApiClient, "HuaweiApiClient instance cannot be null");
        Preconditions.checkState(this.mAutoClientInfoMap.indexOfKey(i12) < 0, "Already managing a HuaweiApiClient with this clientId: " + i12);
        this.mAutoClientInfoMap.put(i12, new ClientInfo(i12, huaweiApiClient));
        if (this.mStarted) {
            huaweiApiClient.connect((Activity) null);
        }
    }

    public void stopAutoManage(int i12) {
        ClientInfo clientInfo = this.mAutoClientInfoMap.get(i12);
        this.mAutoClientInfoMap.remove(i12);
        if (clientInfo != null) {
            clientInfo.stopAutoManage();
        }
    }
}
