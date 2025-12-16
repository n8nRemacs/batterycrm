package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.G0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* compiled from: OverridingUtil.java */
/* loaded from: classes8.dex */
final class t implements Y41.l<CallableMemberDescriptor, G0> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f409707b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CallableMemberDescriptor f409708c;

    public t(m mVar, CallableMemberDescriptor callableMemberDescriptor) {
        this.f409707b = mVar;
        this.f409708c = callableMemberDescriptor;
    }

    @Override // Y41.l
    public final G0 invoke(CallableMemberDescriptor callableMemberDescriptor) {
        this.f409707b.c(this.f409708c, callableMemberDescriptor);
        return G0.f406611a;
    }
}
