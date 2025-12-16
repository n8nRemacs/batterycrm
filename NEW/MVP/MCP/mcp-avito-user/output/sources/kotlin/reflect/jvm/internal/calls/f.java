package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.jvm.internal.calls.e;

/* compiled from: CallerImpl.kt */
@s0
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\u0007\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/e;", "a", "b", "c", "d", "e", "f", "g", "h", "Lkotlin/reflect/jvm/internal/calls/f$a;", "Lkotlin/reflect/jvm/internal/calls/f$b;", "Lkotlin/reflect/jvm/internal/calls/f$c;", "Lkotlin/reflect/jvm/internal/calls/f$e;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class f<M extends Member> implements kotlin.reflect.jvm.internal.calls.e<M> {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f407116e = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final M f407117a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Type f407118b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Class<?> f407119c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<Type> f407120d;

    /* compiled from: CallerImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$a;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Constructor;", "Lkotlin/reflect/jvm/internal/calls/d;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends f<Constructor<?>> implements kotlin.reflect.jvm.internal.calls.d {

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Object f407121f;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(@Y61.k Constructor<?> constructor, @Y61.l Object obj) {
            Class<?> declaringClass = constructor.getDeclaringClass();
            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
            super(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 2 ? new Type[0] : C42756l.w(1, genericParameterTypes.length - 1, genericParameterTypes)), null);
            this.f407121f = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @Y61.l
        public final Object call(@Y61.k Object[] objArr) {
            e.a.a(this, objArr);
            Constructor constructor = (Constructor) this.f407117a;
            t0 t0Var = new t0(3);
            t0Var.a(this.f407121f);
            t0Var.b(objArr);
            t0Var.a(null);
            ArrayList<Object> arrayList = t0Var.f406850a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$b;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends f<Constructor<?>> {
        public b() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @Y61.l
        public final Object call(@Y61.k Object[] objArr) {
            e.a.a(this, objArr);
            Constructor constructor = (Constructor) this.f407117a;
            t0 t0Var = new t0(2);
            t0Var.b(objArr);
            t0Var.a(null);
            ArrayList<Object> arrayList = t0Var.f406850a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$c;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends f<Constructor<?>> implements kotlin.reflect.jvm.internal.calls.d {

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final Object f407122f;

        public c(@Y61.k Constructor<?> constructor, @Y61.l Object obj) {
            super(constructor, constructor.getDeclaringClass(), null, constructor.getGenericParameterTypes(), null);
            this.f407122f = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @Y61.l
        public final Object call(@Y61.k Object[] objArr) {
            e.a.a(this, objArr);
            Constructor constructor = (Constructor) this.f407117a;
            t0 t0Var = new t0(2);
            t0Var.a(this.f407122f);
            t0Var.b(objArr);
            ArrayList<Object> arrayList = t0Var.f406850a;
            return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
    }

    /* compiled from: CallerImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\b\u0010\u0007J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\u0086\b¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$d;", "", "<init>", "()V", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropFirstAndLast", "dropLast", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(C42822w c42822w) {
            this();
        }

        public d() {
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$e;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Constructor;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends f<Constructor<?>> {
        public e() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @Y61.l
        public final Object call(@Y61.k Object[] objArr) {
            e.a.a(this, objArr);
            return ((Constructor) this.f407117a).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* compiled from: CallerImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Field;", "a", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/calls/f$f$a;", "Lkotlin/reflect/jvm/internal/calls/f$f$b;", "Lkotlin/reflect/jvm/internal/calls/f$f$c;", "Lkotlin/reflect/jvm/internal/calls/f$f$d;", "Lkotlin/reflect/jvm/internal/calls/f$f$e;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.calls.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC11645f extends f<Field> {

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$a;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$a */
        public static final class a extends AbstractC11645f implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: f, reason: collision with root package name */
            @Y61.l
            public final Object f407123f;

            public a(@Y61.k Field field, @Y61.l Object obj) {
                super(field, false, null);
                this.f407123f = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.f.AbstractC11645f, kotlin.reflect.jvm.internal.calls.e
            @Y61.l
            public final Object call(@Y61.k Object[] objArr) {
                e.a.a(this, objArr);
                return ((Field) this.f407117a).get(this.f407123f);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$b;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$b */
        public static final class b extends AbstractC11645f implements kotlin.reflect.jvm.internal.calls.d {
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$c;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$c */
        public static final class c extends AbstractC11645f {
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$d;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$d */
        public static final class d extends AbstractC11645f {
            @Override // kotlin.reflect.jvm.internal.calls.f
            public final void c(@Y61.k Object[] objArr) {
                e.a.a(this, objArr);
                d(objArr.length == 0 ? null : objArr[0]);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$f$e;", "Lkotlin/reflect/jvm/internal/calls/f$f;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$f$e */
        public static final class e extends AbstractC11645f {
        }

        public AbstractC11645f(Field field, boolean z12, C42822w c42822w) {
            super(field, field.getGenericType(), z12 ? field.getDeclaringClass() : null, new Type[0], null);
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @Y61.l
        public Object call(@Y61.k Object[] objArr) {
            c(objArr);
            return ((Field) this.f407117a).get(this.f407119c != null ? C42756l.C(objArr) : null);
        }
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Field;", "a", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/calls/f$g$a;", "Lkotlin/reflect/jvm/internal/calls/f$g$b;", "Lkotlin/reflect/jvm/internal/calls/f$g$c;", "Lkotlin/reflect/jvm/internal/calls/f$g$d;", "Lkotlin/reflect/jvm/internal/calls/f$g$e;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class g extends f<Field> {

        /* renamed from: f, reason: collision with root package name */
        public final boolean f407124f;

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$a;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends g implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final Object f407125g;

            public a(@Y61.k Field field, boolean z12, @Y61.l Object obj) {
                super(field, z12, false, null);
                this.f407125g = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.f.g, kotlin.reflect.jvm.internal.calls.e
            @Y61.k
            public final Object call(@Y61.k Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
                c(objArr);
                ((Field) this.f407117a).set(this.f407125g, C42756l.C(objArr));
                return G0.f406611a;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$b;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends g implements kotlin.reflect.jvm.internal.calls.d {
            @Override // kotlin.reflect.jvm.internal.calls.f.g, kotlin.reflect.jvm.internal.calls.e
            @Y61.k
            public final Object call(@Y61.k Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
                c(objArr);
                ((Field) this.f407117a).set(null, C42756l.Q(objArr));
                return G0.f406611a;
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$c;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends g {
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$d;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends g {
            @Override // kotlin.reflect.jvm.internal.calls.f.g, kotlin.reflect.jvm.internal.calls.f
            public final void c(@Y61.k Object[] objArr) {
                super.c(objArr);
                d(objArr.length == 0 ? null : objArr[0]);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$g$e;", "Lkotlin/reflect/jvm/internal/calls/f$g;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e extends g {
        }

        public g(Field field, boolean z12, boolean z13, C42822w c42822w) {
            super(field, Void.TYPE, z13 ? field.getDeclaringClass() : null, new Type[]{field.getGenericType()}, null);
            this.f407124f = z12;
        }

        @Override // kotlin.reflect.jvm.internal.calls.f
        public void c(@Y61.k Object[] objArr) {
            e.a.a(this, objArr);
            if (this.f407124f && C42756l.Q(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @Y61.l
        public Object call(@Y61.k Object[] objArr) throws IllegalAccessException, IllegalArgumentException {
            c(objArr);
            ((Field) this.f407117a).set(this.f407119c != null ? C42756l.C(objArr) : null, C42756l.Q(objArr));
            return G0.f406611a;
        }
    }

    static {
        new d(null);
    }

    public f() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(java.lang.reflect.Member r1, java.lang.reflect.Type r2, java.lang.Class r3, java.lang.reflect.Type[] r4, kotlin.jvm.internal.C42822w r5) {
        /*
            r0 = this;
            r0.<init>()
            r0.f407117a = r1
            r0.f407118b = r2
            r0.f407119c = r3
            if (r3 == 0) goto L29
            kotlin.jvm.internal.t0 r1 = new kotlin.jvm.internal.t0
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            java.util.ArrayList<java.lang.Object> r1 = r1.f406850a
            int r2 = r1.size()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.toArray(r2)
            java.util.List r1 = kotlin.collections.C42745f0.U(r1)
            if (r1 != 0) goto L2d
        L29:
            java.util.List r1 = kotlin.collections.C42756l.g0(r4)
        L2d:
            r0.f407120d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.f.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[], kotlin.jvm.internal.w):void");
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.k
    public final List<Type> a() {
        return this.f407120d;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.k
    public final M b() {
        return this.f407117a;
    }

    public void c(@Y61.k Object[] objArr) {
        e.a.a(this, objArr);
    }

    public final void d(@Y61.l Object obj) {
        if (obj == null || !this.f407117a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.k
    /* renamed from: getReturnType, reason: from getter */
    public final Type getF407118b() {
        return this.f407118b;
    }

    /* compiled from: CallerImpl.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h;", "Lkotlin/reflect/jvm/internal/calls/f;", "Ljava/lang/reflect/Method;", "a", "b", "c", "d", "e", "f", "g", "Lkotlin/reflect/jvm/internal/calls/f$h$a;", "Lkotlin/reflect/jvm/internal/calls/f$h$b;", "Lkotlin/reflect/jvm/internal/calls/f$h$c;", "Lkotlin/reflect/jvm/internal/calls/f$h$d;", "Lkotlin/reflect/jvm/internal/calls/f$h$e;", "Lkotlin/reflect/jvm/internal/calls/f$h$f;", "Lkotlin/reflect/jvm/internal/calls/f$h$g;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class h extends f<Method> {

        /* renamed from: f, reason: collision with root package name */
        public final boolean f407126f;

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$a;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends h implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final Object f407127g;

            public a(@Y61.l Object obj, @Y61.k Method method) {
                super(method, false, null, 4, null);
                this.f407127g = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @Y61.l
            public final Object call(@Y61.k Object[] objArr) {
                e.a.a(this, objArr);
                return e(this.f407127g, objArr);
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$b;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends h implements kotlin.reflect.jvm.internal.calls.d {
            public b(@Y61.k Method method) {
                super(method, false, null, 4, null);
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @Y61.l
            public final Object call(@Y61.k Object[] objArr) {
                e.a.a(this, objArr);
                return e(null, objArr);
            }
        }

        /* compiled from: CallerImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$c;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends h implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: g, reason: collision with root package name */
            @Y61.l
            public final Object f407128g;

            /* JADX WARN: Illegal instructions before constructor call */
            public c(@Y61.l Object obj, @Y61.k Method method) {
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : C42756l.w(1, genericParameterTypes.length, genericParameterTypes)), null);
                this.f407128g = obj;
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @Y61.l
            public final Object call(@Y61.k Object[] objArr) {
                e.a.a(this, objArr);
                t0 t0Var = new t0(2);
                t0Var.a(this.f407128g);
                t0Var.b(objArr);
                ArrayList<Object> arrayList = t0Var.f406850a;
                return e(null, arrayList.toArray(new Object[arrayList.size()]));
            }
        }

        /* compiled from: CallerImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$d;", "Lkotlin/reflect/jvm/internal/calls/d;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class d extends h implements kotlin.reflect.jvm.internal.calls.d {

            /* renamed from: g, reason: collision with root package name */
            @Y61.k
            public final Object[] f407129g;

            public d(@Y61.k Method method, @Y61.k Object[] objArr) {
                super(method, false, (Type[]) C42756l.x(objArr.length, method.getGenericParameterTypes()).toArray(new Type[0]), null);
                this.f407129g = objArr;
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @Y61.l
            public final Object call(@Y61.k Object[] objArr) {
                e.a.a(this, objArr);
                t0 t0Var = new t0(2);
                t0Var.b(this.f407129g);
                t0Var.b(objArr);
                ArrayList<Object> arrayList = t0Var.f406850a;
                return e(null, arrayList.toArray(new Object[arrayList.size()]));
            }
        }

        /* compiled from: CallerImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$e;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class e extends h {
            public e(@Y61.k Method method) {
                super(method, false, null, 6, null);
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @Y61.l
            public final Object call(@Y61.k Object[] objArr) {
                e.a.a(this, objArr);
                return e(objArr[0], objArr.length <= 1 ? new Object[0] : C42756l.w(1, objArr.length, objArr));
            }
        }

        /* compiled from: CallerImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$f;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.calls.f$h$f, reason: collision with other inner class name */
        public static final class C11646f extends h {
            public C11646f(@Y61.k Method method) {
                super(method, true, null, 4, null);
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @Y61.l
            public final Object call(@Y61.k Object[] objArr) {
                e.a.a(this, objArr);
                d(objArr.length == 0 ? null : objArr[0]);
                return e(null, objArr.length <= 1 ? new Object[0] : C42756l.w(1, objArr.length, objArr));
            }
        }

        /* compiled from: CallerImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/f$h$g;", "Lkotlin/reflect/jvm/internal/calls/f$h;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class g extends h {
            public g(@Y61.k Method method) {
                super(method, false, null, 6, null);
            }

            @Override // kotlin.reflect.jvm.internal.calls.e
            @Y61.l
            public final Object call(@Y61.k Object[] objArr) {
                e.a.a(this, objArr);
                return e(null, objArr);
            }
        }

        public /* synthetic */ h(Method method, boolean z12, Type[] typeArr, int i12, C42822w c42822w) {
            this(method, (i12 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z12, (i12 & 4) != 0 ? method.getGenericParameterTypes() : typeArr, null);
        }

        @Y61.l
        public final Object e(@Y61.l Object obj, @Y61.k Object[] objArr) {
            return this.f407126f ? G0.f406611a : ((Method) this.f407117a).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        public h(Method method, boolean z12, Type[] typeArr, C42822w c42822w) {
            super(method, method.getGenericReturnType(), z12 ? method.getDeclaringClass() : null, typeArr, null);
            this.f407126f = L.f(this.f407118b, Void.TYPE);
        }
    }
}
