package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.s;

/* compiled from: RuntimeErrorReporter.kt */
/* loaded from: classes8.dex */
public final class j implements s {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final j f407814b = new j();

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.s
    public final void a(@Y61.k InterfaceC42851d interfaceC42851d, @Y61.k ArrayList arrayList) {
        throw new IllegalStateException("Incomplete hierarchy for class " + interfaceC42851d.getName() + ", unresolved classes " + arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.s
    public final void b(@Y61.k CallableMemberDescriptor callableMemberDescriptor) {
        throw new IllegalStateException("Cannot infer visibility for " + callableMemberDescriptor);
    }
}
