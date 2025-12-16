package com.avito.android.messenger.map.sharing;

import com.avito.android.location.analytics.FindLocationPage;
import com.avito.android.permissions.C33035e;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import lW.C43692b;

/* compiled from: SharingMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.sharing.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32542h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharingMapFragment f196741b;

    public C32542h(SharingMapFragment sharingMapFragment) {
        this.f196741b = sharingMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SharingMapFragment sharingMapFragment = this.f196741b;
        C43692b c43692b = sharingMapFragment.f196700t0;
        if (c43692b == null) {
            c43692b = null;
        }
        FindLocationPage findLocationPage = FindLocationPage.f181725c;
        c43692b.e("messenger_my_location");
        C33035e c33035e = sharingMapFragment.f196699s0;
        sharingMapFragment.f196688A0.b((c33035e != null ? c33035e : null).g());
    }
}
