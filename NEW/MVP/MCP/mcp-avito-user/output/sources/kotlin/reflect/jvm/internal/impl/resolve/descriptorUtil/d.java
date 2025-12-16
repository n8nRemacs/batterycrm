package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import Y41.l;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.b;

/* compiled from: DescriptorUtils.kt */
/* loaded from: classes8.dex */
public final class d extends b.AbstractC11701b<CallableMemberDescriptor, CallableMemberDescriptor> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0.h<CallableMemberDescriptor> f409617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ N f409618b;

    /* JADX WARN: Multi-variable type inference failed */
    public d(l lVar, l0.h hVar) {
        this.f409617a = hVar;
        this.f409618b = (N) lVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
    public final Object a() {
        return this.f409617a.f406842b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC11701b, kotlin.reflect.jvm.internal.impl.utils.b.e
    public final boolean b(Object obj) {
        return this.f409617a.f406842b == null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor] */
    @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC11701b, kotlin.reflect.jvm.internal.impl.utils.b.e
    public final void c(Object obj) {
        ?? r32 = (CallableMemberDescriptor) obj;
        l0.h<CallableMemberDescriptor> hVar = this.f409617a;
        if (hVar.f406842b == null && ((Boolean) this.f409618b.invoke(r32)).booleanValue()) {
            hVar.f406842b = r32;
        }
    }
}
