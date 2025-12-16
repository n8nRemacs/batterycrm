package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import l51.C43547a;

/* compiled from: ProtoBasedClassDataFinder.kt */
@s0
/* loaded from: classes8.dex */
public final class H implements InterfaceC42951h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.d f409739a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43547a f409740b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Y41.l<kotlin.reflect.jvm.internal.impl.name.b, b0> f409741c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f409742d;

    public H(@Y61.k ProtoBuf.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.d dVar, @Y61.k C43547a c43547a, @Y61.k Y41.l lVar) {
        this.f409739a = dVar;
        this.f409740b = c43547a;
        this.f409741c = lVar;
        List<ProtoBuf.Class> list = gVar.f408976h;
        int iF2 = P0.f(C42745f0.q(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 < 16 ? 16 : iF2);
        for (Object obj : list) {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.d dVar2 = this.f409739a;
            int i12 = ((ProtoBuf.Class) obj).f408642f;
            linkedHashMap.put(kotlin.reflect.jvm.internal.impl.name.b.e(dVar2.a(i12), dVar2.b(i12)), obj);
        }
        this.f409742d = linkedHashMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42951h
    @Y61.l
    public final C42950g a(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar) {
        ProtoBuf.Class r02 = (ProtoBuf.Class) this.f409742d.get(bVar);
        if (r02 == null) {
            return null;
        }
        return new C42950g(this.f409739a, r02, this.f409740b, (b0) ((p) this.f409741c).invoke(bVar));
    }
}
