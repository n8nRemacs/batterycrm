package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.InterfaceC43017s;
import kotlin.Metadata;
import kotlin.collections.C42735a0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TypesJVM.kt */
@s0
@InterfaceC43017s
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/u;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/v;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class u implements ParameterizedType, v {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Class<?> f410468b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Type f410469c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Type[] f410470d;

    /* compiled from: TypesJVM.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<Type, String> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f410471b = new a();

        public a() {
            super(1, y.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // Y41.l
        public final String invoke(Type type) {
            return y.a(type);
        }
    }

    public u(@Y61.k Class cls, @Y61.l Type type, @Y61.k ArrayList arrayList) {
        this.f410468b = cls;
        this.f410469c = type;
        this.f410470d = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (L.f(this.f410468b, parameterizedType.getRawType()) && L.f(this.f410469c, parameterizedType.getOwnerType())) {
                if (Arrays.equals(this.f410470d, parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    @Y61.k
    public final Type[] getActualTypeArguments() {
        return this.f410470d;
    }

    @Override // java.lang.reflect.ParameterizedType
    @Y61.l
    public final Type getOwnerType() {
        return this.f410469c;
    }

    @Override // java.lang.reflect.ParameterizedType
    @Y61.k
    public final Type getRawType() {
        return this.f410468b;
    }

    @Override // java.lang.reflect.Type
    @Y61.k
    public final String getTypeName() {
        StringBuilder sb2 = new StringBuilder();
        Class<?> cls = this.f410468b;
        Type type = this.f410469c;
        if (type != null) {
            sb2.append(y.a(type));
            sb2.append("$");
            sb2.append(cls.getSimpleName());
        } else {
            sb2.append(y.a(cls));
        }
        Type[] typeArr = this.f410470d;
        if (typeArr.length != 0) {
            C42735a0.c(typeArr, sb2, ", ", "<", ">", a.f410471b);
        }
        return sb2.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f410468b.hashCode();
        Type type = this.f410469c;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f410470d);
    }

    @Y61.k
    public final String toString() {
        return getTypeName();
    }
}
