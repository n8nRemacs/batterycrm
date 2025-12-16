package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: DescriptorsJvmAbiUtil.java */
/* loaded from: classes8.dex */
public final class m {
    public static /* synthetic */ void a(int i12) {
        Object[] objArr = new Object[3];
        if (i12 == 1 || i12 == 2) {
            objArr[0] = "companionObject";
        } else if (i12 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i12 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i12 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i12 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
