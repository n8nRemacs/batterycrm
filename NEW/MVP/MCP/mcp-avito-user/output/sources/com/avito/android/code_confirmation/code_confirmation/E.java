package com.avito.android.code_confirmation.code_confirmation;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CodeConfirmationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class E extends kotlin.jvm.internal.N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ T f119413l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(T t12) {
        super(1);
        this.f119413l = t12;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        CodeConfirmationActivity codeConfirmationActivity = this.f119413l.f119453n;
        if (codeConfirmationActivity != null) {
            codeConfirmationActivity.f119404t.b(G0.f406611a);
        }
        return G0.f406611a;
    }
}
