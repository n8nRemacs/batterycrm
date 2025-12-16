package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.widget.ImageView;
import com.squareup.picasso.AbstractC37864a;
import j.N;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* loaded from: classes7.dex */
public class Picasso {

    /* renamed from: k, reason: collision with root package name */
    public static final Handler f366365k = new a(Looper.getMainLooper());

    /* renamed from: a, reason: collision with root package name */
    public final ru.cyberity.cbr.core.d f366366a;

    /* renamed from: b, reason: collision with root package name */
    public final e f366367b;

    /* renamed from: c, reason: collision with root package name */
    public final List<C> f366368c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f366369d;

    /* renamed from: e, reason: collision with root package name */
    public final C37874k f366370e;

    /* renamed from: f, reason: collision with root package name */
    public final r f366371f;

    /* renamed from: g, reason: collision with root package name */
    public final E f366372g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakHashMap f366373h;

    /* renamed from: i, reason: collision with root package name */
    public final WeakHashMap f366374i;

    /* renamed from: j, reason: collision with root package name */
    public final ReferenceQueue<Object> f366375j;

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);

        LoadedFrom(int i12) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Priority {

        /* renamed from: b, reason: collision with root package name */
        public static final Priority f366380b;

        /* renamed from: c, reason: collision with root package name */
        public static final Priority f366381c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Priority[] f366382d;

        static {
            Priority priority = new Priority("LOW", 0);
            f366380b = priority;
            Priority priority2 = new Priority("NORMAL", 1);
            f366381c = priority2;
            f366382d = new Priority[]{priority, priority2, new Priority("HIGH", 2)};
        }

        public Priority() {
            throw null;
        }

        public static Priority valueOf(String str) {
            return (Priority) Enum.valueOf(Priority.class, str);
        }

        public static Priority[] values() {
            return (Priority[]) f366382d.clone();
        }
    }

    public static class a extends Handler {
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i12 = message.what;
            if (i12 == 3) {
                AbstractC37864a abstractC37864a = (AbstractC37864a) message.obj;
                abstractC37864a.f366393a.getClass();
                abstractC37864a.f366393a.a(abstractC37864a.d());
                return;
            }
            if (i12 != 8) {
                if (i12 != 13) {
                    throw new AssertionError("Unknown handler message received: " + message.what);
                }
                List list = (List) message.obj;
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    AbstractC37864a abstractC37864a2 = (AbstractC37864a) list.get(i13);
                    Picasso picasso = abstractC37864a2.f366393a;
                    picasso.getClass();
                    Bitmap bitmapA = picasso.f366371f.a(abstractC37864a2.f366396d);
                    E e12 = picasso.f366372g;
                    if (bitmapA != null) {
                        e12.f366332b.sendEmptyMessage(0);
                    } else {
                        e12.f366332b.sendEmptyMessage(1);
                    }
                    if (bitmapA != null) {
                        picasso.b(bitmapA, LoadedFrom.MEMORY, abstractC37864a2, null);
                    } else {
                        picasso.c(abstractC37864a2);
                    }
                }
                return;
            }
            List list2 = (List) message.obj;
            int size2 = list2.size();
            for (int i14 = 0; i14 < size2; i14++) {
                RunnableC37866c runnableC37866c = (RunnableC37866c) list2.get(i14);
                Picasso picasso2 = runnableC37866c.f366409c;
                picasso2.getClass();
                AbstractC37864a abstractC37864a3 = runnableC37866c.f366417k;
                ArrayList arrayList = runnableC37866c.f366418l;
                boolean z12 = (arrayList == null || arrayList.isEmpty()) ? false : true;
                if (abstractC37864a3 != null || z12) {
                    Uri uri = runnableC37866c.f366414h.f366289a;
                    Exception exc = runnableC37866c.f366422p;
                    Bitmap bitmap = runnableC37866c.f366419m;
                    LoadedFrom loadedFrom = runnableC37866c.f366421o;
                    if (abstractC37864a3 != null) {
                        picasso2.b(bitmap, loadedFrom, abstractC37864a3, exc);
                    }
                    if (z12) {
                        int size3 = arrayList.size();
                        for (int i15 = 0; i15 < size3; i15++) {
                            picasso2.b(bitmap, loadedFrom, (AbstractC37864a) arrayList.get(i15), exc);
                        }
                    }
                    ru.cyberity.cbr.core.d dVar = picasso2.f366366a;
                    if (dVar != null && exc != null) {
                        dVar.a(picasso2, uri, exc);
                    }
                }
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f366383a;

        /* renamed from: b, reason: collision with root package name */
        public v f366384b;

        /* renamed from: c, reason: collision with root package name */
        public ExecutorService f366385c;

        /* renamed from: d, reason: collision with root package name */
        public r f366386d;

        /* renamed from: e, reason: collision with root package name */
        public ru.cyberity.cbr.core.d f366387e;

        /* renamed from: f, reason: collision with root package name */
        public e f366388f;

        public b(@N Context context) {
            this.f366383a = context.getApplicationContext();
        }

        public final Picasso a() {
            long blockCountLong;
            v vVar = this.f366384b;
            Context context = this.f366383a;
            if (vVar == null) {
                StringBuilder sb2 = K.f366360a;
                File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
                if (!file.exists()) {
                    file.mkdirs();
                }
                try {
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    blockCountLong = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
                } catch (IllegalArgumentException unused) {
                    blockCountLong = 5242880;
                }
                this.f366384b = new v(new OkHttpClient.Builder().cache(new Cache(file, Math.max(Math.min(blockCountLong, 52428800L), 5242880L))).build());
            }
            if (this.f366386d == null) {
                this.f366386d = new r(context);
            }
            if (this.f366385c == null) {
                this.f366385c = new x();
            }
            if (this.f366388f == null) {
                this.f366388f = e.f366392a;
            }
            E e12 = new E(this.f366386d);
            return new Picasso(context, new C37874k(context, this.f366385c, Picasso.f366365k, this.f366384b, this.f366386d, e12), this.f366386d, this.f366387e, this.f366388f, e12);
        }
    }

    public static class c extends Thread {

        /* renamed from: b, reason: collision with root package name */
        public final ReferenceQueue<Object> f366389b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f366390c;

        public class a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Exception f366391b;

            public a(Exception exc) {
                this.f366391b = exc;
            }

            @Override // java.lang.Runnable
            public final void run() {
                throw new RuntimeException(this.f366391b);
            }
        }

        public c(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f366389b = referenceQueue;
            this.f366390c = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() throws SecurityException, IllegalArgumentException {
            Handler handler = this.f366390c;
            Process.setThreadPriority(10);
            while (true) {
                try {
                    AbstractC37864a.C10810a c10810a = (AbstractC37864a.C10810a) this.f366389b.remove(1000L);
                    Message messageObtainMessage = handler.obtainMessage();
                    if (c10810a != null) {
                        messageObtainMessage.what = 3;
                        messageObtainMessage.obj = c10810a.f366400a;
                        handler.sendMessage(messageObtainMessage);
                    } else {
                        messageObtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e12) {
                    handler.post(new a(e12));
                    return;
                }
            }
        }
    }

    public interface d {
    }

    public Picasso(Context context, C37874k c37874k, r rVar, ru.cyberity.cbr.core.d dVar, e eVar, E e12) {
        this.f366369d = context;
        this.f366370e = c37874k;
        this.f366371f = rVar;
        this.f366366a = dVar;
        this.f366367b = eVar;
        ArrayList arrayList = new ArrayList(7);
        arrayList.add(new D(context));
        arrayList.add(new C37870g(context));
        arrayList.add(new t(context));
        arrayList.add(new C37871h(context));
        arrayList.add(new C37865b(context));
        arrayList.add(new n(context));
        arrayList.add(new u(c37874k.f366436c, e12));
        this.f366368c = Collections.unmodifiableList(arrayList);
        this.f366372g = e12;
        this.f366373h = new WeakHashMap();
        this.f366374i = new WeakHashMap();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.f366375j = referenceQueue;
        new c(referenceQueue, f366365k).start();
    }

    public final void a(Object obj) {
        StringBuilder sb2 = K.f366360a;
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
        AbstractC37864a abstractC37864a = (AbstractC37864a) this.f366373h.remove(obj);
        if (abstractC37864a != null) {
            abstractC37864a.a();
            Handler handler = this.f366370e.f366441h;
            handler.sendMessage(handler.obtainMessage(2, abstractC37864a));
        }
        if (obj instanceof ImageView) {
            if (((ViewTreeObserverOnPreDrawListenerC37872i) this.f366374i.remove((ImageView) obj)) != null) {
                throw null;
            }
        }
    }

    public final void b(Bitmap bitmap, LoadedFrom loadedFrom, AbstractC37864a abstractC37864a, Exception exc) {
        if (abstractC37864a.f366399g) {
            return;
        }
        if (!abstractC37864a.f366398f) {
            this.f366373h.remove(abstractC37864a.d());
        }
        if (bitmap == null) {
            abstractC37864a.c(exc);
        } else {
            if (loadedFrom == null) {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
            abstractC37864a.b(bitmap, loadedFrom);
        }
    }

    public final void c(AbstractC37864a abstractC37864a) {
        Object objD = abstractC37864a.d();
        if (objD != null) {
            WeakHashMap weakHashMap = this.f366373h;
            if (weakHashMap.get(objD) != abstractC37864a) {
                a(objD);
                weakHashMap.put(objD, abstractC37864a);
            }
        }
        Handler handler = this.f366370e.f366441h;
        handler.sendMessage(handler.obtainMessage(1, abstractC37864a));
    }

    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f366392a = new a();

        A a(A a12);

        public static class a implements e {
            @Override // com.squareup.picasso.Picasso.e
            public final A a(A a12) {
                return a12;
            }
        }
    }
}
