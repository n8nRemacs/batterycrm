package com.avito.android.location.perf_location;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PerformanceRegionLocationProvider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.location.perf_location.PerformanceRegionLocationProviderImpl", f = "PerformanceRegionLocationProvider.kt", i = {}, l = {63}, m = "getCoordinatesFromApi", n = {}, s = {})
/* loaded from: classes14.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f181835q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f181836r;

    /* renamed from: s, reason: collision with root package name */
    public int f181837s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f181836r = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f181835q = obj;
        this.f181837s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f181836r.d(this);
    }
}
