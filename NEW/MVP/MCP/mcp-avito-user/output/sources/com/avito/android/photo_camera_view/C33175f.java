package com.avito.android.photo_camera_view;

import com.avito.android.device_orientation.c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: CameraItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/device_orientation/c;", "rotation", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/device_orientation/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_camera_view.f, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33175f extends N implements Y41.l<com.avito.android.device_orientation.c, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33174e f216405l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33175f(C33174e c33174e) {
        super(1);
        this.f216405l = c33174e;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.device_orientation.c cVar) {
        x xVar;
        com.avito.android.device_orientation.c cVar2 = cVar;
        C33174e c33174e = this.f216405l;
        c33174e.f216391t = cVar2;
        if (!L.f(cVar2, new c.b()) && (xVar = c33174e.f216384m) != null) {
            xVar.w20(cVar2);
        }
        return G0.f406611a;
    }
}
