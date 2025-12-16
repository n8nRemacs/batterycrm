package com.avito.android.verification.verification_passport;

import VM0.a;
import Y41.p;
import com.avito.android.verification.verification_passport.VerificationPassportActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.model.CBRSDKState;

/* compiled from: VerificationPassportActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRSDKState;", "newState", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Lru/cyberity/cbr/core/data/model/CBRSDKState;Lru/cyberity/cbr/core/data/model/CBRSDKState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i extends N implements p<CBRSDKState, CBRSDKState, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VerificationPassportActivity f325708l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(VerificationPassportActivity verificationPassportActivity) {
        super(2);
        this.f325708l = verificationPassportActivity;
    }

    @Override // Y41.p
    public final G0 invoke(CBRSDKState cBRSDKState, CBRSDKState cBRSDKState2) {
        VerificationPassportActivity.a aVar = VerificationPassportActivity.f325677s;
        ((l) this.f325708l.f325679n.getValue()).accept(new a.C1175a(cBRSDKState));
        return G0.f406611a;
    }
}
