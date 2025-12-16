package com.avito.android.rating.details;

import com.avito.android.R;
import com.avito.android.lib.design.content_placeholder.ContentPlaceholder;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RatingDetailsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/content_placeholder/ContentPlaceholder;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class m extends N implements Y41.l<ContentPlaceholder, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RatingDetailsFragment f247182l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(RatingDetailsFragment ratingDetailsFragment) {
        super(1);
        this.f247182l = ratingDetailsFragment;
    }

    @Override // Y41.l
    public final G0 invoke(ContentPlaceholder contentPlaceholder) {
        ContentPlaceholder contentPlaceholder2 = contentPlaceholder;
        RatingDetailsFragment ratingDetailsFragment = this.f247182l;
        contentPlaceholder2.setTitle(ratingDetailsFragment.getString(R.string.rating_details_loading_error_try_again));
        contentPlaceholder2.setImageDrawable(C35835l0.h(R.attr.img_unknownError, contentPlaceholder2.getContext()));
        contentPlaceholder2.setButtonTitle(contentPlaceholder2.getContext().getString(R.string.try_again));
        contentPlaceholder2.setButtonOnClickListener(new b(ratingDetailsFragment, 1));
        return G0.f406611a;
    }
}
