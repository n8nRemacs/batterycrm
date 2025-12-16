package com.avito.avcalls.call;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.yandex.metrica.YandexMetricaDefaultValues;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CallSessionSignalingApi.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.call.CallSessionSignalingApi", f = "CallSessionSignalingApi.kt", i = {0}, l = {YandexMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "ringing", n = {"this_$iv"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class G extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public A f332572q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f332573r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ A f332574s;

    /* renamed from: t, reason: collision with root package name */
    public int f332575t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(A a12, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f332574s = a12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f332573r = obj;
        this.f332575t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f332574s.h(null, null, null, this);
    }
}
