package defpackage;

/* loaded from: classes.dex */
public abstract class gn6 extends nu1 implements fn6, ly7 {
    private final int arity;
    private final int flags;

    public gn6(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = 0;
    }

    @Override // defpackage.nu1
    public iy7 computeReflected() {
        vid.a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gn6) {
            gn6 gn6Var = (gn6) obj;
            return getName().equals(gn6Var.getName()) && getSignature().equals(gn6Var.getSignature()) && this.flags == gn6Var.flags && this.arity == gn6Var.arity && fni.a(getBoundReceiver(), gn6Var.getBoundReceiver()) && fni.a(getOwner(), gn6Var.getOwner());
        }
        if (obj instanceof ly7) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // defpackage.fn6
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.ly7
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // defpackage.ly7
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // defpackage.ly7
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // defpackage.ly7
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // defpackage.nu1, defpackage.iy7, defpackage.ly7
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        iy7 iy7VarCompute = compute();
        if (iy7VarCompute != this) {
            return iy7VarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // defpackage.nu1
    public ly7 getReflected() {
        iy7 iy7VarCompute = compute();
        if (iy7VarCompute != this) {
            return (ly7) iy7VarCompute;
        }
        throw new l84("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
