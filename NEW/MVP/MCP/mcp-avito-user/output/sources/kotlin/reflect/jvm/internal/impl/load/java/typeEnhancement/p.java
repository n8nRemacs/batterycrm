package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes8.dex */
final class p extends N implements Y41.l<CallableMemberDescriptor, O> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k0 f408390l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(k0 k0Var) {
        super(1);
        this.f408390l = k0Var;
    }

    @Override // Y41.l
    public final O invoke(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.g().get(this.f408390l.getIndex()).getType();
    }
}
