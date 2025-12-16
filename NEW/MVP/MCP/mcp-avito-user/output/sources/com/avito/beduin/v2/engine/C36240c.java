package com.avito.beduin.v2.engine;

import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Scope.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lcom/avito/beduin/v2/engine/core/z;", "invoke", "(Lcom/avito/beduin/v2/engine/core/z;)Ljava/lang/Object;", "com/avito/beduin/v2/engine/core/C", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.beduin.v2.engine.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C36240c extends N implements Y41.l<com.avito.beduin.v2.engine.core.z, com.avito.beduin.v2.engine.component.l> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f336553l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36240c(t tVar) {
        super(1);
        this.f336553l = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final com.avito.beduin.v2.engine.component.l invoke(com.avito.beduin.v2.engine.core.z zVar) {
        Q q12;
        com.avito.beduin.v2.engine.core.z zVar2 = zVar;
        com.avito.beduin.v2.engine.component.l lVar = null;
        t tVar = this.f336553l;
        if (tVar != null) {
            try {
                com.avito.beduin.v2.engine.field.entity.d dVar = tVar.f336905e;
                com.avito.beduin.v2.engine.field.m.f336868b.getClass();
                q12 = new Q(com.avito.beduin.v2.engine.core.E.b(zVar2, com.avito.beduin.v2.engine.field.m.f336869c, new com.avito.beduin.v2.engine.component.y(tVar.f336904d, dVar)), dVar.f336795c);
            } catch (Exception e12) {
                com.avito.beduin.v2.engine.field.entity.c cVarA = com.avito.beduin.v2.engine.component.k.a(zVar2, tVar.f336905e.f336795c, e12, null, null, 56);
                com.avito.beduin.v2.engine.field.m.f336868b.getClass();
                q12 = new Q(zVar2.n(zVar2.getF336594a(), "@exceptionCalculationValue").o(cVarA, com.avito.beduin.v2.engine.field.m.f336869c, null), cVarA.f336788c);
            }
            com.avito.beduin.v2.engine.core.K k12 = (com.avito.beduin.v2.engine.core.K) q12.f406619b;
            String str = (String) q12.f406620c;
            com.avito.beduin.v2.engine.field.t.f336888a.getClass();
            String str2 = com.avito.beduin.v2.engine.field.t.f336890c;
            String strC = tVar.f336905e.f336794b.c();
            if (strC == null) {
                strC = str2;
            }
            lVar = new com.avito.beduin.v2.engine.component.l(str2, strC, str, k12);
        }
        return lVar;
    }
}
