package com.avito.android.retrofit;

import com.avito.android.retrofit.C34423o;
import com.avito.android.retrofit.C34423o.a;
import com.avito.android.retrofit.C34427t.a;
import com.avito.android.retrofit.r;
import com.avito.android.retrofit.r.a;
import javax.inject.Inject;
import kotlin.Metadata;
import okhttp3.Call;
import okhttp3.Request;

/* compiled from: CompositeCallFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/retrofit/w;", "Lokhttp3/Call$Factory;", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w implements Call.Factory {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C34427t f255195b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final r f255196c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C34423o f255197d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Call.Factory f255198e;

    @Inject
    public w(@Y61.k C34427t c34427t, @Y61.k r rVar, @Y61.k C34423o c34423o, @Y61.k Call.Factory factory) {
        this.f255195b = c34427t;
        this.f255196c = rVar;
        this.f255197d = c34423o;
        this.f255198e = factory;
    }

    @Override // okhttp3.Call.Factory
    @Y61.k
    public final Call newCall(@Y61.k Request request) {
        retrofit2.j jVar = (retrofit2.j) request.tag(retrofit2.j.class);
        Call callNewCall = this.f255198e.newCall(request);
        if (jVar == null) {
            return callNewCall;
        }
        C34423o c34423o = this.f255197d;
        c34423o.getClass();
        C34423o.a aVar = c34423o.new a(request, callNewCall, jVar.f430007a.getDeclaredAnnotations());
        r rVar = this.f255196c;
        rVar.getClass();
        r.a aVar2 = rVar.new a(request, aVar, jVar);
        C34427t c34427t = this.f255195b;
        c34427t.getClass();
        return c34427t.new a(request, aVar2, jVar);
    }
}
