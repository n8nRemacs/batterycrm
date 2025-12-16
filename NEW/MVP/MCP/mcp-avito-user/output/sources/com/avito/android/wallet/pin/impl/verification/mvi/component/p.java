package com.avito.android.wallet.pin.impl.verification.mvi.component;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WalletPinVerificationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.component.WalletPinVerificationInteractor", f = "WalletPinVerificationInteractor.kt", i = {0, 0, 0, 1, 1, 1, 2, 2}, l = {293, 294, 299}, m = "handleBiometryResult", n = {"this", "$this$handleBiometryResult", "resultActions", "this", "$this$handleBiometryResult", "resultActions", "this", "resultActions"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes5.dex */
final class p extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m f329201q;

    /* renamed from: r, reason: collision with root package name */
    public Object f329202r;

    /* renamed from: s, reason: collision with root package name */
    public AP0.c f329203s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f329204t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m f329205u;

    /* renamed from: v, reason: collision with root package name */
    public int f329206v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f329205u = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f329204t = obj;
        this.f329206v |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = m.f329179h;
        return this.f329205u.c(null, null, false, this);
    }
}
