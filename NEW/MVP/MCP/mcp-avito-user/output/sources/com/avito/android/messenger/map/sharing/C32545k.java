package com.avito.android.messenger.map.sharing;

import com.avito.android.analytics.InterfaceC28373a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SharingMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.sharing.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32545k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharingMapFragment f196744b;

    public C32545k(SharingMapFragment sharingMapFragment) {
        this.f196744b = sharingMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        SharingMapFragment sharingMapFragment = this.f196744b;
        InterfaceC28373a interfaceC28373a = sharingMapFragment.f196697q0;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        String str = sharingMapFragment.f196689B0;
        if (str == null) {
            str = null;
        }
        interfaceC28373a.c(new com.avito.android.messenger.analytics.D(str, "geo_edit"));
        w wVar = sharingMapFragment.f196694n0;
        (wVar != null ? wVar : null).l6();
    }
}
