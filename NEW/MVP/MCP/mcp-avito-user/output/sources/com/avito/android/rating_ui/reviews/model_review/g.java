package com.avito.android.rating_ui.reviews.model_review;

import Dh0.InterfaceC13400a;
import Y41.p;
import android.os.Parcelable;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.TnsGalleryImage;
import com.avito.android.tns_gallery.s;
import com.avito.android.util.O2;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RatingModelReviewItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/reviews/model_review/g;", "Lcom/avito/android/rating_ui/reviews/model_review/d;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC13400a, G0> f250179b;

    /* compiled from: RatingModelReviewItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lcom/avito/android/remote/model/Image;", "images", "", "index", "Lkotlin/G0;", "invoke", "(Ljava/util/List;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements p<List<? extends Image>, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Long f250180l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Long f250181m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ g f250182n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Long l12, Long l13, g gVar) {
            super(2);
            this.f250180l = l12;
            this.f250181m = l13;
            this.f250182n = gVar;
        }

        @Override // Y41.p
        public final G0 invoke(List<? extends Image> list, Integer num) {
            List<? extends Image> list2 = list;
            int iIntValue = num.intValue();
            Long l12 = this.f250181m;
            Long l13 = this.f250180l;
            this.f250182n.f250179b.invoke(l13 != null ? new InterfaceC13400a.c.C0185a(list2, iIntValue, l12, l13) : new InterfaceC13400a.c.b(list2, iIntValue, l12, null));
            return G0.f406611a;
        }
    }

    /* compiled from: RatingModelReviewItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/Parcelable;", "it", "Lkotlin/G0;", "invoke", "(Landroid/os/Parcelable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Parcelable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f250183l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super Parcelable, G0> lVar) {
            super(1);
            this.f250183l = (N) lVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(Parcelable parcelable) {
            this.f250183l.invoke(parcelable);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public g(@Y61.k Y41.l<? super InterfaceC13400a, G0> lVar) {
        this.f250179b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ReviewStatus f250150f;
        m mVar = (m) eVar;
        com.avito.android.rating_ui.reviews.model_review.a aVar2 = (com.avito.android.rating_ui.reviews.model_review.a) aVar;
        Author f250154j = aVar2.getF250154j();
        com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(f250154j != null ? f250154j.f250136c : null);
        Author f250154j2 = aVar2.getF250154j();
        mVar.ON(aVarB, f250154j2 != null ? f250154j2.f250135b : null);
        mVar.xw(aVar2.getF250149e());
        mVar.vc(aVar2.getF250151g());
        mVar.E(aVar2.getF250163s());
        mVar.Mk(aVar2.getF250153i());
        mVar.oY(aVar2.getF250152h());
        mVar.o20(aVar2.getF250148d());
        List<BaseRatingReviewItem.ReviewTextSection> textSections = aVar2.getTextSections();
        if (textSections != null) {
            mVar.R7();
            int i13 = 0;
            for (Object obj : textSections) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                BaseRatingReviewItem.ReviewTextSection reviewTextSection = (BaseRatingReviewItem.ReviewTextSection) obj;
                textSections.size();
                mVar.s9(reviewTextSection, i13, new h(reviewTextSection));
                i13 = i14;
            }
        }
        k(mVar.getF250219w(), aVar2.getImages(), aVar2.getF250158n(), aVar2.getF250147c(), null, new i(aVar2));
        mVar.ue(O2.a(aVar2.getActions()));
        mVar.R4(new j(this, aVar2));
        BaseRatingReviewItem.ReviewAnswer f250160p = aVar2.getF250160p();
        mVar.E6(f250160p != null);
        if (f250160p != null) {
            mVar.xa(com.avito.android.image_loader.b.b(f250160p.f250304c), f250160p.f250313l);
            mVar.a9(f250160p.f250305d);
            mVar.vA(f250160p.f250306e);
            k(mVar.getF250197H(), f250160p.f250312k, f250160p.f250317p, aVar2.getF250147c(), f250160p.f250303b, new e(f250160p));
            mVar.F8(O2.a(f250160p.f250315n));
            mVar.k8(f250160p.f250308g, f250160p.f250309h, f250160p.f250310i, aVar2.getF250164t());
            mVar.Cb(f250160p.f250311j, f250160p.f250316o, new f(f250160p));
        }
        if (!aVar2.getF250156l() || (f250150f = aVar2.getF250150f()) == null) {
            return;
        }
        String f250162r = aVar2.getF250162r();
        if (f250162r == null) {
            f250162r = aVar2.getF250161q();
        }
        mVar.Dp(f250150f, f250162r, aVar2.getF250164t());
    }

    public final void k(s sVar, List<TnsGalleryImage> list, Parcelable parcelable, Long l12, Long l13, Y41.l<? super Parcelable, G0> lVar) {
        List<TnsGalleryImage> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            sVar.c();
        } else {
            sVar.b(list, new a(l13, l12, this), new b(lVar));
            sVar.a(parcelable);
        }
    }
}
