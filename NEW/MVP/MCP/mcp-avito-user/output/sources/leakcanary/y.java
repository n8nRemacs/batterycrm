package leakcanary;

import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import shark.j3;

/* compiled from: ObjectWatcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/y;", "Lleakcanary/E;", "leakcanary-object-watcher"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class y implements E {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f414130a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f414131b;

    /* renamed from: c, reason: collision with root package name */
    public final ReferenceQueue<Object> f414132c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC43750h f414133d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f414134e;

    /* renamed from: f, reason: collision with root package name */
    public final Y41.a<Boolean> f414135f;

    /* compiled from: ObjectWatcher.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f414136l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    /* compiled from: ObjectWatcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements Runnable {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f414138c;

        public b(String str) {
            this.f414138c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            KeyedWeakReference keyedWeakReference;
            y yVar = y.this;
            String str = this.f414138c;
            synchronized (yVar) {
                do {
                    keyedWeakReference = (KeyedWeakReference) yVar.f414132c.poll();
                    if (keyedWeakReference != null) {
                        yVar.f414131b.remove(keyedWeakReference.getKey());
                    }
                } while (keyedWeakReference != null);
                KeyedWeakReference keyedWeakReference2 = (KeyedWeakReference) yVar.f414131b.get(str);
                if (keyedWeakReference2 != null) {
                    keyedWeakReference2.setRetainedUptimeMillis(yVar.f414133d.a());
                    Iterator it = yVar.f414130a.iterator();
                    while (it.hasNext()) {
                        ((A) it.next()).a();
                    }
                }
            }
        }
    }

    public y(@Y61.k InterfaceC43750h interfaceC43750h, @Y61.k Executor executor, @Y61.k Y41.a<Boolean> aVar) {
        this.f414133d = interfaceC43750h;
        this.f414134e = executor;
        this.f414135f = aVar;
        this.f414130a = new LinkedHashSet();
        this.f414131b = new LinkedHashMap();
        this.f414132c = new ReferenceQueue<>();
    }

    @Override // leakcanary.E
    public final synchronized void a(@Y61.k Object obj, @Y61.k String str) {
        KeyedWeakReference keyedWeakReference;
        String str2;
        try {
            if (this.f414135f.invoke().booleanValue()) {
                do {
                    keyedWeakReference = (KeyedWeakReference) this.f414132c.poll();
                    if (keyedWeakReference != null) {
                        this.f414131b.remove(keyedWeakReference.getKey());
                    }
                } while (keyedWeakReference != null);
                String string = UUID.randomUUID().toString();
                KeyedWeakReference keyedWeakReference2 = new KeyedWeakReference(obj, string, str, this.f414133d.a(), this.f414132c);
                j3.f438639b.getClass();
                u uVar = j3.f438638a;
                if (uVar != null) {
                    StringBuilder sb2 = new StringBuilder("Watching ");
                    sb2.append(obj instanceof Class ? obj.toString() : "instance of ".concat(obj.getClass().getName()));
                    if (str.length() > 0) {
                        str2 = " (" + str + ')';
                    } else {
                        str2 = "";
                    }
                    sb2.append(str2);
                    sb2.append(" with key ");
                    sb2.append(string);
                    uVar.a(sb2.toString());
                }
                this.f414131b.put(string, keyedWeakReference2);
                this.f414134e.execute(new b(string));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public /* synthetic */ y(InterfaceC43750h interfaceC43750h, Executor executor, Y41.a aVar, int i12, C42822w c42822w) {
        this(interfaceC43750h, executor, (i12 & 4) != 0 ? a.f414136l : aVar);
    }
}
