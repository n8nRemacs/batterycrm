package net.bytebuddy.dynamic;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import net.bytebuddy.description.type.TypeDescription;

/* compiled from: TargetType.java */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final TypeDescription f416659a = TypeDescription.d.A0(c.class);

    public c() {
        throw new UnsupportedOperationException("This class only serves as a marker type and should not be instantiated");
    }

    @SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
    public static TypeDescription a(TypeDescription typeDescription, TypeDescription typeDescription2) {
        int i12 = 0;
        TypeDescription typeDescriptionM = typeDescription;
        while (typeDescriptionM.w2()) {
            typeDescriptionM = typeDescriptionM.m();
            i12++;
        }
        return typeDescriptionM.Q2(c.class) ? TypeDescription.c.z0(typeDescription2, i12) : typeDescription;
    }
}
