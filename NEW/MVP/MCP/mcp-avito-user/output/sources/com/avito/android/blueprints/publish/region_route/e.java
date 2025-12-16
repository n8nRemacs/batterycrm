package com.avito.android.blueprints.publish.region_route;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RegionRoutePresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/blueprints/publish/region_route/e;", "Lcom/avito/android/blueprints/publish/region_route/c;", "<init>", "()V", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    public final com.jakewharton.rxrelay3.c<ParameterElement.B> f106453b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f106454c;

    @Inject
    public e() {
        com.jakewharton.rxrelay3.c<ParameterElement.B> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f106453b = cVar;
        this.f106454c = cVar;
        new com.jakewharton.rxrelay3.c();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ParameterElement.B b12 = (ParameterElement.B) aVar;
        ((g) eVar).U50(b12, new d(this, b12));
    }

    @Override // com.avito.android.blueprints.publish.region_route.c
    @k
    public final z<ParameterElement.B> c() {
        return this.f106454c;
    }
}
