package com.avito.android.wallet.pin.impl.verification.mvi.component;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rP0.C47583b;

/* compiled from: WalletPinVerificationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.component.WalletPinVerificationInteractor", f = "WalletPinVerificationInteractor.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 3, 3, 3, 5, 5, 5}, l = {242, 250, 251, 266, 267, 276, 277}, m = "verifyPinWithBiometry", n = {"this", "$this$verifyPinWithBiometry", "contentResponse", "events", "currentAttempt", "this", "$this$verifyPinWithBiometry", "contentResponse", "result", "currentAttempt", "this", "$this$verifyPinWithBiometry", "contentResponse", "this", "$this$verifyPinWithBiometry", "contentResponse"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class v extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m f329251q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f329252r;

    /* renamed from: s, reason: collision with root package name */
    public C47583b f329253s;

    /* renamed from: t, reason: collision with root package name */
    public Object f329254t;

    /* renamed from: u, reason: collision with root package name */
    public int f329255u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f329256v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f329257w;

    /* renamed from: x, reason: collision with root package name */
    public int f329258x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f329257w = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f329256v = obj;
        this.f329258x |= BeduinInputModel.MIN_TEXT_VERSION;
        return m.a(this.f329257w, null, null, null, 0, null, this);
    }
}
