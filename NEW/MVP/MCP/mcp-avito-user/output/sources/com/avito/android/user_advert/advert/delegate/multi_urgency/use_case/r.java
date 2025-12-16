package com.avito.android.user_advert.advert.delegate.multi_urgency.use_case;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MultiUrgencyFlow.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.user_advert.advert.delegate.multi_urgency.use_case.MultiUrgencyUpdateFlowAdapter", f = "MultiUrgencyFlow.kt", i = {1, 1}, l = {22, AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF}, m = "emit", n = {"this", "rollback"}, s = {"L$0", "L$1"})
/* loaded from: classes4.dex */
final class r extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public s f308749q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.user_advert.advert.items.multi_urgency.c f308750r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f308751s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f308752t;

    /* renamed from: u, reason: collision with root package name */
    public int f308753u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f308752t = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f308751s = obj;
        this.f308753u |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f308752t.a(null, null, this);
    }
}
