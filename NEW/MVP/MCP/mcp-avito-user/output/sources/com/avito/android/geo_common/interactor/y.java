package com.avito.android.geo_common.interactor;

import com.avito.android.geo_common.model.AddressListResult;
import com.avito.android.geo_common.model.SetDefaultAddressResult;
import com.avito.android.remote.model.District;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import mF.InterfaceC43955a;
import pF.InterfaceC46942a;
import sF.C48041a;
import sF.C48042b;
import tF.C48546c;
import tF.C48547d;

/* compiled from: LocationInteractor.kt */
@h31.j
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/geo_common/interactor/y;", "Lcom/avito/android/geo_common/interactor/g;", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class y implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC43955a> f159401a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC46942a> f159402b;

    @Inject
    public y(@Y61.k h31.e<InterfaceC43955a> eVar, @Y61.k h31.e<InterfaceC46942a> eVar2) {
        this.f159401a = eVar;
        this.f159402b = eVar2;
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C A(double d12, double d13, @Y61.l String str) {
        return kotlinx.coroutines.rx3.y.b(C43175k.G(new w(new x(this, d12, d13, str, null), null)));
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<District>> a(@Y61.k String str) {
        return b().a(str);
    }

    public final InterfaceC43955a b() {
        return this.f159401a.get();
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.core.z<C48546c> c(@Y61.k String str, @Y61.k String str2) {
        return b().c(str, str2);
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.core.z<C48547d> d(@Y61.k String str) {
        return b().d(str);
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<Location>> g() {
        return b().g();
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.core.z<List<Location>> i(@Y61.k String str) {
        return b().i(str);
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.l
    public final Object j(@Y61.k String str, @Y61.l String str2, @Y61.k Continuation<? super TypedResult<AddressListResult>> continuation) {
        return b().j(str, str2, continuation);
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C k(@Y61.k String str) {
        return kotlinx.coroutines.rx3.y.b(C43175k.G(new n(new o(this, str, null), null)));
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.l
    public final Object l(@Y61.k String str, int i12, @Y61.k Continuation<? super TypedResult<SetDefaultAddressResult>> continuation) {
        return b().l(str, i12, continuation);
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.core.z<MetroResponseBody> m(@Y61.k String str) {
        return b().m(str);
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.l
    public final Object n(@Y61.k String str, @Y61.l Boolean bool, @Y61.k Continuation continuation) {
        return b().q(str, null, bool, continuation);
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.l
    public final Object o(@Y61.k String str, @Y61.k ContinuationImpl continuationImpl) {
        return b().k(str, null, null, continuationImpl);
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.l
    public final Object p(@Y61.k String str, @Y61.l Double d12, @Y61.l Double d13, @Y61.l Double d14, @Y61.l Double d15, @Y61.k Map map, @Y61.k ContinuationImpl continuationImpl) {
        return b().f(str, d12, d13, d14, d15, null, null, map, continuationImpl);
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C q(double d12, double d13, @Y61.k String str) {
        return kotlinx.coroutines.rx3.y.b(C43175k.G(new h(new i(this, d12, d13, str, null), null)));
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C r(@Y61.l Boolean bool, @Y61.k String str, @Y61.l String str2) {
        return kotlinx.coroutines.rx3.y.b(C43175k.G(new r(new s(this, str, str2, bool, null), null)));
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C s(@Y61.k String str) {
        return kotlinx.coroutines.rx3.y.b(C43175k.G(new j(new k(this, str, null), null)));
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.l
    public final Object t(@Y61.k String str, @Y61.k ContinuationImpl continuationImpl) {
        return b().v(str, continuationImpl);
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C u(@Y61.k String str, @Y61.k HashMap map) {
        return kotlinx.coroutines.rx3.y.b(C43175k.G(new u(new v(this, str, map, null), null)));
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.l
    public final Object v(@Y61.k String str, @Y61.k ContinuationImpl continuationImpl) {
        return b().u(str, continuationImpl);
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.l
    public final Object w(@Y61.k ContinuationImpl continuationImpl) {
        return b().s(continuationImpl);
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.l
    public final Object x(@Y61.k String str, double d12, double d13, @Y61.k String str2, @Y61.k Continuation<? super TypedResult<Object>> continuation) {
        return this.f159402b.get().b(new C48041a(str, new C48042b(d12, d13, str2)), continuation);
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C y(@Y61.k String str, @Y61.l Double d12, @Y61.l Double d13, @Y61.l Double d14, @Y61.l Double d15, @Y61.k Map map) {
        return kotlinx.coroutines.rx3.y.b(C43175k.G(new l(new m(this, str, d12, d13, d14, d15, map, null), null)));
    }

    @Override // com.avito.android.geo_common.interactor.g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.C z() {
        return kotlinx.coroutines.rx3.y.b(C43175k.G(new p(new q(this, null), null)));
    }
}
