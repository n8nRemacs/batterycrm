package com.avito.android.remote.analytics;

import com.avito.android.remote.error.ApiError;
import j.InterfaceC42148d;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.Request;

/* compiled from: NetworkResponsesRelay.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/B;", "", "b", "c", "_avito_performance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface B {

    /* compiled from: NetworkResponsesRelay.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: NetworkResponsesRelay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/B$c;", "", "_avito_performance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f253084a;

        public c(@Y61.k String str) {
            this.f253084a = str;
        }
    }

    @Y61.k
    com.jakewharton.rxrelay3.d a();

    @Y61.k
    com.jakewharton.rxrelay3.d b();

    @InterfaceC42148d
    void c(@Y61.k Y41.a<Request> aVar, @Y61.k Annotation[] annotationArr);

    @InterfaceC42148d
    void d(@Y61.k Y41.a<Request> aVar, @Y61.k Annotation[] annotationArr, @Y61.l String str, @Y61.k Throwable th2, @Y61.l ApiError apiError);

    /* compiled from: NetworkResponsesRelay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/B$b;", "", "_avito_performance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f253078a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f253079b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Annotation[] f253080c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f253081d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Throwable f253082e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final ApiError f253083f;

        public b(@Y61.k String str, @Y61.k String str2, @Y61.k Annotation[] annotationArr, @Y61.l String str3, @Y61.k Throwable th2, @Y61.l ApiError apiError) {
            this.f253078a = str;
            this.f253079b = str2;
            this.f253080c = annotationArr;
            this.f253081d = str3;
            this.f253082e = th2;
            this.f253083f = apiError;
        }

        public /* synthetic */ b(String str, String str2, Annotation[] annotationArr, String str3, Throwable th2, ApiError apiError, int i12, C42822w c42822w) {
            this(str, str2, annotationArr, str3, th2, (i12 & 32) != 0 ? null : apiError);
        }
    }
}
