package kotlin.reflect;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import kotlin.InterfaceC43017s;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TypesJVM.kt */
@InterfaceC43017s
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/A;", "Ljava/lang/reflect/WildcardType;", "Lkotlin/reflect/v;", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class A implements WildcardType, v {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final a f406938d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final A f406939e = new A(null, null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Type f406940b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Type f406941c;

    /* compiled from: TypesJVM.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/A$a;", "", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public A(@Y61.l Type type, @Y61.l Type type2) {
        this.f406940b = type;
        this.f406941c = type2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (Arrays.equals(getUpperBounds(), wildcardType.getUpperBounds()) && Arrays.equals(getLowerBounds(), wildcardType.getLowerBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    @Y61.k
    public final Type[] getLowerBounds() {
        Type type = this.f406941c;
        return type == null ? new Type[0] : new Type[]{type};
    }

    @Override // java.lang.reflect.Type
    @Y61.k
    public final String getTypeName() {
        Type type = this.f406941c;
        if (type != null) {
            return "? super " + y.a(type);
        }
        Type type2 = this.f406940b;
        if (type2 == null || L.f(type2, Object.class)) {
            return "?";
        }
        return "? extends " + y.a(type2);
    }

    @Override // java.lang.reflect.WildcardType
    @Y61.k
    public final Type[] getUpperBounds() {
        Type type = this.f406940b;
        if (type == null) {
            type = Object.class;
        }
        return new Type[]{type};
    }

    public final int hashCode() {
        return Arrays.hashCode(getUpperBounds()) ^ Arrays.hashCode(getLowerBounds());
    }

    @Y61.k
    public final String toString() {
        return getTypeName();
    }
}
