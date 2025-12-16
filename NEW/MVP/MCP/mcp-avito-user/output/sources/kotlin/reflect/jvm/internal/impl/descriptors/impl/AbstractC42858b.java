package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.types.A0;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.checker.i;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: AbstractClassDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42858b extends A {

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.name.f f407643c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.storage.k<kotlin.reflect.jvm.internal.impl.types.Y> f407644d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.storage.k<kotlin.reflect.jvm.internal.impl.resolve.scopes.j> f407645e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.storage.k<kotlin.reflect.jvm.internal.impl.descriptors.X> f407646f;

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.b$a */
    public class a implements Y41.a<kotlin.reflect.jvm.internal.impl.types.Y> {
        public a() {
        }

        @Override // Y41.a
        public final kotlin.reflect.jvm.internal.impl.types.Y invoke() {
            AbstractC42858b abstractC42858b = AbstractC42858b.this;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarG0 = abstractC42858b.g0();
            C42857a c42857a = new C42857a(this);
            kotlin.reflect.jvm.internal.impl.types.error.f fVar = G0.f410019a;
            return kotlin.reflect.jvm.internal.impl.types.error.h.e(abstractC42858b) ? kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410160l, abstractC42858b.toString()) : G0.m(abstractC42858b.l(), jVarG0, c42857a);
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.b$b, reason: collision with other inner class name */
    public class C11653b implements Y41.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.j> {
        public C11653b() {
        }

        @Override // Y41.a
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j invoke() {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.h(AbstractC42858b.this.g0());
        }
    }

    /* compiled from: AbstractClassDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.b$c */
    public class c implements Y41.a<kotlin.reflect.jvm.internal.impl.descriptors.X> {
        public c() {
        }

        @Override // Y41.a
        public final kotlin.reflect.jvm.internal.impl.descriptors.X invoke() {
            return new C42879x(AbstractC42858b.this);
        }
    }

    public AbstractC42858b(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        if (pVar == null) {
            U(0);
            throw null;
        }
        if (fVar == null) {
            U(1);
            throw null;
        }
        this.f407643c = fVar;
        this.f407644d = pVar.g(new a());
        this.f407645e = pVar.g(new C11653b());
        this.f407646f = pVar.g(new c());
    }

    public static /* synthetic */ void U(int i12) {
        String str = (i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5 || i12 == 6 || i12 == 9 || i12 == 12 || i12 == 14 || i12 == 16 || i12 == 17 || i12 == 19 || i12 == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5 || i12 == 6 || i12 == 9 || i12 == 12 || i12 == 14 || i12 == 16 || i12 == 17 || i12 == 19 || i12 == 20) ? 2 : 3];
        switch (i12) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i12 == 2) {
            objArr[1] = "getName";
        } else if (i12 == 3) {
            objArr[1] = "getOriginal";
        } else if (i12 == 4) {
            objArr[1] = "getUnsubstitutedInnerClassesScope";
        } else if (i12 == 5) {
            objArr[1] = "getThisAsReceiverParameter";
        } else if (i12 == 6) {
            objArr[1] = "getContextReceivers";
        } else if (i12 == 9 || i12 == 12 || i12 == 14 || i12 == 16) {
            objArr[1] = "getMemberScope";
        } else if (i12 == 17) {
            objArr[1] = "getUnsubstitutedMemberScope";
        } else if (i12 == 19) {
            objArr[1] = "substitute";
        } else if (i12 != 20) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        } else {
            objArr[1] = "getDefaultType";
        }
        switch (i12) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i12 != 2 && i12 != 3 && i12 != 4 && i12 != 5 && i12 != 6 && i12 != 9 && i12 != 12 && i12 != 14 && i12 != 16 && i12 != 17 && i12 != 19 && i12 != 20) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final <R, D> R A(InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return (R) interfaceC42884m.i(this, d12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.A
    @Y61.k
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.j L(@Y61.k A0 a02, @Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        if (iVar == null) {
            U(11);
            throw null;
        }
        if (!a02.e()) {
            return new kotlin.reflect.jvm.internal.impl.resolve.scopes.q(N(iVar), E0.e(a02));
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarN = N(iVar);
        if (jVarN != null) {
            return jVarN;
        }
        U(12);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j R(@Y61.k A0 a02) {
        kotlin.reflect.jvm.internal.impl.descriptors.E eD2 = kotlin.reflect.jvm.internal.impl.resolve.j.d(this);
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarL = L(a02, i.a.f410099a);
        if (jVarL != null) {
            return jVarL;
        }
        U(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.A, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    /* renamed from: a */
    public final InterfaceC42851d n0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.j f0() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarInvoke = this.f407645e.invoke();
        if (jVarInvoke != null) {
            return jVarInvoke;
        }
        U(4);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.j g0() {
        kotlin.reflect.jvm.internal.impl.descriptors.E eD2 = kotlin.reflect.jvm.internal.impl.resolve.j.d(this);
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarN = N(i.a.f410099a);
        if (jVarN != null) {
            return jVarN;
        }
        U(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.G
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f getName() {
        kotlin.reflect.jvm.internal.impl.name.f fVar = this.f407643c;
        if (fVar != null) {
            return fVar;
        }
        U(2);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.m0
    @Y61.k
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public InterfaceC42851d b(@Y61.k E0 e02) {
        if (e02 != null) {
            return e02.f410010a.e() ? this : new z(this, e02);
        }
        U(18);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.X p0() {
        kotlin.reflect.jvm.internal.impl.descriptors.X xInvoke = this.f407646f.invoke();
        if (xInvoke != null) {
            return xInvoke;
        }
        U(5);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.Y q() {
        kotlin.reflect.jvm.internal.impl.types.Y yInvoke = this.f407644d.invoke();
        if (yInvoke != null) {
            return yInvoke;
        }
        U(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public List<kotlin.reflect.jvm.internal.impl.descriptors.X> u0() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.X> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        U(6);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.A, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    /* renamed from: a */
    public final InterfaceC42853f n0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.A, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    /* renamed from: a */
    public final InterfaceC42882k n0() {
        return this;
    }
}
