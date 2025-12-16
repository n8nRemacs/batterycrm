package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.N;
import com.avito.beduin.v2.engine.core.manager.c;
import com.avito.beduin.v2.engine.field.d;
import com.avito.beduin.v2.logger.LogLevel;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ResolvingValue.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/engine/core/m;", "Lcom/avito/beduin/v2/engine/field/d;", "T", "Lcom/avito/beduin/v2/engine/core/y;", "Lcom/avito/beduin/v2/engine/core/M;", "Lcom/avito/beduin/v2/engine/core/L;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.engine.core.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36263m<T extends com.avito.beduin.v2.engine.field.d> implements y<T>, M, L {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f336646a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36274k f336647b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.engine.field.f<? extends T> f336648c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> f336649d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public T f336650e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f336651f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f336652g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.manager.e f336653h = new com.avito.beduin.v2.engine.core.manager.e(this);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.manager.c f336654i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.manager.i f336655j;

    public C36263m(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        this.f336646a = str;
        this.f336647b = interfaceC36274k;
        this.f336654i = new com.avito.beduin.v2.engine.core.manager.c(interfaceC36274k, false, false, 6, null);
        this.f336655j = com.avito.beduin.v2.engine.m.a(interfaceC36274k, this);
    }

    @Override // com.avito.beduin.v2.engine.core.K
    /* renamed from: c, reason: from getter */
    public final boolean getF336651f() {
        return this.f336651f;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void destroy() {
        if (this.f336652g) {
            return;
        }
        this.f336652g = true;
        this.f336653h.b();
        this.f336654i.a();
        this.f336655j.b();
        if (this.f336651f) {
            this.f336648c = null;
            this.f336649d = null;
        }
    }

    @Override // com.avito.beduin.v2.engine.core.M
    public final void e(@Y61.k Y41.l<? super M, G0> lVar) {
        if (!this.f336651f || this.f336652g) {
            return;
        }
        this.f336650e = null;
        this.f336651f = false;
        this.f336655j.d(lVar);
    }

    @Override // com.avito.beduin.v2.engine.core.N
    @Y61.k
    public final N.a f(@Y61.k M m12, boolean z12) {
        return this.f336652g ? N.d.f336599a : this.f336655j.a(m12, z12);
    }

    @Override // com.avito.beduin.v2.engine.core.L
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final InterfaceC36274k getF336647b() {
        return this.f336647b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    @Override // com.avito.beduin.v2.engine.core.y
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.engine.core.K<T> h(@Y61.k com.avito.beduin.v2.engine.field.f<? extends T> r3, @Y61.k java.util.Map<com.avito.beduin.v2.engine.field.q, ? extends com.avito.beduin.v2.engine.core.K<? extends com.avito.beduin.v2.engine.field.d>> r4) {
        /*
            r2 = this;
            boolean r0 = r2.f336652g
            if (r0 != 0) goto L31
            com.avito.beduin.v2.engine.field.f<? extends T extends com.avito.beduin.v2.engine.field.d> r0 = r2.f336648c
            java.util.Map<com.avito.beduin.v2.engine.field.q, ? extends com.avito.beduin.v2.engine.core.K<? extends com.avito.beduin.v2.engine.field.d>> r1 = r2.f336649d
            r2.f336648c = r3
            r2.f336649d = r4
            boolean r3 = kotlin.jvm.internal.L.f(r0, r3)
            if (r3 == 0) goto L1e
            if (r1 != 0) goto L16
            r3 = 0
            goto L1c
        L16:
            com.avito.beduin.v2.engine.field.a$a r3 = com.avito.beduin.v2.engine.field.a.f336767b
            boolean r3 = r1.equals(r4)
        L1c:
            if (r3 != 0) goto L30
        L1e:
            com.avito.beduin.v2.engine.core.manager.h r3 = new com.avito.beduin.v2.engine.core.manager.h
            r3.<init>()
            com.avito.beduin.v2.engine.l r4 = new com.avito.beduin.v2.engine.l
            r4.<init>(r3)
            r2.e(r4)
            com.avito.beduin.v2.engine.k r4 = r2.f336647b
            r4.b(r3)
        L30:
            return r2
        L31:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Forbidden to modify a destroyed node"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.engine.core.C36263m.h(com.avito.beduin.v2.engine.field.f, java.util.Map):com.avito.beduin.v2.engine.core.K");
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void j() {
        if (this.f336652g) {
            return;
        }
        this.f336654i.b();
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.avito.beduin.v2.engine.core.K
    public final Object k(z zVar) {
        if (!this.f336652g) {
            zVar.w(this);
        }
        if (!this.f336651f) {
            com.avito.beduin.v2.engine.core.manager.e eVar = this.f336653h;
            String str = this.f336646a;
            boolean z12 = this.f336652g;
            InterfaceC36274k interfaceC36274k = this.f336647b;
            com.avito.beduin.v2.engine.core.manager.c cVar = this.f336654i;
            z vVar = !z12 ? new v(interfaceC36274k, new c.a(cVar.f336658a, cVar.f336660c)) : interfaceC36274k.i();
            try {
                try {
                    T t12 = (T) this.f336648c.a(vVar, this.f336649d);
                    Set<N> setH = vVar.H();
                    c.a f336697b = vVar.getF336697b();
                    RU0.b bVar = RU0.b.f14467a;
                    LogLevel[] logLevelArr = LogLevel.f337864b;
                    bVar.getClass();
                    if (RU0.b.f14469c <= 0) {
                        RU0.b.f14468b.f(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":Invalidating"), "ResolvingValue " + str + " calculated");
                    }
                    this.f336651f = true;
                    eVar.a(setH);
                    cVar.c(f336697b);
                    if (this.f336652g) {
                        this.f336649d = null;
                        this.f336648c = null;
                    }
                    vVar.close();
                    this.f336650e = t12;
                } catch (Exception e12) {
                    throw e12;
                }
            } catch (Throwable th2) {
                Set<N> setH2 = vVar.H();
                c.a f336697b2 = vVar.getF336697b();
                RU0.b bVar2 = RU0.b.f14467a;
                LogLevel[] logLevelArr2 = LogLevel.f337864b;
                bVar2.getClass();
                if (RU0.b.f14469c <= 0) {
                    RU0.b.f14468b.f(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":Invalidating"), "ResolvingValue " + str + " calculated");
                }
                this.f336651f = true;
                eVar.a(setH2);
                cVar.c(f336697b2);
                if (this.f336652g) {
                    this.f336649d = null;
                    this.f336648c = null;
                }
                vVar.close();
                throw th2;
            }
        }
        return this.f336650e;
    }

    @Override // com.avito.beduin.v2.engine.core.N
    public final void m(@Y61.k M m12) {
        this.f336655j.c(m12);
    }

    @Override // com.avito.beduin.v2.engine.core.L
    /* renamed from: p, reason: from getter */
    public final boolean getF336652g() {
        return this.f336652g;
    }
}
