package com.avito.beduin.v2.serialization.json;

import Y61.k;
import com.avito.beduin.v2.engine.core.F;
import com.avito.beduin.v2.engine.field.entity.A;
import com.avito.beduin.v2.engine.field.entity.C36268a;
import com.avito.beduin.v2.engine.field.entity.v;
import kotlin.Metadata;

/* compiled from: DefaultJsonDataSerializer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/serialization/json/e;", "Lcom/avito/beduin/v2/serialization/json/g;", "json_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final PU0.b f338345a;

    public e(@k PU0.b bVar) {
        this.f338345a = bVar;
    }

    @k
    public final String a(@k com.avito.beduin.v2.engine.field.d dVar) {
        return b(dVar.h(F.f336593b)).toString();
    }

    public final PU0.f b(com.avito.beduin.v2.engine.field.d dVar) {
        if (dVar instanceof v) {
            return c((v) dVar);
        }
        boolean z12 = dVar instanceof C36268a;
        PU0.b bVar = this.f338345a;
        return z12 ? bVar.g(new c((C36268a) dVar, this)) : dVar instanceof A ? bVar.b(new d((A) dVar, this)) : bVar.c();
    }

    public final PU0.j c(v vVar) {
        boolean z12 = vVar instanceof v.j ? true : vVar instanceof v.h;
        PU0.b bVar = this.f338345a;
        if (z12) {
            return bVar.f(vVar.getF336840b());
        }
        if (vVar instanceof v.d ? true : vVar instanceof v.g) {
            return bVar.a(vVar.getF336839b());
        }
        if (vVar instanceof v.c ? true : vVar instanceof v.f) {
            return bVar.i(vVar.getF336838b());
        }
        return vVar instanceof v.a ? true : vVar instanceof v.e ? bVar.h(vVar.getF336837b()) : bVar.e(vVar.getF336843b());
    }
}
