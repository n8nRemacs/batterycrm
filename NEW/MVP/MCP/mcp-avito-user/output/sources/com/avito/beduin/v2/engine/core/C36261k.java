package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.N;
import com.avito.beduin.v2.engine.core.u;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MutableValue.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/k;", "T", "Lcom/avito/beduin/v2/engine/core/u;", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.engine.core.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36261k<T> implements u<T> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f336640f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f336641a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36274k f336642b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public T f336643c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f336644d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.manager.i f336645e;

    /* compiled from: MutableValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/k$a;", "Lcom/avito/beduin/v2/engine/core/u$a;", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.engine.core.k$a */
    public static final class a implements u.a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // com.avito.beduin.v2.engine.core.u.a
        public final u a(InterfaceC36274k interfaceC36274k, String str) {
            return new C36261k(interfaceC36274k, str);
        }

        public a() {
        }
    }

    public C36261k(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        this.f336641a = str;
        this.f336642b = interfaceC36274k;
        this.f336645e = com.avito.beduin.v2.engine.m.a(interfaceC36274k, this);
    }

    @Override // com.avito.beduin.v2.engine.core.K
    /* renamed from: c, reason: from getter */
    public final boolean getF336695e() {
        return this.f336644d;
    }

    @Override // com.avito.beduin.v2.engine.core.N
    @Y61.k
    public final N.a f(@Y61.k M m12, boolean z12) {
        return this.f336645e.a(m12, z12);
    }

    @Override // com.avito.beduin.v2.engine.core.L
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final InterfaceC36274k getF336700a() {
        return this.f336642b;
    }

    @Override // com.avito.beduin.v2.engine.core.u
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final String getF336641a() {
        return this.f336641a;
    }

    @Override // com.avito.beduin.v2.engine.core.K
    public final T k(@Y61.k z zVar) {
        zVar.w(this);
        return this.f336643c;
    }

    @Override // com.avito.beduin.v2.engine.core.N
    public final void m(@Y61.k M m12) {
        this.f336645e.c(m12);
    }

    @Override // com.avito.beduin.v2.engine.core.L
    /* renamed from: p */
    public final boolean getF336689e() {
        return false;
    }

    @Override // com.avito.beduin.v2.engine.core.u
    public final void set(T t12) {
        if (this.f336644d && kotlin.jvm.internal.L.f(this.f336643c, t12)) {
            return;
        }
        this.f336643c = t12;
        this.f336644d = true;
        com.avito.beduin.v2.engine.core.manager.h hVar = new com.avito.beduin.v2.engine.core.manager.h();
        this.f336645e.d(new com.avito.beduin.v2.engine.l(hVar));
        this.f336642b.b(hVar);
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void destroy() {
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void j() {
    }
}
