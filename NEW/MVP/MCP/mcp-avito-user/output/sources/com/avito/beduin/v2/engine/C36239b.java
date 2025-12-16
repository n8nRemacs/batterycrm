package com.avito.beduin.v2.engine;

import cU0.C27107e;
import cU0.InterfaceC27104b;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.component.InterfaceC36249i;
import com.avito.beduin.v2.engine.core.C36259i;
import com.avito.beduin.v2.engine.exception.EngineBeduinException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinController.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/b;", "Lcom/avito/beduin/v2/engine/a;", "a", "b", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.engine.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36239b implements InterfaceC36238a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.p<InterfaceC36238a, dU0.f, G0> f336537a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f336538b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public a f336539c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public t f336540d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C36259i<InterfaceC36249i> f336541e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final D f336542f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public C10437b f336543g;

    /* compiled from: BeduinController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/b$b;", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.engine.b$b, reason: collision with other inner class name */
    public final class C10437b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f336549a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.engine.core.manager.h f336550b = new com.avito.beduin.v2.engine.core.manager.h();

        public C10437b(@Y61.k String str) {
            this.f336549a = str;
        }
    }

    /* compiled from: BeduinController.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/core/z;", "Lcom/avito/beduin/v2/engine/component/i;", "invoke", "(Lcom/avito/beduin/v2/engine/core/z;)Lcom/avito/beduin/v2/engine/component/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.beduin.v2.engine.b$c */
    public static final class c extends N implements Y41.l<com.avito.beduin.v2.engine.core.z, InterfaceC36249i> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ t f336552m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(t tVar) {
            super(1);
            this.f336552m = tVar;
        }

        @Override // Y41.l
        public final InterfaceC36249i invoke(com.avito.beduin.v2.engine.core.z zVar) {
            com.avito.beduin.v2.engine.core.z zVar2 = zVar;
            a aVar = C36239b.this.f336539c;
            com.avito.beduin.v2.engine.field.t.f336888a.getClass();
            String str = com.avito.beduin.v2.engine.field.t.f336889b;
            t tVar = this.f336552m;
            return (InterfaceC36249i) (zVar2.d(aVar, str, tVar) ? (com.avito.beduin.v2.engine.core.K) zVar2.C(str) : zVar2.B(zVar2.o(aVar, str), tVar, new C36240c(tVar))).k(zVar2);
        }
    }

    public C36239b() {
        throw null;
    }

    public C36239b(InterfaceC36274k interfaceC36274k, n nVar, Y41.p pVar, int i12, C42822w c42822w) {
        nVar = (i12 & 2) != 0 ? null : nVar;
        this.f336537a = pVar;
        H h12 = null;
        int i13 = 2;
        C42822w c42822w2 = null;
        a aVar = new a(this, interfaceC36274k, h12, i13, c42822w2);
        this.f336538b = aVar;
        this.f336539c = new a(this, aVar, h12, i13, c42822w2);
        C36259i<InterfaceC36249i> c36259i = new C36259i<>("BeduinController", aVar, C36265d.f336703l);
        this.f336541e = c36259i;
        E.f336419a.getClass();
        this.f336542f = E.c(c36259i);
        if (nVar != null) {
            e(nVar);
        }
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36238a
    @Y61.k
    public final C36272i c() {
        return this.f336539c.f336547d;
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36238a
    public final boolean d() {
        return this.f336539c.f336545b.f336482i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    @Override // com.avito.beduin.v2.engine.InterfaceC36238a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(@Y61.l com.avito.beduin.v2.engine.n r7) {
        /*
            r6 = this;
            com.avito.beduin.v2.engine.t r0 = r6.f336540d
            boolean r0 = kotlin.jvm.internal.L.f(r7, r0)
            if (r0 == 0) goto L9
            return
        L9:
            r0 = 0
            if (r7 == 0) goto L14
            com.avito.beduin.v2.engine.t$a r1 = com.avito.beduin.v2.engine.t.f336899f
            r1.getClass()
            com.avito.beduin.v2.engine.t r7 = (com.avito.beduin.v2.engine.t) r7
            goto L15
        L14:
            r7 = r0
        L15:
            if (r7 == 0) goto L4b
            com.avito.beduin.v2.engine.t r1 = r6.f336540d
            if (r1 == 0) goto L1e
            com.avito.beduin.v2.engine.H$a r1 = r1.f336902b
            goto L1f
        L1e:
            r1 = r0
        L1f:
            com.avito.beduin.v2.engine.H$a r2 = r7.f336902b
            boolean r1 = kotlin.jvm.internal.L.f(r2, r1)
            com.avito.beduin.v2.engine.H$b r3 = r7.f336903c
            if (r1 == 0) goto L35
            com.avito.beduin.v2.engine.t r1 = r6.f336540d
            if (r1 == 0) goto L2f
            com.avito.beduin.v2.engine.H$b r0 = r1.f336903c
        L2f:
            boolean r0 = kotlin.jvm.internal.L.f(r3, r0)
            if (r0 != 0) goto L4b
        L35:
            com.avito.beduin.v2.engine.b$a r0 = new com.avito.beduin.v2.engine.b$a
            com.avito.beduin.v2.engine.b$a r1 = r6.f336538b
            com.avito.beduin.v2.engine.H r4 = r1.f336545b
            com.avito.beduin.v2.engine.H r5 = new com.avito.beduin.v2.engine.H
            com.avito.beduin.v2.engine.H$a r4 = r4.f336474a
            com.avito.beduin.v2.engine.H$a r2 = r4.a(r2)
            r5.<init>(r2, r3)
            r0.<init>(r1, r5)
            r6.f336539c = r0
        L4b:
            java.lang.String r0 = com.avito.beduin.v2.engine.utils.f.a()
            r6.h(r0)
            r6.f336540d = r7
            com.avito.beduin.v2.engine.b$c r1 = new com.avito.beduin.v2.engine.b$c
            r1.<init>(r7)
            com.avito.beduin.v2.engine.core.i<com.avito.beduin.v2.engine.component.i> r7 = r6.f336541e
            r7.n(r1)
            r6.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.beduin.v2.engine.C36239b.e(com.avito.beduin.v2.engine.n):void");
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36238a
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final D getF336542f() {
        return this.f336542f;
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36238a
    @Y61.l
    /* renamed from: g, reason: from getter */
    public final t getF336540d() {
        return this.f336540d;
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36238a
    public final void h(@Y61.k String str) {
        if (this.f336543g == null) {
            this.f336543g = new C10437b(str);
        }
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36238a
    public final void i(@Y61.k String str) {
        C10437b c10437b = this.f336543g;
        if (L.f(c10437b != null ? c10437b.f336549a : null, str)) {
            c10437b.f336550b.a();
            this.f336543g = null;
        }
    }

    /* compiled from: BeduinController.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/b$a;", "Lcom/avito/beduin/v2/engine/f;", "Lcom/avito/beduin/v2/engine/k;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.engine.b$a */
    public final class a implements InterfaceC36267f, InterfaceC36274k {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC36274k f336544a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final H f336545b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.engine.core.F f336546c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final C36272i f336547d;

        public a(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k H h12) {
            this.f336544a = interfaceC36274k;
            this.f336545b = h12;
            this.f336546c = new com.avito.beduin.v2.engine.core.F(this);
            this.f336547d = new C36272i(h12);
        }

        @Override // com.avito.beduin.v2.engine.s
        public final void G(@Y61.k dU0.f fVar) {
            C36239b c36239b = C36239b.this;
            c36239b.f336537a.invoke(c36239b, fVar);
        }

        @Override // com.avito.beduin.v2.engine.r
        @Y61.k
        public final dU0.c I(@Y61.k String str) {
            return this.f336544a.I(str);
        }

        @Override // com.avito.beduin.v2.engine.InterfaceC36274k
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final H getF336545b() {
            return this.f336545b;
        }

        @Override // com.avito.beduin.v2.engine.s, com.avito.beduin.v2.engine.v
        public final void b(@Y61.k com.avito.beduin.v2.engine.core.manager.h hVar) {
            C10437b c10437b = C36239b.this.f336543g;
            if (c10437b == null) {
                this.f336544a.b(hVar);
            } else {
                c10437b.f336550b.f336671a.add(hVar);
            }
        }

        @Override // com.avito.beduin.v2.engine.InterfaceC36274k
        @Y61.k
        /* renamed from: c, reason: from getter */
        public final C36272i getF336470a() {
            return this.f336547d;
        }

        @Override // YT0.a
        @Y61.k
        /* renamed from: e */
        public final YT0.b getF175484a() {
            return this.f336544a.getF175484a();
        }

        @Override // com.avito.beduin.v2.engine.r
        @Y61.k
        public final com.avito.beduin.v2.engine.component.y h(@Y61.k String str) {
            return this.f336544a.h(str);
        }

        @Override // com.avito.beduin.v2.engine.InterfaceC36274k
        @Y61.k
        public final com.avito.beduin.v2.engine.core.z i() {
            return this.f336546c;
        }

        @Override // com.avito.beduin.v2.engine.InterfaceC36274k
        @Y61.k
        /* renamed from: j */
        public final o getF336471b() {
            return this.f336544a.getF336471b();
        }

        @Override // com.avito.beduin.v2.engine.InterfaceC36274k
        @Y61.k
        public final InterfaceC36274k m(@Y61.k J j12) {
            return new G(this, this.f336547d, this.f336544a.getF336471b(), j12);
        }

        @Override // com.avito.beduin.v2.engine.r
        @Y61.k
        public final InterfaceC27104b q(@Y61.k String str) {
            return this.f336544a.q(str);
        }

        @Override // com.avito.beduin.v2.engine.InterfaceC36274k
        @Y61.k
        /* renamed from: s */
        public final J getF336472c() {
            return this.f336544a.getF336472c();
        }

        @Override // com.avito.beduin.v2.engine.r
        @Y61.k
        public final C27107e v(@Y61.k String str) {
            return this.f336544a.v(str);
        }

        @Override // com.avito.beduin.v2.engine.InterfaceC36274k
        public final void y(@Y61.k EngineBeduinException engineBeduinException) {
            this.f336544a.y(engineBeduinException);
        }

        @Override // com.avito.beduin.v2.engine.r
        @Y61.k
        public final AbstractC36250j z(@Y61.k String str) {
            return this.f336544a.z(str);
        }

        public /* synthetic */ a(C36239b c36239b, InterfaceC36274k interfaceC36274k, H h12, int i12, C42822w c42822w) {
            this(interfaceC36274k, (i12 & 2) != 0 ? interfaceC36274k.getF336545b() : h12);
        }
    }
}
