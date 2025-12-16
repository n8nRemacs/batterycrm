package defpackage;

/* loaded from: classes.dex */
public abstract class uoc extends nu1 implements yy7 {
    private final boolean syntheticJavaProperty;

    public uoc(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }

    @Override // defpackage.nu1
    public iy7 compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uoc) {
            uoc uocVar = (uoc) obj;
            return getOwner().equals(uocVar.getOwner()) && getName().equals(uocVar.getName()) && getSignature().equals(uocVar.getSignature()) && fni.a(getBoundReceiver(), uocVar.getBoundReceiver());
        }
        if (obj instanceof yy7) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.yy7
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // defpackage.yy7
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        iy7 iy7VarCompute = compute();
        if (iy7VarCompute != this) {
            return iy7VarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // defpackage.nu1
    public yy7 getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        iy7 iy7VarCompute = compute();
        if (iy7VarCompute != this) {
            return (yy7) iy7VarCompute;
        }
        throw new l84("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
