package com.avito.android.location.perf_location;

import android.content.Context;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PerformanceRegionLocationProvider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.location.perf_location.PerformanceRegionLocationProviderImpl", f = "PerformanceRegionLocationProvider.kt", i = {0, 0, 1}, l = {53, 58}, m = "findNewLocation", n = {"this", "context", "this"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes14.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public k f181824q;

    /* renamed from: r, reason: collision with root package name */
    public Context f181825r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f181826s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k f181827t;

    /* renamed from: u, reason: collision with root package name */
    public int f181828u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f181827t = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f181826s = obj;
        this.f181828u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f181827t.b(null, false, this);
    }
}
