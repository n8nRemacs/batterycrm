package com.avito.android.lib.beduin_v2.feature.cache;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BeduinRequestWithPatternCache.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.lib.beduin_v2.feature.cache.BeduinRequestWithPatternCache", f = "BeduinRequestWithPatternCache.kt", i = {}, l = {38}, m = "makeRequest", n = {}, s = {})
/* loaded from: classes14.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f175998q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f175999r;

    /* renamed from: s, reason: collision with root package name */
    public int f176000s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f175999r = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f175998q = obj;
        this.f176000s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f175999r.b(null, null, false, this);
    }
}
