package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.renderer.toast;

import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ToastRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/button/Button;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/button/Button;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i extends N implements Y41.l<Button, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ToastState f221257l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ToastState toastState) {
        super(1);
        this.f221257l = toastState;
    }

    @Override // Y41.l
    public final G0 invoke(Button button) {
        Button button2 = button;
        ToastState toastState = this.f221257l;
        button2.setVisibility(toastState.getF221225e() ? 0 : 8);
        button2.setOnClickListener(new h(toastState, 0));
        return G0.f406611a;
    }
}
