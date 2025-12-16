package shark;

import androidx.compose.foundation.text.selection.C21030p;
import androidx.compose.runtime.C22026a;
import androidx.compose.ui.platform.C22491k0;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.sequences.C43026i;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;
import shark.C48356w1;
import shark.M1;
import shark.internal.C48284j0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AndroidObjectInspectors.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lshark/AndroidObjectInspectors;", "", "Lshark/R2;", "l", "shark-android"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes9.dex */
public abstract class AndroidObjectInspectors implements R2 {

    /* renamed from: c, reason: collision with root package name */
    public static final AndroidObjectInspectors f437947c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AndroidObjectInspectors[] f437948d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final ArrayList f437949e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final l f437950f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437951b;

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$A;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class A extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437952l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                M1.c cVar2 = cVar;
                kotlin.collections.b1.i(kotlin.collections.b1.i(kotlin.collections.b1.i(kotlin.collections.b1.i(kotlin.collections.b1.i(kotlin.collections.b1.i(u22.f438215a, cVar2.g() + " is a binder stub. Binder stubs will often be"), " retained long after the associated activity or service is destroyed, as by design stubs"), " are retained until the other side gets GCed. If " + cVar2.g() + " is"), " not a *static* inner class then that's most likely the root cause of this leak. Make"), " it static. If " + cVar2.g() + " is an Android Framework class, file"), " a ticket here: https://issuetracker.google.com/issues/new?component=192705");
                return kotlin.G0.f406611a;
            }
        }

        public A() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437952l, "android.os.Binder");
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$B;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class B extends AndroidObjectInspectors {

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Y41.l<M1, Boolean> f437953g;

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {
            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                U2 u23 = u22;
                M1.c cVar2 = cVar;
                B b12 = B.this;
                K1 k1D = C48354w.d(cVar2, b12.f437951b, "mFragmentManager");
                if (k1D.f438095c.h()) {
                    u23.f438216b.add(C48354w.a(k1D, "null"));
                } else {
                    u23.f438217c.add(C48354w.a(k1D, "not null"));
                }
                K1 k1J = cVar2.j(b12.f437951b, "mTag");
                String strI = k1J != null ? k1J.f438095c.i() : null;
                if (strI != null && strI.length() != 0) {
                    u23.f438215a.add("Fragment.mTag=".concat(strI));
                }
                return kotlin.G0.f406611a;
            }
        }

        public B() {
            super("SUPPORT_FRAGMENT", 13, null);
            this.f437953g = new shark.r(this);
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(new a(), this.f437951b);
        }

        @Override // shark.AndroidObjectInspectors
        @Y61.k
        public final Y41.l<M1, Boolean> b() {
            return this.f437953g;
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$D;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class D extends AndroidObjectInspectors {

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Y41.l<M1, Boolean> f437957g;

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437958l = new a();

            public a() {
                super(2);
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
            @Override // Y41.p
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final kotlin.G0 invoke(shark.U2 r13, shark.M1.c r14) {
                /*
                    Method dump skipped, instructions count: 383
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: shark.AndroidObjectInspectors.D.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        public D() {
            super("VIEW", 0, null);
            this.f437957g = C48342t.f438696l;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437958l, "android.view.View");
        }

        @Override // shark.AndroidObjectInspectors
        @Y61.k
        public final Y41.l<M1, Boolean> b() {
            return this.f437957g;
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$b;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidObjectInspectors$b, reason: case insensitive filesystem */
    public static final class C48184b extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "it", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: shark.AndroidObjectInspectors$b$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437965l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                u22.f438217c.add("ActivityThread is a singleton");
                return kotlin.G0.f406611a;
            }
        }

        public C48184b() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437965l, "android.app.ActivityThread");
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$d;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidObjectInspectors$d, reason: case insensitive filesystem */
    public static final class C48186d extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: shark.AndroidObjectInspectors$d$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437968l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                U2 u23 = u22;
                K1 k1J = cVar.j("android.animation.Animator", "mListeners");
                if (k1J == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                M1.c cVarA = k1J.a();
                LinkedHashSet<String> linkedHashSet = u23.f438215a;
                if (cVarA != null) {
                    C48284j0.f438566a.getClass();
                    List listD = C43033p.D(C48284j0.a(cVarA));
                    if (listD.isEmpty()) {
                        linkedHashSet.add("mListeners is empty");
                    } else {
                        Iterator it = listD.iterator();
                        while (it.hasNext()) {
                            linkedHashSet.add("mListeners" + ((String) it.next()));
                        }
                    }
                } else {
                    linkedHashSet.add("mListeners = null");
                }
                return kotlin.G0.f406611a;
            }
        }

        public C48186d() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437968l, "android.animation.Animator");
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$e;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.AndroidObjectInspectors$e, reason: case insensitive filesystem */
    public static final class C48187e extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "it", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        /* renamed from: shark.AndroidObjectInspectors$e$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437969l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                u22.f438217c.add("Application is a singleton");
                return kotlin.G0.f406611a;
            }
        }

        public C48187e() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437969l, "android.app.Application");
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$g;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class g extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437972l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                U2 u23 = u22;
                K1 k1J = cVar.j("androidx.compose.runtime.CompositionImpl", "disposed");
                if (k1J == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                Boolean boolA = k1J.f438095c.a();
                if (boolA == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                if (boolA.booleanValue()) {
                    u23.f438216b.add("Composition disposed");
                } else {
                    u23.f438217c.add("Composition not disposed");
                }
                return kotlin.G0.f406611a;
            }
        }

        public g() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437972l, "androidx.compose.runtime.CompositionImpl");
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$h;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class h extends AndroidObjectInspectors {
        public h() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            String string;
            String strValueOf;
            Boolean boolA;
            M1 m12 = u22.f438218d;
            if (m12 instanceof M1.c) {
                C43026i.b bVar = new C43026i.b(((M1.c) m12).k());
                while (bVar.hasNext()) {
                    K1 k12 = (K1) bVar.next();
                    M1.c cVarA = k12.a();
                    if (cVarA != null && cVarA.h("android.content.Context")) {
                        M1.c cVarG = C48354w.g(cVarA);
                        LinkedHashSet<String> linkedHashSet = u22.f438215a;
                        String str = k12.f438094b;
                        if (cVarG == null) {
                            StringBuilder sbZ = androidx.appcompat.app.r.z(str, " instance of ");
                            sbZ.append(cVarA.f());
                            string = sbZ.toString();
                        } else if (cVarG.h("android.app.Activity")) {
                            StringBuilder sb2 = new StringBuilder("with mDestroyed = ");
                            K1 k1J = cVarG.j("android.app.Activity", "mDestroyed");
                            if (k1J == null || (boolA = k1J.f438095c.a()) == null || (strValueOf = String.valueOf(boolA.booleanValue())) == null) {
                                strValueOf = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                            }
                            sb2.append(strValueOf);
                            String string2 = sb2.toString();
                            if (cVarG.equals(cVarA)) {
                                StringBuilder sbZ2 = androidx.appcompat.app.r.z(str, " instance of ");
                                sbZ2.append(cVarA.f());
                                sbZ2.append(' ');
                                sbZ2.append(string2);
                                string = sbZ2.toString();
                            } else {
                                StringBuilder sbZ3 = androidx.appcompat.app.r.z(str, " instance of ");
                                sbZ3.append(cVarA.f());
                                sbZ3.append(", wrapping activity ");
                                sbZ3.append(cVarG.f());
                                sbZ3.append(' ');
                                sbZ3.append(string2);
                                string = sbZ3.toString();
                            }
                        } else if (cVarG.equals(cVarA)) {
                            StringBuilder sbZ4 = androidx.appcompat.app.r.z(str, " instance of ");
                            sbZ4.append(cVarA.f());
                            string = sbZ4.toString();
                        } else {
                            StringBuilder sbZ5 = androidx.appcompat.app.r.z(str, " instance of ");
                            sbZ5.append(cVarA.f());
                            sbZ5.append(", wrapping ");
                            sbZ5.append(cVarG.f());
                            string = sbZ5.toString();
                        }
                        linkedHashSet.add(string);
                    }
                }
            }
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$k;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class k extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437977l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                K1 k1D = C48354w.d(cVar, "com.squareup.coordinators.Coordinator", "attached");
                u22.f438215a.add(C48354w.a(k1D, String.valueOf(k1D.f438095c.a())));
                return kotlin.G0.f406611a;
            }
        }

        public k() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437977l, "com.squareup.coordinators.Coordinator");
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lshark/AndroidObjectInspectors$l;", "", "<init>", "()V", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class l {
        public l() {
        }

        public /* synthetic */ l(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$m;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class m extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437978l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                U2 u23 = u22;
                K1 k1J = cVar.j("android.app.Dialog", "mDecor");
                if (k1J != null) {
                    u23.f438215a.add(C48354w.a(k1J, k1J.f438095c.h() ? "null" : "not null"));
                    return kotlin.G0.f406611a;
                }
                kotlin.jvm.internal.L.k();
                throw null;
            }
        }

        public m() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437978l, "android.app.Dialog");
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$p;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class p extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "it", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437983l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                u22.f438217c.add("InputMethodManager is a singleton");
                return kotlin.G0.f406611a;
            }
        }

        public p() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437983l, "android.view.inputmethod.InputMethodManager");
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$q;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class q extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437984l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                U2 u23 = u22;
                String strB = C48354w.b(cVar);
                if (strB.equals("DESTROYED")) {
                    u23.f438215a.add("state = ".concat(strB));
                } else {
                    u23.f438217c.add("state is ".concat(strB));
                }
                return kotlin.G0.f406611a;
            }
        }

        public q() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437984l, "androidx.lifecycle.LifecycleRegistry");
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$r;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class r extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437985l = new a();

            public a() {
                super(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                kotlin.Q q12;
                U2 u23 = u22;
                K1 k1J = cVar.j("android.app.LoadedApk", "mReceivers");
                if (k1J == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                M1.c cVarA = k1J.a();
                if (cVarA == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                K1 k1J2 = cVarA.j("android.util.ArrayMap", "mArray");
                if (k1J2 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                M1.d dVarB = k1J2.b();
                if (dVarB == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                List listD = C43033p.D(dVarB.f());
                kotlin.ranges.j jVarP = kotlin.ranges.s.p(C42745f0.I(listD), 2);
                ArrayList arrayList = new ArrayList();
                kotlin.ranges.k it = jVarP.iterator();
                while (it.f406910d) {
                    int iA2 = it.a();
                    X1 x12 = (X1) listD.get(iA2);
                    if (x12.g()) {
                        M1 m1E = ((X1) listD.get(iA2 + 1)).e();
                        if (m1E == null) {
                            kotlin.jvm.internal.L.k();
                            throw null;
                        }
                        M1.c cVarA2 = m1E.a();
                        if (cVarA2 == null) {
                            kotlin.jvm.internal.L.k();
                            throw null;
                        }
                        K1 k1J3 = cVarA2.j("android.util.ArrayMap", "mArray");
                        if (k1J3 == null) {
                            kotlin.jvm.internal.L.k();
                            throw null;
                        }
                        M1.d dVarB2 = k1J3.b();
                        if (dVarB2 == null) {
                            kotlin.jvm.internal.L.k();
                            throw null;
                        }
                        List listD2 = C43033p.D(dVarB2.f());
                        kotlin.ranges.j jVarP2 = kotlin.ranges.s.p(C42745f0.I(listD2), 2);
                        ArrayList arrayList2 = new ArrayList();
                        kotlin.ranges.k it2 = jVarP2.iterator();
                        while (it2.f406910d) {
                            M1 m1E2 = ((X1) listD2.get(it2.a())).e();
                            M1.c cVarA3 = m1E2 != null ? m1E2.a() : null;
                            if (cVarA3 != null) {
                                arrayList2.add(cVarA3);
                            }
                        }
                        M1 m1E3 = x12.e();
                        if (m1E3 == null) {
                            kotlin.jvm.internal.L.k();
                            throw null;
                        }
                        M1.c cVarA4 = m1E3.a();
                        if (cVarA4 == null) {
                            kotlin.jvm.internal.L.k();
                            throw null;
                        }
                        String str = cVarA4.g() + '@' + cVarA4.f438151e;
                        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            M1.c cVar2 = (M1.c) it3.next();
                            arrayList3.add(cVar2.g() + '@' + cVar2.f438151e);
                        }
                        q12 = new kotlin.Q(str, arrayList3);
                    } else {
                        q12 = null;
                    }
                    if (q12 != null) {
                        arrayList.add(q12);
                    }
                }
                List<kotlin.Q> listM0 = C42745f0.M0(arrayList);
                if (!listM0.isEmpty()) {
                    LinkedHashSet<String> linkedHashSet = u23.f438215a;
                    linkedHashSet.add("Receivers");
                    for (kotlin.Q q13 : listM0) {
                        String str2 = (String) q13.f406619b;
                        List list = (List) q13.f406620c;
                        linkedHashSet.add(".." + str2);
                        Iterator it4 = list.iterator();
                        while (it4.hasNext()) {
                            linkedHashSet.add("...." + ((String) it4.next()));
                        }
                    }
                }
                return kotlin.G0.f406611a;
            }
        }

        public r() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437985l, "android.app.LoadedApk");
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$s;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class s extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437986l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                U2 u23 = u22;
                M1.c cVar2 = cVar;
                kotlin.reflect.d dVarB = kotlin.jvm.internal.m0.f406844a.b(Thread.class);
                cVar2.getClass();
                K1 k1J = cVar2.j(((InterfaceC42819t) dVarB).f().getName(), "name");
                if (k1J == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                if (kotlin.jvm.internal.L.f(k1J.f438095c.i(), "main")) {
                    u23.f438217c.add("the main thread always runs");
                }
                return kotlin.G0.f406611a;
            }
        }

        public s() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            kotlin.reflect.d dVarB = kotlin.jvm.internal.m0.f406844a.b(Thread.class);
            a aVar = a.f437986l;
            u22.getClass();
            u22.a(aVar, ((InterfaceC42819t) dVarB).f().getName());
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$t;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class t extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437987l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                String strA;
                M1.c cVar2 = cVar;
                LinkedHashSet<String> linkedHashSet = u22.f438215a;
                StringBuilder sb2 = new StringBuilder("Message.what = ");
                K1 k1J = cVar2.j("android.os.Message", "what");
                if (k1J == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                sb2.append(k1J.f438095c.b());
                linkedHashSet.add(sb2.toString());
                C2.f438011a.getClass();
                C48240c2 c48240c2 = cVar2.f438149c;
                Long l12 = (Long) c48240c2.getF438253b().a("heapDumpUptimeMillis", new D2(c48240c2));
                K1 k1J2 = cVar2.j("android.os.Message", "when");
                if (k1J2 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                Long lC2 = k1J2.f438095c.c();
                if (lC2 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                long jLongValue = lC2.longValue();
                if (l12 != null) {
                    long jLongValue2 = jLongValue - l12.longValue();
                    if (jLongValue2 > 0) {
                        strA = AK.c.j(jLongValue2, " ms after heap dump)", androidx.compose.foundation.H.q(jLongValue, "Message.when = ", " ("));
                    } else {
                        StringBuilder sbQ = androidx.compose.foundation.H.q(jLongValue, "Message.when = ", " (");
                        sbQ.append(Math.abs(jLongValue2));
                        sbQ.append(" ms before heap dump)");
                        strA = sbQ.toString();
                    }
                } else {
                    strA = C21030p.a(jLongValue, "Message.when = ");
                }
                linkedHashSet.add(strA);
                StringBuilder sb3 = new StringBuilder("Message.obj = ");
                K1 k1J3 = cVar2.j("android.os.Message", "obj");
                if (k1J3 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                sb3.append(k1J3.f438095c.e());
                linkedHashSet.add(sb3.toString());
                StringBuilder sb4 = new StringBuilder("Message.callback = ");
                K1 k1J4 = cVar2.j("android.os.Message", "callback");
                if (k1J4 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                sb4.append(k1J4.f438095c.e());
                linkedHashSet.add(sb4.toString());
                StringBuilder sb5 = new StringBuilder("Message.target = ");
                K1 k1J5 = cVar2.j("android.os.Message", "target");
                if (k1J5 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                sb5.append(k1J5.f438095c.e());
                linkedHashSet.add(sb5.toString());
                return kotlin.G0.f406611a;
            }
        }

        public t() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437987l, "android.os.Message");
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$v;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class v extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437990l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                K1 k1D = C48354w.d(cVar, "mortar.Presenter", "view");
                u22.f438215a.add(C48354w.a(k1D, k1D.f438095c.h() ? "null" : "not null"));
                return kotlin.G0.f406611a;
            }
        }

        public v() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437990l, "mortar.Presenter");
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$x;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class x extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437993l = new a();

            public a() {
                super(2);
            }

            @Override // Y41.p
            public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                String strI;
                String strI2;
                String strG;
                M1.c cVar2 = cVar;
                LinkedHashSet<String> linkedHashSet = u22.f438215a;
                K1 k1J = cVar2.j("android.animation.ObjectAnimator", "mPropertyName");
                if (k1J == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                M1.c cVarA = k1J.a();
                String str = "null";
                if (cVarA == null || (strI = cVarA.i()) == null) {
                    strI = "null";
                }
                linkedHashSet.add("mPropertyName = ".concat(strI));
                K1 k1J2 = cVar2.j("android.animation.ObjectAnimator", "mProperty");
                if (k1J2 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                M1.c cVarA2 = k1J2.a();
                if (cVarA2 == null) {
                    linkedHashSet.add("mProperty = null");
                } else {
                    K1 k1J3 = cVarA2.j("android.util.Property", "mName");
                    if (k1J3 == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    M1.c cVarA3 = k1J3.a();
                    if (cVarA3 == null || (strI2 = cVarA3.i()) == null) {
                        strI2 = "null";
                    }
                    linkedHashSet.add("mProperty.mName = ".concat(strI2));
                    K1 k1J4 = cVarA2.j("android.util.Property", "mType");
                    if (k1J4 == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    M1 m1E = k1J4.f438095c.e();
                    M1.b bVar = (m1E == null || !(m1E instanceof M1.b)) ? null : (M1.b) m1E;
                    if (bVar != null && (strG = bVar.g()) != null) {
                        str = strG;
                    }
                    linkedHashSet.add("mProperty.mType = ".concat(str));
                }
                StringBuilder sb2 = new StringBuilder("mInitialized = ");
                K1 k1J5 = cVar2.j("android.animation.ValueAnimator", "mInitialized");
                if (k1J5 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                Boolean boolA = k1J5.f438095c.a();
                if (boolA == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                sb2.append(boolA.booleanValue());
                linkedHashSet.add(sb2.toString());
                StringBuilder sb3 = new StringBuilder("mStarted = ");
                K1 k1J6 = cVar2.j("android.animation.ValueAnimator", "mStarted");
                if (k1J6 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                Boolean boolA2 = k1J6.f438095c.a();
                if (boolA2 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                sb3.append(boolA2.booleanValue());
                linkedHashSet.add(sb3.toString());
                StringBuilder sb4 = new StringBuilder("mRunning = ");
                K1 k1J7 = cVar2.j("android.animation.ValueAnimator", "mRunning");
                if (k1J7 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                Boolean boolA3 = k1J7.f438095c.a();
                if (boolA3 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                sb4.append(boolA3.booleanValue());
                linkedHashSet.add(sb4.toString());
                StringBuilder sb5 = new StringBuilder("mAnimationEndRequested = ");
                K1 k1J8 = cVar2.j("android.animation.ValueAnimator", "mAnimationEndRequested");
                if (k1J8 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                Boolean boolA4 = k1J8.f438095c.a();
                if (boolA4 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                sb5.append(boolA4.booleanValue());
                linkedHashSet.add(sb5.toString());
                StringBuilder sb6 = new StringBuilder("mDuration = ");
                K1 k1J9 = cVar2.j("android.animation.ValueAnimator", "mDuration");
                if (k1J9 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                Long lC2 = k1J9.f438095c.c();
                if (lC2 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                sb6.append(lC2.longValue());
                linkedHashSet.add(sb6.toString());
                StringBuilder sb7 = new StringBuilder("mStartDelay = ");
                K1 k1J10 = cVar2.j("android.animation.ValueAnimator", "mStartDelay");
                if (k1J10 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                Long lC3 = k1J10.f438095c.c();
                if (lC3 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                sb7.append(lC3.longValue());
                linkedHashSet.add(sb7.toString());
                K1 k1J11 = cVar2.j("android.animation.ValueAnimator", "mRepeatCount");
                if (k1J11 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                Integer numB = k1J11.f438095c.b();
                if (numB == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                int iIntValue = numB.intValue();
                StringBuilder sb8 = new StringBuilder("mRepeatCount = ");
                Object obj = numB;
                if (iIntValue == -1) {
                    obj = "INFINITE (-1)";
                }
                sb8.append(obj);
                linkedHashSet.add(sb8.toString());
                K1 k1J12 = cVar2.j("android.animation.ValueAnimator", "mRepeatMode");
                if (k1J12 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                Integer numB2 = k1J12.f438095c.b();
                if (numB2 == null) {
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
                int iIntValue2 = numB2.intValue();
                linkedHashSet.add("mRepeatMode = " + (iIntValue2 != 1 ? iIntValue2 != 2 ? androidx.appcompat.app.r.p("Unknown (", iIntValue2, ')') : "REVERSE (2)" : "RESTART (1)"));
                return kotlin.G0.f406611a;
            }
        }

        public x() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437993l, "android.animation.ObjectAnimator");
        }
    }

    /* compiled from: AndroidObjectInspectors.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lshark/AndroidObjectInspectors$y;", "Lshark/AndroidObjectInspectors;", "shark-android"}, k = 1, mv = {1, 4, 1})
    public static final class y extends AndroidObjectInspectors {

        /* compiled from: AndroidObjectInspectors.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
        public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f437994l = new a();

            public a() {
                super(2);
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException
             */
            /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
            @Override // Y41.p
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final kotlin.G0 invoke(shark.U2 r4, shark.M1.c r5) {
                /*
                    r3 = this;
                    shark.U2 r4 = (shark.U2) r4
                    shark.M1$c r5 = (shark.M1.c) r5
                    java.lang.String r0 = "androidx.compose.runtime.Recomposer"
                    java.lang.String r1 = "_state"
                    shark.K1 r5 = r5.j(r0, r1)
                    r0 = 0
                    if (r5 == 0) goto La1
                    shark.M1$c r5 = r5.a()
                    if (r5 == 0) goto L9d
                    java.lang.String r2 = "kotlinx.coroutines.flow.StateFlowImpl"
                    shark.K1 r5 = r5.j(r2, r1)
                    if (r5 == 0) goto L22
                    shark.M1$c r5 = r5.a()
                    goto L23
                L22:
                    r5 = r0
                L23:
                    if (r5 == 0) goto L9a
                    java.lang.String r1 = "java.lang.Enum"
                    java.lang.String r2 = "name"
                    shark.K1 r5 = r5.j(r1, r2)
                    if (r5 == 0) goto L96
                    shark.M1$c r5 = r5.a()
                    if (r5 == 0) goto L92
                    java.lang.String r5 = r5.i()
                    if (r5 == 0) goto L8e
                    java.lang.String r0 = "Recomposer is in state "
                    java.lang.String r0 = r0.concat(r5)
                    int r1 = r5.hashCode()
                    switch(r1) {
                        case -1513699032: goto L80;
                        case -491727939: goto L72;
                        case -105652586: goto L64;
                        case 2274292: goto L5b;
                        case 89309323: goto L52;
                        case 1443627140: goto L49;
                        default: goto L48;
                    }
                L48:
                    goto L9a
                L49:
                    java.lang.String r1 = "ShuttingDown"
                    boolean r5 = r5.equals(r1)
                    if (r5 == 0) goto L9a
                    goto L6c
                L52:
                    java.lang.String r1 = "Inactive"
                    boolean r5 = r5.equals(r1)
                    if (r5 == 0) goto L9a
                    goto L7a
                L5b:
                    java.lang.String r1 = "Idle"
                    boolean r5 = r5.equals(r1)
                    if (r5 == 0) goto L9a
                    goto L88
                L64:
                    java.lang.String r1 = "ShutDown"
                    boolean r5 = r5.equals(r1)
                    if (r5 == 0) goto L9a
                L6c:
                    java.util.LinkedHashSet r4 = r4.f438216b
                    r4.add(r0)
                    goto L9a
                L72:
                    java.lang.String r1 = "InactivePendingWork"
                    boolean r5 = r5.equals(r1)
                    if (r5 == 0) goto L9a
                L7a:
                    java.util.LinkedHashSet<java.lang.String> r4 = r4.f438215a
                    r4.add(r0)
                    goto L9a
                L80:
                    java.lang.String r1 = "PendingWork"
                    boolean r5 = r5.equals(r1)
                    if (r5 == 0) goto L9a
                L88:
                    java.util.LinkedHashSet r4 = r4.f438217c
                    r4.add(r0)
                    goto L9a
                L8e:
                    kotlin.jvm.internal.L.k()
                    throw r0
                L92:
                    kotlin.jvm.internal.L.k()
                    throw r0
                L96:
                    kotlin.jvm.internal.L.k()
                    throw r0
                L9a:
                    kotlin.G0 r4 = kotlin.G0.f406611a
                    return r4
                L9d:
                    kotlin.jvm.internal.L.k()
                    throw r0
                La1:
                    kotlin.jvm.internal.L.k()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: shark.AndroidObjectInspectors.y.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        public y() {
            throw null;
        }

        @Override // shark.R2
        public final void a(@Y61.k U2 u22) {
            u22.a(a.f437994l, "androidx.compose.runtime.Recomposer");
        }
    }

    static {
        D d12 = new D();
        f437947c = d12;
        f437948d = new AndroidObjectInspectors[]{d12, new AndroidObjectInspectors() { // from class: shark.AndroidObjectInspectors.n

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f437979g = C48315m.f438652l;

            /* compiled from: AndroidObjectInspectors.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f437980l = new a();

                public a() {
                    super(2);
                }

                @Override // Y41.p
                public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                    U2 u23 = u22;
                    AndroidObjectInspectors androidObjectInspectors = AndroidObjectInspectors.f437947c;
                    K1 k1J = cVar.j("android.widget.Editor", "mTextView");
                    if (k1J != null) {
                        X1 x12 = k1J.f438095c;
                        if (!x12.h()) {
                            M1 m1E = x12.e();
                            if (m1E == null) {
                                kotlin.jvm.internal.L.k();
                                throw null;
                            }
                            U2 u24 = new U2(m1E);
                            ((D) androidObjectInspectors).a(u24);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(M1.a.a(M1.f438144b, k1J.f438093a.g()));
                            sb2.append('#');
                            String strC = C22026a.c(sb2, k1J.f438094b, ':');
                            LinkedHashSet<String> linkedHashSet = u23.f438215a;
                            LinkedHashSet<String> linkedHashSet2 = u24.f438215a;
                            ArrayList arrayList = new ArrayList(C42745f0.q(linkedHashSet2, 10));
                            Iterator<T> it = linkedHashSet2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(strC + ' ' + ((String) it.next()));
                            }
                            C42745f0.h(arrayList, linkedHashSet);
                            LinkedHashSet linkedHashSet3 = u23.f438216b;
                            LinkedHashSet linkedHashSet4 = u24.f438216b;
                            ArrayList arrayList2 = new ArrayList(C42745f0.q(linkedHashSet4, 10));
                            Iterator it2 = linkedHashSet4.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(strC + ' ' + ((String) it2.next()));
                            }
                            C42745f0.h(arrayList2, linkedHashSet3);
                            LinkedHashSet linkedHashSet5 = u23.f438217c;
                            LinkedHashSet linkedHashSet6 = u24.f438217c;
                            ArrayList arrayList3 = new ArrayList(C42745f0.q(linkedHashSet6, 10));
                            Iterator it3 = linkedHashSet6.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(strC + ' ' + ((String) it3.next()));
                            }
                            C42745f0.h(arrayList3, linkedHashSet5);
                        }
                    }
                    return kotlin.G0.f406611a;
                }
            }

            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                u22.a(a.f437980l, "android.widget.Editor");
            }

            @Override // shark.AndroidObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f437979g;
            }
        }, new AndroidObjectInspectors() { // from class: shark.AndroidObjectInspectors.a

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f437963g = C48253g.f438279l;

            /* compiled from: AndroidObjectInspectors.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            /* renamed from: shark.AndroidObjectInspectors$a$a, reason: collision with other inner class name */
            public static final class C12626a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public static final C12626a f437964l = new C12626a();

                public C12626a() {
                    super(2);
                }

                @Override // Y41.p
                public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                    U2 u23 = u22;
                    K1 k1J = cVar.j("android.app.Activity", "mDestroyed");
                    if (k1J != null) {
                        Boolean boolA = k1J.f438095c.a();
                        if (boolA == null) {
                            kotlin.jvm.internal.L.k();
                            throw null;
                        }
                        if (boolA.booleanValue()) {
                            u23.f438216b.add(C48354w.a(k1J, "true"));
                        } else {
                            u23.f438217c.add(C48354w.a(k1J, "false"));
                        }
                    }
                    return kotlin.G0.f406611a;
                }
            }

            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                u22.a(C12626a.f437964l, "android.app.Activity");
            }

            @Override // shark.AndroidObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f437963g;
            }
        }, new AndroidObjectInspectors() { // from class: shark.AndroidObjectInspectors.z

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f437995g = C48331q.f438677l;

            /* compiled from: AndroidObjectInspectors.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f437996l = new a();

                public a() {
                    super(2);
                }

                @Override // Y41.p
                public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                    U2 u23 = u22;
                    M1.c cVar2 = cVar;
                    C48325o1 c48325o1 = C48325o1.f438662a;
                    C48240c2 c48240c2 = cVar2.f438149c;
                    c48325o1.getClass();
                    if (((List) c48240c2.getF438253b().a(C48325o1.class.getName(), new C48321n1(c48240c2))).contains(Long.valueOf(cVar2.f438151e))) {
                        u23.f438217c.add("Service held by ActivityThread");
                    } else {
                        u23.f438216b.add("Service not held by ActivityThread");
                    }
                    return kotlin.G0.f406611a;
                }
            }

            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                u22.a(a.f437996l, "android.app.Service");
            }

            @Override // shark.AndroidObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f437995g;
            }
        }, new h("CONTEXT_FIELD", 4, null), new AndroidObjectInspectors() { // from class: shark.AndroidObjectInspectors.j

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f437975g = C48307k.f438640l;

            /* compiled from: AndroidObjectInspectors.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$b;", "it", "", "invoke", "(Lshark/M1$b;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends kotlin.jvm.internal.N implements Y41.l<M1.b, String> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f437976l = new a();

                public a() {
                    super(1);
                }

                @Override // Y41.l
                public final String invoke(M1.b bVar) {
                    return bVar.g();
                }
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException
             */
            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                Object next;
                M1 m12 = u22.f438218d;
                if (m12 instanceof M1.c) {
                    M1.c cVar = (M1.c) m12;
                    o0.a aVar = new o0.a(new kotlin.sequences.o0(C43033p.u(N1.f438163l, cVar.e()), a.f437976l));
                    while (true) {
                        if (aVar.f410559b.hasNext()) {
                            next = aVar.next();
                            String str = (String) next;
                            switch (str.hashCode()) {
                                case -880360069:
                                    if (str.equals("android.app.Activity")) {
                                        break;
                                    }
                                case 735120228:
                                    if (str.equals("android.app.Application")) {
                                        break;
                                    }
                                case 762246857:
                                    if (str.equals("android.app.Service")) {
                                        break;
                                    }
                                case 774146168:
                                    if (str.equals("android.content.ContextWrapper")) {
                                        break;
                                    }
                            }
                        } else {
                            next = null;
                        }
                    }
                    if (kotlin.jvm.internal.L.f((String) next, "android.content.ContextWrapper")) {
                        M1.c cVarG = C48354w.g(cVar);
                        LinkedHashSet<String> linkedHashSet = u22.f438215a;
                        if (cVarG == null) {
                            linkedHashSet.add(cVar.g() + " does not wrap a known Android context");
                            return;
                        }
                        if (!cVarG.h("android.app.Activity")) {
                            if (cVarG.h("android.app.Application")) {
                                linkedHashSet.add(cVar.g() + " wraps an Application context");
                                return;
                            }
                            linkedHashSet.add(cVar.g() + " wraps a Service context");
                            return;
                        }
                        K1 k1J = cVarG.j("android.app.Activity", "mDestroyed");
                        if (k1J != null) {
                            Boolean boolA = k1J.f438095c.a();
                            if (boolA == null) {
                                kotlin.jvm.internal.L.k();
                                throw null;
                            }
                            if (!boolA.booleanValue()) {
                                linkedHashSet.add(cVar.g() + " wraps an Activity with Activity.mDestroyed false");
                                return;
                            }
                            u22.f438216b.add(cVar.g() + " wraps an Activity with Activity.mDestroyed true");
                        }
                    }
                }
            }

            @Override // shark.AndroidObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f437975g;
            }
        }, new AndroidObjectInspectors() { // from class: shark.AndroidObjectInspectors.f

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f437970g = C48261i.f438287l;

            /* compiled from: AndroidObjectInspectors.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            /* renamed from: shark.AndroidObjectInspectors$f$a */
            public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f437971l = new a();

                public a() {
                    super(2);
                }

                @Override // Y41.p
                public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                    U2 u23 = u22;
                    M1.c cVar2 = cVar;
                    K1 k1J = cVar2.j("android.app.ApplicationContextManager", "mContext");
                    if (k1J == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    M1.c cVarA = k1J.a();
                    if (cVarA == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    K1 k1J2 = cVarA.j("android.app.ContextImpl", "mOuterContext");
                    if (k1J2 == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    M1.c cVarA2 = k1J2.a();
                    if (cVarA2 != null) {
                        C48354w.e(u23, cVarA2, cVar2, "ApplicationContextManager.mContext");
                        return kotlin.G0.f406611a;
                    }
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
            }

            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                u22.a(a.f437971l, "android.app.ApplicationContextManager");
            }

            @Override // shark.AndroidObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f437970g;
            }
        }, new AndroidObjectInspectors() { // from class: shark.AndroidObjectInspectors.i

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f437973g = C48303j.f438634l;

            /* compiled from: AndroidObjectInspectors.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f437974l = new a();

                public a() {
                    super(2);
                }

                @Override // Y41.p
                public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                    U2 u23 = u22;
                    M1.c cVar2 = cVar;
                    K1 k1J = cVar2.j("android.app.ContextImpl", "mOuterContext");
                    if (k1J == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    M1.c cVarA = k1J.a();
                    if (cVarA != null) {
                        C48354w.e(u23, cVarA, cVar2, "ContextImpl");
                        return kotlin.G0.f406611a;
                    }
                    kotlin.jvm.internal.L.k();
                    throw null;
                }
            }

            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                u22.a(a.f437974l, "android.app.ContextImpl");
            }

            @Override // shark.AndroidObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f437973g;
            }
        }, new m("DIALOG", 8, null), new C48184b("ACTIVITY_THREAD", 9, null), new C48187e("APPLICATION", 10, null), new p("INPUT_METHOD_MANAGER", 11, null), new AndroidObjectInspectors() { // from class: shark.AndroidObjectInspectors.o

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f437981g = C48319n.f438656l;

            /* compiled from: AndroidObjectInspectors.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f437982l = new a();

                public a() {
                    super(2);
                }

                @Override // Y41.p
                public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                    U2 u23 = u22;
                    M1.c cVar2 = cVar;
                    K1 k1J = cVar2.j("android.app.Fragment", "mFragmentManager");
                    if (k1J == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    if (k1J.f438095c.h()) {
                        u23.f438216b.add(C48354w.a(k1J, "null"));
                    } else {
                        u23.f438217c.add(C48354w.a(k1J, "not null"));
                    }
                    K1 k1J2 = cVar2.j("android.app.Fragment", "mTag");
                    String strI = k1J2 != null ? k1J2.f438095c.i() : null;
                    if (strI != null && strI.length() != 0) {
                        u23.f438215a.add("Fragment.mTag=".concat(strI));
                    }
                    return kotlin.G0.f406611a;
                }
            }

            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                u22.a(a.f437982l, "android.app.Fragment");
            }

            @Override // shark.AndroidObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f437981g;
            }
        }, new B(), new AndroidObjectInspectors() { // from class: shark.AndroidObjectInspectors.c

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f437966g = C48257h.f438282l;

            /* compiled from: AndroidObjectInspectors.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            /* renamed from: shark.AndroidObjectInspectors$c$a */
            public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f437967l = new a();

                public a() {
                    super(2);
                }

                @Override // Y41.p
                public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                    U2 u23 = u22;
                    M1.c cVar2 = cVar;
                    K1 k1J = cVar2.j("androidx.fragment.app.Fragment", "mLifecycleRegistry");
                    if (k1J == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    M1.c cVarA = k1J.a();
                    LinkedHashSet<String> linkedHashSet = u23.f438215a;
                    if (cVarA != null) {
                        String strB = C48354w.b(cVarA);
                        String strConcat = "Fragment.mLifecycleRegistry.state is ".concat(strB);
                        if (strB.equals("DESTROYED")) {
                            u23.f438216b.add(strConcat);
                        } else {
                            u23.f438217c.add(strConcat);
                        }
                    } else {
                        linkedHashSet.add("Fragment.mLifecycleRegistry = null");
                    }
                    K1 k1J2 = cVar2.j("androidx.fragment.app.Fragment", "mTag");
                    String strI = k1J2 != null ? k1J2.f438095c.i() : null;
                    if (strI != null && strI.length() != 0) {
                        linkedHashSet.add("Fragment.mTag = ".concat(strI));
                    }
                    return kotlin.G0.f406611a;
                }
            }

            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                u22.a(a.f437967l, "androidx.fragment.app.Fragment");
            }

            @Override // shark.AndroidObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f437966g;
            }
        }, new AndroidObjectInspectors() { // from class: shark.AndroidObjectInspectors.u

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f437988g = C48323o.f438660l;

            /* compiled from: AndroidObjectInspectors.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f437989l = new a();

                public a() {
                    super(2);
                }

                @Override // Y41.p
                public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                    U2 u23 = u22;
                    M1.c cVar2 = cVar;
                    K1 k1J = cVar2.j("android.os.MessageQueue", "mQuitting");
                    if (k1J == null && (k1J = cVar2.j("android.os.MessageQueue", "mQuiting")) == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    Boolean boolA = k1J.f438095c.a();
                    if (boolA == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    if (boolA.booleanValue()) {
                        u23.f438216b.add(C48354w.a(k1J, "true"));
                    } else {
                        u23.f438217c.add(C48354w.a(k1J, "false"));
                    }
                    K1 k1J2 = cVar2.j("android.os.MessageQueue", "mMessages");
                    if (k1J2 == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    M1.c cVarA = k1J2.a();
                    if (cVarA != null) {
                        K1 k1J3 = cVarA.j("android.os.Message", "target");
                        if (k1J3 == null) {
                            kotlin.jvm.internal.L.k();
                            throw null;
                        }
                        M1.c cVarA2 = k1J3.a();
                        if (cVarA2 != null) {
                            K1 k1J4 = cVarA2.j("android.os.Handler", "mLooper");
                            if (k1J4 == null) {
                                kotlin.jvm.internal.L.k();
                                throw null;
                            }
                            M1.c cVarA3 = k1J4.a();
                            if (cVarA3 != null) {
                                K1 k1J5 = cVarA3.j("android.os.Looper", "mThread");
                                if (k1J5 == null) {
                                    kotlin.jvm.internal.L.k();
                                    throw null;
                                }
                                M1.c cVarA4 = k1J5.a();
                                if (cVarA4 == null) {
                                    kotlin.jvm.internal.L.k();
                                    throw null;
                                }
                                K1 k1J6 = cVarA4.j(((InterfaceC42819t) kotlin.jvm.internal.m0.f406844a.b(Thread.class)).f().getName(), "name");
                                if (k1J6 == null) {
                                    kotlin.jvm.internal.L.k();
                                    throw null;
                                }
                                String strI = k1J6.f438095c.i();
                                u23.f438215a.add("HandlerThread: \"" + strI + '\"');
                            }
                        }
                    }
                    return kotlin.G0.f406611a;
                }
            }

            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                u22.a(a.f437989l, "android.os.MessageQueue");
            }

            @Override // shark.AndroidObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f437988g;
            }
        }, new r("LOADED_APK", 16, null), new v("MORTAR_PRESENTER", 17, null), new AndroidObjectInspectors() { // from class: shark.AndroidObjectInspectors.w

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f437991g = C48327p.f438664l;

            /* compiled from: AndroidObjectInspectors.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f437992l = new a();

                public a() {
                    super(2);
                }

                @Override // Y41.p
                public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                    U2 u23 = u22;
                    M1.c cVar2 = cVar;
                    Boolean boolA = C48354w.d(cVar2, "mortar.MortarScope", "dead").f438095c.a();
                    if (boolA == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    boolean zBooleanValue = boolA.booleanValue();
                    String strI = C48354w.d(cVar2, "mortar.MortarScope", "name").f438095c.i();
                    if (zBooleanValue) {
                        u23.f438216b.add("mortar.MortarScope.dead is true for scope " + strI);
                    } else {
                        u23.f438217c.add("mortar.MortarScope.dead is false for scope " + strI);
                    }
                    return kotlin.G0.f406611a;
                }
            }

            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                u22.a(a.f437992l, "mortar.MortarScope");
            }

            @Override // shark.AndroidObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f437991g;
            }
        }, new k("COORDINATOR", 19, null), new s("MAIN_THREAD", 20, null), new AndroidObjectInspectors() { // from class: shark.AndroidObjectInspectors.E

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f437959g = C48346u.f438766l;

            /* compiled from: AndroidObjectInspectors.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f437960l = new a();

                public a() {
                    super(2);
                }

                @Override // Y41.p
                public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                    String strA;
                    U2 u23 = u22;
                    M1.c cVar2 = cVar;
                    K1 k1J = cVar2.j("android.view.ViewRootImpl", "mView");
                    if (k1J == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    boolean zH2 = k1J.f438095c.h();
                    LinkedHashSet linkedHashSet = u23.f438216b;
                    LinkedHashSet<String> linkedHashSet2 = u23.f438215a;
                    if (zH2) {
                        linkedHashSet.add(C48354w.a(k1J, "null"));
                    } else {
                        K1 k1J2 = cVar2.j("android.view.ViewRootImpl", "mContext");
                        if (k1J2 != null) {
                            M1.c cVarA = k1J2.a();
                            if (cVarA == null) {
                                kotlin.jvm.internal.L.k();
                                throw null;
                            }
                            M1.c cVarF = C48354w.f(cVarA);
                            if (cVarF != null) {
                                K1 k1J3 = cVarF.j("android.app.Activity", "mDestroyed");
                                if (kotlin.jvm.internal.L.f(k1J3 != null ? k1J3.f438095c.a() : null, Boolean.TRUE)) {
                                    linkedHashSet.add("ViewRootImpl.mContext references a destroyed activity, did you forget to cancel toasts or dismiss dialogs?");
                                }
                            }
                        }
                        linkedHashSet2.add(C48354w.a(k1J, "not null"));
                    }
                    K1 k1J4 = cVar2.j("android.view.ViewRootImpl", "mWindowAttributes");
                    if (k1J4 == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    M1.c cVarA2 = k1J4.a();
                    if (cVarA2 == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    K1 k1J5 = cVarA2.j("android.view.WindowManager$LayoutParams", "mTitle");
                    if (k1J5 == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    if (k1J5.f438095c.g()) {
                        M1.c cVarA3 = k1J5.a();
                        if (cVarA3 == null) {
                            kotlin.jvm.internal.L.k();
                            throw null;
                        }
                        String strI = cVarA3.i();
                        if (strI == null) {
                            kotlin.jvm.internal.L.k();
                            throw null;
                        }
                        strA = C22491k0.a('\"', "mWindowAttributes.mTitle = \"", strI);
                    } else {
                        strA = "mWindowAttributes.mTitle is null";
                    }
                    linkedHashSet2.add(strA);
                    K1 k1J6 = cVarA2.j("android.view.WindowManager$LayoutParams", "type");
                    if (k1J6 == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    Integer numB = k1J6.f438095c.b();
                    if (numB == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    int iIntValue = numB.intValue();
                    linkedHashSet2.add("mWindowAttributes.type = " + iIntValue + (iIntValue == 2005 ? " (Toast)" : ""));
                    return kotlin.G0.f406611a;
                }
            }

            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                u22.a(a.f437960l, "android.view.ViewRootImpl");
            }

            @Override // shark.AndroidObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f437959g;
            }
        }, new AndroidObjectInspectors() { // from class: shark.AndroidObjectInspectors.F

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f437961g = C48350v.f438786l;

            /* compiled from: AndroidObjectInspectors.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f437962l = new a();

                public a() {
                    super(2);
                }

                @Override // Y41.p
                public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                    U2 u23 = u22;
                    K1 k1J = cVar.j("android.view.Window", "mDestroyed");
                    if (k1J == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    Boolean boolA = k1J.f438095c.a();
                    if (boolA == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    if (boolA.booleanValue()) {
                        u23.f438216b.add(C48354w.a(k1J, "true"));
                    } else {
                        u23.f438215a.add(C48354w.a(k1J, "false"));
                    }
                    return kotlin.G0.f406611a;
                }
            }

            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                u22.a(a.f437962l, "android.view.Window");
            }

            @Override // shark.AndroidObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f437961g;
            }
        }, new t("MESSAGE", 23, null), new AndroidObjectInspectors() { // from class: shark.AndroidObjectInspectors.C

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Y41.l<M1, Boolean> f437955g = C48338s.f438694l;

            /* compiled from: AndroidObjectInspectors.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lshark/U2;", "Lshark/M1$c;", "instance", "Lkotlin/G0;", "invoke", "(Lshark/U2;Lshark/M1$c;)V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
            public static final class a extends kotlin.jvm.internal.N implements Y41.p<U2, M1.c, kotlin.G0> {

                /* renamed from: l, reason: collision with root package name */
                public static final a f437956l = new a();

                public a() {
                    super(2);
                }

                @Override // Y41.p
                public final kotlin.G0 invoke(U2 u22, M1.c cVar) {
                    U2 u23 = u22;
                    K1 k1J = cVar.j("android.widget.Toast", "mTN");
                    if (k1J == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    M1 m1E = k1J.f438095c.e();
                    if (m1E == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    M1.c cVarA = m1E.a();
                    if (cVarA == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    K1 k1J2 = cVarA.j("android.widget.Toast$TN", "mWM");
                    if (k1J2 == null) {
                        kotlin.jvm.internal.L.k();
                        throw null;
                    }
                    if (k1J2.f438095c.g()) {
                        K1 k1J3 = cVarA.j("android.widget.Toast$TN", "mView");
                        if (k1J3 == null) {
                            kotlin.jvm.internal.L.k();
                            throw null;
                        }
                        if (k1J3.f438095c.h()) {
                            u23.f438216b.add("This toast is done showing (Toast.mTN.mWM != null && Toast.mTN.mView == null)");
                        } else {
                            u23.f438217c.add("This toast is showing (Toast.mTN.mWM != null && Toast.mTN.mView != null)");
                        }
                    }
                    return kotlin.G0.f406611a;
                }
            }

            @Override // shark.R2
            public final void a(@Y61.k U2 u22) {
                u22.a(a.f437956l, "android.widget.Toast");
            }

            @Override // shark.AndroidObjectInspectors
            @Y61.k
            public final Y41.l<M1, Boolean> b() {
                return this.f437955g;
            }
        }, new y("RECOMPOSER", 25, null), new g("COMPOSITION_IMPL", 26, null), new C48186d("ANIMATOR", 27, null), new x("OBJECT_ANIMATOR", 28, null), new q("LIFECYCLE_REGISTRY", 29, null), new A("STUB", 30, null)};
        f437950f = new l(null);
        ObjectInspectors.f438176f.getClass();
        ArrayList arrayList = ObjectInspectors.f438175e;
        EnumSet enumSetAllOf = EnumSet.allOf(AndroidObjectInspectors.class);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = enumSetAllOf.iterator();
        while (it.hasNext()) {
            Y41.l<M1, Boolean> lVarB = ((AndroidObjectInspectors) it.next()).b();
            if (lVarB != null) {
                arrayList2.add(lVarB);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            final Y41.l lVar = (Y41.l) it2.next();
            arrayList3.add(new C48356w1.a() { // from class: shark.l
                @Override // shark.C48356w1.a
                public final boolean a(@Y61.k M1 m12) {
                    return ((Boolean) lVar.invoke(m12)).booleanValue();
                }
            });
        }
        f437949e = C42745f0.h0(arrayList3, arrayList);
    }

    public AndroidObjectInspectors() {
        throw null;
    }

    public AndroidObjectInspectors(String str, int i12, C42822w c42822w) {
        this.f437951b = "android.support.v4.app.Fragment";
    }

    public static AndroidObjectInspectors valueOf(String str) {
        return (AndroidObjectInspectors) Enum.valueOf(AndroidObjectInspectors.class, str);
    }

    public static AndroidObjectInspectors[] values() {
        return (AndroidObjectInspectors[]) f437948d.clone();
    }

    @Y61.l
    public Y41.l<M1, Boolean> b() {
        return null;
    }
}
