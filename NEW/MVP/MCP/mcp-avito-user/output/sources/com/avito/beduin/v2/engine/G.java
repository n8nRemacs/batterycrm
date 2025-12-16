package com.avito.beduin.v2.engine;

import cU0.C27107e;
import cU0.InterfaceC27104b;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.exception.EngineBeduinException;
import kotlin.Metadata;

/* compiled from: EngineContext.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/G;", "Lcom/avito/beduin/v2/engine/k;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class G implements InterfaceC36274k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C36272i f336470a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final o f336471b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final J f336472c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36274k f336473d;

    public G(@Y61.k InterfaceC36274k interfaceC36274k, @Y61.k C36272i c36272i, @Y61.k o oVar, @Y61.k J j12) {
        this.f336470a = c36272i;
        this.f336471b = oVar;
        this.f336472c = j12;
        this.f336473d = interfaceC36274k;
    }

    @Override // com.avito.beduin.v2.engine.s
    public final void G(@Y61.k dU0.f fVar) {
        this.f336473d.G(fVar);
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final dU0.c I(@Y61.k String str) {
        return this.f336473d.I(str);
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    @Y61.k
    /* renamed from: a */
    public final H getF336924h() {
        return this.f336473d.getF336924h();
    }

    @Override // com.avito.beduin.v2.engine.s, com.avito.beduin.v2.engine.v
    public final void b(@Y61.k com.avito.beduin.v2.engine.core.manager.h hVar) {
        this.f336473d.b(hVar);
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final C36272i getF336926j() {
        return this.f336470a;
    }

    @Override // YT0.a
    @Y61.k
    /* renamed from: e */
    public final YT0.b getF175484a() {
        return this.f336473d.getF175484a();
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final com.avito.beduin.v2.engine.component.y h(@Y61.k String str) {
        return this.f336473d.h(str);
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    @Y61.k
    public final com.avito.beduin.v2.engine.core.z i() {
        return this.f336473d.i();
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    @Y61.k
    /* renamed from: j, reason: from getter */
    public final o getF336927k() {
        return this.f336471b;
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    @Y61.k
    public final InterfaceC36274k m(@Y61.k J j12) {
        return this.f336473d.m(j12);
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final InterfaceC27104b q(@Y61.k String str) {
        return this.f336473d.q(str);
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    @Y61.k
    /* renamed from: s, reason: from getter */
    public final J getF336928l() {
        return this.f336472c;
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final C27107e v(@Y61.k String str) {
        return this.f336473d.v(str);
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    public final void y(@Y61.k EngineBeduinException engineBeduinException) {
        this.f336473d.y(engineBeduinException);
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final AbstractC36250j z(@Y61.k String str) {
        return this.f336473d.z(str);
    }
}
