package defpackage;

import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class u52 extends oy {
    public final /* synthetic */ int c;
    public final /* synthetic */ CarouselLayoutManager d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u52(CarouselLayoutManager carouselLayoutManager, int i) {
        super(1, 3);
        this.c = i;
        switch (i) {
            case 1:
                this.d = carouselLayoutManager;
                super(0, 3);
                break;
            default:
                this.d = carouselLayoutManager;
                break;
        }
    }

    @Override // defpackage.oy
    public final int k() {
        switch (this.c) {
            case 0:
                return this.d.o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.d;
                return carouselLayoutManager.o - carouselLayoutManager.J();
        }
    }

    @Override // defpackage.oy
    public final int l() {
        switch (this.c) {
            case 0:
                return this.d.K();
            default:
                return 0;
        }
    }

    @Override // defpackage.oy
    public final int n() {
        switch (this.c) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.d;
                return carouselLayoutManager.n - carouselLayoutManager.L();
            default:
                return this.d.n;
        }
    }

    @Override // defpackage.oy
    public final int o() {
        switch (this.c) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.d;
                if (carouselLayoutManager.N0()) {
                    return carouselLayoutManager.n;
                }
                return 0;
        }
    }

    @Override // defpackage.oy
    public final int p() {
        switch (this.c) {
            case 0:
                return 0;
            default:
                return this.d.M();
        }
    }
}
