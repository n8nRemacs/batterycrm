package com.avito.android.photo_camera_view;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* compiled from: CameraItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/funktionale/option/a;", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/G0;", "accept", "(Lorg/funktionale/option/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_camera_view.g, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33176g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33174e f216406b;

    public C33176g(C33174e c33174e) {
        this.f216406b = c33174e;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        org.funktionale.option.a aVar = (org.funktionale.option.a) obj;
        boolean zB2 = aVar.b();
        C33174e c33174e = this.f216406b;
        if (zB2) {
            x xVar = c33174e.f216384m;
            if (xVar != null) {
                xVar.tL();
                return;
            }
            return;
        }
        x xVar2 = c33174e.f216384m;
        if (xVar2 != null) {
            xVar2.cg((Bitmap) aVar.a());
        }
    }
}
