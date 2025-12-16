package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.C42906y;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.AbstractC42973e;
import kotlin.reflect.jvm.internal.impl.types.C42962b0;
import kotlin.reflect.jvm.internal.impl.types.C42964c0;
import kotlin.reflect.jvm.internal.impl.types.C42980h0;
import kotlin.reflect.jvm.internal.impl.types.C42997w;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.F0;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.H;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.M;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Q;
import kotlin.reflect.jvm.internal.impl.types.X;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.s0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import u51.InterfaceC48800b;
import u51.InterfaceC48801c;
import u51.InterfaceC48802d;
import u51.InterfaceC48804f;
import u51.InterfaceC48806h;

/* compiled from: ClassicTypeSystemContext.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC42966b extends F0, u51.r {

    /* compiled from: ClassicTypeSystemContext.kt */
    @s0
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.b$a */
    public static final class a {
        public static boolean A(@Y61.k u51.m mVar) {
            if (mVar instanceof q0) {
                return ((q0) mVar).c();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
        }

        public static boolean B(@Y61.k InterfaceC48806h interfaceC48806h) {
            if (interfaceC48806h instanceof O) {
                return Q.a((O) interfaceC48806h);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48806h);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48806h.getClass(), sb2).toString());
        }

        public static boolean C(@Y61.k u51.m mVar) {
            if (mVar instanceof q0) {
                InterfaceC42853f interfaceC42853fB = ((q0) mVar).b();
                InterfaceC42851d interfaceC42851d = interfaceC42853fB instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42853fB : null;
                return (interfaceC42851d != null ? interfaceC42851d.I() : null) instanceof C42906y;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
        }

        public static boolean D(@Y61.k u51.m mVar) {
            if (mVar instanceof q0) {
                return mVar instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.o;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
        }

        public static boolean E(@Y61.k u51.m mVar) {
            if (mVar instanceof q0) {
                return mVar instanceof M;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
        }

        public static boolean F(@Y61.k u51.i iVar) {
            if (iVar instanceof Y) {
                return ((Y) iVar).I0();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(iVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, iVar.getClass(), sb2).toString());
        }

        public static boolean G(@Y61.k u51.m mVar) {
            if (mVar instanceof q0) {
                return kotlin.reflect.jvm.internal.impl.builtins.k.G((q0) mVar, n.a.f407375c);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
        }

        public static boolean H(@Y61.k InterfaceC48806h interfaceC48806h) {
            if (interfaceC48806h instanceof O) {
                return G0.f((O) interfaceC48806h);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48806h);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48806h.getClass(), sb2).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean I(@Y61.k u51.i iVar) {
            if (iVar instanceof O) {
                return kotlin.reflect.jvm.internal.impl.builtins.k.F((O) iVar);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(iVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, iVar.getClass(), sb2).toString());
        }

        public static boolean J(@Y61.k InterfaceC48801c interfaceC48801c) {
            if (interfaceC48801c instanceof k) {
                return ((k) interfaceC48801c).f410106h;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48801c);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48801c.getClass(), sb2).toString());
        }

        public static boolean K(@Y61.k InterfaceC48806h interfaceC48806h) {
            if (interfaceC48806h instanceof O) {
                return interfaceC48806h instanceof X;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48806h);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48806h.getClass(), sb2).toString());
        }

        public static boolean L(@Y61.k u51.l lVar) {
            if (lVar instanceof x0) {
                return ((x0) lVar).c();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(lVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, lVar.getClass(), sb2).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean M(@Y61.k u51.i iVar) {
            if (iVar instanceof Y) {
                O o12 = (O) iVar;
                return (o12 instanceof AbstractC42973e) || ((o12 instanceof C42997w) && (((C42997w) o12).f410265c instanceof AbstractC42973e));
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(iVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, iVar.getClass(), sb2).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean N(@Y61.k u51.i iVar) {
            if (iVar instanceof Y) {
                O o12 = (O) iVar;
                return (o12 instanceof C42980h0) || ((o12 instanceof C42997w) && (((C42997w) o12).f410265c instanceof C42980h0));
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(iVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, iVar.getClass(), sb2).toString());
        }

        @Y61.k
        public static Y O(@Y61.k InterfaceC48804f interfaceC48804f) {
            if (interfaceC48804f instanceof H) {
                return ((H) interfaceC48804f).f410024c;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48804f);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48804f.getClass(), sb2).toString());
        }

        @Y61.l
        public static J0 P(@Y61.k InterfaceC48801c interfaceC48801c) {
            if (interfaceC48801c instanceof k) {
                return ((k) interfaceC48801c).f410103e;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48801c);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48801c.getClass(), sb2).toString());
        }

        @Y61.k
        public static J0 Q(@Y61.k InterfaceC48806h interfaceC48806h) {
            if (interfaceC48806h instanceof J0) {
                return C42964c0.a((J0) interfaceC48806h, false);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48806h);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48806h.getClass(), sb2).toString());
        }

        @Y61.k
        public static Y R(@Y61.k InterfaceC48802d interfaceC48802d) {
            if (interfaceC48802d instanceof C42997w) {
                return ((C42997w) interfaceC48802d).f410265c;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48802d);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48802d.getClass(), sb2).toString());
        }

        public static int S(@Y61.k u51.m mVar) {
            if (mVar instanceof q0) {
                return ((q0) mVar).getParameters().size();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
        }

        @Y61.k
        public static Collection<InterfaceC48806h> T(@Y61.k InterfaceC42966b interfaceC42966b, @Y61.k u51.i iVar) {
            q0 q0VarW = interfaceC42966b.w(iVar);
            if (q0VarW instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.o) {
                return ((kotlin.reflect.jvm.internal.impl.resolve.constants.o) q0VarW).f409596c;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(iVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, iVar.getClass(), sb2).toString());
        }

        @Y61.k
        public static x0 U(@Y61.k InterfaceC48800b interfaceC48800b) {
            if (interfaceC48800b instanceof m) {
                return ((m) interfaceC48800b).f410108a;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48800b);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48800b.getClass(), sb2).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Y61.k
        public static C42967c V(@Y61.k InterfaceC42966b interfaceC42966b, @Y61.k u51.i iVar) {
            if (iVar instanceof Y) {
                s0.a aVar = kotlin.reflect.jvm.internal.impl.types.s0.f410245b;
                O o12 = (O) iVar;
                aVar.getClass();
                return new C42967c(interfaceC42966b, E0.e(aVar.a(o12.H0(), o12.F0())));
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(iVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, iVar.getClass(), sb2).toString());
        }

        @Y61.k
        public static Collection W(@Y61.k u51.m mVar) {
            if (mVar instanceof q0) {
                return ((q0) mVar).C();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
        }

        @Y61.k
        public static q0 X(@Y61.k u51.i iVar) {
            if (iVar instanceof Y) {
                return ((Y) iVar).H0();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(iVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, iVar.getClass(), sb2).toString());
        }

        @Y61.k
        public static m Y(@Y61.k InterfaceC48801c interfaceC48801c) {
            if (interfaceC48801c instanceof k) {
                return ((k) interfaceC48801c).f410102d;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48801c);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48801c.getClass(), sb2).toString());
        }

        @Y61.k
        public static Y Z(@Y61.k InterfaceC48804f interfaceC48804f) {
            if (interfaceC48804f instanceof H) {
                return ((H) interfaceC48804f).f410025d;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48804f);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48804f.getClass(), sb2).toString());
        }

        public static boolean a(@Y61.k u51.m mVar, @Y61.k u51.m mVar2) {
            if (!(mVar instanceof q0)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(mVar);
                sb2.append(", ");
                throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
            }
            if (mVar2 instanceof q0) {
                return mVar.equals(mVar2);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(mVar2);
            sb3.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar2.getClass(), sb3).toString());
        }

        @Y61.k
        public static Y a0(@Y61.k u51.i iVar, boolean z12) {
            if (iVar instanceof Y) {
                return ((Y) iVar).L0(z12);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(iVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, iVar.getClass(), sb2).toString());
        }

        public static int b(@Y61.k InterfaceC48806h interfaceC48806h) {
            if (interfaceC48806h instanceof O) {
                return ((O) interfaceC48806h).F0().size();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48806h);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48806h.getClass(), sb2).toString());
        }

        @Y61.k
        public static InterfaceC48806h b0(@Y61.k InterfaceC42966b interfaceC42966b, @Y61.k InterfaceC48806h interfaceC48806h) {
            if (interfaceC48806h instanceof u51.i) {
                return interfaceC42966b.z((u51.i) interfaceC48806h, true);
            }
            if (!(interfaceC48806h instanceof InterfaceC48804f)) {
                throw new IllegalStateException("sealed");
            }
            InterfaceC48804f interfaceC48804f = (InterfaceC48804f) interfaceC48806h;
            return interfaceC42966b.f(interfaceC42966b.z(interfaceC42966b.c(interfaceC48804f), true), interfaceC42966b.z(interfaceC42966b.r(interfaceC48804f), true));
        }

        @Y61.k
        public static u51.k c(@Y61.k u51.i iVar) {
            if (iVar instanceof Y) {
                return (u51.k) iVar;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(iVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, iVar.getClass(), sb2).toString());
        }

        @Y61.l
        public static InterfaceC48801c d(@Y61.k InterfaceC42966b interfaceC42966b, @Y61.k u51.i iVar) {
            if (iVar instanceof Y) {
                if (iVar instanceof C42962b0) {
                    return interfaceC42966b.N(((C42962b0) iVar).f410084c);
                }
                if (iVar instanceof k) {
                    return (k) iVar;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(iVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, iVar.getClass(), sb2).toString());
        }

        @Y61.l
        public static C42997w e(@Y61.k u51.i iVar) {
            if (iVar instanceof Y) {
                if (iVar instanceof C42997w) {
                    return (C42997w) iVar;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(iVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, iVar.getClass(), sb2).toString());
        }

        @Y61.l
        public static kotlin.reflect.jvm.internal.impl.types.C f(@Y61.k H h12) {
            if (h12 instanceof kotlin.reflect.jvm.internal.impl.types.C) {
                return (kotlin.reflect.jvm.internal.impl.types.C) h12;
            }
            return null;
        }

        @Y61.l
        public static H g(@Y61.k InterfaceC48806h interfaceC48806h) {
            if (interfaceC48806h instanceof O) {
                J0 j0K0 = ((O) interfaceC48806h).K0();
                if (j0K0 instanceof H) {
                    return (H) j0K0;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48806h);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48806h.getClass(), sb2).toString());
        }

        @Y61.l
        public static Y h(@Y61.k InterfaceC48806h interfaceC48806h) {
            if (interfaceC48806h instanceof O) {
                J0 j0K0 = ((O) interfaceC48806h).K0();
                if (j0K0 instanceof Y) {
                    return (Y) j0K0;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48806h);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48806h.getClass(), sb2).toString());
        }

        @Y61.k
        public static z0 i(@Y61.k InterfaceC48806h interfaceC48806h) {
            if (interfaceC48806h instanceof O) {
                return new z0((O) interfaceC48806h);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48806h);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48806h.getClass(), sb2).toString());
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static kotlin.reflect.jvm.internal.impl.types.Y j(@Y61.k u51.i r17) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42966b.a.j(u51.i):kotlin.reflect.jvm.internal.impl.types.Y");
        }

        @Y61.k
        public static CaptureStatus k(@Y61.k InterfaceC48801c interfaceC48801c) {
            if (interfaceC48801c instanceof k) {
                return ((k) interfaceC48801c).f410101c;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48801c);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48801c.getClass(), sb2).toString());
        }

        @Y61.k
        public static J0 l(@Y61.k InterfaceC42966b interfaceC42966b, @Y61.k u51.i iVar, @Y61.k u51.i iVar2) {
            if (!(iVar instanceof Y)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(interfaceC42966b);
                sb2.append(", ");
                throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC42966b.getClass(), sb2).toString());
            }
            if (iVar2 instanceof Y) {
                return P.c((Y) iVar, (Y) iVar2);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(interfaceC42966b);
            sb3.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC42966b.getClass(), sb3).toString());
        }

        @Y61.k
        public static u51.l m(@Y61.k InterfaceC48806h interfaceC48806h, int i12) {
            if (interfaceC48806h instanceof O) {
                return ((O) interfaceC48806h).F0().get(i12);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48806h);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48806h.getClass(), sb2).toString());
        }

        @Y61.k
        public static List n(@Y61.k InterfaceC48806h interfaceC48806h) {
            if (interfaceC48806h instanceof O) {
                return ((O) interfaceC48806h).F0();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(interfaceC48806h);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, interfaceC48806h.getClass(), sb2).toString());
        }

        @Y61.k
        public static u51.n o(@Y61.k u51.m mVar, int i12) {
            if (mVar instanceof q0) {
                return ((q0) mVar).getParameters().get(i12);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
        }

        @Y61.k
        public static List p(@Y61.k u51.m mVar) {
            if (mVar instanceof q0) {
                return ((q0) mVar).getParameters();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
        }

        @Y61.k
        public static J0 q(@Y61.k u51.l lVar) {
            if (lVar instanceof x0) {
                return ((x0) lVar).getType().K0();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(lVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, lVar.getClass(), sb2).toString());
        }

        @Y61.l
        public static g0 r(@Y61.k u51.t tVar) {
            if (tVar instanceof r) {
                return ((r) tVar).a();
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(tVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, tVar.getClass(), sb2).toString());
        }

        @Y61.l
        public static g0 s(@Y61.k u51.m mVar) {
            if (mVar instanceof q0) {
                InterfaceC42853f interfaceC42853fB = ((q0) mVar).b();
                if (interfaceC42853fB instanceof g0) {
                    return (g0) interfaceC42853fB;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
        }

        @Y61.k
        public static TypeVariance t(@Y61.k u51.l lVar) {
            if (!(lVar instanceof x0)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(lVar);
                sb2.append(", ");
                throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, lVar.getClass(), sb2).toString());
            }
            int iOrdinal = ((x0) lVar).a().ordinal();
            if (iOrdinal == 0) {
                return TypeVariance.f410231e;
            }
            if (iOrdinal == 1) {
                return TypeVariance.f410229c;
            }
            if (iOrdinal == 2) {
                return TypeVariance.f410230d;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Y61.k
        public static TypeVariance u(@Y61.k u51.n nVar) {
            if (!(nVar instanceof g0)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(nVar);
                sb2.append(", ");
                throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, nVar.getClass(), sb2).toString());
            }
            int iOrdinal = ((g0) nVar).o().ordinal();
            if (iOrdinal == 0) {
                return TypeVariance.f410231e;
            }
            if (iOrdinal == 1) {
                return TypeVariance.f410229c;
            }
            if (iOrdinal == 2) {
                return TypeVariance.f410230d;
            }
            throw new NoWhenBranchMatchedException();
        }

        public static boolean v(@Y61.k u51.n nVar, @Y61.l u51.m mVar) {
            if (!(nVar instanceof g0)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(nVar);
                sb2.append(", ");
                throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, nVar.getClass(), sb2).toString());
            }
            if (mVar == null ? true : mVar instanceof q0) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.a.h((g0) nVar, (q0) mVar, 4);
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(nVar);
            sb3.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, nVar.getClass(), sb3).toString());
        }

        public static boolean w(@Y61.k u51.i iVar, @Y61.k u51.i iVar2) {
            if (!(iVar instanceof Y)) {
                StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb2.append(iVar);
                sb2.append(", ");
                throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, iVar.getClass(), sb2).toString());
            }
            if (iVar2 instanceof Y) {
                return ((Y) iVar).F0() == ((Y) iVar2).F0();
            }
            StringBuilder sb3 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb3.append(iVar2);
            sb3.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, iVar2.getClass(), sb3).toString());
        }

        public static boolean x(@Y61.k u51.m mVar) {
            if (mVar instanceof q0) {
                return kotlin.reflect.jvm.internal.impl.builtins.k.G((q0) mVar, n.a.f407373b);
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
        }

        public static boolean y(@Y61.k u51.m mVar) {
            if (mVar instanceof q0) {
                return ((q0) mVar).b() instanceof InterfaceC42851d;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
        }

        public static boolean z(@Y61.k u51.m mVar) {
            if (mVar instanceof q0) {
                InterfaceC42853f interfaceC42853fB = ((q0) mVar).b();
                InterfaceC42851d interfaceC42851d = interfaceC42853fB instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42853fB : null;
                return (interfaceC42851d == null || interfaceC42851d.i() != Modality.f407439c || interfaceC42851d.getKind() == ClassKind.f407415d || interfaceC42851d.getKind() == ClassKind.f407416e || interfaceC42851d.getKind() == ClassKind.f407417f) ? false : true;
            }
            StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(mVar);
            sb2.append(", ");
            throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, mVar.getClass(), sb2).toString());
        }
    }

    @Y61.k
    J0 f(@Y61.k u51.i iVar, @Y61.k u51.i iVar2);
}
