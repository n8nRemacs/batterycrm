package g51;

import Y61.k;
import Y61.l;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;

/* compiled from: JavaVisibilities.kt */
/* renamed from: g51.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C40534a {

    /* compiled from: JavaVisibilities.kt */
    /* renamed from: g51.a$a, reason: collision with other inner class name */
    public static final class C11189a extends p0 {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C11189a f396282c = new C11189a();

        public C11189a() {
            super("package", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
        @l
        public final Integer a(@k p0 p0Var) {
            if (this == p0Var) {
                return 0;
            }
            o0.f407771a.getClass();
            return p0Var == o0.e.f407777c || p0Var == o0.f.f407778c ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
        @k
        public final String b() {
            return "public/*package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
        @k
        public final p0 c() {
            return o0.g.f407779c;
        }
    }

    /* compiled from: JavaVisibilities.kt */
    /* renamed from: g51.a$b */
    public static final class b extends p0 {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final b f396283c = new b();

        public b() {
            super("protected_and_package", true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
        @l
        public final Integer a(@k p0 p0Var) {
            if (equals(p0Var)) {
                return 0;
            }
            if (p0Var == o0.b.f407774c) {
                return null;
            }
            o0.f407771a.getClass();
            return p0Var == o0.e.f407777c || p0Var == o0.f.f407778c ? 1 : -1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
        @k
        public final String b() {
            return "protected/*protected and package*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
        @k
        public final p0 c() {
            return o0.g.f407779c;
        }
    }

    /* compiled from: JavaVisibilities.kt */
    /* renamed from: g51.a$c */
    public static final class c extends p0 {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final c f396284c = new c();

        public c() {
            super("protected_static", true);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
        @k
        public final String b() {
            return "protected/*protected static*/";
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
        @k
        public final p0 c() {
            return o0.g.f407779c;
        }
    }

    static {
        new C40534a();
    }
}
