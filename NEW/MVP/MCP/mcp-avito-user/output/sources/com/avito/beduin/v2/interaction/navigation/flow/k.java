package com.avito.beduin.v2.interaction.navigation.flow;

import com.avito.beduin.v2.engine.core.C36258h;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NavigateInteraction.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/core/z;", "Lcom/avito/beduin/v2/engine/component/l;", "invoke", "(Lcom/avito/beduin/v2/engine/core/z;)Lcom/avito/beduin/v2/engine/component/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class k extends N implements Y41.l<com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.component.l> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.x f337530l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.beduin.v2.engine.field.entity.A f337531m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.avito.beduin.v2.engine.field.entity.x xVar, com.avito.beduin.v2.engine.field.entity.A a12) {
        super(1);
        this.f337530l = xVar;
        this.f337531m = a12;
    }

    @Override // Y41.l
    public final com.avito.beduin.v2.engine.component.l invoke(com.avito.beduin.v2.engine.core.z zVar) {
        com.avito.beduin.v2.engine.core.z zVar2 = zVar;
        com.avito.beduin.v2.engine.field.entity.c cVarR = this.f337530l.o(zVar2, com.avito.beduin.v2.engine.field.entity.n.b(this.f337531m.f336778b.f336870a)).r(zVar2);
        if (cVarR == null) {
            return null;
        }
        C36258h c36258h = new C36258h(zVar2.getF336696a(), "navigation_child");
        com.avito.beduin.v2.engine.field.m.f336868b.getClass();
        c36258h.o(cVarR, com.avito.beduin.v2.engine.field.m.f336869c, null);
        return new com.avito.beduin.v2.engine.component.l("navigation_child", cVarR.f336793h, cVarR.f336788c, c36258h);
    }
}
