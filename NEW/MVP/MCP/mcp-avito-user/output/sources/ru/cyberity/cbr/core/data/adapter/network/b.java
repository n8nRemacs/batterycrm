package ru.cyberity.cbr.core.data.adapter.network;

import Y61.k;
import Y61.l;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import retrofit2.InterfaceC47646b;
import retrofit2.InterfaceC47647c;
import retrofit2.z;
import ru.cyberity.cbr.core.common.v0;

/* compiled from: ApiResponseAdapterFactory.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/core/data/adapter/network/b;", "Lretrofit2/c$a;", "Lru/cyberity/cbr/core/common/v0;", "errors", "<init>", "(Lru/cyberity/cbr/core/common/v0;)V", "Ljava/lang/reflect/Type;", "returnType", "", "", "annotations", "Lretrofit2/z;", "retrofit", "Lretrofit2/c;", "get", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/z;)Lretrofit2/c;", "a", "Lru/cyberity/cbr/core/common/v0;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends InterfaceC47647c.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final v0 errors;

    public b(@k v0 v0Var) {
        this.errors = v0Var;
    }

    @Override // retrofit2.InterfaceC47647c.a
    @l
    public InterfaceC47647c<?, ?> get(@k Type returnType, @k Annotation[] annotations, @k z retrofit) {
        if (!InterfaceC47646b.class.equals(InterfaceC47647c.a.getRawType(returnType))) {
            return null;
        }
        if (returnType instanceof ParameterizedType) {
            return new a(InterfaceC47647c.a.getParameterUpperBound(0, (ParameterizedType) returnType), retrofit.d(ru.cyberity.cbr.core.data.model.remote.response.b.class, annotations), this.errors);
        }
        throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>> or Call<NetworkResponse<out Foo>>");
    }
}
