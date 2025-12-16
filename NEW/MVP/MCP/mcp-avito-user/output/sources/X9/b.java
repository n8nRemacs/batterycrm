package X9;

import SK0.b;
import SK0.f;
import Y61.k;
import Y61.l;
import com.avito.android.advert_core.ux_feedback.gallery.GalleryAction;
import com.avito.android.ux.feedback.remote.UxFeedbackConfig;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsGalleryFeedbackHelper.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX9/b;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f18724a;

    @Inject
    public b(@k SK0.b bVar) {
        this.f18724a = bVar;
    }

    public final void a(@k GalleryAction galleryAction, @l UxFeedbackConfig uxFeedbackConfig) {
        SK0.a aVar;
        f fVarB = uxFeedbackConfig != null ? YK0.a.b(uxFeedbackConfig) : null;
        if (uxFeedbackConfig == null || (aVar = YK0.a.a(uxFeedbackConfig)) == null) {
            aVar = new SK0.a();
        }
        SK0.a aVar2 = aVar;
        aVar2.a("user_action", galleryAction.f84408b);
        b.a.a(this.f18724a, new a(), aVar2, fVarB, null, 8);
    }
}
