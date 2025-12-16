package com.avito.android.rating.details;

import android.content.DialogInterface;
import android.os.Parcelable;
import com.avito.android.lib.design.modal.a;
import com.avito.android.rating_ui.reviews.review.BaseRatingReviewItem;
import com.avito.android.remote.model.Navigation;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RatingDetailsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/lib/design/modal/a$b;", "Landroid/content/DialogInterface;", Navigation.CONFIG, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/modal/a$b;Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.p<a.b, DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ BaseRatingReviewItem.ReviewAction.ConfirmDialog f247011l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RatingDetailsFragment f247012m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f247013n;

    /* compiled from: RatingDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BaseRatingReviewItem.ReviewAction.ButtonType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<BaseRatingReviewItem.ReviewAction.ButtonType> creator = BaseRatingReviewItem.ReviewAction.ButtonType.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<BaseRatingReviewItem.ReviewAction.ButtonType> creator2 = BaseRatingReviewItem.ReviewAction.ButtonType.CREATOR;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BaseRatingReviewItem.ReviewAction.ConfirmDialog confirmDialog, RatingDetailsFragment ratingDetailsFragment, long j12) {
        super(2);
        this.f247011l = confirmDialog;
        this.f247012m = ratingDetailsFragment;
        this.f247013n = j12;
    }

    @Override // Y41.p
    public final G0 invoke(a.b bVar, DialogInterface dialogInterface) {
        a.b bVar2 = bVar;
        DialogInterface dialogInterface2 = dialogInterface;
        BaseRatingReviewItem.ReviewAction.ConfirmDialog confirmDialog = this.f247011l;
        bVar2.setTitle(confirmDialog.f250255b);
        bVar2.setSubtitle(confirmDialog.f250256c);
        bVar2.setButtonsOrientation(1);
        for (BaseRatingReviewItem.ReviewAction.Button button : confirmDialog.f250257d) {
            int iOrdinal = button.f250249c.ordinal();
            String str = button.f250248b;
            if (iOrdinal == 0) {
                bVar2.L3(str, new d(this.f247012m, this.f247013n, dialogInterface2));
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                bVar2.M3(str, new e(dialogInterface2));
            }
        }
        return G0.f406611a;
    }
}
