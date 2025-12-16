package J6;

import Y61.k;
import android.graphics.RectF;
import kotlin.Metadata;

/* compiled from: DrawingDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ6/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: DrawingDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: J6.a$a, reason: collision with other inner class name */
    public static final class C0504a {
        public static /* synthetic */ void a(a aVar, RectF rectF, float f12, float f13, int i12) {
            if ((i12 & 1) != 0) {
                rectF = new RectF();
            }
            if ((i12 & 2) != 0) {
                f12 = 0.0f;
            }
            if ((i12 & 4) != 0) {
                f13 = 0.0f;
            }
            aVar.a(rectF, f12, f13);
        }
    }

    void a(@k RectF rectF, float f12, float f13);
}
