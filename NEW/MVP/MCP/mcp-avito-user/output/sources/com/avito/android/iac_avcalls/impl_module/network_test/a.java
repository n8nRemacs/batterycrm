package com.avito.android.iac_avcalls.impl_module.network_test;

import Y61.l;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AvCallsNetworkTestImplSplitter.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/network_test/a;", "LKJ/a;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements KJ.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final FJ.a f164324a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<d> f164325b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<h> f164326c;

    @Inject
    public a(@Y61.k FJ.a aVar, @Y61.k h31.e<d> eVar, @Y61.k h31.e<h> eVar2) {
        this.f164324a = aVar;
        this.f164325b = eVar;
        this.f164326c = eVar2;
    }

    @Override // KJ.a
    @l
    public final Object a(@Y61.k Continuation continuation) {
        return this.f164324a.v().invoke().booleanValue() ? this.f164326c.get().a(continuation) : this.f164325b.get().a(continuation);
    }
}
