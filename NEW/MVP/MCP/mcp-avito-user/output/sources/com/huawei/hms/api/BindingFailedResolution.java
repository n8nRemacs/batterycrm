package com.huawei.hms.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.api.FailedBinderCallBack;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.AbstractDialog;
import com.huawei.hms.ui.AbstractPromptDialog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;
import com.huawei.hms.utils.Util;

/* loaded from: classes7.dex */
public class BindingFailedResolution implements IBridgeActivityDelegate, ServiceConnection {

    /* renamed from: g, reason: collision with root package name */
    private static final Object f363250g = new Object();

    /* renamed from: a, reason: collision with root package name */
    private Activity f363251a;

    /* renamed from: c, reason: collision with root package name */
    private d f363253c;

    /* renamed from: d, reason: collision with root package name */
    private FailedBinderCallBack.BinderCallBack f363254d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f363252b = true;

    /* renamed from: e, reason: collision with root package name */
    private Handler f363255e = null;

    /* renamed from: f, reason: collision with root package name */
    private Handler f363256f = null;

    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null || message.what != 3) {
                return false;
            }
            BindingFailedResolution.this.a(8);
            return true;
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
            HMSLog.e("BindingFailedResolution", "In connect, bind core try timeout");
            BindingFailedResolution.this.b(false);
            return true;
        }
    }

    public class c implements AbstractDialog.Callback {
        public c() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onCancel(AbstractDialog abstractDialog) {
            BindingFailedResolution.this.f363253c = null;
            BindResolveClients.getInstance().unRegisterAll();
            BindingFailedResolution.this.a(8);
        }

        @Override // com.huawei.hms.ui.AbstractDialog.Callback
        public void onDoWork(AbstractDialog abstractDialog) {
            BindingFailedResolution.this.f363253c = null;
            BindResolveClients.getInstance().unRegisterAll();
            BindingFailedResolution.this.a(8);
        }
    }

    public static class d extends AbstractPromptDialog {
        private d() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetMessageString(Context context) {
            return ResourceLoaderUtil.getString("hms_bindfaildlg_message", Util.getAppName(context, null), Util.getAppName(context, HMSPackageManager.getInstance(context).getHMSPackageNameForMultiService()));
        }

        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetPositiveButtonString(Context context) {
            return ResourceLoaderUtil.getString("hms_confirm");
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z12) {
        if (this.f363252b) {
            this.f363252b = false;
            onStartResult(z12);
        }
    }

    private void c() {
        Handler handler = this.f363256f;
        if (handler != null) {
            handler.removeMessages(3);
        } else {
            this.f363256f = new Handler(Looper.getMainLooper(), new a());
        }
        this.f363256f.sendEmptyMessageDelayed(3, 4000L);
    }

    private void d() {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        d dVar = this.f363253c;
        if (dVar == null) {
            this.f363253c = new d(null);
        } else {
            dVar.dismiss();
        }
        HMSLog.i("BindingFailedResolution", "showPromptdlg to resolve conn error");
        this.f363253c.show(activity, new c());
    }

    public Activity getActivity() {
        return this.f363251a;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2003;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent != null && intent.hasExtra(FailedBinderCallBack.CALLER_ID)) {
            this.f363254d = FailedBinderCallBack.getInstance().getCallBack(Long.valueOf(intent.getLongExtra(FailedBinderCallBack.CALLER_ID, 0L)));
        }
        this.f363251a = activity;
        com.huawei.hms.api.a.f363327b.a(activity);
        c();
        a(activity);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        a();
        com.huawei.hms.api.a.f363327b.b(this.f363251a);
        this.f363251a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i12, int i13, Intent intent) {
        if (i12 != getRequestCode()) {
            return false;
        }
        HMSLog.i("BindingFailedResolution", "onBridgeActivityResult");
        Handler handler = this.f363256f;
        if (handler != null) {
            handler.removeMessages(3);
            this.f363256f = null;
        }
        a(true);
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        if (this.f363253c == null) {
            return;
        }
        HMSLog.i("BindingFailedResolution", "re show prompt dialog");
        d();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i12, KeyEvent keyEvent) {
        HMSLog.i("BindingFailedResolution", "On key up when resolve conn error");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a();
        b(true);
        if (getActivity() == null) {
            return;
        }
        HMSLog.i("BindingFailedResolution", "test connect success, try to reConnect and reply message");
        BindResolveClients.getInstance().notifyClientReconnect();
    }

    public void onStartResult(boolean z12) {
        if (getActivity() == null) {
            return;
        }
        if (z12) {
            a(0);
        } else {
            d();
        }
    }

    private void a(Activity activity) {
        Intent intent = new Intent();
        intent.putExtra(BridgeActivity.EXTRA_IS_FULLSCREEN, UIUtil.isActivityFullscreen(activity));
        intent.setClassName(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageNameForMultiService(), HuaweiApiAvailability.ACTIVITY_NAME);
        HMSLog.i("BindingFailedResolution", "onBridgeActivityCreate：try to start HMS");
        try {
            activity.startActivityForResult(intent, getRequestCode());
        } catch (Throwable th2) {
            HMSLog.e("BindingFailedResolution", "ActivityNotFoundException：" + th2.getMessage());
            Handler handler = this.f363256f;
            if (handler != null) {
                handler.removeMessages(3);
                this.f363256f = null;
            }
            a(false);
        }
    }

    private void b() {
        Handler handler = this.f363255e;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.f363255e = new Handler(Looper.getMainLooper(), new b());
        }
        this.f363255e.sendEmptyMessageDelayed(2, 5000L);
    }

    private void a(boolean z12, int i12) {
        FailedBinderCallBack.BinderCallBack binderCallBack;
        if (!z12 || (binderCallBack = this.f363254d) == null) {
            return;
        }
        binderCallBack.binderCallBack(i12);
    }

    private void a(boolean z12) {
        Activity activity = getActivity();
        if (activity == null) {
            HMSLog.e("BindingFailedResolution", "In connect, bind core try fail");
            b(false);
            a(z12, 8);
            return;
        }
        Intent intent = new Intent(HMSPackageManager.getInstance(activity.getApplicationContext()).getServiceAction());
        intent.setPackage(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageNameForMultiService());
        synchronized (f363250g) {
            try {
                if (activity.bindService(intent, this, 1)) {
                    b();
                    return;
                }
                HMSLog.e("BindingFailedResolution", "In connect, bind core try fail");
                b(false);
                a(z12, 8);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i12) {
        Activity activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        HMSLog.i("BindingFailedResolution", "finishBridgeActivity：" + i12);
        Intent intent = new Intent();
        intent.putExtra(BridgeActivity.EXTRA_RESULT, i12);
        activity.setResult(-1, intent);
        Util.unBindServiceCatchException(activity, this);
        activity.finish();
    }

    private void a() {
        synchronized (f363250g) {
            try {
                Handler handler = this.f363255e;
                if (handler != null) {
                    handler.removeMessages(2);
                    this.f363255e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
