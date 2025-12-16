package com.avito.android.login_suggests_impl;

import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.util.InterfaceC35745a5;
import hD.C40806a;
import io.reactivex.rxjava3.internal.operators.single.G;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LoginSuggestsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/login_suggests_impl/j;", "Lcom/avito/android/login_suggests_impl/g;", "_avito_login-suggests_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34258d f182932a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f182933b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final B3.c f182934c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C40806a f182935d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Set<String> f182936e;

    @Inject
    public j(@Y61.k InterfaceC34258d interfaceC34258d, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k B3.c cVar, @Y61.k C40806a c40806a, @Y61.k Set<String> set) {
        this.f182932a = interfaceC34258d;
        this.f182933b = interfaceC35745a5;
        this.f182934c = cVar;
        this.f182935d = c40806a;
        this.f182936e = set;
    }

    @Override // com.avito.android.login_suggests_impl.g
    @Y61.k
    public final W a() {
        return new G(new VH0.c(this, 20)).n(new h(this)).z(this.f182933b.a());
    }
}
