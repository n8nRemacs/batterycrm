package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.InterfaceC36274k;
import com.avito.beduin.v2.engine.core.N;
import com.avito.beduin.v2.engine.field.d;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ResolvingValue.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/t;", "Lcom/avito/beduin/v2/engine/field/d;", "T", "Lcom/avito/beduin/v2/engine/core/y;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class t<T extends com.avito.beduin.v2.engine.field.d> implements y<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36274k f336691a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public com.avito.beduin.v2.engine.field.f<? extends T> f336692b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> f336693c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public T f336694d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f336695e;

    public t(@Y61.k InterfaceC36274k interfaceC36274k) {
        this.f336691a = interfaceC36274k;
    }

    @Override // com.avito.beduin.v2.engine.core.K
    /* renamed from: c, reason: from getter */
    public final boolean getF336695e() {
        return this.f336695e;
    }

    @Override // com.avito.beduin.v2.engine.core.N
    public final N.a f(M m12, boolean z12) {
        return N.d.f336599a;
    }

    @Override // com.avito.beduin.v2.engine.core.y
    @Y61.k
    public final K<T> h(@Y61.k com.avito.beduin.v2.engine.field.f<? extends T> fVar, @Y61.k Map<com.avito.beduin.v2.engine.field.q, ? extends K<? extends com.avito.beduin.v2.engine.field.d>> map) {
        if (!this.f336695e) {
            this.f336692b = fVar;
            this.f336693c = map;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.beduin.v2.engine.field.f<? extends T extends com.avito.beduin.v2.engine.field.d>, java.util.Map<com.avito.beduin.v2.engine.field.q, ? extends com.avito.beduin.v2.engine.core.K<? extends com.avito.beduin.v2.engine.field.d>>] */
    @Override // com.avito.beduin.v2.engine.core.K
    public final Object k(z zVar) {
        if (!this.f336695e) {
            ?? r02 = (com.avito.beduin.v2.engine.field.f<? extends T>) null;
            try {
                this.f336694d = (T) this.f336692b.a(this.f336691a.i(), this.f336693c);
            } finally {
                this.f336695e = true;
                this.f336692b = null;
                this.f336693c = null;
            }
        }
        return this.f336694d;
    }

    @Override // com.avito.beduin.v2.engine.core.N
    public final void m(@Y61.k M m12) {
    }
}
