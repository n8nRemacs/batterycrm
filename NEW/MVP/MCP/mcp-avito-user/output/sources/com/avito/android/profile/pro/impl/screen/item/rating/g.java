package com.avito.android.profile.pro.impl.screen.item.rating;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileProRatingView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/pro/impl/screen/item/rating/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/profile/pro/impl/screen/item/rating/f;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f223401c = 0;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f223402b;

    public g(@k View view) {
        super(view);
        this.f223402b = (TextView) view.findViewById(R.id.rating);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f223402b.setOnClickListener(null);
    }

    @Override // com.avito.android.profile.pro.impl.screen.item.rating.f
    public final void uJ(@k ProfileProRatingItem profileProRatingItem, @k l<? super D90.a, G0> lVar) {
        AttributedText attributedText = profileProRatingItem.f223393c;
        TextView textView = this.f223402b;
        j.a(textView, attributedText, null);
        textView.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(profileProRatingItem, lVar, 29));
    }
}
