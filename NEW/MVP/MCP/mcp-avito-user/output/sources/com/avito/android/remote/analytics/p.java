package com.avito.android.remote.analytics;

import Vm0.C15693a;
import arrow.core.AbstractC23662a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.retrofit.error.WrappedDiagnosticsException;
import com.avito.android.util.ApiException;
import com.squareup.anvil.annotations.ContributesBinding;
import j.InterfaceC42148d;
import j.l0;
import java.util.UUID;
import javax.inject.Inject;
import javax.inject.Singleton;
import jj0.InterfaceC42389a;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import okhttp3.Headers;
import retrofit2.HttpException;

/* compiled from: NetworkErrorsStorageImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/analytics/p;", "Lcom/avito/android/remote/analytics/n;", "<init>", "()V", "a", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes17.dex */
public final class p implements n {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f253224c = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f253225a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f253226b;

    /* compiled from: NetworkErrorsStorageImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/remote/analytics/p$a;", "", "<init>", "()V", "", "CACHE_SIZE", "I", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public p() {
        o oVar = new o(0);
        o oVar2 = new o(1);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406614b;
        this.f253225a = C42727D.b(lazyThreadSafetyMode, new r(oVar));
        this.f253226b = C42727D.b(lazyThreadSafetyMode, new q(oVar2));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.remote.analytics.n
    @l0
    public final void a(@Y61.k ApiError apiError, @Y61.k Throwable th2) {
        Q<Throwable, C34244a> qD2 = d(th2);
        Throwable th3 = qD2.f406619b;
        C34244a c34244a = qD2.f406620c;
        if (c34244a != null) {
            ((InterfaceC42389a) this.f253225a.getValue()).remove(th3);
            ((InterfaceC42389a) this.f253226b.getValue()).put(apiError, c34244a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.remote.analytics.n
    @Y61.l
    @InterfaceC42148d
    public final C34244a b(@Y61.k AbstractC23662a<? extends Throwable, ? extends ApiError> abstractC23662a) {
        if (abstractC23662a instanceof AbstractC23662a.c) {
            return (C34244a) ((InterfaceC42389a) this.f253226b.getValue()).get((ApiError) ((AbstractC23662a.c) abstractC23662a).f56269b);
        }
        if (abstractC23662a instanceof AbstractC23662a.b) {
            return d((Throwable) ((AbstractC23662a.b) abstractC23662a).f56268b).f406620c;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.remote.analytics.n
    @Y61.k
    @l0
    public final C34244a c(@Y61.k Throwable th2) {
        String str;
        Headers headers;
        Headers headers2;
        String string = UUID.randomUUID().toString();
        String str2 = null;
        if (th2 instanceof HttpException) {
            retrofit2.y<?> yVar = ((HttpException) th2).f429954d;
            String str3 = (yVar == null || (headers2 = yVar.f430118a.headers()) == null) ? null : headers2.get("x-diagnostic-context");
            if (yVar != null && (headers = yVar.f430118a.headers()) != null) {
                str2 = headers.get("x-diagnostic-context-id");
            }
            str = str2;
            str2 = str3;
        } else if (th2 instanceof WrappedDiagnosticsException) {
            WrappedDiagnosticsException wrappedDiagnosticsException = (WrappedDiagnosticsException) th2;
            str2 = wrappedDiagnosticsException.f255124b;
            str = wrappedDiagnosticsException.f255125c;
        } else {
            str = null;
        }
        C34244a c34244a = new C34244a(string, str2, str);
        ((InterfaceC42389a) this.f253225a.getValue()).put(C15693a.a(th2), c34244a);
        return c34244a;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.C] */
    public final Q<Throwable, C34244a> d(Throwable th2) {
        C34244a c34244a = th2 instanceof ApiException ? (C34244a) ((InterfaceC42389a) this.f253226b.getValue()).get(((ApiException) th2).f318522b) : null;
        if (c34244a != null) {
            return new Q<>(th2, c34244a);
        }
        C34244a c34244a2 = (C34244a) ((InterfaceC42389a) this.f253225a.getValue()).get(th2);
        if (c34244a2 != null) {
            return new Q<>(th2, c34244a2);
        }
        Throwable cause = th2.getCause();
        return cause != null ? d(cause) : new Q<>(th2, null);
    }
}
