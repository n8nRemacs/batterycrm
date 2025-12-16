package com.avito.beduin.v2.engine.core;

import com.avito.beduin.v2.engine.C36239b;
import com.avito.beduin.v2.engine.C36240c;
import com.avito.beduin.v2.engine.InterfaceC36274k;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: LambdaValue.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/core/s;", "T", "Lcom/avito/beduin/v2/engine/core/G;", "Lcom/avito/beduin/v2/engine/core/p;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s<T> extends G<T> implements p<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36239b.a f336685a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f336686b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public C36240c f336687c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f336688d = C42727D.c(new r(this));

    /* renamed from: e, reason: collision with root package name */
    public final boolean f336689e = true;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f336690f = true;

    public s(@Y61.k C36239b.a aVar, @Y61.k String str) {
        this.f336685a = aVar;
        this.f336686b = str;
    }

    @Override // com.avito.beduin.v2.engine.core.G, com.avito.beduin.v2.engine.core.K
    /* renamed from: c, reason: from getter */
    public final boolean getF336644d() {
        return this.f336690f;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    @Y61.k
    /* renamed from: getContext */
    public final InterfaceC36274k getF336642b() {
        return this.f336685a;
    }

    @Override // com.avito.beduin.v2.engine.core.p
    @Y61.k
    /* renamed from: getId, reason: from getter */
    public final String getF336629a() {
        return this.f336686b;
    }

    @Override // com.avito.beduin.v2.engine.core.K
    public final T k(@Y61.k z zVar) {
        return (T) this.f336688d.getValue();
    }

    @Override // com.avito.beduin.v2.engine.core.p
    public final void n(@Y61.k Y41.l<? super z, ? extends T> lVar) {
        this.f336687c = (C36240c) lVar;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    /* renamed from: p, reason: from getter */
    public final boolean getF20191j() {
        return this.f336689e;
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void destroy() {
    }

    @Override // com.avito.beduin.v2.engine.core.L
    public final void j() {
    }

    @Override // com.avito.beduin.v2.engine.core.G, com.avito.beduin.v2.engine.core.N
    public final void m(@Y61.k M m12) {
    }
}
