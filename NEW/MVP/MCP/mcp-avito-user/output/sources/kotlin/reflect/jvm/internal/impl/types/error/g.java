package kotlin.reflect.jvm.internal.impl.types.error;

import Y61.k;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: ErrorTypeConstructor.kt */
/* loaded from: classes8.dex */
public final class g implements q0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ErrorTypeKind f410192a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String[] f410193b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f410194c;

    public g(@k ErrorTypeKind errorTypeKind, @k String... strArr) {
        this.f410192a = errorTypeKind;
        this.f410193b = strArr;
        ErrorEntity[] errorEntityArr = ErrorEntity.f410134b;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f410194c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(errorTypeKind.f410175b, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @k
    public final Collection<O> C() {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @k
    public final InterfaceC42853f b() {
        h.f410195a.getClass();
        return h.f410197c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    public final boolean c() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @k
    public final List<g0> getParameters() {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @k
    public final kotlin.reflect.jvm.internal.impl.builtins.k m() {
        kotlin.reflect.jvm.internal.impl.builtins.e.f407194g.getClass();
        return kotlin.reflect.jvm.internal.impl.builtins.e.f407195h.getValue();
    }

    @k
    public final String toString() {
        return this.f410194c;
    }
}
