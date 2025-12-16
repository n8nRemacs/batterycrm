package com.avito.android.rating_ui.button;

import L91.q;
import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.button.BaseRatingButtonItem;
import com.avito.android.remote.model.DeeplinkAction;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RatingButtonItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/button/i;", "Lcom/avito/android/rating_ui/button/h;", "Lcom/avito/konveyor/adapter/b;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f249997c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Button f249998b;

    /* compiled from: RatingButtonItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[BaseRatingButtonItem.FillType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BaseRatingButtonItem.FillType fillType = BaseRatingButtonItem.FillType.f249982b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public i(@k View view) {
        super(view);
        this.f249998b = (Button) view.findViewById(R.id.item_button);
    }

    @Override // com.avito.android.rating_ui.button.h
    public final void E(@k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        int dimension = (int) this.itemView.getResources().getDimension(ratingItemsMarginHorizontal.H0());
        D6.c(this.f249998b, Integer.valueOf(dimension), null, Integer.valueOf(dimension), null, 10);
    }

    @Override // com.avito.android.rating_ui.button.h
    public final void R4(@k Y41.a<G0> aVar) {
        this.f249998b.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(15, aVar));
    }

    @Override // com.avito.android.rating_ui.button.h
    public final void Xu(@k BaseRatingButtonItem.FillType fillType) {
        int i12;
        int iOrdinal = fillType.ordinal();
        if (iOrdinal == 0) {
            i12 = -1;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = -2;
        }
        Button button = this.f249998b;
        button.getLayoutParams().width = i12;
        button.requestLayout();
    }

    @Override // com.avito.android.rating_ui.button.h
    public final void sE(@l DeeplinkAction deeplinkAction) {
        String title = deeplinkAction != null ? deeplinkAction.getTitle() : null;
        Button button = this.f249998b;
        com.avito.android.lib.design.button.b.a(button, title, false);
        button.setOnClickListener(new q(9));
    }
}
