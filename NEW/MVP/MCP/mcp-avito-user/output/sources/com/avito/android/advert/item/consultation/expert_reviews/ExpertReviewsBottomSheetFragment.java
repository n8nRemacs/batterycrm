package com.avito.android.advert.item.consultation.expert_reviews;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.remote.model.AvatarStatus;
import com.avito.android.remote.model.advert_details.realty.Review;
import com.avito.android.util.C35949t5;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExpertReviewsBottomSheetFragment.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/advert/item/consultation/expert_reviews/ExpertReviewsBottomSheetFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExpertReviewsBottomSheetFragment extends Fragment implements InterfaceC28477j.b {

    /* renamed from: k0, reason: collision with root package name */
    @k
    public static final a f74765k0 = new a(null);

    /* renamed from: f0, reason: collision with root package name */
    @l
    public Review f74766f0;

    /* renamed from: g0, reason: collision with root package name */
    @l
    public TextView f74767g0;

    /* renamed from: h0, reason: collision with root package name */
    @l
    public TextView f74768h0;

    /* renamed from: i0, reason: collision with root package name */
    @l
    public SimpleDraweeView f74769i0;

    /* renamed from: j0, reason: collision with root package name */
    @l
    public TextView f74770j0;

    /* compiled from: ExpertReviewsBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/consultation/expert_reviews/ExpertReviewsBottomSheetFragment$a;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f74766f0 = (Review) arguments.getParcelable(AvatarStatus.REVIEW);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_expert_reviews_bottom_sheet, viewGroup, false);
        this.f74767g0 = (TextView) viewInflate.findViewById(R.id.expert_reviews_item_header);
        this.f74768h0 = (TextView) viewInflate.findViewById(R.id.expert_reviews_description);
        this.f74769i0 = (SimpleDraweeView) viewInflate.findViewById(R.id.expert_reviews_avatar);
        this.f74770j0 = (TextView) viewInflate.findViewById(R.id.expert_reviews_name);
        Review review = this.f74766f0;
        if (review != null) {
            TextView textView = this.f74767g0;
            if (textView != null) {
                textView.setText(review.getTitle());
            }
            TextView textView2 = this.f74768h0;
            if (textView2 != null) {
                textView2.setText(review.getDescription());
            }
            SimpleDraweeView simpleDraweeView = this.f74769i0;
            if (simpleDraweeView != null) {
                ImageRequest.a aVarA = C35949t5.a(simpleDraweeView);
                aVarA.f(review.getAvatar());
                aVarA.c();
            }
            TextView textView3 = this.f74770j0;
            if (textView3 != null) {
                textView3.setText(review.getName());
            }
        }
        return viewInflate;
    }
}
