package com.avito.android.avl.view;

import android.view.View;
import com.avito.android.avl.view.AvlPlayerActivity;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.util.N0;
import com.avito.android.util.V2;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.avl.view.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C28724d implements HV0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98380a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f98381b;

    public /* synthetic */ C28724d(View.OnCreateContextMenuListener onCreateContextMenuListener, int i12) {
        this.f98380a = i12;
        this.f98381b = onCreateContextMenuListener;
    }

    @Override // HV0.b
    public final void close() {
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.f98381b;
        switch (this.f98380a) {
            case 0:
                com.avito.android.lib.design.modal.a aVar = (com.avito.android.lib.design.modal.a) onCreateContextMenuListener;
                int i12 = AvlPlayerActivity.f98291Q;
                try {
                    N0.a(aVar);
                    break;
                } catch (Throwable th2) {
                    V2.f318762a.h("BeduinV2", th2, AvlPlayerActivity.g.f98325l);
                    return;
                }
            default:
                int i13 = AvlPlayerActivity.f98291Q;
                ((BaseBeduinHostFragment.DetachedBottomSheet) onCreateContextMenuListener).dismissAllowingStateLoss();
                break;
        }
    }
}
