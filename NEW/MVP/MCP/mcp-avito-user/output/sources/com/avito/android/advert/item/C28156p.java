package com.avito.android.advert.item;

import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.avl.view.AvlPlayerActivity;
import com.avito.android.extended_profile.ExtendedProfileFragment;
import com.avito.android.favorites.FavoritesFragment;
import com.avito.beduin.v2.utils.network.b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.advert.item.p, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C28156p implements HV0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78127a;

    @Override // HV0.b
    public final void close() {
        switch (this.f78127a) {
            case 0:
                AdvertDetailsFragment.C27803a c27803a = AdvertDetailsFragment.f71351B5;
                break;
            case 1:
                int i12 = AvlPlayerActivity.f98291Q;
                break;
            case 2:
                ExtendedProfileFragment.a aVar = ExtendedProfileFragment.f149283Y0;
                break;
            case 3:
                FavoritesFragment.a aVar2 = FavoritesFragment.f156217a1;
                break;
            case 4:
                int i13 = com.avito.beduin.v2.utils.detached.b.f338382d;
                break;
            default:
                b.a aVar3 = com.avito.beduin.v2.utils.network.b.f338456e;
                break;
        }
    }
}
