package com.avito.android.code_confirmation.code_confirmation;

import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;

/* compiled from: CodeConfirmationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "lastTime", "Lkotlin/G0;", "accept", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class N<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f119422b;

    public N(T t12) {
        this.f119422b = t12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        T t12 = this.f119422b;
        f0 f0Var = t12.f119452m;
        if (f0Var != null) {
            String strB = t12.f119444e.b(t12.f119445f.a(Long.valueOf(jLongValue)));
            Button button = f0Var.f119543i;
            button.setText(strB);
            button.setEnabled(false);
        }
    }
}
