package com.avito.avcalls.rtc.device.video.capturing;

import com.avito.avcalls.rtc.media.k;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: VideoCapturerController.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/device/video/capturing/c;", "invoke", "()Lcom/avito/avcalls/rtc/device/video/capturing/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class e extends N implements Y41.a<c> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f333100l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f333101m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.str_seller_orders.orders_seller.d f333102n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, k kVar, com.avito.avcalls.config.f fVar, com.avito.android.str_seller_orders.orders_seller.d dVar) {
        super(0);
        this.f333100l = bVar;
        this.f333101m = kVar;
        this.f333102n = dVar;
    }

    @Override // Y41.a
    public final c invoke() {
        return new c(this.f333100l.a(this.f333101m, this.f333102n));
    }
}
