package com.avito.android.services_realty_sheet.feedback;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ServiceRealtySheetFeedbackHelperImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.services_realty_sheet.feedback.ServiceRealtySheetFeedbackHelperImpl", f = "ServiceRealtySheetFeedbackHelperImpl.kt", i = {0}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "showFeedbackDelayed", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class d extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public b f280414q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f280415r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f280416s;

    /* renamed from: t, reason: collision with root package name */
    public int f280417t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f280416s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.f280415r = obj;
        this.f280417t |= BeduinInputModel.MIN_TEXT_VERSION;
        return this.f280416s.a(this);
    }
}
