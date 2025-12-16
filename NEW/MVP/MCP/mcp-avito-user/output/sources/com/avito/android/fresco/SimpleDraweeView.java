package com.avito.android.fresco;

import BW0.b;
import GW0.c;
import Y61.k;
import Y61.l;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import com.facebook.imagepipeline.systrace.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SimpleDraweeView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/fresco/SimpleDraweeView;", "Lcom/facebook/drawee/view/SimpleDraweeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_common_fresco_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SimpleDraweeView extends com.facebook.drawee.view.SimpleDraweeView {
    public SimpleDraweeView(@l Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static Drawable f(TypedArray typedArray, Context context, int i12) {
        int resourceId = typedArray.getResourceId(i12, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    @Override // com.facebook.drawee.view.e
    @SuppressLint({"CustomViewStyleable"})
    public final void c(@k Context context, @l AttributeSet attributeSet) {
        b.a();
        GW0.b bVarD = c.d(context, attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.j.f1440a);
            kotlin.ranges.k it = new kotlin.ranges.l(0, typedArrayObtainStyledAttributes.getIndexCount(), 1).iterator();
            while (it.f406910d) {
                int index = typedArrayObtainStyledAttributes.getIndex(it.a());
                if (index == 6) {
                    bVarD.f6539d = f(typedArrayObtainStyledAttributes, context, index);
                } else if (index == 8) {
                    Drawable drawableF = f(typedArrayObtainStyledAttributes, context, index);
                    if (drawableF == null) {
                        bVarD.f6551p = null;
                    } else {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        stateListDrawable.addState(new int[]{R.attr.state_pressed}, drawableF);
                        bVarD.f6551p = stateListDrawable;
                    }
                } else if (index == 10) {
                    bVarD.f6545j = f(typedArrayObtainStyledAttributes, context, index);
                } else if (index == 12) {
                    bVarD.f6541f = f(typedArrayObtainStyledAttributes, context, index);
                } else if (index == 3) {
                    bVarD.f6543h = f(typedArrayObtainStyledAttributes, context, index);
                } else if (index == 1) {
                    bVarD.f6549n = f(typedArrayObtainStyledAttributes, context, index);
                } else if (index == 5) {
                    Drawable drawableF2 = f(typedArrayObtainStyledAttributes, context, index);
                    if (drawableF2 == null) {
                        bVarD.f6550o = null;
                    } else {
                        bVarD.f6550o = Arrays.asList(drawableF2);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        setAspectRatio(bVarD.f6538c);
        setHierarchy(bVarD.a());
        com.facebook.imagepipeline.systrace.b.a();
    }
}
