package com.avito.android.wallet.pin.impl.verification.mvi.component;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rP0.i;

/* compiled from: WalletPinVerificationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.component.WalletPinVerificationInteractor", f = "WalletPinVerificationInteractor.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9}, l = {324, 326, 328, 331, 339, 342, 344, 346, 347, 349, 355}, m = "onIncorrectPin", n = {"this", "$this$onIncorrectPin", "response", "events", "currentAttempt", "biometryEnabled", "biometryUsed", "this", "$this$onIncorrectPin", "response", "biometryUsed", "this", "$this$onIncorrectPin", "response", "this", "$this$onIncorrectPin", "response", "this", "$this$onIncorrectPin", "response", "events", "currentAttempt", "biometryEnabled", "biometryUsed", "this", "$this$onIncorrectPin", "response", "events", "currentAttempt", "biometryEnabled", "biometryUsed", "this", "$this$onIncorrectPin", "response", "events", "currentAttempt", "biometryEnabled", "this", "$this$onIncorrectPin", "response", "events", "currentAttempt", "biometryEnabled", "this", "$this$onIncorrectPin", "response", "events", "currentAttempt", "biometryEnabled"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "Z$0", "Z$1", "L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "I$0", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "I$0", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "I$0", "Z$0"})
/* loaded from: classes5.dex */
final class q extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m f329207q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f329208r;

    /* renamed from: s, reason: collision with root package name */
    public i.a f329209s;

    /* renamed from: t, reason: collision with root package name */
    public rP0.h f329210t;

    /* renamed from: u, reason: collision with root package name */
    public int f329211u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f329212v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f329213w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f329214x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m f329215y;

    /* renamed from: z, reason: collision with root package name */
    public int f329216z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f329215y = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f329214x = obj;
        this.f329216z |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = m.f329179h;
        return this.f329215y.d(null, null, 0, null, false, false, this);
    }
}
