package com.avito.android.wallet.pin.impl.verification.mvi.component;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rP0.C47583b;

/* compiled from: WalletPinVerificationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.component.WalletPinVerificationInteractor", f = "WalletPinVerificationInteractor.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5}, l = {142, 143, 153, 155, 158, 159, 162, 166}, m = "onVerifyPinResponse", n = {"this", "$this$onVerifyPinResponse", "response", "enteredPin", "contentResponse", "currentAttempt", "biometryEnabled", "biometryUsed", "this", "$this$onVerifyPinResponse", "response", "enteredPin", "contentResponse", "currentAttempt", "biometryEnabled", "biometryUsed", "this", "$this$onVerifyPinResponse", "response", "this", "$this$onVerifyPinResponse", "response", "this", "$this$onVerifyPinResponse", "response", "this", "$this$onVerifyPinResponse", "response"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes5.dex */
final class r extends ContinuationImpl {

    /* renamed from: A, reason: collision with root package name */
    public int f329217A;

    /* renamed from: q, reason: collision with root package name */
    public m f329218q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f329219r;

    /* renamed from: s, reason: collision with root package name */
    public rP0.i f329220s;

    /* renamed from: t, reason: collision with root package name */
    public String f329221t;

    /* renamed from: u, reason: collision with root package name */
    public C47583b f329222u;

    /* renamed from: v, reason: collision with root package name */
    public int f329223v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f329224w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f329225x;

    /* renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f329226y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m f329227z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f329227z = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f329226y = obj;
        this.f329217A |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = m.f329179h;
        return this.f329227z.e(null, null, null, 0, null, false, false, this);
    }
}
