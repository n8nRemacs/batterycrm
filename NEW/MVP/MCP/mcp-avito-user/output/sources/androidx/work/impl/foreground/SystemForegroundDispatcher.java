package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.C23638w;
import androidx.work.G;
import androidx.work.impl.C23588s;
import androidx.work.impl.C23613x;
import androidx.work.impl.InterfaceC23551f;
import androidx.work.impl.Y;
import androidx.work.impl.constraints.b;
import androidx.work.impl.constraints.e;
import androidx.work.impl.constraints.f;
import androidx.work.impl.constraints.h;
import androidx.work.impl.l0;
import androidx.work.impl.model.C23580w;
import androidx.work.impl.model.H;
import androidx.work.impl.model.o0;
import androidx.work.impl.utils.C23593c;
import androidx.work.impl.utils.taskexecutor.b;
import j.K;
import j.N;
import j.P;
import j.k0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlinx.coroutines.N0;

@RestrictTo
/* loaded from: classes10.dex */
public class SystemForegroundDispatcher implements e, InterfaceC23551f {
    private static final String ACTION_CANCEL_WORK = "ACTION_CANCEL_WORK";
    private static final String ACTION_NOTIFY = "ACTION_NOTIFY";
    private static final String ACTION_START_FOREGROUND = "ACTION_START_FOREGROUND";
    private static final String ACTION_STOP_FOREGROUND = "ACTION_STOP_FOREGROUND";
    private static final String KEY_FOREGROUND_SERVICE_TYPE = "KEY_FOREGROUND_SERVICE_TYPE";
    private static final String KEY_GENERATION = "KEY_GENERATION";
    private static final String KEY_NOTIFICATION = "KEY_NOTIFICATION";
    private static final String KEY_NOTIFICATION_ID = "KEY_NOTIFICATION_ID";
    private static final String KEY_WORKSPEC_ID = "KEY_WORKSPEC_ID";
    static final String TAG = G.b("SystemFgDispatcher");

    @P
    private Callback mCallback;
    final f mConstraintsTracker;
    private Context mContext;
    C23580w mCurrentForegroundId;
    final Map<C23580w, C23638w> mForegroundInfoById;
    final Object mLock;
    private final b mTaskExecutor;
    final Map<C23580w, N0> mTrackedWorkSpecs;
    private Y mWorkManagerImpl;
    final Map<C23580w, H> mWorkSpecById;

    public interface Callback {
        @K
        void cancelNotification(int i12);

        @K
        void notify(int i12, @N Notification notification);

        @K
        void startForeground(int i12, int i13, @N Notification notification);

        @K
        void stop();
    }

    public SystemForegroundDispatcher(@N Context context) {
        this.mContext = context;
        this.mLock = new Object();
        Y yF2 = Y.f(context);
        this.mWorkManagerImpl = yF2;
        this.mTaskExecutor = yF2.f55560e;
        this.mCurrentForegroundId = null;
        this.mForegroundInfoById = new LinkedHashMap();
        this.mTrackedWorkSpecs = new HashMap();
        this.mWorkSpecById = new HashMap();
        this.mConstraintsTracker = new f(this.mWorkManagerImpl.f55567l);
        this.mWorkManagerImpl.f55562g.a(this);
    }

    @N
    public static Intent createCancelWorkIntent(@N Context context, @N String str) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(ACTION_CANCEL_WORK);
        intent.setData(Uri.parse("workspec://" + str));
        intent.putExtra(KEY_WORKSPEC_ID, str);
        return intent;
    }

    @N
    public static Intent createNotifyIntent(@N Context context, @N C23580w c23580w, @N C23638w c23638w) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(ACTION_NOTIFY);
        intent.putExtra(KEY_NOTIFICATION_ID, c23638w.f56213a);
        intent.putExtra(KEY_FOREGROUND_SERVICE_TYPE, c23638w.f56214b);
        intent.putExtra(KEY_NOTIFICATION, c23638w.f56215c);
        intent.putExtra(KEY_WORKSPEC_ID, c23580w.f55889a);
        intent.putExtra(KEY_GENERATION, c23580w.f55890b);
        return intent;
    }

    @N
    public static Intent createStartForegroundIntent(@N Context context, @N C23580w c23580w, @N C23638w c23638w) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(ACTION_START_FOREGROUND);
        intent.putExtra(KEY_WORKSPEC_ID, c23580w.f55889a);
        intent.putExtra(KEY_GENERATION, c23580w.f55890b);
        intent.putExtra(KEY_NOTIFICATION_ID, c23638w.f56213a);
        intent.putExtra(KEY_FOREGROUND_SERVICE_TYPE, c23638w.f56214b);
        intent.putExtra(KEY_NOTIFICATION, c23638w.f56215c);
        return intent;
    }

    @N
    public static Intent createStopForegroundIntent(@N Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction(ACTION_STOP_FOREGROUND);
        return intent;
    }

    @K
    private void handleCancelWork(@N Intent intent) {
        G gA2 = G.a();
        Objects.toString(intent);
        gA2.getClass();
        String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        Y y12 = this.mWorkManagerImpl;
        UUID uuidFromString = UUID.fromString(stringExtra);
        y12.getClass();
        C23593c.c(y12, uuidFromString);
    }

    @K
    private void handleNotify(@N Intent intent) {
        if (this.mCallback == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i12 = 0;
        int intExtra = intent.getIntExtra(KEY_NOTIFICATION_ID, 0);
        int intExtra2 = intent.getIntExtra(KEY_FOREGROUND_SERVICE_TYPE, 0);
        C23580w c23580w = new C23580w(intent.getStringExtra(KEY_WORKSPEC_ID), intent.getIntExtra(KEY_GENERATION, 0));
        Notification notification = (Notification) intent.getParcelableExtra(KEY_NOTIFICATION);
        G.a().getClass();
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        C23638w c23638w = new C23638w(intExtra, intExtra2, notification);
        this.mForegroundInfoById.put(c23580w, c23638w);
        C23638w c23638w2 = this.mForegroundInfoById.get(this.mCurrentForegroundId);
        if (c23638w2 == null) {
            this.mCurrentForegroundId = c23580w;
        } else {
            this.mCallback.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator<Map.Entry<C23580w, C23638w>> it = this.mForegroundInfoById.entrySet().iterator();
                while (it.hasNext()) {
                    i12 |= it.next().getValue().f56214b;
                }
                c23638w = new C23638w(c23638w2.f56213a, i12, c23638w2.f56215c);
            } else {
                c23638w = c23638w2;
            }
        }
        this.mCallback.startForeground(c23638w.f56213a, c23638w.f56214b, c23638w.f56215c);
    }

    @K
    private void handleStartForeground(@N Intent intent) {
        G gA2 = G.a();
        Objects.toString(intent);
        gA2.getClass();
        final String stringExtra = intent.getStringExtra(KEY_WORKSPEC_ID);
        this.mTaskExecutor.b(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundDispatcher.1
            @Override // java.lang.Runnable
            public void run() {
                H h12;
                C23588s c23588s = SystemForegroundDispatcher.this.mWorkManagerImpl.f55562g;
                String str = stringExtra;
                synchronized (c23588s.f55931k) {
                    try {
                        l0 l0VarC = c23588s.c(str);
                        h12 = l0VarC != null ? l0VarC.f55757a : null;
                    } finally {
                    }
                }
                if (h12 == null || !h12.c()) {
                    return;
                }
                synchronized (SystemForegroundDispatcher.this.mLock) {
                    SystemForegroundDispatcher.this.mWorkSpecById.put(o0.a(h12), h12);
                    SystemForegroundDispatcher systemForegroundDispatcher = SystemForegroundDispatcher.this;
                    SystemForegroundDispatcher.this.mTrackedWorkSpecs.put(o0.a(h12), h.a(systemForegroundDispatcher.mConstraintsTracker, h12, systemForegroundDispatcher.mTaskExecutor.a(), SystemForegroundDispatcher.this));
                }
            }
        });
    }

    @K
    public void handleStop(@N Intent intent) {
        G.a().getClass();
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.stop();
        }
    }

    @Override // androidx.work.impl.constraints.e
    public void onConstraintsStateChanged(@N H h12, @N androidx.work.impl.constraints.b bVar) {
        if (bVar instanceof b.C1953b) {
            String str = h12.f55795a;
            G.a().getClass();
            Y y12 = this.mWorkManagerImpl;
            C23580w c23580wA = o0.a(h12);
            int i12 = ((b.C1953b) bVar).f55670a;
            y12.getClass();
            y12.f55560e.b(new androidx.work.impl.utils.H(y12.f55562g, new C23613x(c23580wA), true, i12));
        }
    }

    @K
    public void onDestroy() {
        this.mCallback = null;
        synchronized (this.mLock) {
            try {
                Iterator<N0> it = this.mTrackedWorkSpecs.values().iterator();
                while (it.hasNext()) {
                    it.next().c(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.mWorkManagerImpl.f55562g.f(this);
    }

    @Override // androidx.work.impl.InterfaceC23551f
    @K
    public void onExecuted(@N C23580w c23580w, boolean z12) {
        Map.Entry<C23580w, C23638w> entry;
        synchronized (this.mLock) {
            try {
                N0 n0Remove = this.mWorkSpecById.remove(c23580w) != null ? this.mTrackedWorkSpecs.remove(c23580w) : null;
                if (n0Remove != null) {
                    n0Remove.c(null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C23638w c23638wRemove = this.mForegroundInfoById.remove(c23580w);
        if (c23580w.equals(this.mCurrentForegroundId)) {
            if (this.mForegroundInfoById.size() > 0) {
                Iterator<Map.Entry<C23580w, C23638w>> it = this.mForegroundInfoById.entrySet().iterator();
                Map.Entry<C23580w, C23638w> next = it.next();
                while (true) {
                    entry = next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.mCurrentForegroundId = entry.getKey();
                if (this.mCallback != null) {
                    C23638w value = entry.getValue();
                    this.mCallback.startForeground(value.f56213a, value.f56214b, value.f56215c);
                    this.mCallback.cancelNotification(value.f56213a);
                }
            } else {
                this.mCurrentForegroundId = null;
            }
        }
        Callback callback = this.mCallback;
        if (c23638wRemove == null || callback == null) {
            return;
        }
        G gA2 = G.a();
        c23580w.toString();
        gA2.getClass();
        callback.cancelNotification(c23638wRemove.f56213a);
    }

    @K
    public void onStartCommand(@N Intent intent) {
        String action = intent.getAction();
        if (ACTION_START_FOREGROUND.equals(action)) {
            handleStartForeground(intent);
            handleNotify(intent);
        } else if (ACTION_NOTIFY.equals(action)) {
            handleNotify(intent);
        } else if (ACTION_CANCEL_WORK.equals(action)) {
            handleCancelWork(intent);
        } else if (ACTION_STOP_FOREGROUND.equals(action)) {
            handleStop(intent);
        }
    }

    @K
    public void onTimeout(int i12, int i13) {
        G.a().getClass();
        for (Map.Entry<C23580w, C23638w> entry : this.mForegroundInfoById.entrySet()) {
            if (entry.getValue().f56214b == i13) {
                C23580w key = entry.getKey();
                Y y12 = this.mWorkManagerImpl;
                y12.getClass();
                y12.f55560e.b(new androidx.work.impl.utils.H(y12.f55562g, new C23613x(key), true, -128));
            }
        }
        Callback callback = this.mCallback;
        if (callback != null) {
            callback.stop();
        }
    }

    @K
    public void setCallback(@N Callback callback) {
        if (this.mCallback != null) {
            G.a().getClass();
        } else {
            this.mCallback = callback;
        }
    }

    @k0
    public SystemForegroundDispatcher(@N Context context, @N Y y12, @N f fVar) {
        this.mContext = context;
        this.mLock = new Object();
        this.mWorkManagerImpl = y12;
        this.mTaskExecutor = y12.f55560e;
        this.mCurrentForegroundId = null;
        this.mForegroundInfoById = new LinkedHashMap();
        this.mTrackedWorkSpecs = new HashMap();
        this.mWorkSpecById = new HashMap();
        this.mConstraintsTracker = fVar;
        this.mWorkManagerImpl.f55562g.a(this);
    }
}
