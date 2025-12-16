package com.avito.android.universal_transaction.transaction;

import android.view.View;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.universal_transaction.transaction.TransactionFragment;
import com.avito.android.util.N0;
import com.avito.android.util.V2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements HV0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f306634b;

    public /* synthetic */ v(View.OnCreateContextMenuListener onCreateContextMenuListener, int i12) {
        this.f306633a = i12;
        this.f306634b = onCreateContextMenuListener;
    }

    @Override // HV0.b
    public final void close() {
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.f306634b;
        switch (this.f306633a) {
            case 0:
                com.avito.android.lib.design.modal.a aVar = (com.avito.android.lib.design.modal.a) onCreateContextMenuListener;
                TransactionFragment.a aVar2 = TransactionFragment.f306549K0;
                try {
                    N0.a(aVar);
                    break;
                } catch (Throwable th2) {
                    V2.f318762a.h("BeduinV2", th2, TransactionFragment.l.f306576l);
                    return;
                }
            default:
                TransactionFragment.a aVar3 = TransactionFragment.f306549K0;
                ((BaseBeduinHostFragment.DetachedBottomSheet) onCreateContextMenuListener).dismissAllowingStateLoss();
                break;
        }
    }
}
