package com.avito.beduin.v2.serialization.json;

import Y41.l;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DefaultJsonDataSerializer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPU0/e;", "Lkotlin/G0;", "invoke", "(LPU0/e;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class c extends N implements l<PU0.e, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C36268a f338341l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f338342m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C36268a c36268a, e eVar) {
        super(1);
        this.f338341l = c36268a;
        this.f338342m = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(PU0.e eVar) {
        PU0.e eVar2 = eVar;
        F.a aVar = F.f336593b;
        List<com.avito.beduin.v2.engine.field.d> list = this.f338341l.f336782b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            eVar2.a(this.f338342m.b(((com.avito.beduin.v2.engine.field.d) it.next()).c(aVar)));
            arrayList.add(Boolean.TRUE);
        }
        return G0.f406611a;
    }
}
