package com.avito.android.bxcontent;

import android.view.View;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.bxcontent.BxContentFragment;
import com.avito.android.util.V2;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.bxcontent.w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C29261w implements HV0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f113228a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f113229b;

    public /* synthetic */ C29261w(View.OnCreateContextMenuListener onCreateContextMenuListener, int i12) {
        this.f113228a = i12;
        this.f113229b = onCreateContextMenuListener;
    }

    @Override // HV0.b
    public final void close() {
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.f113229b;
        switch (this.f113228a) {
            case 0:
                com.avito.android.lib.design.modal.a aVar = (com.avito.android.lib.design.modal.a) onCreateContextMenuListener;
                BxContentFragment.C28907a c28907a = BxContentFragment.f108886v5;
                try {
                    com.avito.android.util.N0.a(aVar);
                    break;
                } catch (Throwable th2) {
                    V2.f318762a.h("BeduinV2", th2, BxContentFragment.C28909a1.f109164l);
                    return;
                }
            default:
                BxContentFragment.C28907a c28907a2 = BxContentFragment.f108886v5;
                ((BaseBeduinHostFragment.DetachedBottomSheet) onCreateContextMenuListener).dismissAllowingStateLoss();
                break;
        }
    }
}
