package com.vk.api.sdk.okhttp;

import com.vk.api.sdk.utils.log.Logger;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;

/* compiled from: LoggingInterceptor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/okhttp/c;", "Lokhttp3/Interceptor;", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c implements Interceptor {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f366636j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public static final Object f366637k;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f366638b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Collection<String> f366639c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Logger f366640d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f366641e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f366642f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f366643g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f366644h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.vk.api.sdk.utils.i f366645i;

    /* compiled from: LoggingInterceptor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/vk/api/sdk/okhttp/c$a;", "", "<init>", "()V", "", "Lcom/vk/api/sdk/utils/log/Logger$LogLevel;", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "levelsMap", "Ljava/util/Map;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        kotlin.reflect.n<Object>[] nVarArr = new kotlin.reflect.n[5];
        n0 n0Var = m0.f406844a;
        nVarArr[4] = n0Var.i(new h0(n0Var.b(c.class), "delegate", "getDelegate()Lokhttp3/logging/HttpLoggingInterceptor;"));
        f366636j = nVarArr;
        new a(null);
        Logger.LogLevel logLevel = Logger.LogLevel.f366740f;
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.NONE;
        f366637k = P0.g(new Q(logLevel, level), new Q(Logger.LogLevel.f366739e, level), new Q(Logger.LogLevel.f366738d, HttpLoggingInterceptor.Level.BASIC), new Q(Logger.LogLevel.f366737c, HttpLoggingInterceptor.Level.HEADERS), new Q(Logger.LogLevel.f366736b, HttpLoggingInterceptor.Level.BODY), new Q(logLevel, level));
    }

    public c() {
        throw null;
    }

    public c(boolean z12, @Y61.k Logger logger) {
        List listU = C42745f0.U("access_token", "key", "client_secret");
        this.f366638b = z12;
        this.f366639c = listU;
        this.f366640d = logger;
        this.f366641e = C42727D.c(new h(this));
        this.f366642f = C42727D.c(g.f366649l);
        this.f366643g = C42727D.c(new i(this));
        this.f366644h = C42727D.c(k.f366653l);
        this.f366645i = new com.vk.api.sdk.utils.i(new e(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.Map] */
    @Override // okhttp3.Interceptor
    @Y61.k
    public final Response intercept(@Y61.k Interceptor.Chain chain) {
        Request request = chain.request();
        RequestBody requestBodyBody = request.body();
        long jContentLength = requestBodyBody == null ? 0L : requestBodyBody.contentLength();
        Logger.LogLevel value = this.f366640d.b().getValue();
        kotlin.reflect.n<Object>[] nVarArr = f366636j;
        kotlin.reflect.n<Object> nVar = nVarArr[4];
        com.vk.api.sdk.utils.i iVar = this.f366645i;
        HttpLoggingInterceptor httpLoggingInterceptor = (HttpLoggingInterceptor) iVar.f366733b.get();
        ?? r102 = f366637k;
        httpLoggingInterceptor.level((jContentLength > 64 || jContentLength <= 0) ? (HttpLoggingInterceptor.Level) r102.get(Collections.min(C42745f0.U(value, Logger.LogLevel.f366738d))) : (HttpLoggingInterceptor.Level) r102.get(value));
        kotlin.reflect.n<Object> nVar2 = nVarArr[4];
        return ((HttpLoggingInterceptor) iVar.f366733b.get()).intercept(chain);
    }
}
