package kotlin.reflect.jvm.internal.impl.resolve;

import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.T;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.W;
import kotlin.reflect.jvm.internal.impl.descriptors.X;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.K;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.L;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.types.C42975f;
import kotlin.reflect.jvm.internal.impl.types.H;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Q;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42970f;
import kotlin.reflect.jvm.internal.impl.types.checker.g;
import kotlin.reflect.jvm.internal.impl.types.checker.i;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.utils.g;

/* loaded from: classes8.dex */
public class OverridingUtil {

    /* renamed from: d, reason: collision with root package name */
    public static final List<ExternalOverridabilityCondition> f409559d = C42745f0.M0(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* renamed from: e, reason: collision with root package name */
    public static final OverridingUtil f409560e;

    /* renamed from: f, reason: collision with root package name */
    public static final InterfaceC42970f.a f409561f;

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.types.checker.i f409562a;

    /* renamed from: b, reason: collision with root package name */
    public final g.a f409563b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC42970f.a f409564c;

    public static class OverrideCompatibilityInfo {

        /* renamed from: b, reason: collision with root package name */
        public static final OverrideCompatibilityInfo f409565b = new OverrideCompatibilityInfo(Result.f409567b, "SUCCESS");

        /* renamed from: a, reason: collision with root package name */
        public final Result f409566a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class Result {

            /* renamed from: b, reason: collision with root package name */
            public static final Result f409567b;

            /* renamed from: c, reason: collision with root package name */
            public static final Result f409568c;

            /* renamed from: d, reason: collision with root package name */
            public static final Result f409569d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ Result[] f409570e;

            static {
                Result result = new Result("OVERRIDABLE", 0);
                f409567b = result;
                Result result2 = new Result("INCOMPATIBLE", 1);
                f409568c = result2;
                Result result3 = new Result("CONFLICT", 2);
                f409569d = result3;
                f409570e = new Result[]{result, result2, result3};
            }

            public Result() {
                throw null;
            }

            public static Result valueOf(String str) {
                return (Result) Enum.valueOf(Result.class, str);
            }

            public static Result[] values() {
                return (Result[]) f409570e.clone();
            }
        }

        public OverrideCompatibilityInfo(@Y61.k Result result, @Y61.k String str) {
            this.f409566a = result;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto Lf
                if (r10 == r2) goto Lf
                if (r10 == r1) goto Lf
                if (r10 == r0) goto Lf
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L11
            Lf:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L11:
                if (r10 == r3) goto L1b
                if (r10 == r2) goto L1b
                if (r10 == r1) goto L1b
                if (r10 == r0) goto L1b
                r5 = r2
                goto L1c
            L1b:
                r5 = r1
            L1c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L31
                if (r10 == r2) goto L31
                if (r10 == r1) goto L2e
                if (r10 == r0) goto L31
                r5[r8] = r7
                goto L35
            L2e:
                r5[r8] = r6
                goto L35
            L31:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L35:
                switch(r10) {
                    case 1: goto L45;
                    case 2: goto L45;
                    case 3: goto L45;
                    case 4: goto L45;
                    case 5: goto L40;
                    case 6: goto L3b;
                    default: goto L38;
                }
            L38:
                r5[r3] = r6
                goto L47
            L3b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L47
            L40:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L47
            L45:
                r5[r3] = r7
            L47:
                if (r10 == r3) goto L5a
                if (r10 == r2) goto L55
                if (r10 == r1) goto L50
                if (r10 == r0) goto L50
                goto L5e
            L50:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L5e
            L55:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L5e
            L5a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L5e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L70
                if (r10 == r2) goto L70
                if (r10 == r1) goto L70
                if (r10 == r0) goto L70
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L75
            L70:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L75:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.a(int):void");
        }

        @Y61.k
        public static OverrideCompatibilityInfo b(@Y61.k String str) {
            return new OverrideCompatibilityInfo(Result.f409569d, str);
        }

        @Y61.k
        public static OverrideCompatibilityInfo d(@Y61.k String str) {
            return new OverrideCompatibilityInfo(Result.f409568c, str);
        }

        @Y61.k
        public final Result c() {
            Result result = this.f409566a;
            if (result != null) {
                return result;
            }
            a(5);
            throw null;
        }
    }

    public static class a implements InterfaceC42970f.a {
        public static /* synthetic */ void b(int i12) {
            Object[] objArr = new Object[3];
            if (i12 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42970f.a
        public final boolean a(@Y61.k q0 q0Var, @Y61.k q0 q0Var2) {
            if (q0Var == null) {
                b(0);
                throw null;
            }
            if (q0Var2 != null) {
                return q0Var.equals(q0Var2);
            }
            b(1);
            throw null;
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f409571a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f409572b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f409573c;

        static {
            int[] iArr = new int[Modality.values().length];
            f409573c = iArr;
            try {
                Modality.a aVar = Modality.f407438b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int[] iArr2 = f409573c;
                Modality.a aVar2 = Modality.f407438b;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                int[] iArr3 = f409573c;
                Modality.a aVar3 = Modality.f407438b;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                int[] iArr4 = f409573c;
                Modality.a aVar4 = Modality.f407438b;
                iArr4[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr5 = new int[OverrideCompatibilityInfo.Result.values().length];
            f409572b = iArr5;
            try {
                iArr5[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f409572b[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f409572b[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr6 = new int[ExternalOverridabilityCondition.Result.values().length];
            f409571a = iArr6;
            try {
                iArr6[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f409571a[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f409571a[2] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f409571a[3] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        a aVar = new a();
        f409561f = aVar;
        f409560e = new OverridingUtil(aVar, i.a.f410099a, g.a.f410098a);
    }

    public OverridingUtil(@Y61.k InterfaceC42970f.a aVar, @Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar, @Y61.k g.a aVar2) {
        if (aVar == null) {
            a(5);
            throw null;
        }
        if (iVar == null) {
            a(6);
            throw null;
        }
        if (aVar2 == null) {
            a(7);
            throw null;
        }
        this.f409564c = aVar;
        this.f409562a = iVar;
        this.f409563b = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r25) {
        /*
            Method dump skipped, instructions count: 1320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.a(int):void");
    }

    public static boolean b(@Y61.k O o12, @Y61.k O o13, @Y61.k TypeCheckerState typeCheckerState) {
        if (o12 == null) {
            a(46);
            throw null;
        }
        if (o13 == null) {
            a(47);
            throw null;
        }
        if (Q.a(o12) && Q.a(o13)) {
            return true;
        }
        C42975f c42975f = C42975f.f410201a;
        J0 j0K0 = o12.K0();
        J0 j0K02 = o13.K0();
        c42975f.getClass();
        return C42975f.e(typeCheckerState, j0K0, j0K02);
    }

    public static void c(@Y61.k CallableMemberDescriptor callableMemberDescriptor, @Y61.k LinkedHashSet linkedHashSet) {
        if (callableMemberDescriptor == null) {
            a(17);
            throw null;
        }
        CallableMemberDescriptor.Kind kind = callableMemberDescriptor.getKind();
        kind.getClass();
        if (kind != CallableMemberDescriptor.Kind.f407409c) {
            linkedHashSet.add(callableMemberDescriptor);
            return;
        }
        if (callableMemberDescriptor.p().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
        Iterator<? extends CallableMemberDescriptor> it = callableMemberDescriptor.p().iterator();
        while (it.hasNext()) {
            c(it.next(), linkedHashSet);
        }
    }

    public static ArrayList d(InterfaceC42848a interfaceC42848a) {
        X xH2 = interfaceC42848a.H();
        ArrayList arrayList = new ArrayList();
        if (xH2 != null) {
            arrayList.add(xH2.getType());
        }
        Iterator<k0> it = interfaceC42848a.g().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x015e, code lost:
    
        if (r2 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0160, code lost:
    
        r1 = kotlin.reflect.jvm.internal.impl.descriptors.r.f407792h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0163, code lost:
    
        r1 = kotlin.reflect.jvm.internal.impl.descriptors.r.f407791g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0165, code lost:
    
        r12 = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) s(r11, new kotlin.reflect.jvm.internal.impl.resolve.q())).n0(r12, r0, (kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p) r1);
        r13.b(r12, r11);
        r13.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x017c, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(@Y61.k java.util.Collection r11, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d r12, @Y61.k kotlin.reflect.jvm.internal.impl.resolve.m r13) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.e(java.util.Collection, kotlin.reflect.jvm.internal.impl.descriptors.d, kotlin.reflect.jvm.internal.impl.resolve.m):void");
    }

    @Y61.k
    public static ArrayList g(@Y61.k Object obj, @Y61.k LinkedList linkedList, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2) {
        if (obj == null) {
            a(99);
            throw null;
        }
        if (lVar == null) {
            a(UpdateStatusCode.DialogButton.CONFIRM);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj);
        InterfaceC42848a interfaceC42848a = (InterfaceC42848a) lVar.invoke(obj);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC42848a interfaceC42848a2 = (InterfaceC42848a) lVar.invoke(next);
            if (obj == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result resultJ = j(interfaceC42848a, interfaceC42848a2);
                if (resultJ == OverrideCompatibilityInfo.Result.f409567b) {
                    arrayList.add(next);
                    it.remove();
                } else if (resultJ == OverrideCompatibilityInfo.Result.f409569d) {
                    lVar2.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    @Y61.l
    public static OverrideCompatibilityInfo i(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k InterfaceC42848a interfaceC42848a2) {
        boolean z12;
        if (interfaceC42848a == null) {
            a(40);
            throw null;
        }
        if (interfaceC42848a2 == null) {
            a(41);
            throw null;
        }
        boolean z13 = interfaceC42848a instanceof InterfaceC42905x;
        if ((z13 && !(interfaceC42848a2 instanceof InterfaceC42905x)) || (((z12 = interfaceC42848a instanceof U)) && !(interfaceC42848a2 instanceof U))) {
            return OverrideCompatibilityInfo.d("Member kind mismatch");
        }
        if (!z13 && !z12) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + interfaceC42848a);
        }
        if (!interfaceC42848a.getName().equals(interfaceC42848a2.getName())) {
            return OverrideCompatibilityInfo.d("Name mismatch");
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoD = (interfaceC42848a.H() == null) != (interfaceC42848a2.H() == null) ? OverrideCompatibilityInfo.d("Receiver presence mismatch") : interfaceC42848a.g().size() != interfaceC42848a2.g().size() ? OverrideCompatibilityInfo.d("Value parameter number mismatch") : null;
        if (overrideCompatibilityInfoD != null) {
            return overrideCompatibilityInfoD;
        }
        return null;
    }

    @Y61.l
    public static OverrideCompatibilityInfo.Result j(InterfaceC42848a interfaceC42848a, InterfaceC42848a interfaceC42848a2) {
        OverridingUtil overridingUtil = f409560e;
        OverrideCompatibilityInfo.Result resultC = overridingUtil.l(interfaceC42848a2, interfaceC42848a, null).c();
        OverrideCompatibilityInfo.Result resultC2 = overridingUtil.m(interfaceC42848a, interfaceC42848a2, null, false).c();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.f409567b;
        if (resultC == result && resultC2 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.f409569d;
        return (resultC == result2 || resultC2 == result2) ? result2 : OverrideCompatibilityInfo.Result.f409568c;
    }

    public static boolean k(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k InterfaceC42848a interfaceC42848a2) {
        if (interfaceC42848a == null) {
            a(67);
            throw null;
        }
        if (interfaceC42848a2 == null) {
            a(68);
            throw null;
        }
        O returnType = interfaceC42848a.getReturnType();
        O returnType2 = interfaceC42848a2.getReturnType();
        if (!p(interfaceC42848a, interfaceC42848a2)) {
            return false;
        }
        TypeCheckerState typeCheckerStateF = f409560e.f(interfaceC42848a.getTypeParameters(), interfaceC42848a2.getTypeParameters());
        if (interfaceC42848a instanceof InterfaceC42905x) {
            return o(interfaceC42848a, returnType, interfaceC42848a2, returnType2, typeCheckerStateF);
        }
        if (!(interfaceC42848a instanceof U)) {
            throw new IllegalArgumentException("Unexpected callable: " + interfaceC42848a.getClass());
        }
        U u12 = (U) interfaceC42848a;
        U u13 = (U) interfaceC42848a2;
        W wC2 = u12.c();
        W wC3 = u13.c();
        if (!((wC2 == null || wC3 == null) ? true : p(wC2, wC3))) {
            return false;
        }
        if (!u12.c0() || !u13.c0()) {
            return (u12.c0() || !u13.c0()) && o(interfaceC42848a, returnType, interfaceC42848a2, returnType2, typeCheckerStateF);
        }
        C42975f c42975f = C42975f.f410201a;
        J0 j0K0 = returnType.K0();
        J0 j0K02 = returnType2.K0();
        c42975f.getClass();
        return C42975f.e(typeCheckerStateF, j0K0, j0K02);
    }

    public static boolean o(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k O o12, @Y61.k InterfaceC42848a interfaceC42848a2, @Y61.k O o13, @Y61.k TypeCheckerState typeCheckerState) {
        if (interfaceC42848a == null) {
            a(73);
            throw null;
        }
        if (o12 == null) {
            a(74);
            throw null;
        }
        if (interfaceC42848a2 == null) {
            a(75);
            throw null;
        }
        if (o13 == null) {
            a(76);
            throw null;
        }
        C42975f c42975f = C42975f.f410201a;
        J0 j0K0 = o12.K0();
        J0 j0K02 = o13.K0();
        c42975f.getClass();
        return C42975f.i(c42975f, typeCheckerState, j0K0, j0K02);
    }

    public static boolean p(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k InterfaceC42848a interfaceC42848a2) {
        if (interfaceC42848a == null) {
            a(69);
            throw null;
        }
        if (interfaceC42848a2 != null) {
            Integer numB = kotlin.reflect.jvm.internal.impl.descriptors.r.b(interfaceC42848a.getVisibility(), interfaceC42848a2.getVisibility());
            return numB == null || numB.intValue() >= 0;
        }
        a(70);
        throw null;
    }

    public static boolean q(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k InterfaceC42848a interfaceC42848a2) {
        if (interfaceC42848a == null) {
            a(13);
            throw null;
        }
        if (interfaceC42848a2 == null) {
            a(14);
            throw null;
        }
        if (!interfaceC42848a.equals(interfaceC42848a2) && h.f409624a.a(interfaceC42848a.n0(), interfaceC42848a2.n0(), false)) {
            return true;
        }
        InterfaceC42848a interfaceC42848aN0 = interfaceC42848a2.n0();
        int i12 = j.f409625a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        j.b(interfaceC42848a.n0(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (h.f409624a.a(interfaceC42848aN0, (InterfaceC42848a) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public static void r(@Y61.k CallableMemberDescriptor callableMemberDescriptor, @Y61.l Y41.l<CallableMemberDescriptor, G0> lVar) {
        AbstractC42900s abstractC42900s;
        AbstractC42900s abstractC42900sD;
        AbstractC42900s abstractC42900s2;
        if (callableMemberDescriptor == null) {
            a(107);
            throw null;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.p()) {
            if (callableMemberDescriptor2.getVisibility() == kotlin.reflect.jvm.internal.impl.descriptors.r.f407791g) {
                r(callableMemberDescriptor2, lVar);
            }
        }
        if (callableMemberDescriptor.getVisibility() != kotlin.reflect.jvm.internal.impl.descriptors.r.f407791g) {
            return;
        }
        Collection<? extends CallableMemberDescriptor> collectionP = callableMemberDescriptor.p();
        if (collectionP == null) {
            a(109);
            throw null;
        }
        if (collectionP.isEmpty()) {
            abstractC42900sD = kotlin.reflect.jvm.internal.impl.descriptors.r.f407796l;
        } else {
            Iterator<? extends CallableMemberDescriptor> it = collectionP.iterator();
            loop3: while (true) {
                abstractC42900s = null;
                while (it.hasNext()) {
                    AbstractC42900s visibility = it.next().getVisibility();
                    if (abstractC42900s != null) {
                        Integer numB = kotlin.reflect.jvm.internal.impl.descriptors.r.b(visibility, abstractC42900s);
                        if (numB == null) {
                            break;
                        } else if (numB.intValue() > 0) {
                        }
                    }
                    abstractC42900s = visibility;
                }
            }
            if (abstractC42900s == null) {
                abstractC42900sD = null;
                break;
            }
            Iterator<? extends CallableMemberDescriptor> it2 = collectionP.iterator();
            while (it2.hasNext()) {
                Integer numB2 = kotlin.reflect.jvm.internal.impl.descriptors.r.b(abstractC42900s, it2.next().getVisibility());
                if (numB2 == null || numB2.intValue() < 0) {
                    abstractC42900sD = null;
                    break;
                }
            }
            abstractC42900sD = abstractC42900s;
        }
        if (abstractC42900sD == null) {
            abstractC42900sD = null;
            break;
        }
        if (callableMemberDescriptor.getKind() == CallableMemberDescriptor.Kind.f407409c) {
            for (CallableMemberDescriptor callableMemberDescriptor3 : collectionP) {
                if (callableMemberDescriptor3.i() != Modality.f407442f && !callableMemberDescriptor3.getVisibility().equals(abstractC42900sD)) {
                    abstractC42900sD = null;
                    break;
                }
            }
        } else {
            abstractC42900sD = abstractC42900sD.d();
        }
        if (abstractC42900sD == null) {
            if (lVar != null) {
                lVar.invoke(callableMemberDescriptor);
            }
            abstractC42900s2 = kotlin.reflect.jvm.internal.impl.descriptors.r.f407789e;
        } else {
            abstractC42900s2 = abstractC42900sD;
        }
        if (callableMemberDescriptor instanceof L) {
            L l12 = (L) callableMemberDescriptor;
            if (abstractC42900s2 == null) {
                L.L(20);
                throw null;
            }
            l12.f407584k = abstractC42900s2;
            Iterator it3 = ((U) callableMemberDescriptor).X().iterator();
            while (it3.hasNext()) {
                r((T) it3.next(), abstractC42900sD == null ? null : lVar);
            }
            return;
        }
        if (callableMemberDescriptor instanceof AbstractC42878w) {
            AbstractC42878w abstractC42878w = (AbstractC42878w) callableMemberDescriptor;
            if (abstractC42900s2 != null) {
                abstractC42878w.f407714m = abstractC42900s2;
                return;
            } else {
                AbstractC42878w.L(10);
                throw null;
            }
        }
        K k12 = (K) callableMemberDescriptor;
        k12.f407580l = abstractC42900s2;
        if (abstractC42900s2 != k12.s0().getVisibility()) {
            k12.f407574f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public static <H> H s(@Y61.k Collection<H> collection, @Y61.k Y41.l<H, InterfaceC42848a> lVar) {
        H h12;
        if (lVar == 0) {
            a(79);
            throw null;
        }
        if (collection.size() == 1) {
            H h13 = (H) C42745f0.D(collection);
            if (h13 != null) {
                return h13;
            }
            a(80);
            throw null;
        }
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(C42745f0.q(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(lVar.invoke(it.next()));
        }
        H h14 = (H) C42745f0.D(collection);
        InterfaceC42848a interfaceC42848a = (InterfaceC42848a) lVar.invoke(h14);
        for (H h15 : collection) {
            InterfaceC42848a interfaceC42848a2 = (InterfaceC42848a) lVar.invoke(h15);
            if (interfaceC42848a2 == null) {
                a(71);
                throw null;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(h15);
                    break;
                }
                if (!k(interfaceC42848a2, (InterfaceC42848a) it2.next())) {
                    break;
                }
            }
            if (k(interfaceC42848a2, interfaceC42848a) && !k(interfaceC42848a, interfaceC42848a2)) {
                h14 = h15;
            }
        }
        if (arrayList.isEmpty()) {
            if (h14 != null) {
                return h14;
            }
            a(81);
            throw null;
        }
        if (arrayList.size() == 1) {
            H h16 = (H) C42745f0.D(arrayList);
            if (h16 != null) {
                return h16;
            }
            a(82);
            throw null;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                h12 = null;
                break;
            }
            h12 = (H) it3.next();
            if (!(((InterfaceC42848a) lVar.invoke(h12)).getReturnType().K0() instanceof H)) {
                break;
            }
        }
        if (h12 != null) {
            return h12;
        }
        H h17 = (H) C42745f0.D(arrayList);
        if (h17 != null) {
            return h17;
        }
        a(84);
        throw null;
    }

    @Y61.k
    public final TypeCheckerState f(@Y61.k List<g0> list, @Y61.k List<g0> list2) {
        if (list == null) {
            a(42);
            throw null;
        }
        if (list2 == null) {
            a(43);
            throw null;
        }
        boolean zIsEmpty = list.isEmpty();
        InterfaceC42970f.a aVar = this.f409564c;
        if (zIsEmpty) {
            kotlin.reflect.jvm.internal.impl.types.checker.i iVar = this.f409562a;
            g.a aVar2 = this.f409563b;
            return new TypeCheckerState(true, true, new v(null, aVar, iVar, aVar2), aVar2, iVar);
        }
        HashMap map = new HashMap();
        for (int i12 = 0; i12 < list.size(); i12++) {
            map.put(list.get(i12).l(), list2.get(i12).l());
        }
        kotlin.reflect.jvm.internal.impl.types.checker.i iVar2 = this.f409562a;
        g.a aVar3 = this.f409563b;
        return new TypeCheckerState(true, true, new v(map, aVar, iVar2, aVar3), aVar3, iVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k Collection collection, @Y61.k Collection collection2, @Y61.k InterfaceC42851d interfaceC42851d, @Y61.k m mVar) {
        Integer numB;
        if (fVar == null) {
            a(52);
            throw null;
        }
        if (collection == null) {
            a(53);
            throw null;
        }
        if (collection2 == null) {
            a(54);
            throw null;
        }
        if (interfaceC42851d == null) {
            a(55);
            throw null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            CallableMemberDescriptor callableMemberDescriptor = (CallableMemberDescriptor) it.next();
            if (callableMemberDescriptor == null) {
                a(59);
                throw null;
            }
            ArrayList arrayList = new ArrayList(collection.size());
            kotlin.reflect.jvm.internal.impl.utils.g.f410367d.getClass();
            kotlin.reflect.jvm.internal.impl.utils.g gVarA = g.b.a();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                CallableMemberDescriptor callableMemberDescriptor2 = (CallableMemberDescriptor) it2.next();
                OverrideCompatibilityInfo.Result resultC = l(callableMemberDescriptor2, callableMemberDescriptor, interfaceC42851d).c();
                boolean z12 = !kotlin.reflect.jvm.internal.impl.descriptors.r.e(callableMemberDescriptor2.getVisibility()) && kotlin.reflect.jvm.internal.impl.descriptors.r.c(kotlin.reflect.jvm.internal.impl.descriptors.r.f407798n, callableMemberDescriptor2, callableMemberDescriptor) == null;
                int iOrdinal = resultC.ordinal();
                if (iOrdinal == 0) {
                    if (z12) {
                        gVarA.add(callableMemberDescriptor2);
                    }
                    arrayList.add(callableMemberDescriptor2);
                } else if (iOrdinal == 2) {
                    if (z12) {
                        mVar.c(callableMemberDescriptor2, callableMemberDescriptor);
                    }
                    arrayList.add(callableMemberDescriptor2);
                }
            }
            mVar.b(callableMemberDescriptor, gVarA);
            linkedHashSet.removeAll(arrayList);
        }
        if (linkedHashSet.size() >= 2) {
            p pVar = new p(((CallableMemberDescriptor) linkedHashSet.iterator().next()).f());
            if (!linkedHashSet.isEmpty()) {
                Iterator it3 = linkedHashSet.iterator();
                while (it3.hasNext()) {
                    if (!((Boolean) pVar.invoke(it3.next())).booleanValue()) {
                        LinkedList<CallableMemberDescriptor> linkedList = new LinkedList(linkedHashSet);
                        while (!linkedList.isEmpty()) {
                            linkedList.isEmpty();
                            CallableMemberDescriptor callableMemberDescriptor3 = null;
                            for (CallableMemberDescriptor callableMemberDescriptor4 : linkedList) {
                                if (callableMemberDescriptor3 == null || ((numB = kotlin.reflect.jvm.internal.impl.descriptors.r.b(callableMemberDescriptor3.getVisibility(), callableMemberDescriptor4.getVisibility())) != null && numB.intValue() < 0)) {
                                    callableMemberDescriptor3 = callableMemberDescriptor4;
                                }
                            }
                            e(g(callableMemberDescriptor3, linkedList, new s(), new t(mVar, callableMemberDescriptor3)), interfaceC42851d, mVar);
                        }
                        return;
                    }
                }
            }
        }
        Iterator it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            e(Collections.singleton((CallableMemberDescriptor) it4.next()), interfaceC42851d, mVar);
        }
    }

    @Y61.k
    public final OverrideCompatibilityInfo l(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k InterfaceC42848a interfaceC42848a2, @Y61.l InterfaceC42851d interfaceC42851d) {
        if (interfaceC42848a == null) {
            a(19);
            throw null;
        }
        if (interfaceC42848a2 != null) {
            return m(interfaceC42848a, interfaceC42848a2, interfaceC42851d, false);
        }
        a(20);
        throw null;
    }

    @Y61.k
    public final OverrideCompatibilityInfo m(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.k InterfaceC42848a interfaceC42848a2, @Y61.l InterfaceC42851d interfaceC42851d, boolean z12) {
        if (interfaceC42848a == null) {
            a(22);
            throw null;
        }
        if (interfaceC42848a2 == null) {
            a(23);
            throw null;
        }
        OverrideCompatibilityInfo overrideCompatibilityInfoN = n(interfaceC42848a, interfaceC42848a2, z12);
        boolean z13 = overrideCompatibilityInfoN.c() == OverrideCompatibilityInfo.Result.f409567b;
        List<ExternalOverridabilityCondition> list = f409559d;
        Iterator<ExternalOverridabilityCondition> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ExternalOverridabilityCondition.Contract contract = ExternalOverridabilityCondition.Contract.f409551b;
            if (!zHasNext) {
                if (!z13) {
                    return overrideCompatibilityInfoN;
                }
                for (ExternalOverridabilityCondition externalOverridabilityCondition : list) {
                    if (externalOverridabilityCondition.a() == contract) {
                        int iOrdinal = externalOverridabilityCondition.b(interfaceC42848a, interfaceC42848a2, interfaceC42851d).ordinal();
                        if (iOrdinal == 0) {
                            throw new IllegalStateException("Contract violation in " + externalOverridabilityCondition.getClass().getName() + " condition. It's not supposed to end with success");
                        }
                        if (iOrdinal == 1) {
                            return OverrideCompatibilityInfo.b("External condition failed");
                        }
                        if (iOrdinal == 2) {
                            return OverrideCompatibilityInfo.d("External condition");
                        }
                    }
                }
                OverrideCompatibilityInfo overrideCompatibilityInfo = OverrideCompatibilityInfo.f409565b;
                if (overrideCompatibilityInfo != null) {
                    return overrideCompatibilityInfo;
                }
                OverrideCompatibilityInfo.a(0);
                throw null;
            }
            ExternalOverridabilityCondition next = it.next();
            if (next.a() != contract && (!z13 || next.a() != ExternalOverridabilityCondition.Contract.f409552c)) {
                int iOrdinal2 = next.b(interfaceC42848a, interfaceC42848a2, interfaceC42851d).ordinal();
                if (iOrdinal2 == 0) {
                    z13 = true;
                } else {
                    if (iOrdinal2 == 1) {
                        return OverrideCompatibilityInfo.b("External condition failed");
                    }
                    if (iOrdinal2 == 2) {
                        return OverrideCompatibilityInfo.d("External condition");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        r14.remove();
     */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo n(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a r17, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.n(kotlin.reflect.jvm.internal.impl.descriptors.a, kotlin.reflect.jvm.internal.impl.descriptors.a, boolean):kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo");
    }
}
