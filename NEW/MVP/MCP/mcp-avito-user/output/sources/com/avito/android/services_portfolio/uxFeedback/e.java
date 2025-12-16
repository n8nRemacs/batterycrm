package com.avito.android.services_portfolio.uxFeedback;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ServicesPortfolioFeedbackHelperImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.services_portfolio.uxFeedback.ServicesPortfolioFeedbackHelperImpl", f = "ServicesPortfolioFeedbackHelperImpl.kt", i = {0}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "showFeedbackDelayed", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class e extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public c f280401q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f280402r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c f280403s;

    /* renamed from: t, reason: collision with root package name */
    public int f280404t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f280403s = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f280402r = obj;
        this.f280404t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f280403s.a(this);
    }
}
