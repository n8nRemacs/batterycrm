package com.avito.android.photo_camera_view;

import android.graphics.Bitmap;
import com.avito.android.photo_storage.SharedPhotosStorage;
import kotlin.Metadata;

/* compiled from: CameraItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroid/net/Uri;", "it", "Landroid/graphics/Bitmap;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class t<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C33174e f216421b;

    public t(C33174e c33174e) {
        this.f216421b = c33174e;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return SharedPhotosStorage.c.a(this.f216421b.f216383l, (Bitmap) obj, null, null, 30);
    }
}
