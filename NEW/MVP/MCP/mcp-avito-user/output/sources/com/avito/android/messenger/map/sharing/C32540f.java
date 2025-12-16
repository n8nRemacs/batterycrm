package com.avito.android.messenger.map.sharing;

import androidx.view.InterfaceC23040h0;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LiveDatas.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "onChanged", "(Ljava/lang/Object;)V", "com/avito/android/util/architecture_components/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.map.sharing.f, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32540f<T> implements InterfaceC23040h0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SharingMapFragment f196739b;

    public C32540f(SharingMapFragment sharingMapFragment) {
        this.f196739b = sharingMapFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.view.InterfaceC23040h0
    public final void onChanged(T t12) {
        if (t12 != 0) {
            String str = (String) t12;
            SharingMapFragment sharingMapFragment = this.f196739b;
            com.avito.android.messenger.F f12 = sharingMapFragment.f196695o0;
            if (f12 == null) {
                f12 = null;
            }
            String str2 = sharingMapFragment.f196689B0;
            if (str2 == null) {
                str2 = null;
            }
            AvitoMapPoint avitoMapPoint = sharingMapFragment.f196691D0;
            GeoPoint geoPoint = avitoMapPoint != null ? new GeoPoint(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude()) : null;
            MessageBody.Location location = sharingMapFragment.f196690C0;
            sharingMapFragment.startActivityForResult(f12.l(str2, str, geoPoint, location != null ? new GeoPoint(location.getLatitude(), location.getLongitude()) : null), 1);
        }
    }
}
