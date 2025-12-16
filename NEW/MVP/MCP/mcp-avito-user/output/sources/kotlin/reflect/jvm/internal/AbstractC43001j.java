package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;
import m51.d;

/* compiled from: RuntimeTypeMapper.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/jvm/internal/j;", "", "<init>", "()V", "a", "b", "c", "d", "e", "Lkotlin/reflect/jvm/internal/j$a;", "Lkotlin/reflect/jvm/internal/j$b;", "Lkotlin/reflect/jvm/internal/j$c;", "Lkotlin/reflect/jvm/internal/j$d;", "Lkotlin/reflect/jvm/internal/j$e;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43001j {

    /* compiled from: RuntimeTypeMapper.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/j$a;", "Lkotlin/reflect/jvm/internal/j;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.j$a */
    public static final class a extends AbstractC43001j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<Method> f410373a;

        /* compiled from: RuntimeTypeMapper.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.j$a$a, reason: collision with other inner class name */
        public static final class C11703a extends kotlin.jvm.internal.N implements Y41.l<Method, CharSequence> {

            /* renamed from: l, reason: collision with root package name */
            public static final C11703a f410374l = new C11703a();

            public C11703a() {
                super(1);
            }

            @Override // Y41.l
            public final CharSequence invoke(Method method) {
                return C42892d.b(method.getReturnType());
            }
        }

        /* compiled from: Comparisons.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlin.reflect.jvm.internal.j$a$b */
        public static final class b<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t12, T t13) {
                return kotlin.comparisons.a.b(((Method) t12).getName(), ((Method) t13).getName());
            }
        }

        public a(@Y61.k Class<?> cls) {
            super(null);
            this.f410373a = C42756l.c0(cls.getDeclaredMethods(), new b());
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43001j
        @Y61.k
        /* renamed from: a */
        public final String getF410381b() {
            return C42745f0.O(this.f410373a, "", "<init>(", ")V", C11703a.f410374l, 24);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/j$b;", "Lkotlin/reflect/jvm/internal/j;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.j$b */
    public static final class b extends AbstractC43001j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Constructor<?> f410375a;

        /* compiled from: RuntimeTypeMapper.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.j$b$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<Class<?>, CharSequence> {

            /* renamed from: l, reason: collision with root package name */
            public static final a f410376l = new a();

            public a() {
                super(1);
            }

            @Override // Y41.l
            public final CharSequence invoke(Class<?> cls) {
                return C42892d.b(cls);
            }
        }

        public b(@Y61.k Constructor<?> constructor) {
            super(null);
            this.f410375a = constructor;
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43001j
        @Y61.k
        /* renamed from: a */
        public final String getF410381b() {
            return C42756l.P(this.f410375a.getParameterTypes(), "", "<init>(", ")V", a.f410376l, 24);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/j$c;", "Lkotlin/reflect/jvm/internal/j;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.j$c */
    public static final class c extends AbstractC43001j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Method f410377a;

        public c(@Y61.k Method method) {
            super(null);
            this.f410377a = method;
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43001j
        @Y61.k
        /* renamed from: a */
        public final String getF410381b() {
            return f0.a(this.f410377a);
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/j$d;", "Lkotlin/reflect/jvm/internal/j;", "Lm51/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.j$d */
    public static final class d extends AbstractC43001j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final d.b f410378a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f410379b;

        public d(@Y61.k d.b bVar) {
            super(null);
            this.f410378a = bVar;
            this.f410379b = bVar.a();
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43001j
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF410381b() {
            return this.f410379b;
        }
    }

    /* compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/j$e;", "Lkotlin/reflect/jvm/internal/j;", "Lm51/d$b;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.j$e */
    public static final class e extends AbstractC43001j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final d.b f410380a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f410381b;

        public e(@Y61.k d.b bVar) {
            super(null);
            this.f410380a = bVar;
            this.f410381b = bVar.a();
        }

        @Override // kotlin.reflect.jvm.internal.AbstractC43001j
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final String getF410381b() {
            return this.f410381b;
        }
    }

    public /* synthetic */ AbstractC43001j(C42822w c42822w) {
        this();
    }

    @Y61.k
    /* renamed from: a */
    public abstract String getF410381b();

    public AbstractC43001j() {
    }
}
