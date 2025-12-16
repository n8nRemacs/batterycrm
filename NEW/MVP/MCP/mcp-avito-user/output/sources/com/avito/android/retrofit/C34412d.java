package com.avito.android.retrofit;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: ApiErrorsRelay.kt */
@Singleton
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/retrofit/d;", "Lcom/avito/android/retrofit/c;", "Lcom/avito/android/retrofit/b;", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.retrofit.d, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C34412d implements InterfaceC34411c, InterfaceC34410b {

    /* renamed from: a, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.d<C34409a> f255122a = C31685o.m();

    @Inject
    public C34412d() {
    }

    @Override // com.avito.android.retrofit.InterfaceC34410b
    public final void a(@Y61.k ApiError apiError, @Y61.k String str) {
        this.f255122a.accept(new C34409a(apiError, str));
    }

    @Override // com.avito.android.retrofit.InterfaceC34411c
    @Y61.k
    public final io.reactivex.rxjava3.core.z<C34409a> b() {
        return this.f255122a;
    }
}
