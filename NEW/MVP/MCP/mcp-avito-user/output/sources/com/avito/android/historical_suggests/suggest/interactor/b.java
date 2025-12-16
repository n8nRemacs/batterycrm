package com.avito.android.historical_suggests.suggest.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HistoricalSuggestsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.interactor.HistoricalSuggestsInteractorImpl", f = "HistoricalSuggestsInteractor.kt", i = {0, 0, 1, 1}, l = {141, 145}, m = "addCoordinatesWithIdOrNull", n = {"this", "$this$addCoordinatesWithIdOrNull", "$this$addCoordinatesWithIdOrNull", ServiceTransportationWidget.LocationField.COORDINATES}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes13.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public Object f162004q;

    /* renamed from: r, reason: collision with root package name */
    public Object f162005r;

    /* renamed from: s, reason: collision with root package name */
    public m f162006s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f162007t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f162008u;

    /* renamed from: v, reason: collision with root package name */
    public int f162009v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f162008u = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f162007t = obj;
        this.f162009v |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f162008u.g(null, this);
    }
}
