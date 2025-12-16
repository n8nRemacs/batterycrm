package com.avito.android.gig_motivation_payment.ui.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MotivationPaymentActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.gig_motivation_payment.ui.mvi.MotivationPaymentActor", f = "MotivationPaymentActor.kt", i = {}, l = {78, 79}, m = "loadMotivationPayment", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f160216q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f160217r;

    /* renamed from: s, reason: collision with root package name */
    public int f160218s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f160217r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f160216q = obj;
        this.f160218s |= BeduinInputModel.MIN_TEXT_VERSION;
        return h.c(this.f160217r, null, this);
    }
}
