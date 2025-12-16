package com.avito.android.historical_suggests.suggest.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import uI.C48902c;

/* compiled from: HistoricalSuggestsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.interactor.HistoricalSuggestsInteractorImpl", f = "HistoricalSuggestsInteractor.kt", i = {0}, l = {157}, m = "toSuggestion", n = {"index"}, s = {"I$0"})
/* loaded from: classes13.dex */
final class k extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public int f162073q;

    /* renamed from: r, reason: collision with root package name */
    public String f162074r;

    /* renamed from: s, reason: collision with root package name */
    public String f162075s;

    /* renamed from: t, reason: collision with root package name */
    public C48902c f162076t;

    /* renamed from: u, reason: collision with root package name */
    public String f162077u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f162078v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f162079w;

    /* renamed from: x, reason: collision with root package name */
    public int f162080x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f162079w = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f162078v = obj;
        this.f162080x |= BeduinInputModel.MIN_TEXT_VERSION;
        return m.e(this.f162079w, null, 0, this);
    }
}
