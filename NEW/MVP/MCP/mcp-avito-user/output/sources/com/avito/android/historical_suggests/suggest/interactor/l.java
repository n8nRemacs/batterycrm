package com.avito.android.historical_suggests.suggest.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import uI.C48902c;

/* compiled from: HistoricalSuggestsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.interactor.HistoricalSuggestsInteractorImpl", f = "HistoricalSuggestsInteractor.kt", i = {0, 0, 0}, l = {176, 182}, m = "toSuggestion", n = {"this", "$this$toSuggestion", "index"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes13.dex */
final class l extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public int f162081A;

    /* renamed from: q, reason: collision with root package name */
    public m f162082q;

    /* renamed from: r, reason: collision with root package name */
    public sI.e f162083r;

    /* renamed from: s, reason: collision with root package name */
    public String f162084s;

    /* renamed from: t, reason: collision with root package name */
    public String f162085t;

    /* renamed from: u, reason: collision with root package name */
    public C48902c f162086u;

    /* renamed from: v, reason: collision with root package name */
    public String f162087v;

    /* renamed from: w, reason: collision with root package name */
    public int f162088w;

    /* renamed from: x, reason: collision with root package name */
    public int f162089x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f162090y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m f162091z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f162091z = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f162090y = obj;
        this.f162081A |= BeduinInputModel.MIN_TEXT_VERSION;
        return m.f(this.f162091z, null, 0, this);
    }
}
