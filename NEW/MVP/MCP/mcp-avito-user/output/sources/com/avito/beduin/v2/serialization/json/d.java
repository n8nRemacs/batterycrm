package com.avito.beduin.v2.serialization.json;

import Y41.l;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.entity.v;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DefaultJsonDataSerializer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPU0/i;", "Lkotlin/G0;", "invoke", "(LPU0/i;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class d extends N implements l<PU0.i, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f338343l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f338344m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(A a12, e eVar) {
        super(1);
        this.f338343l = a12;
        this.f338344m = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(PU0.i iVar) {
        PU0.i iVar2 = iVar;
        F.a aVar = F.f336593b;
        for (Map.Entry<String, com.avito.beduin.v2.engine.field.d> entry : this.f338343l.f336778b.f336870a.entrySet()) {
            String key = entry.getKey();
            com.avito.beduin.v2.engine.field.d dVarC = entry.getValue().c(aVar);
            boolean z12 = dVarC instanceof v;
            e eVar = this.f338344m;
            if (z12) {
                iVar2.a(key, eVar.c((v) dVarC));
            } else if (dVarC instanceof C36268a) {
                eVar.getClass();
                iVar2.a(key, eVar.f338345a.g(new c((C36268a) dVarC, eVar)));
            } else if (dVarC instanceof A) {
                eVar.getClass();
                iVar2.a(key, eVar.f338345a.b(new d((A) dVarC, eVar)));
            } else {
                iVar2.a(key, eVar.f338345a.c());
            }
        }
        return G0.f406611a;
    }
}
