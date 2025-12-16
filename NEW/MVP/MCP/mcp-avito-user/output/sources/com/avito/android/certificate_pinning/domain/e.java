package com.avito.android.certificate_pinning.domain;

import Ag.CallableC13028a;
import Y61.k;
import com.avito.android.H0;
import com.avito.android.analytics.clickstream.I;
import com.avito.android.remote.interceptor.InterfaceC34313w;
import com.avito.android.util.InterfaceC35745a5;
import ho.InterfaceC40966b;
import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* compiled from: UnsafeNetworkInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/certificate_pinning/domain/e;", "Lcom/avito/android/certificate_pinning/domain/a;", "_avito_unsafe-network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final H0 f117785a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Set<Interceptor> f117786b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f117787c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final OkHttpClient f117788d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final OkHttpClient f117789e;

    @Inject
    public e(@k H0 h02, @InterfaceC40966b.a @k Set<Interceptor> set, @k InterfaceC35745a5 interfaceC35745a5, @k Provider<OkHttpClient> provider) {
        this.f117785a = h02;
        this.f117786b = set;
        this.f117787c = interfaceC35745a5;
        OkHttpClient.Builder builderNewBuilder = provider.get().newBuilder();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            builderNewBuilder.addInterceptor((Interceptor) it.next());
        }
        this.f117788d = builderNewBuilder.build();
        OkHttpClient.Builder builderNewBuilder2 = provider.get().newBuilder();
        builderNewBuilder2.interceptors().clear();
        Set<Interceptor> set2 = this.f117786b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            if (!(((Interceptor) obj) instanceof InterfaceC34313w)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            builderNewBuilder2.addInterceptor((Interceptor) it2.next());
        }
        builderNewBuilder2.followRedirects(false);
        this.f117789e = builderNewBuilder2.build();
    }

    @Override // com.avito.android.certificate_pinning.domain.a
    @k
    public final W a() {
        Request requestB = b(true);
        return new G(new CallableC13028a(10, this, requestB)).r(new b(requestB)).u(new I(10)).n(new d(this)).z(this.f117787c.a());
    }

    public final Request b(boolean z12) {
        String strS;
        if (z12) {
            strS = "http://connectivitycheck.gstatic.com/generate_204";
        } else {
            StringBuilder sb2 = new StringBuilder();
            String strA = this.f117785a.a();
            int I12 = C43066x.I(strA, "http://", 0, false, 2);
            if (I12 >= 0) {
                strA = C43066x.d0(strA, I12, 7 + I12, "https://").toString();
            }
            strS = AK.c.s(sb2, strA, "/2/time");
        }
        return new Request.Builder().url(strS).build();
    }
}
