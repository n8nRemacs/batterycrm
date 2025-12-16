package com.avito.android.photo_camera_view;

import android.graphics.SurfaceTexture;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CameraItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/graphics/SurfaceTexture;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Landroid/graphics/SurfaceTexture;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class k extends N implements Y41.l<SurfaceTexture, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33174e f216412l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C33174e c33174e) {
        super(1);
        this.f216412l = c33174e;
    }

    @Override // Y41.l
    public final G0 invoke(SurfaceTexture surfaceTexture) {
        C33174e.r(this.f216412l, surfaceTexture);
        return G0.f406611a;
    }
}
