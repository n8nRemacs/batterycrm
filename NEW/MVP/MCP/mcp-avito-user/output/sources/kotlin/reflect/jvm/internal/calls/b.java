package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AnnotationConstructorCaller.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\u0006²\u0006\u0016\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u0016\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "T", "", "hashCode", "", "toString", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b {

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f407112l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map) {
            super(0);
            this.f407112l = map;
        }

        @Override // Y41.a
        public final Integer invoke() {
            Iterator<T> it = this.f407112l.entrySet().iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                iHashCode += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
            }
            return Integer.valueOf(iHashCode);
        }
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.calls.b$b, reason: collision with other inner class name */
    public static final class C11644b extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Class<T> f407113l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f407114m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C11644b(Class<T> cls, Map<String, ? extends Object> map) {
            super(0);
            this.f407113l = cls;
            this.f407114m = map;
        }

        @Override // Y41.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('@');
            sb2.append(this.f407113l.getCanonicalName());
            C42745f0.N(this.f407114m.entrySet(), sb2, ", ", "(", ")", c.f407115l, 48);
            return sb2.toString();
        }
    }

    @Y61.k
    public static final <T> T a(@Y61.k Class<T> cls, @Y61.k Map<String, ? extends Object> map, @Y61.k List<Method> list) {
        InterfaceC42726C interfaceC42726CC = C42727D.c(new a(map));
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new kotlin.reflect.jvm.internal.calls.a(cls, map, C42727D.c(new C11644b(cls, map)), interfaceC42726CC, list));
    }
}
