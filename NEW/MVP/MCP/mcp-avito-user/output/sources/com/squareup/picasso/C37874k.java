package com.squareup.picasso;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: Dispatcher.java */
/* renamed from: com.squareup.picasso.k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
class C37874k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f366434a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f366435b;

    /* renamed from: c, reason: collision with root package name */
    public final v f366436c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f366437d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f366438e;

    /* renamed from: f, reason: collision with root package name */
    public final WeakHashMap f366439f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f366440g;

    /* renamed from: h, reason: collision with root package name */
    public final Handler f366441h;

    /* renamed from: i, reason: collision with root package name */
    public final Handler f366442i;

    /* renamed from: j, reason: collision with root package name */
    public final r f366443j;

    /* renamed from: k, reason: collision with root package name */
    public final E f366444k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f366445l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f366446m;

    /* compiled from: Dispatcher.java */
    /* renamed from: com.squareup.picasso.k$a */
    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final C37874k f366447a;

        /* compiled from: Dispatcher.java */
        /* renamed from: com.squareup.picasso.k$a$a, reason: collision with other inner class name */
        public class RunnableC10812a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Message f366448b;

            public RunnableC10812a(Message message) {
                this.f366448b = message;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new AssertionError("Unknown handler message received: " + this.f366448b.what);
            }
        }

        public a(Looper looper, C37874k c37874k) {
            super(looper);
            this.f366447a = c37874k;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x012e  */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void handleMessage(android.os.Message r11) {
            /*
                Method dump skipped, instructions count: 804
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.C37874k.a.handleMessage(android.os.Message):void");
        }
    }

    /* compiled from: Dispatcher.java */
    /* renamed from: com.squareup.picasso.k$b */
    public static class b extends HandlerThread {
        public b() {
            super("Picasso-Dispatcher", 10);
        }
    }

    /* compiled from: Dispatcher.java */
    /* renamed from: com.squareup.picasso.k$c */
    public static class c extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final C37874k f366449a;

        public c(C37874k c37874k) {
            this.f366449a = c37874k;
        }

        @Override // android.content.BroadcastReceiver
        @SuppressLint({"MissingPermission"})
        public final void onReceive(Context context, Intent intent) {
            if (intent == null) {
                return;
            }
            String action = intent.getAction();
            boolean zEquals = "android.intent.action.AIRPLANE_MODE".equals(action);
            C37874k c37874k = this.f366449a;
            if (zEquals) {
                if (intent.hasExtra(VoiceInfo.STATE)) {
                    boolean booleanExtra = intent.getBooleanExtra(VoiceInfo.STATE, false);
                    Handler handler = c37874k.f366441h;
                    handler.sendMessage(handler.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                    return;
                }
                return;
            }
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                StringBuilder sb2 = K.f366360a;
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                Handler handler2 = c37874k.f366441h;
                handler2.sendMessage(handler2.obtainMessage(9, activeNetworkInfo));
            }
        }
    }

    public C37874k(Context context, ExecutorService executorService, Handler handler, v vVar, r rVar, E e12) {
        b bVar = new b();
        bVar.start();
        Looper looper = bVar.getLooper();
        StringBuilder sb2 = K.f366360a;
        J j12 = new J(looper);
        j12.sendMessageDelayed(j12.obtainMessage(), 1000L);
        this.f366434a = context;
        this.f366435b = executorService;
        this.f366437d = new LinkedHashMap();
        this.f366438e = new WeakHashMap();
        this.f366439f = new WeakHashMap();
        this.f366440g = new LinkedHashSet();
        this.f366441h = new a(bVar.getLooper(), this);
        this.f366436c = vVar;
        this.f366442i = handler;
        this.f366443j = rVar;
        this.f366444k = e12;
        this.f366445l = new ArrayList(4);
        try {
            Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (NullPointerException | SecurityException unused) {
        }
        this.f366446m = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        c cVar = new c(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        C37874k c37874k = cVar.f366449a;
        if (c37874k.f366446m) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        c37874k.f366434a.registerReceiver(cVar, intentFilter);
    }

    public final void a(RunnableC37866c runnableC37866c) {
        Future<?> future = runnableC37866c.f366420n;
        if (future == null || !future.isCancelled()) {
            Bitmap bitmap = runnableC37866c.f366419m;
            if (bitmap != null) {
                bitmap.prepareToDraw();
            }
            this.f366445l.add(runnableC37866c);
            Handler handler = this.f366441h;
            if (handler.hasMessages(7)) {
                return;
            }
            handler.sendEmptyMessageDelayed(7, 200L);
        }
    }

    public final void b(RunnableC37866c runnableC37866c) {
        Handler handler = this.f366441h;
        handler.sendMessage(handler.obtainMessage(4, runnableC37866c));
    }

    public final void c(RunnableC37866c runnableC37866c, boolean z12) {
        runnableC37866c.f366409c.getClass();
        this.f366437d.remove(runnableC37866c.f366413g);
        a(runnableC37866c);
    }

    public final void d(AbstractC37864a abstractC37864a, boolean z12) {
        RunnableC37866c runnableC37866c;
        boolean zContains = this.f366440g.contains(abstractC37864a.f366397e);
        Picasso picasso = abstractC37864a.f366393a;
        if (zContains) {
            this.f366439f.put(abstractC37864a.d(), abstractC37864a);
            picasso.getClass();
            return;
        }
        LinkedHashMap linkedHashMap = this.f366437d;
        String str = abstractC37864a.f366396d;
        RunnableC37866c runnableC37866c2 = (RunnableC37866c) linkedHashMap.get(str);
        A a12 = abstractC37864a.f366394b;
        if (runnableC37866c2 != null) {
            runnableC37866c2.f366409c.getClass();
            if (runnableC37866c2.f366417k == null) {
                runnableC37866c2.f366417k = abstractC37864a;
                return;
            }
            if (runnableC37866c2.f366418l == null) {
                runnableC37866c2.f366418l = new ArrayList(3);
            }
            runnableC37866c2.f366418l.add(abstractC37864a);
            Picasso.Priority priority = a12.f366305q;
            if (priority.ordinal() > runnableC37866c2.f366425s.ordinal()) {
                runnableC37866c2.f366425s = priority;
                return;
            }
            return;
        }
        ExecutorService executorService = this.f366435b;
        if (((ThreadPoolExecutor) executorService).isShutdown()) {
            picasso.getClass();
            return;
        }
        Object obj = RunnableC37866c.f366404t;
        List<C> list = picasso.f366368c;
        int size = list.size();
        int i12 = 0;
        while (true) {
            r rVar = this.f366443j;
            E e12 = this.f366444k;
            if (i12 >= size) {
                runnableC37866c = new RunnableC37866c(picasso, this, rVar, e12, abstractC37864a, RunnableC37866c.f366407w);
                break;
            }
            C c12 = list.get(i12);
            if (c12.b(a12)) {
                runnableC37866c = new RunnableC37866c(picasso, this, rVar, e12, abstractC37864a, c12);
                break;
            }
            i12++;
        }
        runnableC37866c.f366420n = ((x) executorService).submit(runnableC37866c);
        linkedHashMap.put(str, runnableC37866c);
        if (z12) {
            this.f366438e.remove(abstractC37864a.d());
        }
        picasso.getClass();
    }
}
