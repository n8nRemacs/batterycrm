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

/* compiled from: SubScope.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/core/J;", "Lcom/avito/beduin/v2/engine/core/z;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class J implements z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final z f336595a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f336596b;

    public J(@Y61.k z zVar, @Y61.k String str) {
        this.f336595a = zVar;
        this.f336596b = str;
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j A() {
        return this.f336595a.A();
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final K B(@Y61.k p pVar, @Y61.l Object obj, @Y61.k C36240c c36240c) {
        return this.f336595a.B(pVar, obj, c36240c);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <T extends L> T C(@Y61.k String str) {
        return (T) this.f336595a.C(J(str));
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final ZT0.i D(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        return this.f336595a.D(interfaceC36274k, J(str));
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final InterfaceC36252b E(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str, @Y61.l Object obj) {
        return this.f336595a.E(interfaceC36274k, J(str), obj);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final boolean F() {
        return a().f336483j;
    }

    @Override // com.avito.beduin.v2.engine.s
    public final void G(@Y61.k dU0.f fVar) {
        this.f336595a.G(fVar);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.l
    public final Set<N> H() {
        return this.f336595a.H();
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final dU0.c I(@Y61.k String str) {
        return this.f336595a.I(str);
    }

    public final String J(String str) {
        return androidx.compose.foundation.H.o(new StringBuilder(), this.f336596b, '.', str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final com.avito.beduin.v2.engine.H a() {
        return this.f336595a.a();
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final void close() {
        this.f336595a.close();
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final boolean d(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str, @Y61.l Object obj) {
        return this.f336595a.d(interfaceC36274k, J(str), obj);
    }

    @Override // YT0.a
    @Y61.k
    /* renamed from: e */
    public final YT0.b getF175484a() {
        return this.f336595a.getF175484a();
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <R> u<R> f(@Y61.k u<R> uVar, @Y61.l Object obj, R r12) {
        return this.f336595a.f(uVar, obj, r12);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.l
    /* renamed from: g */
    public final c.a getF336697b() {
        return this.f336595a.getF336697b();
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    /* renamed from: getContext */
    public final InterfaceC36274k getF336696a() {
        return this.f336595a.getF336696a();
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final com.avito.beduin.v2.engine.component.y h(@Y61.k String str) {
        return this.f336595a.h(str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <R extends com.avito.beduin.v2.engine.field.d> y<R> k(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        return this.f336595a.k(interfaceC36274k, J(str));
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <T> u<T> l(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        return this.f336595a.l(interfaceC36274k, J(str));
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final InterfaceC36254d n(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        return this.f336595a.n(interfaceC36274k, J(str));
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final p o(@Y61.k C36239b.a aVar, @Y61.k String str) {
        return this.f336595a.o(aVar, J(str));
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final ZT0.a p(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        return this.f336595a.p(interfaceC36274k, J(str));
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final InterfaceC27104b q(@Y61.k String str) {
        return this.f336595a.q(str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final com.avito.beduin.v2.engine.field.j r(@Y61.k String str) {
        return this.f336595a.r(str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final <T> u<T> t(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k String str) {
        return this.f336595a.t(interfaceC36274k, J(str));
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final boolean u() {
        return a().f336484k;
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final C27107e v(@Y61.k String str) {
        return this.f336595a.v(str);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    public final void w(@Y61.k N n12) {
        this.f336595a.w(n12);
    }

    @Override // com.avito.beduin.v2.engine.core.z
    @Y61.k
    public final z x(@Y61.k String str, boolean z12) {
        return z12 ? this : new J(this, str);
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final AbstractC36250j z(@Y61.k String str) {
        return this.f336595a.z(str);
    }
}
