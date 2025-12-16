package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.airbnb.lottie.utils.j;
import j.N;

/* compiled from: LPaint.java */
/* loaded from: classes10.dex */
public class a extends Paint {
    public a() {
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i12) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(j.c(i12));
        } else {
            setColor((j.c(i12) << 24) | (getColor() & 16777215));
        }
    }

    public a(PorterDuff.Mode mode) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(@N LocaleList localeList) {
    }
}
