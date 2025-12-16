package ru.cyberity.cbr.presentation.screen;

import Y61.k;
import androidx.view.P0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CBRAppActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRAppActivity$viewModel$2 extends N implements Y41.a<P0.c> {
    final /* synthetic */ CBRAppActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CBRAppActivity$viewModel$2(CBRAppActivity cBRAppActivity) {
        super(0);
        this.this$0 = cBRAppActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // Y41.a
    @k
    public final P0.c invoke() {
        CBRAppActivity cBRAppActivity = this.this$0;
        return new CBRAppViewModelFactory(cBRAppActivity, cBRAppActivity.getServiceLocator(), null, 4, null);
    }
}
