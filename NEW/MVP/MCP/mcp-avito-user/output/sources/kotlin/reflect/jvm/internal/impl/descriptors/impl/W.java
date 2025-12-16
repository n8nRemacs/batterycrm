package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.V;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;

/* compiled from: ValueParameterDescriptorImpl.kt */
/* loaded from: classes8.dex */
final class W extends kotlin.jvm.internal.N implements Y41.a<List<? extends m0>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V.b f407637l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(V.b bVar) {
        super(0);
        this.f407637l = bVar;
    }

    @Override // Y41.a
    public final List<? extends m0> invoke() {
        return (List) this.f407637l.f407636n.getValue();
    }
}
