package W9;

import SK0.b;
import SK0.f;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.SerpResultCategoryDetails;
import com.avito.android.ux.feedback.remote.UxFeedbackConfig;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFeedbackHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW9/d;", "LW9/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f17813a;

    @Inject
    public d(@k SK0.b bVar) {
        this.f17813a = bVar;
    }

    @Override // W9.c
    public final void a(@k b bVar, @l UxFeedbackConfig uxFeedbackConfig) {
        b.a.a(this.f17813a, bVar, uxFeedbackConfig != null ? YK0.a.a(uxFeedbackConfig) : null, uxFeedbackConfig != null ? YK0.a.b(uxFeedbackConfig) : null, null, 8);
    }

    @Override // W9.c
    public final void b(@k a aVar) {
        SerpResultCategoryDetails categoryDetails;
        f fVar = new f();
        AdvertDetails advertDetails = aVar.f17806b;
        String categoryId = advertDetails != null ? advertDetails.getCategoryId() : null;
        if (categoryId == null) {
            categoryId = "";
        }
        fVar.a("cid", categoryId);
        String microCategoryId = (advertDetails == null || (categoryDetails = advertDetails.getCategoryDetails()) == null) ? null : categoryDetails.getMicroCategoryId();
        if (microCategoryId == null) {
            microCategoryId = "";
        }
        fVar.a("mcid", microCategoryId);
        String id2 = advertDetails != null ? advertDetails.getId() : null;
        fVar.a("iid", id2 != null ? id2 : "");
        b.a.a(this.f17813a, aVar, null, fVar, null, 2);
    }
}
