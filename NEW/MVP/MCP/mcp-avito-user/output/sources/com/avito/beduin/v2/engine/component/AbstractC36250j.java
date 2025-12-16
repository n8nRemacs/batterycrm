package com.avito.beduin.v2.engine.component;

import cU0.C27107e;
import cU0.InterfaceC27104b;
import com.avito.beduin.v2.engine.C36239b;
import com.avito.beduin.v2.engine.C36240c;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.InterfaceC36252b;
import com.avito.beduin.v2.engine.core.InterfaceC36254d;
import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.core.L;
import com.avito.beduin.v2.engine.core.N;
import com.avito.beduin.v2.engine.core.manager.c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ComponentStateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/component/j;", "", "a", "b", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.beduin.v2.engine.component.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC36250j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f336560a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f336561b;

    /* compiled from: ComponentStateFactory.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/engine/component/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.engine.component.j$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ComponentStateFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/component/j$b;", "Lcom/avito/beduin/v2/engine/core/z;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.beduin.v2.engine.component.j$b */
    public static final class b implements com.avito.beduin.v2.engine.core.z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.engine.core.z f336562a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.beduin.v2.engine.field.m f336563b;

        public b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) {
            this.f336562a = zVar;
            this.f336563b = mVar;
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final com.avito.beduin.v2.engine.field.j A() {
            return this.f336562a.A();
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final K B(@Y61.k com.avito.beduin.v2.engine.core.p pVar, @Y61.l Object obj, @Y61.k C36240c c36240c) {
            return this.f336562a.B(pVar, obj, c36240c);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final <T extends L> T C(@Y61.k String str) {
            return (T) this.f336562a.C(str);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final ZT0.i D(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
            return this.f336562a.D(interfaceC36274k, str);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final InterfaceC36252b E(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str, @Y61.l Object obj) {
            return this.f336562a.E(interfaceC36274k, str, obj);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        public final boolean F() {
            return this.f336562a.F();
        }

        @Override // com.avito.beduin.v2.engine.s
        public final void G(@Y61.k dU0.f fVar) {
            this.f336562a.G(fVar);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.l
        public final Set<N> H() {
            return this.f336562a.H();
        }

        @Override // com.avito.beduin.v2.engine.r
        @Y61.k
        public final dU0.c I(@Y61.k String str) {
            return this.f336562a.I(str);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final com.avito.beduin.v2.engine.H a() {
            return this.f336562a.a();
        }

        @Override // com.avito.beduin.v2.engine.core.z
        public final void close() {
            this.f336562a.close();
        }

        @Override // com.avito.beduin.v2.engine.core.z
        public final boolean d(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str, @Y61.l Object obj) {
            return this.f336562a.d(interfaceC36274k, str, obj);
        }

        @Override // YT0.a
        @Y61.k
        /* renamed from: e */
        public final YT0.b getF175484a() {
            return this.f336562a.getF175484a();
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final <R> com.avito.beduin.v2.engine.core.u<R> f(@Y61.k com.avito.beduin.v2.engine.core.u<R> uVar, @Y61.l Object obj, R r12) {
            return this.f336562a.f(uVar, obj, r12);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.l
        public final c.a g() {
            return this.f336562a.g();
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        /* renamed from: getContext */
        public final InterfaceC36274k getF336594a() {
            return this.f336562a.getF336594a();
        }

        @Override // com.avito.beduin.v2.engine.r
        @Y61.k
        public final y h(@Y61.k String str) {
            return this.f336562a.h(str);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final <R extends com.avito.beduin.v2.engine.field.d> com.avito.beduin.v2.engine.core.y<R> k(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
            return this.f336562a.k(interfaceC36274k, str);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final <T> com.avito.beduin.v2.engine.core.u<T> l(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
            return this.f336562a.l(interfaceC36274k, str);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final InterfaceC36254d n(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
            return this.f336562a.n(interfaceC36274k, str);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final com.avito.beduin.v2.engine.core.p o(@Y61.k C36239b.a aVar, @Y61.k String str) {
            return this.f336562a.o(aVar, str);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final ZT0.a p(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
            return this.f336562a.p(interfaceC36274k, str);
        }

        @Override // com.avito.beduin.v2.engine.r
        @Y61.k
        public final InterfaceC27104b q(@Y61.k String str) {
            return this.f336562a.q(str);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final com.avito.beduin.v2.engine.field.j r(@Y61.k String str) {
            return this.f336562a.r(str);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final <T> com.avito.beduin.v2.engine.core.u<T> t(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
            return this.f336562a.t(interfaceC36274k, str);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        public final boolean u() {
            return this.f336562a.u();
        }

        @Override // com.avito.beduin.v2.engine.r
        @Y61.k
        public final C27107e v(@Y61.k String str) {
            return this.f336562a.v(str);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        public final void w(@Y61.k N n12) {
            this.f336562a.w(n12);
        }

        @Override // com.avito.beduin.v2.engine.core.z
        @Y61.k
        public final com.avito.beduin.v2.engine.core.z x(@Y61.k String str, boolean z12) {
            return this.f336562a.x(str, z12);
        }

        @Override // com.avito.beduin.v2.engine.r
        @Y61.k
        public final AbstractC36250j z(@Y61.k String str) {
            return this.f336562a.z(str);
        }
    }

    static {
        new a(null);
    }

    public AbstractC36250j(@Y61.k String str, boolean z12) {
        this.f336560a = str;
        this.f336561b = z12;
    }

    @Y61.l
    public Object a(@Y61.k b bVar, @Y61.k String str) {
        throw new kotlin.G(null, 1, null);
    }

    @Y61.k
    public final String toString() {
        return "ComponentStateFactory(type=" + this.f336560a + ", " + hashCode() + ')';
    }

    public /* synthetic */ AbstractC36250j(String str, boolean z12, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? false : z12);
    }
}
