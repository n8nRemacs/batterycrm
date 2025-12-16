package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class nu1 implements iy7, Serializable {
    public static final Object NO_RECEIVER = mu1.a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient iy7 reflected;
    private final String signature;

    public nu1(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }

    @Override // defpackage.iy7
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // defpackage.iy7
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public iy7 compute() {
        iy7 iy7Var = this.reflected;
        if (iy7Var != null) {
            return iy7Var;
        }
        iy7 iy7VarComputeReflected = computeReflected();
        this.reflected = iy7VarComputeReflected;
        return iy7VarComputeReflected;
    }

    public abstract iy7 computeReflected();

    @Override // defpackage.hy7
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // defpackage.iy7
    public String getName() {
        return this.name;
    }

    public ky7 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (!this.isTopLevel) {
            return vid.a(cls);
        }
        vid.a.getClass();
        return new llb(cls);
    }

    @Override // defpackage.iy7
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    public abstract iy7 getReflected();

    @Override // defpackage.iy7
    public bz7 getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // defpackage.iy7
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // defpackage.iy7
    public cz7 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // defpackage.iy7
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // defpackage.iy7
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // defpackage.iy7
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // defpackage.iy7, defpackage.ly7
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
