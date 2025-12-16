package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import j.N;
import j.P;
import j.U;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public final class CircularProgressIndicator extends b<h> {

    /* renamed from: p, reason: collision with root package name */
    public static final int f356888p = R.style.Widget_MaterialComponents_CircularProgressIndicator;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface a {
    }

    public CircularProgressIndicator(@N Context context, @P AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.circularProgressIndicatorStyle);
        Context context2 = getContext();
        h hVar = (h) this.f356890b;
        d dVar = new d(hVar);
        g gVar = new g(hVar);
        o oVar = new o(context2, hVar);
        oVar.f356959m = dVar;
        dVar.f356955b = oVar;
        oVar.f356960n = gVar;
        gVar.f356956a = oVar;
        setIndeterminateDrawable(oVar);
        setProgressDrawable(new i(getContext(), hVar, new d(hVar)));
    }

    public int getIndicatorDirection() {
        return ((h) this.f356890b).f356934i;
    }

    @U
    public int getIndicatorInset() {
        return ((h) this.f356890b).f356933h;
    }

    @U
    public int getIndicatorSize() {
        return ((h) this.f356890b).f356932g;
    }

    public void setIndicatorDirection(int i12) {
        ((h) this.f356890b).f356934i = i12;
        invalidate();
    }

    public void setIndicatorInset(@U int i12) {
        S s5 = this.f356890b;
        if (((h) s5).f356933h != i12) {
            ((h) s5).f356933h = i12;
            invalidate();
        }
    }

    public void setIndicatorSize(@U int i12) {
        int iMax = Math.max(i12, getTrackThickness() * 2);
        S s5 = this.f356890b;
        if (((h) s5).f356932g != iMax) {
            ((h) s5).f356932g = iMax;
            ((h) s5).getClass();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.b
    public void setTrackThickness(int i12) {
        super.setTrackThickness(i12);
        ((h) this.f356890b).getClass();
    }
}
