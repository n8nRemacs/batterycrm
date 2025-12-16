package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42903v;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.types.A0;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.g;

/* compiled from: PropertyDescriptorImpl.java */
/* loaded from: classes8.dex */
public class L extends Y implements kotlin.reflect.jvm.internal.impl.descriptors.U {

    /* renamed from: A, reason: collision with root package name */
    public C42875t f407582A;

    /* renamed from: j, reason: collision with root package name */
    public final Modality f407583j;

    /* renamed from: k, reason: collision with root package name */
    public AbstractC42900s f407584k;

    /* renamed from: l, reason: collision with root package name */
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.U> f407585l;

    /* renamed from: m, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.descriptors.U f407586m;

    /* renamed from: n, reason: collision with root package name */
    public final CallableMemberDescriptor.Kind f407587n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f407588o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f407589p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f407590q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f407591r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f407592s;

    /* renamed from: t, reason: collision with root package name */
    public List<kotlin.reflect.jvm.internal.impl.descriptors.X> f407593t;

    /* renamed from: u, reason: collision with root package name */
    public kotlin.reflect.jvm.internal.impl.descriptors.X f407594u;

    /* renamed from: v, reason: collision with root package name */
    public O f407595v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f407596w;

    /* renamed from: x, reason: collision with root package name */
    public M f407597x;

    /* renamed from: y, reason: collision with root package name */
    public N f407598y;

    /* renamed from: z, reason: collision with root package name */
    public C42875t f407599z;

    /* compiled from: PropertyDescriptorImpl.java */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC42882k f407600a;

        /* renamed from: b, reason: collision with root package name */
        public Modality f407601b;

        /* renamed from: c, reason: collision with root package name */
        public AbstractC42900s f407602c;

        /* renamed from: e, reason: collision with root package name */
        public CallableMemberDescriptor.Kind f407604e;

        /* renamed from: h, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.descriptors.X f407607h;

        /* renamed from: i, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.name.f f407608i;

        /* renamed from: j, reason: collision with root package name */
        public final kotlin.reflect.jvm.internal.impl.types.O f407609j;

        /* renamed from: d, reason: collision with root package name */
        public kotlin.reflect.jvm.internal.impl.descriptors.U f407603d = null;

        /* renamed from: f, reason: collision with root package name */
        public A0 f407605f = A0.f410003a;

        /* renamed from: g, reason: collision with root package name */
        public boolean f407606g = true;

        public a() {
            this.f407600a = L.this.f();
            this.f407601b = L.this.i();
            this.f407602c = L.this.getVisibility();
            this.f407604e = L.this.getKind();
            this.f407607h = L.this.f407594u;
            this.f407608i = L.this.getName();
            this.f407609j = L.this.getType();
        }

        public static /* synthetic */ void a(int i12) {
            String str = (i12 == 1 || i12 == 2 || i12 == 3 || i12 == 5 || i12 == 7 || i12 == 9 || i12 == 11 || i12 == 19 || i12 == 13 || i12 == 14 || i12 == 16 || i12 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i12 == 1 || i12 == 2 || i12 == 3 || i12 == 5 || i12 == 7 || i12 == 9 || i12 == 11 || i12 == 19 || i12 == 13 || i12 == 14 || i12 == 16 || i12 == 17) ? 2 : 3];
            switch (i12) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = MessageBody.Location.KIND;
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = SearchParamsConverterKt.OWNER;
                    break;
            }
            if (i12 == 1) {
                objArr[1] = "setOwner";
            } else if (i12 == 2) {
                objArr[1] = "setOriginal";
            } else if (i12 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i12 == 5) {
                objArr[1] = "setReturnType";
            } else if (i12 == 7) {
                objArr[1] = "setModality";
            } else if (i12 == 9) {
                objArr[1] = "setVisibility";
            } else if (i12 == 11) {
                objArr[1] = "setKind";
            } else if (i12 == 19) {
                objArr[1] = "setName";
            } else if (i12 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i12 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i12 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i12 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i12) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i12 != 1 && i12 != 2 && i12 != 3 && i12 != 5 && i12 != 7 && i12 != 9 && i12 != 11 && i12 != 19 && i12 != 13 && i12 != 14 && i12 != 16 && i12 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [Y41.a, kotlin.jvm.internal.N] */
        @Y61.l
        public final L b() {
            AbstractC42860d abstractC42860d;
            O o12;
            M m12;
            N n12;
            ?? r22;
            L l12 = L.this;
            l12.getClass();
            InterfaceC42882k interfaceC42882k = this.f407600a;
            Modality modality = this.f407601b;
            AbstractC42900s abstractC42900s = this.f407602c;
            kotlin.reflect.jvm.internal.impl.descriptors.U u12 = this.f407603d;
            CallableMemberDescriptor.Kind kind = this.f407604e;
            b0 b0Var = b0.f407539a;
            if (b0Var == null) {
                L.L(28);
                throw null;
            }
            L lI02 = l12.I0(interfaceC42882k, modality, abstractC42900s, u12, kind, this.f407608i, b0Var);
            List<g0> typeParameters = l12.getTypeParameters();
            ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
            E0 e0B = kotlin.reflect.jvm.internal.impl.types.A.b(typeParameters, this.f407605f, lI02, arrayList);
            Variance variance = Variance.f410071f;
            kotlin.reflect.jvm.internal.impl.types.O o13 = this.f407609j;
            kotlin.reflect.jvm.internal.impl.types.O oJ2 = e0B.j(o13, variance);
            if (oJ2 != null) {
                Variance variance2 = Variance.f410070e;
                kotlin.reflect.jvm.internal.impl.types.O oJ3 = e0B.j(o13, variance2);
                if (oJ3 != null) {
                    lI02.K0(oJ3);
                }
                kotlin.reflect.jvm.internal.impl.descriptors.X x12 = this.f407607h;
                if (x12 != null) {
                    AbstractC42860d abstractC42860dB = x12.b(e0B);
                    abstractC42860d = abstractC42860dB != null ? abstractC42860dB : null;
                }
                O o14 = l12.f407595v;
                if (o14 != null) {
                    kotlin.reflect.jvm.internal.impl.types.O oJ4 = e0B.j(o14.getType(), variance2);
                    o12 = oJ4 == null ? null : new O(lI02, new r51.d(lI02, oJ4, o14.getValue()), o14.getAnnotations());
                } else {
                    o12 = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.descriptors.X x13 : l12.f407593t) {
                    kotlin.reflect.jvm.internal.impl.types.O oJ5 = e0B.j(x13.getType(), Variance.f410070e);
                    O o15 = oJ5 == null ? null : new O(lI02, new r51.c(lI02, oJ5, ((r51.f) x13.getValue()).a(), x13.getValue()), x13.getAnnotations());
                    if (o15 != null) {
                        arrayList2.add(o15);
                    }
                }
                lI02.L0(oJ2, arrayList, abstractC42860d, o12, arrayList2);
                M m13 = l12.f407597x;
                CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.f407409c;
                if (m13 == null) {
                    m12 = null;
                } else {
                    kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = m13.getAnnotations();
                    Modality modality2 = this.f407601b;
                    AbstractC42900s visibility = l12.f407597x.getVisibility();
                    if (this.f407604e == kind2 && kotlin.reflect.jvm.internal.impl.descriptors.r.e(visibility.d())) {
                        visibility = kotlin.reflect.jvm.internal.impl.descriptors.r.f407792h;
                    }
                    AbstractC42900s abstractC42900s2 = visibility;
                    M m14 = l12.f407597x;
                    boolean z12 = m14.f407574f;
                    CallableMemberDescriptor.Kind kind3 = this.f407604e;
                    kotlin.reflect.jvm.internal.impl.descriptors.U u13 = this.f407603d;
                    m12 = new M(lI02, annotations, modality2, abstractC42900s2, z12, m14.f407575g, m14.f407578j, kind3, u13 == null ? null : u13.getGetter(), b0.f407539a);
                }
                if (m12 != null) {
                    M m15 = l12.f407597x;
                    kotlin.reflect.jvm.internal.impl.types.O o16 = m15.f407611n;
                    m12.f407581m = m15.A0() != null ? m15.A0().b(e0B) : null;
                    m12.H0(o16 != null ? e0B.j(o16, Variance.f410071f) : null);
                }
                N n13 = l12.f407598y;
                if (n13 == null) {
                    n12 = null;
                } else {
                    kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations2 = n13.getAnnotations();
                    Modality modality3 = this.f407601b;
                    AbstractC42900s visibility2 = l12.f407598y.getVisibility();
                    if (this.f407604e == kind2 && kotlin.reflect.jvm.internal.impl.descriptors.r.e(visibility2.d())) {
                        visibility2 = kotlin.reflect.jvm.internal.impl.descriptors.r.f407792h;
                    }
                    AbstractC42900s abstractC42900s3 = visibility2;
                    N n14 = l12.f407598y;
                    boolean z13 = n14.f407574f;
                    boolean z14 = n14.f407575g;
                    boolean z15 = n14.f407578j;
                    CallableMemberDescriptor.Kind kind4 = this.f407604e;
                    kotlin.reflect.jvm.internal.impl.descriptors.U u14 = this.f407603d;
                    n12 = new N(lI02, annotations2, modality3, abstractC42900s3, z13, z14, z15, kind4, u14 == null ? null : u14.c(), b0.f407539a);
                }
                if (n12 != null) {
                    List listH0 = AbstractC42878w.H0(n12, l12.f407598y.g(), e0B, false, false, null);
                    if (listH0 == null) {
                        listH0 = Collections.singletonList(N.G0(n12, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(this.f407600a).m(), l12.f407598y.g().get(0).getAnnotations()));
                    }
                    if (listH0.size() != 1) {
                        throw new IllegalStateException();
                    }
                    N n15 = l12.f407598y;
                    if (n15 == null) {
                        L.L(31);
                        throw null;
                    }
                    n12.f407581m = n15.A0() != null ? n15.A0().b(e0B) : null;
                    k0 k0Var = (k0) listH0.get(0);
                    if (k0Var == null) {
                        N.L(6);
                        throw null;
                    }
                    n12.f407613n = k0Var;
                }
                C42875t c42875t = l12.f407599z;
                C42875t c42875t2 = c42875t == null ? null : new C42875t(c42875t.getAnnotations(), lI02);
                C42875t c42875t3 = l12.f407582A;
                lI02.J0(m12, n12, c42875t2, c42875t3 == null ? null : new C42875t(c42875t3.getAnnotations(), lI02));
                if (this.f407606g) {
                    kotlin.reflect.jvm.internal.impl.utils.g.f410367d.getClass();
                    kotlin.reflect.jvm.internal.impl.utils.g gVarA = g.b.a();
                    Iterator<? extends kotlin.reflect.jvm.internal.impl.descriptors.U> it = l12.p().iterator();
                    while (it.hasNext()) {
                        gVarA.add(it.next().b(e0B));
                    }
                    lI02.f407585l = gVarA;
                }
                if (l12.isConst() && (r22 = l12.f407641i) != 0) {
                    lI02.F0(l12.f407640h, r22);
                }
                return lI02;
            }
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.l kotlin.reflect.jvm.internal.impl.descriptors.U u12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k Modality modality, @Y61.k AbstractC42900s abstractC42900s, boolean z12, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k CallableMemberDescriptor.Kind kind, @Y61.k b0 b0Var, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        super(interfaceC42882k, gVar, fVar, z12, b0Var);
        if (interfaceC42882k == null) {
            L(0);
            throw null;
        }
        if (gVar == null) {
            L(1);
            throw null;
        }
        if (modality == null) {
            L(2);
            throw null;
        }
        if (abstractC42900s == null) {
            L(3);
            throw null;
        }
        if (fVar == null) {
            L(4);
            throw null;
        }
        if (kind == null) {
            L(5);
            throw null;
        }
        if (b0Var == null) {
            L(6);
            throw null;
        }
        this.f407585l = null;
        this.f407593t = Collections.emptyList();
        this.f407583j = modality;
        this.f407584k = abstractC42900s;
        this.f407586m = u12 == null ? this : u12;
        this.f407587n = kind;
        this.f407588o = z13;
        this.f407589p = z14;
        this.f407590q = z15;
        this.f407591r = z16;
        this.f407592s = z17;
    }

    @Y61.k
    public static L H0(@Y61.k InterfaceC42851d interfaceC42851d, @Y61.k g.a.C11652a c11652a, @Y61.k Modality modality, @Y61.k AbstractC42900s abstractC42900s, boolean z12, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k CallableMemberDescriptor.Kind kind, @Y61.k b0 b0Var) {
        if (interfaceC42851d == null) {
            L(7);
            throw null;
        }
        if (c11652a == null) {
            L(8);
            throw null;
        }
        if (abstractC42900s == null) {
            L(10);
            throw null;
        }
        if (fVar == null) {
            L(11);
            throw null;
        }
        if (b0Var != null) {
            return new L(interfaceC42851d, null, c11652a, modality, abstractC42900s, z12, fVar, kind, b0Var, false, false, false, false, false);
        }
        L(13);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void L(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.L.L(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final <R, D> R A(InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return (R) interfaceC42884m.a(this, d12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final boolean D0() {
        return this.f407588o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.X, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.X F() {
        return this.f407594u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @Y61.k
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public final L n0(InterfaceC42851d interfaceC42851d, Modality modality, AbstractC42887p abstractC42887p) {
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.f407409c;
        a aVar = new a();
        if (interfaceC42851d == null) {
            a.a(0);
            throw null;
        }
        aVar.f407600a = interfaceC42851d;
        aVar.f407603d = null;
        aVar.f407601b = modality;
        if (abstractC42887p == null) {
            a.a(8);
            throw null;
        }
        aVar.f407602c = abstractC42887p;
        aVar.f407604e = kind;
        aVar.f407606g = false;
        L lB2 = aVar.b();
        if (lB2 != null) {
            return lB2;
        }
        L(42);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.X, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.X H() {
        return this.f407595v;
    }

    @Y61.k
    public L I0(@Y61.k InterfaceC42882k interfaceC42882k, @Y61.k Modality modality, @Y61.k AbstractC42900s abstractC42900s, @Y61.l kotlin.reflect.jvm.internal.impl.descriptors.U u12, @Y61.k CallableMemberDescriptor.Kind kind, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k b0 b0Var) {
        if (interfaceC42882k == null) {
            L(32);
            throw null;
        }
        if (modality == null) {
            L(33);
            throw null;
        }
        if (abstractC42900s == null) {
            L(34);
            throw null;
        }
        if (kind == null) {
            L(35);
            throw null;
        }
        if (fVar == null) {
            L(36);
            throw null;
        }
        if (b0Var == null) {
            L(37);
            throw null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = getAnnotations();
        boolean zIsConst = isConst();
        boolean zIsExternal = isExternal();
        return new L(interfaceC42882k, u12, annotations, modality, abstractC42900s, this.f407639g, fVar, kind, b0Var, this.f407588o, zIsConst, this.f407590q, zIsExternal, this.f407592s);
    }

    public final void J0(@Y61.l M m12, @Y61.l N n12, @Y61.l C42875t c42875t, @Y61.l C42875t c42875t2) {
        this.f407597x = m12;
        this.f407598y = n12;
        this.f407599z = c42875t;
        this.f407582A = c42875t2;
    }

    public final void L0(@Y61.k kotlin.reflect.jvm.internal.impl.types.O o12, @Y61.k List list, @Y61.l kotlin.reflect.jvm.internal.impl.descriptors.X x12, @Y61.l O o13, @Y61.k List list2) {
        if (o12 == null) {
            L(17);
            throw null;
        }
        if (list == null) {
            L(18);
            throw null;
        }
        if (list2 == null) {
            L(19);
            throw null;
        }
        this.f407638f = o12;
        this.f407596w = new ArrayList(list);
        this.f407595v = o13;
        this.f407594u = x12;
        this.f407593t = list2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean O() {
        return this.f407590q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.X> T() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.X> list = this.f407593t;
        if (list != null) {
            return list;
        }
        L(22);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.U
    @Y61.k
    public final ArrayList X() {
        ArrayList arrayList = new ArrayList(2);
        M m12 = this.f407597x;
        if (m12 != null) {
            arrayList.add(m12);
        }
        N n12 = this.f407598y;
        if (n12 != null) {
            arrayList.add(n12);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.U
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.W c() {
        return this.f407598y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.U
    @Y61.l
    public final InterfaceC42903v d0() {
        return this.f407582A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.U
    @Y61.l
    public final M getGetter() {
        return this.f407597x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @Y61.k
    public final CallableMemberDescriptor.Kind getKind() {
        CallableMemberDescriptor.Kind kind = this.f407587n;
        if (kind != null) {
            return kind;
        }
        L(39);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.X, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.O getReturnType() {
        kotlin.reflect.jvm.internal.impl.types.O type = getType();
        if (type != null) {
            return type;
        }
        L(23);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.X, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final List<g0> getTypeParameters() {
        ArrayList arrayList = this.f407596w;
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final AbstractC42900s getVisibility() {
        AbstractC42900s abstractC42900s = this.f407584k;
        if (abstractC42900s != null) {
            return abstractC42900s;
        }
        L(25);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final Modality i() {
        Modality modality = this.f407583j;
        if (modality != null) {
            return modality;
        }
        L(24);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    public boolean isConst() {
        return this.f407589p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public boolean isExternal() {
        return this.f407591r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.U
    @Y61.l
    public final InterfaceC42903v j0() {
        return this.f407599z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void l0(@Y61.k Collection<? extends CallableMemberDescriptor> collection) {
        if (collection != 0) {
            this.f407585l = collection;
        } else {
            L(40);
            throw null;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.X, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.U> p() {
        Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.U> collectionEmptyList = this.f407585l;
        if (collectionEmptyList == null) {
            collectionEmptyList = Collections.emptyList();
        }
        if (collectionEmptyList != null) {
            return collectionEmptyList;
        }
        L(41);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n0
    public final boolean r0() {
        return this.f407592s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean t0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.l
    public <V> V x(InterfaceC42848a.InterfaceC11651a<V> interfaceC11651a) {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.X, kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final kotlin.reflect.jvm.internal.impl.descriptors.U b(@Y61.k E0 e02) {
        if (e02 != null) {
            if (e02.f410010a.e()) {
                return this;
            }
            a aVar = new a();
            A0 a0G = e02.g();
            if (a0G != null) {
                aVar.f407605f = a0G;
                aVar.f407603d = n0();
                return aVar.b();
            }
            a.a(15);
            throw null;
        }
        L(27);
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.X
    @Y61.k
    /* renamed from: a */
    public final kotlin.reflect.jvm.internal.impl.descriptors.U n0() {
        kotlin.reflect.jvm.internal.impl.descriptors.U u12 = this.f407586m;
        kotlin.reflect.jvm.internal.impl.descriptors.U uN02 = u12 == this ? this : u12.n0();
        if (uN02 != null) {
            return uN02;
        }
        L(38);
        throw null;
    }

    public void K0(@Y61.k kotlin.reflect.jvm.internal.impl.types.O o12) {
    }
}
