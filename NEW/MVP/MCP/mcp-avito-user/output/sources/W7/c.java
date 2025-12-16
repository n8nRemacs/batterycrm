package w7;

import SK0.b;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.rating_form.ux_feedback.RatingPublish;
import com.avito.android.rating_form.deep_link.RatingFormLink;
import com.avito.android.remote.model.AdjustParameters;
import com.avito.android.remote.model.AdvertisementCategoryAlias;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CsatRatingFormFeedbackHelper.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw7/c;", "Lw7/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f441294a;

    @Inject
    public c(@k SK0.b bVar) {
        this.f441294a = bVar;
    }

    @Override // w7.b
    public final void a(@k RatingFormLink.b bVar, @l AdjustParameters adjustParameters, @l Y41.a<G0> aVar) {
        C49459a c49459a;
        if ((adjustParameters != null ? adjustParameters.getVerticalAlias() : null) != AdvertisementVerticalAlias.SERVICES || adjustParameters.getCategoryAlias() != AdvertisementCategoryAlias.SERVICE_BEAUTY) {
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        if (bVar instanceof RatingFormLink.b.c) {
            RatingPublish[] ratingPublishArr = RatingPublish.f80962b;
            c49459a = new C49459a("csat_rating_form_publish_success");
        } else {
            RatingPublish[] ratingPublishArr2 = RatingPublish.f80962b;
            c49459a = new C49459a("csat_rating_form_publish_cancel");
        }
        b.a.a(this.f441294a, c49459a, null, null, new a(aVar), 6);
    }

    /* compiled from: CsatRatingFormFeedbackHelper.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"w7/c$a", "LSK0/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements SK0.d {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f441295b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<G0> aVar) {
            this.f441295b = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // SK0.d
        public final void Od(@k String str) {
            ?? r12 = this.f441295b;
            if (r12 != 0) {
                r12.invoke();
            }
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // SK0.d
        public final void W2(@k String str) {
            ?? r12 = this.f441295b;
            if (r12 != 0) {
                r12.invoke();
            }
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // SK0.d
        public final void ha(@k String str) {
            ?? r12 = this.f441295b;
            if (r12 != 0) {
                r12.invoke();
            }
        }

        @Override // SK0.d
        public final void v5(@k String str) {
        }
    }
}
