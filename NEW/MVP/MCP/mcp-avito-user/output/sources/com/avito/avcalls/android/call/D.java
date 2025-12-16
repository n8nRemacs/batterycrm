package com.avito.avcalls.android.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSessionSignalingApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.android.call.CallSessionSignalingApi", f = "CallSessionSignalingApi.kt", i = {0}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "ringing", n = {"this_$iv"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class D extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public x f331411q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f331412r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f331413s;

    /* renamed from: t, reason: collision with root package name */
    public int f331414t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f331413s = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f331412r = obj;
        this.f331414t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f331413s.h(null, null, null, this);
    }
}
