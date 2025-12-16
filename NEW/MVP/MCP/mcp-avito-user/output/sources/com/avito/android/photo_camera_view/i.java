package com.avito.android.photo_camera_view;

import com.avito.android.photo_picker.FlashMode;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CameraItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33174e f216408b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FlashMode f216409c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x f216410d;

    public i(C33174e c33174e, FlashMode flashMode, x xVar) {
        this.f216408b = c33174e;
        this.f216409c = flashMode;
        this.f216410d = xVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C33174e c33174e = this.f216408b;
        FlashMode flashMode = this.f216409c;
        c33174e.f216386o = flashMode;
        boolean zF2 = L.f(flashMode, FlashMode.Off.f218749c);
        x xVar = this.f216410d;
        if (zF2) {
            xVar.jE();
        } else if (L.f(flashMode, FlashMode.ForceOn.f218748c)) {
            xVar.Iw();
        } else if (L.f(flashMode, FlashMode.Auto.f218747c)) {
            xVar.Ne();
        }
    }
}
