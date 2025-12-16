package com.avito.android.remote.error;

import android.util.MalformedJsonException;
import com.avito.android.P;
import com.avito.android.error.z;
import com.avito.android.remote.InterfaceC34332n;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Error;
import com.avito.android.remote.model.ErrorContainer;
import com.avito.android.remote.model.PretendContainer;
import com.avito.android.remote.model.PretendResult;
import com.avito.android.remote.model.PretendResultError;
import com.avito.android.retrofit.B;
import com.avito.android.util.ApiException;
import com.avito.android.util.C;
import com.avito.android.util.K5;
import com.avito.android.util.R1;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import okhttp3.Response;
import retrofit2.HttpException;
import retrofit2.y;

/* compiled from: ApiErrorConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/error/a;", "", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Gson f253415a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C f253416b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final P f253417c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34332n f253418d;

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.remote.error.a$a, reason: collision with other inner class name */
    public static final class C7610a extends com.google.gson.reflect.a<ApiError> {
    }

    /* compiled from: Gsons.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"com/avito/android/util/GsonsKt$gsonTypeToken$1", "Lcom/google/gson/reflect/a;", "com/avito/android/util/O1", "_common_gson_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.google.gson.reflect.a<ApiError> {
    }

    @Inject
    public a(@Y61.k Gson gson, @Y61.k C c12, @Y61.k P p12, @Y61.k InterfaceC34332n interfaceC34332n) {
        this.f253415a = gson;
        this.f253416b = c12;
        this.f253417c = p12;
        this.f253418d = interfaceC34332n;
    }

    public static ApiError c(int i12, String str) {
        return i12 != 0 ? i12 != 500 ? i12 != 400 ? i12 != 401 ? i12 != 403 ? i12 != 404 ? new ApiError.HttpError(new Error(i12, str, null, 4, null)) : new ApiError.NotFound(str) : new ApiError.Forbidden(str, null, 2, null) : new ApiError.Unauthorized(str) : new ApiError.BadRequest(str) : new ApiError.InternalError(str) : new ApiError.UnknownError(str, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    public final ApiError a(HttpException httpException, String str, boolean z12, boolean z13) {
        Object objE;
        ApiError pretendError;
        PretendResultError error;
        Object objE2;
        Object objE3;
        String strA;
        String str2 = httpException.f429953c;
        if (str2 == null) {
            str2 = "";
        }
        y<?> yVar = httpException.f429954d;
        if (yVar == null) {
            return d(str2, "null response for " + str, httpException);
        }
        Response response = yVar.f430118a;
        int iCode = response.code();
        InterfaceC34332n interfaceC34332n = this.f253418d;
        ApiError apiErrorC = c(iCode, interfaceC34332n.a());
        String strA2 = B.a(httpException);
        if (strA2 == null) {
            return apiErrorC;
        }
        Object objE4 = null;
        ApiError apiErrorE = 0;
        Gson gson = this.f253415a;
        if (z12) {
            try {
                Type type = new c().getType();
                objE = gson.e(strA2, ((type instanceof ParameterizedType) && R1.a((ParameterizedType) type)) ? ((ParameterizedType) type).getRawType() : R1.b(type));
            } catch (Throwable unused) {
                objE = null;
            }
            PretendContainer pretendContainer = (PretendContainer) objE;
            PretendResult pretendResult = (pretendContainer == null || (error = pretendContainer.getError()) == null) ? null : error.getPretendResult();
            if (pretendResult == null) {
                try {
                    Type type2 = new d().getType();
                    objE4 = gson.e(strA2, ((type2 instanceof ParameterizedType) && R1.a((ParameterizedType) type2)) ? ((ParameterizedType) type2).getRawType() : R1.b(type2));
                } catch (Throwable unused2) {
                }
                pretendError = (ApiError) objE4;
            } else {
                pretendError = new ApiError.PretendError(pretendResult);
            }
            return pretendError == null ? apiErrorC : pretendError;
        }
        if (z13 && response.code() <= 500) {
            try {
                Type type3 = new C7610a().getType();
                apiErrorE = gson.e(strA2, ((type3 instanceof ParameterizedType) && R1.a((ParameterizedType) type3)) ? ((ParameterizedType) type3).getRawType() : R1.b(type3));
            } catch (Throwable unused3) {
            }
            return apiErrorE;
        }
        try {
            Type type4 = new b().getType();
            objE2 = gson.e(strA2, ((type4 instanceof ParameterizedType) && R1.a((ParameterizedType) type4)) ? ((ParameterizedType) type4).getRawType() : R1.b(type4));
        } catch (Throwable unused4) {
            objE2 = null;
        }
        ApiError apiError = (ApiError) objE2;
        if (apiError != null) {
            return apiError;
        }
        try {
            Type type5 = new com.avito.android.remote.error.b().getType();
            objE3 = gson.e(strA2, ((type5 instanceof ParameterizedType) && R1.a((ParameterizedType) type5)) ? ((ParameterizedType) type5).getRawType() : R1.b(type5));
        } catch (Throwable unused5) {
            objE3 = null;
        }
        ErrorContainer errorContainer = (ErrorContainer) objE3;
        Error error2 = errorContainer != null ? errorContainer.getError() : null;
        if (error2 == null || (strA = error2.getOneMessage()) == null) {
            strA = interfaceC34332n.a();
        }
        return c(httpException.f429952b, strA);
    }

    @Y61.l
    public final ApiError b(@Y61.k Throwable th2, @Y61.k String str, boolean z12, boolean z13) {
        InterfaceC34332n interfaceC34332n = this.f253418d;
        try {
            boolean z14 = false;
            if (K5.c(th2)) {
                ApiError apiErrorM = z.m(th2);
                return apiErrorM == null ? new ApiError.CertificatePinningError(interfaceC34332n.d(), false, 2, null) : apiErrorM;
            }
            for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
                if (cause instanceof ApiException) {
                    return z.n(th2);
                }
            }
            if (th2 instanceof HttpException) {
                return a((HttpException) th2, str, z12, z13);
            }
            for (Throwable cause2 = th2; cause2 != null; cause2 = cause2.getCause()) {
                if (!(cause2 instanceof MalformedJsonException) && !(cause2 instanceof com.google.gson.stream.MalformedJsonException) && !(cause2 instanceof JsonParseException)) {
                }
                z14 = true;
                break;
            }
            if (z14) {
                return d(interfaceC34332n.c(), "Invalid parsing result for " + str, th2);
            }
            if (K5.e(th2)) {
                return new ApiError.NetworkIOError(interfaceC34332n.b());
            }
            return d(interfaceC34332n.a(), "Unexpected error for " + str, th2);
        } catch (Throwable th3) {
            return d(interfaceC34332n.c(), "Unexpected error for ".concat(str), new JsonParseException(new CompositeException(th3, th2)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.remote.error.ApiError.UnknownError d(java.lang.String r6, java.lang.String r7, java.lang.Throwable r8) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "message="
            java.lang.String r2 = ", info="
            java.lang.String r1 = androidx.compose.ui.graphics.colorspace.e.n(r1, r6, r2, r7)
            r0.<init>(r1, r8)
            com.avito.android.util.V2 r1 = com.avito.android.util.V2.f318762a
            com.avito.android.util.C r2 = r5.f253416b
            boolean r2 = r2.l()
            if (r2 != 0) goto L36
            com.avito.android.P r2 = r5.f253417c
            r2.getClass()
            kotlin.reflect.n<java.lang.Object>[] r3 = com.avito.android.P.f67370w0
            r4 = 14
            r3 = r3[r4]
            com.avito.android.A0$a r2 = r2.f67418l
            DE0.a r2 = r2.a()
            java.lang.Object r2 = r2.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L36
            r2 = 1
            goto L37
        L36:
            r2 = 0
        L37:
            r1.m(r0, r2)
            com.avito.android.remote.error.ApiError$UnknownError r0 = new com.avito.android.remote.error.ApiError$UnknownError
            r0.<init>(r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.error.a.d(java.lang.String, java.lang.String, java.lang.Throwable):com.avito.android.remote.error.ApiError$UnknownError");
    }
}
