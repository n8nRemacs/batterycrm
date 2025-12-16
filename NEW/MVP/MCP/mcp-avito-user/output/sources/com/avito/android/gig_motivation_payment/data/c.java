package com.avito.android.gig_motivation_payment.data;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MotivationPaymentRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.gig_motivation_payment.data.MotivationPaymentRepositoryImpl", f = "MotivationPaymentRepositoryImpl.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "motivationPayoutRetry", n = {}, s = {})
/* loaded from: classes13.dex */
final class c extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f160095q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f160096r;

    /* renamed from: s, reason: collision with root package name */
    public int f160097s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f160096r = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f160095q = obj;
        this.f160097s |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f160096r.c(null, this);
    }
}
