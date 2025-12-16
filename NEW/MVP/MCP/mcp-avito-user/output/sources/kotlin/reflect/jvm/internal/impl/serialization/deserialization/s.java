package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;

/* compiled from: ErrorReporter.java */
/* loaded from: classes8.dex */
public interface s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f409955a = new a();

    /* compiled from: ErrorReporter.java */
    public static class a implements s {
        public static /* synthetic */ void c(int i12) {
            Object[] objArr = new Object[3];
            if (i12 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i12 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.s
        public final void a(@Y61.k InterfaceC42851d interfaceC42851d, @Y61.k ArrayList arrayList) {
            if (interfaceC42851d != null) {
                return;
            }
            c(0);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.s
        public final void b(@Y61.k CallableMemberDescriptor callableMemberDescriptor) {
            if (callableMemberDescriptor != null) {
                return;
            }
            c(2);
            throw null;
        }
    }

    void a(@Y61.k InterfaceC42851d interfaceC42851d, @Y61.k ArrayList arrayList);

    void b(@Y61.k CallableMemberDescriptor callableMemberDescriptor);
}
