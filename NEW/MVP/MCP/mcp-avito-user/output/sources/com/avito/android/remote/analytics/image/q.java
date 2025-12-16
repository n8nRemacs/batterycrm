package com.avito.android.remote.analytics.image;

import android.net.Uri;
import j.InterfaceC42148d;
import kotlin.Metadata;

/* compiled from: NetworkImageResponsesRelay.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/image/q;", "", "a", "b", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface q {

    /* compiled from: NetworkImageResponsesRelay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/image/q$a;", "", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f253155a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f253156b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Throwable f253157c;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.l Throwable th2) {
            this.f253155a = str;
            this.f253156b = str2;
            this.f253157c = th2;
        }
    }

    /* compiled from: NetworkImageResponsesRelay.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/image/q$b;", "", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f253158a;

        public b(@Y61.k String str) {
            this.f253158a = str;
        }
    }

    @Y61.k
    com.jakewharton.rxrelay3.d a();

    @Y61.k
    com.jakewharton.rxrelay3.d b();

    @InterfaceC42148d
    void c(@Y61.k Uri uri, @Y61.l Throwable th2);

    @InterfaceC42148d
    void d(@Y61.k Uri uri);
}
