package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;

/* compiled from: OverridingUtil.java */
/* loaded from: classes8.dex */
final class p implements Y41.l<CallableMemberDescriptor, Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42882k f409646b;

    public p(InterfaceC42882k interfaceC42882k) {
        this.f409646b = interfaceC42882k;
    }

    @Override // Y41.l
    public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        return Boolean.valueOf(callableMemberDescriptor.f() == this.f409646b);
    }
}
