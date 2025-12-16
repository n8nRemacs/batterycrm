package com.avito.android.publish.details.historical_suggest;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HistoricalSuggestsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.publish.details.historical_suggest.HistoricalSuggestsInteractorImpl", f = "HistoricalSuggestsInteractor.kt", i = {0}, l = {69}, m = "getCoords", n = {"this"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class j extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m f234677q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f234678r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f234679s;

    /* renamed from: t, reason: collision with root package name */
    public int f234680t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f234679s = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f234678r = obj;
        this.f234680t |= BeduinInputModel.MIN_TEXT_VERSION;
        return m.b(this.f234679s, null, this);
    }
}
