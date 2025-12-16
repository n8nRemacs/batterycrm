package com.avito.android.orderBeduinV2;

import android.view.View;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.orderBeduinV2.OrderFragment;
import com.avito.android.util.N0;
import com.avito.android.util.V2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class a implements HV0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f209751b;

    public /* synthetic */ a(View.OnCreateContextMenuListener onCreateContextMenuListener, int i12) {
        this.f209750a = i12;
        this.f209751b = onCreateContextMenuListener;
    }

    @Override // HV0.b
    public final void close() {
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.f209751b;
        switch (this.f209750a) {
            case 0:
                com.avito.android.lib.design.modal.a aVar = (com.avito.android.lib.design.modal.a) onCreateContextMenuListener;
                OrderFragment.a aVar2 = OrderFragment.f209724F0;
                try {
                    N0.a(aVar);
                    break;
                } catch (Throwable th2) {
                    V2.f318762a.h("BeduinV2", th2, OrderFragment.h.f209742l);
                    return;
                }
            default:
                OrderFragment.a aVar3 = OrderFragment.f209724F0;
                ((BaseBeduinHostFragment.DetachedBottomSheet) onCreateContextMenuListener).dismissAllowingStateLoss();
                break;
        }
    }
}
