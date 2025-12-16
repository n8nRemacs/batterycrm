package SK0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;

/* compiled from: AvitoUxFeedback.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSK0/b;", "", "_avito_ux-feedback_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: AvitoUxFeedback.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(b bVar, c cVar, SK0.a aVar, f fVar, d dVar, int i12) {
            if ((i12 & 2) != 0) {
                aVar = null;
            }
            if ((i12 & 4) != 0) {
                fVar = null;
            }
            if ((i12 & 8) != 0) {
                dVar = null;
            }
            bVar.a(cVar, aVar, fVar, dVar);
        }
    }

    void a(@k c cVar, @l SK0.a aVar, @l f fVar, @l d dVar);
}
