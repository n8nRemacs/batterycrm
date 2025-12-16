package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import r51.AbstractC47495a;

/* compiled from: ReceiverParameterDescriptorImpl.java */
/* loaded from: classes8.dex */
public class O extends AbstractC42860d {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC42882k f407615d;

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC47495a f407616e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.k AbstractC47495a abstractC47495a, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar) {
        this(interfaceC42882k, abstractC47495a, gVar, kotlin.reflect.jvm.internal.impl.name.h.f409260e);
        if (interfaceC42882k == null) {
            L(0);
            throw null;
        }
        if (gVar != null) {
        } else {
            L(2);
            throw null;
        }
    }

    public static /* synthetic */ void L(int i12) {
        String str = (i12 == 7 || i12 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 7 || i12 == 8) ? 2 : 3];
        switch (i12) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = "name";
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i12 == 7) {
            objArr[1] = "getValue";
        } else if (i12 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i12) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i12 != 7 && i12 != 8) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    public final InterfaceC42882k f() {
        InterfaceC42882k interfaceC42882k = this.f407615d;
        if (interfaceC42882k != null) {
            return interfaceC42882k;
        }
        L(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.X
    @Y61.k
    public final r51.h getValue() {
        AbstractC47495a abstractC47495a = this.f407616e;
        if (abstractC47495a != null) {
            return abstractC47495a;
        }
        L(7);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.k AbstractC47495a abstractC47495a, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(gVar, fVar);
        if (interfaceC42882k == null) {
            L(3);
            throw null;
        }
        if (gVar == null) {
            L(5);
            throw null;
        }
        if (fVar != null) {
            this.f407615d = interfaceC42882k;
            this.f407616e = abstractC47495a;
            return;
        }
        L(6);
        throw null;
    }
}
