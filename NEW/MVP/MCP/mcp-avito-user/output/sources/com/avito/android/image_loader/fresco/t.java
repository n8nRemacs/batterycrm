package com.avito.android.image_loader.fresco;

import QW0.c;
import kotlin.Metadata;

/* compiled from: ImageRequestListeners.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/image_loader/fresco/t;", "LQW0/c;", "LYW0/f;", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t implements QW0.c<YW0.f> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.image_loader.i f169551b;

    public t(com.avito.android.image_loader.i iVar) {
        this.f169551b = iVar;
    }

    @Override // QW0.c
    public final void b(String str, YW0.f fVar, c.a aVar) {
        YW0.f fVar2 = fVar;
        this.f169551b.H(fVar2 != null ? fVar2.getWidth() : 0, fVar2 != null ? fVar2.getHeight() : 0);
    }

    @Override // QW0.c
    public final void c(@Y61.k String str, @Y61.l Throwable th2, @Y61.l c.a aVar) {
        this.f169551b.b2(th2);
    }

    @Override // QW0.c
    public final void d(@Y61.k String str, @Y61.l c.a aVar) {
        this.f169551b.S2();
    }

    @Override // QW0.c
    public final void a(@Y61.k String str, @Y61.l c.a aVar) {
    }
}
