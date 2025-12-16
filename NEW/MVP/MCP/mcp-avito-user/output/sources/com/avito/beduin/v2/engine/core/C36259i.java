package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.N;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: LambdaValue.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/engine/core/i;", "T", "Lcom/avito/beduin/v2/engine/core/p;", "Lcom/avito/beduin/v2/engine/core/N;", "Lcom/avito/beduin/v2/engine/core/M;", "b", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.engine.core.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36259i<T> implements p<T>, N, M {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final Y41.l f336628j;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f336629a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36274k f336630b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super z, ? extends T> f336631c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public InterfaceC42726C<? extends T> f336632d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f336633e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f336634f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.manager.c f336635g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.manager.e f336636h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.manager.i f336637i;

    /* compiled from: LambdaValue.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lcom/avito/beduin/v2/engine/core/z;", "", "invoke", "(Lcom/avito/beduin/v2/engine/core/z;)Ljava/lang/Void;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.beduin.v2.engine.core.i$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l {

        /* renamed from: l, reason: collision with root package name */
        public static final a f336638l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(Object obj) {
            throw new IllegalStateException();
        }
    }

    /* compiled from: LambdaValue.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/i$b;", "", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.engine.core.i$b */
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        f336628j = a.f336638l;
    }

    public C36259i(@Y61.k String str, @Y61.k InterfaceC36274k interfaceC36274k, @Y61.k Y41.l<? super z, ? extends T> lVar) {
        this.f336629a = str;
        this.f336630b = interfaceC36274k;
        this.f336631c = lVar;
        this.f336632d = C42727D.c(new C36260j(this));
        this.f336635g = new com.avito.beduin.v2.engine.core.manager.c(interfaceC36274k, false, false, 6, null);
        this.f336636h = new com.avito.beduin.v2.engine.core.manager.e(this);
        this.f336637i = com.avito.beduin.v2.engine.m.a(interfaceC36274k, this);
    }

    @Override // com.avito.beduin.v2.engine.core.K
    /* renamed from: c, reason: from getter */
    public final boolean getF336623g() {
        return this.f336633e;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void destroy() {
        if (this.f336634f) {
            return;
        }
        this.f336634f = true;
        this.f336635g.a();
        this.f336636h.b();
        this.f336637i.b();
        if (this.f336633e) {
            this.f336631c = f336628j;
        }
    }

    @Override // com.avito.beduin.v2.engine.core.M
    public final void e(@Y61.k Y41.l<? super M, G0> lVar) {
        if (!this.f336633e || this.f336634f) {
            return;
        }
        this.f336633e = false;
        this.f336632d = C42727D.c(new C36260j(this));
        this.f336637i.d(lVar);
    }

    @Override // com.avito.beduin.v2.engine.core.N
    @Y61.k
    public final N.a f(@Y61.k M m12, boolean z12) {
        return this.f336634f ? N.d.f336599a : this.f336637i.a(m12, z12);
    }

    @Override // com.avito.beduin.v2.engine.core.L
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final InterfaceC36274k getF336617a() {
        return this.f336630b;
    }

    @Override // com.avito.beduin.v2.engine.core.p
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final String getF336629a() {
        return this.f336629a;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void j() {
        if (this.f336634f) {
            return;
        }
        this.f336635g.b();
    }

    @Override // com.avito.beduin.v2.engine.core.K
    public final T k(@Y61.k z zVar) {
        if (!this.f336634f) {
            zVar.w(this);
        }
        return this.f336632d.getValue();
    }

    @Override // com.avito.beduin.v2.engine.core.N
    public final void m(@Y61.k M m12) {
        this.f336637i.c(m12);
    }

    @Override // com.avito.beduin.v2.engine.core.p
    public final void n(@Y61.k Y41.l<? super z, ? extends T> lVar) {
        if (this.f336634f) {
            throw new IllegalStateException("Forbidden to modify a destroyed node");
        }
        if (kotlin.jvm.internal.L.f(this.f336631c, lVar)) {
            return;
        }
        this.f336631c = lVar;
        com.avito.beduin.v2.engine.core.manager.h hVar = new com.avito.beduin.v2.engine.core.manager.h();
        e(new com.avito.beduin.v2.engine.l(hVar));
        this.f336630b.b(hVar);
    }

    @Override // com.avito.beduin.v2.engine.core.L
    /* renamed from: p, reason: from getter */
    public final boolean getF336624h() {
        return this.f336634f;
    }

    public /* synthetic */ C36259i(String str, InterfaceC36274k interfaceC36274k, Y41.l lVar, int i12, C42822w c42822w) {
        this(str, interfaceC36274k, (i12 & 4) != 0 ? f336628j : lVar);
    }
}
