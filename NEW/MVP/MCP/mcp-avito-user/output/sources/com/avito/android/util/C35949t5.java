package com.avito.android.util;

import android.graphics.drawable.Drawable;
import com.avito.android.image_loader.ImageRequest;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: SimpleDraweeViews.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_image-loader-fresco_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.util.t5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35949t5 {
    @Y61.k
    public static final ImageRequest.a a(@Y61.k SimpleDraweeView simpleDraweeView) {
        com.avito.android.image_loader.fresco.d dVar = new com.avito.android.image_loader.fresco.d(simpleDraweeView);
        R3.d.f14088f.getClass();
        return new ImageRequest.a(new com.avito.android.image_loader.fresco.a(simpleDraweeView, dVar, R3.d.f14089g));
    }

    public static final void b(@Y61.k SimpleDraweeView simpleDraweeView, @Y61.l com.avito.android.image_loader.m mVar, @Y61.k com.avito.android.image_loader.i iVar) {
        if (mVar == null) {
            ImageRequest.a aVarA = a(simpleDraweeView);
            aVarA.f169490h = iVar;
            aVarA.b();
        } else {
            ImageRequest.a aVarA2 = a(simpleDraweeView);
            aVarA2.f169490h = iVar;
            aVarA2.d(mVar);
            aVarA2.c();
        }
    }

    public static void c(SimpleDraweeView simpleDraweeView, com.avito.android.image_loader.k kVar, Drawable drawable, ImageRequest.ScaleType scaleType, Drawable drawable2, int i12) {
        if ((i12 & 2) != 0) {
            drawable = null;
        }
        if ((i12 & 4) != 0) {
            scaleType = null;
        }
        if ((i12 & 8) != 0) {
            drawable2 = null;
        }
        if (kVar == null) {
            ImageRequest.a aVarA = a(simpleDraweeView);
            aVarA.f169492j = drawable;
            aVarA.f169493k = scaleType;
            aVarA.f169501s = drawable2;
            aVarA.b();
            return;
        }
        ImageRequest.a aVarA2 = a(simpleDraweeView);
        aVarA2.f169492j = drawable;
        aVarA2.f169493k = scaleType;
        aVarA2.f169501s = drawable2;
        aVarA2.d(kVar);
        aVarA2.c();
    }
}
