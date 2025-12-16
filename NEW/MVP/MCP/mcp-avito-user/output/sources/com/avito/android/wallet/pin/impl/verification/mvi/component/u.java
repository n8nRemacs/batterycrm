package com.avito.android.wallet.pin.impl.verification.mvi.component;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import rP0.C47583b;

/* compiled from: WalletPinVerificationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.component.WalletPinVerificationInteractor", f = "WalletPinVerificationInteractor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8}, l = {100, UpdateStatusCode.DialogButton.CONFIRM, 107, 117, 118, 120, 122, 123, 124}, m = "verifyPinInternal", n = {"this", "$this$verifyPinInternal", "enteredPin", "contentResponse", "currentAttempt", "biometryEnabled", "biometryUsed", "this", "$this$verifyPinInternal", "enteredPin", "contentResponse", "currentAttempt", "biometryEnabled", "biometryUsed", "this", "$this$verifyPinInternal", "contentResponse", "currentAttempt", "biometryEnabled", "this", "$this$verifyPinInternal", "contentResponse", "currentAttempt", "biometryEnabled", "this", "$this$verifyPinInternal", "contentResponse", "currentAttempt", "biometryEnabled", "this", "$this$verifyPinInternal", "contentResponse", "currentAttempt", "biometryEnabled", "this", "$this$verifyPinInternal", "contentResponse", "currentAttempt", "biometryEnabled", "this", "contentResponse", "currentAttempt", "biometryEnabled"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "I$0", "Z$0", "Z$1", "L$0", "L$1", "L$2", "I$0", "Z$0", "L$0", "L$1", "L$2", "I$0", "Z$0", "L$0", "L$1", "L$2", "I$0", "Z$0", "L$0", "L$1", "L$2", "I$0", "Z$0", "L$0", "L$1", "L$2", "I$0", "Z$0", "L$0", "L$1", "I$0", "Z$0"})
/* loaded from: classes5.dex */
final class u extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m f329241q;

    /* renamed from: r, reason: collision with root package name */
    public Object f329242r;

    /* renamed from: s, reason: collision with root package name */
    public Object f329243s;

    /* renamed from: t, reason: collision with root package name */
    public C47583b f329244t;

    /* renamed from: u, reason: collision with root package name */
    public int f329245u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f329246v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f329247w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f329248x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f329249y;

    /* renamed from: z, reason: collision with root package name */
    public int f329250z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f329249y = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f329248x = obj;
        this.f329250z |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = m.f329179h;
        return this.f329249y.f(null, null, null, 0, false, false, this);
    }
}
