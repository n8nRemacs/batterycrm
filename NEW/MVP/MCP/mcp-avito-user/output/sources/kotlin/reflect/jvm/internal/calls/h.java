package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.calls.e;

/* compiled from: InternalUnderlyingValOfInlineClass.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/h;", "Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Method;", "a", "b", "Lkotlin/reflect/jvm/internal/calls/h$a;", "Lkotlin/reflect/jvm/internal/calls/h$b;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class h implements e<Method> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Method f407130a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<Type> f407131b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Class f407132c;

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/h$a;", "Lkotlin/reflect/jvm/internal/calls/h;", "Lkotlin/reflect/jvm/internal/calls/d;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends h implements d {

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Object f407133d;

        public a(@Y61.l Object obj, @Y61.k Method method) {
            super(method, C42784z0.f406748b, null);
            this.f407133d = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.e
        @Y61.l
        public final Object call(@Y61.k Object[] objArr) {
            e.a.a(this, objArr);
            return this.f407130a.invoke(this.f407133d, Arrays.copyOf(objArr, objArr.length));
        }
    }

    /* compiled from: InternalUnderlyingValOfInlineClass.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/h$b;", "Lkotlin/reflect/jvm/internal/calls/h;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends h {
        @Override // kotlin.reflect.jvm.internal.calls.e
        @Y61.l
        public final Object call(@Y61.k Object[] objArr) {
            e.a.a(this, objArr);
            Object obj = objArr[0];
            int i12 = f.f407116e;
            Object[] objArrW = objArr.length <= 1 ? new Object[0] : C42756l.w(1, objArr.length, objArr);
            return this.f407130a.invoke(obj, Arrays.copyOf(objArrW, objArrW.length));
        }
    }

    public h() {
        throw null;
    }

    public h(Method method, List list, C42822w c42822w) {
        this.f407130a = method;
        this.f407131b = list;
        this.f407132c = method.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.k
    public final List<Type> a() {
        return this.f407131b;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.e
    @Y61.k
    /* renamed from: getReturnType */
    public final Type getF407118b() {
        return this.f407132c;
    }
}
