package com.yandex.div.core.widget;

import android.view.View;
import com.yandex.div.internal.widget.AspectImageView;
import kotlin.Metadata;

/* compiled from: Views.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class F {
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Integer] */
    public static kotlin.properties.h a() {
        C38048d c38048d = new C38048d();
        c38048d.f369254b = 0;
        return c38048d;
    }

    @Y61.k
    public static final kotlin.properties.h b(@Y61.l Y41.l lVar) {
        return new g(lVar, Float.valueOf(0.0f));
    }

    public static kotlin.properties.h c() {
        return new g(null, AspectImageView.Scale.f370232b);
    }

    public static final boolean d(int i12) {
        return View.MeasureSpec.getMode(i12) == Integer.MIN_VALUE;
    }

    public static final boolean e(int i12) {
        return View.MeasureSpec.getMode(i12) == 1073741824;
    }
}
