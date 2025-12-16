package com.avito.avcalls.rtc;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: PCSessionLogsWrapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.avcalls.rtc.PCSessionLogsWrapper", f = "PCSessionLogsWrapper.kt", i = {0}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED}, m = "createOffer", n = {"this"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public q f333201q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f333202r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f333203s;

    /* renamed from: t, reason: collision with root package name */
    public int f333204t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f333203s = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f333202r = obj;
        this.f333204t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f333203s.M(this);
    }
}
