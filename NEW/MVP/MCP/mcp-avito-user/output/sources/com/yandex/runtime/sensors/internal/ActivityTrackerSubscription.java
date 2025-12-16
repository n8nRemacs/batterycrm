package com.yandex.runtime.sensors.internal;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.C36688g;
import com.google.android.gms.location.ActivityRecognition;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.DetectedActivity;
import com.google.android.gms.location.InterfaceC36780a;
import com.google.android.gms.tasks.InterfaceC37023f;
import com.google.android.gms.tasks.InterfaceC37024g;
import com.google.android.gms.tasks.Task;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.Runtime;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class ActivityTrackerSubscription {
    private static final String BROADCAST_ACTION = "activityRecognitionAction";
    private static final int FLAG_MUTABLE = 33554432;
    private static final long MS_IN_SEC = 1000;
    private static final String TAG = "com.yandex.runtime.sensors.internal.ActivityTrackerSubscription";
    private BroadcastReceiver broadcastReceiver_;
    private InterfaceC36780a client_;
    private boolean connected_;
    private NativeObject nativeObject_;
    private PendingIntent pendingIntent_;

    public class ActivityTrackerBroadcastReceiver extends BroadcastReceiver {
        private ActivityTrackerBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (ActivityRecognitionResult.hasResult(intent)) {
                ActivityTrackerSubscription.this.handle(ActivityRecognitionResult.extractResult(intent));
            }
        }
    }

    public ActivityTrackerSubscription(NativeObject nativeObject, int i12) {
        this.connected_ = false;
        this.nativeObject_ = nativeObject;
        Intent intent = new Intent();
        intent.setAction(BROADCAST_ACTION);
        intent.setPackage(Runtime.getApplicationContext().getPackageName());
        this.pendingIntent_ = PendingIntent.getBroadcast(Runtime.getApplicationContext(), 0, intent, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        this.client_ = ActivityRecognition.getClient(Runtime.getApplicationContext());
        this.broadcastReceiver_ = new ActivityTrackerBroadcastReceiver();
        Task<Void> taskRequestActivityUpdates = this.client_.requestActivityUpdates(i12 * MS_IN_SEC, this.pendingIntent_);
        taskRequestActivityUpdates.g(new InterfaceC37024g() { // from class: com.yandex.runtime.sensors.internal.ActivityTrackerSubscription.1
            @Override // com.google.android.gms.tasks.InterfaceC37024g
            public void onSuccess(Object obj) {
                String unused = ActivityTrackerSubscription.TAG;
            }
        });
        taskRequestActivityUpdates.e(new InterfaceC37023f() { // from class: com.yandex.runtime.sensors.internal.ActivityTrackerSubscription.2
            @Override // com.google.android.gms.tasks.InterfaceC37023f
            public void onFailure(Exception exc) {
                String unused = ActivityTrackerSubscription.TAG;
                exc.getMessage();
            }
        });
        Runtime.getApplicationContext().registerReceiver(this.broadcastReceiver_, new IntentFilter(BROADCAST_ACTION), 4);
        this.connected_ = true;
    }

    private void doStop() {
        this.client_.removeActivityUpdates(this.pendingIntent_);
        Runtime.getApplicationContext().unregisterReceiver(this.broadcastReceiver_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handle(ActivityRecognitionResult activityRecognitionResult) {
        HashMap map = new HashMap();
        Iterator<DetectedActivity> it = activityRecognitionResult.getProbableActivities().iterator();
        while (it.hasNext()) {
            int type = it.next().getType();
            if (type != 2) {
                map.put(Integer.valueOf(type), Float.valueOf(r1.getConfidence() / 100.0f));
            }
        }
        updateActivity(this.nativeObject_, map);
    }

    public static boolean isActivityTrackerAvailable() {
        return C36687f.f349287e.c(C36688g.f349288a, Runtime.getApplicationContext()) == 0;
    }

    public static native void updateActivity(NativeObject nativeObject, Map map);

    public void stop() {
        if (this.connected_) {
            doStop();
            this.connected_ = false;
        }
    }
}
