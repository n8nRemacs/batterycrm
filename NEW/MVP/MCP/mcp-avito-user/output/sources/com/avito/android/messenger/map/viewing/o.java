package com.avito.android.messenger.map.viewing;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/map/viewing/view/a;", "clickedPin", "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/map/viewing/view/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatformMapFragment f196853b;

    public o(PlatformMapFragment platformMapFragment) {
        this.f196853b = platformMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.messenger.map.viewing.view.a aVar = (com.avito.android.messenger.map.viewing.view.a) obj;
        y yVar = this.f196853b.f196796p0;
        if (yVar == null) {
            yVar = null;
        }
        yVar.l3(aVar);
    }
}
