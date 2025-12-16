package com.avito.android.verification.verification_passport;

import VM0.a;
import Y41.p;
import androidx.view.O0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.verification.verification_passport.VerificationPassportActivity;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.data.model.CBRCompletionResult;
import ru.cyberity.cbr.core.data.model.CBRSDKState;

/* compiled from: VerificationPassportActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "result", "Lru/cyberity/cbr/core/data/model/CBRSDKState;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lru/cyberity/cbr/core/data/model/CBRCompletionResult;Lru/cyberity/cbr/core/data/model/CBRSDKState;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class j extends N implements p<CBRCompletionResult, CBRSDKState, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VerificationPassportActivity f325709l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(VerificationPassportActivity verificationPassportActivity) {
        super(2);
        this.f325709l = verificationPassportActivity;
    }

    @Override // Y41.p
    public final G0 invoke(CBRCompletionResult cBRCompletionResult, CBRSDKState cBRSDKState) {
        CBRCompletionResult cBRCompletionResult2 = cBRCompletionResult;
        CBRSDKState cBRSDKState2 = cBRSDKState;
        boolean z12 = cBRCompletionResult2 instanceof CBRCompletionResult.AbnormalTermination;
        O0 o02 = this.f325709l.f325679n;
        if (z12) {
            VerificationPassportActivity.a aVar = VerificationPassportActivity.f325677s;
            ((l) o02.getValue()).accept(new a.b(((CBRCompletionResult.AbnormalTermination) cBRCompletionResult2).getException(), cBRSDKState2));
        } else if (cBRCompletionResult2 instanceof CBRCompletionResult.SuccessTermination) {
            VerificationPassportActivity.a aVar2 = VerificationPassportActivity.f325677s;
            ((l) o02.getValue()).accept(new a.c(cBRSDKState2));
        }
        return G0.f406611a;
    }
}
