package com.avito.android.image_loader.glide.utils;

import Y61.k;
import android.net.Uri;
import android.widget.ImageView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.image_loader.m;
import com.avito.android.util.D6;
import j.InterfaceC42165v;
import kotlin.Metadata;

/* compiled from: ImageViews.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_image-loader-glide_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b {
    public static final void a(@k ImageView imageView, @InterfaceC42165v int i12) {
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
        aVar.f169484b = new ImageRequest.d.c(i12);
        aVar.c();
    }

    public static final void b(@k ImageView imageView, @k Uri uri, @InterfaceC42165v int i12, int i13) {
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
        aVar.f(uri);
        aVar.f169485c = Integer.valueOf(i12);
        aVar.f169486d = true;
        aVar.e(i13);
        aVar.c();
    }

    public static void c(ImageView imageView, Uri uri) {
        ImageRequest.a aVar = new ImageRequest.a(new DM.a(imageView));
        aVar.f(uri);
        aVar.f169485c = 0;
        aVar.c();
    }

    public static void d(ImageView imageView, m mVar) {
        D6.l(true, imageView, new a(imageView, mVar));
    }
}
