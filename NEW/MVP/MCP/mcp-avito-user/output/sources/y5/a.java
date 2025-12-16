package Y5;

import Y61.k;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.compose.runtime.internal.P;
import com.facebook.drawee.drawable.s;
import kotlin.Metadata;

/* compiled from: ScaleTypeFitEndCenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LY5/a;", "Lcom/facebook/drawee/drawable/s$a;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends s.a {

    /* renamed from: l, reason: collision with root package name */
    @k
    public static final a f19293l = new a();

    @Override // com.facebook.drawee.drawable.s.a
    public final void b(@k Matrix matrix, @k Rect rect, int i12, int i13, float f12, float f13, float f14, float f15) {
        float fMin = Math.min(f14, f15);
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((rect.width() - (i12 * fMin)) + rect.left + 0.5f, ((rect.height() - (i13 * fMin)) * 0.5f) + rect.top + 0.5f);
    }

    @k
    public final String toString() {
        return "fitEndCenter";
    }
}
