package ru.cyberity.cbr.core.data.adapter.network;

import Y61.k;
import java.lang.reflect.Type;
import kotlin.Metadata;
import okhttp3.ResponseBody;
import retrofit2.InterfaceC47646b;
import retrofit2.InterfaceC47647c;
import retrofit2.f;
import ru.cyberity.cbr.core.common.v0;

/* compiled from: ApiResponseAdapter.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004B+\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/cyberity/cbr/core/data/adapter/network/a;", "", "S", "E", "Lretrofit2/c;", "Lretrofit2/b;", "Ljava/lang/reflect/Type;", "successType", "Lretrofit2/f;", "Lokhttp3/ResponseBody;", "errorBodyConverter", "Lru/cyberity/cbr/core/common/v0;", "errors", "<init>", "(Ljava/lang/reflect/Type;Lretrofit2/f;Lru/cyberity/cbr/core/common/v0;)V", "responseType", "()Ljava/lang/reflect/Type;", "call", "a", "(Lretrofit2/b;)Lretrofit2/b;", "Ljava/lang/reflect/Type;", "b", "Lretrofit2/f;", "c", "Lru/cyberity/cbr/core/common/v0;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class a<S, E> implements InterfaceC47647c<S, InterfaceC47646b<S>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final Type successType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final f<ResponseBody, E> errorBodyConverter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final v0 errors;

    public a(@k Type type, @k f<ResponseBody, E> fVar, @k v0 v0Var) {
        this.successType = type;
        this.errorBodyConverter = fVar;
        this.errors = v0Var;
    }

    @Override // retrofit2.InterfaceC47647c
    @k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public InterfaceC47646b<S> adapt(@k InterfaceC47646b<S> call) {
        return new c(call, this.errorBodyConverter, this.errors);
    }

    @Override // retrofit2.InterfaceC47647c
    @k
    /* renamed from: responseType, reason: from getter */
    public Type getSuccessType() {
        return this.successType;
    }
}
