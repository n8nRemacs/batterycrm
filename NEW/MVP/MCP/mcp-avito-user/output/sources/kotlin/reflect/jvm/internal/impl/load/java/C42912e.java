package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;

/* compiled from: specialBuiltinMembers.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C42912e extends N implements Y41.l<CallableMemberDescriptor, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a0 f408059l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42912e(a0 a0Var) {
        super(1);
        this.f408059l = a0Var;
    }

    @Override // Y41.l
    public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        SpecialGenericSignatures.f407963a.getClass();
        return Boolean.valueOf(SpecialGenericSignatures.f407972j.containsKey(kotlin.reflect.jvm.internal.impl.load.kotlin.E.b(this.f408059l)));
    }
}
