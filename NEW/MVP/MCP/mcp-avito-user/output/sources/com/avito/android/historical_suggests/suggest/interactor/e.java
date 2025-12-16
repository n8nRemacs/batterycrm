package com.avito.android.historical_suggests.suggest.interactor;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HistoricalSuggestsInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.historical_suggests.suggest.interactor.HistoricalSuggestsInteractorImpl", f = "HistoricalSuggestsInteractor.kt", i = {0, 1, 1, 1}, l = {88, 95, UpdateStatusCode.DialogButton.CONFIRM}, m = "getV2Suggests", n = {"this", "this", "destination$iv$iv", "index$iv$iv"}, s = {"L$0", "L$0", "L$1", "I$0"})
/* loaded from: classes13.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m f162026q;

    /* renamed from: r, reason: collision with root package name */
    public Collection f162027r;

    /* renamed from: s, reason: collision with root package name */
    public Iterator f162028s;

    /* renamed from: t, reason: collision with root package name */
    public Collection f162029t;

    /* renamed from: u, reason: collision with root package name */
    public int f162030u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f162031v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f162032w;

    /* renamed from: x, reason: collision with root package name */
    public int f162033x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f162032w = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f162031v = obj;
        this.f162033x |= BeduinInputModel.MIN_TEXT_VERSION;
        return m.c(this.f162032w, this);
    }
}
