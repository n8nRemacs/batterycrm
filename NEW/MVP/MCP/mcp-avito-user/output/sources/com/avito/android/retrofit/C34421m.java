package com.avito.android.retrofit;

import kotlin.Metadata;
import okhttp3.Request;
import retrofit2.InterfaceC47646b;

/* compiled from: ResponseConverterFactoryWrapper.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lokhttp3/Request;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.retrofit.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C34421m extends kotlin.jvm.internal.N implements Y41.a<Request> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC47646b<?> f255151l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34421m(InterfaceC47646b<?> interfaceC47646b) {
        super(0);
        this.f255151l = interfaceC47646b;
    }

    @Override // Y41.a
    public final Request invoke() {
        return this.f255151l.request();
    }
}
