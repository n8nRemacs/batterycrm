package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;

/* compiled from: DescriptorEquivalenceForOverrides.kt */
/* loaded from: classes8.dex */
final class f extends N implements Y41.p<InterfaceC42882k, InterfaceC42882k, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42848a f409621l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42848a f409622m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(InterfaceC42848a interfaceC42848a, InterfaceC42848a interfaceC42848a2) {
        super(2);
        this.f409621l = interfaceC42848a;
        this.f409622m = interfaceC42848a2;
    }

    @Override // Y41.p
    public final Boolean invoke(InterfaceC42882k interfaceC42882k, InterfaceC42882k interfaceC42882k2) {
        return Boolean.valueOf(L.f(interfaceC42882k, this.f409621l) && L.f(interfaceC42882k2, this.f409622m));
    }
}
