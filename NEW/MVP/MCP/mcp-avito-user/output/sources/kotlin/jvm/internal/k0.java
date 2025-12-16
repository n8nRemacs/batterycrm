package kotlin.jvm.internal;

import kotlin.InterfaceC42733c0;

/* compiled from: PropertyReference.java */
/* loaded from: classes8.dex */
public abstract class k0 extends AbstractC42817q implements kotlin.reflect.n {
    private final boolean syntheticJavaProperty;

    public k0() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    public kotlin.reflect.c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            return getOwner().equals(k0Var.getOwner()) && getName().equals(k0Var.getName()) && getSignature().equals(k0Var.getSignature()) && L.f(getBoundReceiver(), k0Var.getBoundReceiver());
        }
        if (obj instanceof kotlin.reflect.n) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.n
    @InterfaceC42733c0
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.n
    @InterfaceC42733c0
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        kotlin.reflect.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @InterfaceC42733c0
    public kotlin.reflect.n getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (kotlin.reflect.n) super.getReflected();
    }

    @InterfaceC42733c0
    public k0(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    @InterfaceC42733c0
    public k0(Object obj, Class cls, String str, String str2, int i12) {
        super(obj, cls, str, str2, (i12 & 1) == 1);
        this.syntheticJavaProperty = (i12 & 2) == 2;
    }
}
