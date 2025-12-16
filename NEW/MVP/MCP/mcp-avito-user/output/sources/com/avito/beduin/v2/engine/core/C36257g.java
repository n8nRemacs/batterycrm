package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.N;
import com.avito.beduin.v2.engine.core.manager.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CalculationBlock.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/g;", "Lcom/avito/beduin/v2/engine/core/b;", "Lcom/avito/beduin/v2/engine/core/L;", "Lcom/avito/beduin/v2/engine/core/M;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.engine.core.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36257g implements InterfaceC36252b, L, M {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36274k f336609a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.manager.e f336610b = new com.avito.beduin.v2.engine.core.manager.e(this);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.manager.c f336611c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public v f336612d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Object f336613e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public N.a f336614f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f336615g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f336616h;

    public C36257g(@Y61.k InterfaceC36274k interfaceC36274k) {
        this.f336609a = interfaceC36274k;
        this.f336611c = new com.avito.beduin.v2.engine.core.manager.c(interfaceC36274k, false, false, 6, null);
    }

    @Override // com.avito.beduin.v2.engine.core.InterfaceC36252b
    @Y61.l
    /* renamed from: a */
    public final Object getF336702c() {
        if (this.f336616h) {
            return this.f336613e;
        }
        throw new IllegalStateException("CalculationBlock hasn't been calculated yet");
    }

    @Override // com.avito.beduin.v2.engine.core.InterfaceC36252b
    /* renamed from: c, reason: from getter */
    public final boolean getF336616h() {
        return this.f336616h;
    }

    @Override // com.avito.beduin.v2.engine.core.InterfaceC36252b
    public final void clear() {
        this.f336613e = null;
        this.f336616h = false;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void destroy() {
        if (this.f336615g) {
            return;
        }
        this.f336615g = true;
        this.f336610b.b();
        this.f336611c.a();
        N.a aVar = this.f336614f;
        if (aVar != null) {
            aVar.dispose();
        }
        this.f336614f = null;
    }

    @Override // com.avito.beduin.v2.engine.core.M
    public final void e(@Y61.k Y41.l<? super M, G0> lVar) {
        v vVar;
        M f336602b;
        if (this.f336616h && !this.f336615g && (vVar = this.f336612d) == null && vVar == null) {
            clear();
            N.a aVar = this.f336614f;
            if (aVar == null || (f336602b = aVar.getF336602b()) == null) {
                return;
            }
            f336602b.e(lVar);
        }
    }

    @Override // com.avito.beduin.v2.engine.core.N
    @Y61.k
    public final N.a f(@Y61.k M m12, boolean z12) {
        if (this.f336615g) {
            return N.d.f336599a;
        }
        N.a aVar = this.f336614f;
        if (kotlin.jvm.internal.L.f(aVar != null ? aVar.getF336602b() : null, m12)) {
            return aVar;
        }
        if (aVar != null) {
            aVar.dispose();
        }
        N.a cVar = this.f336609a.getF336924h().f336488o ? new N.c(this, m12) : new N.e(this, m12);
        this.f336614f = cVar;
        return cVar;
    }

    @Override // com.avito.beduin.v2.engine.core.InterfaceC36252b
    @Y61.k
    public final z g() {
        if (this.f336615g) {
            throw new IllegalStateException("Forbidden to modify a destroyed node");
        }
        if (this.f336612d != null) {
            throw new IllegalStateException("Scope has been already opened early and not closed yet");
        }
        clear();
        com.avito.beduin.v2.engine.core.manager.c cVar = this.f336611c;
        v vVar = new v(this.f336609a, new c.a(cVar.f336658a, cVar.f336660c));
        this.f336612d = vVar;
        return vVar;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final InterfaceC36274k getF336647b() {
        return this.f336609a;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void j() {
        if (this.f336615g) {
            return;
        }
        this.f336611c.b();
    }

    @Override // com.avito.beduin.v2.engine.core.InterfaceC36252b
    public final void l(@Y61.l Object obj) {
        this.f336613e = obj;
        this.f336616h = true;
        v vVar = this.f336612d;
        if (vVar == null) {
            throw new IllegalStateException("Scope has been closed earlier. It can be an error");
        }
        this.f336610b.a(C42745f0.P0(vVar.f336698c));
        this.f336611c.c(vVar.f336697b);
        vVar.close();
        this.f336612d = null;
    }

    @Override // com.avito.beduin.v2.engine.core.N
    public final void m(@Y61.k M m12) {
        N.a aVar = this.f336614f;
        if (aVar == null || !aVar.getF336603c()) {
            return;
        }
        this.f336614f = null;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    /* renamed from: p, reason: from getter */
    public final boolean getF336652g() {
        return this.f336615g;
    }
}
