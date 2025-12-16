package com.avito.android.messenger.map.viewing;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PlatformMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "newCameraPosition", "Lkotlin/G0;", "accept", "(Lcom/avito/android/avito_map/AvitoMapCameraPosition;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class q<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatformMapFragment f196855b;

    public q(PlatformMapFragment platformMapFragment) {
        this.f196855b = platformMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AvitoMapCameraPosition avitoMapCameraPosition = (AvitoMapCameraPosition) obj;
        y yVar = this.f196855b.f196796p0;
        if (yVar == null) {
            yVar = null;
        }
        yVar.u(avitoMapCameraPosition, false);
    }
}
