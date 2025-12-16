package com.github.anrwatchdog;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.github.anrwatchdog.a;
import com.github.anrwatchdog.a.C10554a.C10555a;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: ANRWatchDog.java */
/* loaded from: classes4.dex */
public class c extends Thread {

    /* renamed from: k, reason: collision with root package name */
    public static final f f342858k = new a();

    /* renamed from: l, reason: collision with root package name */
    public static final e f342859l = new b();

    /* renamed from: m, reason: collision with root package name */
    public static final g f342860m = new C10556c();

    /* renamed from: b, reason: collision with root package name */
    public f f342861b = f342858k;

    /* renamed from: c, reason: collision with root package name */
    public final e f342862c = f342859l;

    /* renamed from: d, reason: collision with root package name */
    public final g f342863d = f342860m;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f342864e = new Handler(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    public String f342866g = "";

    /* renamed from: h, reason: collision with root package name */
    public volatile long f342867h = 0;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f342868i = false;

    /* renamed from: j, reason: collision with root package name */
    public final Runnable f342869j = new d();

    /* renamed from: f, reason: collision with root package name */
    public final int f342865f = 5000;

    /* compiled from: ANRWatchDog.java */
    public static class b implements e {
    }

    /* compiled from: ANRWatchDog.java */
    /* renamed from: com.github.anrwatchdog.c$c, reason: collision with other inner class name */
    public static class C10556c implements g {
    }

    /* compiled from: ANRWatchDog.java */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.this.f342867h = 0L;
            c.this.f342868i = false;
        }
    }

    /* compiled from: ANRWatchDog.java */
    public interface e {
    }

    /* compiled from: ANRWatchDog.java */
    public interface f {
        void a(com.github.anrwatchdog.a aVar);
    }

    /* compiled from: ANRWatchDog.java */
    public interface g {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws InterruptedException {
        com.github.anrwatchdog.a aVar;
        setName("|ANR-WatchDog|");
        long j12 = this.f342865f;
        while (!isInterrupted()) {
            boolean z12 = this.f342867h == 0;
            this.f342867h += j12;
            if (z12) {
                this.f342864e.post(this.f342869j);
            }
            try {
                Thread.sleep(j12);
                if (this.f342867h != 0 && !this.f342868i) {
                    if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
                        this.f342868i = true;
                    } else {
                        ((b) this.f342862c).getClass();
                        if (this.f342866g != null) {
                            long j13 = this.f342867h;
                            String str = this.f342866g;
                            int i12 = com.github.anrwatchdog.a.f342853b;
                            Thread thread = Looper.getMainLooper().getThread();
                            TreeMap treeMap = new TreeMap(new com.github.anrwatchdog.b(thread));
                            for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                                if (entry.getKey() == thread || (entry.getKey().getName().startsWith(str) && entry.getValue().length > 0)) {
                                    treeMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                            if (!treeMap.containsKey(thread)) {
                                treeMap.put(thread, thread.getStackTrace());
                            }
                            a.C10554a.C10555a c10555a = null;
                            for (Map.Entry entry2 : treeMap.entrySet()) {
                                c10555a = new a.C10554a(com.github.anrwatchdog.a.a((Thread) entry2.getKey()), (StackTraceElement[]) entry2.getValue(), null).new C10555a(c10555a, null);
                            }
                            aVar = new com.github.anrwatchdog.a(c10555a, j13);
                        } else {
                            long j14 = this.f342867h;
                            int i13 = com.github.anrwatchdog.a.f342853b;
                            Thread thread2 = Looper.getMainLooper().getThread();
                            aVar = new com.github.anrwatchdog.a(new a.C10554a(com.github.anrwatchdog.a.a(thread2), thread2.getStackTrace(), null).new C10555a(null, null), j14);
                        }
                        this.f342861b.a(aVar);
                        j12 = this.f342865f;
                        this.f342868i = true;
                    }
                }
            } catch (InterruptedException e12) {
                ((C10556c) this.f342863d).getClass();
                e12.getMessage();
                return;
            }
        }
    }

    /* compiled from: ANRWatchDog.java */
    public static class a implements f {
        @Override // com.github.anrwatchdog.c.f
        public final void a(com.github.anrwatchdog.a aVar) {
            throw aVar;
        }
    }
}
