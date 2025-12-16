package kotlin.reflect.jvm.internal.impl.descriptors;

import com.avito.android.remote.model.UserTypeCode;

/* compiled from: Visibilities.kt */
/* loaded from: classes8.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final o0 f407771a = new o0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlin.collections.builders.d f407772b;

    /* compiled from: Visibilities.kt */
    public static final class a extends p0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final a f407773c = new a();

        public a() {
            super("inherited", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class b extends p0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final b f407774c = new b();

        public b() {
            super("internal", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class c extends p0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final c f407775c = new c();

        public c() {
            super("invisible_fake", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class d extends p0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final d f407776c = new d();

        public d() {
            super("local", false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class e extends p0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final e f407777c = new e();

        public e() {
            super(UserTypeCode.PRIVATE, false);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class f extends p0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final f f407778c = new f();

        public f() {
            super("private_to_this", false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.p0
        @Y61.k
        public final String b() {
            return "private/*private to this*/";
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class g extends p0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final g f407779c = new g();

        public g() {
            super("protected", true);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class h extends p0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final h f407780c = new h();

        public h() {
            super("public", true);
        }
    }

    /* compiled from: Visibilities.kt */
    public static final class i extends p0 {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public static final i f407781c = new i();

        public i() {
            super("unknown", false);
        }
    }

    static {
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        dVar.put(f.f407778c, 0);
        dVar.put(e.f407777c, 0);
        dVar.put(b.f407774c, 1);
        dVar.put(g.f407779c, 1);
        dVar.put(h.f407780c, 2);
        f407772b = dVar.b();
    }
}
