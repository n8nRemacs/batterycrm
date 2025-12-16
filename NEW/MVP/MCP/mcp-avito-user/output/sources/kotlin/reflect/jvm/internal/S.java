package kotlin.reflect.jvm.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.List;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42756l;

/* compiled from: KTypeImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<no name provided>", "Ljava/lang/reflect/Type;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class S extends kotlin.jvm.internal.N implements Y41.a<Type> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f407056l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f407057m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f407058n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(T t12, int i12, InterfaceC42726C<? extends List<? extends Type>> interfaceC42726C) {
        super(0);
        this.f407056l = t12;
        this.f407057m = i12;
        this.f407058n = interfaceC42726C;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.C] */
    @Override // Y41.a
    public final Type invoke() {
        T t12 = this.f407056l;
        Type typeG = t12.g();
        if (typeG instanceof Class) {
            Class cls = (Class) typeG;
            return cls.isArray() ? cls.getComponentType() : Object.class;
        }
        boolean z12 = typeG instanceof GenericArrayType;
        int i12 = this.f407057m;
        if (z12) {
            if (i12 == 0) {
                return ((GenericArrayType) typeG).getGenericComponentType();
            }
            throw new X("Array type has been queried for a non-0th argument: " + t12);
        }
        if (!(typeG instanceof ParameterizedType)) {
            throw new X("Non-generic type has been queried for arguments: " + t12);
        }
        Type type = (Type) ((List) this.f407058n.getValue()).get(i12);
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Type type2 = lowerBounds.length == 0 ? null : lowerBounds[0];
        return type2 == null ? (Type) C42756l.C(wildcardType.getUpperBounds()) : type2;
    }
}
