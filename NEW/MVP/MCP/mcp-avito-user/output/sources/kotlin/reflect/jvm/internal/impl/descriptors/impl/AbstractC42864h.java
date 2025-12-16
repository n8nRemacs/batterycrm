package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.SearchParamsConverterKt;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.AbstractC42983j;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: AbstractTypeParameterDescriptor.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42864h extends AbstractC42871o implements g0 {

    /* renamed from: f, reason: collision with root package name */
    public final Variance f407659f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f407660g;

    /* renamed from: h, reason: collision with root package name */
    public final int f407661h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.storage.k<q0> f407662i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.storage.k<kotlin.reflect.jvm.internal.impl.types.Y> f407663j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.storage.p f407664k;

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.h$a */
    public class a implements Y41.a<q0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.storage.p f407665b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e0 f407666c;

        public a(kotlin.reflect.jvm.internal.impl.storage.p pVar, e0 e0Var) {
            this.f407665b = pVar;
            this.f407666c = e0Var;
        }

        @Override // Y41.a
        public final q0 invoke() {
            return new c(AbstractC42864h.this, this.f407665b, this.f407666c);
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.h$b */
    public class b implements Y41.a<kotlin.reflect.jvm.internal.impl.types.Y> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.name.f f407668b;

        public b(kotlin.reflect.jvm.internal.impl.name.f fVar) {
            this.f407668b = fVar;
        }

        @Override // Y41.a
        public final kotlin.reflect.jvm.internal.impl.types.Y invoke() {
            n0.f410236c.getClass();
            return kotlin.reflect.jvm.internal.impl.types.P.f(Collections.emptyList(), new kotlin.reflect.jvm.internal.impl.resolve.scopes.i(null, new C42865i(this), 1, null), n0.f410237d, AbstractC42864h.this.l(), false);
        }
    }

    /* compiled from: AbstractTypeParameterDescriptor.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.h$c */
    public class c extends AbstractC42983j {

        /* renamed from: c, reason: collision with root package name */
        public final e0 f407670c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AbstractC42864h f407671d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@Y61.k AbstractC42864h abstractC42864h, kotlin.reflect.jvm.internal.impl.storage.p pVar, e0 e0Var) {
            super(pVar);
            if (pVar == null) {
                n(0);
                throw null;
            }
            this.f407671d = abstractC42864h;
            this.f407670c = e0Var;
        }

        public static /* synthetic */ void n(int i12) {
            String str = (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5 || i12 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i12 == 1 || i12 == 2 || i12 == 3 || i12 == 4 || i12 == 5 || i12 == 8) ? 2 : 3];
            switch (i12) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                    break;
                case 6:
                    objArr[0] = "type";
                    break;
                case 7:
                    objArr[0] = "supertypes";
                    break;
                case 9:
                    objArr[0] = "classifier";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i12 == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i12 == 2) {
                objArr[1] = "getParameters";
            } else if (i12 == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i12 == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i12 == 5) {
                objArr[1] = "getSupertypeLoopChecker";
            } else if (i12 != 8) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            } else {
                objArr[1] = "processSupertypesWithoutCycles";
            }
            switch (i12) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                case 7:
                    objArr[2] = "processSupertypesWithoutCycles";
                    break;
                case 9:
                    objArr[2] = "isSameClassifier";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 4 && i12 != 5 && i12 != 8) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        @Y61.k
        public final InterfaceC42853f b() {
            AbstractC42864h abstractC42864h = this.f407671d;
            if (abstractC42864h != null) {
                return abstractC42864h;
            }
            n(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        public final boolean c() {
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42994t
        public final boolean d(@Y61.k InterfaceC42853f interfaceC42853f) {
            if (interfaceC42853f instanceof g0) {
                kotlin.reflect.jvm.internal.impl.resolve.h hVar = kotlin.reflect.jvm.internal.impl.resolve.h.f409624a;
                hVar.getClass();
                if (hVar.b(this.f407671d, (g0) interfaceC42853f, true, kotlin.reflect.jvm.internal.impl.resolve.g.f409623l)) {
                    return true;
                }
            }
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
        @Y61.k
        public final Collection<kotlin.reflect.jvm.internal.impl.types.O> e() {
            List<kotlin.reflect.jvm.internal.impl.types.O> listG0 = this.f407671d.G0();
            if (listG0 != null) {
                return listG0;
            }
            n(1);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
        @Y61.l
        public final kotlin.reflect.jvm.internal.impl.types.O f() {
            return kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410156h, new String[0]);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        @Y61.k
        public final List<g0> getParameters() {
            List<g0> listEmptyList = Collections.emptyList();
            if (listEmptyList != null) {
                return listEmptyList;
            }
            n(2);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
        @Y61.k
        public final e0 i() {
            e0 e0Var = this.f407670c;
            if (e0Var != null) {
                return e0Var;
            }
            n(5);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
        @Y61.k
        public final List<kotlin.reflect.jvm.internal.impl.types.O> k(@Y61.k List<kotlin.reflect.jvm.internal.impl.types.O> list) {
            if (list == null) {
                n(7);
                throw null;
            }
            List<kotlin.reflect.jvm.internal.impl.types.O> listN0 = this.f407671d.n0(list);
            if (listN0 != null) {
                return listN0;
            }
            n(8);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
        public final void l(@Y61.k kotlin.reflect.jvm.internal.impl.types.O o12) {
            if (o12 != null) {
                this.f407671d.F0(o12);
            } else {
                n(6);
                throw null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.builtins.k m() {
            kotlin.reflect.jvm.internal.impl.builtins.k kVarE = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(this.f407671d);
            if (kVarE != null) {
                return kVarE;
            }
            n(4);
            throw null;
        }

        public final String toString() {
            return this.f407671d.getName().f409252b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC42864h(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k Variance variance, boolean z12, int i12, @Y61.k b0 b0Var, @Y61.k e0 e0Var) {
        super(interfaceC42882k, gVar, fVar, b0Var);
        if (pVar == null) {
            L(0);
            throw null;
        }
        if (interfaceC42882k == null) {
            L(1);
            throw null;
        }
        if (gVar == null) {
            L(2);
            throw null;
        }
        if (fVar == null) {
            L(3);
            throw null;
        }
        if (variance == null) {
            L(4);
            throw null;
        }
        if (b0Var == null) {
            L(5);
            throw null;
        }
        if (e0Var == null) {
            L(6);
            throw null;
        }
        this.f407659f = variance;
        this.f407660g = z12;
        this.f407661h = i12;
        this.f407662i = pVar.g(new a(pVar, e0Var));
        this.f407663j = pVar.g(new b(fVar));
        this.f407664k = pVar;
    }

    public static /* synthetic */ void L(int i12) {
        String str;
        int i13;
        switch (i12) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 12:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i12) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                i13 = 2;
                break;
            case 12:
            default:
                i13 = 3;
                break;
        }
        Object[] objArr = new Object[i13];
        switch (i12) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 12:
                objArr[0] = "bounds";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i12) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            case 12:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
                break;
            case 13:
                objArr[1] = "processBoundsWithoutCycles";
                break;
            case 14:
                objArr[1] = "getStorageManager";
                break;
        }
        switch (i12) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                break;
            case 12:
                objArr[2] = "processBoundsWithoutCycles";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i12) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 13:
            case 14:
                throw new IllegalStateException(str2);
            case 12:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final <R, D> R A(InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return (R) interfaceC42884m.m(this, d12);
    }

    public abstract void F0(@Y61.k kotlin.reflect.jvm.internal.impl.types.O o12);

    @Y61.k
    public abstract List<kotlin.reflect.jvm.internal.impl.types.O> G0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    /* renamed from: a */
    public final InterfaceC42853f n0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public final int getIndex() {
        return this.f407661h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.p getStorageManager() {
        kotlin.reflect.jvm.internal.impl.storage.p pVar = this.f407664k;
        if (pVar != null) {
            return pVar;
        }
        L(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.types.O> getUpperBounds() {
        List<kotlin.reflect.jvm.internal.impl.types.O> listC = ((c) l()).C();
        if (listC != null) {
            return listC;
        }
        L(8);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    public final q0 l() {
        q0 q0VarInvoke = this.f407662i.invoke();
        if (q0VarInvoke != null) {
            return q0VarInvoke;
        }
        L(9);
        throw null;
    }

    @Y61.k
    public List<kotlin.reflect.jvm.internal.impl.types.O> n0(@Y61.k List<kotlin.reflect.jvm.internal.impl.types.O> list) {
        if (list == null) {
            L(12);
            throw null;
        }
        if (list != null) {
            return list;
        }
        L(13);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    @Y61.k
    public final Variance o() {
        Variance variance = this.f407659f;
        if (variance != null) {
            return variance;
        }
        L(7);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.Y q() {
        kotlin.reflect.jvm.internal.impl.types.Y yInvoke = this.f407663j.invoke();
        if (yInvoke != null) {
            return yInvoke;
        }
        L(10);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public final boolean s() {
        return this.f407660g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.g0
    public final boolean u() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    /* renamed from: a */
    public final InterfaceC42882k n0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    /* renamed from: a */
    public final g0 n0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o
    @Y61.k
    /* renamed from: U */
    public final InterfaceC42885n n0() {
        return this;
    }
}
