package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.coreutils.services.a;
import com.yandex.metrica.networktasks.api.NetworkServiceLocator;
import j.InterfaceC42148d;

/* loaded from: classes7.dex */
class Sc implements Fc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f379364a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private C39057pi f379365b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private volatile C38976mc f379366c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final U7 f379367d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final T7 f379368e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f379369f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final C38803fd f379370g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.a f379371h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final a.c f379372i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f379373j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f379374k;

    public class a implements a.c {
        public a() {
        }

        @Override // com.yandex.metrica.coreutils.services.a.c
        @InterfaceC42148d
        public void onWaitFinished() {
            Sc.this.f379374k = true;
            Sc.a(Sc.this);
        }
    }

    public Sc(@j.N Context context, @j.N C39057pi c39057pi, @j.P C38976mc c38976mc, @j.N U7 u72, @j.N T7 t72, @j.N ICommonExecutor iCommonExecutor) {
        this(context, c39057pi, c38976mc, u72, t72, iCommonExecutor, new com.yandex.metrica.coreutils.services.e(), new C38803fd(), com.yandex.metrica.coreutils.services.h.f377659c.f377661b);
    }

    public static void a(Sc sc2) {
        C38976mc c38976mc = sc2.f379366c;
        if (c38976mc != null) {
            NetworkServiceLocator.f382415b.f382416a.a(sc2.f379370g.a(sc2.f379364a, sc2.f379365b, c38976mc, sc2));
        }
    }

    @j.k0
    public Sc(@j.N Context context, @j.N C39057pi c39057pi, @j.P C38976mc c38976mc, @j.N U7 u72, @j.N T7 t72, @j.N ICommonExecutor iCommonExecutor, @j.N com.yandex.metrica.coreutils.services.f fVar, @j.N C38803fd c38803fd, @j.N com.yandex.metrica.coreutils.services.a aVar) {
        this.f379374k = false;
        this.f379364a = context;
        this.f379366c = c38976mc;
        this.f379365b = c39057pi;
        this.f379367d = u72;
        this.f379368e = t72;
        this.f379373j = iCommonExecutor;
        this.f379369f = fVar;
        this.f379370g = c38803fd;
        this.f379371h = aVar;
        this.f379372i = new a();
    }

    @Override // com.yandex.metrica.impl.ob.Fc
    @InterfaceC42148d
    public void a() {
        boolean zA2 = a(this.f379367d);
        boolean zA3 = a(this.f379368e);
        if (zA2 || zA3) {
            if (!this.f379374k) {
                this.f379371h.a(com.yandex.metrica.coreutils.services.a.f377637c, this.f379373j, this.f379372i);
                return;
            }
            C38976mc c38976mc = this.f379366c;
            if (c38976mc != null) {
                NetworkServiceLocator.f382415b.f382416a.a(this.f379370g.a(this.f379364a, this.f379365b, c38976mc, this));
            }
        }
    }

    @InterfaceC42148d
    private boolean a(J7 j72) {
        if (this.f379366c != null) {
            if (this.f379366c != null) {
                if (j72.c() < r0.f381039c) {
                }
                return true;
            }
            C38976mc c38976mc = this.f379366c;
            if (c38976mc != null) {
                if (this.f379369f.b() - j72.b() > c38976mc.f381041e) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(@j.N C39057pi c39057pi) {
        this.f379365b = c39057pi;
    }

    public void a(@j.P C38976mc c38976mc) {
        this.f379366c = c38976mc;
    }
}
