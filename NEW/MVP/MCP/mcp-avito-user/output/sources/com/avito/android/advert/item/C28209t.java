package com.avito.android.advert.item;

import android.view.View;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.util.V2;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.advert.item.t, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C28209t implements HV0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f80515b;

    public /* synthetic */ C28209t(View.OnCreateContextMenuListener onCreateContextMenuListener, int i12) {
        this.f80514a = i12;
        this.f80515b = onCreateContextMenuListener;
    }

    @Override // HV0.b
    public final void close() {
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.f80515b;
        switch (this.f80514a) {
            case 0:
                com.avito.android.lib.design.modal.a aVar = (com.avito.android.lib.design.modal.a) onCreateContextMenuListener;
                AdvertDetailsFragment.C27803a c27803a = AdvertDetailsFragment.f71351B5;
                try {
                    com.avito.android.util.N0.a(aVar);
                    break;
                } catch (Throwable th2) {
                    V2.f318762a.h("BeduinV2", th2, AdvertDetailsFragment.w.f71582l);
                    return;
                }
            default:
                AdvertDetailsFragment.C27803a c27803a2 = AdvertDetailsFragment.f71351B5;
                ((BaseBeduinHostFragment.DetachedBottomSheet) onCreateContextMenuListener).dismissAllowingStateLoss();
                break;
        }
    }
}
