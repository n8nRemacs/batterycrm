package kotlin.jvm.internal;

import kotlin.InterfaceC42733c0;

/* compiled from: FunctionReference.java */
/* loaded from: classes8.dex */
public class G extends AbstractC42817q implements E, kotlin.reflect.i {
    private final int arity;

    @InterfaceC42733c0
    private final int flags;

    public G(int i12) {
        this(i12, AbstractC42817q.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @InterfaceC42733c0
    public kotlin.reflect.c computeReflected() {
        return m0.f406844a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G) {
            G g12 = (G) obj;
            return getName().equals(g12.getName()) && getSignature().equals(g12.getSignature()) && this.flags == g12.flags && this.arity == g12.arity && L.f(getBoundReceiver(), g12.getBoundReceiver()) && L.f(getOwner(), g12.getOwner());
        }
        if (obj instanceof kotlin.reflect.i) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.E
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.i
    @InterfaceC42733c0
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kotlin.reflect.i
    @InterfaceC42733c0
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kotlin.reflect.i
    @InterfaceC42733c0
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kotlin.reflect.i
    @InterfaceC42733c0
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c, kotlin.reflect.i
    @InterfaceC42733c0
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        kotlin.reflect.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    @InterfaceC42733c0
    public G(int i12, Object obj) {
        this(i12, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.AbstractC42817q
    @InterfaceC42733c0
    public kotlin.reflect.i getReflected() {
        return (kotlin.reflect.i) super.getReflected();
    }

    @InterfaceC42733c0
    public G(int i12, Object obj, Class cls, String str, String str2, int i13) {
        super(obj, cls, str, str2, (i13 & 1) == 1);
        this.arity = i12;
        this.flags = i13 >> 1;
    }
}
