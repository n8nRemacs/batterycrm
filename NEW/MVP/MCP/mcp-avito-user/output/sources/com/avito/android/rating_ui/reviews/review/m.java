package com.avito.android.rating_ui.reviews.review;

import Dh0.InterfaceC13400a;
import android.os.Parcelable;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.tns_gallery.s;
import com.avito.android.util.O2;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RatingReviewItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/review/m;", "Lcom/avito/android/rating_ui/reviews/review/c;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public class m implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13400a, G0> f250362b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public m(@Y61.k Y41.l<? super InterfaceC13400a, G0> lVar) {
        this.f250362b = lVar;
    }

    public static void k(m mVar, s sVar, List list, Parcelable parcelable, Long l12, Long l13, Map map, Y41.l lVar, int i12) {
        if ((i12 & 16) != 0) {
            l13 = null;
        }
        if ((i12 & 32) != 0) {
            map = null;
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            sVar.c();
        } else {
            sVar.b(list, new f(l13, l12, map, mVar), new g(lVar));
            sVar.a(parcelable);
        }
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        o oVar = (o) eVar;
        BaseRatingReviewItem baseRatingReviewItem = (BaseRatingReviewItem) aVar;
        oVar.E(baseRatingReviewItem.getF246530O());
        oVar.z5(com.avito.android.image_loader.b.b(baseRatingReviewItem.getF246538z()));
        oVar.J(baseRatingReviewItem.getF246516A());
        oVar.GJ(baseRatingReviewItem.getF246517B(), baseRatingReviewItem.getF246518C());
        oVar.EO(O2.a(baseRatingReviewItem.getActions()));
        oVar.w30(baseRatingReviewItem.getF246523H(), baseRatingReviewItem.getF246522G());
        oVar.GK(baseRatingReviewItem.getF246524I(), baseRatingReviewItem.getF246532Q());
        oVar.Nh(baseRatingReviewItem.getF246525J());
        List<BaseRatingReviewItem.ReviewTextSection> textSections = baseRatingReviewItem.getTextSections();
        if (textSections != null) {
            oVar.R7();
            int i13 = 0;
            for (Object obj : textSections) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                BaseRatingReviewItem.ReviewTextSection reviewTextSection = (BaseRatingReviewItem.ReviewTextSection) obj;
                textSections.size();
                oVar.s9(reviewTextSection, i13, new h(reviewTextSection));
                i13 = i14;
            }
        }
        k(this, oVar.getF250372H(), baseRatingReviewItem.getImages(), baseRatingReviewItem.f250241s, baseRatingReviewItem.getF246537y(), null, baseRatingReviewItem.f(), new i(baseRatingReviewItem), 16);
        oVar.WX(baseRatingReviewItem.getF246519D(), baseRatingReviewItem.getF246520E(), baseRatingReviewItem.getF246521F(), baseRatingReviewItem.getF246531P(), baseRatingReviewItem.getF246533R(), new j(this, baseRatingReviewItem));
        BaseRatingReviewItem.ReviewAnswer f246528m = baseRatingReviewItem.getF246528M();
        oVar.E6(f246528m != null);
        if (f246528m != null) {
            oVar.xa(com.avito.android.image_loader.b.b(f246528m.f250304c), f246528m.f250313l);
            oVar.a9(f246528m.f250305d);
            oVar.cP(f246528m.f250306e, f246528m.f250307f);
            k(this, oVar.getF250373I(), f246528m.f250312k, f246528m.f250317p, baseRatingReviewItem.getF246537y(), f246528m.f250303b, null, new d(f246528m), 32);
            oVar.F8(O2.a(f246528m.f250315n));
            oVar.k8(f246528m.f250308g, f246528m.f250309h, f246528m.f250310i, baseRatingReviewItem.getF246533R());
            oVar.Cb(f246528m.f250311j, f246528m.f250316o, new e(f246528m));
        }
        oVar.R4(new k(this, baseRatingReviewItem));
        oVar.xp(new l(this, baseRatingReviewItem));
    }
}
