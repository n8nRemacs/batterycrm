package com.avito.android.cart_snippet_actions;

import android.os.Build;
import com.avito.android.lib.design.stepper.Stepper;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CartActionsView.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class m extends N implements Y41.a<Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Stepper f116261l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CartActionsViewImpl cartActionsViewImpl, Stepper stepper) {
        super(0);
        this.f116261l = stepper;
    }

    @Override // Y41.a
    public final Boolean invoke() {
        int i12 = CartActionsViewImpl.f116146e;
        Stepper stepper = this.f116261l;
        if (Build.VERSION.SDK_INT >= 30) {
            stepper.performHapticFeedback(16);
        }
        return Boolean.FALSE;
    }
}
