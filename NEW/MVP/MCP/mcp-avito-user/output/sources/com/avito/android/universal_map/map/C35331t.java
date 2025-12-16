package com.avito.android.universal_map.map;

import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.universal_map.UniversalMapParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UniversalMapFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.universal_map.map.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C35331t<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UniversalMapFragment f305944b;

    public C35331t(UniversalMapFragment universalMapFragment) {
        this.f305944b = universalMapFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List<BeduinAction> list;
        UniversalMapParams.MapSettings mapSettings;
        UniversalMapFragment universalMapFragment = this.f305944b;
        UniversalMapParams universalMapParams = universalMapFragment.f304853O0;
        UniversalMapParams.LocationSettings locationSettings = (universalMapParams == null || (mapSettings = universalMapParams.f304742f) == null) ? null : mapSettings.f304751b;
        if (locationSettings != null ? locationSettings.f304749b : true) {
            universalMapFragment.t5();
        }
        if (locationSettings == null || (list = locationSettings.f304750c) == null) {
            return;
        }
        T t12 = universalMapFragment.f304841C0;
        (t12 != null ? t12 : null).hb(list);
    }
}
