package com.avito.avcalls.rtc.device.video.capturing;

import com.avito.avcalls.rtc.media.k;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.S;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: VideoCapturerControllerProvider.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/avcalls/rtc/device/video/capturing/g;", "invoke", "()Lcom/avito/avcalls/rtc/device/video/capturing/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class h extends N implements Y41.a<g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.avcalls.utils.coroutines.c f333114l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b f333115m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f333116n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.avcalls.config.f f333117o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.str_seller_orders.orders_seller.d f333118p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.avito.android.str_seller_orders.orders_seller.d dVar, com.avito.avcalls.config.f fVar, b bVar, k kVar, com.avito.avcalls.utils.coroutines.c cVar) {
        super(0);
        this.f333114l = cVar;
        this.f333115m = bVar;
        this.f333116n = kVar;
        this.f333117o = fVar;
        this.f333118p = dVar;
    }

    @Override // Y41.a
    public final g invoke() {
        com.avito.avcalls.utils.coroutines.c cVar = this.f333114l;
        C43238h c43238hA = U.a(cVar.f333661d.plus(t1.b()).plus(new S("capturer_coroutine")));
        return new g(new f(this.f333115m, this.f333116n, this.f333117o, this.f333118p, c43238hA));
    }
}
