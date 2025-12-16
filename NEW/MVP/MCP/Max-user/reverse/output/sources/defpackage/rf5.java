package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.gallery.MediaGalleryWidget;

/* loaded from: classes2.dex */
public final class rf5 extends bid {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rf5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bid
    public void a(RecyclerView recyclerView, int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((yf5) this.b).Y1.iterator();
                while (it.hasNext()) {
                    ((bid) it.next()).a(recyclerView, i);
                }
                break;
        }
    }

    @Override // defpackage.bid
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3 = this.a;
        Object obj = this.b;
        switch (i3) {
            case 0:
                Iterator it = ((yf5) obj).Y1.iterator();
                while (it.hasNext()) {
                    ((bid) it.next()).b(recyclerView, i, i2);
                }
                break;
            case 1:
                br5 br5Var = (br5) obj;
                int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int i4 = br5Var.a;
                int iComputeVerticalScrollRange = br5Var.C0.computeVerticalScrollRange();
                int i5 = br5Var.B0;
                br5Var.D0 = iComputeVerticalScrollRange - i5 > 0 && i5 >= i4;
                int iComputeHorizontalScrollRange = br5Var.C0.computeHorizontalScrollRange();
                int i6 = br5Var.A0;
                boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i4;
                br5Var.E0 = z;
                boolean z2 = br5Var.D0;
                if (!z2 && !z) {
                    if (br5Var.F0 != 0) {
                        br5Var.m(0);
                        break;
                    }
                } else {
                    if (z2) {
                        float f = i5;
                        br5Var.v0 = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
                        br5Var.u0 = Math.min(i5, (i5 * i5) / iComputeVerticalScrollRange);
                    }
                    if (br5Var.E0) {
                        float f2 = iComputeHorizontalScrollOffset;
                        float f3 = i6;
                        br5Var.y0 = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
                        br5Var.x0 = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
                    }
                    int i7 = br5Var.F0;
                    if (i7 == 0 || i7 == 1) {
                        br5Var.m(1);
                        break;
                    }
                }
                break;
            case 2:
                if (i != 0 || i2 != 0) {
                    xfh.r(((t09) ((KeyboardStickersWidget) obj).b.getValue()).o, p09.a);
                    break;
                }
            case 3:
                if (i != 0 || i2 != 0) {
                    yy7[] yy7VarArr = MediaGalleryWidget.Y;
                    xfh.r(((MediaGalleryWidget) obj).z0().c, new kp6(-recyclerView.computeVerticalScrollOffset()));
                    break;
                }
            default:
                if (i != 0 || i2 != 0) {
                    ((y9d) obj).a();
                    break;
                }
        }
    }
}
