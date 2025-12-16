package com.avito.beduin.v2.engine;

import cU0.C27105c;
import cU0.C27107e;
import cU0.InterfaceC27104b;
import cU0.InterfaceC27108f;
import com.avito.beduin.v2.engine.H;
import com.avito.beduin.v2.engine.component.AbstractC36250j;
import com.avito.beduin.v2.engine.core.C36261k;
import com.avito.beduin.v2.engine.exception.BeduinExceptionType;
import com.avito.beduin.v2.engine.exception.EngineBeduinException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EngineContext.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/x;", "Lcom/avito/beduin/v2/engine/k;", "LYT0/a;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class x implements InterfaceC36274k, YT0.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.z f336917a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27108f f336918b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.component.o f336919c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C27105c f336920d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final dU0.g f336921e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final aU0.b f336922f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final YT0.a f336923g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final H f336924h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.engine.core.F f336925i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C36272i f336926j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final o f336927k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final J f336928l;

    public x(@Y61.k com.avito.beduin.v2.engine.component.z zVar, @Y61.k InterfaceC27108f interfaceC27108f, @Y61.k com.avito.beduin.v2.engine.component.o oVar, @Y61.k C27105c c27105c, @Y61.k dU0.g gVar, @Y61.l aU0.b bVar, @Y61.k YT0.a aVar, @Y61.k H.a aVar2) {
        this.f336917a = zVar;
        this.f336918b = interfaceC27108f;
        this.f336919c = oVar;
        this.f336920d = c27105c;
        this.f336921e = gVar;
        this.f336922f = bVar;
        this.f336923g = aVar;
        H h12 = new H(aVar2, null, 2, null);
        this.f336924h = h12;
        this.f336925i = new com.avito.beduin.v2.engine.core.F(this);
        this.f336926j = new C36272i(h12);
        this.f336927k = new o(h12.f336474a);
        this.f336928l = new J(C36261k.f336640f);
    }

    @Override // com.avito.beduin.v2.engine.s
    public final void G(dU0.f fVar) throws EngineBeduinException.EngineContextException {
        EngineBeduinException.EngineContextException engineContextException = new EngineBeduinException.EngineContextException("MainBeduinContext can't handle interactions");
        y(engineContextException);
        throw engineContextException;
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final dU0.c I(@Y61.k String str) throws EngineBeduinException.UnregisteredInteractionException {
        dU0.c cVar = this.f336921e.f393893a.get(str);
        if (cVar != null) {
            return cVar;
        }
        EngineBeduinException.UnregisteredInteractionException unregisteredInteractionException = new EngineBeduinException.UnregisteredInteractionException(str);
        y(unregisteredInteractionException);
        throw unregisteredInteractionException;
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final H getF336924h() {
        return this.f336924h;
    }

    @Override // com.avito.beduin.v2.engine.s, com.avito.beduin.v2.engine.v
    public final void b(@Y61.k com.avito.beduin.v2.engine.core.manager.h hVar) {
        int i12 = w.f336916l;
        hVar.a();
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final C36272i getF336926j() {
        return this.f336926j;
    }

    @Override // YT0.a
    @Y61.k
    /* renamed from: e */
    public final YT0.b getF175484a() {
        return this.f336923g.getF175484a();
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final com.avito.beduin.v2.engine.component.y h(@Y61.k String str) throws EngineBeduinException.EngineContextException {
        com.avito.beduin.v2.engine.component.y yVar = this.f336917a.get(str);
        if (yVar != null) {
            return yVar;
        }
        EngineBeduinException.EngineContextException engineContextException = new EngineBeduinException.EngineContextException(AK.c.k("MetaComponent ", str, " not found"));
        y(engineContextException);
        throw engineContextException;
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    @Y61.k
    public final com.avito.beduin.v2.engine.core.z i() {
        return this.f336925i;
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    @Y61.k
    /* renamed from: j, reason: from getter */
    public final o getF336927k() {
        return this.f336927k;
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    @Y61.k
    public final InterfaceC36274k m(@Y61.k J j12) {
        return new G(this, this.f336926j, this.f336927k, j12);
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final InterfaceC27104b q(@Y61.k String str) throws EngineBeduinException.UnregisteredFunctionException {
        C27107e c27107e = this.f336918b.get(str);
        C27105c c27105c = this.f336920d;
        if (c27107e != null) {
            return c27105c.f57902b;
        }
        InterfaceC27104b interfaceC27104b = c27105c.f57901a.get(str);
        if (interfaceC27104b != null) {
            return interfaceC27104b;
        }
        EngineBeduinException.UnregisteredFunctionException unregisteredFunctionException = new EngineBeduinException.UnregisteredFunctionException(BeduinExceptionType.f336705c, str, AK.c.k("Function for \"", str, "\" isn't registered in EngineContext"), null, null);
        y(unregisteredFunctionException);
        throw unregisteredFunctionException;
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    @Y61.k
    /* renamed from: s, reason: from getter */
    public final J getF336928l() {
        return this.f336928l;
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final C27107e v(@Y61.k String str) throws EngineBeduinException.EngineContextException {
        C27107e c27107e = this.f336918b.get(str);
        if (c27107e != null) {
            return c27107e;
        }
        EngineBeduinException.EngineContextException engineContextException = new EngineBeduinException.EngineContextException(AK.c.k("MetaFunction ", str, " not found"));
        y(engineContextException);
        throw engineContextException;
    }

    @Override // com.avito.beduin.v2.engine.InterfaceC36274k
    public final void y(@Y61.k EngineBeduinException engineBeduinException) {
        aU0.b bVar = this.f336922f;
        if (bVar != null) {
            bVar.a(engineBeduinException, com.avito.beduin.v2.engine.utils.f.a());
        }
    }

    @Override // com.avito.beduin.v2.engine.r
    @Y61.k
    public final AbstractC36250j z(@Y61.k String str) throws EngineBeduinException.UnregisteredComponentStateFactoryException {
        com.avito.beduin.v2.engine.component.y yVar = this.f336917a.get(str);
        com.avito.beduin.v2.engine.component.o oVar = this.f336919c;
        if (yVar != null) {
            return oVar.f336572b;
        }
        AbstractC36250j abstractC36250j = oVar.f336571a.get(str);
        if (abstractC36250j != null) {
            return abstractC36250j;
        }
        EngineBeduinException.UnregisteredComponentStateFactoryException unregisteredComponentStateFactoryException = new EngineBeduinException.UnregisteredComponentStateFactoryException(BeduinExceptionType.f336704b, str, AK.c.k("ComponentState for \"", str, "\" isn't registered in EngineContext"), null, null);
        com.avito.beduin.v2.engine.utils.e.b(unregisteredComponentStateFactoryException, "EngineContext", null);
        y(unregisteredComponentStateFactoryException);
        AbstractC36250j abstractC36250j2 = oVar.f336571a.get("UnregisteredComponent");
        if (abstractC36250j2 != null) {
            return abstractC36250j2;
        }
        throw unregisteredComponentStateFactoryException;
    }

    public /* synthetic */ x(com.avito.beduin.v2.engine.component.z zVar, InterfaceC27108f interfaceC27108f, com.avito.beduin.v2.engine.component.o oVar, C27105c c27105c, dU0.g gVar, aU0.b bVar, YT0.a aVar, H.a aVar2, int i12, C42822w c42822w) {
        this(zVar, interfaceC27108f, oVar, c27105c, gVar, bVar, aVar, (i12 & 128) != 0 ? new H.a(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null) : aVar2);
    }
}
