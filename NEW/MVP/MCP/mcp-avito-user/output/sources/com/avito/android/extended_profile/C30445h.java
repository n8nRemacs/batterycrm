package com.avito.android.extended_profile;

import android.view.View;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.extended_profile.ExtendedProfileFragment;
import com.avito.android.util.N0;
import com.avito.android.util.V2;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.extended_profile.h, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C30445h implements HV0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f150001b;

    public /* synthetic */ C30445h(View.OnCreateContextMenuListener onCreateContextMenuListener, int i12) {
        this.f150000a = i12;
        this.f150001b = onCreateContextMenuListener;
    }

    @Override // HV0.b
    public final void close() {
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.f150001b;
        switch (this.f150000a) {
            case 0:
                com.avito.android.lib.design.modal.a aVar = (com.avito.android.lib.design.modal.a) onCreateContextMenuListener;
                ExtendedProfileFragment.a aVar2 = ExtendedProfileFragment.f149283Y0;
                try {
                    N0.a(aVar);
                    break;
                } catch (Throwable th2) {
                    V2.f318762a.h("BeduinV2", th2, ExtendedProfileFragment.i.f149326l);
                    return;
                }
            default:
                ExtendedProfileFragment.a aVar3 = ExtendedProfileFragment.f149283Y0;
                ((BaseBeduinHostFragment.DetachedBottomSheet) onCreateContextMenuListener).dismissAllowingStateLoss();
                break;
        }
    }
}
