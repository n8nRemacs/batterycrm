package com.avito.android.location.perf_location;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PerformanceRegionLocationProvider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.location.perf_location.PerformanceRegionLocationProviderImpl", f = "PerformanceRegionLocationProvider.kt", i = {0, 0, 0, 1}, l = {95, 45}, m = "findRegionSynchronized", n = {"this", "$this$withLock_u24default$iv", "useApiFallback", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "Z$0", "L$0"})
/* loaded from: classes14.dex */
final class i extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f181829q;

    /* renamed from: r, reason: collision with root package name */
    public kotlinx.coroutines.sync.d f181830r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f181831s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f181832t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ k f181833u;

    /* renamed from: v, reason: collision with root package name */
    public int f181834v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f181833u = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f181832t = obj;
        this.f181834v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f181833u.c(false, this);
    }
}
