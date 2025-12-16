package com.avito.android.location.perf_location;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidGeocoderRegionProvider.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.location.perf_location.AndroidGeocoderRegionProviderImpl", f = "AndroidGeocoderRegionProvider.kt", i = {}, l = {34}, m = "getLocationRegion", n = {}, s = {})
/* loaded from: classes14.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f181817q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f181818r;

    /* renamed from: s, reason: collision with root package name */
    public int f181819s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f181818r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f181817q = obj;
        this.f181819s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f181818r.a(null, null, this);
    }
}
