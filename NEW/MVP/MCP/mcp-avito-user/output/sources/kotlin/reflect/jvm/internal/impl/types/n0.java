package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: TypeAttributes.kt */
@kotlin.jvm.internal.s0
/* loaded from: classes8.dex */
public final class n0 extends kotlin.reflect.jvm.internal.impl.util.e<l0<?>, l0<?>> implements Iterable<l0<?>>, Z41.a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f410236c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final n0 f410237d = new n0(C42784z0.f406748b);

    /* compiled from: TypeAttributes.kt */
    @kotlin.jvm.internal.s0
    public static final class a extends kotlin.reflect.jvm.internal.impl.util.t<l0<?>, l0<?>> {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static n0 c(@Y61.k List list) {
            return list.isEmpty() ? n0.f410237d : new n0(list, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.t
        public final int a(@Y61.k ConcurrentHashMap<String, Integer> concurrentHashMap, @Y61.k String str, @Y61.k Y41.l<? super String, Integer> lVar) {
            int iIntValue;
            Integer num = concurrentHashMap.get(str);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = concurrentHashMap.get(str);
                    if (num2 == null) {
                        Integer numInvoke = lVar.invoke(str);
                        concurrentHashMap.putIfAbsent(str, Integer.valueOf(numInvoke.intValue()));
                        num2 = numInvoke;
                    }
                    iIntValue = num2.intValue();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return iIntValue;
        }

        public a() {
        }
    }

    public n0() {
        throw null;
    }

    public /* synthetic */ n0(List list, C42822w c42822w) {
        this(list);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.a
    @Y61.k
    public final a d() {
        return f410236c;
    }

    public n0(List<? extends l0<?>> list) {
        for (l0<?> l0Var : list) {
            e(l0Var.b().p0(), l0Var);
        }
    }
}
