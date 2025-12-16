package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import j.X;
import j.a0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: NotificationManagerCompat.java */
/* loaded from: classes.dex */
public final class E {

    /* renamed from: d, reason: collision with root package name */
    @j.B
    public static String f44476d;

    /* renamed from: g, reason: collision with root package name */
    @j.B
    public static l f44479g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f44480a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f44481b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f44475c = new Object();

    /* renamed from: e, reason: collision with root package name */
    @j.B
    public static HashSet f44477e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f44478f = new Object();

    /* compiled from: NotificationManagerCompat.java */
    @X
    public static class a {
    }

    /* compiled from: NotificationManagerCompat.java */
    @X
    public static class b {
    }

    /* compiled from: NotificationManagerCompat.java */
    @X
    public static class c {
    }

    /* compiled from: NotificationManagerCompat.java */
    @X
    public static class d {
        public static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    @X
    public static class e {
    }

    /* compiled from: NotificationManagerCompat.java */
    @X
    public static class f {
    }

    /* compiled from: NotificationManagerCompat.java */
    public static class g implements m {
        @Override // androidx.core.app.E.m
        public final void a(INotificationSideChannel iNotificationSideChannel) {
            throw null;
        }

        @j.N
        public final String toString() {
            throw null;
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface h {
    }

    /* compiled from: NotificationManagerCompat.java */
    public static class i {
    }

    /* compiled from: NotificationManagerCompat.java */
    public static class j implements m {

        /* renamed from: a, reason: collision with root package name */
        public final String f44482a;

        /* renamed from: b, reason: collision with root package name */
        public final int f44483b;

        /* renamed from: c, reason: collision with root package name */
        public final String f44484c;

        /* renamed from: d, reason: collision with root package name */
        public final Notification f44485d;

        public j(String str, int i12, String str2, Notification notification) {
            this.f44482a = str;
            this.f44483b = i12;
            this.f44484c = str2;
            this.f44485d = notification;
        }

        @Override // androidx.core.app.E.m
        public final void a(INotificationSideChannel iNotificationSideChannel) {
            iNotificationSideChannel.notify(this.f44482a, this.f44483b, this.f44484c, this.f44485d);
        }

        @j.N
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
            sb2.append(this.f44482a);
            sb2.append(", id:");
            sb2.append(this.f44483b);
            sb2.append(", tag:");
            return AK.c.s(sb2, this.f44484c, "]");
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public final ComponentName f44486a;

        /* renamed from: b, reason: collision with root package name */
        public final IBinder f44487b;

        public k(ComponentName componentName, IBinder iBinder) {
            this.f44486a = componentName;
            this.f44487b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    public static class l implements Handler.Callback, ServiceConnection {

        /* renamed from: b, reason: collision with root package name */
        public final Context f44488b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f44489c;

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f44490d = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        public HashSet f44491e = new HashSet();

        /* compiled from: NotificationManagerCompat.java */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ComponentName f44492a;

            /* renamed from: c, reason: collision with root package name */
            public INotificationSideChannel f44494c;

            /* renamed from: b, reason: collision with root package name */
            public boolean f44493b = false;

            /* renamed from: d, reason: collision with root package name */
            public final ArrayDeque<m> f44495d = new ArrayDeque<>();

            /* renamed from: e, reason: collision with root package name */
            public int f44496e = 0;

            public a(ComponentName componentName) {
                this.f44492a = componentName;
            }
        }

        public l(Context context) {
            this.f44488b = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f44489c = new Handler(handlerThread.getLooper(), this);
        }

        public final void a(a aVar) {
            boolean z12;
            ArrayDeque<m> arrayDeque;
            boolean zIsLoggable = Log.isLoggable("NotifManCompat", 3);
            ComponentName componentName = aVar.f44492a;
            if (zIsLoggable) {
                Objects.toString(componentName);
                aVar.f44495d.size();
            }
            if (aVar.f44495d.isEmpty()) {
                return;
            }
            if (aVar.f44493b) {
                z12 = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.f44488b;
                boolean zBindService = context.bindService(component, this, 33);
                aVar.f44493b = zBindService;
                if (zBindService) {
                    aVar.f44496e = 0;
                } else {
                    Objects.toString(componentName);
                    context.unbindService(this);
                }
                z12 = aVar.f44493b;
            }
            if (!z12 || aVar.f44494c == null) {
                b(aVar);
                return;
            }
            while (true) {
                arrayDeque = aVar.f44495d;
                m mVarPeek = arrayDeque.peek();
                if (mVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        mVarPeek.toString();
                    }
                    mVarPeek.a(aVar.f44494c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(componentName);
                }
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            b(aVar);
        }

        public final void b(a aVar) {
            Handler handler = this.f44489c;
            ComponentName componentName = aVar.f44492a;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i12 = aVar.f44496e + 1;
            aVar.f44496e = i12;
            if (i12 <= 6) {
                Log.isLoggable("NotifManCompat", 3);
                handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r3) * 1000);
            } else {
                ArrayDeque<m> arrayDeque = aVar.f44495d;
                arrayDeque.size();
                Objects.toString(componentName);
                arrayDeque.clear();
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            HashSet hashSet;
            int i12 = message.what;
            if (i12 != 0) {
                if (i12 == 1) {
                    k kVar = (k) message.obj;
                    ComponentName componentName = kVar.f44486a;
                    IBinder iBinder = kVar.f44487b;
                    a aVar = (a) this.f44490d.get(componentName);
                    if (aVar != null) {
                        aVar.f44494c = INotificationSideChannel.Stub.asInterface(iBinder);
                        aVar.f44496e = 0;
                        a(aVar);
                    }
                    return true;
                }
                if (i12 != 2) {
                    if (i12 != 3) {
                        return false;
                    }
                    a aVar2 = (a) this.f44490d.get((ComponentName) message.obj);
                    if (aVar2 != null) {
                        a(aVar2);
                    }
                    return true;
                }
                a aVar3 = (a) this.f44490d.get((ComponentName) message.obj);
                if (aVar3 != null) {
                    if (aVar3.f44493b) {
                        this.f44488b.unbindService(this);
                        aVar3.f44493b = false;
                    }
                    aVar3.f44494c = null;
                }
                return true;
            }
            m mVar = (m) message.obj;
            Context context = this.f44488b;
            Object obj = E.f44475c;
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
            synchronized (E.f44475c) {
                if (string != null) {
                    try {
                        if (!string.equals(E.f44476d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            E.f44477e = hashSet2;
                            E.f44476d = string;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                hashSet = E.f44477e;
            }
            if (!hashSet.equals(this.f44491e)) {
                this.f44491e = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f44488b.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName2.toString();
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.f44490d.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName3);
                        }
                        this.f44490d.put(componentName3, new a(componentName3));
                    }
                }
                Iterator it2 = this.f44490d.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        a aVar4 = (a) entry.getValue();
                        if (aVar4.f44493b) {
                            this.f44488b.unbindService(this);
                            aVar4.f44493b = false;
                        }
                        aVar4.f44494c = null;
                        it2.remove();
                    }
                }
            }
            for (a aVar5 : this.f44490d.values()) {
                aVar5.f44495d.add(mVar);
                a(aVar5);
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f44489c.obtainMessage(1, new k(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Objects.toString(componentName);
            }
            this.f44489c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat.java */
    public interface m {
        void a(INotificationSideChannel iNotificationSideChannel);
    }

    public E(Context context) {
        this.f44480a = context;
        this.f44481b = (NotificationManager) context.getSystemService(NotificationsSettings.Section.SECTION_PAID_SERVICES);
    }

    public final void a(int i12, @j.P String str) {
        this.f44481b.cancel(str, i12);
    }

    public final void b(@j.N NotificationChannel notificationChannel) {
        this.f44481b.createNotificationChannel(notificationChannel);
    }

    @j.P
    public final NotificationChannelGroup c(@j.N String str) {
        int i12 = Build.VERSION.SDK_INT;
        NotificationManager notificationManager = this.f44481b;
        if (i12 >= 28) {
            return d.a(notificationManager, str);
        }
        for (NotificationChannelGroup notificationChannelGroup : notificationManager.getNotificationChannelGroups()) {
            if (notificationChannelGroup.getId().equals(str)) {
                return notificationChannelGroup;
            }
        }
        return null;
    }

    @a0
    public final void d(@j.P String str, int i12, @j.N Notification notification) {
        Bundle bundle = notification.extras;
        NotificationManager notificationManager = this.f44481b;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            notificationManager.notify(str, i12, notification);
            return;
        }
        j jVar = new j(this.f44480a.getPackageName(), i12, str, notification);
        synchronized (f44478f) {
            try {
                if (f44479g == null) {
                    f44479g = new l(this.f44480a.getApplicationContext());
                }
                f44479g.f44489c.obtainMessage(0, jVar).sendToTarget();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notificationManager.cancel(str, i12);
    }
}
