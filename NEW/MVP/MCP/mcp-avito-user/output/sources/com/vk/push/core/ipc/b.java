package com.vk.push.core.ipc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* compiled from: BaseIPCClient.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/vk/push/core/ipc/b;", "Landroid/os/IInterface;", "T", "", "b", "c", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class b<T extends IInterface> {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f367032m = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f367033a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<T11.a> f367034b;

    /* renamed from: c, reason: collision with root package name */
    public final long f367035c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<b<T>, G0> f367036d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Continuation<? super G0>, Object> f367037e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f367038f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f367039g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public volatile C10839b<T> f367040h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final AtomicBoolean f367041i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ExecutorService f367042j;

    /* renamed from: k, reason: collision with root package name */
    public final Set<q<T, ?>> f367043k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.vk.push.core.ipc.c f367044l;

    /* compiled from: BaseIPCClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/os/IInterface;", "T", "Lcom/vk/push/core/ipc/b;", "it", "Lkotlin/G0;", "invoke", "(Lcom/vk/push/core/ipc/b;)V", "<anonymous>"}, k = 3, mv = {1, 7, 0})
    public static final class a extends N implements Y41.l<b<T>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f367045l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Object obj) {
            return G0.f406611a;
        }
    }

    /* compiled from: BaseIPCClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/push/core/ipc/b$b;", "T", "", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: com.vk.push.core.ipc.b$b, reason: collision with other inner class name */
    public static final class C10839b<T> {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final T11.a f367046a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ComponentName f367047b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final IInterface f367048c;

        public C10839b(@Y61.k T11.a aVar, @Y61.k ComponentName componentName, @Y61.l IInterface iInterface) {
            this.f367046a = aVar;
            this.f367047b = componentName;
            this.f367048c = iInterface;
        }
    }

    /* compiled from: BaseIPCClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/vk/push/core/ipc/b$c;", "", "<init>", "()V", "", "DEFAULT_CLOSE_CONNECTION_TIMEOUT_MILLIS", "J", "DEFAULT_REQUEST_TIMEOUT_IN_MINUTES", "RECONNECTION_TIMEOUT", "THREAD_POOL_KEEP_ALIVE", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        new c(null);
    }

    public b() {
        throw null;
    }

    public b(Context context, List list, long j12, Y41.l lVar, Y41.l lVar2, T11.f fVar, int i12, C42822w c42822w) {
        long j13 = (i12 & 4) != 0 ? 10000L : j12;
        Y41.l lVar3 = (i12 & 8) != 0 ? a.f367045l : lVar;
        this.f367033a = context;
        this.f367034b = list;
        this.f367035c = j13;
        this.f367036d = lVar3;
        this.f367037e = lVar2;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Preferred hosts must not be empty");
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((T11.a) obj).f15306a)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != this.f367034b.size()) {
            throw new IllegalArgumentException("Found duplicate package names in preferred hosts");
        }
        if (this.f367035c < 0) {
            throw new IllegalArgumentException("closeConnectionTimeoutMillis must be >= 0");
        }
        this.f367038f = C42727D.c(new j(fVar, this));
        this.f367039g = C42727D.c(new f(this));
        this.f367041i = new AtomicBoolean(false);
        this.f367042j = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue()));
        this.f367043k = Collections.synchronizedSet(new LinkedHashSet());
        this.f367044l = new com.vk.push.core.ipc.c(fVar, this);
    }

    public final boolean d(T11.a aVar, ComponentName componentName) throws NoSuchAlgorithmException {
        boolean z12;
        Context context = this.f367033a;
        String packageName = context.getPackageName();
        String str = aVar.f15306a;
        if (L.f(str, packageName)) {
            z12 = true;
        } else {
            try {
                PackageInfo packageInfo = Build.VERSION.SDK_INT >= 28 ? context.getPackageManager().getPackageInfo(str, 134217728) : context.getPackageManager().getPackageInfo(str, 64);
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                for (Signature signature : com.vk.push.core.utils.l.c(packageInfo)) {
                    messageDigest.reset();
                    messageDigest.update(signature.toByteArray());
                    if (aVar.f15307b.equalsIgnoreCase(com.vk.push.core.utils.l.a(messageDigest.digest()))) {
                        z12 = true;
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            }
            z12 = false;
            if (!z12) {
                i().error("Signature validation for " + str + " has failed", null);
            }
        }
        if (!z12) {
            return false;
        }
        Intent intent = new Intent();
        intent.setComponent(componentName);
        return context.bindService(intent, this.f367044l, 1);
    }

    public final boolean e(T11.a aVar, ComponentName componentName, q<T, ?> qVar) {
        if (!d(aVar, componentName)) {
            i().info("Unable to bind to " + aVar.f15306a + ", trying next host");
            return false;
        }
        i().info("bindService to " + aVar.f15306a + " via " + qVar.getF367087c() + " function returns true, waiting for connection establishment");
        this.f367043k.add(qVar);
        C10839b<T> c10839b = this.f367040h;
        IInterface iInterface = c10839b != null ? c10839b.f367048c : null;
        if (iInterface == null) {
            this.f367040h = new C10839b<>(aVar, componentName, null);
            return true;
        }
        i().info("bindService to " + aVar.f15306a + " via " + qVar.getF367087c() + ", remoteService already exists");
        h hVar = new h(this, iInterface, aVar);
        if (this.f367043k.isEmpty()) {
            return true;
        }
        this.f367042j.submit(new com.vk.push.core.ipc.a(this, hVar));
        return true;
    }

    @Y61.k
    public abstract T f(@Y61.k IBinder iBinder);

    public final void g() {
        p pVar = (p) this.f367039g.getValue();
        N0 n02 = pVar.f367084d;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        pVar.f367084d = C43259k.d(pVar.f367081a, null, null, new o(this.f367035c, pVar, null), 3);
    }

    @Y61.k
    public abstract String h();

    @Y61.k
    public final T11.f i() {
        return (T11.f) this.f367038f.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009e A[Catch: all -> 0x003a, TryCatch #9 {all -> 0x003a, blocks: (B:14:0x0035, B:58:0x00b4, B:21:0x004b, B:51:0x009a, B:53:0x009e, B:59:0x00b9, B:60:0x00ca), top: B:67:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.vk.push.core.ipc.b] */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(@Y61.k Y41.p r15, @Y61.k java.lang.String r16, @Y61.k Y41.p r17, @Y61.k Y41.l r18, @Y61.k Y41.l r19, long r20, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.ipc.b.j(Y41.p, java.lang.String, Y41.p, Y41.l, Y41.l, long, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean l() {
        Object objM = m();
        C10839b<T> c10839b = this.f367040h;
        this.f367040h = c10839b != null ? new C10839b<>(c10839b.f367046a, c10839b.f367047b, null) : null;
        T11.f fVarI = i();
        StringBuilder sb2 = new StringBuilder("Service connection is released success = ");
        int i12 = Z.f406624c;
        boolean z12 = !(objM instanceof Z.b);
        sb2.append(z12);
        fVarI.info(sb2.toString());
        this.f367036d.invoke(this);
        return z12;
    }

    public final Object m() {
        try {
            int i12 = Z.f406624c;
            if (this.f367041i.compareAndSet(true, false)) {
                i().info("Unbind service");
                this.f367033a.unbindService(this.f367044l);
            } else {
                i().info("Unbind service skipped");
            }
            return G0.f406611a;
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            return new Z.b(th2);
        }
    }
}
