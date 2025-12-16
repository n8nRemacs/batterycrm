package ru.cyberity.cbr.core.data.adapter.network;

import Y61.k;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.Request;
import okhttp3.ResponseBody;
import retrofit2.InterfaceC47646b;
import retrofit2.InterfaceC47648d;
import retrofit2.f;
import retrofit2.y;
import ru.cyberity.cbr.core.common.v0;
import ru.cyberity.cbr.core.data.model.CBRException;

/* compiled from: ApiResponseCall.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0004B1\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u0016\u0012\f\u0012\n \u0012*\u0004\u0018\u00018\u00008\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/cyberity/cbr/core/data/adapter/network/c;", "", "S", "E", "Lretrofit2/b;", "delegate", "Lretrofit2/f;", "Lokhttp3/ResponseBody;", "errorConverter", "Lru/cyberity/cbr/core/common/v0;", "errors", "<init>", "(Lretrofit2/b;Lretrofit2/f;Lru/cyberity/cbr/core/common/v0;)V", "Lretrofit2/d;", "callback", "Lkotlin/G0;", "enqueue", "(Lretrofit2/d;)V", "kotlin.jvm.PlatformType", "a", "()Lru/cyberity/cbr/core/data/adapter/network/c;", "", "isCanceled", "()Z", "cancel", "()V", "Lretrofit2/y;", "execute", "()Lretrofit2/y;", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "Lretrofit2/b;", "b", "Lretrofit2/f;", "c", "Lru/cyberity/cbr/core/common/v0;", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c<S, E> implements InterfaceC47646b<S> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC47646b<S> delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final f<ResponseBody, E> errorConverter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final v0 errors;

    /* compiled from: ApiResponseCall.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J+\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"ru/cyberity/cbr/core/data/adapter/network/c$a", "Lretrofit2/d;", "Lretrofit2/b;", "call", "Lretrofit2/y;", "response", "Lkotlin/G0;", "onResponse", "(Lretrofit2/b;Lretrofit2/y;)V", "", "throwable", "onFailure", "(Lretrofit2/b;Ljava/lang/Throwable;)V", "cyberity-mobile-sdk-internal-core_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements InterfaceC47648d<S> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC47648d<S> f432853a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c<S, E> f432854b;

        public a(InterfaceC47648d<S> interfaceC47648d, c<S, E> cVar) {
            this.f432853a = interfaceC47648d;
            this.f432854b = cVar;
        }

        @Override // retrofit2.InterfaceC47648d
        public void onFailure(@k InterfaceC47646b<S> call, @k Throwable throwable) {
            this.f432853a.onFailure(this.f432854b, throwable instanceof IOException ? new CBRException.Network(throwable) : new CBRException.Unknown(throwable));
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
        @Override // retrofit2.InterfaceC47648d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onResponse(@Y61.k retrofit2.InterfaceC47646b<S> r10, @Y61.k retrofit2.y<S> r11) {
            /*
                Method dump skipped, instructions count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.cyberity.cbr.core.data.adapter.network.c.a.onResponse(retrofit2.b, retrofit2.y):void");
        }
    }

    public c(@k InterfaceC47646b<S> interfaceC47646b, @k f<ResponseBody, E> fVar, @k v0 v0Var) {
        this.delegate = interfaceC47646b;
        this.errorConverter = fVar;
        this.errors = v0Var;
    }

    @Override // retrofit2.InterfaceC47646b
    public void cancel() {
        this.delegate.cancel();
    }

    @Override // retrofit2.InterfaceC47646b
    public void enqueue(@k InterfaceC47648d<S> callback) {
        this.delegate.enqueue(new a(callback, this));
    }

    @Override // retrofit2.InterfaceC47646b
    @k
    public y<S> execute() {
        throw new UnsupportedOperationException("ApiResponseCall doesn't support execute");
    }

    @Override // retrofit2.InterfaceC47646b
    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }

    @Override // retrofit2.InterfaceC47646b
    @k
    public Request request() {
        return this.delegate.request();
    }

    @Override // retrofit2.InterfaceC47646b
    @k
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c<S, E> clone() {
        return new c<>(this.delegate.clone(), this.errorConverter, this.errors);
    }
}
