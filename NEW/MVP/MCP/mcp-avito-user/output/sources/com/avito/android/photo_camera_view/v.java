package com.avito.android.photo_camera_view;

import com.avito.android.photo_storage.SharedPhotosStorage;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.C35896f0;
import kotlin.Metadata;

/* compiled from: CameraItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class v<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33174e f216423b;

    public v(C33174e c33174e) {
        this.f216423b = c33174e;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        C33174e c33174e = this.f216423b;
        c33174e.getClass();
        boolean z12 = th2 instanceof SharedPhotosStorage.CantSaveToSharedVolumeException;
        C c12 = c33174e.f216381j;
        if (z12) {
            x xVar = c33174e.f216384m;
            if (xVar != null) {
                xVar.wc(c12.c());
            }
        } else {
            x xVar2 = c33174e.f216384m;
            if (xVar2 != null) {
                xVar2.wc(c12.a());
            }
        }
        c33174e.f216397z = false;
        x xVar3 = c33174e.f216384m;
        if (xVar3 != null) {
            xVar3.L70(true);
        }
        C35896f0.g(c33174e.f216392u, new k(c33174e));
        V2.f318762a.e("error", th2);
    }
}
