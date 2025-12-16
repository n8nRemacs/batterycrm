package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class s52 extends c58 {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s52(Context context, int i) {
        super(context);
        this.q = i;
    }

    @Override // defpackage.c58
    public int b(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.c58
    public int c(View view, int i) {
        switch (this.q) {
            case 0:
                return 0;
            default:
                return super.c(view, i);
        }
    }

    @Override // defpackage.c58
    public float d(DisplayMetrics displayMetrics) {
        switch (this.q) {
            case 3:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.d(displayMetrics);
        }
    }

    @Override // defpackage.c58
    public PointF g(int i) {
        switch (this.q) {
            case 0:
                return null;
            default:
                return super.g(i);
        }
    }

    @Override // defpackage.c58
    public int h() {
        switch (this.q) {
            case 1:
                return -1;
            case 2:
                return -1;
            default:
                return super.h();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s52(CarouselLayoutManager carouselLayoutManager, Context context) {
        super(context);
        this.q = 0;
    }
}
