package com.avito.android.gig_motivation_payment.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MotivationPaymentRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.gig_motivation_payment.data.MotivationPaymentRepositoryImpl", f = "MotivationPaymentRepositoryImpl.kt", i = {}, l = {20}, m = "motivationPayoutSign", n = {}, s = {})
/* loaded from: classes13.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f160098q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f160099r;

    /* renamed from: s, reason: collision with root package name */
    public int f160100s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f160099r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f160098q = obj;
        this.f160100s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f160099r.b(null, this);
    }
}
