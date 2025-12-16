package com.avito.android.rating_form.item.stars;

import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.rating.RatingBar;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: StarsItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/rating_form/item/stars/m;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/rating_form/item/stars/l;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m extends com.avito.konveyor.adapter.b implements l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RatingBar f248676b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f248677c;

    /* compiled from: StarsItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/rating_form/item/stars/m$a", "Lcom/avito/android/lib/design/rating/RatingBar$a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements RatingBar.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f248678a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super Integer, G0> lVar) {
            this.f248678a = lVar;
        }

        @Override // com.avito.android.lib.design.rating.RatingBar.a
        public final void a(int i12) {
            ((f) this.f248678a).invoke(Integer.valueOf(i12));
        }
    }

    public m(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.rating);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.rating.RatingBar");
        }
        this.f248676b = (RatingBar) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.rating_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f248677c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.rating_form.item.stars.l
    public final void G2(@Y61.k PrintableText printableText) {
        RatingBar ratingBar = this.f248676b;
        ratingBar.setUnselectedColor(C35835l0.d(R.attr.red100, ratingBar.getContext()));
        int iD2 = C35835l0.d(R.attr.red600, ratingBar.getContext());
        TextView textView = this.f248677c;
        textView.setTextColor(iD2);
        textView.setText(printableText.k0(textView.getContext()));
    }

    @Override // com.avito.android.rating_form.item.stars.l
    public final void Lt(@Y61.l Integer num) {
        if (num != null) {
            this.f248676b.setRating(num.intValue());
        }
    }

    @Override // com.avito.android.rating_form.item.stars.l
    public final void RL(@Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f248676b.setListener(new a(lVar));
    }

    @Override // com.avito.android.rating_form.item.stars.l
    public final void setEnabled(boolean z12) {
        RatingBar ratingBar = this.f248676b;
        if (z12) {
            ratingBar.setClickEnabled(true);
            ratingBar.setSelectedColor(C35835l0.d(R.attr.orange, ratingBar.getContext()));
            ratingBar.invalidate();
        } else {
            ratingBar.setClickEnabled(false);
            ratingBar.setSelectedColor(C35835l0.d(R.attr.orange200, ratingBar.getContext()));
            ratingBar.invalidate();
        }
    }

    @Override // com.avito.android.rating_form.item.stars.l
    public final void y(@Y61.l PrintableText printableText) {
        RatingBar ratingBar = this.f248676b;
        ratingBar.setUnselectedColor(C35835l0.d(R.attr.gray12, ratingBar.getContext()));
        int iD2 = C35835l0.d(R.attr.gray54, ratingBar.getContext());
        TextView textView = this.f248677c;
        textView.setTextColor(iD2);
        textView.setText(printableText != null ? printableText.k0(textView.getContext()) : null);
    }
}
