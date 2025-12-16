package com.avito.beduin.v2.functions.base;

import cU0.AbstractC27103a;
import com.avito.android.remote.model.category_parameters.ConstraintKt;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.beduin.v2.engine.field.entity.C36269b;
import com.avito.beduin.v2.engine.field.entity.w;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CreateBottomSheetStateFunction.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/functions/base/F;", "LcU0/a;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class F extends AbstractC27103a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final F f336953a = new F();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f336954b = "CreateBottomSheetState";

    @Override // cU0.AbstractC27103a
    @Y61.k
    public final com.avito.beduin.v2.engine.field.d b(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k com.avito.beduin.v2.engine.field.j jVar, @Y61.k com.avito.beduin.v2.engine.field.m mVar) {
        f336953a.getClass();
        com.avito.beduin.v2.engine.field.j jVarA = zVar.A();
        com.avito.beduin.v2.engine.o oVarA = com.avito.beduin.v2.engine.p.a(zVar);
        com.avito.beduin.v2.engine.field.j jVarA2 = zVar.A();
        String strA = com.avito.beduin.v2.engine.utils.f.a();
        oVarA.getClass();
        kotlin.Q q12 = new kotlin.Q("groupId", new w.e(jVarA2, strA));
        com.avito.beduin.v2.engine.field.j jVarA3 = zVar.A();
        com.avito.beduin.v2.engine.o oVarA2 = com.avito.beduin.v2.engine.p.a(zVar);
        com.avito.beduin.v2.engine.field.j jVarA4 = zVar.A();
        String strA2 = com.avito.beduin.v2.engine.utils.f.a();
        oVarA2.getClass();
        com.avito.beduin.v2.engine.field.h hVar = new com.avito.beduin.v2.engine.field.h((kotlin.Q<String, ? extends com.avito.beduin.v2.engine.field.f<?>>[]) new kotlin.Q[]{q12, new kotlin.Q("interactionScope", new com.avito.beduin.v2.engine.field.entity.B(jVarA3, new com.avito.beduin.v2.engine.field.h((kotlin.Q<String, ? extends com.avito.beduin.v2.engine.field.f<?>>[]) new kotlin.Q[]{new kotlin.Q("scopeId", new w.e(jVarA4, strA2))})))});
        com.avito.beduin.v2.engine.field.entity.B b12 = new com.avito.beduin.v2.engine.field.entity.B(jVarA, hVar);
        com.avito.beduin.v2.engine.field.entity.q qVar = new com.avito.beduin.v2.engine.field.entity.q(zVar.A(), com.avito.beduin.v2.engine.p.a(zVar).d(zVar.A(), false));
        com.avito.beduin.v2.engine.field.a.f336767b.getClass();
        Map<com.avito.beduin.v2.engine.field.q, ? extends com.avito.beduin.v2.engine.core.K<? extends com.avito.beduin.v2.engine.field.d>> map = com.avito.beduin.v2.engine.field.a.f336768c;
        com.avito.beduin.v2.engine.field.s sVar = new com.avito.beduin.v2.engine.field.s(qVar.a(zVar, map), null, 2, null);
        com.avito.beduin.v2.engine.field.d dVarC = mVar.c("onShow");
        if (dVarC == null) {
            dVarC = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        com.avito.beduin.v2.engine.field.s sVar2 = new com.avito.beduin.v2.engine.field.s(dVarC, null, 2, null);
        com.avito.beduin.v2.engine.field.d dVarC2 = mVar.c("onDismiss");
        if (dVarC2 == null) {
            dVarC2 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        com.avito.beduin.v2.engine.field.s sVar3 = new com.avito.beduin.v2.engine.field.s(dVarC2, null, 2, null);
        com.avito.beduin.v2.engine.field.d dVarC3 = mVar.c("content");
        if (dVarC3 == null) {
            dVarC3 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        com.avito.beduin.v2.engine.field.s sVar4 = new com.avito.beduin.v2.engine.field.s(dVarC3, null, 2, null);
        com.avito.beduin.v2.engine.field.d dVarC4 = mVar.c("height");
        if (dVarC4 == null) {
            dVarC4 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        com.avito.beduin.v2.engine.field.s sVar5 = new com.avito.beduin.v2.engine.field.s(dVarC4, null, 2, null);
        com.avito.beduin.v2.engine.field.d dVarC5 = mVar.c("contentPaddings");
        if (dVarC5 == null) {
            dVarC5 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        com.avito.beduin.v2.engine.field.s sVar6 = new com.avito.beduin.v2.engine.field.s(dVarC5, null, 2, null);
        com.avito.beduin.v2.engine.field.d dVarC6 = mVar.c("metaInfo");
        if (dVarC6 == null) {
            dVarC6 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        com.avito.beduin.v2.engine.field.s sVar7 = new com.avito.beduin.v2.engine.field.s(dVarC6, null, 2, null);
        com.avito.beduin.v2.engine.field.d dVarC7 = mVar.c("modalSize");
        if (dVarC7 == null) {
            dVarC7 = com.avito.beduin.v2.engine.field.entity.f.f336800b;
        }
        com.avito.beduin.v2.engine.field.s sVar8 = new com.avito.beduin.v2.engine.field.s(dVarC7, null, 2, null);
        return new com.avito.beduin.v2.engine.field.entity.B(zVar.A(), new com.avito.beduin.v2.engine.field.h((kotlin.Q<String, ? extends com.avito.beduin.v2.engine.field.f<?>>[]) new kotlin.Q[]{new kotlin.Q("show", new com.avito.beduin.v2.engine.field.entity.m(zVar.A(), "ShowBottomSheet", new com.avito.beduin.v2.engine.field.h((kotlin.Q<String, ? extends com.avito.beduin.v2.engine.field.f<?>>[]) new kotlin.Q[]{new kotlin.Q("interactionGroup", b12), new kotlin.Q("onShow", new com.avito.beduin.v2.engine.field.entity.m(zVar.A(), "Sequence", new com.avito.beduin.v2.engine.field.h((kotlin.Q<String, ? extends com.avito.beduin.v2.engine.field.f<?>>[]) new kotlin.Q[]{new kotlin.Q("items", new C36269b(zVar.A(), C42745f0.U(sVar2, new com.avito.beduin.v2.engine.field.entity.m(zVar.A(), "Mutate", new com.avito.beduin.v2.engine.field.h((kotlin.Q<String, ? extends com.avito.beduin.v2.engine.field.f<?>>[]) new kotlin.Q[]{new kotlin.Q(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, sVar), new kotlin.Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, com.avito.beduin.v2.engine.p.a(zVar).d(zVar.A(), true))}), null, 8, null))))}), null, 8, null)), new kotlin.Q("onDismiss", new com.avito.beduin.v2.engine.field.entity.m(zVar.A(), "Sequence", new com.avito.beduin.v2.engine.field.h((kotlin.Q<String, ? extends com.avito.beduin.v2.engine.field.f<?>>[]) new kotlin.Q[]{new kotlin.Q("items", new C36269b(zVar.A(), C42745f0.U(sVar3, new com.avito.beduin.v2.engine.field.entity.m(zVar.A(), "Mutate", new com.avito.beduin.v2.engine.field.h((kotlin.Q<String, ? extends com.avito.beduin.v2.engine.field.f<?>>[]) new kotlin.Q[]{new kotlin.Q(InlineFilterValue.InlineFilterDateRangeValue.TO_PARAM_NAME, sVar), new kotlin.Q(InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, com.avito.beduin.v2.engine.p.a(zVar).d(zVar.A(), false))}), null, 8, null))))}), null, 8, null)), new kotlin.Q("component", sVar4), new kotlin.Q("height", sVar5), new kotlin.Q("contentPaddings", sVar6), new kotlin.Q("metaInfo", sVar7), new kotlin.Q("modalSize", sVar8)}), null, 8, null)), new kotlin.Q(ConstraintKt.CONDITION_FLOW_HIDE, new com.avito.beduin.v2.engine.field.entity.m(zVar.A(), "DisposeInteractionScope", hVar, null, 8, null)), new kotlin.Q("isShown", sVar)})).a(zVar, map);
    }

    @Override // cU0.InterfaceC27104b
    @Y61.k
    /* renamed from: getType */
    public final String getF414542c() {
        return f336954b;
    }
}
