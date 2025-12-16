package K2;

import Y61.k;
import Y61.l;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImageViewTarget.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LK2/b;", "LK2/a;", "Landroid/widget/ImageView;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class b extends a<ImageView> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ImageView f9217c;

    public b(@k ImageView imageView) {
        this.f9217c = imageView;
    }

    @Override // K2.a, M2.d
    @l
    public final Drawable a() {
        return this.f9217c.getDrawable();
    }

    @Override // K2.a
    public final void e(@l Drawable drawable) {
        this.f9217c.setImageDrawable(drawable);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            if (L.f(this.f9217c, ((b) obj).f9217c)) {
                return true;
            }
        }
        return false;
    }

    @Override // K2.d
    public final View getView() {
        return this.f9217c;
    }

    public final int hashCode() {
        return this.f9217c.hashCode();
    }
}
