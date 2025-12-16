package com.avito.android.gig_motivation_payment.ui.deeplinks.payment_type;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.hms.adapter.internal.AvailableCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GigMotivationPaymentTypeDeeplinkHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.gig_motivation_payment.ui.deeplinks.payment_type.GigMotivationPaymentTypeDeeplinkHandler", f = "GigMotivationPaymentTypeDeeplinkHandler.kt", i = {0, 1}, l = {AvailableCode.HMS_IS_SPOOF, 32, 41}, m = "doHandleSuspend", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes13.dex */
final class b extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public a f160200q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f160201r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f160202s;

    /* renamed from: t, reason: collision with root package name */
    public int f160203t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f160202s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f160201r = obj;
        this.f160203t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f160202s.o(null, this);
    }
}
