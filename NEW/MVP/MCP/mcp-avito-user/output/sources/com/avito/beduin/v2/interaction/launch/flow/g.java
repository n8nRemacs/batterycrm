package com.avito.beduin.v2.interaction.launch.flow;

import Y41.p;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.m;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.Z;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.r;

/* compiled from: LaunchInteractionHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/beduin/v2/interaction/launch/flow/ResultStatus;", "status", "Lcom/avito/beduin/v2/interaction/launch/flow/j;", "result", "Lkotlin/G0;", "invoke", "(Lcom/avito/beduin/v2/interaction/launch/flow/ResultStatus;Lcom/avito/beduin/v2/interaction/launch/flow/j;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class g extends N implements p<ResultStatus, j, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C36272i f337463l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f337464m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C36272i c36272i, r rVar) {
        super(2);
        this.f337463l = c36272i;
        this.f337464m = rVar;
    }

    @Override // Y41.p
    public final G0 invoke(ResultStatus resultStatus, j jVar) {
        String str = resultStatus.f337444b;
        C36272i c36272i = this.f337463l;
        Q q12 = new Q("status", c36272i.e(str));
        k[] kVarArr = jVar.f337467a;
        int iF2 = P0.f(kVarArr.length);
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (k kVar : kVarArr) {
            linkedHashMap.put(kVar.f337468a, c36272i.e(kVar.f337469b));
        }
        A a12 = new A(q12, new Q("params", new A(new m(linkedHashMap), null, 2, null)));
        int i12 = Z.f406624c;
        this.f337464m.resumeWith(a12);
        return G0.f406611a;
    }
}
