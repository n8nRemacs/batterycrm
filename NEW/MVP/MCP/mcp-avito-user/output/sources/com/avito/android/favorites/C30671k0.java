package com.avito.android.favorites;

import android.view.View;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.favorites.FavoritesFragment;
import com.avito.android.util.V2;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.favorites.k0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C30671k0 implements HV0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f157378b;

    public /* synthetic */ C30671k0(View.OnCreateContextMenuListener onCreateContextMenuListener, int i12) {
        this.f157377a = i12;
        this.f157378b = onCreateContextMenuListener;
    }

    @Override // HV0.b
    public final void close() {
        View.OnCreateContextMenuListener onCreateContextMenuListener = this.f157378b;
        switch (this.f157377a) {
            case 0:
                com.avito.android.lib.design.modal.a aVar = (com.avito.android.lib.design.modal.a) onCreateContextMenuListener;
                FavoritesFragment.a aVar2 = FavoritesFragment.f156217a1;
                try {
                    com.avito.android.util.N0.a(aVar);
                    break;
                } catch (Throwable th2) {
                    V2.f318762a.h("BeduinV2", th2, FavoritesFragment.h.f156261l);
                    return;
                }
            default:
                FavoritesFragment.a aVar3 = FavoritesFragment.f156217a1;
                ((BaseBeduinHostFragment.DetachedBottomSheet) onCreateContextMenuListener).dismissAllowingStateLoss();
                break;
        }
    }
}
