package com.avito.android.iac_avcalls.impl_module.platform.avcalls.rtc.device.video.capturing;

import Y61.k;
import android.content.Context;
import com.avito.avcalls.rtc.media.j;
import kotlin.Metadata;

/* compiled from: CameraVideoCapturerFactoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_avcalls/impl_module/platform/avcalls/rtc/device/video/capturing/c;", "Lcom/avito/avcalls/rtc/device/video/capturing/b;", "_avito_iac-avcalls_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.avcalls.rtc.device.video.capturing.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f164411a;

    public c(@k Context context) {
        this.f164411a = context;
    }

    @Override // com.avito.avcalls.rtc.device.video.capturing.b
    @k
    public final d a(@k com.avito.avcalls.rtc.media.k kVar, @k com.avito.android.str_seller_orders.orders_seller.d dVar) {
        return new d((zJ.k) ((j) kVar.f333189a.getValue()), this.f164411a, dVar);
    }
}
