package wX0;

import com.fasterxml.jackson.databind.deser.x;
import com.fasterxml.jackson.databind.deser.y;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: SimpleValueInstantiators.java */
/* loaded from: classes4.dex */
public class f extends y.a implements Serializable {
    private static final long serialVersionUID = -8929386427526115130L;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<com.fasterxml.jackson.databind.type.b, x> f441537b = new HashMap<>();

    @Override // com.fasterxml.jackson.databind.deser.y.a, com.fasterxml.jackson.databind.deser.y
    public final x a(com.fasterxml.jackson.databind.b bVar, x xVar) {
        x xVar2 = this.f441537b.get(new com.fasterxml.jackson.databind.type.b(bVar.f341454a.f341930b));
        return xVar2 == null ? xVar : xVar2;
    }
}
