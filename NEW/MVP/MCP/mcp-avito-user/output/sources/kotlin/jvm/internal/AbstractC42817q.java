package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC42733c0;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;

/* compiled from: CallableReference.java */
/* renamed from: kotlin.jvm.internal.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42817q implements kotlin.reflect.c, Serializable {

    @InterfaceC42733c0
    public static final Object NO_RECEIVER = a.f406847b;

    @InterfaceC42733c0
    private final boolean isTopLevel;

    @InterfaceC42733c0
    private final String name;

    @InterfaceC42733c0
    private final Class owner;

    @InterfaceC42733c0
    protected final Object receiver;
    private transient kotlin.reflect.c reflected;

    @InterfaceC42733c0
    private final String signature;

    /* compiled from: CallableReference.java */
    @InterfaceC42733c0
    /* renamed from: kotlin.jvm.internal.q$a */
    public static class a implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        public static final a f406847b = new a();

        private Object readResolve() {
            return f406847b;
        }
    }

    public AbstractC42817q() {
        this(NO_RECEIVER);
    }

    @Override // kotlin.reflect.c
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.c
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @InterfaceC42733c0
    public kotlin.reflect.c compute() {
        kotlin.reflect.c cVar = this.reflected;
        if (cVar != null) {
            return cVar;
        }
        kotlin.reflect.c cVarComputeReflected = computeReflected();
        this.reflected = cVarComputeReflected;
        return cVarComputeReflected;
    }

    public abstract kotlin.reflect.c computeReflected();

    @Override // kotlin.reflect.b
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @InterfaceC42733c0
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kotlin.reflect.c
    public String getName() {
        return this.name;
    }

    public kotlin.reflect.h getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? m0.f406844a.c(cls, "") : m0.f406844a.b(cls);
    }

    @Override // kotlin.reflect.c
    public List<KParameter> getParameters() {
        return getReflected().getParameters();
    }

    @InterfaceC42733c0
    public kotlin.reflect.c getReflected() {
        kotlin.reflect.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute;
        }
        throw new X41.r();
    }

    @Override // kotlin.reflect.c
    public kotlin.reflect.r getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.c
    @InterfaceC42733c0
    public List<kotlin.reflect.s> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.c
    @InterfaceC42733c0
    public KVisibility getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.c
    @InterfaceC42733c0
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.c
    @InterfaceC42733c0
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.c
    @InterfaceC42733c0
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.c, kotlin.reflect.i
    @InterfaceC42733c0
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @InterfaceC42733c0
    public AbstractC42817q(Object obj) {
        this(obj, null, null, null, false);
    }

    @InterfaceC42733c0
    public AbstractC42817q(Object obj, Class cls, String str, String str2, boolean z12) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z12;
    }
}
