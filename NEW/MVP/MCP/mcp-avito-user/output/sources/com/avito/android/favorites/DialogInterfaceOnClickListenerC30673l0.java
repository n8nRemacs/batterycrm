package com.avito.android.favorites;

import android.content.DialogInterface;
import com.avito.android.favorites.FavoritesFragment;
import iR.C41336a;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.favorites.l0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class DialogInterfaceOnClickListenerC30673l0 implements DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f157381b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f157382c;

    public /* synthetic */ DialogInterfaceOnClickListenerC30673l0(Object obj, int i12) {
        this.f157381b = i12;
        this.f157382c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i12) {
        Object obj = this.f157382c;
        switch (this.f157381b) {
            case 0:
                FavoritesFragment.a aVar = FavoritesFragment.f156217a1;
                C41336a.C11375a.a();
                ((Y41.a) obj).invoke();
                break;
            default:
                C41336a.C11375a.a();
                ((x1) obj).f157600d.a2();
                break;
        }
    }
}
