package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.sg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39126sg {

    /* renamed from: a, reason: collision with root package name */
    private final Set<C39150tg> f381832a;

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private C38756dg f381833b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f381834c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final C38673a8 f381835d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final Context f381836e;

    /* renamed from: com.yandex.metrica.impl.ob.sg$a */
    public interface a {
        void a(@j.P C38756dg c38756dg);
    }

    @j.l0
    public C39126sg(@j.N Context context) {
        this(context, F0.g().w().a());
    }

    public synchronized void a(@j.P C38756dg c38756dg) {
        this.f381833b = c38756dg;
        this.f381834c = true;
        this.f381835d.a(c38756dg);
        this.f381835d.a(true);
        C38756dg c38756dg2 = this.f381833b;
        synchronized (this) {
            Iterator<C39150tg> it = this.f381832a.iterator();
            while (it.hasNext()) {
                it.next().a(c38756dg2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b() {
        if (this.f381834c) {
            return;
        }
        Context context = this.f381836e;
        new C38980mg(this, new C39222wg(context, F0.g().q().a()), new C38831gg(context), new C39246xg(context, null, 0 == true ? 1 : 0, 6)).b();
    }

    @j.k0
    public C39126sg(@j.N Context context, @j.N C38673a8 c38673a8) {
        this.f381832a = new HashSet();
        this.f381836e = context;
        this.f381835d = c38673a8;
        this.f381833b = c38673a8.g();
        this.f381834c = c38673a8.h();
    }

    @j.P
    public C38756dg a() {
        return this.f381833b;
    }

    public synchronized void a(@j.N C39150tg c39150tg) {
        this.f381832a.add(c39150tg);
        if (this.f381834c) {
            c39150tg.a(this.f381833b);
        }
    }
}
