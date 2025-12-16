package com.yandex.div.internal.viewpool;

import Y61.k;
import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;

/* compiled from: ViewPoolProfiler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/internal/viewpool/i;", "", "a", "b", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final b f370218a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c f370219b = new c();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f370220c = new a();

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Handler f370221d = new Handler(Looper.getMainLooper());

    /* compiled from: ViewPoolProfiler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/internal/viewpool/i$a;", "Ljava/lang/Runnable;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public boolean f370222b;

        public a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x0039, LOOP:0: B:16:0x0056->B:18:0x005c, LOOP_END, TryCatch #0 {all -> 0x0039, blocks: (B:4:0x0005, B:12:0x002e, B:15:0x003b, B:16:0x0056, B:18:0x005c, B:19:0x006d, B:7:0x000e, B:8:0x0018, B:10:0x001e), top: B:25:0x0005 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r6 = this;
                com.yandex.div.internal.viewpool.i r0 = com.yandex.div.internal.viewpool.i.this
                com.yandex.div.internal.viewpool.c r1 = r0.f370219b
                monitor-enter(r1)
                com.yandex.div.internal.viewpool.c r2 = r0.f370219b     // Catch: java.lang.Throwable -> L39
                com.yandex.div.internal.viewpool.c$a r3 = r2.f370205b     // Catch: java.lang.Throwable -> L39
                int r3 = r3.f370208b     // Catch: java.lang.Throwable -> L39
                if (r3 <= 0) goto Le
                goto L2e
            Le:
                androidx.collection.a<java.lang.String, com.yandex.div.internal.viewpool.c$a> r2 = r2.f370206c     // Catch: java.lang.Throwable -> L39
                java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L39
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L39
            L18:
                boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L39
                if (r3 == 0) goto L3b
                java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L39
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L39
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L39
                com.yandex.div.internal.viewpool.c$a r3 = (com.yandex.div.internal.viewpool.c.a) r3     // Catch: java.lang.Throwable -> L39
                int r3 = r3.f370208b     // Catch: java.lang.Throwable -> L39
                if (r3 <= 0) goto L18
            L2e:
                com.yandex.div.internal.viewpool.c r2 = r0.f370219b     // Catch: java.lang.Throwable -> L39
                r2.a()     // Catch: java.lang.Throwable -> L39
                com.yandex.div.internal.viewpool.i$b r2 = r0.f370218a     // Catch: java.lang.Throwable -> L39
                r2.getClass()     // Catch: java.lang.Throwable -> L39
                goto L3b
            L39:
                r0 = move-exception
                goto L73
            L3b:
                com.yandex.div.internal.viewpool.c r0 = r0.f370219b     // Catch: java.lang.Throwable -> L39
                com.yandex.div.internal.viewpool.c$a r2 = r0.f370204a     // Catch: java.lang.Throwable -> L39
                r3 = 0
                r2.f370207a = r3     // Catch: java.lang.Throwable -> L39
                r5 = 0
                r2.f370208b = r5     // Catch: java.lang.Throwable -> L39
                com.yandex.div.internal.viewpool.c$a r2 = r0.f370205b     // Catch: java.lang.Throwable -> L39
                r2.f370207a = r3     // Catch: java.lang.Throwable -> L39
                r2.f370208b = r5     // Catch: java.lang.Throwable -> L39
                androidx.collection.a<java.lang.String, com.yandex.div.internal.viewpool.c$a> r0 = r0.f370206c     // Catch: java.lang.Throwable -> L39
                java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L39
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L39
            L56:
                boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L39
                if (r2 == 0) goto L6d
                java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L39
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L39
                java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L39
                com.yandex.div.internal.viewpool.c$a r2 = (com.yandex.div.internal.viewpool.c.a) r2     // Catch: java.lang.Throwable -> L39
                r2.f370207a = r3     // Catch: java.lang.Throwable -> L39
                r2.f370208b = r5     // Catch: java.lang.Throwable -> L39
                goto L56
            L6d:
                kotlin.G0 r0 = kotlin.G0.f406611a     // Catch: java.lang.Throwable -> L39
                monitor-exit(r1)
                r6.f370222b = r5
                return
            L73:
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.viewpool.i.a.run():void");
        }
    }

    /* compiled from: ViewPoolProfiler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lcom/yandex/div/internal/viewpool/i$b;", "", "b", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        @X41.f
        @k
        public static final a f370224a;

        /* compiled from: ViewPoolProfiler.kt */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/yandex/div/internal/viewpool/i$b$a", "Lcom/yandex/div/internal/viewpool/i$b;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a implements b {
        }

        /* compiled from: ViewPoolProfiler.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"Lcom/yandex/div/internal/viewpool/i$b$b;", "", "<init>", "()V", "Lcom/yandex/div/internal/viewpool/i$b;", "NO_OP", "Lcom/yandex/div/internal/viewpool/i$b;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        /* renamed from: com.yandex.div.internal.viewpool.i$b$b, reason: collision with other inner class name */
        public static final class C10929b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int f370225a = 0;

            static {
                new C10929b();
            }
        }

        static {
            int i12 = C10929b.f370225a;
            f370224a = new a();
        }
    }

    public i(@k b bVar) {
        this.f370218a = bVar;
    }
}
