package defpackage;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class t52 extends vhd {
    public final Paint a;
    public final List b;

    public t52() {
        Paint paint = new Paint();
        this.a = paint;
        this.b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.vhd
    public final void h(Canvas canvas, RecyclerView recyclerView) throws Resources.NotFoundException {
        Canvas canvas2;
        float dimension = recyclerView.getResources().getDimension(dwc.m3_carousel_debug_keyline_width);
        Paint paint = this.a;
        paint.setStrokeWidth(dimension);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((l08) it.next()).getClass();
            paint.setColor(rf3.c(-65281, 0.0f, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).M0()) {
                canvas2 = canvas;
                canvas2.drawLine(0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.p(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.k(), paint);
            } else {
                canvas2 = canvas;
                canvas2.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).q.l(), 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.n(), 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
