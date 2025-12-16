package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;

/* compiled from: LazyClassReceiverParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C42879x extends AbstractC42860d {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC42851d f407752d;

    /* renamed from: e, reason: collision with root package name */
    public final r51.e f407753e;

    /* JADX WARN: Illegal instructions before constructor call */
    public C42879x(@Y61.k InterfaceC42851d interfaceC42851d) {
        if (interfaceC42851d == null) {
            L(0);
            throw null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        g.a.C11652a c11652a = g.a.f407524b;
        if (c11652a == null) {
            AbstractC42860d.L(0);
            throw null;
        }
        super(c11652a, kotlin.reflect.jvm.internal.impl.name.h.f409260e);
        this.f407752d = interfaceC42851d;
        this.f407753e = new r51.e(interfaceC42851d);
    }

    public static /* synthetic */ void L(int i12) {
        String str = (i12 == 1 || i12 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 1 || i12 == 2) ? 2 : 3];
        if (i12 == 1 || i12 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else if (i12 != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i12 == 1) {
            objArr[1] = "getValue";
        } else if (i12 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (i12 != 1 && i12 != 2) {
            if (i12 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String str2 = String.format(str, objArr);
        if (i12 != 1 && i12 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    public final InterfaceC42882k f() {
        InterfaceC42851d interfaceC42851d = this.f407752d;
        if (interfaceC42851d != null) {
            return interfaceC42851d;
        }
        L(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.X
    @Y61.k
    public final r51.h getValue() {
        r51.e eVar = this.f407753e;
        if (eVar != null) {
            return eVar;
        }
        L(1);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n
    public final String toString() {
        return "class " + this.f407752d.getName() + "::this";
    }
}
