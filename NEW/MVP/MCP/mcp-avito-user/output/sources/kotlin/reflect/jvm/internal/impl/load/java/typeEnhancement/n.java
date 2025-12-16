package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: signatureEnhancement.kt */
/* loaded from: classes8.dex */
final class n extends N implements Y41.l<CallableMemberDescriptor, O> {

    /* renamed from: l, reason: collision with root package name */
    public static final n f408388l = new n();

    public n() {
        super(1);
    }

    @Override // Y41.l
    public final O invoke(CallableMemberDescriptor callableMemberDescriptor) {
        return callableMemberDescriptor.H().getType();
    }
}
