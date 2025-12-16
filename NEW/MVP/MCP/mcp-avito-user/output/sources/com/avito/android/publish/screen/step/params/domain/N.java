package com.avito.android.publish.screen.step.params.domain;

import com.avito.android.publish.details.K1;
import com.avito.android.publish.screen.step.params.mvi.entity.PublishDetailsInternalAction;
import com.avito.android.remote.model.PretendResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;

/* compiled from: PublishDetailsInteractorAsync.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/PretendResult;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/PretendResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class N extends kotlin.jvm.internal.N implements Y41.l<PretendResult, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34076c f241151l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(C34076c c34076c) {
        super(1);
        this.f241151l = c34076c;
    }

    @Override // Y41.l
    public final G0 invoke(PretendResult pretendResult) {
        PretendResult pretendResult2 = pretendResult;
        C34076c c34076c = this.f241151l;
        e2 e2Var = c34076c.f241181K;
        e2Var.K5(PublishDetailsInternalAction.InternalStateAction.ShowContent.f241443b);
        e2Var.K5(new PublishDetailsInternalAction.InternalStateAction.UpdateValidationProgress(false));
        c34076c.q().applyPretendResult(pretendResult2.getErrors());
        if (!pretendResult2.getSuccess()) {
            c34076c.f241182L.setValue(new K1.AbstractC33668b.j(c34076c.f241190e.a(null)));
            c34076c.e7();
        }
        return G0.f406611a;
    }
}
