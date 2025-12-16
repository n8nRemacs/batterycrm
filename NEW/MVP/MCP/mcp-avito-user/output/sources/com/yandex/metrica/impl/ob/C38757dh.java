package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.a;
import com.yandex.metrica.impl.ob.C38682ah;
import com.yandex.metrica.impl.ob.InterfaceC38800fa;

/* renamed from: com.yandex.metrica.impl.ob.dh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C38757dh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final C38707bh f380384a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ProtobufStateStorage f380385b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final C39232x2 f380386c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f380387d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final a.c f380388e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.a f380389f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final C38682ah f380390g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f380391h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private C38733ci f380392i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f380393j;

    /* renamed from: k, reason: collision with root package name */
    private long f380394k;

    /* renamed from: l, reason: collision with root package name */
    private long f380395l;

    /* renamed from: m, reason: collision with root package name */
    private long f380396m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f380397n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f380398o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f380399p;

    /* renamed from: q, reason: collision with root package name */
    private final Object f380400q;

    /* renamed from: com.yandex.metrica.impl.ob.dh$a */
    public class a implements C38682ah.a {
        public a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$b */
    public class b implements a.c {
        public b() {
        }

        @Override // com.yandex.metrica.coreutils.services.a.c
        public void onWaitFinished() {
            C38757dh.this.f380399p = true;
            C38757dh.this.f380384a.a(C38757dh.this.f380390g);
        }
    }

    public C38757dh(@j.N Context context, @j.N ICommonExecutor iCommonExecutor) {
        this(new C38707bh(context, null, iCommonExecutor), InterfaceC38800fa.b.a(C38782eh.class).a(context), new C39232x2(), iCommonExecutor, com.yandex.metrica.coreutils.services.h.f377659c.f377661b);
    }

    public void a() {
        if (this.f380391h) {
            return;
        }
        this.f380391h = true;
        if (!this.f380399p) {
            this.f380389f.a(this.f380392i.f380347c, this.f380387d, this.f380388e);
        } else {
            this.f380384a.a(this.f380390g);
        }
    }

    public void b() {
        C38782eh c38782eh = (C38782eh) this.f380385b.read();
        this.f380396m = c38782eh.f380493c;
        this.f380397n = c38782eh.f380494d;
        this.f380398o = c38782eh.f380495e;
    }

    @j.k0
    public C38757dh(@j.N C38707bh c38707bh, @j.N ProtobufStateStorage protobufStateStorage, @j.N C39232x2 c39232x2, @j.N ICommonExecutor iCommonExecutor, @j.N com.yandex.metrica.coreutils.services.a aVar) {
        this.f380399p = false;
        this.f380400q = new Object();
        this.f380384a = c38707bh;
        this.f380385b = protobufStateStorage;
        this.f380390g = new C38682ah(protobufStateStorage, new a());
        this.f380386c = c39232x2;
        this.f380387d = iCommonExecutor;
        this.f380388e = new b();
        this.f380389f = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(@j.P com.yandex.metrica.impl.ob.C39057pi r9) {
        /*
            r8 = this;
            if (r9 != 0) goto L3
            goto L3b
        L3:
            boolean r0 = r8.f380393j
            r1 = 1
            if (r0 != 0) goto L10
            com.yandex.metrica.impl.ob.Sh r0 = r9.f()
            boolean r0 = r0.f379396e
            if (r0 == r1) goto L3c
        L10:
            com.yandex.metrica.impl.ob.ci r0 = r8.f380392i
            if (r0 == 0) goto L3c
            com.yandex.metrica.impl.ob.ci r2 = r9.K()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3c
            long r2 = r8.f380394k
            long r4 = r9.B()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L3c
            long r2 = r8.f380395l
            long r4 = r9.o()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L3c
            com.yandex.metrica.impl.ob.bh r0 = r8.f380384a
            boolean r0 = r0.b(r9)
            if (r0 == 0) goto L3b
            goto L3c
        L3b:
            r1 = 0
        L3c:
            java.lang.Object r0 = r8.f380400q
            monitor-enter(r0)
            if (r9 == 0) goto L5e
            com.yandex.metrica.impl.ob.Sh r2 = r9.f()     // Catch: java.lang.Throwable -> L5c
            boolean r2 = r2.f379396e     // Catch: java.lang.Throwable -> L5c
            r8.f380393j = r2     // Catch: java.lang.Throwable -> L5c
            com.yandex.metrica.impl.ob.ci r2 = r9.K()     // Catch: java.lang.Throwable -> L5c
            r8.f380392i = r2     // Catch: java.lang.Throwable -> L5c
            long r2 = r9.B()     // Catch: java.lang.Throwable -> L5c
            r8.f380394k = r2     // Catch: java.lang.Throwable -> L5c
            long r2 = r9.o()     // Catch: java.lang.Throwable -> L5c
            r8.f380395l = r2     // Catch: java.lang.Throwable -> L5c
            goto L5e
        L5c:
            r9 = move-exception
            goto Lb2
        L5e:
            com.yandex.metrica.impl.ob.bh r2 = r8.f380384a     // Catch: java.lang.Throwable -> L5c
            r2.a(r9)     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto Lb1
            java.lang.Object r9 = r8.f380400q
            monitor-enter(r9)
            boolean r0 = r8.f380393j     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lad
            com.yandex.metrica.impl.ob.ci r0 = r8.f380392i     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lad
            boolean r1 = r8.f380397n     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L9f
            boolean r1 = r8.f380398o     // Catch: java.lang.Throwable -> L8b
            if (r1 == 0) goto L8d
            com.yandex.metrica.impl.ob.x2 r2 = r8.f380386c     // Catch: java.lang.Throwable -> L8b
            long r3 = r8.f380396m     // Catch: java.lang.Throwable -> L8b
            long r5 = r0.f380348d     // Catch: java.lang.Throwable -> L8b
            java.lang.String r7 = "should retry sdk collecting"
            boolean r0 = r2.a(r3, r5, r7)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lad
            r8.a()     // Catch: java.lang.Throwable -> L8b
            goto Lad
        L8b:
            r0 = move-exception
            goto Laf
        L8d:
            com.yandex.metrica.impl.ob.x2 r1 = r8.f380386c     // Catch: java.lang.Throwable -> L8b
            long r2 = r8.f380396m     // Catch: java.lang.Throwable -> L8b
            long r4 = r0.f380345a     // Catch: java.lang.Throwable -> L8b
            java.lang.String r6 = "should collect sdk as usual"
            boolean r0 = r1.a(r2, r4, r6)     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto Lad
            r8.a()     // Catch: java.lang.Throwable -> L8b
            goto Lad
        L9f:
            long r1 = r8.f380394k     // Catch: java.lang.Throwable -> L8b
            long r3 = r8.f380395l     // Catch: java.lang.Throwable -> L8b
            long r1 = r1 - r3
            long r3 = r0.f380346b     // Catch: java.lang.Throwable -> L8b
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto Lad
            r8.a()     // Catch: java.lang.Throwable -> L8b
        Lad:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            goto Lb1
        Laf:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            throw r0
        Lb1:
            return
        Lb2:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C38757dh.b(com.yandex.metrica.impl.ob.pi):void");
    }

    public void a(@j.P C39057pi c39057pi) {
        C38782eh c38782eh = (C38782eh) this.f380385b.read();
        this.f380396m = c38782eh.f380493c;
        this.f380397n = c38782eh.f380494d;
        this.f380398o = c38782eh.f380495e;
        b(c39057pi);
    }
}
