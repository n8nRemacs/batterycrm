package com.avito.android.geo_common.interactor;

import com.avito.android.remote.model.Location;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import mF.InterfaceC43955a;

/* compiled from: TopLocationInteractor.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/geo_common/interactor/C;", "Lcom/avito/android/geo_common/interactor/B;", "_avito_geo-common_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes13.dex */
public final class C implements B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC43955a> f159317a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Location f159318b;

    /* compiled from: TopLocationInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Location;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            C.this.f159318b = (Location) obj;
        }
    }

    @Inject
    public C(@Y61.k h31.e<InterfaceC43955a> eVar) {
        this.f159317a = eVar;
    }

    @Override // com.avito.android.geo_common.interactor.B
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Location> e() {
        Location location = this.f159318b;
        return location != null ? io.reactivex.rxjava3.core.z.c0(location) : f().K(new a());
    }

    @Override // com.avito.android.geo_common.interactor.B
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Location> f() {
        return this.f159317a.get().e();
    }
}
