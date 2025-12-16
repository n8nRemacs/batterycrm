package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42966b;
import kotlin.reflect.jvm.internal.impl.utils.g;
import u51.InterfaceC48806h;

/* compiled from: AbstractTypeChecker.kt */
@kotlin.jvm.internal.s0
/* loaded from: classes8.dex */
public class TypeCheckerState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f410051a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f410052b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42966b f410053c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.checker.g f410054d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.checker.i f410055e;

    /* renamed from: f, reason: collision with root package name */
    public int f410056f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public ArrayDeque<u51.i> f410057g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public kotlin.reflect.jvm.internal.impl.utils.g f410058h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AbstractTypeChecker.kt */
    public static final class LowerCapturedTypePolicy {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ LowerCapturedTypePolicy[] f410059b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f410060c;

        static {
            LowerCapturedTypePolicy[] lowerCapturedTypePolicyArr = {new LowerCapturedTypePolicy("CHECK_ONLY_LOWER", 0), new LowerCapturedTypePolicy("CHECK_SUBTYPE_AND_LOWER", 1), new LowerCapturedTypePolicy("SKIP_LOWER", 2)};
            f410059b = lowerCapturedTypePolicyArr;
            f410060c = kotlin.enums.c.a(lowerCapturedTypePolicyArr);
        }

        public LowerCapturedTypePolicy() {
            throw null;
        }

        public static LowerCapturedTypePolicy valueOf(String str) {
            return (LowerCapturedTypePolicy) Enum.valueOf(LowerCapturedTypePolicy.class, str);
        }

        public static LowerCapturedTypePolicy[] values() {
            return (LowerCapturedTypePolicy[]) f410059b.clone();
        }
    }

    /* compiled from: AbstractTypeChecker.kt */
    public interface a {

        /* compiled from: AbstractTypeChecker.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$a$a, reason: collision with other inner class name */
        public static final class C11694a implements a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f410061a;

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.a
            public final void a(@Y61.k Y41.a<Boolean> aVar) {
                if (this.f410061a) {
                    return;
                }
                this.f410061a = ((Boolean) ((C42977g) aVar).invoke()).booleanValue();
            }
        }

        void a(@Y61.k Y41.a<Boolean> aVar);
    }

    /* compiled from: AbstractTypeChecker.kt */
    public static abstract class b {

        /* compiled from: AbstractTypeChecker.kt */
        public static abstract class a extends b {
            public a() {
                super(null);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        @kotlin.jvm.internal.s0
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b, reason: collision with other inner class name */
        public static final class C11695b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C11695b f410062a = new C11695b();

            public C11695b() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            @Y61.k
            public final u51.i a(@Y61.k TypeCheckerState typeCheckerState, @Y61.k InterfaceC48806h interfaceC48806h) {
                return typeCheckerState.f410053c.i(interfaceC48806h);
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f410063a = new c();

            public c() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            public final u51.i a(TypeCheckerState typeCheckerState, InterfaceC48806h interfaceC48806h) {
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* compiled from: AbstractTypeChecker.kt */
        @kotlin.jvm.internal.s0
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final d f410064a = new d();

            public d() {
                super(null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b
            @Y61.k
            public final u51.i a(@Y61.k TypeCheckerState typeCheckerState, @Y61.k InterfaceC48806h interfaceC48806h) {
                return typeCheckerState.f410053c.i0(interfaceC48806h);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        @Y61.k
        public abstract u51.i a(@Y61.k TypeCheckerState typeCheckerState, @Y61.k InterfaceC48806h interfaceC48806h);

        public b() {
        }
    }

    public TypeCheckerState(boolean z12, boolean z13, @Y61.k InterfaceC42966b interfaceC42966b, @Y61.k kotlin.reflect.jvm.internal.impl.types.checker.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        this.f410051a = z12;
        this.f410052b = z13;
        this.f410053c = interfaceC42966b;
        this.f410054d = gVar;
        this.f410055e = iVar;
    }

    public final void a() {
        this.f410057g.clear();
        this.f410058h.clear();
    }

    public boolean b(@Y61.k InterfaceC48806h interfaceC48806h, @Y61.k InterfaceC48806h interfaceC48806h2) {
        return true;
    }

    public final void c() {
        if (this.f410057g == null) {
            this.f410057g = new ArrayDeque<>(4);
        }
        if (this.f410058h == null) {
            kotlin.reflect.jvm.internal.impl.utils.g.f410367d.getClass();
            this.f410058h = g.b.a();
        }
    }
}
