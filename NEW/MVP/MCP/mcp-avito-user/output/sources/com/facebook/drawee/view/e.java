package com.facebook.drawee.view;

import I41.h;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: GenericDraweeView.java */
@Nullsafe
/* loaded from: classes10.dex */
public class e extends d<GW0.a> {
    public e(Context context, @h AttributeSet attributeSet) {
        super(context, attributeSet);
        c(context, attributeSet);
    }

    public void c(Context context, @h AttributeSet attributeSet) {
        com.facebook.imagepipeline.systrace.b.a();
        GW0.b bVarD = GW0.c.d(context, attributeSet);
        setAspectRatio(bVarD.f6538c);
        setHierarchy(bVarD.a());
        com.facebook.imagepipeline.systrace.b.a();
    }
}
