package com.facebook.drawee.view;

import BW0.b;
import I41.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.common.internal.o;
import com.facebook.drawee.backends.pipeline.g;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.imagepipeline.request.ImageRequest;
import j.InterfaceC42165v;

/* loaded from: classes10.dex */
public class SimpleDraweeView extends e {

    /* renamed from: i, reason: collision with root package name */
    public static g f340162i;

    /* renamed from: h, reason: collision with root package name */
    public AbstractDraweeControllerBuilder f340163h;

    public SimpleDraweeView(Context context) {
        super(context);
        c(context, null);
        d(context, null);
    }

    public final void d(Context context, @h AttributeSet attributeSet) {
        int resourceId;
        try {
            com.facebook.imagepipeline.systrace.b.a();
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                o.c(f340162i, "SimpleDraweeView was not initialized!");
                this.f340163h = f340162i.get();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.j.f1441b);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(1)) {
                        e(Uri.parse(typedArrayObtainStyledAttributes.getString(1)));
                    } else if (typedArrayObtainStyledAttributes.hasValue(0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th2;
                }
            }
            com.facebook.imagepipeline.systrace.b.a();
        } catch (Throwable th3) {
            com.facebook.imagepipeline.systrace.b.a();
            throw th3;
        }
    }

    public final void e(Uri uri) {
        AbstractDraweeControllerBuilder abstractDraweeControllerBuilder = this.f340163h;
        abstractDraweeControllerBuilder.getClass();
        com.facebook.drawee.backends.pipeline.f fVar = (com.facebook.drawee.backends.pipeline.f) abstractDraweeControllerBuilder;
        fVar.e(uri);
        fVar.f339987e = getController();
        setController(fVar.a());
    }

    public AbstractDraweeControllerBuilder getControllerBuilder() {
        return this.f340163h;
    }

    public void setActualImageResource(@InterfaceC42165v int i12) {
        Uri uri = com.facebook.common.util.g.f339869a;
        e(new Uri.Builder().scheme("res").path(String.valueOf(i12)).build());
    }

    public void setImageRequest(ImageRequest imageRequest) {
        AbstractDraweeControllerBuilder abstractDraweeControllerBuilder = this.f340163h;
        abstractDraweeControllerBuilder.f339983a = imageRequest;
        abstractDraweeControllerBuilder.f339987e = getController();
        setController(abstractDraweeControllerBuilder.a());
    }

    @Override // com.facebook.drawee.view.d, android.widget.ImageView
    public void setImageResource(int i12) {
        super.setImageResource(i12);
    }

    @Override // com.facebook.drawee.view.d, android.widget.ImageView
    public void setImageURI(Uri uri) {
        e(uri);
    }

    public void setImageURI(@h String str) {
        e(str != null ? Uri.parse(str) : null);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d(context, attributeSet);
    }
}
