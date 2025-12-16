package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import defpackage.c2c;
import defpackage.cf7;
import defpackage.ir6;
import defpackage.l5j;
import defpackage.ml6;
import defpackage.mwg;
import defpackage.rf7;
import defpackage.w5d;
import defpackage.y0;

@Deprecated
/* loaded from: classes.dex */
public class SimpleDraweeView extends ir6 {
    public static cf7 v0;
    public y0 u0;

    public SimpleDraweeView(Context context, AttributeSet attributeSet) throws Throwable {
        super(context, attributeSet);
        e(context, attributeSet);
        f(context, attributeSet);
    }

    public final void f(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            ml6.i();
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                l5j.e(v0, "SimpleDraweeView was not initialized!");
                this.u0 = v0.a();
            }
            if (attributeSet != null) {
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w5d.SimpleDraweeView);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(w5d.SimpleDraweeView_actualImageUri)) {
                        g(Uri.parse(typedArrayObtainStyledAttributes.getString(w5d.SimpleDraweeView_actualImageUri)));
                    } else if (typedArrayObtainStyledAttributes.hasValue(w5d.SimpleDraweeView_actualImageResource) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(w5d.SimpleDraweeView_actualImageResource, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                    typedArrayObtainStyledAttributes.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            }
            ml6.i();
        } catch (Throwable th2) {
            ml6.i();
            throw th2;
        }
    }

    public final void g(Uri uri) {
        y0 y0Var = this.u0;
        y0Var.getClass();
        c2c c2cVar = (c2c) y0Var;
        c2cVar.c(uri);
        c2cVar.i = getController();
        setController(c2cVar.a());
    }

    public y0 getControllerBuilder() {
        return this.u0;
    }

    public void setActualImageResource(int i) {
        g(mwg.c(i));
    }

    public void setImageRequest(rf7 rf7Var) {
        y0 y0Var = this.u0;
        y0Var.b = rf7Var;
        y0Var.i = getController();
        setController(y0Var.a());
    }

    @Override // defpackage.o45, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // defpackage.o45, android.widget.ImageView
    public void setImageURI(Uri uri) {
        g(uri);
    }

    public void setImageURI(String str) {
        g(str != null ? Uri.parse(str) : null);
    }

    public SimpleDraweeView(Context context) {
        super(context);
        f(context, null);
    }
}
