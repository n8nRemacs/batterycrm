package com.avito.beduin.v2.engine.core;

import cU0.C27107e;
import cU0.InterfaceC27104b;
import com.avito.beduin.v2.engine.C36239b;
import com.avito.beduin.v2.engine.C36240c;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.core.manager.c;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SilentScope.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/beduin/v2/engine/core/F;", "Lcom/avito/beduin/v2/engine/core/z;", "Lcom/avito/beduin/v2/engine/r;", "LYT0/a;", "Lcom/avito/beduin/v2/engine/s;", "a", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class F implements z, com.avito.beduin.v2.engine.r, YT0.a, com.avito.beduin.v2.engine.s {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f336593b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36274k f336594a;

    /* compiled from: SilentScope.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/F$a;", "Lcom/avito/beduin/v2/engine/core/F;", "<init>", "()V", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends F {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
            super(com.avito.beduin.v2.engine.I.f336529a);
        }
    }

    public F(@Y61.k InterfaceC36274k interfaceC36274k) {
        this.f336594a = interfaceC36274k;
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j A() {
        return new com.avito.beduin.v2.engine.field.o(com.avito.beduin.v2.engine.utils.f.a(), null);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final K B(@Y61.k p pVar, @Y61.l Object obj, @Y61.k C36240c c36240c) {
        pVar.n(c36240c);
        return pVar;
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <T extends L> T C(@Y61.k String str) {
        throw new IllegalStateException("SilentWriteScope doesn't have cache. Use declareValue and update instead");
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final ZT0.i D(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        return new ZT0.h(interfaceC36274k);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final InterfaceC36252b E(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str, @Y61.l Object obj) {
        return new x(interfaceC36274k);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final boolean F() {
        return a().f336483j;
    }

    @Override // com.avito.beduin.v2.engine.s
    public final void G(@Y61.k dU0.f fVar) {
        this.f336594a.G(fVar);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.l
    public final Set<N> H() {
        return null;
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final dU0.c I(@Y61.k String str) {
        return this.f336594a.I(str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final com.avito.beduin.v2.engine.H a() {
        return this.f336594a.getF336545b();
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final boolean d(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str, @Y61.l Object obj) {
        return false;
    }

    @Override // YT0.a
    @Y61.k
    /* renamed from: e */
    public final YT0.b getF175484a() {
        return this.f336594a.getF175484a();
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <R> u<R> f(@Y61.k u<R> uVar, @Y61.l Object obj, R r12) {
        uVar.set(r12);
        return uVar;
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.l
    public final c.a g() {
        return null;
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    /* renamed from: getContext, reason: from getter */
    public final InterfaceC36274k getF336594a() {
        return this.f336594a;
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final com.avito.beduin.v2.engine.component.y h(@Y61.k String str) {
        return this.f336594a.h(str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <R extends com.avito.beduin.v2.engine.field.d> y<R> k(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        return new t(interfaceC36274k);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <T> u<T> l(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        return getF336594a().s().f336536a.a(interfaceC36274k, str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final InterfaceC36254d n(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        return new q(interfaceC36274k);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final p o(@Y61.k C36239b.a aVar, @Y61.k String str) {
        return new s(aVar, str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final ZT0.a p(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        return new ZT0.f(interfaceC36274k);
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final InterfaceC27104b q(@Y61.k String str) {
        return this.f336594a.q(str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j r(@Y61.k String str) {
        return new com.avito.beduin.v2.engine.field.o(com.avito.beduin.v2.engine.utils.f.a(), str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <T> u<T> t(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        return new C36261k(interfaceC36274k, str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final boolean u() {
        return a().f336484k;
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final C27107e v(@Y61.k String str) {
        return this.f336594a.v(str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final z x(@Y61.k String str, boolean z12) {
        return z12 ? this : new J(this, str);
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final AbstractC36250j z(@Y61.k String str) {
        return this.f336594a.z(str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final void close() {
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final void w(@Y61.k N n12) {
    }
}
