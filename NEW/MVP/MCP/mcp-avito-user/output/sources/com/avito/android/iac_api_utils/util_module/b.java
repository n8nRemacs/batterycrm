package com.avito.android.iac_api_utils.util_module;

import Y41.l;
import Y41.p;
import android.annotation.SuppressLint;
import androidx.appcompat.app.r;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.D;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.ApiException;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42022u;
import java.util.concurrent.TimeoutException;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;

/* compiled from: IacApiTracker.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_api_utils/util_module/b;", "Lcom/avito/android/iac_api_utils/util_module/a;", "_avito_iac-api-utils_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements com.avito.android.iac_api_utils.util_module.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f164303a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F f164304b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public N f164305c = a.f164307l;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public N f164306d = C4804b.f164308l;

    /* compiled from: IacApiTracker.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements l<String, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f164307l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(String str) {
            return G0.f406611a;
        }
    }

    /* compiled from: IacApiTracker.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.iac_api_utils.util_module.b$b, reason: collision with other inner class name */
    public static final class C4804b extends N implements p<String, Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final C4804b f164308l = new C4804b();

        public C4804b() {
            super(2);
        }

        @Override // Y41.p
        public final /* bridge */ /* synthetic */ G0 invoke(String str, Throwable th2) {
            return G0.f406611a;
        }
    }

    @Inject
    public b(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k F f12) {
        this.f164303a = interfaceC28373a;
        this.f164304b = f12;
    }

    @Override // com.avito.android.iac_api_utils.util_module.a
    @Y61.k
    public final C42022u a(@Y61.k String str, @Y61.k String[] strArr, @Y61.k Y41.a aVar) {
        return ((I) aVar.invoke()).j(new e(this, str, strArr)).i(new f(this, str)).k(new g(this, str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.iac_api_utils.util_module.a
    public final void b(@Y61.k l<? super String, G0> lVar, @Y61.k p<? super String, ? super Throwable, G0> pVar) {
        this.f164305c = (N) lVar;
        this.f164306d = (N) pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.avito.android.iac_api_utils.util_module.a
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@Y61.k java.lang.String r5, @Y61.k java.lang.String[] r6, @Y61.k Y41.l r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.avito.android.iac_api_utils.util_module.h
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.iac_api_utils.util_module.h r0 = (com.avito.android.iac_api_utils.util_module.h) r0
            int r1 = r0.f164320u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f164320u = r1
            goto L18
        L13:
            com.avito.android.iac_api_utils.util_module.h r0 = new com.avito.android.iac_api_utils.util_module.h
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f164318s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f164320u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.String r5 = r0.f164317r
            com.avito.android.iac_api_utils.util_module.b r6 = r0.f164316q
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L2d
            goto L52
        L2d:
            r7 = move-exception
            goto L7a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.C42729a0.b(r8)
            int r8 = r6.length     // Catch: java.lang.Throwable -> L78
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r8)     // Catch: java.lang.Throwable -> L78
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch: java.lang.Throwable -> L78
            r4.e(r5, r6)     // Catch: java.lang.Throwable -> L78
            r0.f164316q = r4     // Catch: java.lang.Throwable -> L78
            r0.f164317r = r5     // Catch: java.lang.Throwable -> L78
            r0.f164320u = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L78
            if (r8 != r1) goto L51
            return r1
        L51:
            r6 = r4
        L52:
            r7 = r8
            com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7     // Catch: java.lang.Throwable -> L2d
            boolean r0 = r7 instanceof com.avito.android.remote.model.TypedResult.Success     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L5d
            r6.f(r5)     // Catch: java.lang.Throwable -> L2d
            goto L75
        L5d:
            boolean r0 = r7 instanceof com.avito.android.remote.model.TypedResult.Error     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto L75
            r0 = r7
            com.avito.android.remote.model.TypedResult$Error r0 = (com.avito.android.remote.model.TypedResult.Error) r0     // Catch: java.lang.Throwable -> L2d
            com.avito.android.remote.error.ApiError r0 = r0.getError()     // Catch: java.lang.Throwable -> L2d
            com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7     // Catch: java.lang.Throwable -> L2d
            java.lang.Throwable r7 = r7.getCause()     // Catch: java.lang.Throwable -> L2d
            com.avito.android.util.ApiException r7 = com.avito.android.util.C35936s.a(r0, r7)     // Catch: java.lang.Throwable -> L2d
            r6.d(r5, r7)     // Catch: java.lang.Throwable -> L2d
        L75:
            com.avito.android.remote.model.TypedResult r8 = (com.avito.android.remote.model.TypedResult) r8     // Catch: java.lang.Throwable -> L2d
            return r8
        L78:
            r7 = move-exception
            r6 = r4
        L7a:
            r6.d(r5, r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.iac_api_utils.util_module.b.c(java.lang.String, java.lang.String[], Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [Y41.p, kotlin.jvm.internal.N] */
    @SuppressLint({"HardcodeStringDetector"})
    public final void d(String str, Throwable th2) {
        String simpleName;
        if (th2 instanceof TimeoutException) {
            simpleName = "TimeoutException";
        } else if (th2 instanceof ApiException) {
            ApiError apiError = ((ApiException) th2).f318522b;
            simpleName = apiError instanceof ApiError.BadRequest ? "BadRequest" : apiError instanceof ApiError.CertificatePinningError ? "CertificatePinningError" : apiError instanceof ApiError.ErrorAction ? "ErrorAction" : apiError instanceof ApiError.ErrorDialog ? "ErrorDialog" : apiError instanceof ApiError.Failure ? "Failure" : apiError instanceof ApiError.Forbidden ? "Forbidden" : apiError instanceof ApiError.HttpError ? "HttpError" : apiError instanceof ApiError.IncorrectData ? "IncorrectData" : apiError instanceof ApiError.InternalError ? "InternalError" : apiError instanceof ApiError.NetworkIOError ? "NetworkIOError" : apiError instanceof ApiError.NotFound ? "NotFound" : apiError instanceof ApiError.PretendError ? "PretendError" : apiError instanceof ApiError.TooManyRequests ? "TooManyRequests" : apiError instanceof ApiError.Unauthorized ? "Unauthorized" : apiError instanceof ApiError.UnknownError ? "UnknownError" : "UnknownApiErrorSubType";
        } else {
            simpleName = th2.getClass().getSimpleName();
        }
        this.f164303a.c(new y.a(this.f164304b.a("calls", "api", D.a(str), "{{%app_ver%}}", "error_".concat(simpleName)).f91030a, 1L));
        this.f164306d.invoke("<<< '" + str + "', error", th2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, kotlin.jvm.internal.N] */
    @SuppressLint({"HardcodeStringDetector"})
    public final void e(String str, String... strArr) {
        this.f164303a.c(new y.a(this.f164304b.a("calls", "api", D.a(str), "{{%app_ver%}}", "called").f91030a, 1L));
        ?? r02 = this.f164305c;
        StringBuilder sbA = r.A(">>> '", str, "'(");
        sbA.append(C42756l.P(strArr, ", ", null, null, null, 62));
        sbA.append(')');
        r02.invoke(sbA.toString());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, kotlin.jvm.internal.N] */
    @SuppressLint({"HardcodeStringDetector"})
    public final void f(String str) {
        this.f164303a.c(new y.a(this.f164304b.a("calls", "api", D.a(str), "{{%app_ver%}}", "ok").f91030a, 1L));
        this.f164305c.invoke("<<< '" + str + '\'');
    }
}
