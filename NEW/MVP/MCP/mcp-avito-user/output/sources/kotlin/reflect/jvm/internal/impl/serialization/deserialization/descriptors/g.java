package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: DeserializedClassDescriptor.kt */
/* loaded from: classes8.dex */
final class g extends N implements Y41.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f409845l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ProtoBuf.d f409846m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, ProtoBuf.d dVar) {
        super(0);
        this.f409845l = eVar;
        this.f409846m = dVar;
    }

    @Override // Y41.a
    public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
        e eVar = this.f409845l;
        return C42745f0.M0(eVar.f409808n.f409936a.f409918e.b(eVar.f409819y, this.f409846m));
    }
}
