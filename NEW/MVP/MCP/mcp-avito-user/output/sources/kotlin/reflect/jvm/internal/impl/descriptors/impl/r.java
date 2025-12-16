package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.SearchParamsConverterKt;
import i51.InterfaceC41228b;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.types.AbstractC42983j;
import kotlin.reflect.jvm.internal.impl.types.C42993s;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: EnumEntrySyntheticClassDescriptor.java */
/* loaded from: classes8.dex */
public class r extends AbstractC42867k {

    /* renamed from: i, reason: collision with root package name */
    public final C42993s f407687i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j f407688j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.storage.k<Set<kotlin.reflect.jvm.internal.impl.name.f>> f407689k;

    /* renamed from: l, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f407690l;

    /* compiled from: EnumEntrySyntheticClassDescriptor.java */
    public class a extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k {

        /* renamed from: b, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends a0>> f407691b;

        /* renamed from: c, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.U>> f407692c;

        /* renamed from: d, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.storage.k<Collection<InterfaceC42882k>> f407693d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r f407694e;

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.r$a$a, reason: collision with other inner class name */
        public class C11654a implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends a0>> {
            public C11654a() {
            }

            @Override // Y41.l
            public final Collection<? extends a0> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
                kotlin.reflect.jvm.internal.impl.name.f fVar2 = fVar;
                a aVar = a.this;
                if (fVar2 != null) {
                    return aVar.j(fVar2, aVar.i().d(fVar2, NoLookupLocation.f407889g));
                }
                aVar.getClass();
                a.h(8);
                throw null;
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        public class b implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.U>> {
            public b() {
            }

            @Override // Y41.l
            public final Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.U> invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
                kotlin.reflect.jvm.internal.impl.name.f fVar2 = fVar;
                a aVar = a.this;
                if (fVar2 != null) {
                    return aVar.j(fVar2, aVar.i().f(fVar2, NoLookupLocation.f407889g));
                }
                aVar.getClass();
                a.h(4);
                throw null;
            }
        }

        /* compiled from: EnumEntrySyntheticClassDescriptor.java */
        public class c implements Y41.a<Collection<InterfaceC42882k>> {
            public c() {
            }

            @Override // Y41.a
            public final Collection<InterfaceC42882k> invoke() {
                a aVar = a.this;
                aVar.getClass();
                HashSet hashSet = new HashSet();
                for (kotlin.reflect.jvm.internal.impl.name.f fVar : aVar.f407694e.f407689k.invoke()) {
                    NoLookupLocation noLookupLocation = NoLookupLocation.f407889g;
                    hashSet.addAll(aVar.d(fVar, noLookupLocation));
                    hashSet.addAll(aVar.f(fVar, noLookupLocation));
                }
                return hashSet;
            }
        }

        public a(@Y61.k r rVar, kotlin.reflect.jvm.internal.impl.storage.p pVar) {
            if (pVar == null) {
                h(0);
                throw null;
            }
            this.f407694e = rVar;
            this.f407691b = pVar.c(new C11654a());
            this.f407692c = pVar.c(new b());
            this.f407693d = pVar.g(new c());
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void h(int r13) {
            /*
                Method dump skipped, instructions count: 346
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.r.a.h(int):void");
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> setInvoke = this.f407694e.f407689k.invoke();
            if (setInvoke != null) {
                return setInvoke;
            }
            h(17);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> setInvoke = this.f407694e.f407689k.invoke();
            if (setInvoke != null) {
                return setInvoke;
            }
            h(19);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
            Set<kotlin.reflect.jvm.internal.impl.name.f> setEmptySet = Collections.emptySet();
            if (setEmptySet != null) {
                return setEmptySet;
            }
            h(18);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
        @Y61.k
        public final Collection<? extends a0> d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
            if (fVar == null) {
                h(5);
                throw null;
            }
            Collection<? extends a0> collectionInvoke = this.f407691b.invoke(fVar);
            if (collectionInvoke != null) {
                return collectionInvoke;
            }
            h(7);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
        @Y61.k
        public final Collection<InterfaceC42882k> e(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
            if (dVar == null) {
                h(13);
                throw null;
            }
            if (lVar == null) {
                h(14);
                throw null;
            }
            Collection<InterfaceC42882k> collectionInvoke = this.f407693d.invoke();
            if (collectionInvoke != null) {
                return collectionInvoke;
            }
            h(15);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
        @Y61.k
        public final Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
            if (fVar == null) {
                h(1);
                throw null;
            }
            Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.U> collectionInvoke = this.f407692c.invoke(fVar);
            if (collectionInvoke != null) {
                return collectionInvoke;
            }
            h(3);
            throw null;
        }

        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j i() {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarN = ((AbstractC42983j) this.f407694e.l()).C().iterator().next().n();
            if (jVarN != null) {
                return jVarN;
            }
            h(9);
            throw null;
        }

        @Y61.k
        public final LinkedHashSet j(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k Collection collection) {
            if (fVar == null) {
                h(10);
                throw null;
            }
            if (collection == null) {
                h(11);
                throw null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            OverridingUtil.f409560e.h(fVar, collection, Collections.emptySet(), this.f407694e, new C42874s(linkedHashSet));
            return linkedHashSet;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k InterfaceC42851d interfaceC42851d, @Y61.k kotlin.reflect.jvm.internal.impl.types.Y y12, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.storage.k kVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k b0 b0Var) {
        super(pVar, interfaceC42851d, fVar, b0Var);
        if (pVar == null) {
            U(6);
            throw null;
        }
        if (interfaceC42851d == null) {
            U(7);
            throw null;
        }
        if (y12 == null) {
            U(8);
            throw null;
        }
        if (fVar == null) {
            U(9);
            throw null;
        }
        if (kVar == null) {
            U(10);
            throw null;
        }
        if (b0Var == null) {
            U(12);
            throw null;
        }
        this.f407690l = gVar;
        this.f407687i = new C42993s(this, Collections.emptyList(), Collections.singleton(y12), pVar);
        this.f407688j = new a(this, pVar);
        this.f407689k = kVar;
    }

    @Y61.k
    public static r F0(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k InterfaceC42851d interfaceC42851d, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.storage.k<Set<kotlin.reflect.jvm.internal.impl.name.f>> kVar, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k b0 b0Var) {
        if (pVar == null) {
            U(0);
            throw null;
        }
        if (interfaceC42851d == null) {
            U(1);
            throw null;
        }
        if (fVar == null) {
            U(2);
            throw null;
        }
        if (kVar == null) {
            U(3);
            throw null;
        }
        if (b0Var != null) {
            return new r(pVar, interfaceC42851d, interfaceC42851d.q(), fVar, kVar, gVar, b0Var);
        }
        U(5);
        throw null;
    }

    public static /* synthetic */ void U(int i12) {
        String str;
        int i13;
        switch (i12) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i12) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i13 = 2;
                break;
            default:
                i13 = 3;
                break;
        }
        Object[] objArr = new Object[i13];
        switch (i12) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = SearchParamsConverterKt.SOURCE;
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i12) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i12) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i12) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final Collection<InterfaceC42850c> G() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        U(16);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final i0<kotlin.reflect.jvm.internal.impl.types.Y> I() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean M() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.A
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j N(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        if (iVar == null) {
            U(13);
            throw null;
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar = this.f407688j;
        if (jVar != null) {
            return jVar;
        }
        U(14);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean O() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j P() {
        j.c cVar = j.c.f409687b;
        if (cVar != null) {
            return cVar;
        }
        U(15);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean W() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    public final boolean Y() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar = this.f407690l;
        if (gVar != null) {
            return gVar;
        }
        U(21);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final ClassKind getKind() {
        return ClassKind.f407416e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final AbstractC42900s getVisibility() {
        AbstractC42900s abstractC42900s = kotlin.reflect.jvm.internal.impl.descriptors.r.f407789e;
        if (abstractC42900s != null) {
            return abstractC42900s;
        }
        U(20);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final Modality i() {
        return Modality.f407439c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean isInline() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    public final q0 l() {
        C42993s c42993s = this.f407687i;
        if (c42993s != null) {
            return c42993s;
        }
        U(17);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final Collection<InterfaceC42851d> q0() {
        List listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        U(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    @Y61.k
    public final List<g0> r() {
        List<g0> listEmptyList = Collections.emptyList();
        if (listEmptyList != null) {
            return listEmptyList;
        }
        U(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final InterfaceC42850c t() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean t0() {
        return false;
    }

    public final String toString() {
        return "enum entry " + getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean v0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean w0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final InterfaceC42851d x0() {
        return null;
    }
}
