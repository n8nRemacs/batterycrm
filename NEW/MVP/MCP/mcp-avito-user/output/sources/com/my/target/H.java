package com.my.target;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes7.dex */
public interface H {

    public interface a {
        void a(@j.N int[] iArr, @j.N Context context);

        void b(int i12, @j.N Context context);

        void c(@j.N View view, int i12);
    }

    void a(@j.N Parcelable parcelable);

    void dispose();

    @j.P
    Parcelable getState();

    @j.N
    int[] getVisibleCardNumbers();

    void setPromoCardSliderListener(@j.P a aVar);
}
