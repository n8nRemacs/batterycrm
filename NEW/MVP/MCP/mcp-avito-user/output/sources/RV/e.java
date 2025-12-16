package RV;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RatioViewGroup.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRV/e;", "LRV/d;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f14475b;

    /* renamed from: c, reason: collision with root package name */
    public float f14476c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f14477d = new b();

    public e(@k ViewGroup viewGroup) {
        this.f14475b = viewGroup;
    }

    @k
    public final b a(int i12, int i13) {
        float f12 = this.f14476c;
        b bVar = this.f14477d;
        if (f12 == 0.0f) {
            bVar.f14473a = i12;
            bVar.f14474b = i13;
            return bVar;
        }
        int size = (int) (View.MeasureSpec.getSize(i13) * this.f14476c);
        if (this.f14475b.getLayoutParams().width == -1) {
            size = Math.min(size, View.MeasureSpec.getSize(i12));
        }
        int mode = View.MeasureSpec.getMode(i12);
        if (size <= 0 || mode == 0) {
            bVar.f14473a = i12;
            bVar.f14474b = i13;
        } else {
            bVar.f14473a = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            bVar.f14474b = i13;
        }
        return bVar;
    }

    public final void b(float f12) {
        if (f12 < 0.0f) {
            throw new IllegalStateException("Ratio must be >= 0");
        }
        this.f14476c = f12;
    }
}
