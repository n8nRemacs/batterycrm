package kotlin.reflect.jvm.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;

/* compiled from: KCallableImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "R", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C43008q extends kotlin.jvm.internal.N implements Y41.a<Type> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC43003l<Object> f410411l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43008q(AbstractC43003l<Object> abstractC43003l) {
        super(0);
        this.f410411l = abstractC43003l;
    }

    @Override // Y41.a
    public final Type invoke() {
        Type[] lowerBounds;
        AbstractC43003l<Object> abstractC43003l = this.f410411l;
        Type type = null;
        if (abstractC43003l.isSuspend()) {
            Object objS = C42745f0.S(abstractC43003l.j().a());
            ParameterizedType parameterizedType = objS instanceof ParameterizedType ? (ParameterizedType) objS : null;
            if (kotlin.jvm.internal.L.f(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
                Object objZ = C42756l.Z(parameterizedType.getActualTypeArguments());
                WildcardType wildcardType = objZ instanceof WildcardType ? (WildcardType) objZ : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    type = (Type) C42756l.C(lowerBounds);
                }
            }
        }
        return type == null ? abstractC43003l.j().getF407118b() : type;
    }
}
