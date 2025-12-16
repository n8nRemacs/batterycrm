package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer;
import com.yandex.metrica.networktasks.api.IExecutionPolicy;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.uh, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39175uh {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final Context f381967a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final B0 f381968b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final ICommonExecutor f381969c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final CacheControlHttpsConnectionPerformer f381970d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final InterfaceC39056ph f381971e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.f f381972f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final IExecutionPolicy f381973g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final com.yandex.metrica.coreutils.services.a f381974h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f381975i;

    public C39175uh(@j.N Context context) {
        B0 b02 = new B0();
        F0.g().t().getClass();
        this(context, b02, new CacheControlHttpsConnectionPerformer(), new com.yandex.metrica.coreutils.services.e(), new C39027od(context), F0.g().q().g(), F0.g().s(), com.yandex.metrica.coreutils.services.h.f377659c.f377661b);
    }

    public static void c(C39175uh c39175uh) {
        synchronized (c39175uh) {
            c39175uh.f381975i = false;
        }
    }

    public synchronized void a(@j.N C39057pi c39057pi, @j.N Eh eh2) {
        try {
            C38758di c38758diM = c39057pi.M();
            if (c38758diM == null) {
                return;
            }
            File fileA = this.f381968b.a(this.f381967a, "certificate.p12");
            boolean z12 = fileA != null && fileA.exists();
            if (z12) {
                eh2.a(fileA);
            }
            long jC2 = this.f381972f.c();
            long jA2 = this.f381971e.a();
            if ((!z12 || jC2 >= jA2) && !this.f381975i) {
                String strE = c39057pi.e();
                if (!TextUtils.isEmpty(strE) && this.f381973g.canBeExecuted()) {
                    this.f381975i = true;
                    this.f381974h.a(com.yandex.metrica.coreutils.services.a.f377637c, this.f381969c, new C39127sh(this, strE, fileA, eh2, c38758diM));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @j.k0
    public C39175uh(@j.N Context context, @j.N B0 b02, @j.N CacheControlHttpsConnectionPerformer cacheControlHttpsConnectionPerformer, @j.N com.yandex.metrica.coreutils.services.f fVar, @j.N IExecutionPolicy iExecutionPolicy, @j.N ICommonExecutor iCommonExecutor, @j.N InterfaceC39056ph interfaceC39056ph, @j.N com.yandex.metrica.coreutils.services.a aVar) {
        this.f381975i = false;
        this.f381967a = context;
        this.f381968b = b02;
        this.f381970d = cacheControlHttpsConnectionPerformer;
        this.f381972f = fVar;
        this.f381973g = iExecutionPolicy;
        this.f381969c = iCommonExecutor;
        this.f381971e = interfaceC39056ph;
        this.f381974h = aVar;
    }

    public static void a(C39175uh c39175uh, long j12) {
        c39175uh.f381971e.a(c39175uh.f381972f.c() + j12);
    }
}
