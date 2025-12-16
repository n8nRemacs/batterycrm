package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.adjust.sdk.Constants;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: com.yandex.metrica.impl.ob.xb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39241xb implements Eb {

    /* renamed from: a, reason: collision with root package name */
    private final Object f382168a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private C39057pi f382169b;

    /* renamed from: c, reason: collision with root package name */
    private volatile FutureTask<Void> f382170c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final g f382171d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final g f382172e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final g f382173f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final InterfaceC39193vb f382174g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final InterfaceC39193vb f382175h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final InterfaceC39193vb f382176i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private Context f382177j;

    /* renamed from: k, reason: collision with root package name */
    @j.N
    private ICommonExecutor f382178k;

    /* renamed from: l, reason: collision with root package name */
    @j.N
    private volatile C39289zb f382179l;

    /* renamed from: com.yandex.metrica.impl.ob.xb$a */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            C39241xb c39241xb = C39241xb.this;
            C39169ub c39169ubA = C39241xb.a(c39241xb, c39241xb.f382177j);
            C39241xb c39241xb2 = C39241xb.this;
            C39169ub c39169ubB = C39241xb.b(c39241xb2, c39241xb2.f382177j);
            C39241xb c39241xb3 = C39241xb.this;
            c39241xb.f382179l = new C39289zb(c39169ubA, c39169ubB, C39241xb.a(c39241xb3, c39241xb3.f382177j, new Fb()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$b */
    public class b implements Callable<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f382181a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Gb f382182b;

        public b(Context context, Gb gb2) {
            this.f382181a = context;
            this.f382182b = gb2;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            C39289zb c39289zb = C39241xb.this.f382179l;
            C39241xb c39241xb = C39241xb.this;
            C39169ub c39169ubA = C39241xb.a(c39241xb, C39241xb.a(c39241xb, this.f382181a), c39289zb.a());
            C39241xb c39241xb2 = C39241xb.this;
            C39169ub c39169ubA2 = C39241xb.a(c39241xb2, C39241xb.b(c39241xb2, this.f382181a), c39289zb.b());
            C39241xb c39241xb3 = C39241xb.this;
            c39241xb.f382179l = new C39289zb(c39169ubA, c39169ubA2, C39241xb.a(c39241xb3, C39241xb.a(c39241xb3, this.f382181a, this.f382182b), c39289zb.c()));
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$c */
    public static class c implements g {
        @Override // com.yandex.metrica.impl.ob.C39241xb.g
        public boolean a(@j.P C39057pi c39057pi) {
            return true;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$d */
    public static class d implements g {
        @Override // com.yandex.metrica.impl.ob.C39241xb.g
        public boolean a(@j.P C39057pi c39057pi) {
            return c39057pi != null && (c39057pi.f().f379413v || !c39057pi.q());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$e */
    public static class e implements g {
        @Override // com.yandex.metrica.impl.ob.C39241xb.g
        public boolean a(@j.P C39057pi c39057pi) {
            return false;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$f */
    public static class f implements g {
        @Override // com.yandex.metrica.impl.ob.C39241xb.g
        public boolean a(@j.P C39057pi c39057pi) {
            return c39057pi != null && c39057pi.f().f379413v;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$g */
    public interface g {
        boolean a(@j.P C39057pi c39057pi);
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$h */
    public static class h implements g {
        @Override // com.yandex.metrica.impl.ob.C39241xb.g
        public boolean a(@j.P C39057pi c39057pi) {
            return c39057pi != null && (c39057pi.f().f379405n || !c39057pi.q());
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.xb$i */
    public static class i implements g {
        @Override // com.yandex.metrica.impl.ob.C39241xb.g
        public boolean a(@j.P C39057pi c39057pi) {
            return c39057pi != null && c39057pi.f().f379405n;
        }
    }

    public C39241xb(@j.N g gVar, @j.N g gVar2, @j.N g gVar3, @j.N ICommonExecutor iCommonExecutor, String str) {
        this(gVar, gVar2, gVar3, iCommonExecutor, new C39217wb(new Kb(Constants.REFERRER_API_GOOGLE)), new C39217wb(new Kb("huawei")), new C39217wb(new Kb("yandex")), str);
    }

    public static C39169ub a(C39241xb c39241xb, C39169ub c39169ub, C39169ub c39169ub2) {
        c39241xb.getClass();
        U0 u02 = c39169ub.f381929b;
        return u02 != U0.OK ? new C39169ub(c39169ub2.f381928a, u02, c39169ub.f381930c) : c39169ub;
    }

    public void c(@j.N Context context) {
        this.f382177j = context.getApplicationContext();
    }

    @j.k0
    public C39241xb(@j.N g gVar, @j.N g gVar2, @j.N g gVar3, @j.N ICommonExecutor iCommonExecutor, @j.N InterfaceC39193vb interfaceC39193vb, @j.N InterfaceC39193vb interfaceC39193vb2, @j.N InterfaceC39193vb interfaceC39193vb3, String str) {
        this.f382168a = new Object();
        this.f382171d = gVar;
        this.f382172e = gVar2;
        this.f382173f = gVar3;
        this.f382174g = interfaceC39193vb;
        this.f382175h = interfaceC39193vb2;
        this.f382176i = interfaceC39193vb3;
        this.f382178k = iCommonExecutor;
        this.f382179l = new C39289zb();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        /*
            r2 = this;
            android.content.Context r0 = r2.f382177j
            if (r0 == 0) goto L2b
            monitor-enter(r2)
            com.yandex.metrica.impl.ob.zb r0 = r2.f382179l     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.ub r0 = r0.a()     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.U0 r0 = r0.f381929b     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.U0 r1 = com.yandex.metrica.impl.ob.U0.UNKNOWN     // Catch: java.lang.Throwable -> L1d
            if (r0 == r1) goto L1f
            com.yandex.metrica.impl.ob.zb r0 = r2.f382179l     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.ub r0 = r0.b()     // Catch: java.lang.Throwable -> L1d
            com.yandex.metrica.impl.ob.U0 r0 = r0.f381929b     // Catch: java.lang.Throwable -> L1d
            if (r0 == r1) goto L1f
            r0 = 1
            goto L20
        L1d:
            r0 = move-exception
            goto L29
        L1f:
            r0 = 0
        L20:
            monitor-exit(r2)
            if (r0 != 0) goto L2b
            android.content.Context r0 = r2.f382177j
            r2.a(r0)
            goto L2b
        L29:
            monitor-exit(r2)
            throw r0
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C39241xb.c():void");
    }

    public void b(@j.N Context context) {
        this.f382177j = context.getApplicationContext();
        if (this.f382170c == null) {
            synchronized (this.f382168a) {
                try {
                    if (this.f382170c == null) {
                        this.f382170c = new FutureTask<>(new a());
                        this.f382178k.execute(this.f382170c);
                    }
                } finally {
                }
            }
        }
    }

    public void a(@j.N Context context, @j.P C39057pi c39057pi) {
        this.f382169b = c39057pi;
        b(context);
    }

    public void a(@j.N C39057pi c39057pi) {
        this.f382169b = c39057pi;
    }

    public static C39169ub b(C39241xb c39241xb, Context context) {
        if (c39241xb.f382172e.a(c39241xb.f382169b)) {
            return c39241xb.f382175h.a(context);
        }
        C39057pi c39057pi = c39241xb.f382169b;
        if (c39057pi != null && c39057pi.q()) {
            if (!c39241xb.f382169b.f().f379413v) {
                return new C39169ub(null, U0.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
            }
            return new C39169ub(null, U0.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new C39169ub(null, U0.NO_STARTUP, "startup has not been received yet");
    }

    @j.N
    public C39289zb a(@j.N Context context) throws ExecutionException, InterruptedException {
        b(context);
        try {
            this.f382170c.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f382179l;
    }

    @j.N
    public C39289zb a(@j.N Context context, @j.N Gb gb2) throws ExecutionException, InterruptedException {
        FutureTask futureTask = new FutureTask(new b(context.getApplicationContext(), gb2));
        this.f382178k.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
        return this.f382179l;
    }

    @Override // com.yandex.metrica.impl.ob.Eb
    @j.P
    @Deprecated
    public Boolean b() throws ExecutionException, InterruptedException {
        c();
        C39145tb c39145tb = this.f382179l.a().f381928a;
        if (c39145tb == null) {
            return null;
        }
        return c39145tb.f381873c;
    }

    public static C39169ub a(C39241xb c39241xb, Context context) {
        if (c39241xb.f382171d.a(c39241xb.f382169b)) {
            return c39241xb.f382174g.a(context);
        }
        C39057pi c39057pi = c39241xb.f382169b;
        if (c39057pi != null && c39057pi.q()) {
            if (!c39241xb.f382169b.f().f379405n) {
                return new C39169ub(null, U0.FEATURE_DISABLED, "startup forbade ads identifiers collecting");
            }
            return new C39169ub(null, U0.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
        }
        return new C39169ub(null, U0.NO_STARTUP, "startup has not been received yet");
    }

    public static C39169ub a(C39241xb c39241xb, Context context, Gb gb2) {
        if (c39241xb.f382173f.a(c39241xb.f382169b)) {
            return c39241xb.f382176i.a(context, gb2);
        }
        return new C39169ub(null, U0.UNKNOWN, "identifiers collecting is forbidden for unknown reason");
    }

    @Override // com.yandex.metrica.impl.ob.Eb
    @j.P
    @Deprecated
    public String a() throws ExecutionException, InterruptedException {
        c();
        C39145tb c39145tb = this.f382179l.a().f381928a;
        if (c39145tb == null) {
            return null;
        }
        return c39145tb.f381872b;
    }
}
