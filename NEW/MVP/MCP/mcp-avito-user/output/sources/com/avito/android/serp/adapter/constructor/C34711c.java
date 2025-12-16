package com.avito.android.serp.adapter.constructor;

import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorAdvertItemPresenterImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.constructor.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34711c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SerpConstructorAdvertItem f269463l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f269464m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34711c(o oVar, SerpConstructorAdvertItem serpConstructorAdvertItem) {
        super(0);
        this.f269463l = serpConstructorAdvertItem;
        this.f269464m = oVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        List<String> exposureParams = this.f269463l.getExposureParams();
        if (exposureParams != null) {
            this.f269464m.f269526r.c(exposureParams);
        }
        return G0.f406611a;
    }
}
