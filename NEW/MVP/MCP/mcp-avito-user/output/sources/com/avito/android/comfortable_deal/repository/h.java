package com.avito.android.comfortable_deal.repository;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ComfortableDealRepository.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.comfortable_deal.repository.ComfortableDealRepositoryImpl", f = "ComfortableDealRepository.kt", i = {0, 0}, l = {347}, m = "getMortgageLink", n = {"this", "utmSource"}, s = {"L$0", "L$1"})
/* loaded from: classes12.dex */
final class h extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public d f122588q;

    /* renamed from: r, reason: collision with root package name */
    public String f122589r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f122590s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f122591t;

    /* renamed from: u, reason: collision with root package name */
    public int f122592u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f122591t = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f122590s = obj;
        this.f122592u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f122591t.v(null, null, null, null, this);
    }
}
