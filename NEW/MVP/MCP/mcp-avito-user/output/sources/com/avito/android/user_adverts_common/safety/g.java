package com.avito.android.user_adverts_common.safety;

import Y61.k;
import com.avito.android.remote.q1;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.maybe.C41917k;
import io.reactivex.rxjava3.internal.operators.maybe.d0;
import javax.inject.Inject;
import kotlin.Metadata;
import lJ0.InterfaceC43648d;

/* compiled from: SafetyInfoProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_common/safety/g;", "Lcom/avito/android/user_adverts_common/safety/b;", "_avito_user-adverts-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<q1> f315925a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f315926b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC43648d f315927c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.f f315928d;

    @Inject
    public g(@k h31.e<q1> eVar, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC43648d interfaceC43648d, @k com.avito.android.server_time.f fVar) {
        this.f315925a = eVar;
        this.f315926b = interfaceC35745a5;
        this.f315927c = interfaceC43648d;
        this.f315928d = fVar;
    }

    @Override // com.avito.android.user_adverts_common.safety.b
    @k
    public final d0 a(@k String str, @k String str2) {
        return new C41917k(new c(this, str2, 0)).h(new f(this, str, str2)).p(this.f315926b.a()).l();
    }
}
