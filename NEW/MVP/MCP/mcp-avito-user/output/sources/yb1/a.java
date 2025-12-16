package Yb1;

import androidx.camera.camera2.internal.G;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.Objects;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.EncodeDefault;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.C43400e0;
import kotlinx.serialization.internal.E0;
import kotlinx.serialization.internal.G0;
import kotlinx.serialization.internal.N;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.V0;
import kotlinx.serialization.json.AbstractC43443a;
import kotlinx.serialization.r;
import kotlinx.serialization.v;
import kotlinx.serialization.w;
import okhttp3.internal.http2.Http2;
import s2.AbstractC47961a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0010\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0082\u0001\u000f\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"LYb1/a;", "", "Companion", "a", "b", "c", "d", "e", "f", "g", "i", "j", "k", "l", "m", "n", "o", "p", "q", "LYb1/a$a;", "LYb1/a$b;", "LYb1/a$c;", "LYb1/a$d;", "LYb1/a$e;", "LYb1/a$f;", "LYb1/a$i;", "LYb1/a$j;", "LYb1/a$k;", "LYb1/a$l;", "LYb1/a$m;", "LYb1/a$n;", "LYb1/a$o;", "LYb1/a$p;", "LYb1/a$q;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@w
/* loaded from: classes9.dex */
public interface a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @Y61.k
    public static final Companion INSTANCE = Companion.f19562a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$g;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Yb1.a$g, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f19562a = new Companion();

        @Y61.k
        public final KSerializer<a> serializer() {
            n0 n0Var = m0.f406844a;
            return new r("sberid.sdk.global.analytics.models.AnalyticModels", n0Var.b(a.class), new kotlin.reflect.d[]{n0Var.b(C1382a.class), n0Var.b(b.class), n0Var.b(c.class), n0Var.b(d.class), n0Var.b(e.class), n0Var.b(f.class), n0Var.b(i.class), n0Var.b(j.class), n0Var.b(k.class), n0Var.b(l.class), n0Var.b(m.class), n0Var.b(n.class), n0Var.b(o.class), n0Var.b(p.class), n0Var.b(q.class)}, new KSerializer[]{C1382a.C1383a.f19545a, b.C1384a.f19548a, c.C1386a.f19551a, d.C1387a.f19554a, e.C1388a.f19557a, f.C1389a.f19560a, i.C1390a.f19564a, j.C1391a.f19567a, k.C1392a.f19570a, l.C1393a.f19573a, m.C1394a.f19576a, n.C1395a.f19579a, o.C1396a.f19582a, p.C1397a.f19585a, q.C1398a.f19588a}, new Annotation[0]);
        }
    }

    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h {
        @Y61.k
        public static String a(@Y61.k a aVar) {
            Object bVar;
            String str;
            Object bVar2;
            String str2;
            Object bVar3;
            Object bVar4;
            Object bVar5;
            Object bVar6;
            Object bVar7;
            Object bVar8;
            Object bVar9;
            Object bVar10;
            Object bVar11;
            Object bVar12;
            Object bVar13;
            Object bVar14;
            Object bVar15;
            Object bVar16;
            Object bVar17;
            Object bVar18;
            Object bVar19;
            Object bVar20;
            Object bVar21;
            Object bVar22;
            Object bVar23;
            Object bVar24;
            Object bVar25;
            Object bVar26;
            Object bVar27;
            Object bVar28;
            Object bVar29;
            Object bVar30;
            if (aVar instanceof f) {
                try {
                    int i12 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a = AbstractC43443a.f412954d;
                    c11757a.getClass();
                    bVar = c11757a.c(f.INSTANCE.serializer(), aVar);
                } catch (Throwable th2) {
                    int i13 = Z.f406624c;
                    bVar = new Z.b(th2);
                }
                boolean z12 = bVar instanceof Z.b;
                if (z12) {
                    bVar = null;
                }
                str = (String) bVar;
                if (z12 || str == null) {
                    f.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar2 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th3) {
                        int i14 = Z.f406624c;
                        bVar2 = new Z.b(th3);
                    }
                    boolean z13 = bVar2 instanceof Z.b;
                    str2 = (String) (z13 ? null : bVar2);
                    if (z13 || str2 == null) {
                        f.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (aVar instanceof e) {
                try {
                    int i15 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a2 = AbstractC43443a.f412954d;
                    c11757a2.getClass();
                    bVar3 = c11757a2.c(e.INSTANCE.serializer(), aVar);
                } catch (Throwable th4) {
                    int i16 = Z.f406624c;
                    bVar3 = new Z.b(th4);
                }
                boolean z14 = bVar3 instanceof Z.b;
                if (z14) {
                    bVar3 = null;
                }
                str = (String) bVar3;
                if (z14 || str == null) {
                    e.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar4 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th5) {
                        int i17 = Z.f406624c;
                        bVar4 = new Z.b(th5);
                    }
                    boolean z15 = bVar4 instanceof Z.b;
                    str2 = (String) (z15 ? null : bVar4);
                    if (z15 || str2 == null) {
                        e.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (aVar instanceof c) {
                try {
                    int i18 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a3 = AbstractC43443a.f412954d;
                    c11757a3.getClass();
                    bVar5 = c11757a3.c(c.INSTANCE.serializer(), aVar);
                } catch (Throwable th6) {
                    int i19 = Z.f406624c;
                    bVar5 = new Z.b(th6);
                }
                boolean z16 = bVar5 instanceof Z.b;
                if (z16) {
                    bVar5 = null;
                }
                str = (String) bVar5;
                if (z16 || str == null) {
                    c.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar6 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th7) {
                        int i22 = Z.f406624c;
                        bVar6 = new Z.b(th7);
                    }
                    boolean z17 = bVar6 instanceof Z.b;
                    str2 = (String) (z17 ? null : bVar6);
                    if (z17 || str2 == null) {
                        c.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (aVar instanceof l) {
                try {
                    int i23 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a4 = AbstractC43443a.f412954d;
                    c11757a4.getClass();
                    bVar7 = c11757a4.c(l.INSTANCE.serializer(), aVar);
                } catch (Throwable th8) {
                    int i24 = Z.f406624c;
                    bVar7 = new Z.b(th8);
                }
                boolean z18 = bVar7 instanceof Z.b;
                if (z18) {
                    bVar7 = null;
                }
                str = (String) bVar7;
                if (z18 || str == null) {
                    l.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar8 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th9) {
                        int i25 = Z.f406624c;
                        bVar8 = new Z.b(th9);
                    }
                    boolean z19 = bVar8 instanceof Z.b;
                    str2 = (String) (z19 ? null : bVar8);
                    if (z19 || str2 == null) {
                        l.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (aVar instanceof d) {
                try {
                    int i26 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a5 = AbstractC43443a.f412954d;
                    c11757a5.getClass();
                    bVar9 = c11757a5.c(d.INSTANCE.serializer(), aVar);
                } catch (Throwable th10) {
                    int i27 = Z.f406624c;
                    bVar9 = new Z.b(th10);
                }
                boolean z22 = bVar9 instanceof Z.b;
                if (z22) {
                    bVar9 = null;
                }
                str = (String) bVar9;
                if (z22 || str == null) {
                    d.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar10 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th11) {
                        int i28 = Z.f406624c;
                        bVar10 = new Z.b(th11);
                    }
                    boolean z23 = bVar10 instanceof Z.b;
                    str2 = (String) (z23 ? null : bVar10);
                    if (z23 || str2 == null) {
                        d.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (aVar instanceof i) {
                try {
                    int i29 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a6 = AbstractC43443a.f412954d;
                    c11757a6.getClass();
                    bVar11 = c11757a6.c(i.INSTANCE.serializer(), aVar);
                } catch (Throwable th12) {
                    int i32 = Z.f406624c;
                    bVar11 = new Z.b(th12);
                }
                boolean z24 = bVar11 instanceof Z.b;
                if (z24) {
                    bVar11 = null;
                }
                str = (String) bVar11;
                if (z24 || str == null) {
                    i.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar12 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th13) {
                        int i33 = Z.f406624c;
                        bVar12 = new Z.b(th13);
                    }
                    boolean z25 = bVar12 instanceof Z.b;
                    str2 = (String) (z25 ? null : bVar12);
                    if (z25 || str2 == null) {
                        i.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (aVar instanceof p) {
                try {
                    int i34 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a7 = AbstractC43443a.f412954d;
                    c11757a7.getClass();
                    bVar13 = c11757a7.c(p.INSTANCE.serializer(), aVar);
                } catch (Throwable th14) {
                    int i35 = Z.f406624c;
                    bVar13 = new Z.b(th14);
                }
                boolean z26 = bVar13 instanceof Z.b;
                if (z26) {
                    bVar13 = null;
                }
                str = (String) bVar13;
                if (z26 || str == null) {
                    p.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar14 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th15) {
                        int i36 = Z.f406624c;
                        bVar14 = new Z.b(th15);
                    }
                    boolean z27 = bVar14 instanceof Z.b;
                    str2 = (String) (z27 ? null : bVar14);
                    if (z27 || str2 == null) {
                        p.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (aVar instanceof b) {
                try {
                    int i37 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a8 = AbstractC43443a.f412954d;
                    c11757a8.getClass();
                    bVar15 = c11757a8.c(b.INSTANCE.serializer(), aVar);
                } catch (Throwable th16) {
                    int i38 = Z.f406624c;
                    bVar15 = new Z.b(th16);
                }
                boolean z28 = bVar15 instanceof Z.b;
                if (z28) {
                    bVar15 = null;
                }
                str = (String) bVar15;
                if (z28 || str == null) {
                    b.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar16 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th17) {
                        int i39 = Z.f406624c;
                        bVar16 = new Z.b(th17);
                    }
                    boolean z29 = bVar16 instanceof Z.b;
                    str2 = (String) (z29 ? null : bVar16);
                    if (z29 || str2 == null) {
                        b.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (aVar instanceof o) {
                try {
                    int i42 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a9 = AbstractC43443a.f412954d;
                    c11757a9.getClass();
                    bVar17 = c11757a9.c(o.INSTANCE.serializer(), aVar);
                } catch (Throwable th18) {
                    int i43 = Z.f406624c;
                    bVar17 = new Z.b(th18);
                }
                boolean z32 = bVar17 instanceof Z.b;
                if (z32) {
                    bVar17 = null;
                }
                str = (String) bVar17;
                if (z32 || str == null) {
                    o.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar18 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th19) {
                        int i44 = Z.f406624c;
                        bVar18 = new Z.b(th19);
                    }
                    boolean z33 = bVar18 instanceof Z.b;
                    str2 = (String) (z33 ? null : bVar18);
                    if (z33 || str2 == null) {
                        o.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (aVar instanceof j) {
                try {
                    int i45 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a10 = AbstractC43443a.f412954d;
                    c11757a10.getClass();
                    bVar19 = c11757a10.c(j.INSTANCE.serializer(), aVar);
                } catch (Throwable th20) {
                    int i46 = Z.f406624c;
                    bVar19 = new Z.b(th20);
                }
                boolean z34 = bVar19 instanceof Z.b;
                if (z34) {
                    bVar19 = null;
                }
                str = (String) bVar19;
                if (z34 || str == null) {
                    j.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar20 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th21) {
                        int i47 = Z.f406624c;
                        bVar20 = new Z.b(th21);
                    }
                    boolean z35 = bVar20 instanceof Z.b;
                    str2 = (String) (z35 ? null : bVar20);
                    if (z35 || str2 == null) {
                        j.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (aVar instanceof q) {
                try {
                    int i48 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a11 = AbstractC43443a.f412954d;
                    c11757a11.getClass();
                    bVar21 = c11757a11.c(q.INSTANCE.serializer(), aVar);
                } catch (Throwable th22) {
                    int i49 = Z.f406624c;
                    bVar21 = new Z.b(th22);
                }
                boolean z36 = bVar21 instanceof Z.b;
                if (z36) {
                    bVar21 = null;
                }
                str = (String) bVar21;
                if (z36 || str == null) {
                    q.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar22 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th23) {
                        int i52 = Z.f406624c;
                        bVar22 = new Z.b(th23);
                    }
                    boolean z37 = bVar22 instanceof Z.b;
                    str2 = (String) (z37 ? null : bVar22);
                    if (z37 || str2 == null) {
                        q.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (aVar instanceof n) {
                try {
                    int i53 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a12 = AbstractC43443a.f412954d;
                    c11757a12.getClass();
                    bVar23 = c11757a12.c(n.INSTANCE.serializer(), aVar);
                } catch (Throwable th24) {
                    int i54 = Z.f406624c;
                    bVar23 = new Z.b(th24);
                }
                boolean z38 = bVar23 instanceof Z.b;
                if (z38) {
                    bVar23 = null;
                }
                str = (String) bVar23;
                if (z38 || str == null) {
                    n.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar24 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th25) {
                        int i55 = Z.f406624c;
                        bVar24 = new Z.b(th25);
                    }
                    boolean z39 = bVar24 instanceof Z.b;
                    str2 = (String) (z39 ? null : bVar24);
                    if (z39 || str2 == null) {
                        n.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (aVar instanceof m) {
                try {
                    int i56 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a13 = AbstractC43443a.f412954d;
                    c11757a13.getClass();
                    bVar25 = c11757a13.c(m.INSTANCE.serializer(), aVar);
                } catch (Throwable th26) {
                    int i57 = Z.f406624c;
                    bVar25 = new Z.b(th26);
                }
                boolean z42 = bVar25 instanceof Z.b;
                if (z42) {
                    bVar25 = null;
                }
                str = (String) bVar25;
                if (z42 || str == null) {
                    m.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar26 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th27) {
                        int i58 = Z.f406624c;
                        bVar26 = new Z.b(th27);
                    }
                    boolean z43 = bVar26 instanceof Z.b;
                    str2 = (String) (z43 ? null : bVar26);
                    if (z43 || str2 == null) {
                        m.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (aVar instanceof k) {
                try {
                    int i59 = Z.f406624c;
                    AbstractC43443a.C11757a c11757a14 = AbstractC43443a.f412954d;
                    c11757a14.getClass();
                    bVar27 = c11757a14.c(k.INSTANCE.serializer(), aVar);
                } catch (Throwable th28) {
                    int i62 = Z.f406624c;
                    bVar27 = new Z.b(th28);
                }
                boolean z44 = bVar27 instanceof Z.b;
                if (z44) {
                    bVar27 = null;
                }
                str = (String) bVar27;
                if (z44 || str == null) {
                    k.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    try {
                        bVar28 = Dc1.c.f3297a.l(aVar);
                    } catch (Throwable th29) {
                        int i63 = Z.f406624c;
                        bVar28 = new Z.b(th29);
                    }
                    boolean z45 = bVar28 instanceof Z.b;
                    str2 = (String) (z45 ? null : bVar28);
                    if (z45 || str2 == null) {
                        k.class.toString();
                        Objects.toString(aVar);
                    }
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                }
                return str;
            }
            if (!(aVar instanceof C1382a)) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                int i64 = Z.f406624c;
                AbstractC43443a.C11757a c11757a15 = AbstractC43443a.f412954d;
                c11757a15.getClass();
                bVar29 = c11757a15.c(C1382a.INSTANCE.serializer(), aVar);
            } catch (Throwable th30) {
                int i65 = Z.f406624c;
                bVar29 = new Z.b(th30);
            }
            boolean z46 = bVar29 instanceof Z.b;
            if (z46) {
                bVar29 = null;
            }
            str = (String) bVar29;
            if (z46 || str == null) {
                C1382a.class.toString();
                Objects.toString(aVar);
            }
            if (str == null) {
                try {
                    bVar30 = Dc1.c.f3297a.l(aVar);
                } catch (Throwable th31) {
                    int i66 = Z.f406624c;
                    bVar30 = new Z.b(th31);
                }
                boolean z47 = bVar30 instanceof Z.b;
                str2 = (String) (z47 ? null : bVar30);
                if (z47 || str2 == null) {
                    C1382a.class.toString();
                    Objects.toString(aVar);
                }
                if (str2 == null) {
                    return "";
                }
                return str2;
            }
            return str;
        }

        @Y61.k
        public static Map<String, String> b(@Y61.k a aVar) {
            Object bVar;
            Object bVar2;
            Object bVar3;
            Object bVar4;
            try {
                int i12 = Z.f406624c;
                AbstractC43443a.C11757a c11757a = AbstractC43443a.f412954d;
                c11757a.getClass();
                bVar = c11757a.c(a.INSTANCE.serializer(), aVar);
            } catch (Throwable th2) {
                int i13 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            boolean z12 = bVar instanceof Z.b;
            if (z12) {
                bVar = null;
            }
            String str = (String) bVar;
            if (z12 || str == null) {
                a.class.toString();
                Objects.toString(aVar);
            }
            if (str == null) {
                try {
                    bVar4 = Dc1.c.f3297a.l(aVar);
                } catch (Throwable th3) {
                    int i14 = Z.f406624c;
                    bVar4 = new Z.b(th3);
                }
                boolean z13 = bVar4 instanceof Z.b;
                if (z13) {
                    bVar4 = null;
                }
                str = (String) bVar4;
                if (z13 || str == null) {
                    a.class.toString();
                    Objects.toString(aVar);
                }
                if (str == null) {
                    str = "";
                }
            }
            try {
                AbstractC43443a.C11757a c11757a2 = AbstractC43443a.f412954d;
                c11757a2.getClass();
                V0 v02 = V0.f412822a;
                bVar2 = c11757a2.d(str, L51.a.a(new C43400e0(v02, v02)));
            } catch (Throwable th4) {
                int i15 = Z.f406624c;
                bVar2 = new Z.b(th4);
            }
            boolean z14 = bVar2 instanceof Z.b;
            if (z14) {
                bVar2 = null;
            }
            if (z14 || bVar2 == null) {
                Map.class.toString();
            }
            if (bVar2 == null) {
                try {
                    bVar3 = Dc1.c.f3297a.d(Map.class, str);
                } catch (Throwable th5) {
                    int i16 = Z.f406624c;
                    bVar3 = new Z.b(th5);
                }
                boolean z15 = bVar3 instanceof Z.b;
                Object obj = z15 ? null : bVar3;
                if (z15 || obj == null) {
                    Map.class.toString();
                }
                bVar2 = obj;
            }
            Map<String, String> map = (Map) bVar2;
            if (map == null) {
                return P0.c();
            }
            map.remove("type");
            return map;
        }
    }

    @Y61.k
    /* renamed from: a */
    String getF19587a();

    @Y61.k
    Map<String, String> b();

    @Y61.k
    String c();

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBa\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u0012\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0010\u0012\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0010\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0019\u0010\u0012R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0010\u0012\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001b\u0010\u0012¨\u0006 "}, d2 = {"LYb1/a$d;", "LYb1/a;", "", "reason", "sdkVersion", "clientId", "partnerName", "eventCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getReason", "()Ljava/lang/String;", "getReason$annotations", "()V", "getSdkVersion", "getSdkVersion$annotations", "getClientId", "getClientId$annotations", "getPartnerName", "getPartnerName$annotations", "getEventCategory", "getEventCategory$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class d implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19553a;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("reason")
        @Y61.l
        private final String reason;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.ButtonBlocked.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$d;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$d$a, reason: collision with other inner class name */
        public static final class C1387a implements N<d> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1387a f19554a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19555b;

            static {
                C1387a c1387a = new C1387a();
                f19554a = c1387a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.ButtonBlocked", c1387a, 6);
                pluginGeneratedSerialDescriptor.j("reason", true);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19555b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19555b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                int i12 = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String strS = null;
                boolean z12 = true;
                while (z12) {
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 0, V0.f412822a, str);
                            i12 |= 1;
                            break;
                        case 1:
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 1, V0.f412822a, str2);
                            i12 |= 2;
                            break;
                        case 2:
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 2, V0.f412822a, str3);
                            i12 |= 4;
                            break;
                        case 3:
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str4);
                            i12 |= 8;
                            break;
                        case 4:
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str5);
                            i12 |= 16;
                            break;
                        case 5:
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 5);
                            i12 |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new d(i12, str, str2, str3, str4, str5, strS, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19555b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19555b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                d.d((d) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$d$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$d;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$d$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<d> serializer() {
                return C1387a.f19554a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public /* synthetic */ d(int i12, @v String str, @v String str2, @v String str3, @v String str4, @v @EncodeDefault String str5, String str6, kotlinx.serialization.internal.P0 p02) {
            if ((i12 & 1) == 0) {
                this.reason = null;
            } else {
                this.reason = str;
            }
            if ((i12 & 2) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str2;
            }
            if ((i12 & 4) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str3;
            }
            if ((i12 & 8) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str4;
            }
            if ((i12 & 16) == 0) {
                this.eventCategory = null;
            } else {
                this.eventCategory = str5;
            }
            if ((i12 & 32) == 0) {
                this.f19553a = "SberID Login Blocked";
            } else {
                this.f19553a = str6;
            }
        }

        @X41.n
        public static final void d(d dVar, kotlinx.serialization.encoding.d dVar2, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            if (dVar2.u() || dVar.reason != null) {
                dVar2.p(pluginGeneratedSerialDescriptor, 0, V0.f412822a, dVar.reason);
            }
            if (dVar2.u() || dVar.sdkVersion != null) {
                dVar2.p(pluginGeneratedSerialDescriptor, 1, V0.f412822a, dVar.sdkVersion);
            }
            if (dVar2.u() || dVar.clientId != null) {
                dVar2.p(pluginGeneratedSerialDescriptor, 2, V0.f412822a, dVar.clientId);
            }
            if (dVar2.u() || dVar.partnerName != null) {
                dVar2.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, dVar.partnerName);
            }
            dVar2.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, dVar.eventCategory);
            boolean zU2 = dVar2.u();
            String str = dVar.f19553a;
            if (!zU2 && L.f(str, "SberID Login Blocked")) {
                return;
            }
            dVar2.l(pluginGeneratedSerialDescriptor, 5, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19553a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.reason, dVar.reason) && L.f(this.sdkVersion, dVar.sdkVersion) && L.f(this.clientId, dVar.clientId) && L.f(this.partnerName, dVar.partnerName) && L.f(this.eventCategory, dVar.eventCategory);
        }

        public final int hashCode() {
            String str = this.reason;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.sdkVersion;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.clientId;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.partnerName;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.eventCategory;
            return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.reason;
            String str2 = this.sdkVersion;
            String str3 = this.clientId;
            String str4 = this.partnerName;
            String str5 = this.eventCategory;
            StringBuilder sbB = C23088b.b("ButtonBlocked(reason=", str, ", sdkVersion=", str2, ", clientId=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", partnerName=", str4, ", eventCategory=");
            return AK.c.s(sbB, str5, ")");
        }

        public d(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5) {
            this.reason = str;
            this.sdkVersion = str2;
            this.clientId = str3;
            this.partnerName = str4;
            this.eventCategory = str5;
            this.f19553a = "SberID Login Blocked";
        }

        public /* synthetic */ d(String str, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fB\u0085\u0001\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0012R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0013\u0012\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u0012\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0015R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0013\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001c\u0010\u0015R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u0012\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001e\u0010\u0015R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0013\u0012\u0004\b!\u0010\u0017\u001a\u0004\b \u0010\u0015R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u0012\u0004\b#\u0010\u0017\u001a\u0004\b\"\u0010\u0015R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0013\u0012\u0004\b%\u0010\u0017\u001a\u0004\b$\u0010\u0015¨\u0006)"}, d2 = {"LYb1/a$f;", "LYb1/a;", "", "sdkVersion", "clientId", "partnerName", "logUid", "authApp", "channel", "personalView", "eventCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getSdkVersion", "()Ljava/lang/String;", "getSdkVersion$annotations", "()V", "getClientId", "getClientId$annotations", "getPartnerName", "getPartnerName$annotations", "getLogUid", "getLogUid$annotations", "getAuthApp", "getAuthApp$annotations", "getChannel", "getChannel$annotations", "getPersonalView", "getPersonalView$annotations", "getEventCategory", "getEventCategory$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class f implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19559a;

        @com.google.gson.annotations.c("authApp")
        @Y61.l
        private final String authApp;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("personalView")
        @Y61.l
        private final String personalView;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.ButtonShow.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$f;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$f$a, reason: collision with other inner class name */
        public static final class C1389a implements N<f> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1389a f19560a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19561b;

            static {
                C1389a c1389a = new C1389a();
                f19560a = c1389a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.ButtonShow", c1389a, 9);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("authApp", true);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("personalView", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19561b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19561b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String strS = null;
                int i12 = 0;
                boolean z12 = true;
                while (z12) {
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 0, V0.f412822a, str);
                            i12 |= 1;
                            break;
                        case 1:
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 1, V0.f412822a, str2);
                            i12 |= 2;
                            break;
                        case 2:
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 2, V0.f412822a, str3);
                            i12 |= 4;
                            break;
                        case 3:
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str4);
                            i12 |= 8;
                            break;
                        case 4:
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str5);
                            i12 |= 16;
                            break;
                        case 5:
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str6);
                            i12 |= 32;
                            break;
                        case 6:
                            str7 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str7);
                            i12 |= 64;
                            break;
                        case 7:
                            str8 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str8);
                            i12 |= 128;
                            break;
                        case 8:
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 8);
                            i12 |= 256;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new f(i12, str, str2, str3, str4, str5, str6, str7, str8, strS, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19561b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19561b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                f.d((f) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$f$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$f;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$f$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<f> serializer() {
                return C1389a.f19560a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public /* synthetic */ f(int i12, @v String str, @v String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v @EncodeDefault String str8, String str9, kotlinx.serialization.internal.P0 p02) {
            if ((i12 & 1) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str;
            }
            if ((i12 & 2) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str2;
            }
            if ((i12 & 4) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str3;
            }
            if ((i12 & 8) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str4;
            }
            if ((i12 & 16) == 0) {
                this.authApp = null;
            } else {
                this.authApp = str5;
            }
            if ((i12 & 32) == 0) {
                this.channel = null;
            } else {
                this.channel = str6;
            }
            if ((i12 & 64) == 0) {
                this.personalView = null;
            } else {
                this.personalView = str7;
            }
            if ((i12 & 128) == 0) {
                this.eventCategory = null;
            } else {
                this.eventCategory = str8;
            }
            if ((i12 & 256) == 0) {
                this.f19559a = "SberID Login Show";
            } else {
                this.f19559a = str9;
            }
        }

        @X41.n
        public static final void d(f fVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            if (dVar.u() || fVar.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 0, V0.f412822a, fVar.sdkVersion);
            }
            if (dVar.u() || fVar.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 1, V0.f412822a, fVar.clientId);
            }
            if (dVar.u() || fVar.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 2, V0.f412822a, fVar.partnerName);
            }
            if (dVar.u() || fVar.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, fVar.logUid);
            }
            if (dVar.u() || fVar.authApp != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, fVar.authApp);
            }
            if (dVar.u() || fVar.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, fVar.channel);
            }
            if (dVar.u() || fVar.personalView != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, fVar.personalView);
            }
            dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, fVar.eventCategory);
            boolean zU2 = dVar.u();
            String str = fVar.f19559a;
            if (!zU2 && L.f(str, "SberID Login Show")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 8, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19559a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.sdkVersion, fVar.sdkVersion) && L.f(this.clientId, fVar.clientId) && L.f(this.partnerName, fVar.partnerName) && L.f(this.logUid, fVar.logUid) && L.f(this.authApp, fVar.authApp) && L.f(this.channel, fVar.channel) && L.f(this.personalView, fVar.personalView) && L.f(this.eventCategory, fVar.eventCategory);
        }

        public final int hashCode() {
            String str = this.sdkVersion;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.clientId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.logUid;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.authApp;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.channel;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.personalView;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.eventCategory;
            return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.sdkVersion;
            String str2 = this.clientId;
            String str3 = this.partnerName;
            String str4 = this.logUid;
            String str5 = this.authApp;
            String str6 = this.channel;
            String str7 = this.personalView;
            String str8 = this.eventCategory;
            StringBuilder sbB = C23088b.b("ButtonShow(sdkVersion=", str, ", clientId=", str2, ", partnerName=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", logUid=", str4, ", authApp=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", channel=", str6, ", personalView=");
            return G.h(sbB, str7, ", eventCategory=", str8, ")");
        }

        public f(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8) {
            this.sdkVersion = str;
            this.clientId = str2;
            this.partnerName = str3;
            this.logUid = str4;
            this.authApp = str5;
            this.channel = str6;
            this.personalView = str7;
            this.eventCategory = str8;
            this.f19559a = "SberID Login Show";
        }

        public /* synthetic */ f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) == 0 ? str8 : null);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB\u0091\u0001\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0013R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b!\u0010\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u0012\u0004\b$\u0010\u0018\u001a\u0004\b#\u0010\u0016R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u0012\u0004\b&\u0010\u0018\u001a\u0004\b%\u0010\u0016R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u0012\u0004\b(\u0010\u0018\u001a\u0004\b'\u0010\u0016¨\u0006,"}, d2 = {"LYb1/a$e;", "LYb1/a;", "", "sdkVersion", "clientId", "partnerName", "logUid", "authApp", "channel", "personalView", "authType", "eventCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getSdkVersion", "()Ljava/lang/String;", "getSdkVersion$annotations", "()V", "getClientId", "getClientId$annotations", "getPartnerName", "getPartnerName$annotations", "getLogUid", "getLogUid$annotations", "getAuthApp", "getAuthApp$annotations", "getChannel", "getChannel$annotations", "getPersonalView", "getPersonalView$annotations", "getAuthType", "getAuthType$annotations", "getEventCategory", "getEventCategory$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class e implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19556a;

        @com.google.gson.annotations.c("authApp")
        @Y61.l
        private final String authApp;

        @com.google.gson.annotations.c("auth_type")
        @Y61.l
        private final String authType;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("personalView")
        @Y61.l
        private final String personalView;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.ButtonClick.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$e;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$e$a, reason: collision with other inner class name */
        public static final class C1388a implements N<e> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1388a f19557a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19558b;

            static {
                C1388a c1388a = new C1388a();
                f19557a = c1388a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.ButtonClick", c1388a, 10);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("authApp", true);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("personalView", true);
                pluginGeneratedSerialDescriptor.j("auth_type", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19558b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19558b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String strS = null;
                int i12 = 0;
                boolean z12 = true;
                while (z12) {
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 0, V0.f412822a, str);
                            i12 |= 1;
                            break;
                        case 1:
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 1, V0.f412822a, str2);
                            i12 |= 2;
                            break;
                        case 2:
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 2, V0.f412822a, str3);
                            i12 |= 4;
                            break;
                        case 3:
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str4);
                            i12 |= 8;
                            break;
                        case 4:
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str5);
                            i12 |= 16;
                            break;
                        case 5:
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str6);
                            i12 |= 32;
                            break;
                        case 6:
                            str7 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str7);
                            i12 |= 64;
                            break;
                        case 7:
                            str8 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str8);
                            i12 |= 128;
                            break;
                        case 8:
                            str9 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str9);
                            i12 |= 256;
                            break;
                        case 9:
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 9);
                            i12 |= 512;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new e(i12, str, str2, str3, str4, str5, str6, str7, str8, str9, strS, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19558b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19558b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                e.d((e) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$e$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$e;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$e$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<e> serializer() {
                return C1388a.f19557a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public /* synthetic */ e(int i12, @v String str, @v String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v @EncodeDefault String str9, String str10, kotlinx.serialization.internal.P0 p02) {
            if ((i12 & 1) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str;
            }
            if ((i12 & 2) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str2;
            }
            if ((i12 & 4) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str3;
            }
            if ((i12 & 8) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str4;
            }
            if ((i12 & 16) == 0) {
                this.authApp = null;
            } else {
                this.authApp = str5;
            }
            if ((i12 & 32) == 0) {
                this.channel = null;
            } else {
                this.channel = str6;
            }
            if ((i12 & 64) == 0) {
                this.personalView = null;
            } else {
                this.personalView = str7;
            }
            if ((i12 & 128) == 0) {
                this.authType = null;
            } else {
                this.authType = str8;
            }
            if ((i12 & 256) == 0) {
                this.eventCategory = null;
            } else {
                this.eventCategory = str9;
            }
            if ((i12 & 512) == 0) {
                this.f19556a = "SberID Login Button Click";
            } else {
                this.f19556a = str10;
            }
        }

        @X41.n
        public static final void d(e eVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            if (dVar.u() || eVar.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 0, V0.f412822a, eVar.sdkVersion);
            }
            if (dVar.u() || eVar.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 1, V0.f412822a, eVar.clientId);
            }
            if (dVar.u() || eVar.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 2, V0.f412822a, eVar.partnerName);
            }
            if (dVar.u() || eVar.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, eVar.logUid);
            }
            if (dVar.u() || eVar.authApp != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, eVar.authApp);
            }
            if (dVar.u() || eVar.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, eVar.channel);
            }
            if (dVar.u() || eVar.personalView != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, eVar.personalView);
            }
            if (dVar.u() || eVar.authType != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, eVar.authType);
            }
            dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, eVar.eventCategory);
            boolean zU2 = dVar.u();
            String str = eVar.f19556a;
            if (!zU2 && L.f(str, "SberID Login Button Click")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 9, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19556a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.sdkVersion, eVar.sdkVersion) && L.f(this.clientId, eVar.clientId) && L.f(this.partnerName, eVar.partnerName) && L.f(this.logUid, eVar.logUid) && L.f(this.authApp, eVar.authApp) && L.f(this.channel, eVar.channel) && L.f(this.personalView, eVar.personalView) && L.f(this.authType, eVar.authType) && L.f(this.eventCategory, eVar.eventCategory);
        }

        public final int hashCode() {
            String str = this.sdkVersion;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.clientId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.logUid;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.authApp;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.channel;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.personalView;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.authType;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.eventCategory;
            return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.sdkVersion;
            String str2 = this.clientId;
            String str3 = this.partnerName;
            String str4 = this.logUid;
            String str5 = this.authApp;
            String str6 = this.channel;
            String str7 = this.personalView;
            String str8 = this.authType;
            String str9 = this.eventCategory;
            StringBuilder sbB = C23088b.b("ButtonClick(sdkVersion=", str, ", clientId=", str2, ", partnerName=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", logUid=", str4, ", authApp=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", channel=", str6, ", personalView=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str7, ", authType=", str8, ", eventCategory=");
            return AK.c.s(sbB, str9, ")");
        }

        public e(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9) {
            this.sdkVersion = str;
            this.clientId = str2;
            this.partnerName = str3;
            this.logUid = str4;
            this.authApp = str5;
            this.channel = str6;
            this.personalView = str7;
            this.authType = str8;
            this.eventCategory = str9;
            this.f19556a = "SberID Login Button Click";
        }

        public /* synthetic */ e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) == 0 ? str9 : null);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*Bo\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB\u0091\u0001\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b!\u0010\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u0012\u0004\b$\u0010\u0018\u001a\u0004\b#\u0010\u0016R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u0012\u0004\b%\u0010\u0018\u001a\u0004\b\n\u0010\u0016R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u0012\u0004\b'\u0010\u0018\u001a\u0004\b&\u0010\u0016¨\u0006+"}, d2 = {"LYb1/a$k;", "LYb1/a;", "", "authType", "typeFront", "channel", "logUid", "partnerName", "sdkVersion", "clientId", "isDefaultColor", "eventCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "getAuthType$annotations", "()V", "getTypeFront", "getTypeFront$annotations", "getChannel", "getChannel$annotations", "getLogUid", "getLogUid$annotations", "getPartnerName", "getPartnerName$annotations", "getSdkVersion", "getSdkVersion$annotations", "getClientId", "getClientId$annotations", "isDefaultColor$annotations", "getEventCategory", "getEventCategory$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class k implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19569a;

        @com.google.gson.annotations.c("auth_type")
        @Y61.k
        private final String authType;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("is_default_color")
        @Y61.l
        private final String isDefaultColor;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @com.google.gson.annotations.c("type_front")
        @Y61.k
        private final String typeFront;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.OpenWebViewForAuth.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$k;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$k$a, reason: collision with other inner class name */
        public static final class C1392a implements N<k> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1392a f19570a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19571b;

            static {
                C1392a c1392a = new C1392a();
                f19570a = c1392a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.OpenWebViewForAuth", c1392a, 10);
                pluginGeneratedSerialDescriptor.j("auth_type", true);
                pluginGeneratedSerialDescriptor.j("type_front", true);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("is_default_color", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19571b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{v02, v02, L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19571b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String strS = null;
                String strS2 = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String strS3 = null;
                int i12 = 0;
                boolean z12 = true;
                while (z12) {
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                            i12 |= 1;
                            break;
                        case 1:
                            strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                            i12 |= 2;
                            break;
                        case 2:
                            str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 2, V0.f412822a, str);
                            i12 |= 4;
                            break;
                        case 3:
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str2);
                            i12 |= 8;
                            break;
                        case 4:
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str3);
                            i12 |= 16;
                            break;
                        case 5:
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str4);
                            i12 |= 32;
                            break;
                        case 6:
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str5);
                            i12 |= 64;
                            break;
                        case 7:
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str6);
                            i12 |= 128;
                            break;
                        case 8:
                            str7 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str7);
                            i12 |= 256;
                            break;
                        case 9:
                            strS3 = cVarC.s(pluginGeneratedSerialDescriptor, 9);
                            i12 |= 512;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new k(i12, strS, strS2, str, str2, str3, str4, str5, str6, str7, strS3, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19571b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19571b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                k.d((k) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$k$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$k;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$k$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<k> serializer() {
                return C1392a.f19570a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public /* synthetic */ k(int i12, @v @EncodeDefault String str, @v @EncodeDefault String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v @EncodeDefault String str9, String str10, kotlinx.serialization.internal.P0 p02) {
            this.authType = (i12 & 1) == 0 ? "sberID" : str;
            if ((i12 & 2) == 0) {
                this.typeFront = "app";
            } else {
                this.typeFront = str2;
            }
            if ((i12 & 4) == 0) {
                this.channel = null;
            } else {
                this.channel = str3;
            }
            if ((i12 & 8) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str4;
            }
            if ((i12 & 16) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str5;
            }
            if ((i12 & 32) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str6;
            }
            if ((i12 & 64) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str7;
            }
            if ((i12 & 128) == 0) {
                this.isDefaultColor = null;
            } else {
                this.isDefaultColor = str8;
            }
            if ((i12 & 256) == 0) {
                this.eventCategory = "AUTH";
            } else {
                this.eventCategory = str9;
            }
            if ((i12 & 512) == 0) {
                this.f19569a = "SID_AUTH open browser";
            } else {
                this.f19569a = str10;
            }
        }

        @X41.n
        public static final void d(k kVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            dVar.l(pluginGeneratedSerialDescriptor, 0, kVar.authType);
            dVar.l(pluginGeneratedSerialDescriptor, 1, kVar.typeFront);
            if (dVar.u() || kVar.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 2, V0.f412822a, kVar.channel);
            }
            if (dVar.u() || kVar.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, kVar.logUid);
            }
            if (dVar.u() || kVar.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, kVar.partnerName);
            }
            if (dVar.u() || kVar.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, kVar.sdkVersion);
            }
            if (dVar.u() || kVar.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, kVar.clientId);
            }
            if (dVar.u() || kVar.isDefaultColor != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, kVar.isDefaultColor);
            }
            dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, kVar.eventCategory);
            boolean zU2 = dVar.u();
            String str = kVar.f19569a;
            if (!zU2 && L.f(str, "SID_AUTH open browser")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 9, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19569a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.authType, kVar.authType) && L.f(this.typeFront, kVar.typeFront) && L.f(this.channel, kVar.channel) && L.f(this.logUid, kVar.logUid) && L.f(this.partnerName, kVar.partnerName) && L.f(this.sdkVersion, kVar.sdkVersion) && L.f(this.clientId, kVar.clientId) && L.f(this.isDefaultColor, kVar.isDefaultColor) && L.f(this.eventCategory, kVar.eventCategory);
        }

        public final int hashCode() {
            int iA2 = AbstractC47961a.a(this.typeFront, this.authType.hashCode() * 31);
            String str = this.channel;
            int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logUid;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sdkVersion;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.clientId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.isDefaultColor;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.eventCategory;
            return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.authType;
            String str2 = this.typeFront;
            String str3 = this.channel;
            String str4 = this.logUid;
            String str5 = this.partnerName;
            String str6 = this.sdkVersion;
            String str7 = this.clientId;
            String str8 = this.isDefaultColor;
            String str9 = this.eventCategory;
            StringBuilder sbB = C23088b.b("OpenWebViewForAuth(authType=", str, ", typeFront=", str2, ", channel=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", logUid=", str4, ", partnerName=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", sdkVersion=", str6, ", clientId=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str7, ", isDefaultColor=", str8, ", eventCategory=");
            return AK.c.s(sbB, str9, ")");
        }

        public k(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9) {
            this.authType = str;
            this.typeFront = str2;
            this.channel = str3;
            this.logUid = str4;
            this.partnerName = str5;
            this.sdkVersion = str6;
            this.clientId = str7;
            this.isDefaultColor = str8;
            this.eventCategory = str9;
            this.f19569a = "SID_AUTH open browser";
        }

        public /* synthetic */ k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "sberID" : str, (i12 & 2) != 0 ? "app" : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) == 0 ? str8 : null, (i12 & 256) != 0 ? "AUTH" : str9);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB\u009d\u0001\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001e\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u0012\u0004\b!\u0010\u0019\u001a\u0004\b \u0010\u0017R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u0012\u0004\b#\u0010\u0019\u001a\u0004\b\"\u0010\u0017R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u0012\u0004\b%\u0010\u0019\u001a\u0004\b$\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u0012\u0004\b'\u0010\u0019\u001a\u0004\b&\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u0012\u0004\b)\u0010\u0019\u001a\u0004\b(\u0010\u0017R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b+\u0010\u0019\u001a\u0004\b*\u0010\u0017¨\u0006/"}, d2 = {"LYb1/a$c;", "LYb1/a;", "", "sdkVersion", "clientId", "partnerName", "logUid", "authApp", "channel", "personalView", "result", "errorDescription", "eventCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getSdkVersion", "()Ljava/lang/String;", "getSdkVersion$annotations", "()V", "getClientId", "getClientId$annotations", "getPartnerName", "getPartnerName$annotations", "getLogUid", "getLogUid$annotations", "getAuthApp", "getAuthApp$annotations", "getChannel", "getChannel$annotations", "getPersonalView", "getPersonalView$annotations", "getResult", "getResult$annotations", "getErrorDescription", "getErrorDescription$annotations", "getEventCategory", "getEventCategory$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class c implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19550a;

        @com.google.gson.annotations.c("authApp")
        @Y61.l
        private final String authApp;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("errorDescription")
        @Y61.l
        private final String errorDescription;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("personalView")
        @Y61.l
        private final String personalView;

        @com.google.gson.annotations.c("result")
        @Y61.l
        private final String result;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.AuthResult.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$c;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$c$a, reason: collision with other inner class name */
        public static final class C1386a implements N<c> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1386a f19551a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19552b;

            static {
                C1386a c1386a = new C1386a();
                f19551a = c1386a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.AuthResult", c1386a, 11);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("authApp", true);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("personalView", true);
                pluginGeneratedSerialDescriptor.j("result", true);
                pluginGeneratedSerialDescriptor.j("errorDescription", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19552b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19552b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String strS = null;
                boolean z12 = true;
                int i12 = 0;
                while (z12) {
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 0, V0.f412822a, str2);
                            i12 |= 1;
                            break;
                        case 1:
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 1, V0.f412822a, str3);
                            i12 |= 2;
                            break;
                        case 2:
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 2, V0.f412822a, str4);
                            i12 |= 4;
                            break;
                        case 3:
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str5);
                            i12 |= 8;
                            break;
                        case 4:
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str6);
                            i12 |= 16;
                            break;
                        case 5:
                            str7 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str7);
                            i12 |= 32;
                            break;
                        case 6:
                            str8 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str8);
                            i12 |= 64;
                            break;
                        case 7:
                            str9 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str9);
                            i12 |= 128;
                            break;
                        case 8:
                            str10 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str10);
                            i12 |= 256;
                            break;
                        case 9:
                            str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 9, V0.f412822a, str);
                            i12 |= 512;
                            break;
                        case 10:
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 10);
                            i12 |= 1024;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new c(i12, str2, str3, str4, str5, str6, str7, str8, str9, str10, str, strS, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19552b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19552b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                c.d((c) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$c$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$c;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<c> serializer() {
                return C1386a.f19551a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public /* synthetic */ c(int i12, @v String str, @v String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v String str9, @v @EncodeDefault String str10, String str11, kotlinx.serialization.internal.P0 p02) {
            if ((i12 & 1) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str;
            }
            if ((i12 & 2) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str2;
            }
            if ((i12 & 4) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str3;
            }
            if ((i12 & 8) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str4;
            }
            if ((i12 & 16) == 0) {
                this.authApp = null;
            } else {
                this.authApp = str5;
            }
            if ((i12 & 32) == 0) {
                this.channel = null;
            } else {
                this.channel = str6;
            }
            if ((i12 & 64) == 0) {
                this.personalView = null;
            } else {
                this.personalView = str7;
            }
            if ((i12 & 128) == 0) {
                this.result = null;
            } else {
                this.result = str8;
            }
            if ((i12 & 256) == 0) {
                this.errorDescription = null;
            } else {
                this.errorDescription = str9;
            }
            if ((i12 & 512) == 0) {
                this.eventCategory = null;
            } else {
                this.eventCategory = str10;
            }
            if ((i12 & 1024) == 0) {
                this.f19550a = "SberID Login Auth Result";
            } else {
                this.f19550a = str11;
            }
        }

        @X41.n
        public static final void d(c cVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            if (dVar.u() || cVar.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 0, V0.f412822a, cVar.sdkVersion);
            }
            if (dVar.u() || cVar.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 1, V0.f412822a, cVar.clientId);
            }
            if (dVar.u() || cVar.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 2, V0.f412822a, cVar.partnerName);
            }
            if (dVar.u() || cVar.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, cVar.logUid);
            }
            if (dVar.u() || cVar.authApp != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, cVar.authApp);
            }
            if (dVar.u() || cVar.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, cVar.channel);
            }
            if (dVar.u() || cVar.personalView != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, cVar.personalView);
            }
            if (dVar.u() || cVar.result != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, cVar.result);
            }
            if (dVar.u() || cVar.errorDescription != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, cVar.errorDescription);
            }
            dVar.p(pluginGeneratedSerialDescriptor, 9, V0.f412822a, cVar.eventCategory);
            boolean zU2 = dVar.u();
            String str = cVar.f19550a;
            if (!zU2 && L.f(str, "SberID Login Auth Result")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 10, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19550a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.sdkVersion, cVar.sdkVersion) && L.f(this.clientId, cVar.clientId) && L.f(this.partnerName, cVar.partnerName) && L.f(this.logUid, cVar.logUid) && L.f(this.authApp, cVar.authApp) && L.f(this.channel, cVar.channel) && L.f(this.personalView, cVar.personalView) && L.f(this.result, cVar.result) && L.f(this.errorDescription, cVar.errorDescription) && L.f(this.eventCategory, cVar.eventCategory);
        }

        public final int hashCode() {
            String str = this.sdkVersion;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.clientId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.logUid;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.authApp;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.channel;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.personalView;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.result;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.errorDescription;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.eventCategory;
            return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.sdkVersion;
            String str2 = this.clientId;
            String str3 = this.partnerName;
            String str4 = this.logUid;
            String str5 = this.authApp;
            String str6 = this.channel;
            String str7 = this.personalView;
            String str8 = this.result;
            String str9 = this.errorDescription;
            String str10 = this.eventCategory;
            StringBuilder sbB = C23088b.b("AuthResult(sdkVersion=", str, ", clientId=", str2, ", partnerName=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", logUid=", str4, ", authApp=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", channel=", str6, ", personalView=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str7, ", result=", str8, ", errorDescription=");
            return G.h(sbB, str9, ", eventCategory=", str10, ")");
        }

        public c(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10) {
            this.sdkVersion = str;
            this.clientId = str2;
            this.partnerName = str3;
            this.logUid = str4;
            this.authApp = str5;
            this.channel = str6;
            this.personalView = str7;
            this.result = str8;
            this.errorDescription = str9;
            this.eventCategory = str10;
            this.f19550a = "SberID Login Auth Result";
        }

        public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : str9, (i12 & 512) == 0 ? str10 : null);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB\u009d\u0001\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001e\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u0012\u0004\b!\u0010\u0019\u001a\u0004\b \u0010\u0017R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u0012\u0004\b#\u0010\u0019\u001a\u0004\b\"\u0010\u0017R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u0012\u0004\b%\u0010\u0019\u001a\u0004\b$\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u0012\u0004\b'\u0010\u0019\u001a\u0004\b&\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u0012\u0004\b(\u0010\u0019\u001a\u0004\b\u000b\u0010\u0017R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b*\u0010\u0019\u001a\u0004\b)\u0010\u0017¨\u0006."}, d2 = {"LYb1/a$l;", "LYb1/a;", "", "sdkVersion", "clientId", "partnerName", "logUid", "authApp", "channel", "authService", "successAuth", "isUserNew", "eventCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getSdkVersion", "()Ljava/lang/String;", "getSdkVersion$annotations", "()V", "getClientId", "getClientId$annotations", "getPartnerName", "getPartnerName$annotations", "getLogUid", "getLogUid$annotations", "getAuthApp", "getAuthApp$annotations", "getChannel", "getChannel$annotations", "getAuthService", "getAuthService$annotations", "getSuccessAuth", "getSuccessAuth$annotations", "isUserNew$annotations", "getEventCategory", "getEventCategory$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class l implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19572a;

        @com.google.gson.annotations.c("authApp")
        @Y61.l
        private final String authApp;

        @com.google.gson.annotations.c("authService")
        @Y61.l
        private final String authService;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("isUserNew")
        @Y61.l
        private final String isUserNew;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @com.google.gson.annotations.c("successAuth")
        @Y61.l
        private final String successAuth;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.OtherAuth.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$l;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$l$a, reason: collision with other inner class name */
        public static final class C1393a implements N<l> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1393a f19573a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19574b;

            static {
                C1393a c1393a = new C1393a();
                f19573a = c1393a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.OtherAuth", c1393a, 11);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("authApp", true);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("authService", true);
                pluginGeneratedSerialDescriptor.j("successAuth", true);
                pluginGeneratedSerialDescriptor.j("isUserNew", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19574b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19574b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String strS = null;
                boolean z12 = true;
                int i12 = 0;
                while (z12) {
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 0, V0.f412822a, str2);
                            i12 |= 1;
                            break;
                        case 1:
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 1, V0.f412822a, str3);
                            i12 |= 2;
                            break;
                        case 2:
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 2, V0.f412822a, str4);
                            i12 |= 4;
                            break;
                        case 3:
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str5);
                            i12 |= 8;
                            break;
                        case 4:
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str6);
                            i12 |= 16;
                            break;
                        case 5:
                            str7 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str7);
                            i12 |= 32;
                            break;
                        case 6:
                            str8 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str8);
                            i12 |= 64;
                            break;
                        case 7:
                            str9 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str9);
                            i12 |= 128;
                            break;
                        case 8:
                            str10 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str10);
                            i12 |= 256;
                            break;
                        case 9:
                            str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 9, V0.f412822a, str);
                            i12 |= 512;
                            break;
                        case 10:
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 10);
                            i12 |= 1024;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new l(i12, str2, str3, str4, str5, str6, str7, str8, str9, str10, str, strS, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19574b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19574b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                l.d((l) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$l$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$l;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$l$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<l> serializer() {
                return C1393a.f19573a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public /* synthetic */ l(int i12, @v String str, @v String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v String str9, @v @EncodeDefault String str10, String str11, kotlinx.serialization.internal.P0 p02) {
            if ((i12 & 1) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str;
            }
            if ((i12 & 2) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str2;
            }
            if ((i12 & 4) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str3;
            }
            if ((i12 & 8) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str4;
            }
            if ((i12 & 16) == 0) {
                this.authApp = null;
            } else {
                this.authApp = str5;
            }
            if ((i12 & 32) == 0) {
                this.channel = null;
            } else {
                this.channel = str6;
            }
            if ((i12 & 64) == 0) {
                this.authService = null;
            } else {
                this.authService = str7;
            }
            if ((i12 & 128) == 0) {
                this.successAuth = null;
            } else {
                this.successAuth = str8;
            }
            if ((i12 & 256) == 0) {
                this.isUserNew = null;
            } else {
                this.isUserNew = str9;
            }
            if ((i12 & 512) == 0) {
                this.eventCategory = null;
            } else {
                this.eventCategory = str10;
            }
            if ((i12 & 1024) == 0) {
                this.f19572a = "Other Authorization";
            } else {
                this.f19572a = str11;
            }
        }

        @X41.n
        public static final void d(l lVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            if (dVar.u() || lVar.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 0, V0.f412822a, lVar.sdkVersion);
            }
            if (dVar.u() || lVar.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 1, V0.f412822a, lVar.clientId);
            }
            if (dVar.u() || lVar.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 2, V0.f412822a, lVar.partnerName);
            }
            if (dVar.u() || lVar.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, lVar.logUid);
            }
            if (dVar.u() || lVar.authApp != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, lVar.authApp);
            }
            if (dVar.u() || lVar.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, lVar.channel);
            }
            if (dVar.u() || lVar.authService != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, lVar.authService);
            }
            if (dVar.u() || lVar.successAuth != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, lVar.successAuth);
            }
            if (dVar.u() || lVar.isUserNew != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, lVar.isUserNew);
            }
            dVar.p(pluginGeneratedSerialDescriptor, 9, V0.f412822a, lVar.eventCategory);
            boolean zU2 = dVar.u();
            String str = lVar.f19572a;
            if (!zU2 && L.f(str, "Other Authorization")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 10, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19572a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.sdkVersion, lVar.sdkVersion) && L.f(this.clientId, lVar.clientId) && L.f(this.partnerName, lVar.partnerName) && L.f(this.logUid, lVar.logUid) && L.f(this.authApp, lVar.authApp) && L.f(this.channel, lVar.channel) && L.f(this.authService, lVar.authService) && L.f(this.successAuth, lVar.successAuth) && L.f(this.isUserNew, lVar.isUserNew) && L.f(this.eventCategory, lVar.eventCategory);
        }

        public final int hashCode() {
            String str = this.sdkVersion;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.clientId;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.logUid;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.authApp;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.channel;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.authService;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.successAuth;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.isUserNew;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.eventCategory;
            return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.sdkVersion;
            String str2 = this.clientId;
            String str3 = this.partnerName;
            String str4 = this.logUid;
            String str5 = this.authApp;
            String str6 = this.channel;
            String str7 = this.authService;
            String str8 = this.successAuth;
            String str9 = this.isUserNew;
            String str10 = this.eventCategory;
            StringBuilder sbB = C23088b.b("OtherAuth(sdkVersion=", str, ", clientId=", str2, ", partnerName=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", logUid=", str4, ", authApp=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", channel=", str6, ", authService=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str7, ", successAuth=", str8, ", isUserNew=");
            return G.h(sbB, str9, ", eventCategory=", str10, ")");
        }

        public l(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10) {
            this.sdkVersion = str;
            this.clientId = str2;
            this.partnerName = str3;
            this.logUid = str4;
            this.authApp = str5;
            this.channel = str6;
            this.authService = str7;
            this.successAuth = str8;
            this.isUserNew = str9;
            this.eventCategory = str10;
            this.f19572a = "Other Authorization";
        }

        public /* synthetic */ l(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : str9, (i12 & 512) == 0 ? str10 : null);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB\u0091\u0001\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b!\u0010\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u0012\u0004\b$\u0010\u0018\u001a\u0004\b#\u0010\u0016R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u0012\u0004\b&\u0010\u0018\u001a\u0004\b%\u0010\u0016R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u0012\u0004\b(\u0010\u0018\u001a\u0004\b'\u0010\u0016¨\u0006,"}, d2 = {"LYb1/a$a;", "LYb1/a;", "", "authType", "typeFront", "eventType", "channel", "logUid", "partnerName", "sdkVersion", "clientId", "eventCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "getAuthType$annotations", "()V", "getTypeFront", "getTypeFront$annotations", "getEventType", "getEventType$annotations", "getChannel", "getChannel$annotations", "getLogUid", "getLogUid$annotations", "getPartnerName", "getPartnerName$annotations", "getSdkVersion", "getSdkVersion$annotations", "getClientId", "getClientId$annotations", "getEventCategory", "getEventCategory$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    /* renamed from: Yb1.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1382a implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19544a;

        @com.google.gson.annotations.c("auth_type")
        @Y61.k
        private final String authType;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("event_type")
        @Y61.k
        private final String eventType;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @com.google.gson.annotations.c("type_front")
        @Y61.k
        private final String typeFront;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.AdaptiveEvent.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$a;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$a$a, reason: collision with other inner class name */
        public static final class C1383a implements N<C1382a> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1383a f19545a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19546b;

            static {
                C1383a c1383a = new C1383a();
                f19545a = c1383a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.AdaptiveEvent", c1383a, 10);
                pluginGeneratedSerialDescriptor.j("auth_type", true);
                pluginGeneratedSerialDescriptor.j("type_front", true);
                pluginGeneratedSerialDescriptor.j("event_type", false);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19546b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{v02, v02, v02, L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19546b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String strS = null;
                String strS2 = null;
                String strS3 = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String strS4 = null;
                int i12 = 0;
                boolean z12 = true;
                while (z12) {
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                            i12 |= 1;
                            break;
                        case 1:
                            strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                            i12 |= 2;
                            break;
                        case 2:
                            strS3 = cVarC.s(pluginGeneratedSerialDescriptor, 2);
                            i12 |= 4;
                            break;
                        case 3:
                            str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str);
                            i12 |= 8;
                            break;
                        case 4:
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str2);
                            i12 |= 16;
                            break;
                        case 5:
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str3);
                            i12 |= 32;
                            break;
                        case 6:
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str4);
                            i12 |= 64;
                            break;
                        case 7:
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str5);
                            i12 |= 128;
                            break;
                        case 8:
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str6);
                            i12 |= 256;
                            break;
                        case 9:
                            strS4 = cVarC.s(pluginGeneratedSerialDescriptor, 9);
                            i12 |= 512;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new C1382a(i12, strS, strS2, strS3, str, str2, str3, str4, str5, str6, strS4, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19546b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19546b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                C1382a.d((C1382a) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$a$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$a;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$a$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<C1382a> serializer() {
                return C1383a.f19545a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public C1382a(int i12, @v @EncodeDefault String str, @v @EncodeDefault String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v @EncodeDefault String str9, String str10, kotlinx.serialization.internal.P0 p02) {
            if (4 != (i12 & 4)) {
                C1383a.f19545a.getClass();
                E0.b(i12, 4, C1383a.f19546b);
                throw null;
            }
            this.authType = (i12 & 1) == 0 ? "sberID" : str;
            if ((i12 & 2) == 0) {
                this.typeFront = "app";
            } else {
                this.typeFront = str2;
            }
            this.eventType = str3;
            if ((i12 & 8) == 0) {
                this.channel = null;
            } else {
                this.channel = str4;
            }
            if ((i12 & 16) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str5;
            }
            if ((i12 & 32) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str6;
            }
            if ((i12 & 64) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str7;
            }
            if ((i12 & 128) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str8;
            }
            if ((i12 & 256) == 0) {
                this.eventCategory = "ELK";
            } else {
                this.eventCategory = str9;
            }
            if ((i12 & 512) == 0) {
                this.f19544a = "SID_ELK_Adaptive";
            } else {
                this.f19544a = str10;
            }
        }

        @X41.n
        public static final void d(C1382a c1382a, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            dVar.l(pluginGeneratedSerialDescriptor, 0, c1382a.authType);
            dVar.l(pluginGeneratedSerialDescriptor, 1, c1382a.typeFront);
            dVar.l(pluginGeneratedSerialDescriptor, 2, c1382a.eventType);
            if (dVar.u() || c1382a.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, c1382a.channel);
            }
            if (dVar.u() || c1382a.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, c1382a.logUid);
            }
            if (dVar.u() || c1382a.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, c1382a.partnerName);
            }
            if (dVar.u() || c1382a.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, c1382a.sdkVersion);
            }
            if (dVar.u() || c1382a.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, c1382a.clientId);
            }
            dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, c1382a.eventCategory);
            boolean zU2 = dVar.u();
            String str = c1382a.f19544a;
            if (!zU2 && L.f(str, "SID_ELK_Adaptive")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 9, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19544a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1382a)) {
                return false;
            }
            C1382a c1382a = (C1382a) obj;
            return L.f(this.authType, c1382a.authType) && L.f(this.typeFront, c1382a.typeFront) && L.f(this.eventType, c1382a.eventType) && L.f(this.channel, c1382a.channel) && L.f(this.logUid, c1382a.logUid) && L.f(this.partnerName, c1382a.partnerName) && L.f(this.sdkVersion, c1382a.sdkVersion) && L.f(this.clientId, c1382a.clientId) && L.f(this.eventCategory, c1382a.eventCategory);
        }

        public final int hashCode() {
            int iA2 = AbstractC47961a.a(this.eventType, AbstractC47961a.a(this.typeFront, this.authType.hashCode() * 31));
            String str = this.channel;
            int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logUid;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sdkVersion;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.clientId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.eventCategory;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.authType;
            String str2 = this.typeFront;
            String str3 = this.eventType;
            String str4 = this.channel;
            String str5 = this.logUid;
            String str6 = this.partnerName;
            String str7 = this.sdkVersion;
            String str8 = this.clientId;
            String str9 = this.eventCategory;
            StringBuilder sbB = C23088b.b("AdaptiveEvent(authType=", str, ", typeFront=", str2, ", eventType=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", channel=", str4, ", logUid=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", partnerName=", str6, ", sdkVersion=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str7, ", clientId=", str8, ", eventCategory=");
            return AK.c.s(sbB, str9, ")");
        }

        public C1382a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9) {
            this.authType = str;
            this.typeFront = str2;
            this.eventType = str3;
            this.channel = str4;
            this.logUid = str5;
            this.partnerName = str6;
            this.sdkVersion = str7;
            this.clientId = str8;
            this.eventCategory = str9;
            this.f19544a = "SID_ELK_Adaptive";
        }

        public /* synthetic */ C1382a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "sberID" : str, (i12 & 2) != 0 ? "app" : str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? "ELK" : str9);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB\u0091\u0001\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b!\u0010\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u0012\u0004\b$\u0010\u0018\u001a\u0004\b#\u0010\u0016R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u0012\u0004\b&\u0010\u0018\u001a\u0004\b%\u0010\u0016R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u0012\u0004\b(\u0010\u0018\u001a\u0004\b'\u0010\u0016¨\u0006,"}, d2 = {"LYb1/a$i;", "LYb1/a;", "", "authType", "typeFront", "eventType", "channel", "logUid", "partnerName", "sdkVersion", "clientId", "eventCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "getAuthType$annotations", "()V", "getTypeFront", "getTypeFront$annotations", "getEventType", "getEventType$annotations", "getChannel", "getChannel$annotations", "getLogUid", "getLogUid$annotations", "getPartnerName", "getPartnerName$annotations", "getSdkVersion", "getSdkVersion$annotations", "getClientId", "getClientId$annotations", "getEventCategory", "getEventCategory$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class i implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19563a;

        @com.google.gson.annotations.c("auth_type")
        @Y61.k
        private final String authType;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("event_type")
        @Y61.k
        private final String eventType;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @com.google.gson.annotations.c("type_front")
        @Y61.k
        private final String typeFront;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.ErrorEvent.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$i;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$i$a, reason: collision with other inner class name */
        public static final class C1390a implements N<i> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1390a f19564a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19565b;

            static {
                C1390a c1390a = new C1390a();
                f19564a = c1390a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.ErrorEvent", c1390a, 10);
                pluginGeneratedSerialDescriptor.j("auth_type", true);
                pluginGeneratedSerialDescriptor.j("type_front", true);
                pluginGeneratedSerialDescriptor.j("event_type", false);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19565b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{v02, v02, v02, L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19565b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String strS = null;
                String strS2 = null;
                String strS3 = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String strS4 = null;
                int i12 = 0;
                boolean z12 = true;
                while (z12) {
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                            i12 |= 1;
                            break;
                        case 1:
                            strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                            i12 |= 2;
                            break;
                        case 2:
                            strS3 = cVarC.s(pluginGeneratedSerialDescriptor, 2);
                            i12 |= 4;
                            break;
                        case 3:
                            str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str);
                            i12 |= 8;
                            break;
                        case 4:
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str2);
                            i12 |= 16;
                            break;
                        case 5:
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str3);
                            i12 |= 32;
                            break;
                        case 6:
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str4);
                            i12 |= 64;
                            break;
                        case 7:
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str5);
                            i12 |= 128;
                            break;
                        case 8:
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str6);
                            i12 |= 256;
                            break;
                        case 9:
                            strS4 = cVarC.s(pluginGeneratedSerialDescriptor, 9);
                            i12 |= 512;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new i(i12, strS, strS2, strS3, str, str2, str3, str4, str5, str6, strS4, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19565b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19565b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                i.d((i) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$i$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$i;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$i$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<i> serializer() {
                return C1390a.f19564a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public i(int i12, @v @EncodeDefault String str, @v @EncodeDefault String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v @EncodeDefault String str9, String str10, kotlinx.serialization.internal.P0 p02) {
            if (4 != (i12 & 4)) {
                C1390a.f19564a.getClass();
                E0.b(i12, 4, C1390a.f19565b);
                throw null;
            }
            this.authType = (i12 & 1) == 0 ? "sberID" : str;
            if ((i12 & 2) == 0) {
                this.typeFront = "app";
            } else {
                this.typeFront = str2;
            }
            this.eventType = str3;
            if ((i12 & 8) == 0) {
                this.channel = null;
            } else {
                this.channel = str4;
            }
            if ((i12 & 16) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str5;
            }
            if ((i12 & 32) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str6;
            }
            if ((i12 & 64) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str7;
            }
            if ((i12 & 128) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str8;
            }
            if ((i12 & 256) == 0) {
                this.eventCategory = "ELK";
            } else {
                this.eventCategory = str9;
            }
            if ((i12 & 512) == 0) {
                this.f19563a = "SID_Error screen";
            } else {
                this.f19563a = str10;
            }
        }

        @X41.n
        public static final void d(i iVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            dVar.l(pluginGeneratedSerialDescriptor, 0, iVar.authType);
            dVar.l(pluginGeneratedSerialDescriptor, 1, iVar.typeFront);
            dVar.l(pluginGeneratedSerialDescriptor, 2, iVar.eventType);
            if (dVar.u() || iVar.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, iVar.channel);
            }
            if (dVar.u() || iVar.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, iVar.logUid);
            }
            if (dVar.u() || iVar.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, iVar.partnerName);
            }
            if (dVar.u() || iVar.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, iVar.sdkVersion);
            }
            if (dVar.u() || iVar.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, iVar.clientId);
            }
            dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, iVar.eventCategory);
            boolean zU2 = dVar.u();
            String str = iVar.f19563a;
            if (!zU2 && L.f(str, "SID_Error screen")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 9, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19563a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.authType, iVar.authType) && L.f(this.typeFront, iVar.typeFront) && L.f(this.eventType, iVar.eventType) && L.f(this.channel, iVar.channel) && L.f(this.logUid, iVar.logUid) && L.f(this.partnerName, iVar.partnerName) && L.f(this.sdkVersion, iVar.sdkVersion) && L.f(this.clientId, iVar.clientId) && L.f(this.eventCategory, iVar.eventCategory);
        }

        public final int hashCode() {
            int iA2 = AbstractC47961a.a(this.eventType, AbstractC47961a.a(this.typeFront, this.authType.hashCode() * 31));
            String str = this.channel;
            int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logUid;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sdkVersion;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.clientId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.eventCategory;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.authType;
            String str2 = this.typeFront;
            String str3 = this.eventType;
            String str4 = this.channel;
            String str5 = this.logUid;
            String str6 = this.partnerName;
            String str7 = this.sdkVersion;
            String str8 = this.clientId;
            String str9 = this.eventCategory;
            StringBuilder sbB = C23088b.b("ErrorEvent(authType=", str, ", typeFront=", str2, ", eventType=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", channel=", str4, ", logUid=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", partnerName=", str6, ", sdkVersion=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str7, ", clientId=", str8, ", eventCategory=");
            return AK.c.s(sbB, str9, ")");
        }

        public i(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9) {
            this.authType = str;
            this.typeFront = str2;
            this.eventType = str3;
            this.channel = str4;
            this.logUid = str5;
            this.partnerName = str6;
            this.sdkVersion = str7;
            this.clientId = str8;
            this.eventCategory = str9;
            this.f19563a = "SID_Error screen";
        }

        public /* synthetic */ i(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "sberID" : str, (i12 & 2) != 0 ? "app" : str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? "ELK" : str9);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB\u0091\u0001\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b!\u0010\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u0012\u0004\b$\u0010\u0018\u001a\u0004\b#\u0010\u0016R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u0012\u0004\b&\u0010\u0018\u001a\u0004\b%\u0010\u0016R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u0012\u0004\b(\u0010\u0018\u001a\u0004\b'\u0010\u0016¨\u0006,"}, d2 = {"LYb1/a$m;", "LYb1/a;", "", "authType", "typeFront", "eventType", "channel", "logUid", "partnerName", "sdkVersion", "clientId", "eventCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "getAuthType$annotations", "()V", "getTypeFront", "getTypeFront$annotations", "getEventType", "getEventType$annotations", "getChannel", "getChannel$annotations", "getLogUid", "getLogUid$annotations", "getPartnerName", "getPartnerName$annotations", "getSdkVersion", "getSdkVersion$annotations", "getClientId", "getClientId$annotations", "getEventCategory", "getEventCategory$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class m implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19575a;

        @com.google.gson.annotations.c("auth_type")
        @Y61.k
        private final String authType;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("event_type")
        @Y61.k
        private final String eventType;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @com.google.gson.annotations.c("type_front")
        @Y61.k
        private final String typeFront;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.PopupErrorEvent.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$m;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$m$a, reason: collision with other inner class name */
        public static final class C1394a implements N<m> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1394a f19576a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19577b;

            static {
                C1394a c1394a = new C1394a();
                f19576a = c1394a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.PopupErrorEvent", c1394a, 10);
                pluginGeneratedSerialDescriptor.j("auth_type", true);
                pluginGeneratedSerialDescriptor.j("type_front", true);
                pluginGeneratedSerialDescriptor.j("event_type", false);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19577b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{v02, v02, v02, L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19577b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String strS = null;
                String strS2 = null;
                String strS3 = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String strS4 = null;
                int i12 = 0;
                boolean z12 = true;
                while (z12) {
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                            i12 |= 1;
                            break;
                        case 1:
                            strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                            i12 |= 2;
                            break;
                        case 2:
                            strS3 = cVarC.s(pluginGeneratedSerialDescriptor, 2);
                            i12 |= 4;
                            break;
                        case 3:
                            str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str);
                            i12 |= 8;
                            break;
                        case 4:
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str2);
                            i12 |= 16;
                            break;
                        case 5:
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str3);
                            i12 |= 32;
                            break;
                        case 6:
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str4);
                            i12 |= 64;
                            break;
                        case 7:
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str5);
                            i12 |= 128;
                            break;
                        case 8:
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str6);
                            i12 |= 256;
                            break;
                        case 9:
                            strS4 = cVarC.s(pluginGeneratedSerialDescriptor, 9);
                            i12 |= 512;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new m(i12, strS, strS2, strS3, str, str2, str3, str4, str5, str6, strS4, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19577b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19577b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                m.d((m) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$m$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$m;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$m$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<m> serializer() {
                return C1394a.f19576a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public m(int i12, @v @EncodeDefault String str, @v @EncodeDefault String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v @EncodeDefault String str9, String str10, kotlinx.serialization.internal.P0 p02) {
            if (4 != (i12 & 4)) {
                C1394a.f19576a.getClass();
                E0.b(i12, 4, C1394a.f19577b);
                throw null;
            }
            this.authType = (i12 & 1) == 0 ? "sberID" : str;
            if ((i12 & 2) == 0) {
                this.typeFront = "app";
            } else {
                this.typeFront = str2;
            }
            this.eventType = str3;
            if ((i12 & 8) == 0) {
                this.channel = null;
            } else {
                this.channel = str4;
            }
            if ((i12 & 16) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str5;
            }
            if ((i12 & 32) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str6;
            }
            if ((i12 & 64) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str7;
            }
            if ((i12 & 128) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str8;
            }
            if ((i12 & 256) == 0) {
                this.eventCategory = "ELK";
            } else {
                this.eventCategory = str9;
            }
            if ((i12 & 512) == 0) {
                this.f19575a = "SID_ELK_Popup Error";
            } else {
                this.f19575a = str10;
            }
        }

        @X41.n
        public static final void d(m mVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            dVar.l(pluginGeneratedSerialDescriptor, 0, mVar.authType);
            dVar.l(pluginGeneratedSerialDescriptor, 1, mVar.typeFront);
            dVar.l(pluginGeneratedSerialDescriptor, 2, mVar.eventType);
            if (dVar.u() || mVar.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, mVar.channel);
            }
            if (dVar.u() || mVar.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, mVar.logUid);
            }
            if (dVar.u() || mVar.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, mVar.partnerName);
            }
            if (dVar.u() || mVar.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, mVar.sdkVersion);
            }
            if (dVar.u() || mVar.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, mVar.clientId);
            }
            dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, mVar.eventCategory);
            boolean zU2 = dVar.u();
            String str = mVar.f19575a;
            if (!zU2 && L.f(str, "SID_ELK_Popup Error")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 9, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19575a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return L.f(this.authType, mVar.authType) && L.f(this.typeFront, mVar.typeFront) && L.f(this.eventType, mVar.eventType) && L.f(this.channel, mVar.channel) && L.f(this.logUid, mVar.logUid) && L.f(this.partnerName, mVar.partnerName) && L.f(this.sdkVersion, mVar.sdkVersion) && L.f(this.clientId, mVar.clientId) && L.f(this.eventCategory, mVar.eventCategory);
        }

        public final int hashCode() {
            int iA2 = AbstractC47961a.a(this.eventType, AbstractC47961a.a(this.typeFront, this.authType.hashCode() * 31));
            String str = this.channel;
            int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logUid;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sdkVersion;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.clientId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.eventCategory;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.authType;
            String str2 = this.typeFront;
            String str3 = this.eventType;
            String str4 = this.channel;
            String str5 = this.logUid;
            String str6 = this.partnerName;
            String str7 = this.sdkVersion;
            String str8 = this.clientId;
            String str9 = this.eventCategory;
            StringBuilder sbB = C23088b.b("PopupErrorEvent(authType=", str, ", typeFront=", str2, ", eventType=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", channel=", str4, ", logUid=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", partnerName=", str6, ", sdkVersion=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str7, ", clientId=", str8, ", eventCategory=");
            return AK.c.s(sbB, str9, ")");
        }

        public m(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9) {
            this.authType = str;
            this.typeFront = str2;
            this.eventType = str3;
            this.channel = str4;
            this.logUid = str5;
            this.partnerName = str6;
            this.sdkVersion = str7;
            this.clientId = str8;
            this.eventCategory = str9;
            this.f19575a = "SID_ELK_Popup Error";
        }

        public /* synthetic */ m(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "sberID" : str, (i12 & 2) != 0 ? "app" : str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? "ELK" : str9);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*+Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rB\u0091\u0001\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0013R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u0012\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0019\u0010\u0016R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u0012\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001b\u0010\u0016R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0014\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001d\u0010\u0016R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u0012\u0004\b \u0010\u0018\u001a\u0004\b\u001f\u0010\u0016R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0014\u0012\u0004\b\"\u0010\u0018\u001a\u0004\b!\u0010\u0016R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u0012\u0004\b$\u0010\u0018\u001a\u0004\b#\u0010\u0016R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u0012\u0004\b&\u0010\u0018\u001a\u0004\b%\u0010\u0016R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0014\u0012\u0004\b(\u0010\u0018\u001a\u0004\b'\u0010\u0016¨\u0006,"}, d2 = {"LYb1/a$o;", "LYb1/a;", "", "authType", "typeFront", "eventType", "channel", "logUid", "partnerName", "sdkVersion", "clientId", "eventCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "getAuthType$annotations", "()V", "getTypeFront", "getTypeFront$annotations", "getEventType", "getEventType$annotations", "getChannel", "getChannel$annotations", "getLogUid", "getLogUid$annotations", "getPartnerName", "getPartnerName$annotations", "getSdkVersion", "getSdkVersion$annotations", "getClientId", "getClientId$annotations", "getEventCategory", "getEventCategory$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class o implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19581a;

        @com.google.gson.annotations.c("auth_type")
        @Y61.k
        private final String authType;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("event_type")
        @Y61.k
        private final String eventType;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @com.google.gson.annotations.c("type_front")
        @Y61.k
        private final String typeFront;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.ProfileShow.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$o;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$o$a, reason: collision with other inner class name */
        public static final class C1396a implements N<o> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1396a f19582a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19583b;

            static {
                C1396a c1396a = new C1396a();
                f19582a = c1396a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.ProfileShow", c1396a, 10);
                pluginGeneratedSerialDescriptor.j("auth_type", true);
                pluginGeneratedSerialDescriptor.j("type_front", true);
                pluginGeneratedSerialDescriptor.j("event_type", false);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19583b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{v02, v02, v02, L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19583b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String strS = null;
                String strS2 = null;
                String strS3 = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String strS4 = null;
                int i12 = 0;
                boolean z12 = true;
                while (z12) {
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                            i12 |= 1;
                            break;
                        case 1:
                            strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                            i12 |= 2;
                            break;
                        case 2:
                            strS3 = cVarC.s(pluginGeneratedSerialDescriptor, 2);
                            i12 |= 4;
                            break;
                        case 3:
                            str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str);
                            i12 |= 8;
                            break;
                        case 4:
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str2);
                            i12 |= 16;
                            break;
                        case 5:
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str3);
                            i12 |= 32;
                            break;
                        case 6:
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str4);
                            i12 |= 64;
                            break;
                        case 7:
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str5);
                            i12 |= 128;
                            break;
                        case 8:
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str6);
                            i12 |= 256;
                            break;
                        case 9:
                            strS4 = cVarC.s(pluginGeneratedSerialDescriptor, 9);
                            i12 |= 512;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new o(i12, strS, strS2, strS3, str, str2, str3, str4, str5, str6, strS4, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19583b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19583b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                o.d((o) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$o$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$o;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$o$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<o> serializer() {
                return C1396a.f19582a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public o(int i12, @v @EncodeDefault String str, @v @EncodeDefault String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v @EncodeDefault String str9, String str10, kotlinx.serialization.internal.P0 p02) {
            if (4 != (i12 & 4)) {
                C1396a.f19582a.getClass();
                E0.b(i12, 4, C1396a.f19583b);
                throw null;
            }
            this.authType = (i12 & 1) == 0 ? "sberID" : str;
            if ((i12 & 2) == 0) {
                this.typeFront = "app";
            } else {
                this.typeFront = str2;
            }
            this.eventType = str3;
            if ((i12 & 8) == 0) {
                this.channel = null;
            } else {
                this.channel = str4;
            }
            if ((i12 & 16) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str5;
            }
            if ((i12 & 32) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str6;
            }
            if ((i12 & 64) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str7;
            }
            if ((i12 & 128) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str8;
            }
            if ((i12 & 256) == 0) {
                this.eventCategory = "ELK";
            } else {
                this.eventCategory = str9;
            }
            if ((i12 & 512) == 0) {
                this.f19581a = "SID_ELK_Profile screen";
            } else {
                this.f19581a = str10;
            }
        }

        @X41.n
        public static final void d(o oVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            dVar.l(pluginGeneratedSerialDescriptor, 0, oVar.authType);
            dVar.l(pluginGeneratedSerialDescriptor, 1, oVar.typeFront);
            dVar.l(pluginGeneratedSerialDescriptor, 2, oVar.eventType);
            if (dVar.u() || oVar.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, oVar.channel);
            }
            if (dVar.u() || oVar.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, oVar.logUid);
            }
            if (dVar.u() || oVar.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, oVar.partnerName);
            }
            if (dVar.u() || oVar.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, oVar.sdkVersion);
            }
            if (dVar.u() || oVar.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, oVar.clientId);
            }
            dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, oVar.eventCategory);
            boolean zU2 = dVar.u();
            String str = oVar.f19581a;
            if (!zU2 && L.f(str, "SID_ELK_Profile screen")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 9, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19581a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return L.f(this.authType, oVar.authType) && L.f(this.typeFront, oVar.typeFront) && L.f(this.eventType, oVar.eventType) && L.f(this.channel, oVar.channel) && L.f(this.logUid, oVar.logUid) && L.f(this.partnerName, oVar.partnerName) && L.f(this.sdkVersion, oVar.sdkVersion) && L.f(this.clientId, oVar.clientId) && L.f(this.eventCategory, oVar.eventCategory);
        }

        public final int hashCode() {
            int iA2 = AbstractC47961a.a(this.eventType, AbstractC47961a.a(this.typeFront, this.authType.hashCode() * 31));
            String str = this.channel;
            int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logUid;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sdkVersion;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.clientId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.eventCategory;
            return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.authType;
            String str2 = this.typeFront;
            String str3 = this.eventType;
            String str4 = this.channel;
            String str5 = this.logUid;
            String str6 = this.partnerName;
            String str7 = this.sdkVersion;
            String str8 = this.clientId;
            String str9 = this.eventCategory;
            StringBuilder sbB = C23088b.b("ProfileShow(authType=", str, ", typeFront=", str2, ", eventType=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", channel=", str4, ", logUid=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", partnerName=", str6, ", sdkVersion=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str7, ", clientId=", str8, ", eventCategory=");
            return AK.c.s(sbB, str9, ")");
        }

        public o(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9) {
            this.authType = str;
            this.typeFront = str2;
            this.eventType = str3;
            this.channel = str4;
            this.logUid = str5;
            this.partnerName = str6;
            this.sdkVersion = str7;
            this.clientId = str8;
            this.eventCategory = str9;
            this.f19581a = "SID_ELK_Profile screen";
        }

        public /* synthetic */ o(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "sberID" : str, (i12 & 2) != 0 ? "app" : str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? "ELK" : str9);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB\u009d\u0001\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001e\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u0012\u0004\b!\u0010\u0019\u001a\u0004\b \u0010\u0017R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u0012\u0004\b#\u0010\u0019\u001a\u0004\b\"\u0010\u0017R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u0012\u0004\b%\u0010\u0019\u001a\u0004\b$\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u0012\u0004\b'\u0010\u0019\u001a\u0004\b&\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u0012\u0004\b)\u0010\u0019\u001a\u0004\b(\u0010\u0017R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b+\u0010\u0019\u001a\u0004\b*\u0010\u0017¨\u0006/"}, d2 = {"LYb1/a$b;", "LYb1/a;", "", "authType", "typeFront", "eventType", "channel", "logUid", "partnerName", "sdkVersion", "clientId", "value", "eventCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "getAuthType$annotations", "()V", "getTypeFront", "getTypeFront$annotations", "getEventType", "getEventType$annotations", "getChannel", "getChannel$annotations", "getLogUid", "getLogUid$annotations", "getPartnerName", "getPartnerName$annotations", "getSdkVersion", "getSdkVersion$annotations", "getClientId", "getClientId$annotations", "getValue", "getValue$annotations", "getEventCategory", "getEventCategory$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class b implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19547a;

        @com.google.gson.annotations.c("auth_type")
        @Y61.k
        private final String authType;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("event_type")
        @Y61.k
        private final String eventType;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @com.google.gson.annotations.c("type_front")
        @Y61.k
        private final String typeFront;

        @com.google.gson.annotations.c("value")
        @Y61.l
        private final String value;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.App2AppDialogModel.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$b;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$b$a, reason: collision with other inner class name */
        public static final class C1384a implements N<b> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1384a f19548a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19549b;

            static {
                C1384a c1384a = new C1384a();
                f19548a = c1384a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.App2AppDialogModel", c1384a, 11);
                pluginGeneratedSerialDescriptor.j("auth_type", true);
                pluginGeneratedSerialDescriptor.j("type_front", true);
                pluginGeneratedSerialDescriptor.j("event_type", false);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("value", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19549b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{v02, v02, v02, L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19549b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String str = null;
                String strS = null;
                String strS2 = null;
                String strS3 = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String strS4 = null;
                boolean z12 = true;
                int i12 = 0;
                while (z12) {
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                            i12 |= 1;
                            break;
                        case 1:
                            strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                            i12 |= 2;
                            break;
                        case 2:
                            strS3 = cVarC.s(pluginGeneratedSerialDescriptor, 2);
                            i12 |= 4;
                            break;
                        case 3:
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str2);
                            i12 |= 8;
                            break;
                        case 4:
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str3);
                            i12 |= 16;
                            break;
                        case 5:
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str4);
                            i12 |= 32;
                            break;
                        case 6:
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str5);
                            i12 |= 64;
                            break;
                        case 7:
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str6);
                            i12 |= 128;
                            break;
                        case 8:
                            str7 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str7);
                            i12 |= 256;
                            break;
                        case 9:
                            str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 9, V0.f412822a, str);
                            i12 |= 512;
                            break;
                        case 10:
                            strS4 = cVarC.s(pluginGeneratedSerialDescriptor, 10);
                            i12 |= 1024;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new b(i12, strS, strS2, strS3, str2, str3, str4, str5, str6, str7, str, strS4, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19549b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19549b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                b.d((b) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$b$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$b;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<b> serializer() {
                return C1384a.f19548a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public b(int i12, @v @EncodeDefault String str, @v @EncodeDefault String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v String str9, @v @EncodeDefault String str10, String str11, kotlinx.serialization.internal.P0 p02) {
            if (4 != (i12 & 4)) {
                C1384a.f19548a.getClass();
                E0.b(i12, 4, C1384a.f19549b);
                throw null;
            }
            this.authType = (i12 & 1) == 0 ? "sberID" : str;
            if ((i12 & 2) == 0) {
                this.typeFront = "app";
            } else {
                this.typeFront = str2;
            }
            this.eventType = str3;
            if ((i12 & 8) == 0) {
                this.channel = null;
            } else {
                this.channel = str4;
            }
            if ((i12 & 16) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str5;
            }
            if ((i12 & 32) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str6;
            }
            if ((i12 & 64) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str7;
            }
            if ((i12 & 128) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str8;
            }
            if ((i12 & 256) == 0) {
                this.value = null;
            } else {
                this.value = str9;
            }
            if ((i12 & 512) == 0) {
                this.eventCategory = "APP2APP";
            } else {
                this.eventCategory = str10;
            }
            if ((i12 & 1024) == 0) {
                this.f19547a = "Sber ID Auth Popup";
            } else {
                this.f19547a = str11;
            }
        }

        @X41.n
        public static final void d(b bVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            dVar.l(pluginGeneratedSerialDescriptor, 0, bVar.authType);
            dVar.l(pluginGeneratedSerialDescriptor, 1, bVar.typeFront);
            dVar.l(pluginGeneratedSerialDescriptor, 2, bVar.eventType);
            if (dVar.u() || bVar.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, bVar.channel);
            }
            if (dVar.u() || bVar.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, bVar.logUid);
            }
            if (dVar.u() || bVar.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, bVar.partnerName);
            }
            if (dVar.u() || bVar.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, bVar.sdkVersion);
            }
            if (dVar.u() || bVar.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, bVar.clientId);
            }
            if (dVar.u() || bVar.value != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, bVar.value);
            }
            dVar.p(pluginGeneratedSerialDescriptor, 9, V0.f412822a, bVar.eventCategory);
            boolean zU2 = dVar.u();
            String str = bVar.f19547a;
            if (!zU2 && L.f(str, "Sber ID Auth Popup")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 10, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19547a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.authType, bVar.authType) && L.f(this.typeFront, bVar.typeFront) && L.f(this.eventType, bVar.eventType) && L.f(this.channel, bVar.channel) && L.f(this.logUid, bVar.logUid) && L.f(this.partnerName, bVar.partnerName) && L.f(this.sdkVersion, bVar.sdkVersion) && L.f(this.clientId, bVar.clientId) && L.f(this.value, bVar.value) && L.f(this.eventCategory, bVar.eventCategory);
        }

        public final int hashCode() {
            int iA2 = AbstractC47961a.a(this.eventType, AbstractC47961a.a(this.typeFront, this.authType.hashCode() * 31));
            String str = this.channel;
            int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logUid;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sdkVersion;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.clientId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.value;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.eventCategory;
            return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.authType;
            String str2 = this.typeFront;
            String str3 = this.eventType;
            String str4 = this.channel;
            String str5 = this.logUid;
            String str6 = this.partnerName;
            String str7 = this.sdkVersion;
            String str8 = this.clientId;
            String str9 = this.value;
            String str10 = this.eventCategory;
            StringBuilder sbB = C23088b.b("App2AppDialogModel(authType=", str, ", typeFront=", str2, ", eventType=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", channel=", str4, ", logUid=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", partnerName=", str6, ", sdkVersion=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str7, ", clientId=", str8, ", value=");
            return G.h(sbB, str9, ", eventCategory=", str10, ")");
        }

        public b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10) {
            this.authType = str;
            this.typeFront = str2;
            this.eventType = str3;
            this.channel = str4;
            this.logUid = str5;
            this.partnerName = str6;
            this.sdkVersion = str7;
            this.clientId = str8;
            this.value = str9;
            this.eventCategory = str10;
            this.f19547a = "Sber ID Auth Popup";
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "sberID" : str, (i12 & 2) != 0 ? "app" : str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : str9, (i12 & 512) != 0 ? "APP2APP" : str10);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-.Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eB\u009d\u0001\b\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0015\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0015\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001e\u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u0012\u0004\b!\u0010\u0019\u001a\u0004\b \u0010\u0017R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u0012\u0004\b#\u0010\u0019\u001a\u0004\b\"\u0010\u0017R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0015\u0012\u0004\b%\u0010\u0019\u001a\u0004\b$\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0015\u0012\u0004\b'\u0010\u0019\u001a\u0004\b&\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u0012\u0004\b)\u0010\u0019\u001a\u0004\b(\u0010\u0017R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0015\u0012\u0004\b+\u0010\u0019\u001a\u0004\b*\u0010\u0017¨\u0006/"}, d2 = {"LYb1/a$n;", "LYb1/a;", "", "authType", "typeFront", "eventType", "channel", "logUid", "partnerName", "sdkVersion", "clientId", "value", "eventCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "getAuthType$annotations", "()V", "getTypeFront", "getTypeFront$annotations", "getEventType", "getEventType$annotations", "getChannel", "getChannel$annotations", "getLogUid", "getLogUid$annotations", "getPartnerName", "getPartnerName$annotations", "getSdkVersion", "getSdkVersion$annotations", "getClientId", "getClientId$annotations", "getValue", "getValue$annotations", "getEventCategory", "getEventCategory$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class n implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19578a;

        @com.google.gson.annotations.c("auth_type")
        @Y61.k
        private final String authType;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("event_type")
        @Y61.k
        private final String eventType;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @com.google.gson.annotations.c("type_front")
        @Y61.k
        private final String typeFront;

        @com.google.gson.annotations.c("value")
        @Y61.l
        private final String value;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.PopupEvent.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$n;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$n$a, reason: collision with other inner class name */
        public static final class C1395a implements N<n> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1395a f19579a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19580b;

            static {
                C1395a c1395a = new C1395a();
                f19579a = c1395a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.PopupEvent", c1395a, 11);
                pluginGeneratedSerialDescriptor.j("auth_type", true);
                pluginGeneratedSerialDescriptor.j("type_front", true);
                pluginGeneratedSerialDescriptor.j("event_type", false);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("value", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19580b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{v02, v02, v02, L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19580b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String str = null;
                String strS = null;
                String strS2 = null;
                String strS3 = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String strS4 = null;
                boolean z12 = true;
                int i12 = 0;
                while (z12) {
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                            i12 |= 1;
                            break;
                        case 1:
                            strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                            i12 |= 2;
                            break;
                        case 2:
                            strS3 = cVarC.s(pluginGeneratedSerialDescriptor, 2);
                            i12 |= 4;
                            break;
                        case 3:
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str2);
                            i12 |= 8;
                            break;
                        case 4:
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str3);
                            i12 |= 16;
                            break;
                        case 5:
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str4);
                            i12 |= 32;
                            break;
                        case 6:
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str5);
                            i12 |= 64;
                            break;
                        case 7:
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str6);
                            i12 |= 128;
                            break;
                        case 8:
                            str7 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str7);
                            i12 |= 256;
                            break;
                        case 9:
                            str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 9, V0.f412822a, str);
                            i12 |= 512;
                            break;
                        case 10:
                            strS4 = cVarC.s(pluginGeneratedSerialDescriptor, 10);
                            i12 |= 1024;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new n(i12, strS, strS2, strS3, str2, str3, str4, str5, str6, str7, str, strS4, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19580b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19580b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                n.d((n) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$n$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$n;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$n$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<n> serializer() {
                return C1395a.f19579a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public n(int i12, @v @EncodeDefault String str, @v @EncodeDefault String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v String str9, @v @EncodeDefault String str10, String str11, kotlinx.serialization.internal.P0 p02) {
            if (4 != (i12 & 4)) {
                C1395a.f19579a.getClass();
                E0.b(i12, 4, C1395a.f19580b);
                throw null;
            }
            this.authType = (i12 & 1) == 0 ? "sberID" : str;
            if ((i12 & 2) == 0) {
                this.typeFront = "app";
            } else {
                this.typeFront = str2;
            }
            this.eventType = str3;
            if ((i12 & 8) == 0) {
                this.channel = null;
            } else {
                this.channel = str4;
            }
            if ((i12 & 16) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str5;
            }
            if ((i12 & 32) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str6;
            }
            if ((i12 & 64) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str7;
            }
            if ((i12 & 128) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str8;
            }
            if ((i12 & 256) == 0) {
                this.value = null;
            } else {
                this.value = str9;
            }
            if ((i12 & 512) == 0) {
                this.eventCategory = "ELK";
            } else {
                this.eventCategory = str10;
            }
            if ((i12 & 1024) == 0) {
                this.f19578a = "SID_ELK_Popup screen";
            } else {
                this.f19578a = str11;
            }
        }

        @X41.n
        public static final void d(n nVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            dVar.l(pluginGeneratedSerialDescriptor, 0, nVar.authType);
            dVar.l(pluginGeneratedSerialDescriptor, 1, nVar.typeFront);
            dVar.l(pluginGeneratedSerialDescriptor, 2, nVar.eventType);
            if (dVar.u() || nVar.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, nVar.channel);
            }
            if (dVar.u() || nVar.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, nVar.logUid);
            }
            if (dVar.u() || nVar.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, nVar.partnerName);
            }
            if (dVar.u() || nVar.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, nVar.sdkVersion);
            }
            if (dVar.u() || nVar.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, nVar.clientId);
            }
            if (dVar.u() || nVar.value != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, nVar.value);
            }
            dVar.p(pluginGeneratedSerialDescriptor, 9, V0.f412822a, nVar.eventCategory);
            boolean zU2 = dVar.u();
            String str = nVar.f19578a;
            if (!zU2 && L.f(str, "SID_ELK_Popup screen")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 10, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19578a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return L.f(this.authType, nVar.authType) && L.f(this.typeFront, nVar.typeFront) && L.f(this.eventType, nVar.eventType) && L.f(this.channel, nVar.channel) && L.f(this.logUid, nVar.logUid) && L.f(this.partnerName, nVar.partnerName) && L.f(this.sdkVersion, nVar.sdkVersion) && L.f(this.clientId, nVar.clientId) && L.f(this.value, nVar.value) && L.f(this.eventCategory, nVar.eventCategory);
        }

        public final int hashCode() {
            int iA2 = AbstractC47961a.a(this.eventType, AbstractC47961a.a(this.typeFront, this.authType.hashCode() * 31));
            String str = this.channel;
            int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logUid;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sdkVersion;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.clientId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.value;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.eventCategory;
            return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.authType;
            String str2 = this.typeFront;
            String str3 = this.eventType;
            String str4 = this.channel;
            String str5 = this.logUid;
            String str6 = this.partnerName;
            String str7 = this.sdkVersion;
            String str8 = this.clientId;
            String str9 = this.value;
            String str10 = this.eventCategory;
            StringBuilder sbB = C23088b.b("PopupEvent(authType=", str, ", typeFront=", str2, ", eventType=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", channel=", str4, ", logUid=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", partnerName=", str6, ", sdkVersion=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str7, ", clientId=", str8, ", value=");
            return G.h(sbB, str9, ", eventCategory=", str10, ")");
        }

        public n(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10) {
            this.authType = str;
            this.typeFront = str2;
            this.eventType = str3;
            this.channel = str4;
            this.logUid = str5;
            this.partnerName = str6;
            this.sdkVersion = str7;
            this.clientId = str8;
            this.value = str9;
            this.eventCategory = str10;
            this.f19578a = "SID_ELK_Popup screen";
        }

        public /* synthetic */ n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "sberID" : str, (i12 & 2) != 0 ? "app" : str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : str9, (i12 & 512) != 0 ? "ELK" : str10);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u000201B\u0083\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB©\u0001\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u0012\u0004\b \u0010\u001a\u001a\u0004\b\u001f\u0010\u0018R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b!\u0010\u0018R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u0012\u0004\b$\u0010\u001a\u001a\u0004\b#\u0010\u0018R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u0012\u0004\b&\u0010\u001a\u001a\u0004\b%\u0010\u0018R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u0012\u0004\b(\u0010\u001a\u001a\u0004\b'\u0010\u0018R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u0012\u0004\b*\u0010\u001a\u001a\u0004\b)\u0010\u0018R\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0016\u0012\u0004\b,\u0010\u001a\u001a\u0004\b+\u0010\u0018R\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u0012\u0004\b.\u0010\u001a\u001a\u0004\b-\u0010\u0018¨\u00062"}, d2 = {"LYb1/a$q;", "LYb1/a;", "", "authType", "typeFront", "eventType", "channel", "logUid", "partnerName", "sdkVersion", "clientId", "widgetContent", "elementName", "eventCategory", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "getAuthType$annotations", "()V", "getTypeFront", "getTypeFront$annotations", "getEventType", "getEventType$annotations", "getChannel", "getChannel$annotations", "getLogUid", "getLogUid$annotations", "getPartnerName", "getPartnerName$annotations", "getSdkVersion", "getSdkVersion$annotations", "getClientId", "getClientId$annotations", "getWidgetContent", "getWidgetContent$annotations", "getElementName", "getElementName$annotations", "getEventCategory", "getEventCategory$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class q implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19587a;

        @com.google.gson.annotations.c("auth_type")
        @Y61.k
        private final String authType;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("element_name")
        @Y61.l
        private final String elementName;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("event_type")
        @Y61.k
        private final String eventType;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @com.google.gson.annotations.c("type_front")
        @Y61.k
        private final String typeFront;

        @com.google.gson.annotations.c("widget_content")
        @Y61.l
        private final String widgetContent;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.UserInfoEvent.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$q;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$q$a, reason: collision with other inner class name */
        public static final class C1398a implements N<q> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1398a f19588a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19589b;

            static {
                C1398a c1398a = new C1398a();
                f19588a = c1398a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.UserInfoEvent", c1398a, 12);
                pluginGeneratedSerialDescriptor.j("auth_type", true);
                pluginGeneratedSerialDescriptor.j("type_front", true);
                pluginGeneratedSerialDescriptor.j("event_type", false);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("widget_content", true);
                pluginGeneratedSerialDescriptor.j("element_name", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19589b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{v02, v02, v02, L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19589b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String str = null;
                String str2 = null;
                String strS = null;
                String strS2 = null;
                String strS3 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String strS4 = null;
                int i12 = 0;
                boolean z12 = true;
                while (z12) {
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            break;
                        case 0:
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                            i12 |= 1;
                            break;
                        case 1:
                            strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                            i12 |= 2;
                            break;
                        case 2:
                            strS3 = cVarC.s(pluginGeneratedSerialDescriptor, 2);
                            i12 |= 4;
                            break;
                        case 3:
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str3);
                            i12 |= 8;
                            break;
                        case 4:
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str4);
                            i12 |= 16;
                            break;
                        case 5:
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str5);
                            i12 |= 32;
                            break;
                        case 6:
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str6);
                            i12 |= 64;
                            break;
                        case 7:
                            str7 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str7);
                            i12 |= 128;
                            break;
                        case 8:
                            str8 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str8);
                            i12 |= 256;
                            break;
                        case 9:
                            str = (String) cVarC.f(pluginGeneratedSerialDescriptor, 9, V0.f412822a, str);
                            i12 |= 512;
                            break;
                        case 10:
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 10, V0.f412822a, str2);
                            i12 |= 1024;
                            break;
                        case 11:
                            strS4 = cVarC.s(pluginGeneratedSerialDescriptor, 11);
                            i12 |= 2048;
                            break;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new q(i12, strS, strS2, strS3, str3, str4, str5, str6, str7, str8, str, str2, strS4, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19589b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19589b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                q.d((q) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$q$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$q;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$q$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<q> serializer() {
                return C1398a.f19588a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public q(int i12, @v @EncodeDefault String str, @v @EncodeDefault String str2, @v @EncodeDefault String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v String str9, @v String str10, @v @EncodeDefault String str11, String str12, kotlinx.serialization.internal.P0 p02) {
            if (4 != (i12 & 4)) {
                C1398a.f19588a.getClass();
                E0.b(i12, 4, C1398a.f19589b);
                throw null;
            }
            this.authType = (i12 & 1) == 0 ? "sberID" : str;
            this.typeFront = (i12 & 2) == 0 ? "app" : str2;
            this.eventType = str3;
            if ((i12 & 8) == 0) {
                this.channel = null;
            } else {
                this.channel = str4;
            }
            if ((i12 & 16) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str5;
            }
            if ((i12 & 32) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str6;
            }
            if ((i12 & 64) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str7;
            }
            if ((i12 & 128) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str8;
            }
            if ((i12 & 256) == 0) {
                this.widgetContent = null;
            } else {
                this.widgetContent = str9;
            }
            if ((i12 & 512) == 0) {
                this.elementName = null;
            } else {
                this.elementName = str10;
            }
            this.eventCategory = (i12 & 1024) == 0 ? "ELK" : str11;
            this.f19587a = (i12 & 2048) == 0 ? "SID_ELK_UserInfo widget" : str12;
        }

        @X41.n
        public static final void d(q qVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            dVar.l(pluginGeneratedSerialDescriptor, 0, qVar.authType);
            dVar.l(pluginGeneratedSerialDescriptor, 1, qVar.typeFront);
            dVar.l(pluginGeneratedSerialDescriptor, 2, qVar.eventType);
            if (dVar.u() || qVar.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, qVar.channel);
            }
            if (dVar.u() || qVar.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, qVar.logUid);
            }
            if (dVar.u() || qVar.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, qVar.partnerName);
            }
            if (dVar.u() || qVar.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, qVar.sdkVersion);
            }
            if (dVar.u() || qVar.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, qVar.clientId);
            }
            if (dVar.u() || qVar.widgetContent != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, qVar.widgetContent);
            }
            if (dVar.u() || qVar.elementName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 9, V0.f412822a, qVar.elementName);
            }
            dVar.p(pluginGeneratedSerialDescriptor, 10, V0.f412822a, qVar.eventCategory);
            boolean zU2 = dVar.u();
            String str = qVar.f19587a;
            if (!zU2 && L.f(str, "SID_ELK_UserInfo widget")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 11, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19587a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return L.f(this.authType, qVar.authType) && L.f(this.typeFront, qVar.typeFront) && L.f(this.eventType, qVar.eventType) && L.f(this.channel, qVar.channel) && L.f(this.logUid, qVar.logUid) && L.f(this.partnerName, qVar.partnerName) && L.f(this.sdkVersion, qVar.sdkVersion) && L.f(this.clientId, qVar.clientId) && L.f(this.widgetContent, qVar.widgetContent) && L.f(this.elementName, qVar.elementName) && L.f(this.eventCategory, qVar.eventCategory);
        }

        public final int hashCode() {
            int iA2 = AbstractC47961a.a(this.eventType, AbstractC47961a.a(this.typeFront, this.authType.hashCode() * 31));
            String str = this.channel;
            int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logUid;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sdkVersion;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.clientId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.widgetContent;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.elementName;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.eventCategory;
            return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.authType;
            String str2 = this.typeFront;
            String str3 = this.eventType;
            String str4 = this.channel;
            String str5 = this.logUid;
            String str6 = this.partnerName;
            String str7 = this.sdkVersion;
            String str8 = this.clientId;
            String str9 = this.widgetContent;
            String str10 = this.elementName;
            String str11 = this.eventCategory;
            StringBuilder sbB = C23088b.b("UserInfoEvent(authType=", str, ", typeFront=", str2, ", eventType=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", channel=", str4, ", logUid=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", partnerName=", str6, ", sdkVersion=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str7, ", clientId=", str8, ", widgetContent=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str9, ", elementName=", str10, ", eventCategory=");
            return AK.c.s(sbB, str11, ")");
        }

        public q(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10, @Y61.l String str11) {
            this.authType = str;
            this.typeFront = str2;
            this.eventType = str3;
            this.channel = str4;
            this.logUid = str5;
            this.partnerName = str6;
            this.sdkVersion = str7;
            this.clientId = str8;
            this.widgetContent = str9;
            this.elementName = str10;
            this.eventCategory = str11;
            this.f19587a = "SID_ELK_UserInfo widget";
        }

        public /* synthetic */ q(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "sberID" : str, (i12 & 2) != 0 ? "app" : str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : str9, (i12 & 512) != 0 ? null : str10, (i12 & 1024) != 0 ? "ELK" : str11);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256B\u009b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011BÁ\u0001\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0017R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b!\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0018\u0012\u0004\b$\u0010\u001c\u001a\u0004\b#\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0018\u0012\u0004\b&\u0010\u001c\u001a\u0004\b%\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0018\u0012\u0004\b(\u0010\u001c\u001a\u0004\b'\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0018\u0012\u0004\b*\u0010\u001c\u001a\u0004\b)\u0010\u001aR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0018\u0012\u0004\b,\u0010\u001c\u001a\u0004\b+\u0010\u001aR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0018\u0012\u0004\b.\u0010\u001c\u001a\u0004\b-\u0010\u001aR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u0012\u0004\b0\u0010\u001c\u001a\u0004\b/\u0010\u001aR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0018\u0012\u0004\b2\u0010\u001c\u001a\u0004\b1\u0010\u001aR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0018\u0012\u0004\b3\u0010\u001c\u001a\u0004\b\u000f\u0010\u001a¨\u00067"}, d2 = {"LYb1/a$p;", "LYb1/a;", "", "authType", "typeFront", "eventType", "channel", "logUid", "partnerName", "sdkVersion", "clientId", "value", "eventCategory", "elementName", "widgetName", "isAdaptive", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "getAuthType$annotations", "()V", "getTypeFront", "getTypeFront$annotations", "getEventType", "getEventType$annotations", "getChannel", "getChannel$annotations", "getLogUid", "getLogUid$annotations", "getPartnerName", "getPartnerName$annotations", "getSdkVersion", "getSdkVersion$annotations", "getClientId", "getClientId$annotations", "getValue", "getValue$annotations", "getEventCategory", "getEventCategory$annotations", "getElementName", "getElementName$annotations", "getWidgetName", "getWidgetName$annotations", "isAdaptive$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class p implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19584a;

        @com.google.gson.annotations.c("auth_type")
        @Y61.k
        private final String authType;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("element_name")
        @Y61.l
        private final String elementName;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("event_type")
        @Y61.k
        private final String eventType;

        @com.google.gson.annotations.c("is_adaptive")
        @Y61.l
        private final String isAdaptive;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @com.google.gson.annotations.c("type_front")
        @Y61.k
        private final String typeFront;

        @com.google.gson.annotations.c("value")
        @Y61.l
        private final String value;

        @com.google.gson.annotations.c("widget_name")
        @Y61.l
        private final String widgetName;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.ProfitsEvent.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$p;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$p$a, reason: collision with other inner class name */
        public static final class C1397a implements N<p> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1397a f19585a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19586b;

            static {
                C1397a c1397a = new C1397a();
                f19585a = c1397a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.ProfitsEvent", c1397a, 14);
                pluginGeneratedSerialDescriptor.j("auth_type", true);
                pluginGeneratedSerialDescriptor.j("type_front", true);
                pluginGeneratedSerialDescriptor.j("event_type", false);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("value", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("element_name", true);
                pluginGeneratedSerialDescriptor.j("widget_name", true);
                pluginGeneratedSerialDescriptor.j("is_adaptive", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19586b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{v02, v02, v02, L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                String str;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19586b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String strS = null;
                String strS2 = null;
                String strS3 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String strS4 = null;
                int i12 = 0;
                boolean z12 = true;
                while (z12) {
                    String str12 = strS3;
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            strS3 = str12;
                        case 0:
                            str = strS2;
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                            i12 |= 1;
                            strS3 = str12;
                            strS2 = str;
                        case 1:
                            i12 |= 2;
                            strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                            strS3 = str12;
                        case 2:
                            str = strS2;
                            strS3 = cVarC.s(pluginGeneratedSerialDescriptor, 2);
                            i12 |= 4;
                            strS2 = str;
                        case 3:
                            str = strS2;
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str6);
                            i12 |= 8;
                            strS3 = str12;
                            strS2 = str;
                        case 4:
                            str = strS2;
                            str7 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str7);
                            i12 |= 16;
                            strS3 = str12;
                            strS2 = str;
                        case 5:
                            str = strS2;
                            str8 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str8);
                            i12 |= 32;
                            strS3 = str12;
                            strS2 = str;
                        case 6:
                            str = strS2;
                            str9 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str9);
                            i12 |= 64;
                            strS3 = str12;
                            strS2 = str;
                        case 7:
                            str = strS2;
                            str10 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str10);
                            i12 |= 128;
                            strS3 = str12;
                            strS2 = str;
                        case 8:
                            str = strS2;
                            str11 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str11);
                            i12 |= 256;
                            strS3 = str12;
                            strS2 = str;
                        case 9:
                            str = strS2;
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 9, V0.f412822a, str2);
                            i12 |= 512;
                            strS3 = str12;
                            strS2 = str;
                        case 10:
                            str = strS2;
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 10, V0.f412822a, str5);
                            i12 |= 1024;
                            strS3 = str12;
                            strS2 = str;
                        case 11:
                            str = strS2;
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 11, V0.f412822a, str4);
                            i12 |= 2048;
                            strS3 = str12;
                            strS2 = str;
                        case 12:
                            str = strS2;
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 12, V0.f412822a, str3);
                            i12 |= 4096;
                            strS3 = str12;
                            strS2 = str;
                        case 13:
                            strS4 = cVarC.s(pluginGeneratedSerialDescriptor, 13);
                            i12 |= 8192;
                            strS3 = str12;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new p(i12, strS, strS2, strS3, str6, str7, str8, str9, str10, str11, str2, str5, str4, str3, strS4, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19586b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19586b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                p.d((p) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$p$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$p;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$p$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<p> serializer() {
                return C1397a.f19585a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public p(int i12, @v @EncodeDefault String str, @v @EncodeDefault String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v String str9, @v @EncodeDefault String str10, @v String str11, @v String str12, @v @EncodeDefault String str13, String str14, kotlinx.serialization.internal.P0 p02) {
            if (4 != (i12 & 4)) {
                C1397a.f19585a.getClass();
                E0.b(i12, 4, C1397a.f19586b);
                throw null;
            }
            this.authType = (i12 & 1) == 0 ? "sberID" : str;
            this.typeFront = (i12 & 2) == 0 ? "app" : str2;
            this.eventType = str3;
            if ((i12 & 8) == 0) {
                this.channel = null;
            } else {
                this.channel = str4;
            }
            if ((i12 & 16) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str5;
            }
            if ((i12 & 32) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str6;
            }
            if ((i12 & 64) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str7;
            }
            if ((i12 & 128) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str8;
            }
            if ((i12 & 256) == 0) {
                this.value = null;
            } else {
                this.value = str9;
            }
            this.eventCategory = (i12 & 512) == 0 ? "ELK" : str10;
            if ((i12 & 1024) == 0) {
                this.elementName = null;
            } else {
                this.elementName = str11;
            }
            if ((i12 & 2048) == 0) {
                this.widgetName = null;
            } else {
                this.widgetName = str12;
            }
            if ((i12 & 4096) == 0) {
                this.isAdaptive = null;
            } else {
                this.isAdaptive = str13;
            }
            this.f19584a = (i12 & 8192) == 0 ? "SID_ELK_Profits widget" : str14;
        }

        @X41.n
        public static final void d(p pVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            dVar.l(pluginGeneratedSerialDescriptor, 0, pVar.authType);
            dVar.l(pluginGeneratedSerialDescriptor, 1, pVar.typeFront);
            dVar.l(pluginGeneratedSerialDescriptor, 2, pVar.eventType);
            if (dVar.u() || pVar.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, pVar.channel);
            }
            if (dVar.u() || pVar.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, pVar.logUid);
            }
            if (dVar.u() || pVar.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, pVar.partnerName);
            }
            if (dVar.u() || pVar.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, pVar.sdkVersion);
            }
            if (dVar.u() || pVar.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, pVar.clientId);
            }
            if (dVar.u() || pVar.value != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, pVar.value);
            }
            V0 v02 = V0.f412822a;
            dVar.p(pluginGeneratedSerialDescriptor, 9, v02, pVar.eventCategory);
            if (dVar.u() || pVar.elementName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 10, v02, pVar.elementName);
            }
            if (dVar.u() || pVar.widgetName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 11, v02, pVar.widgetName);
            }
            dVar.p(pluginGeneratedSerialDescriptor, 12, v02, pVar.isAdaptive);
            boolean zU2 = dVar.u();
            String str = pVar.f19584a;
            if (!zU2 && L.f(str, "SID_ELK_Profits widget")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 13, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19584a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return L.f(this.authType, pVar.authType) && L.f(this.typeFront, pVar.typeFront) && L.f(this.eventType, pVar.eventType) && L.f(this.channel, pVar.channel) && L.f(this.logUid, pVar.logUid) && L.f(this.partnerName, pVar.partnerName) && L.f(this.sdkVersion, pVar.sdkVersion) && L.f(this.clientId, pVar.clientId) && L.f(this.value, pVar.value) && L.f(this.eventCategory, pVar.eventCategory) && L.f(this.elementName, pVar.elementName) && L.f(this.widgetName, pVar.widgetName) && L.f(this.isAdaptive, pVar.isAdaptive);
        }

        public final int hashCode() {
            int iA2 = AbstractC47961a.a(this.eventType, AbstractC47961a.a(this.typeFront, this.authType.hashCode() * 31));
            String str = this.channel;
            int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logUid;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sdkVersion;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.clientId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.value;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.eventCategory;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.elementName;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.widgetName;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.isAdaptive;
            return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.authType;
            String str2 = this.typeFront;
            String str3 = this.eventType;
            String str4 = this.channel;
            String str5 = this.logUid;
            String str6 = this.partnerName;
            String str7 = this.sdkVersion;
            String str8 = this.clientId;
            String str9 = this.value;
            String str10 = this.eventCategory;
            String str11 = this.elementName;
            String str12 = this.widgetName;
            String str13 = this.isAdaptive;
            StringBuilder sbB = C23088b.b("ProfitsEvent(authType=", str, ", typeFront=", str2, ", eventType=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", channel=", str4, ", logUid=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", partnerName=", str6, ", sdkVersion=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str7, ", clientId=", str8, ", value=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str9, ", eventCategory=", str10, ", elementName=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str11, ", widgetName=", str12, ", isAdaptive=");
            return AK.c.s(sbB, str13, ")");
        }

        public p(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10, @Y61.l String str11, @Y61.l String str12, @Y61.l String str13) {
            this.authType = str;
            this.typeFront = str2;
            this.eventType = str3;
            this.channel = str4;
            this.logUid = str5;
            this.partnerName = str6;
            this.sdkVersion = str7;
            this.clientId = str8;
            this.value = str9;
            this.eventCategory = str10;
            this.elementName = str11;
            this.widgetName = str12;
            this.isAdaptive = str13;
            this.f19584a = "SID_ELK_Profits widget";
        }

        public /* synthetic */ p(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "sberID" : str, (i12 & 2) != 0 ? "app" : str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : str9, (i12 & 512) != 0 ? "ELK" : str10, (i12 & 1024) != 0 ? null : str11, (i12 & 2048) != 0 ? null : str12, (i12 & 4096) != 0 ? null : str13);
        }
    }

    @P
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\u0087\b\u0018\u0000 82\u00020\u0001:\u00029:B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012BÍ\u0001\b\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0011\u0010\u0018R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u0012\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u0012\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b%\u0010\u001d\u001a\u0004\b$\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0019\u0012\u0004\b'\u0010\u001d\u001a\u0004\b&\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0019\u0012\u0004\b)\u0010\u001d\u001a\u0004\b(\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u0012\u0004\b+\u0010\u001d\u001a\u0004\b*\u0010\u001bR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0019\u0012\u0004\b-\u0010\u001d\u001a\u0004\b,\u0010\u001bR\"\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0019\u0012\u0004\b/\u0010\u001d\u001a\u0004\b.\u0010\u001bR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0019\u0012\u0004\b1\u0010\u001d\u001a\u0004\b0\u0010\u001bR\"\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0019\u0012\u0004\b3\u0010\u001d\u001a\u0004\b2\u0010\u001bR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u0012\u0004\b5\u0010\u001d\u001a\u0004\b4\u0010\u001bR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u0012\u0004\b7\u0010\u001d\u001a\u0004\b6\u0010\u001b¨\u0006;"}, d2 = {"LYb1/a$j;", "LYb1/a;", "", "authType", "typeFront", "eventType", "channel", "logUid", "partnerName", "sdkVersion", "clientId", "widgetCount", "value", "widgetNumber", "widgetTitle", "eventCategory", "elementName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "eventName", "Lkotlinx/serialization/internal/P0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/P0;)V", "Ljava/lang/String;", "getAuthType", "()Ljava/lang/String;", "getAuthType$annotations", "()V", "getTypeFront", "getTypeFront$annotations", "getEventType", "getEventType$annotations", "getChannel", "getChannel$annotations", "getLogUid", "getLogUid$annotations", "getPartnerName", "getPartnerName$annotations", "getSdkVersion", "getSdkVersion$annotations", "getClientId", "getClientId$annotations", "getWidgetCount", "getWidgetCount$annotations", "getValue", "getValue$annotations", "getWidgetNumber", "getWidgetNumber$annotations", "getWidgetTitle", "getWidgetTitle$annotations", "getEventCategory", "getEventCategory$annotations", "getElementName", "getElementName$annotations", "Companion", "a", "b", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0})
    @w
    public static final /* data */ class j implements a {

        /* renamed from: Companion, reason: from kotlin metadata */
        @Y61.k
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f19566a;

        @com.google.gson.annotations.c("auth_type")
        @Y61.k
        private final String authType;

        @com.google.gson.annotations.c("channel")
        @Y61.l
        private final String channel;

        @com.google.gson.annotations.c("clientId")
        @Y61.l
        private final String clientId;

        @com.google.gson.annotations.c("element_name")
        @Y61.l
        private final String elementName;

        @com.google.gson.annotations.c("event_category")
        @Y61.l
        private final String eventCategory;

        @com.google.gson.annotations.c("event_type")
        @Y61.k
        private final String eventType;

        @com.google.gson.annotations.c("logUid")
        @Y61.l
        private final String logUid;

        @com.google.gson.annotations.c("partnerName")
        @Y61.l
        private final String partnerName;

        @com.google.gson.annotations.c("sdkVersion")
        @Y61.l
        private final String sdkVersion;

        @com.google.gson.annotations.c("type_front")
        @Y61.k
        private final String typeFront;

        @com.google.gson.annotations.c("value")
        @Y61.l
        private final String value;

        @com.google.gson.annotations.c("widget_count")
        @Y61.l
        private final String widgetCount;

        @com.google.gson.annotations.c("widget_number")
        @Y61.l
        private final String widgetNumber;

        @com.google.gson.annotations.c("widget_title")
        @Y61.l
        private final String widgetTitle;

        @P
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"sberid/sdk/global/analytics/models/AnalyticModels.HotKeyEvent.$serializer", "Lkotlinx/serialization/internal/N;", "LYb1/a$j;", "<init>", "()V", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @InterfaceC42830m
        /* renamed from: Yb1.a$j$a, reason: collision with other inner class name */
        public static final class C1391a implements N<j> {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1391a f19567a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ PluginGeneratedSerialDescriptor f19568b;

            static {
                C1391a c1391a = new C1391a();
                f19567a = c1391a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("sberid.sdk.global.analytics.models.AnalyticModels.HotKeyEvent", c1391a, 15);
                pluginGeneratedSerialDescriptor.j("auth_type", true);
                pluginGeneratedSerialDescriptor.j("type_front", true);
                pluginGeneratedSerialDescriptor.j("event_type", false);
                pluginGeneratedSerialDescriptor.j("channel", true);
                pluginGeneratedSerialDescriptor.j("logUid", true);
                pluginGeneratedSerialDescriptor.j("partnerName", true);
                pluginGeneratedSerialDescriptor.j("sdkVersion", true);
                pluginGeneratedSerialDescriptor.j("clientId", true);
                pluginGeneratedSerialDescriptor.j("widget_count", true);
                pluginGeneratedSerialDescriptor.j("value", true);
                pluginGeneratedSerialDescriptor.j("widget_number", true);
                pluginGeneratedSerialDescriptor.j("widget_title", true);
                pluginGeneratedSerialDescriptor.j("event_category", true);
                pluginGeneratedSerialDescriptor.j("element_name", true);
                pluginGeneratedSerialDescriptor.j("eventName", true);
                f19568b = pluginGeneratedSerialDescriptor;
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] childSerializers() {
                V0 v02 = V0.f412822a;
                return new KSerializer[]{v02, v02, v02, L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), L51.a.a(v02), v02};
            }

            @Override // kotlinx.serialization.InterfaceC43386e
            public final Object deserialize(Decoder decoder) {
                String str;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19568b;
                kotlinx.serialization.encoding.c cVarC = decoder.c(pluginGeneratedSerialDescriptor);
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                String strS = null;
                String strS2 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                String str12 = null;
                String strS3 = null;
                String strS4 = null;
                int i12 = 0;
                boolean z12 = true;
                while (z12) {
                    String str13 = strS2;
                    int iJ2 = cVarC.j(pluginGeneratedSerialDescriptor);
                    switch (iJ2) {
                        case -1:
                            z12 = false;
                            strS2 = str13;
                        case 0:
                            i12 |= 1;
                            strS = cVarC.s(pluginGeneratedSerialDescriptor, 0);
                            strS2 = str13;
                        case 1:
                            str = strS;
                            strS2 = cVarC.s(pluginGeneratedSerialDescriptor, 1);
                            i12 |= 2;
                            strS = str;
                        case 2:
                            str = strS;
                            strS3 = cVarC.s(pluginGeneratedSerialDescriptor, 2);
                            i12 |= 4;
                            strS2 = str13;
                            strS = str;
                        case 3:
                            str = strS;
                            str7 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 3, V0.f412822a, str7);
                            i12 |= 8;
                            strS2 = str13;
                            strS = str;
                        case 4:
                            str = strS;
                            str8 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 4, V0.f412822a, str8);
                            i12 |= 16;
                            strS2 = str13;
                            strS = str;
                        case 5:
                            str = strS;
                            str9 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 5, V0.f412822a, str9);
                            i12 |= 32;
                            strS2 = str13;
                            strS = str;
                        case 6:
                            str = strS;
                            str10 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 6, V0.f412822a, str10);
                            i12 |= 64;
                            strS2 = str13;
                            strS = str;
                        case 7:
                            str = strS;
                            str11 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 7, V0.f412822a, str11);
                            i12 |= 128;
                            strS2 = str13;
                            strS = str;
                        case 8:
                            str = strS;
                            str12 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 8, V0.f412822a, str12);
                            i12 |= 256;
                            strS2 = str13;
                            strS = str;
                        case 9:
                            str = strS;
                            str2 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 9, V0.f412822a, str2);
                            i12 |= 512;
                            strS2 = str13;
                            strS = str;
                        case 10:
                            str = strS;
                            str5 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 10, V0.f412822a, str5);
                            i12 |= 1024;
                            strS2 = str13;
                            strS = str;
                        case 11:
                            str = strS;
                            str4 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 11, V0.f412822a, str4);
                            i12 |= 2048;
                            strS2 = str13;
                            strS = str;
                        case 12:
                            str = strS;
                            str3 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 12, V0.f412822a, str3);
                            i12 |= 4096;
                            strS2 = str13;
                            strS = str;
                        case 13:
                            str = strS;
                            str6 = (String) cVarC.f(pluginGeneratedSerialDescriptor, 13, V0.f412822a, str6);
                            i12 |= 8192;
                            strS2 = str13;
                            strS = str;
                        case 14:
                            strS4 = cVarC.s(pluginGeneratedSerialDescriptor, 14);
                            i12 |= Http2.INITIAL_MAX_FRAME_SIZE;
                            strS2 = str13;
                        default:
                            throw new UnknownFieldException(iJ2);
                    }
                }
                cVarC.d(pluginGeneratedSerialDescriptor);
                return new j(i12, strS, strS2, strS3, str7, str8, str9, str10, str11, str12, str2, str5, str4, str3, str6, strS4, null);
            }

            @Override // kotlinx.serialization.x, kotlinx.serialization.InterfaceC43386e
            @Y61.k
            /* renamed from: getDescriptor */
            public final SerialDescriptor getF412706c() {
                return f19568b;
            }

            @Override // kotlinx.serialization.x
            public final void serialize(Encoder encoder, Object obj) {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = f19568b;
                kotlinx.serialization.encoding.d dVarC = encoder.c(pluginGeneratedSerialDescriptor);
                j.d((j) obj, dVarC, pluginGeneratedSerialDescriptor);
                dVarC.d(pluginGeneratedSerialDescriptor);
            }

            @Override // kotlinx.serialization.internal.N
            @Y61.k
            public final KSerializer<?>[] typeParametersSerializers() {
                return G0.f412773a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LYb1/a$j$b;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "LYb1/a$j;", "serializer", "()Lkotlinx/serialization/KSerializer;", "SberIdSDK_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Yb1.a$j$b, reason: from kotlin metadata */
        public static final class Companion {
            public Companion() {
            }

            @Y61.k
            public final KSerializer<j> serializer() {
                return C1391a.f19567a;
            }

            public /* synthetic */ Companion(C42822w c42822w) {
                this();
            }
        }

        @InterfaceC42830m
        public j(int i12, @v @EncodeDefault String str, @v @EncodeDefault String str2, @v String str3, @v String str4, @v String str5, @v String str6, @v String str7, @v String str8, @v String str9, @v String str10, @v String str11, @v String str12, @v @EncodeDefault String str13, @v String str14, String str15, kotlinx.serialization.internal.P0 p02) {
            if (4 != (i12 & 4)) {
                C1391a.f19567a.getClass();
                E0.b(i12, 4, C1391a.f19568b);
                throw null;
            }
            this.authType = (i12 & 1) == 0 ? "sberID" : str;
            this.typeFront = (i12 & 2) == 0 ? "app" : str2;
            this.eventType = str3;
            if ((i12 & 8) == 0) {
                this.channel = null;
            } else {
                this.channel = str4;
            }
            if ((i12 & 16) == 0) {
                this.logUid = null;
            } else {
                this.logUid = str5;
            }
            if ((i12 & 32) == 0) {
                this.partnerName = null;
            } else {
                this.partnerName = str6;
            }
            if ((i12 & 64) == 0) {
                this.sdkVersion = null;
            } else {
                this.sdkVersion = str7;
            }
            if ((i12 & 128) == 0) {
                this.clientId = null;
            } else {
                this.clientId = str8;
            }
            if ((i12 & 256) == 0) {
                this.widgetCount = null;
            } else {
                this.widgetCount = str9;
            }
            if ((i12 & 512) == 0) {
                this.value = null;
            } else {
                this.value = str10;
            }
            if ((i12 & 1024) == 0) {
                this.widgetNumber = null;
            } else {
                this.widgetNumber = str11;
            }
            if ((i12 & 2048) == 0) {
                this.widgetTitle = null;
            } else {
                this.widgetTitle = str12;
            }
            this.eventCategory = (i12 & 4096) == 0 ? "ELK" : str13;
            if ((i12 & 8192) == 0) {
                this.elementName = null;
            } else {
                this.elementName = str14;
            }
            this.f19566a = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? "SID_ELK_HotKeys widget" : str15;
        }

        @X41.n
        public static final void d(j jVar, kotlinx.serialization.encoding.d dVar, PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
            dVar.l(pluginGeneratedSerialDescriptor, 0, jVar.authType);
            dVar.l(pluginGeneratedSerialDescriptor, 1, jVar.typeFront);
            dVar.l(pluginGeneratedSerialDescriptor, 2, jVar.eventType);
            if (dVar.u() || jVar.channel != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 3, V0.f412822a, jVar.channel);
            }
            if (dVar.u() || jVar.logUid != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 4, V0.f412822a, jVar.logUid);
            }
            if (dVar.u() || jVar.partnerName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 5, V0.f412822a, jVar.partnerName);
            }
            if (dVar.u() || jVar.sdkVersion != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 6, V0.f412822a, jVar.sdkVersion);
            }
            if (dVar.u() || jVar.clientId != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 7, V0.f412822a, jVar.clientId);
            }
            if (dVar.u() || jVar.widgetCount != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 8, V0.f412822a, jVar.widgetCount);
            }
            if (dVar.u() || jVar.value != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 9, V0.f412822a, jVar.value);
            }
            if (dVar.u() || jVar.widgetNumber != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 10, V0.f412822a, jVar.widgetNumber);
            }
            if (dVar.u() || jVar.widgetTitle != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 11, V0.f412822a, jVar.widgetTitle);
            }
            V0 v02 = V0.f412822a;
            dVar.p(pluginGeneratedSerialDescriptor, 12, v02, jVar.eventCategory);
            if (dVar.u() || jVar.elementName != null) {
                dVar.p(pluginGeneratedSerialDescriptor, 13, v02, jVar.elementName);
            }
            boolean zU2 = dVar.u();
            String str = jVar.f19566a;
            if (!zU2 && L.f(str, "SID_ELK_HotKeys widget")) {
                return;
            }
            dVar.l(pluginGeneratedSerialDescriptor, 14, str);
        }

        @Override // Yb1.a
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF19587a() {
            return this.f19566a;
        }

        @Override // Yb1.a
        @Y61.k
        public final Map<String, String> b() {
            return h.b(this);
        }

        @Override // Yb1.a
        @Y61.k
        public final String c() {
            return h.a(this);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return L.f(this.authType, jVar.authType) && L.f(this.typeFront, jVar.typeFront) && L.f(this.eventType, jVar.eventType) && L.f(this.channel, jVar.channel) && L.f(this.logUid, jVar.logUid) && L.f(this.partnerName, jVar.partnerName) && L.f(this.sdkVersion, jVar.sdkVersion) && L.f(this.clientId, jVar.clientId) && L.f(this.widgetCount, jVar.widgetCount) && L.f(this.value, jVar.value) && L.f(this.widgetNumber, jVar.widgetNumber) && L.f(this.widgetTitle, jVar.widgetTitle) && L.f(this.eventCategory, jVar.eventCategory) && L.f(this.elementName, jVar.elementName);
        }

        public final int hashCode() {
            int iA2 = AbstractC47961a.a(this.eventType, AbstractC47961a.a(this.typeFront, this.authType.hashCode() * 31));
            String str = this.channel;
            int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.logUid;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.partnerName;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sdkVersion;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.clientId;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.widgetCount;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.value;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.widgetNumber;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.widgetTitle;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.eventCategory;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.elementName;
            return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            String str = this.authType;
            String str2 = this.typeFront;
            String str3 = this.eventType;
            String str4 = this.channel;
            String str5 = this.logUid;
            String str6 = this.partnerName;
            String str7 = this.sdkVersion;
            String str8 = this.clientId;
            String str9 = this.widgetCount;
            String str10 = this.value;
            String str11 = this.widgetNumber;
            String str12 = this.widgetTitle;
            String str13 = this.eventCategory;
            String str14 = this.elementName;
            StringBuilder sbB = C23088b.b("HotKeyEvent(authType=", str, ", typeFront=", str2, ", eventType=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str3, ", channel=", str4, ", logUid=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str5, ", partnerName=", str6, ", sdkVersion=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str7, ", clientId=", str8, ", widgetCount=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str9, ", value=", str10, ", widgetNumber=");
            androidx.media3.exoplayer.analytics.m.p(sbB, str11, ", widgetTitle=", str12, ", eventCategory=");
            return G.h(sbB, str13, ", elementName=", str14, ")");
        }

        public j(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, @Y61.l String str9, @Y61.l String str10, @Y61.l String str11, @Y61.l String str12, @Y61.l String str13, @Y61.l String str14) {
            this.authType = str;
            this.typeFront = str2;
            this.eventType = str3;
            this.channel = str4;
            this.logUid = str5;
            this.partnerName = str6;
            this.sdkVersion = str7;
            this.clientId = str8;
            this.widgetCount = str9;
            this.value = str10;
            this.widgetNumber = str11;
            this.widgetTitle = str12;
            this.eventCategory = str13;
            this.elementName = str14;
            this.f19566a = "SID_ELK_HotKeys widget";
        }

        public /* synthetic */ j(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? "sberID" : str, (i12 & 2) != 0 ? "app" : str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : str9, (i12 & 512) != 0 ? null : str10, (i12 & 1024) != 0 ? null : str11, (i12 & 2048) != 0 ? null : str12, (i12 & 4096) != 0 ? "ELK" : str13, (i12 & 8192) != 0 ? null : str14);
        }
    }
}
