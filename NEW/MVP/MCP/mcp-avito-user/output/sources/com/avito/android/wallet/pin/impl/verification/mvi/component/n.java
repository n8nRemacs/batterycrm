package com.avito.android.wallet.pin.impl.verification.mvi.component;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WalletPinVerificationInteractor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.component.WalletPinVerificationInteractor", f = "WalletPinVerificationInteractor.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {182, 184, 197, 210, 219, 224}, m = "encryptWithBiometry", n = {"this", "$this$encryptWithBiometry", "enteredPin", "biometryInfo", "events", "this", "$this$encryptWithBiometry", "biometryInfo", "events"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes5.dex */
final class n extends ContinuationImpl {

    /* renamed from: q, reason: collision with root package name */
    public m f329187q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC43172j f329188r;

    /* renamed from: s, reason: collision with root package name */
    public Object f329189s;

    /* renamed from: t, reason: collision with root package name */
    public Object f329190t;

    /* renamed from: u, reason: collision with root package name */
    public rP0.h f329191u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f329192v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f329193w;

    /* renamed from: x, reason: collision with root package name */
    public int f329194x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f329193w = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        this.f329192v = obj;
        this.f329194x |= BeduinInputModel.MIN_TEXT_VERSION;
        int i12 = m.f329179h;
        return this.f329193w.b(null, null, null, null, this);
    }
}
