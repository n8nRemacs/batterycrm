package com.avito.android.rating_ui.info_with_hint;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.rating_ui.RatingItemsMarginHorizontal;
import com.avito.android.rating_ui.info_with_hint.RatingInfoWithHintItem;
import com.avito.android.remote.model.UniversalImageKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: RatingInfoWithHintItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_ui/info_with_hint/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_ui/info_with_hint/g;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f250046g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f250047b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f250048c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f250049d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final View f250050e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ImageView f250051f;

    /* compiled from: RatingInfoWithHintItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f250052a;

        static {
            int[] iArr = new int[RatingInfoWithHintItem.InfoHorizontalAlign.values().length];
            try {
                RatingInfoWithHintItem.InfoHorizontalAlign infoHorizontalAlign = RatingInfoWithHintItem.InfoHorizontalAlign.f250033b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f250052a = iArr;
        }
    }

    public h(@k View view) {
        super(view);
        this.f250047b = view;
        View viewFindViewById = view.findViewById(R.id.rating_details_info_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f250048c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.rating_details_info_subtitle);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f250049d = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.rating_details_info_hint_button);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f250050e = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.rating_details_info_image);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f250051f = (ImageView) viewFindViewById4;
    }

    @Override // com.avito.android.rating_ui.info_with_hint.g
    public final void E(@k RatingItemsMarginHorizontal ratingItemsMarginHorizontal) {
        int dimension = (int) this.itemView.getResources().getDimension(ratingItemsMarginHorizontal.H0());
        D6.c(this.itemView, Integer.valueOf(dimension), null, Integer.valueOf(dimension), null, 10);
    }

    @Override // com.avito.android.rating_ui.info_with_hint.g
    public final void Sd(int i12, @l Integer num, @k String str) {
        TextView textView = this.f250048c;
        I5.a(textView, str, false);
        View view = this.f250047b;
        textView.setTextAppearance(C35835l0.j(i12, view.getContext()));
        textView.setTextColor(C35835l0.d(num != null ? num.intValue() : R.attr.black, view.getContext()));
    }

    @Override // com.avito.android.rating_ui.info_with_hint.g
    public final void a(@l Y41.a<G0> aVar) {
        this.itemView.setOnClickListener(new com.avito.android.publish.slots.cpa_ddu_upload.k(16, aVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.rating_ui.info_with_hint.g
    public final void f00(@l RatingInfoWithHintItem.InfoHorizontalAlign infoHorizontalAlign) {
        Q q12 = (infoHorizontalAlign == null ? -1 : a.f250052a[infoHorizontalAlign.ordinal()]) == 1 ? new Q(17, 0) : new Q(8388611, -1);
        int iIntValue = ((Number) q12.f406619b).intValue();
        int iIntValue2 = ((Number) q12.f406620c).intValue();
        this.f250048c.setGravity(iIntValue);
        this.f250049d.setGravity(iIntValue);
        ImageView imageView = this.f250051f;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f44219w = iIntValue2;
        imageView.setLayoutParams(bVar);
    }

    @Override // com.avito.android.rating_ui.info_with_hint.g
    public final void hC(@l Integer num, @l String str) {
        TextView textView = this.f250049d;
        I5.a(textView, str, false);
        textView.setTextColor(C35835l0.d(num != null ? num.intValue() : R.attr.black, this.f250047b.getContext()));
    }

    @Override // com.avito.android.rating_ui.info_with_hint.g
    public final void sp(@l RatingInfoWithHintItem.InfoImage infoImage) {
        ImageView imageView = this.f250051f;
        if (infoImage == null) {
            D6.w(imageView);
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = com.akita.view.foundation.util.f.a(infoImage.f250037c);
        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
        imageView.setLayoutParams(bVar);
        com.avito.android.image_loader.glide.utils.b.d(imageView, com.avito.android.image_loader.b.b(UniversalImageKt.getImageDependsOnThemeOrDefault(infoImage.f250036b, com.avito.android.lib.util.darkTheme.c.c(imageView.getContext().getResources()))));
        D6.G(imageView, true);
    }

    @Override // com.avito.android.rating_ui.info_with_hint.g
    public final void zl(boolean z12) {
        D6.G(this.f250050e, z12);
    }
}
